package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.ˎᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0412 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f2704;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Charset f2705;

    static {
        Charset.forName("US-ASCII");
        f2705 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2704 = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzlk.m1613();
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw zzlk.m1614();
            }
            if (i > Integer.MAX_VALUE) {
                throw zzlk.m1616();
            }
        } catch (zzlk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m2144(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
