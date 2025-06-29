package p222;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: ˏᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2868 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f11127;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11128;

    public /* synthetic */ RunnableC2868(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f11128 = i;
        this.f11127 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11128) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11127;
                actionBarOverlayLayout.m126();
                actionBarOverlayLayout.f114 = actionBarOverlayLayout.f121.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f124);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11127;
                actionBarOverlayLayout2.m126();
                actionBarOverlayLayout2.f114 = actionBarOverlayLayout2.f121.animate().translationY(-actionBarOverlayLayout2.f121.getHeight()).setListener(actionBarOverlayLayout2.f124);
                break;
        }
    }
}
