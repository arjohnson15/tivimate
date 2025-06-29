package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import ـˈ.ˉᵎ;

/* renamed from: com.google.android.material.datepicker.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0685 extends AbstractC1373 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0687 f3268;

    public C0685(C0687 c0687) {
        this.f3268 = c0687;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f3268.f3275.f3259;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        C0687 c0687 = this.f3268;
        int i2 = c0687.f3275.f3258.f3337 + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C0704) abstractC1375).f3344;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0696.m2868().get(1) == i2 ? String.format(context.getString(R.string._2_res_0x7f13014a), Integer.valueOf(i2)) : String.format(context.getString(R.string._2_res_0x7f13014b), Integer.valueOf(i2)));
        C0694 c0694 = c0687.f3279;
        if (AbstractC0696.m2868().get(1) == i2) {
            ﹳᴵ.ˉי r7 = c0694.f3319;
        } else {
            ﹳᴵ.ˉי r72 = c0694.f3320;
        }
        throw null;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        return new C0704((TextView) ˉᵎ.ᐧʻ(viewGroup, R.layout._2_res_0x7f0e00fe, viewGroup, false));
    }
}
