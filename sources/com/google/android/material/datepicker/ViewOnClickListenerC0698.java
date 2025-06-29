package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0698 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0684 f3326;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C0687 f3327;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f3328;

    public /* synthetic */ ViewOnClickListenerC0698(C0687 c0687, C0684 c0684, int i) {
        this.f3328 = i;
        this.f3327 = c0687;
        this.f3326 = c0684;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3328) {
            case 0:
                C0687 c0687 = this.f3327;
                int iM1264 = ((LinearLayoutManager) c0687.f3274.getLayoutManager()).m1264() - 1;
                if (iM1264 >= 0) {
                    Calendar calendarM2870 = AbstractC0696.m2870(this.f3326.f3267.f3258.f3339);
                    calendarM2870.add(2, iM1264);
                    c0687.m2858(new C0702(calendarM2870));
                    break;
                }
                break;
            default:
                C0687 c06872 = this.f3327;
                int iM1238 = ((LinearLayoutManager) c06872.f3274.getLayoutManager()).m1238() + 1;
                if (iM1238 < c06872.f3274.getAdapter().mo974()) {
                    Calendar calendarM28702 = AbstractC0696.m2870(this.f3326.f3267.f3258.f3339);
                    calendarM28702.add(2, iM1238);
                    c06872.m2858(new C0702(calendarM28702));
                    break;
                }
                break;
        }
    }
}
