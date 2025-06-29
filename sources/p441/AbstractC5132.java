package p441;

import p080.AbstractC1702;
import p447.C5171;
import p447.C5175;

/* renamed from: ﾞʽ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5132 implements InterfaceC5139 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C5171 f19623;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C5129 f19627;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f19628;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f19631;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5137 f19624 = new C5137(this);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19629 = 0;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f19630 = false;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5136 f19626 = new C5136(this);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C5136 f19632 = new C5136(this);

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f19625 = 1;

    public AbstractC5132(C5171 c5171) {
        this.f19623 = c5171;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m11417(C5136 c5136, C5136 c51362, int i) {
        c5136.f19639.add(c51362);
        c5136.f19644 = i;
        c51362.f19640.add(c5136);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C5136 m11418(C5175 c5175) {
        C5175 c51752 = c5175.f19884;
        if (c51752 == null) {
            return null;
        }
        int iM5411 = AbstractC1702.m5411(c51752.f19880);
        C5171 c5171 = c51752.f19886;
        if (iM5411 == 1) {
            return c5171.f19832.f19626;
        }
        if (iM5411 == 2) {
            return c5171.f19777.f19626;
        }
        if (iM5411 == 3) {
            return c5171.f19832.f19632;
        }
        if (iM5411 == 4) {
            return c5171.f19777.f19632;
        }
        if (iM5411 != 5) {
            return null;
        }
        return c5171.f19777.f19621;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C5136 m11419(C5175 c5175, int i) {
        C5175 c51752 = c5175.f19884;
        if (c51752 == null) {
            return null;
        }
        C5171 c5171 = c51752.f19886;
        AbstractC5132 abstractC5132 = i == 0 ? c5171.f19832 : c5171.f19777;
        int iM5411 = AbstractC1702.m5411(c51752.f19880);
        if (iM5411 == 1 || iM5411 == 2) {
            return abstractC5132.f19626;
        }
        if (iM5411 == 3 || iM5411 == 4) {
            return abstractC5132.f19632;
        }
        return null;
    }

    /* renamed from: ʿʼ */
    public abstract void mo11406();

    /* renamed from: ˉי, reason: contains not printable characters */
    public long mo11420() {
        if (this.f19624.f19638) {
            return r0.f19645;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11421(p447.C5175 r12, p447.C5175 r13, int r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p441.AbstractC5132.m11421(ﾞˊ.ˑʽ, ﾞˊ.ˑʽ, int):void");
    }

    /* renamed from: ˏʾ */
    public abstract boolean mo11408();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11422(C5136 c5136, C5136 c51362, int i, C5137 c5137) {
        c5136.f19639.add(c51362);
        c5136.f19639.add(this.f19624);
        c5136.f19641 = i;
        c5136.f19647 = c5137;
        c51362.f19640.add(c5136);
        c5137.f19640.add(c5136);
    }

    /* renamed from: ٴˎ */
    public abstract void mo11410();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m11423(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C5171 c5171 = this.f19623;
            int i3 = c5171.f19789;
            iMax = Math.max(c5171.f19779, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C5171 c51712 = this.f19623;
            int i4 = c51712.f19805;
            iMax = Math.max(c51712.f19835, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* renamed from: ﹳﹳ */
    public abstract void mo11411();
}
