package p291;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ٴᐧ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3451 implements Transition.TransitionListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13367;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ View f13368;

    public C3451(View view, ArrayList arrayList) {
        this.f13368 = view;
        this.f13367 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f13368.setVisibility(8);
        ArrayList arrayList = this.f13367;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
