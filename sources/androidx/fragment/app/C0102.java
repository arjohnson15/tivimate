package androidx.fragment.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p291.AbstractC3459;
import p291.AnimationAnimationListenerC3433;
import p291.RunnableC3452;
import p331.C3767;

/* renamed from: androidx.fragment.app.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0102 extends AbstractC3459 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0115 f593;

    public C0102(C0115 c0115) {
        this.f593 = c0115;
    }

    @Override // p291.AbstractC3459
    /* renamed from: ʽᐧ */
    public final void mo588(ViewGroup viewGroup) {
        C0115 c0115 = this.f593;
        C0091 c0091 = c0115.f657;
        View view = c0091.f555.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        c0115.f657.m602(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animation from operation " + c0091 + " has been cancelled.";
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ˑʽ */
    public final void mo590(ViewGroup viewGroup) throws Resources.NotFoundException {
        C0115 c0115 = this.f593;
        boolean zM708 = c0115.m708();
        C0091 c0091 = c0115.f657;
        if (zM708) {
            c0091.m602(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = c0091.f555.mView;
        C3767 c3767M738 = c0115.m738(context);
        if (c3767M738 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) c3767M738.f14557;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c0091.f556 != 1) {
            view.startAnimation(animation);
            c0091.m602(this);
            return;
        }
        viewGroup.startViewTransition(view);
        RunnableC3452 runnableC3452 = new RunnableC3452(animation, viewGroup, view);
        runnableC3452.setAnimationListener(new AnimationAnimationListenerC3433(c0091, viewGroup, view, this));
        view.startAnimation(runnableC3452);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animation from operation " + c0091 + " has started.";
        }
    }
}
