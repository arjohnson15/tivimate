package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0089 implements View.OnAttachStateChangeListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0095 f543;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C0109 f544;

    public ViewOnAttachStateChangeListenerC0089(LayoutInflaterFactory2C0095 layoutInflaterFactory2C0095, C0109 c0109) {
        this.f543 = layoutInflaterFactory2C0095;
        this.f544 = c0109;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0109 c0109 = this.f544;
        c0109.m719();
        C0101.m616((ViewGroup) c0109.f677.mView.getParent(), this.f543.f578).m628();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
