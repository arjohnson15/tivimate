package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseFile implements Parcelable {
    public static final Parcelable.Creator<ParseFile> CREATOR = new Parcelable.Creator<ParseFile>() { // from class: com.parse.ParseFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseFile createFromParcel(Parcel parcel) {
            return new ParseFile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseFile[] newArray(int i) {
            return new ParseFile[i];
        }
    };
    private final Set<TaskCompletionSource<?>> currentTasks;
    byte[] data;
    File file;
    private State state;
    final TaskQueue taskQueue;

    public static class State {
        private final String contentType;
        private final String name;
        private final String url;

        public static class Builder {
            private String mimeType;
            private String name;
            private String url;

            public Builder() {
            }

            public Builder(State state) {
                this.name = state.name();
                this.mimeType = state.mimeType();
                this.url = state.url();
            }

            public State build() {
                return new State(this);
            }

            public Builder mimeType(String str) {
                this.mimeType = str;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder url(String str) {
                this.url = str;
                return this;
            }
        }

        private State(Builder builder) {
            this.name = builder.name != null ? builder.name : "file";
            this.contentType = builder.mimeType;
            this.url = builder.url;
        }

        public String mimeType() {
            return this.contentType;
        }

        public String name() {
            return this.name;
        }

        public String url() {
            return this.url;
        }
    }

    public ParseFile(Parcel parcel) {
        this(parcel, ParseParcelDecoder.get());
    }

    public ParseFile(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        this(new State.Builder().url(parcel.readString()).name(parcel.readString()).mimeType(parcel.readByte() == 1 ? parcel.readString() : null).build());
    }

    public ParseFile(State state) {
        this.taskQueue = new TaskQueue();
        this.currentTasks = DesugarCollections.synchronizedSet(new HashSet());
        this.state = state;
    }

    public ParseFile(File file) {
        this(file, (String) null);
    }

    public ParseFile(File file, String str) {
        this(new State.Builder().name(file.getName()).mimeType(str).build());
        this.file = file;
    }

    public ParseFile(JSONObject jSONObject, ParseDecoder parseDecoder) {
        this(new State.Builder().name(jSONObject.optString("name")).url(jSONObject.optString("url")).build());
    }

    public static ParseFileController getFileController() {
        return ParseCorePlugins.getInstance().getFileController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$progressCallbackOnMainThread$0(ProgressCallback progressCallback, Integer num) {
        ((C0839) progressCallback).m3530(num);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$progressCallbackOnMainThread$1(ProgressCallback progressCallback, Integer num) {
        Task.call(new CallableC0805(progressCallback, 1, num), ParseExecutors.main());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$2(Task task) {
        this.state = (State) task.getResult();
        this.data = null;
        this.file = null;
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$3(Task task, String str, ProgressCallback progressCallback, Task task2) {
        if (!isDirty()) {
            return Task.forResult(null);
        }
        if (task == null || !task.isCancelled()) {
            return (this.data != null ? getFileController().saveAsync(this.state, this.data, str, progressCallbackOnMainThread(progressCallback), (Task<Void>) task) : getFileController().saveAsync(this.state, this.file, str, progressCallbackOnMainThread(progressCallback), (Task<Void>) task)).onSuccessTask(new C0798(6, this));
        }
        return Task.cancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveInBackground$4(ProgressCallback progressCallback, TaskCompletionSource taskCompletionSource, Task task) {
        return saveAsync((String) task.getResult(), progressCallback, taskCompletionSource.getTask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveInBackground$5(TaskCompletionSource taskCompletionSource, Task task) {
        taskCompletionSource.trySetResult(null);
        this.currentTasks.remove(taskCompletionSource);
        return task;
    }

    private static ProgressCallback progressCallbackOnMainThread(ProgressCallback progressCallback) {
        if (progressCallback == null) {
            return null;
        }
        return new C0839(progressCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveAsync, reason: merged with bridge method [inline-methods] */
    public Task<Void> lambda$saveAsync$6(String str, ProgressCallback progressCallback, Task<Void> task, Task<Void> task2) {
        return !isDirty() ? Task.forResult(null) : (task2 == null || !task2.isCancelled()) ? task.continueWithTask(new C0811(this, task2, str, progressCallback)) : Task.cancelled();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject encode() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__type", "File");
        jSONObject.put("name", getName());
        if (getUrl() == null) {
            throw new IllegalStateException("Unable to encode an unsaved ParseFile.");
        }
        jSONObject.put("url", getUrl());
        return jSONObject;
    }

    public String getName() {
        return this.state.name();
    }

    public String getUrl() {
        return this.state.url();
    }

    public boolean isDirty() {
        return this.state.url() == null;
    }

    public void save() {
        ParseTaskUtils.wait(saveInBackground());
    }

    public Task<Void> saveAsync(String str, ProgressCallback progressCallback, Task<Void> task) {
        return this.taskQueue.enqueue(new C0811(this, str, progressCallback, task));
    }

    public Task<Void> saveInBackground() {
        return saveInBackground(null);
    }

    public Task<Void> saveInBackground(ProgressCallback progressCallback) {
        TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        this.currentTasks.add(taskCompletionSource);
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new C0813(this, progressCallback, taskCompletionSource, 16)).continueWithTask(new C0855(this, 17, taskCompletionSource));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, ParseParcelEncoder.get());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        if (isDirty()) {
            throw new RuntimeException("Unable to parcel an unsaved ParseFile.");
        }
        parcel.writeString(getUrl());
        parcel.writeString(getName());
        String strMimeType = this.state.mimeType();
        parcel.writeByte(strMimeType != null ? (byte) 1 : (byte) 0);
        if (strMimeType != null) {
            parcel.writeString(strMimeType);
        }
    }
}
