package p397;

import java.util.List;
import p345.AbstractC3980;
import p345.C3949;
import p345.C3965;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ⁱᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4606 implements InterfaceC4599 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C3949 f17626;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long[] f17627;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC3980 f17628;

    static {
        C3965 c3965 = C3965.f15337;
        C4607 c4607 = new C4607(1);
        c3965.getClass();
        f17626 = new C3949(c4607, c3965);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4606(p345.C3932 r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p397.C4606.<init>(ᵎᴵ.ˉᵎ):void");
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ˋˊ */
    public final List mo7939(long j) {
        int iM10195 = AbstractC4470.m10195(this.f17627, j, false);
        return iM10195 == -1 ? AbstractC3980.m9204() : (AbstractC3980) this.f17628.get(iM10195);
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ˑʽ */
    public final int mo7944(long j) {
        int iM10163 = AbstractC4470.m10163(this.f17627, j, false);
        if (iM10163 < this.f17628.size()) {
            return iM10163;
        }
        return -1;
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ᐧˋ */
    public final int mo7949() {
        return this.f17628.size();
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ᴵʿ */
    public final long mo7950(int i) {
        AbstractC4464.m10142(i < this.f17628.size());
        return this.f17627[i];
    }
}
