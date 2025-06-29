package p251;

import p417.AbstractC4753;

/* renamed from: יˎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3136 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3130 f12093 = new C3130();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7702(Object obj) {
        C3130 c3130 = this.f12093;
        synchronized (c3130.f12084) {
            try {
                if (c3130.f12083) {
                    return;
                }
                c3130.f12083 = true;
                c3130.f12082 = obj;
                c3130.f12081.ˏᴵ(c3130);
            } finally {
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7703(Exception exc) {
        C3130 c3130 = this.f12093;
        c3130.getClass();
        AbstractC4753.m10689(exc, "Exception must not be null");
        synchronized (c3130.f12084) {
            try {
                if (c3130.f12083) {
                    return;
                }
                c3130.f12083 = true;
                c3130.f12085 = exc;
                c3130.f12081.ˏᴵ(c3130);
            } finally {
            }
        }
    }
}
