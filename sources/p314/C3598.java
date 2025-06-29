package p314;

import java.security.MessageDigest;
import p329.C3738;

/* renamed from: ᐧᵢ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3598 implements InterfaceC3594 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3738 f13814 = new C3738(0);

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (obj instanceof C3598) {
            return this.f13814.equals(((C3598) obj).f13814);
        }
        return false;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return this.f13814.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f13814 + '}';
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m8502(C3602 c3602) {
        C3738 c3738 = this.f13814;
        return c3738.containsKey(c3602) ? c3738.get(c3602) : c3602.f13823;
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C3738 c3738 = this.f13814;
            if (i >= c3738.f10778) {
                return;
            }
            C3602 c3602 = (C3602) c3738.m7021(i);
            Object objM7016 = this.f13814.m7016(i);
            InterfaceC3601 interfaceC3601 = c3602.f13821;
            if (c3602.f13824 == null) {
                c3602.f13824 = c3602.f13822.getBytes(InterfaceC3594.f13813);
            }
            interfaceC3601.mo4607(c3602.f13824, objM7016, messageDigest);
            i++;
        }
    }
}
