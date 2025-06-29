package com.rapid7.helper.smbj.io;

import java.io.IOException;
import p078.C1696;
import p109.EnumC1805;

/* loaded from: classes.dex */
public class SMB2Exception extends IOException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final EnumC1805 f3887;

    public SMB2Exception(C1696 c1696, String str) {
        super(String.format("%s returned %s (%d/%d): %s", c1696.f6597, Long.valueOf(c1696.f6598), Long.valueOf(c1696.f6598), Long.valueOf(c1696.f6598), str));
        this.f3887 = EnumC1805.m5549(c1696.f6598);
    }
}
