package p139;

import android.view.ViewGroup;
import p395.AbstractC4535;

/* renamed from: ˉˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2136 extends AbstractC2159 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f8390 = false;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ViewGroup f8391;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f8392;

    public /* synthetic */ C2136(ViewGroup viewGroup, int i) {
        this.f8392 = i;
        this.f8391 = viewGroup;
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ʽᐧ */
    public final void mo5988() {
        switch (this.f8392) {
            case 0:
                AbstractC4535.m10321(this.f8391, false);
                break;
            default:
                AbstractC4535.m10321(this.f8391, false);
                break;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ʿʼ */
    public final void mo5989() {
        switch (this.f8392) {
            case 0:
                AbstractC4535.m10321(this.f8391, true);
                break;
            default:
                AbstractC4535.m10321(this.f8391, true);
                break;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
        switch (this.f8392) {
            case 0:
                AbstractC4535.m10321(this.f8391, false);
                this.f8390 = true;
                break;
            default:
                AbstractC4535.m10321(this.f8391, false);
                this.f8390 = true;
                break;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        switch (this.f8392) {
            case 0:
                if (!this.f8390) {
                    AbstractC4535.m10321(this.f8391, false);
                }
                abstractC2160.mo6019(this);
                break;
            default:
                if (!this.f8390) {
                    AbstractC4535.m10321(this.f8391, false);
                }
                abstractC2160.mo6019(this);
                break;
        }
    }
}
