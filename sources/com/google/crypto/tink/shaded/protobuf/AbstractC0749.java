package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0749 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final boolean f3595;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f3596;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3596 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3595 = cls2 != null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m3133() {
        return (f3596 == null || f3595) ? false : true;
    }
}
