package p101;

import androidx.leanback.widget.C0153;
import p254.InterfaceC3157;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˆˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1774 implements InterfaceC1781 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f6874;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f6875;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6876;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f6877;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f6878;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f6879;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC1783 f6880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0153 f6881;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f6882;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public long f6883;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f6884;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f6885;

    public C1774(AbstractC1783 abstractC1783, long j, long j2, long j3, long j4, boolean z) {
        AbstractC4464.m10142(j >= 0 && j2 > j);
        this.f6880 = abstractC1783;
        this.f6875 = j;
        this.f6878 = j2;
        if (j3 == j2 - j || z) {
            this.f6883 = j4;
            this.f6876 = 4;
        } else {
            this.f6876 = 0;
        }
        this.f6881 = new C0153();
    }

    @Override // p101.InterfaceC1781
    /* renamed from: ˉי, reason: contains not printable characters */
    public final InterfaceC3157 mo5492() {
        if (this.f6883 != 0) {
            return new C1779(this);
        }
        return null;
    }

    @Override // p101.InterfaceC1781
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo5493(long j) {
        this.f6877 = AbstractC4470.m10184(j, 0L, this.f6883 - 1);
        this.f6876 = 2;
        this.f6879 = this.f6875;
        this.f6882 = this.f6878;
        this.f6885 = 0L;
        this.f6874 = this.f6883;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    @Override // p101.InterfaceC1781
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5494(p254.C3159 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101.C1774.mo5494(יי.ˉⁱ):long");
    }
}
