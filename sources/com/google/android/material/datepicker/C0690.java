package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0690 extends BaseAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C0694 f3287;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0682 f3288;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0702 f3289;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int f3286 = AbstractC0696.m2869(null).getMaximum(4);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int f3285 = (AbstractC0696.m2869(null).getMaximum(7) + AbstractC0696.m2869(null).getMaximum(5)) - 1;

    public C0690(C0702 c0702, C0682 c0682) {
        this.f3289 = c0702;
        this.f3288 = c0682;
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3285;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f3289.f3338;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getContext()
            com.google.android.material.datepicker.ˑʽ r3 = r4.f3287
            if (r3 != 0) goto L11
            com.google.android.material.datepicker.ˑʽ r3 = new com.google.android.material.datepicker.ˑʽ
            r3.<init>(r2)
            r4.f3287 = r3
        L11:
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r6 != 0) goto L20
            r6 = 2131624181(0x7f0e00f5, float:1.8875534E38)
            android.view.View r6 = ـˈ.ˉᵎ.ᐧʻ(r7, r6, r7, r1)
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
        L20:
            int r6 = r4.m2862()
            int r6 = r5 - r6
            if (r6 < 0) goto L55
            com.google.android.material.datepicker.ᵎـ r7 = r4.f3289
            int r3 = r7.f3336
            if (r6 < r3) goto L2f
            goto L55
        L2f:
            int r6 = r6 + r0
            r2.setTag(r7)
            android.content.res.Resources r7 = r2.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r2.setText(r6)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L5d
        L55:
            r6 = 8
            r2.setVisibility(r6)
            r2.setEnabled(r1)
        L5d:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L64
            goto L66
        L64:
            if (r2 != 0) goto L67
        L66:
            return r2
        L67:
            r2.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.AbstractC0696.m2868()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C0690.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* renamed from: ʽᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m2862() || i > m2861()) {
            return null;
        }
        int iM2862 = (i - m2862()) + 1;
        Calendar calendarM2870 = AbstractC0696.m2870(this.f3289.f3339);
        calendarM2870.set(5, iM2862);
        return Long.valueOf(calendarM2870.getTimeInMillis());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m2861() {
        return (m2862() + this.f3289.f3336) - 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m2862() {
        int firstDayOfWeek = this.f3288.f3255;
        C0702 c0702 = this.f3289;
        Calendar calendar = c0702.f3339;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c0702.f3338 : i2;
    }
}
