package p335;

import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.transition.FadeAndShortSlide;
import androidx.preference.DialogPreference;
import p149.AbstractC2282;
import ـˈ.ˉᵎ;

/* renamed from: ᵎʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3791 extends AbstractComponentCallbacksC0100 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public DialogPreference f14637;

    public C3791() {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388611);
        FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388613);
        setEnterTransition(fadeAndShortSlide2);
        setExitTransition(fadeAndShortSlide);
        setReenterTransition(fadeAndShortSlide);
        setReturnTransition(fadeAndShortSlide2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractComponentCallbacksC0100 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof AbstractC2282)) {
            throw new IllegalStateException(ˉᵎ.ᴵʿ("Target fragment ", targetFragment, " must implement TargetFragment interface"));
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final DialogPreference m8886() {
        if (this.f14637 == null) {
            this.f14637 = (DialogPreference) ((AbstractC2282) getTargetFragment()).m6301(getArguments().getString("key"));
        }
        return this.f14637;
    }
}
