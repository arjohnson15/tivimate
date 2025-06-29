package com.google.android.gms.common.api;

import p305.C3542;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3542 f2416;

    public UnsupportedApiCallException(C3542 c3542) {
        this.f2416 = c3542;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2416));
    }
}
