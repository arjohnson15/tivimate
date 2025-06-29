package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0062 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0062 f480;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile C0062 f481;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        C0062 c0062 = new C0062();
        Collections.emptyMap();
        f480 = c0062;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0062 m495() {
        C0062 c0062 = f481;
        if (c0062 == null) {
            synchronized (C0062.class) {
                try {
                    c0062 = f481;
                    if (c0062 == null) {
                        Class cls = AbstractC0032.f399;
                        if (cls != null) {
                            try {
                                c0062 = (C0062) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                            f481 = c0062;
                        } else {
                            c0062 = f480;
                            f481 = c0062;
                        }
                    }
                } finally {
                }
            }
        }
        return c0062;
    }
}
