package com.parse;

import com.parse.boltsinternal.Task;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ParseAuthenticationManager {
    private final ParseCurrentUserController controller;
    private final Object lock = new Object();
    private final Map<String, Object> callbacks = new HashMap();

    public ParseAuthenticationManager(ParseCurrentUserController parseCurrentUserController) {
        this.controller = parseCurrentUserController;
    }

    public Task<Void> deauthenticateAsync(String str) {
        synchronized (this.lock) {
            ᵎﹳ.ᐧʻ.ᵎˏ(this.callbacks.get(str));
        }
        return Task.forResult(null);
    }

    public Task<Boolean> restoreAuthenticationAsync(String str, Map<String, String> map) {
        synchronized (this.lock) {
            ᵎﹳ.ᐧʻ.ᵎˏ(this.callbacks.get(str));
        }
        return Task.forResult(Boolean.TRUE);
    }
}
