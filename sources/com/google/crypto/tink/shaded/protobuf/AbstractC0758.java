package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0758 implements InterfaceC0752 {
    protected int memoizedHashCode;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m3164(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final byte[] m3165() {
        try {
            int iMo3166 = ((AbstractC0785) this).mo3166(null);
            byte[] bArr = new byte[iMo3166];
            C0735 c0735 = new C0735(iMo3166, bArr);
            mo3167(c0735);
            if (iMo3166 - c0735.f3548 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m3164("byte array"), e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract int mo3166(InterfaceC0727 interfaceC0727);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public abstract void mo3167(C0735 c0735);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract AbstractC0728 mo3168();
}
