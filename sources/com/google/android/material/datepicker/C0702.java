package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0702 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0702> CREATOR = new android.support.v4.media.ـﹶ(6);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f3335;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f3336;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f3337;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f3338;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Calendar f3339;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f3340;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public String f3341;

    public C0702(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2870 = AbstractC0696.m2870(calendar);
        this.f3339 = calendarM2870;
        this.f3335 = calendarM2870.get(2);
        this.f3337 = calendarM2870.get(1);
        this.f3338 = calendarM2870.getMaximum(7);
        this.f3336 = calendarM2870.getActualMaximum(5);
        this.f3340 = calendarM2870.getTimeInMillis();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C0702 m2872(long j) {
        Calendar calendarM2869 = AbstractC0696.m2869(null);
        calendarM2869.setTimeInMillis(j);
        return new C0702(calendarM2869);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0702 m2873(int i, int i2) {
        Calendar calendarM2869 = AbstractC0696.m2869(null);
        calendarM2869.set(1, i);
        calendarM2869.set(2, i2);
        return new C0702(calendarM2869);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3339.compareTo(((C0702) obj).f3339);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702)) {
            return false;
        }
        C0702 c0702 = (C0702) obj;
        return this.f3335 == c0702.f3335 && this.f3337 == c0702.f3337;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3335), Integer.valueOf(this.f3337)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3337);
        parcel.writeInt(this.f3335);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m2874(C0702 c0702) {
        if (!(this.f3339 instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0702.f3335 - this.f3335) + ((c0702.f3337 - this.f3337) * 12);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m2875() {
        String dateTime;
        if (this.f3341 == null) {
            long timeInMillis = this.f3339.getTimeInMillis();
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
            this.f3341 = dateTime;
        }
        return this.f3341;
    }
}
