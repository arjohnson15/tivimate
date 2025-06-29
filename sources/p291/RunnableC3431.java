package p291;

import androidx.fragment.app.AbstractComponentCallbacksC0100;

/* renamed from: ٴᐧ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3431 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f13313;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13314;

    public /* synthetic */ RunnableC3431(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, int i) {
        this.f13314 = i;
        this.f13313 = abstractComponentCallbacksC0100;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13314) {
            case 0:
                this.f13313.startPostponedEnterTransition();
                break;
            default:
                this.f13313.callStartTransitionListener(false);
                break;
        }
    }
}
