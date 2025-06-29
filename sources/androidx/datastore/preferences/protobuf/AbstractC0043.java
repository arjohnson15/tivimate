package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0043 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final boolean f448;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f449;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f449 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f448 = cls2 != null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m472() {
        return (f449 == null || f448) ? false : true;
    }
}
