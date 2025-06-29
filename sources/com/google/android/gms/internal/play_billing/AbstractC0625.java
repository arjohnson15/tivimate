package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0625 {
    protected int zza;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] m2638() {
        try {
            AbstractC0662 abstractC0662 = (AbstractC0662) this;
            int iM2709 = abstractC0662.m2709();
            byte[] bArr = new byte[iM2709];
            C0678 c0678 = new C0678(iM2709, bArr);
            InterfaceC0638 interfaceC0638M2557 = C0592.f2957.m2557(abstractC0662.getClass());
            C0679 c0679 = c0678.f3101;
            if (c0679 == null) {
                c0679 = new C0679(c0678);
            }
            interfaceC0638M2557.mo2627(abstractC0662, c0679);
            if (iM2709 - c0678.f3099 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ˆʽ.ᵎˏ.ˑי("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract int mo2639(InterfaceC0638 interfaceC0638);
}
