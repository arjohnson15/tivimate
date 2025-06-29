package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i = status.f2415;
        String str = status.f2412;
        super(i + ": " + (str == null ? "" : str));
    }
}
