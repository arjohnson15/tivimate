package p003;

import java.util.ArrayDeque;
import p329.AbstractC3742;

/* renamed from: ʻʾ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0898 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ArrayDeque f4036;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f4037;

    static {
        char[] cArr = AbstractC3742.f14503;
        f4036 = new ArrayDeque(0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0898 m3715(Object obj) {
        C0898 c0898;
        ArrayDeque arrayDeque = f4036;
        synchronized (arrayDeque) {
            c0898 = (C0898) arrayDeque.poll();
        }
        if (c0898 == null) {
            c0898 = new C0898();
        }
        c0898.f4037 = obj;
        return c0898;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0898)) {
            return false;
        }
        C0898 c0898 = (C0898) obj;
        c0898.getClass();
        return this.f4037.equals(c0898.f4037);
    }

    public final int hashCode() {
        return this.f4037.hashCode();
    }
}
