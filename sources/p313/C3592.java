package p313;

import android.content.Context;
import android.preference.PreferenceManager;
import p115.C1831;
import p331.C3762;
import p433.C5029;

/* renamed from: ᐧᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3592 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f13811 = new Object();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1831 f13812;

    public C3592(C5029 c5029) {
        Context context = (Context) c5029.f19096;
        String str = (String) c5029.f19093;
        String str2 = (String) c5029.f19100;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f13812 = (C1831) c5029.f19095;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized C3762 m8501() {
        return this.f13812.m5570();
    }
}
