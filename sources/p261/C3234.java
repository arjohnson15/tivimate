package p261;

import java.security.MessageDigest;
import p314.C3598;
import p314.InterfaceC3594;
import p329.AbstractC3740;
import p329.C3738;

/* renamed from: ـ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3234 implements InterfaceC3594 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f12601;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Class f12602;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f12603;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3738 f12604;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12605;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Class f12606;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC3594 f12607;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12608;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3598 f12609;

    public C3234(Object obj, InterfaceC3594 interfaceC3594, int i, int i2, C3738 c3738, Class cls, Class cls2, C3598 c3598) {
        AbstractC3740.m8706(obj, "Argument must not be null");
        this.f12601 = obj;
        this.f12607 = interfaceC3594;
        this.f12605 = i;
        this.f12608 = i2;
        AbstractC3740.m8706(c3738, "Argument must not be null");
        this.f12604 = c3738;
        AbstractC3740.m8706(cls, "Resource class must not be null");
        this.f12602 = cls;
        AbstractC3740.m8706(cls2, "Transcode class must not be null");
        this.f12606 = cls2;
        AbstractC3740.m8706(c3598, "Argument must not be null");
        this.f12609 = c3598;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3234)) {
            return false;
        }
        C3234 c3234 = (C3234) obj;
        return this.f12601.equals(c3234.f12601) && this.f12607.equals(c3234.f12607) && this.f12608 == c3234.f12608 && this.f12605 == c3234.f12605 && this.f12604.equals(c3234.f12604) && this.f12602.equals(c3234.f12602) && this.f12606.equals(c3234.f12606) && this.f12609.equals(c3234.f12609);
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        if (this.f12603 == 0) {
            int iHashCode = this.f12601.hashCode();
            this.f12603 = iHashCode;
            int iHashCode2 = ((((this.f12607.hashCode() + (iHashCode * 31)) * 31) + this.f12605) * 31) + this.f12608;
            this.f12603 = iHashCode2;
            int iHashCode3 = this.f12604.hashCode() + (iHashCode2 * 31);
            this.f12603 = iHashCode3;
            int iHashCode4 = this.f12602.hashCode() + (iHashCode3 * 31);
            this.f12603 = iHashCode4;
            int iHashCode5 = this.f12606.hashCode() + (iHashCode4 * 31);
            this.f12603 = iHashCode5;
            this.f12603 = this.f12609.f13814.hashCode() + (iHashCode5 * 31);
        }
        return this.f12603;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f12601 + ", width=" + this.f12605 + ", height=" + this.f12608 + ", resourceClass=" + this.f12602 + ", transcodeClass=" + this.f12606 + ", signature=" + this.f12607 + ", hashCode=" + this.f12603 + ", transformations=" + this.f12604 + ", options=" + this.f12609 + '}';
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
