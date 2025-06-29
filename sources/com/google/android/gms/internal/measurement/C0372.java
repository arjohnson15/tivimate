package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p009.C0996;
import p015.C1067;
import p036.C1255;
import p166.C2397;
import p337.C3818;
import p337.C3827;
import p337.C3835;
import p337.C3839;
import p337.C3847;
import p337.C3848;
import p383.AbstractC4470;

/* renamed from: com.google.android.gms.internal.measurement.ˉʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0372 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f2629;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f2630;

    /* renamed from: ˉי, reason: contains not printable characters */
    public Object f2631;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f2632;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f2633;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f2634;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f2635;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f2636;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f2637;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f2638;

    public C0372() {
        this.f2629 = new AtomicBoolean();
        this.f2633 = null;
        this.f2637 = new HashMap(16, 1.0f);
        this.f2630 = new HashMap(16, 1.0f);
        this.f2635 = new HashMap(16, 1.0f);
        this.f2636 = new HashMap(16, 1.0f);
        this.f2632 = null;
        this.f2634 = false;
        this.f2638 = new String[0];
        this.f2631 = new C0553(3);
    }

    public C0372(Context context, C1067 c1067, C2397 c2397, C3818 c3818) {
        Context applicationContext = context.getApplicationContext();
        this.f2629 = applicationContext;
        this.f2633 = c1067;
        this.f2631 = c2397;
        this.f2638 = c3818;
        int i = AbstractC4470.f17202;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f2637 = handler;
        int i2 = AbstractC4470.f17202;
        this.f2630 = i2 >= 23 ? new C3827(this) : null;
        this.f2635 = i2 >= 21 ? new C0996(4, this) : null;
        C3835 c3835 = C3835.f14733;
        String str = AbstractC4470.f17200;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f2636 = uriFor != null ? new C3848(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m2082(AudioDeviceInfo audioDeviceInfo) {
        C3818 c3818 = (C3818) this.f2638;
        if (AbstractC4470.m10194(audioDeviceInfo, c3818 == null ? null : c3818.f14697)) {
            return;
        }
        C3818 c38182 = audioDeviceInfo != null ? new C3818(audioDeviceInfo) : null;
        this.f2638 = c38182;
        m2083(C3835.m8980((Context) this.f2629, (C2397) this.f2631, c38182));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m2083(C3835 c3835) {
        C1255 c1255;
        if (!this.f2634 || c3835.equals((C3835) this.f2632)) {
            return;
        }
        this.f2632 = c3835;
        C3847 c3847 = (C3847) ((C1067) this.f2633).f4608;
        c3847.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c3847.f14836;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        if (c3835.equals(c3847.f14858)) {
            return;
        }
        c3847.f14858 = c3835;
        ˊﹶ.ˋˉ r5 = c3847.f14844;
        if (r5 != null) {
            switch (r5.ᐧⁱ) {
                case 24:
                    return;
                default:
                    C3839 c3839 = (C3839) r5.ˆʿ;
                    synchronized (c3839.f19485) {
                        c1255 = c3839.f19487;
                    }
                    if (c1255 != null) {
                        c1255.m4486();
                        return;
                    }
                    return;
            }
        }
    }
}
