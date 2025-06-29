package p291;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.transition.C0124;
import androidx.media3.decoder.ffmpeg.C0268;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ٴᐧ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3449 extends AbstractC3448 {
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static boolean m8301(Transition transition) {
        return (AbstractC3448.m8299(transition.getTargetIds()) && AbstractC3448.m8299(transition.getTargetNames()) && AbstractC3448.m8299(transition.getTargetTypes())) ? false : true;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ʽᐧ */
    public final void mo6044(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo6044(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m8301(transition) || !AbstractC3448.m8299(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ʿʼ */
    public final void mo6045(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p291.AbstractC3448
    /* renamed from: ʿˏ */
    public final void mo6046(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, Object obj, C0268 c0268, RunnableC3441 runnableC3441) {
        ((Transition) obj).addListener(new C0124(1, runnableC3441));
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m8302(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m8302(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m8301(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˉⁱ */
    public final boolean mo6047() {
        return Log.isLoggable("FragmentManager", 4) ? false : false;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˋⁱ */
    public final boolean mo6049(Object obj) {
        if (!Log.isLoggable("FragmentManager", 2)) {
            return false;
        }
        String str = "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.";
        return false;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˏᴵ */
    public final Object mo6051(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˏᵢ */
    public final Object mo6052(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˑי */
    public final void mo6054(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C3451(view, arrayList));
    }

    @Override // p291.AbstractC3448
    /* renamed from: יʻ */
    public final Object mo6055(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ـﹶ */
    public final void mo6056(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᐧʻ */
    public final boolean mo6057(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᴵʿ */
    public final Object mo6058(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᵎˏ */
    public final void mo6059(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC3448.m8298(view, rect);
            ((Transition) obj).setEpicenterCallback(new C3435(0, rect));
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᵎـ */
    public final void mo6060(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C3429(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﹳˎ */
    public final void mo6061(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C3435(1, rect));
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﾞʽ */
    public final void mo6065(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m8302(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﾞˊ */
    public final void mo6066(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3448.m8300(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo6044(transitionSet, arrayList);
    }
}
