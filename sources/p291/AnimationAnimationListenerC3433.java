package p291;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0091;
import androidx.fragment.app.C0102;
import p141.RunnableC2187;

/* renamed from: ٴᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC3433 implements Animation.AnimationListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f13319;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ View f13320;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0091 f13321;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C0102 f13322;

    public AnimationAnimationListenerC3433(C0091 c0091, ViewGroup viewGroup, View view, C0102 c0102) {
        this.f13321 = c0091;
        this.f13319 = viewGroup;
        this.f13320 = view;
        this.f13322 = c0102;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.f13319;
        viewGroup.post(new RunnableC2187(viewGroup, this.f13320, this.f13322, 3));
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animation from operation " + this.f13321 + " has ended.";
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animation from operation " + this.f13321 + " has reached onAnimationStart.";
        }
    }
}
