package p214;

import j$.util.Objects;
import p206.C2788;
import p352.EnumC4008;
import p352.InterfaceC4007;
import p405.C4640;
import p456.C5349;

/* renamed from: ˏˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2816 implements InterfaceC4007 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10956;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2788 f10957;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2788 f10958;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2816)) {
            return false;
        }
        C2816 c2816 = (C2816) obj;
        return m7098(obj) && this.f10956 == c2816.f10956 && Objects.equals(this.f10957, c2816.f10957);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10956), this.f10957) + (m7097() * 31);
    }

    public final String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", this.f10958, Integer.valueOf(this.f10956), this.f10957);
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ʽᐧ */
    public final void mo7065(C5349 c5349) {
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m7097() {
        return Objects.hash(this.f10958);
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ˑʽ */
    public final void mo7066(C5349 c5349) {
        C2788 c2788 = this.f10958;
        if (c2788 != null) {
            c5349.m12104(c2788);
        }
        C2788 c27882 = this.f10957;
        if (c27882 != null) {
            c5349.m12104(c27882);
        }
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ـﹶ */
    public final void mo7067(C5349 c5349) {
        c5349.m12092(EnumC4008.FOUR);
        C4640 c4640 = (C4640) c5349.f20757;
        if (c4640.readInt() != 0) {
            this.f10958 = new C2788();
        } else {
            this.f10958 = null;
        }
        this.f10956 = (int) c5349.m12093();
        if (c4640.readInt() != 0) {
            this.f10957 = new C2788();
        } else {
            this.f10957 = null;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m7098(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2816) {
            return Objects.equals(this.f10958, ((C2816) obj).f10958);
        }
        return false;
    }
}
