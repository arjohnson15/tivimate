package p378;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ᵢٴ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4351 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ViewTreeObserver f16854;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Runnable f16855;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final View f16856;

    public ViewTreeObserverOnPreDrawListenerC4351(View view, Runnable runnable) {
        this.f16856 = view;
        this.f16854 = view.getViewTreeObserver();
        this.f16855 = runnable;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9908(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC4351 viewTreeObserverOnPreDrawListenerC4351 = new ViewTreeObserverOnPreDrawListenerC4351(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4351);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC4351);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f16854.isAlive();
        View view = this.f16856;
        if (zIsAlive) {
            this.f16854.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f16855.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16854 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f16854.isAlive();
        View view2 = this.f16856;
        if (zIsAlive) {
            this.f16854.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
