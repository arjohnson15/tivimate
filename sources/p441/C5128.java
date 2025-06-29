package p441;

import java.util.Iterator;
import p447.C5171;
import p447.C5176;

/* renamed from: ﾞʽ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5128 extends AbstractC5132 {
    @Override // p441.AbstractC5132
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo11406() {
        C5171 c5171 = this.f19623;
        if (c5171 instanceof C5176) {
            int i = ((C5176) c5171).f19890;
            C5136 c5136 = this.f19626;
            if (i == 0 || i == 1) {
                c5171.f19818 = c5136.f19645;
            } else {
                c5171.f19778 = c5136.f19645;
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11407(C5136 c5136) {
        C5136 c51362 = this.f19626;
        c51362.f19640.add(c5136);
        c5136.f19639.add(c51362);
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean mo11408() {
        return false;
    }

    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo11409(InterfaceC5139 interfaceC5139) {
        C5176 c5176 = (C5176) this.f19623;
        int i = c5176.f19890;
        C5136 c5136 = this.f19626;
        Iterator it = c5136.f19639.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C5136) it.next()).f19645;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c5136.mo11437(i3 + c5176.f19889);
        } else {
            c5136.mo11437(i2 + c5176.f19889);
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo11410() {
        this.f19627 = null;
        this.f19626.m11436();
    }

    @Override // p441.AbstractC5132
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo11411() {
        C5171 c5171 = this.f19623;
        if (c5171 instanceof C5176) {
            C5136 c5136 = this.f19626;
            c5136.f19636 = true;
            C5176 c5176 = (C5176) c5171;
            int i = c5176.f19890;
            boolean z = c5176.f19888;
            int i2 = 0;
            if (i == 0) {
                c5136.f19637 = 4;
                while (i2 < c5176.f19841) {
                    C5171 c51712 = c5176.f19840[i2];
                    if (z || c51712.f19774 != 8) {
                        C5136 c51362 = c51712.f19832.f19626;
                        c51362.f19640.add(c5136);
                        c5136.f19639.add(c51362);
                    }
                    i2++;
                }
                m11407(this.f19623.f19832.f19626);
                m11407(this.f19623.f19832.f19632);
                return;
            }
            if (i == 1) {
                c5136.f19637 = 5;
                while (i2 < c5176.f19841) {
                    C5171 c51713 = c5176.f19840[i2];
                    if (z || c51713.f19774 != 8) {
                        C5136 c51363 = c51713.f19832.f19632;
                        c51363.f19640.add(c5136);
                        c5136.f19639.add(c51363);
                    }
                    i2++;
                }
                m11407(this.f19623.f19832.f19626);
                m11407(this.f19623.f19832.f19632);
                return;
            }
            if (i == 2) {
                c5136.f19637 = 6;
                while (i2 < c5176.f19841) {
                    C5171 c51714 = c5176.f19840[i2];
                    if (z || c51714.f19774 != 8) {
                        C5136 c51364 = c51714.f19777.f19626;
                        c51364.f19640.add(c5136);
                        c5136.f19639.add(c51364);
                    }
                    i2++;
                }
                m11407(this.f19623.f19777.f19626);
                m11407(this.f19623.f19777.f19632);
                return;
            }
            if (i != 3) {
                return;
            }
            c5136.f19637 = 7;
            while (i2 < c5176.f19841) {
                C5171 c51715 = c5176.f19840[i2];
                if (z || c51715.f19774 != 8) {
                    C5136 c51365 = c51715.f19777.f19632;
                    c51365.f19640.add(c5136);
                    c5136.f19639.add(c51365);
                }
                i2++;
            }
            m11407(this.f19623.f19777.f19626);
            m11407(this.f19623.f19777.f19632);
        }
    }
}
