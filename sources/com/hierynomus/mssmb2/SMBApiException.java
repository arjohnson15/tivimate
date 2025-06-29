package com.hierynomus.mssmb2;

import com.hierynomus.smbj.common.SMBRuntimeException;
import p078.C1696;
import p109.EnumC1805;

/* loaded from: classes.dex */
public class SMBApiException extends SMBRuntimeException {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f3661;

    public SMBApiException(long j, String str, Exception exc) {
        super(str, exc);
        this.f3661 = j;
    }

    public SMBApiException(C1696 c1696, String str) {
        super(str);
        this.f3661 = c1696.f6598;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long j = this.f3661;
        return String.format("%s (0x%08x): %s", EnumC1805.m5549(j).name(), Long.valueOf(j), super.getMessage());
    }
}
