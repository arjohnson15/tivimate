package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.leanback.widget.ﾞᐧ;
import java.util.Calendar;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p061.C1398;
import ـˈ.ˉᵎ;

/* renamed from: com.google.android.material.datepicker.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0684 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ﾞᐧ f3265;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f3266;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0682 f3267;

    public C0684(ContextThemeWrapper contextThemeWrapper, C0682 c0682, ﾞᐧ r6) {
        C0702 c0702 = c0682.f3258;
        C0702 c07022 = c0682.f3257;
        if (c0702.f3339.compareTo(c07022.f3339) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c07022.f3339.compareTo(c0682.f3254.f3339) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f3266 = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f0703ba) * C0690.f3286) + (C0692.m2866(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f0703ba) : 0);
        this.f3267 = c0682;
        this.f3265 = r6;
        m4760(true);
    }

    @Override // p061.AbstractC1373
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long mo2854(int i) {
        Calendar calendarM2870 = AbstractC0696.m2870(this.f3267.f3258.f3339);
        calendarM2870.add(2, i);
        calendarM2870.set(5, 1);
        Calendar calendarM28702 = AbstractC0696.m2870(calendarM2870);
        calendarM28702.get(2);
        calendarM28702.get(1);
        calendarM28702.getMaximum(7);
        calendarM28702.getActualMaximum(5);
        calendarM28702.getTimeInMillis();
        return calendarM28702.getTimeInMillis();
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f3267.f3260;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        C0703 c0703 = (C0703) abstractC1375;
        C0682 c0682 = this.f3267;
        Calendar calendarM2870 = AbstractC0696.m2870(c0682.f3258.f3339);
        calendarM2870.add(2, i);
        C0702 c0702 = new C0702(calendarM2870);
        c0703.f3343.setText(c0702.m2875());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0703.f3342.findViewById(R.id._2_res_0x7f0b028b);
        if (materialCalendarGridView.m2853() == null || !c0702.equals(materialCalendarGridView.m2853().f3289)) {
            new C0690(c0702, c0682);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m2853().getClass();
        throw null;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) ˉᵎ.ᐧʻ(viewGroup, R.layout._2_res_0x7f0e00fa, viewGroup, false);
        if (!C0692.m2866(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0703(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C1398(-1, this.f3266));
        return new C0703(linearLayout, true);
    }
}
