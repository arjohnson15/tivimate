package androidx.media3.exoplayer.smoothstreaming.manifest;

import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public class SsManifestParser$MissingFieldException extends ParserException {
    public SsManifestParser$MissingFieldException(String str) {
        super("Missing required field: ".concat(str), null, true, 4);
    }
}
