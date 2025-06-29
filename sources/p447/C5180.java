package p447;

import java.util.ArrayList;
import p080.AbstractC1702;
import p080.C1698;
import p080.C1700;
import p080.C1703;

/* renamed from: ﾞˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5180 extends C5171 {

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f19937;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public float f19932 = -1.0f;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public int f19936 = -1;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f19935 = -1;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public C5175 f19933 = this.f19807;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f19934 = 0;

    public C5180() {
        this.f19825.clear();
        this.f19825.add(this.f19933);
        int length = this.f19795.length;
        for (int i = 0; i < length; i++) {
            this.f19795[i] = this.f19933;
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m11555(int i) {
        if (this.f19934 == i) {
            return;
        }
        this.f19934 = i;
        ArrayList arrayList = this.f19825;
        arrayList.clear();
        if (this.f19934 == 1) {
            this.f19933 = this.f19788;
        } else {
            this.f19933 = this.f19807;
        }
        arrayList.add(this.f19933);
        C5175[] c5175Arr = this.f19795;
        int length = c5175Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c5175Arr[i2] = this.f19933;
        }
    }

    @Override // p447.C5171
    /* renamed from: ʽᐧ */
    public final void mo11475(C1700 c1700, boolean z) {
        C5177 c5177 = (C5177) this.f19824;
        if (c5177 == null) {
            return;
        }
        Object objMo11510 = c5177.mo11510(2);
        Object objMo115102 = c5177.mo11510(4);
        C5171 c5171 = this.f19824;
        boolean z2 = c5171 != null && c5171.f19839[0] == 2;
        if (this.f19934 == 0) {
            objMo11510 = c5177.mo11510(3);
            objMo115102 = c5177.mo11510(5);
            C5171 c51712 = this.f19824;
            z2 = c51712 != null && c51712.f19839[1] == 2;
        }
        if (this.f19937) {
            C5175 c5175 = this.f19933;
            if (c5175.f19882) {
                C1703 c1703M5386 = c1700.m5386(c5175);
                c1700.m5397(c1703M5386, this.f19933.m11532());
                if (this.f19936 != -1) {
                    if (z2) {
                        c1700.m5392(c1700.m5386(objMo115102), c1703M5386, 0, 5);
                    }
                } else if (this.f19935 != -1 && z2) {
                    C1703 c1703M53862 = c1700.m5386(objMo115102);
                    c1700.m5392(c1703M5386, c1700.m5386(objMo11510), 0, 5);
                    c1700.m5392(c1703M53862, c1703M5386, 0, 5);
                }
                this.f19937 = false;
                return;
            }
        }
        if (this.f19936 != -1) {
            C1703 c1703M53863 = c1700.m5386(this.f19933);
            c1700.m5381(c1703M53863, c1700.m5386(objMo11510), this.f19936, 8);
            if (z2) {
                c1700.m5392(c1700.m5386(objMo115102), c1703M53863, 0, 5);
                return;
            }
            return;
        }
        if (this.f19935 != -1) {
            C1703 c1703M53864 = c1700.m5386(this.f19933);
            C1703 c1703M53865 = c1700.m5386(objMo115102);
            c1700.m5381(c1703M53864, c1703M53865, -this.f19935, 8);
            if (z2) {
                c1700.m5392(c1703M53864, c1700.m5386(objMo11510), 0, 5);
                c1700.m5392(c1703M53865, c1703M53864, 0, 5);
                return;
            }
            return;
        }
        if (this.f19932 != -1.0f) {
            C1703 c1703M53866 = c1700.m5386(this.f19933);
            C1703 c1703M53867 = c1700.m5386(objMo115102);
            float f = this.f19932;
            C1698 c1698M5383 = c1700.m5383();
            c1698M5383.f6621.m5405(c1703M53866, -1.0f);
            c1698M5383.f6621.m5405(c1703M53867, f);
            c1700.m5389(c1698M5383);
        }
    }

    @Override // p447.C5171
    /* renamed from: ˈٴ */
    public final boolean mo11481() {
        return this.f19937;
    }

    @Override // p447.C5171
    /* renamed from: ˎᵔ */
    public final void mo11489(C1700 c1700, boolean z) {
        if (this.f19824 == null) {
            return;
        }
        C5175 c5175 = this.f19933;
        c1700.getClass();
        int iM5379 = C1700.m5379(c5175);
        if (this.f19934 == 1) {
            this.f19818 = iM5379;
            this.f19778 = 0;
            m11513(this.f19824.m11490());
            m11493(0);
            return;
        }
        this.f19818 = 0;
        this.f19778 = iM5379;
        m11493(this.f19824.m11505());
        m11513(0);
    }

    @Override // p447.C5171
    /* renamed from: ˑʽ */
    public final boolean mo11492() {
        return true;
    }

    @Override // p447.C5171
    /* renamed from: ᐧⁱ */
    public final boolean mo11501() {
        return this.f19937;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m11556(int i) {
        this.f19933.m11525(i);
        this.f19937 = true;
    }

    @Override // p447.C5171
    /* renamed from: ﹶˆ */
    public final C5175 mo11510(int i) {
        int iM5411 = AbstractC1702.m5411(i);
        if (iM5411 != 1) {
            if (iM5411 != 2) {
                if (iM5411 != 3) {
                    if (iM5411 != 4) {
                        return null;
                    }
                }
            }
            if (this.f19934 == 0) {
                return this.f19933;
            }
            return null;
        }
        if (this.f19934 == 1) {
            return this.f19933;
        }
        return null;
    }
}
