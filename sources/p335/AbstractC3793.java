package p335;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2282;
import p149.C2285;

/* renamed from: ᵎʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3793 extends AbstractC2282 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public ContextThemeWrapper f14641;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final Context getContext() {
        if (this.f14641 == null && getActivity() != null) {
            TypedValue typedValue = new TypedValue();
            getActivity().getTheme().resolveAttribute(R.attr._2_res_0x7f0404a4, typedValue, true);
            int i = typedValue.resourceId;
            if (i == 0) {
                i = R.style._2_res_0x7f14019b;
            }
            this.f14641 = new ContextThemeWrapper(super.getContext(), i);
        }
        return this.f14641;
    }

    @Override // p149.AbstractC2282
    /* renamed from: ᵔٴ */
    public final AbstractComponentCallbacksC0100 mo6307() {
        return getParentFragment();
    }

    @Override // p149.AbstractC2282
    /* renamed from: ﾞˎ */
    public final RecyclerView mo6308(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) layoutInflater.inflate(R.layout._2_res_0x7f0e00d9, viewGroup, false);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.setAccessibilityDelegateCompat(new C2285(verticalGridView));
        return verticalGridView;
    }
}
