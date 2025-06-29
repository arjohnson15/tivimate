package com.parse;

import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes.dex */
class ParseCurrentConfigController {
    ParseConfig currentConfig;
    private final File currentConfigFile;
    private final Object currentConfigMutex = new Object();

    public ParseCurrentConfigController(File file) {
        this.currentConfigFile = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseConfig lambda$getCurrentConfigAsync$1() {
        synchronized (this.currentConfigMutex) {
            try {
                if (this.currentConfig == null) {
                    ParseConfig fromDisk = getFromDisk();
                    if (fromDisk == null) {
                        fromDisk = new ParseConfig();
                    }
                    this.currentConfig = fromDisk;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.currentConfig;
    }

    public Task<ParseConfig> getCurrentConfigAsync() {
        return Task.call(new CallableC0806(0, this), ParseExecutors.io());
    }

    public ParseConfig getFromDisk() {
        try {
            return ParseConfig.decode(ParseFileUtils.readFileToJSONObject(this.currentConfigFile), ParseDecoder.get());
        } catch (IOException | JSONException unused) {
            return null;
        }
    }
}
