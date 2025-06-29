package p149;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import com.google.android.gms.internal.measurement.C0383;
import p417.AbstractC4753;

/* renamed from: ˊʾ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2308 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9109;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f9110;

    /* renamed from: ˉי, reason: contains not printable characters */
    public Object f9111;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f9112;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f9113;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f9114;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f9115;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Comparable f9116;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f9117;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f9118;

    public C2308(Context context) {
        this.f9113 = 0L;
        this.f9114 = context;
        this.f9109 = context.getPackageName() + "_preferences";
        this.f9110 = null;
    }

    public C2308(Context context, C0383 c0383, Long l) {
        this.f9117 = true;
        AbstractC4753.m10683(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC4753.m10683(applicationContext);
        this.f9114 = applicationContext;
        this.f9118 = l;
        if (c0383 != null) {
            this.f9112 = c0383;
            this.f9109 = c0383.f2656;
            this.f9110 = c0383.f2651;
            this.f9115 = c0383.f2654;
            this.f9117 = c0383.f2653;
            this.f9113 = c0383.f2650;
            this.f9111 = c0383.f2652;
            Bundle bundle = c0383.f2657;
            if (bundle != null) {
                this.f9116 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public SharedPreferences.Editor m6352() {
        if (!this.f9117) {
            return m6355().edit();
        }
        if (((SharedPreferences.Editor) this.f9115) == null) {
            this.f9115 = m6355().edit();
        }
        return (SharedPreferences.Editor) this.f9115;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long m6353() {
        long j;
        synchronized (this) {
            j = this.f9113;
            this.f9113 = 1 + j;
        }
        return j;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public PreferenceScreen m6354(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.m1188(this);
        return preferenceScreen;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public SharedPreferences m6355() {
        if (((SharedPreferences) this.f9110) == null) {
            this.f9110 = this.f9114.getSharedPreferences(this.f9109, 0);
        }
        return (SharedPreferences) this.f9110;
    }
}
