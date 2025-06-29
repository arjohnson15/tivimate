package p242;

import android.os.Trace;

/* renamed from: ˑﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3106 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7619(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m7620() {
        return Trace.isEnabled();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7621(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }
}
