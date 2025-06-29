package com.parse;

import com.parse.ParseFile;
import com.parse.ParseRESTFileCommand;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseFileController {
    private final File cachePath;
    private final ParseHttpClient restClient;
    private final Object lock = new Object();
    private final List<String> currentlyDownloadedFilesNames = new ArrayList();

    public ParseFileController(ParseHttpClient parseHttpClient, File file) {
        this.restClient = parseHttpClient;
        this.cachePath = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseFile.State lambda$saveAsync$0(ParseFile.State state, byte[] bArr, Task task) throws Throwable {
        JSONObject jSONObject = (JSONObject) task.getResult();
        ParseFile.State stateBuild = new ParseFile.State.Builder(state).name(jSONObject.getString("name")).url(jSONObject.getString("url")).build();
        try {
            ParseFileUtils.writeByteArrayToFile(getCacheFile(stateBuild), bArr);
        } catch (IOException unused) {
        }
        return stateBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseFile.State lambda$saveAsync$1(ParseFile.State state, File file, Task task) throws Throwable {
        JSONObject jSONObject = (JSONObject) task.getResult();
        ParseFile.State stateBuild = new ParseFile.State.Builder(state).name(jSONObject.getString("name")).url(jSONObject.getString("url")).build();
        try {
            ParseFileUtils.copyFile(file, getCacheFile(stateBuild));
        } catch (IOException unused) {
        }
        return stateBuild;
    }

    public File getCacheFile(ParseFile.State state) {
        return new File(this.cachePath, state.name());
    }

    public Task<ParseFile.State> saveAsync(ParseFile.State state, File file, String str, ProgressCallback progressCallback, Task<Void> task) {
        return state.url() != null ? Task.forResult(state) : (task == null || !task.isCancelled()) ? ((ParseRESTFileCommand.Builder) new ParseRESTFileCommand.Builder().fileName(state.name()).file(file).contentType(state.mimeType()).sessionToken(str)).build().executeAsync(this.restClient, progressCallback, (ProgressCallback) null, task).onSuccess(new C0813(this, state, file, 7), ParseExecutors.io()) : Task.cancelled();
    }

    public Task<ParseFile.State> saveAsync(ParseFile.State state, byte[] bArr, String str, ProgressCallback progressCallback, Task<Void> task) {
        return state.url() != null ? Task.forResult(state) : (task == null || !task.isCancelled()) ? ((ParseRESTFileCommand.Builder) new ParseRESTFileCommand.Builder().fileName(state.name()).data(bArr).contentType(state.mimeType()).sessionToken(str)).build().executeAsync(this.restClient, progressCallback, (ProgressCallback) null, task).onSuccess(new C0813(this, state, bArr, 8), ParseExecutors.io()) : Task.cancelled();
    }
}
