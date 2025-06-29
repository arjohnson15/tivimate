package p291;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0088;
import androidx.fragment.app.C0091;
import ـˈ.ˉᵎ;

/* renamed from: ٴᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3454 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ View f13375;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C0088 f13376;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13377;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f13378;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C0091 f13379;

    public C3454(ViewGroup viewGroup, View view, boolean z, C0091 c0091, C0088 c0088) {
        this.f13378 = viewGroup;
        this.f13375 = view;
        this.f13377 = z;
        this.f13379 = c0091;
        this.f13376 = c0088;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f13378;
        View view = this.f13375;
        viewGroup.endViewTransition(view);
        boolean z = this.f13377;
        C0091 c0091 = this.f13379;
        if (z) {
            ˉᵎ.ـﹶ(c0091.f556, view, viewGroup);
        }
        C0088 c0088 = this.f13376;
        c0088.f541.f657.m602(c0088);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animator from operation " + c0091 + " has ended.";
        }
    }
}
