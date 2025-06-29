package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p226.C3026;
import p291.AbstractC3459;
import p291.C3415;
import p291.C3440;
import p291.C3454;
import p331.C3767;

/* renamed from: androidx.fragment.app.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0088 extends AbstractC3459 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0115 f541;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public AnimatorSet f542;

    public C0088(C0115 c0115) {
        this.f541 = c0115;
    }

    @Override // p291.AbstractC3459
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo588(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.f542;
        C0091 c0091 = this.f541.f657;
        if (animatorSet == null) {
            c0091.m602(this);
            return;
        }
        if (!c0091.f558) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3440.f13336.m8295(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(c0091);
            sb.append(" has been canceled");
            sb.append(c0091.f558 ? " with seeking." : ".");
            sb.append(' ');
            sb.toString();
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo589(ViewGroup viewGroup) throws Resources.NotFoundException {
        C0115 c0115 = this.f541;
        if (c0115.m708()) {
            return;
        }
        C3767 c3767M738 = c0115.m738(viewGroup.getContext());
        this.f542 = c3767M738 != null ? (AnimatorSet) c3767M738.f14558 : null;
        C0091 c0091 = c0115.f657;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0091.f555;
        boolean z = c0091.f556 == 3;
        View view = abstractComponentCallbacksC0100.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f542;
        if (animatorSet != null) {
            animatorSet.addListener(new C3454(viewGroup, view, z, c0091, this));
        }
        AnimatorSet animatorSet2 = this.f542;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo590(ViewGroup viewGroup) {
        C0091 c0091 = this.f541.f657;
        AnimatorSet animatorSet = this.f542;
        if (animatorSet == null) {
            c0091.m602(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Animator from operation " + c0091 + " has started.";
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo591(C3026 c3026) {
        C0115 c0115 = this.f541;
        AnimatorSet animatorSet = this.f542;
        C0091 c0091 = c0115.f657;
        if (animatorSet == null) {
            c0091.m602(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c0091.f555.mTransitioning) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Adding BackProgressCallbacks for Animators to operation " + c0091;
        }
        long jM8288 = C3415.f13287.m8288(animatorSet);
        long j = (long) (c3026.f11701 * jM8288);
        if (j == 0) {
            j = 1;
        }
        if (j == jM8288) {
            j = jM8288 - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str2 = "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + c0091;
        }
        C3440.f13336.m8294(animatorSet, j);
    }
}
