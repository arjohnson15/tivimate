package p291;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: ٴᐧ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3429 implements Transition.TransitionListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13307;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C3449 f13308;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f13309;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f13310;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13311;

    public C3429(C3449 c3449, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f13308 = c3449;
        this.f13310 = obj;
        this.f13307 = arrayList;
        this.f13309 = obj2;
        this.f13311 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C3449 c3449 = this.f13308;
        Object obj = this.f13310;
        if (obj != null) {
            c3449.m8302(obj, this.f13307, null);
        }
        Object obj2 = this.f13309;
        if (obj2 != null) {
            c3449.m8302(obj2, this.f13311, null);
        }
    }
}
