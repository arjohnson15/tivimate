package p436;

import android.content.Context;
import p009.C0995;

/* renamed from: ﹶⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5068 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5068 f19221;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C0995 f19222;

    static {
        C5068 c5068 = new C5068();
        c5068.f19222 = null;
        f19221 = c5068;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0995 m11225(Context context) {
        C0995 c0995;
        C5068 c5068 = f19221;
        synchronized (c5068) {
            try {
                if (c5068.f19222 == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c5068.f19222 = new C0995(context, false);
                }
                c0995 = c5068.f19222;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0995;
    }
}
