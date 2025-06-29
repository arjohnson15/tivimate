package com.google.android.material.datepicker;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import ـˈ.ˉᵎ;

/* renamed from: com.google.android.material.datepicker.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0683 extends BaseAdapter {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int f3261;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f3262;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f3263;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Calendar f3264;

    static {
        f3261 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0683() {
        Calendar calendarM2869 = AbstractC0696.m2869(null);
        this.f3264 = calendarM2869;
        this.f3262 = calendarM2869.getMaximum(7);
        this.f3263 = calendarM2869.getFirstDayOfWeek();
    }

    public C0683(int i) {
        Calendar calendarM2869 = AbstractC0696.m2869(null);
        this.f3264 = calendarM2869;
        this.f3262 = calendarM2869.getMaximum(7);
        this.f3263 = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3262;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f3262;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f3263;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) ˉᵎ.ᐧʻ(viewGroup, R.layout._2_res_0x7f0e00f6, viewGroup, false);
        }
        int i2 = i + this.f3263;
        int i3 = this.f3262;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f3264;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f3261, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string._2_res_0x7f130144), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
