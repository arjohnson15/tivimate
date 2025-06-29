package com.rapid7.client.dcerpc.transport.exceptions;

import java.io.IOException;
import p449.EnumC5187;

/* loaded from: classes.dex */
public class RPCFaultException extends IOException {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ int f3884 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC5187 f3885;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3886;

    public RPCFaultException(int i) {
        this.f3886 = i;
        EnumC5187 enumC5187 = (EnumC5187) EnumC5187.f19996.get(Integer.valueOf(i));
        this.f3885 = enumC5187 == null ? EnumC5187.f19995 : enumC5187;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", this.f3885, Integer.valueOf(this.f3886));
    }
}
