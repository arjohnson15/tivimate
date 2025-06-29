package p329;

import p150.ExecutorC2314;

/* renamed from: ᴵᵢ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3740 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ExecutorC2314 f14500 = new ExecutorC2314(4);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ExecutorC2314 f14499 = new ExecutorC2314(5);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8705(Object obj) {
        m8706(obj, "Argument must not be null");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8706(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8707(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
