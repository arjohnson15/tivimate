package p291;

import android.transition.Transition;
import androidx.fragment.app.AbstractC0106;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0091;

/* renamed from: ٴᐧ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3456 extends AbstractC0106 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f13380;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f13381;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f13382;

    public C3456(C0091 c0091, boolean z, boolean z2) {
        super(c0091);
        int i = c0091.f556;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0091.f555;
        this.f13380 = i == 2 ? z ? abstractComponentCallbacksC0100.getReenterTransition() : abstractComponentCallbacksC0100.getEnterTransition() : z ? abstractComponentCallbacksC0100.getReturnTransition() : abstractComponentCallbacksC0100.getExitTransition();
        this.f13381 = c0091.f556 == 2 ? z ? abstractComponentCallbacksC0100.getAllowReturnTransitionOverlap() : abstractComponentCallbacksC0100.getAllowEnterTransitionOverlap() : true;
        this.f13382 = z2 ? z ? abstractComponentCallbacksC0100.getSharedElementReturnTransition() : abstractComponentCallbacksC0100.getSharedElementEnterTransition() : null;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC3448 m8303() {
        Object obj = this.f13380;
        AbstractC3448 abstractC3448M8304 = m8304(obj);
        Object obj2 = this.f13382;
        AbstractC3448 abstractC3448M83042 = m8304(obj2);
        if (abstractC3448M8304 == null || abstractC3448M83042 == null || abstractC3448M8304 == abstractC3448M83042) {
            return abstractC3448M8304 == null ? abstractC3448M83042 : abstractC3448M8304;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f657.f555 + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC3448 m8304(Object obj) {
        if (obj == null) {
            return null;
        }
        C3449 c3449 = AbstractC3436.f13331;
        if (obj instanceof Transition) {
            return c3449;
        }
        AbstractC3448 abstractC3448 = AbstractC3436.f13330;
        if (abstractC3448 != null && abstractC3448.mo6057(obj)) {
            return abstractC3448;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f657.f555 + " is not a valid framework Transition or AndroidX Transition");
    }
}
