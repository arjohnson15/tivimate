package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0696 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AtomicReference f3323 = new AtomicReference();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Calendar m2868() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Calendar m2869(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Calendar m2870(Calendar calendar) {
        Calendar calendarM2869 = m2869(calendar);
        Calendar calendarM28692 = m2869(null);
        calendarM28692.set(calendarM2869.get(1), calendarM2869.get(2), calendarM2869.get(5));
        return calendarM28692;
    }
}
