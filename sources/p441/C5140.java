package p441;

import p447.C5171;
import p447.C5180;

/* renamed from: ﾞʽ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5140 extends AbstractC5132 {
    @Override // p441.AbstractC5132
    /* renamed from: ʿʼ */
    public final void mo11406() {
        C5171 c5171 = this.f19623;
        int i = ((C5180) c5171).f19934;
        C5136 c5136 = this.f19626;
        if (i == 1) {
            c5171.f19818 = c5136.f19645;
        } else {
            c5171.f19778 = c5136.f19645;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11441(C5136 c5136) {
        C5136 c51362 = this.f19626;
        c51362.f19640.add(c5136);
        c5136.f19639.add(c51362);
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˏʾ */
    public final boolean mo11408() {
        return false;
    }

    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ */
    public final void mo11409(InterfaceC5139 interfaceC5139) {
        C5136 c5136 = this.f19626;
        if (c5136.f19642 && !c5136.f19638) {
            c5136.mo11437((int) ((((C5136) c5136.f19639.get(0)).f19645 * ((C5180) this.f19623).f19932) + 0.5f));
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ٴˎ */
    public final void mo11410() {
        this.f19626.m11436();
    }

    @Override // p441.AbstractC5132
    /* renamed from: ﹳﹳ */
    public final void mo11411() {
        C5171 c5171 = this.f19623;
        C5180 c5180 = (C5180) c5171;
        int i = c5180.f19936;
        int i2 = c5180.f19935;
        int i3 = c5180.f19934;
        C5136 c5136 = this.f19626;
        if (i3 == 1) {
            if (i != -1) {
                c5136.f19639.add(c5171.f19824.f19832.f19626);
                this.f19623.f19824.f19832.f19626.f19640.add(c5136);
                c5136.f19644 = i;
            } else if (i2 != -1) {
                c5136.f19639.add(c5171.f19824.f19832.f19632);
                this.f19623.f19824.f19832.f19632.f19640.add(c5136);
                c5136.f19644 = -i2;
            } else {
                c5136.f19636 = true;
                c5136.f19639.add(c5171.f19824.f19832.f19632);
                this.f19623.f19824.f19832.f19632.f19640.add(c5136);
            }
            m11441(this.f19623.f19832.f19626);
            m11441(this.f19623.f19832.f19632);
            return;
        }
        if (i != -1) {
            c5136.f19639.add(c5171.f19824.f19777.f19626);
            this.f19623.f19824.f19777.f19626.f19640.add(c5136);
            c5136.f19644 = i;
        } else if (i2 != -1) {
            c5136.f19639.add(c5171.f19824.f19777.f19632);
            this.f19623.f19824.f19777.f19632.f19640.add(c5136);
            c5136.f19644 = -i2;
        } else {
            c5136.f19636 = true;
            c5136.f19639.add(c5171.f19824.f19777.f19632);
            this.f19623.f19824.f19777.f19632.f19640.add(c5136);
        }
        m11441(this.f19623.f19777.f19626);
        m11441(this.f19623.f19777.f19632);
    }
}
