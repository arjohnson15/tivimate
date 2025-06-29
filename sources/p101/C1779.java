package p101;

import java.math.BigInteger;
import p254.C3174;
import p254.C3180;
import p254.InterfaceC3157;
import p383.AbstractC4470;

/* renamed from: ˆˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1779 implements InterfaceC3157 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1774 f6901;

    public C1779(C1774 c1774) {
        this.f6901 = c1774;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final long mo5502() {
        return (this.f6901.f6883 * 1000000) / r0.f6880.f6921;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C3180 mo5503(long j) {
        C1774 c1774 = this.f6901;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((c1774.f6880.f6921 * j) / 1000000);
        long j2 = c1774.f6878;
        long j3 = c1774.f6875;
        C3174 c3174 = new C3174(j, AbstractC4470.m10184((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(c1774.f6883)).longValue() + j3) - 30000, c1774.f6875, j2 - 1));
        return new C3180(c3174, c3174);
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean mo5504() {
        return true;
    }
}
