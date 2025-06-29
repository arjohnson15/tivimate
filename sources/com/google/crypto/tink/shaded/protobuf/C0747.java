package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0747 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0747 f3590;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile C0747 f3591;

    static {
        C0747 c0747 = new C0747();
        Collections.emptyMap();
        f3590 = c0747;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0747 m3127() {
        C0747 c0747 = f3591;
        if (c0747 == null) {
            synchronized (C0747.class) {
                try {
                    c0747 = f3591;
                    if (c0747 == null) {
                        Class cls = AbstractC0766.f3617;
                        C0747 c07472 = null;
                        if (cls != null) {
                            try {
                                c07472 = (C0747) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c07472 == null) {
                            c07472 = f3590;
                        }
                        f3591 = c07472;
                        c0747 = c07472;
                    }
                } finally {
                }
            }
        }
        return c0747;
    }
}
