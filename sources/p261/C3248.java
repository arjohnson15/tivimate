package p261;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p137.C2100;
import p137.C2106;
import p137.C2108;
import p137.InterfaceC2103;
import p314.C3598;
import p314.InterfaceC3594;
import p314.InterfaceC3596;
import p329.AbstractC3742;
import p329.C3733;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3248 implements InterfaceC3594 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C3733 f12681 = new C3733(50);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2106 f12682;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f12683;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3598 f12684;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3594 f12685;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f12686;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Class f12687;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC3594 f12688;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final InterfaceC3596 f12689;

    public C3248(C2106 c2106, InterfaceC3594 interfaceC3594, InterfaceC3594 interfaceC35942, int i, int i2, InterfaceC3596 interfaceC3596, Class cls, C3598 c3598) {
        this.f12682 = c2106;
        this.f12685 = interfaceC3594;
        this.f12688 = interfaceC35942;
        this.f12683 = i;
        this.f12686 = i2;
        this.f12689 = interfaceC3596;
        this.f12687 = cls;
        this.f12684 = c3598;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3248)) {
            return false;
        }
        C3248 c3248 = (C3248) obj;
        return this.f12686 == c3248.f12686 && this.f12683 == c3248.f12683 && AbstractC3742.m8708(this.f12689, c3248.f12689) && this.f12687.equals(c3248.f12687) && this.f12685.equals(c3248.f12685) && this.f12688.equals(c3248.f12688) && this.f12684.equals(c3248.f12684);
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        int iHashCode = ((((this.f12688.hashCode() + (this.f12685.hashCode() * 31)) * 31) + this.f12683) * 31) + this.f12686;
        InterfaceC3596 interfaceC3596 = this.f12689;
        if (interfaceC3596 != null) {
            iHashCode = (iHashCode * 31) + interfaceC3596.hashCode();
        }
        return this.f12684.f13814.hashCode() + ((this.f12687.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f12685 + ", signature=" + this.f12688 + ", width=" + this.f12683 + ", height=" + this.f12686 + ", decodedResourceClass=" + this.f12687 + ", transformation='" + this.f12689 + "', options=" + this.f12684 + '}';
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        Object objM5969;
        C2106 c2106 = this.f12682;
        synchronized (c2106) {
            C2100 c2100 = c2106.f8314;
            InterfaceC2103 interfaceC2103M5952 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
            if (interfaceC2103M5952 == null) {
                interfaceC2103M5952 = c2100.m5952();
            }
            C2108 c2108 = (C2108) interfaceC2103M5952;
            c2108.f8330 = 8;
            c2108.f8331 = byte[].class;
            objM5969 = c2106.m5969(c2108, byte[].class);
        }
        byte[] bArr = (byte[]) objM5969;
        ByteBuffer.wrap(bArr).putInt(this.f12683).putInt(this.f12686).array();
        this.f12688.mo3713(messageDigest);
        this.f12685.mo3713(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3596 interfaceC3596 = this.f12689;
        if (interfaceC3596 != null) {
            interfaceC3596.mo3713(messageDigest);
        }
        this.f12684.mo3713(messageDigest);
        C3733 c3733 = f12681;
        Class cls = this.f12687;
        byte[] bytes = (byte[]) c3733.m8700(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC3594.f13813);
            c3733.m8701(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f12682.m5966(bArr);
    }
}
