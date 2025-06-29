package p261;

import java.security.MessageDigest;
import p314.InterfaceC3594;

/* renamed from: ـ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3227 implements InterfaceC3594 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3594 f12545;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3594 f12546;

    public C3227(InterfaceC3594 interfaceC3594, InterfaceC3594 interfaceC35942) {
        this.f12545 = interfaceC3594;
        this.f12546 = interfaceC35942;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3227)) {
            return false;
        }
        C3227 c3227 = (C3227) obj;
        return this.f12545.equals(c3227.f12545) && this.f12546.equals(c3227.f12546);
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return this.f12546.hashCode() + (this.f12545.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f12545 + ", signature=" + this.f12546 + '}';
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        this.f12545.mo3713(messageDigest);
        this.f12546.mo3713(messageDigest);
    }
}
