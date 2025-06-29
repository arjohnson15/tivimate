package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0731 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f3530;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Charset f3531;

    static {
        Charset.forName("US-ASCII");
        f3531 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3530 = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC0080.m567(bArr, 0, 0, false);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m2953(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m2954(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
