package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p061.AbstractC1413;

/* renamed from: com.google.android.material.datepicker.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0691 extends AbstractC1413 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ MaterialButton f3290;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C0687 f3291;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0684 f3292;

    public C0691(C0687 c0687, C0684 c0684, MaterialButton materialButton) {
        this.f3291 = c0687;
        this.f3292 = c0684;
        this.f3290 = materialButton;
    }

    @Override // p061.AbstractC1413
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo2863(RecyclerView recyclerView, int i, int i2) {
        String dateTime;
        C0687 c0687 = this.f3291;
        int iM1238 = i < 0 ? ((LinearLayoutManager) c0687.f3274.getLayoutManager()).m1238() : ((LinearLayoutManager) c0687.f3274.getLayoutManager()).m1264();
        C0682 c0682 = this.f3292.f3267;
        Calendar calendarM2870 = AbstractC0696.m2870(c0682.f3258.f3339);
        calendarM2870.add(2, iM1238);
        c0687.f3277 = new C0702(calendarM2870);
        Calendar calendarM28702 = AbstractC0696.m2870(c0682.f3258.f3339);
        calendarM28702.add(2, iM1238);
        calendarM28702.set(5, 1);
        Calendar calendarM28703 = AbstractC0696.m2870(calendarM28702);
        calendarM28703.get(2);
        calendarM28703.get(1);
        calendarM28703.getMaximum(7);
        calendarM28703.getActualMaximum(5);
        calendarM28703.getTimeInMillis();
        long timeInMillis = calendarM28703.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0696.f3323;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f3290.setText(dateTime);
    }

    @Override // p061.AbstractC1413
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo2864(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3290.getText());
        }
    }
}
