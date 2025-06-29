package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.ﹳˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0549 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static volatile boolean f2898 = !m2471();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static UserManager f2899;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m2471() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
