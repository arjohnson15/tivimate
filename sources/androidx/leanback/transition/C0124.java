package androidx.leanback.transition;

import android.transition.Transition;
import androidx.leanback.widget.C0159;
import androidx.leanback.widget.ﾞᐧ;
import p291.RunnableC3441;

/* renamed from: androidx.leanback.transition.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0124 implements Transition.TransitionListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f752;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f753;

    public /* synthetic */ C0124(int i, Object obj) {
        this.f753 = i;
        this.f752 = obj;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m774(Transition transition) {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m775(Transition transition) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m776(Transition transition) {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m777(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        switch (this.f753) {
            case 0:
                ((ﾞᐧ) this.f752).getClass();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        switch (this.f753) {
            case 0:
                ((C0159) ((ﾞᐧ) this.f752).ˆʿ).f1106 = null;
                break;
            default:
                ((RunnableC3441) this.f752).run();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        switch (this.f753) {
            case 0:
                ((ﾞᐧ) this.f752).getClass();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        switch (this.f753) {
            case 0:
                ((ﾞᐧ) this.f752).getClass();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        switch (this.f753) {
            case 0:
                ((ﾞᐧ) this.f752).getClass();
                break;
        }
    }
}
