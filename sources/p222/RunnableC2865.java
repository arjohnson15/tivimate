package p222;

/* renamed from: ˏᴵ.ʼᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2865 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2959 f11125;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11126;

    public /* synthetic */ RunnableC2865(C2959 c2959, int i) {
        this.f11126 = i;
        this.f11125 = c2959;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11126) {
            case 0:
                C2882 c2882 = this.f11125.f11414;
                if (c2882 != null) {
                    c2882.setListSelectionHidden(true);
                    c2882.requestLayout();
                    break;
                }
                break;
            default:
                C2959 c2959 = this.f11125;
                C2882 c28822 = c2959.f11414;
                if (c28822 != null && c28822.isAttachedToWindow() && c2959.f11414.getCount() > c2959.f11414.getChildCount() && c2959.f11414.getChildCount() <= c2959.f11417) {
                    c2959.f11410.setInputMethodMode(2);
                    c2959.mo7326();
                    break;
                }
                break;
        }
    }
}
