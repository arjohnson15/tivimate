package p261;

import java.util.concurrent.Executor;
import p346.C3993;

/* renamed from: ـ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3236 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Executor f12615;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3993 f12616;

    public C3236(C3993 c3993, Executor executor) {
        this.f12616 = c3993;
        this.f12615 = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3236) {
            return this.f12616.equals(((C3236) obj).f12616);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12616.hashCode();
    }
}
