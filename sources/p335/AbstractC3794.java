package p335;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.transition.FadeAndShortSlide;
import androidx.preference.PreferenceScreen;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ᵎʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3794 extends AbstractC3793 {
    public AbstractC3794() {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388611);
        FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388613);
        setEnterTransition(fadeAndShortSlide2);
        setExitTransition(fadeAndShortSlide);
        setReenterTransition(fadeAndShortSlide);
        setReturnTransition(fadeAndShortSlide2);
    }

    @Override // p149.AbstractC2282, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = LayoutInflater.from(viewOnCreateView.getContext()).inflate(R.layout._2_res_0x7f0e00d4, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(R.id._2_res_0x7f0b025f)).addView(viewOnCreateView);
        return viewInflate;
    }

    @Override // p149.AbstractC2282, androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m8887(((PreferenceScreen) this.f9034.f9116).f1560);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public void m8887(CharSequence charSequence) {
        View view = getView();
        TextView textView = view == null ? null : (TextView) view.findViewById(R.id._2_res_0x7f0b0112);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
