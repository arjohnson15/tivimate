package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* loaded from: classes.dex */
public class BadBlockException extends BadPaddingException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }
}
