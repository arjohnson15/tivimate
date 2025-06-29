package p009;

import android.view.View;
import android.view.ViewTreeObserver;
import p329.AbstractC3742;
import p395.RunnableC4533;

/* renamed from: ʻˋ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0999 implements ViewTreeObserver.OnDrawListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0982 f4349;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ View f4350;

    public ViewTreeObserverOnDrawListenerC0999(C0982 c0982, View view) {
        this.f4349 = c0982;
        this.f4350 = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC3742.m8714().post(new RunnableC4533(1, this, this, false));
    }
}
