package p385;

import ar.tvplayer.core.ui.view.DelayedProgressBar;
import p072.InterfaceC1643;
import p306.C3554;
import p362.C4125;
import p444.C5148;

/* renamed from: ᵢﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4478 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f17245;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17246;

    public /* synthetic */ RunnableC4478(int i, Object obj) {
        this.f17246 = i;
        this.f17245 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f17245;
        switch (this.f17246) {
            case 0:
                ((C4488) obj).mo10246(null);
                break;
            case 1:
                int i = DelayedProgressBar.f2280;
                ((DelayedProgressBar) obj).setVisibility(0);
                break;
            case 2:
                C5148 c5148 = (C5148) obj;
                c5148.getClass();
                ((C3554) c5148.f19680).m8436(new C4125(24, c5148));
                break;
            default:
                InterfaceC1643 interfaceC1643 = (InterfaceC1643) obj;
                if (interfaceC1643 != null) {
                    interfaceC1643.mo5172(null);
                    break;
                }
                break;
        }
    }
}
