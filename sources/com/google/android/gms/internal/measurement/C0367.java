package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p238.C3097;
import p417.AbstractC4753;
import p456.AbstractC5310;

/* renamed from: com.google.android.gms.internal.measurement.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0367 {

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static volatile C0367 f2614;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList f2616;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public volatile InterfaceC0516 f2617;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ExecutorService f2618;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f2620;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f2621;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ˏᵢ.ᵢٴ f2622;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2619 = "FA";

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3097 f2615 = C3097.f11953;

    public C0367(Context context, Bundle bundle) throws Resources.NotFoundException, ClassNotFoundException {
        int i = 0;
        ThreadFactoryC0414 threadFactoryC0414 = new ThreadFactoryC0414();
        threadFactoryC0414.f2706 = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC0414);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2618 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f2622 = new ˏᵢ.ᵢٴ(9, this);
        this.f2616 = new ArrayList();
        try {
            String strM11921 = AbstractC5310.m11921(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strM11921)) {
                strM11921 = AbstractC5310.m11921(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strM11921);
            String string = null;
            if (identifier != 0) {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0367.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f2621 = true;
                    String str = this.f2619;
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        m2048(new C0471(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            String str2 = this.f2619;
        } else {
            application.registerActivityLifecycleCallbacks(new C0443(this));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0367 m2047(Context context, Bundle bundle) {
        AbstractC4753.m10683(context);
        if (f2614 == null) {
            synchronized (C0367.class) {
                try {
                    if (f2614 == null) {
                        f2614 = new C0367(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f2614;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2048(AbstractRunnableC0408 abstractRunnableC0408) {
        this.f2618.execute(abstractRunnableC0408);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2049(Exception exc, boolean z, boolean z2) {
        this.f2621 |= z;
        String str = this.f2619;
        if (z) {
            return;
        }
        if (z2) {
            m2048(new C0508(this, exc));
        }
    }
}
