package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class OfflineObjectStore<T extends ParseObject> implements ParseObjectStore<T> {
    private final String className;
    private final ParseObjectStore<T> legacy;
    private final String pinName;

    public OfflineObjectStore(Class<T> cls, String str, ParseObjectStore<T> parseObjectStore) {
        this(getSubclassingController().getClassName(cls), str, parseObjectStore);
    }

    public OfflineObjectStore(String str, String str2, ParseObjectStore<T> parseObjectStore) {
        this.className = str;
        this.pinName = str2;
        this.legacy = parseObjectStore;
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$deleteAsync$6(Task task, Task task2) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getAsync$3(Task task) {
        List list = (List) task.getResult();
        return list != null ? list.size() == 1 ? Task.forResult((ParseObject) list.get(0)) : ParseObject.unpinAllInBackground(this.pinName).cast() : Task.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getAsync$4(Task task) {
        return ((ParseObject) task.getResult()) != null ? task : migrate(this.legacy, this).cast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ParseObject lambda$migrate$0(ParseObject parseObject, Task task) {
        return parseObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task lambda$migrate$1(ParseObjectStore parseObjectStore, ParseObjectStore parseObjectStore2, Task task) {
        int i = 0;
        ParseObject parseObject = (ParseObject) task.getResult();
        return parseObject == null ? task : Task.whenAll(Arrays.asList(parseObjectStore.deleteAsync(), parseObjectStore2.setAsync(parseObject))).continueWith(new C0851(parseObject, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setAsync$2(ParseObject parseObject, Task task) {
        return parseObject.pinInBackground(this.pinName, false);
    }

    private static <T extends ParseObject> Task<T> migrate(ParseObjectStore<T> parseObjectStore, ParseObjectStore<T> parseObjectStore2) {
        return (Task<T>) parseObjectStore.getAsync().onSuccessTask(new C0855(parseObjectStore, 2, parseObjectStore2));
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> deleteAsync() {
        Task<Void> taskUnpinAllInBackground = ParseObject.unpinAllInBackground(this.pinName);
        return Task.whenAll(Arrays.asList(this.legacy.deleteAsync(), taskUnpinAllInBackground)).continueWithTask(new C0814(taskUnpinAllInBackground, 0));
    }

    @Override // com.parse.ParseObjectStore
    public Task<T> getAsync() {
        final int i = 0;
        Task<TContinuationResult> taskOnSuccessTask = ParseQuery.getQuery(this.className).fromPin(this.pinName).ignoreACLs().findInBackground().onSuccessTask(new Continuation(this) { // from class: com.parse.ᵎˏ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ OfflineObjectStore f3820;

            {
                this.f3820 = this;
            }

            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                switch (i) {
                    case 0:
                        return this.f3820.lambda$getAsync$3(task);
                    default:
                        return this.f3820.lambda$getAsync$4(task);
                }
            }
        });
        final int i2 = 1;
        return taskOnSuccessTask.onSuccessTask(new Continuation(this) { // from class: com.parse.ᵎˏ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ OfflineObjectStore f3820;

            {
                this.f3820 = this;
            }

            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                switch (i2) {
                    case 0:
                        return this.f3820.lambda$getAsync$3(task);
                    default:
                        return this.f3820.lambda$getAsync$4(task);
                }
            }
        });
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> setAsync(T t) {
        return ParseObject.unpinAllInBackground(this.pinName).continueWithTask(new C0855(this, 3, t));
    }
}
