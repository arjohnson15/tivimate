package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007.C0946;
import p009.C0985;
import p137.C2106;
import p137.C2107;
import p137.InterfaceC2105;
import p200.C2741;
import p261.C3233;
import p278.AbstractC3362;
import p329.AbstractC3740;
import p329.AbstractC3742;
import p368.C4179;
import p368.C4181;
import p377.ExecutorServiceC4328;
import p377.ThreadFactoryC4325;
import p377.ThreadFactoryC4327;
import ˈˉ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ᵔʼ.ˑʽ;

/* renamed from: com.bumptech.glide.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0283 implements ComponentCallbacks2 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C0283 f2335;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static volatile boolean f2336;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2105 f2337;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2106 f2338;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ArrayList f2339 = new ArrayList();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4179 f2340;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0284 f2341;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3233 f2342;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0985 f2343;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ˑʽ f2344;

    public ComponentCallbacks2C0283(Context context, C3233 c3233, C4179 c4179, InterfaceC2105 interfaceC2105, C2106 c2106, C0985 c0985, ˑʽ r21, int i, ˑʽ r23, C2741 c2741, List list, List list2, AbstractC3362 abstractC3362, ʾי.ˑʽ r28) {
        this.f2342 = c3233;
        this.f2337 = interfaceC2105;
        this.f2338 = c2106;
        this.f2340 = c4179;
        this.f2343 = c0985;
        this.f2344 = r21;
        C0295 c0295 = new C0295();
        c0295.f2402 = this;
        c0295.f2403 = list2;
        c0295.f2405 = abstractC3362;
        this.f2341 = new C0284(context, c2106, c0295, new ﹳﹳ(29), r23, c2741, list, c3233, r28, i);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ComponentCallbacks2C0283 m1550(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2335 == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (ComponentCallbacks2C0283.class) {
                if (f2335 == null) {
                    if (f2336) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f2336 = true;
                    try {
                        m1552(context, generatedAppGlideModule);
                        f2336 = false;
                    } catch (Throwable th) {
                        f2336 = false;
                        throw th;
                    }
                }
            }
        }
        return f2335;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static ComponentCallbacks2C0294 m1551(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        Context context = abstractComponentCallbacksC0100.getContext();
        AbstractC3740.m8706(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C0985 c0985 = m1550(context).f2343;
        c0985.getClass();
        AbstractC3740.m8706(abstractComponentCallbacksC0100.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = AbstractC3742.f14503;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c0985.m3951(abstractComponentCallbacksC0100.getContext().getApplicationContext());
        }
        if (abstractComponentCallbacksC0100.getActivity() != null) {
            c0985.f4333.mo3948(abstractComponentCallbacksC0100.getActivity());
        }
        AbstractC0104 childFragmentManager = abstractComponentCallbacksC0100.getChildFragmentManager();
        Context context2 = abstractComponentCallbacksC0100.getContext();
        return c0985.f4334.m8751(context2, m1550(context2.getApplicationContext()), abstractComponentCallbacksC0100.getLifecycle(), childFragmentManager, abstractComponentCallbacksC0100.isVisible());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m1552(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        List list;
        C2741 c2741 = new C2741(0);
        C0292 c0292 = new C0292(0);
        ˑʽ r10 = new ˑʽ();
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            if (Log.isLoggable("ManifestParser", 3)) {
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        String str = "Got app info metadata: " + applicationInfo.metaData;
                    }
                    for (String str2 : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                            arrayList.add(ᴵﹳ.ٴˎ.ˉⁱ(str2));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                String str3 = "Loaded Glide module: " + str2;
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                }
            }
            list = arrayList;
        } else {
            list = listEmptyList;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                if (hashSet.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        String str4 = "AppGlideModule excludes manifest GlideModule: " + okHttpGlideModule;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str5 = "Discovered GlideModule from manifest: " + ((OkHttpGlideModule) it2.next()).getClass();
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((OkHttpGlideModule) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo1524();
        }
        ThreadFactoryC4327 threadFactoryC4327 = new ThreadFactoryC4327();
        if (ExecutorServiceC4328.f16807 == 0) {
            ExecutorServiceC4328.f16807 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC4328.f16807;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ExecutorServiceC4328 executorServiceC4328 = new ExecutorServiceC4328(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC4325(threadFactoryC4327, "source", false)));
        int i2 = ExecutorServiceC4328.f16807;
        ThreadFactoryC4327 threadFactoryC43272 = new ThreadFactoryC4327();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC4328 executorServiceC43282 = new ExecutorServiceC4328(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC4325(threadFactoryC43272, "disk-cache", true)));
        if (ExecutorServiceC4328.f16807 == 0) {
            ExecutorServiceC4328.f16807 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = ExecutorServiceC4328.f16807 >= 4 ? 2 : 1;
        ThreadFactoryC4327 threadFactoryC43273 = new ThreadFactoryC4327();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC4328 executorServiceC43283 = new ExecutorServiceC4328(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC4325(threadFactoryC43273, "animation", true)));
        C4181 c4181 = new C4181(applicationContext);
        C0946 c0946 = new C0946();
        Context context2 = c4181.f16129;
        ActivityManager activityManager = c4181.f16127;
        int i4 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c0946.f4157 = i4;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c4181.f16128.ˆʿ;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = c4181.f16130;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        List list2 = list;
        int i5 = iRound - i4;
        int i6 = iRound3 + iRound2;
        if (i6 <= i5) {
            c0946.f4156 = iRound3;
            c0946.f4158 = iRound2;
        } else {
            float f3 = i5 / (f2 + 2.0f);
            c0946.f4156 = Math.round(2.0f * f3);
            c0946.f4158 = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context2, c0946.f4156));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c0946.f4158));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i4));
            sb.append(", memory class limited? ");
            sb.append(i6 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            sb.toString();
        }
        ˑʽ r8 = new ˑʽ();
        int i7 = c0946.f4158;
        C2107 c2107 = i7 > 0 ? new C2107(i7) : new ﹳᴵ.ˉי(17);
        C2106 c2106 = new C2106(c0946.f4157);
        C4179 c4179 = new C4179(c0946.f4156);
        ComponentCallbacks2C0283 componentCallbacks2C0283 = new ComponentCallbacks2C0283(applicationContext, new C3233(c4179, new ᵢٴ(applicationContext), executorServiceC43282, executorServiceC4328, new ExecutorServiceC4328(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC4328.f16806, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC4325(new ThreadFactoryC4327(), "source-unlimited", false))), executorServiceC43283), c4179, c2107, c2106, new C0985(), r8, 4, r10, c2741, Collections.emptyList(), list2, generatedAppGlideModule, new ʾי.ˑʽ(c0292));
        applicationContext.registerComponentCallbacks(componentCallbacks2C0283);
        f2335 = componentCallbacks2C0283;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m1553();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        AbstractC3742.m8713();
        synchronized (this.f2339) {
            try {
                Iterator it = this.f2339.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C0294) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2340.m9592(i);
        this.f2337.mo5963(i);
        this.f2338.m5972(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1553() {
        AbstractC3742.m8713();
        this.f2340.m8699(0L);
        this.f2337.mo5959();
        this.f2338.m5968();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m1554(ComponentCallbacks2C0294 componentCallbacks2C0294) {
        synchronized (this.f2339) {
            try {
                if (!this.f2339.contains(componentCallbacks2C0294)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f2339.remove(componentCallbacks2C0294);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
