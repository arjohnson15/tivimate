package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes.dex */
class FileObjectStore<T extends ParseObject> implements ParseObjectStore<T> {
    private final String className;
    private final ParseObjectCurrentCoder coder;
    private final File file;

    public FileObjectStore(Class<T> cls, File file, ParseObjectCurrentCoder parseObjectCurrentCoder) {
        this(getSubclassingController().getClassName(cls), file, parseObjectCurrentCoder);
    }

    public FileObjectStore(String str, File file, ParseObjectCurrentCoder parseObjectCurrentCoder) {
        this.className = str;
        this.file = file;
        this.coder = parseObjectCurrentCoder;
    }

    private static <T extends ParseObject> T getFromDisk(ParseObjectCurrentCoder parseObjectCurrentCoder, File file, ParseObject.State.Init init) {
        try {
            return (T) ParseObject.from(parseObjectCurrentCoder.decode(init, ParseFileUtils.readFileToJSONObject(file), ParseDecoder.get()).isComplete(true).build());
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$deleteAsync$2() {
        if (!this.file.exists() || ParseFileUtils.deleteQuietly(this.file)) {
            return null;
        }
        throw new RuntimeException("Unable to delete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseObject lambda$getAsync$1() {
        if (this.file.exists()) {
            return getFromDisk(this.coder, this.file, ParseObject.State.newBuilder(this.className));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$setAsync$0(ParseObject parseObject) throws Throwable {
        saveToDisk(this.coder, parseObject, this.file);
        return null;
    }

    private static void saveToDisk(ParseObjectCurrentCoder parseObjectCurrentCoder, ParseObject parseObject, File file) throws Throwable {
        try {
            ParseFileUtils.writeJSONObjectToFile(file, parseObjectCurrentCoder.encode(parseObject.getState(), null, PointerEncoder.get()));
        } catch (IOException unused) {
        }
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> deleteAsync() {
        return Task.call(new CallableC0817(this, 1), ParseExecutors.io());
    }

    @Override // com.parse.ParseObjectStore
    public Task<T> getAsync() {
        return Task.call(new CallableC0817(this, 0), ParseExecutors.io());
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> setAsync(T t) {
        return Task.call(new CallableC0805(this, 0, t), ParseExecutors.io());
    }
}
