package p428;

import p251.C3130;
import p251.C3136;
import p251.InterfaceC3134;

/* renamed from: ﹶˊ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4931 implements InterfaceC3134 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3136 f18655;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f18656;

    public /* synthetic */ C4931(C3136 c3136, int i) {
        this.f18656 = i;
        this.f18655 = c3136;
    }

    @Override // p251.InterfaceC3134
    /* renamed from: ˏʾ */
    public final Object mo7700(C3130 c3130) {
        switch (this.f18656) {
            case 0:
                boolean zM7685 = c3130.m7685();
                C3136 c3136 = this.f18655;
                if (!zM7685) {
                    if (c3130.m7684() != null) {
                        c3136.m7703(c3130.m7684());
                        break;
                    }
                } else {
                    c3136.m7702(c3130.m7689());
                    break;
                }
                break;
            case 1:
                boolean zM76852 = c3130.m7685();
                C3136 c31362 = this.f18655;
                if (!zM76852) {
                    if (c3130.m7684() != null) {
                        c31362.m7703(c3130.m7684());
                        break;
                    }
                } else {
                    c31362.m7702(c3130.m7689());
                    break;
                }
                break;
            default:
                boolean zM76853 = c3130.m7685();
                C3130 c31302 = this.f18655.f12093;
                if (!zM76853) {
                    if (c3130.m7684() != null) {
                        c31302.m7692(c3130.m7684());
                        break;
                    }
                } else {
                    c31302.m7688(c3130.m7689());
                    break;
                }
                break;
        }
        return null;
    }
}
