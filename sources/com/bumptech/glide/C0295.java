package com.bumptech.glide;

import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0395;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p009.InterfaceC0991;
import p166.C2397;
import p166.C2431;
import p222.C2907;
import p278.AbstractC3362;
import p305.C3532;
import p329.InterfaceC3741;
import p369.C4194;
import p383.AbstractC4470;
import p393.C4521;
import p393.C4523;
import p417.AbstractC4753;
import p456.C5280;
import ʻˋ.ˎٴ;
import ˆˑ.ﹳﹳ;

/* renamed from: com.bumptech.glide.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0295 implements InterfaceC3741, InterfaceC0991 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f2402;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f2403;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f2404;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f2405;

    public C0295(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.f2402 = uri;
        this.f2403 = str;
        this.f2405 = str2;
        this.f2404 = z;
    }

    public C0295(C2907 c2907, boolean z) {
        this.f2405 = c2907;
        this.f2403 = new AtomicReference(null);
        this.f2404 = z;
        this.f2402 = new AtomicMarkableReference(new C4194(z ? 8192 : 1024), false);
    }

    public C0295(C4523 c4523, C4521 c4521) {
        this.f2405 = c4523;
        this.f2402 = c4521;
        this.f2403 = c4521.f17380 ? null : new boolean[c4523.f17402];
    }

    public C0295(C5280 c5280, String str) {
        this.f2405 = c5280;
        AbstractC4753.m10688(str);
        this.f2402 = str;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m1601(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    @Override // p329.InterfaceC3741
    public Object get() {
        if (this.f2404) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(ˈⁱ.ˉⁱ.ˎˑ("Glide registry"));
        this.f2404 = true;
        try {
            return ﹳﹳ.ᐧʻ((ComponentCallbacks2C0283) this.f2402, (List) this.f2403, (AbstractC3362) this.f2405);
        } finally {
            this.f2404 = false;
            Trace.endSection();
        }
    }

    @Override // p009.InterfaceC0991
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean mo1602() {
        C3532 c3532 = (C3532) this.f2403;
        this.f2404 = ((ConnectivityManager) c3532.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c3532.get()).registerDefaultNetworkCallback((ˎٴ) this.f2405);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
            }
            return false;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public String m1603() {
        if (!this.f2404) {
            this.f2404 = true;
            this.f2403 = ((C5280) this.f2405).m11856().getString((String) this.f2402, null);
        }
        return (String) this.f2403;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m1604(String str) {
        SharedPreferences.Editor editorEdit = ((C5280) this.f2405).m11856().edit();
        editorEdit.putString((String) this.f2402, str);
        editorEdit.apply();
        this.f2403 = str;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C0395 m1605(String str, String str2) {
        Object obj = C0395.f2665;
        return new C0395(this, str, str2, 2);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m1606() {
        C4523.m10290((C4523) this.f2405, this, false);
    }

    @Override // p009.InterfaceC0991
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo1607() {
        ((ConnectivityManager) ((C3532) this.f2403).get()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f2405);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public File m1608() {
        File file;
        synchronized (((C4523) this.f2405)) {
            try {
                C4521 c4521 = (C4521) this.f2402;
                if (c4521.f17383 != this) {
                    throw new IllegalStateException();
                }
                if (!c4521.f17380) {
                    ((boolean[]) this.f2403)[0] = true;
                }
                file = c4521.f17385[0];
                ((C4523) this.f2405).f17399.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C0395 m1609(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        Object obj = C0395.f2665;
        return new C0395(this, str, lValueOf, 1);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m1610(C2397 c2397, C2431 c2431) throws IllegalArgumentException {
        boolean zEquals = "audio/eac3-joc".equals(c2431.f9667);
        int i = c2431.f9662;
        if (zEquals && i == 16) {
            i = 12;
        }
        int iM10202 = AbstractC4470.m10202(i);
        if (iM10202 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM10202);
        int i2 = c2431.f9681;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.f2402).canBeSpatialized((AudioAttributes) c2397.m6485().ˆʿ, channelMask.build());
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C0395 m1611(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = C0395.f2665;
        return new C0395(this, str, boolValueOf, 0);
    }
}
