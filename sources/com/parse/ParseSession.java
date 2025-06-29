package com.parse;

import com.parse.boltsinternal.Task;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

@ParseClassName("_Session")
/* loaded from: classes.dex */
public class ParseSession extends ParseObject {
    private static final List<String> READ_ONLY_KEYS = DesugarCollections.unmodifiableList(Arrays.asList("sessionToken", "createdWith", "restricted", "user", "expiresAt", "installationId"));

    private static ParseSessionController getSessionController() {
        return ParseCorePlugins.getInstance().getSessionController();
    }

    public static boolean isRevocableSessionToken(String str) {
        return str.contains("r:");
    }

    public static Task<Void> revokeAsync(String str) {
        return (str == null || !isRevocableSessionToken(str)) ? Task.forResult(null) : getSessionController().revokeAsync(str);
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_KEYS.contains(str);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }
}
