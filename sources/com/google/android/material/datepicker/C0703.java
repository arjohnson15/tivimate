package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1375;
import p378.AbstractC4345;
import p378.C4393;

/* renamed from: com.google.android.material.datepicker.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0703 extends AbstractC1375 {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final MaterialCalendarGridView f3342;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final TextView f3343;

    public C0703(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id._2_res_0x7f0b0290);
        this.f3343 = textView;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        new C4393(R.id._2_res_0x7f0b0378, Boolean.class, 0, 28, 3).m4694(textView, Boolean.TRUE);
        this.f3342 = (MaterialCalendarGridView) linearLayout.findViewById(R.id._2_res_0x7f0b028b);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
