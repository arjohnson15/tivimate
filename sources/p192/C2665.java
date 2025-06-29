package p192;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.RunnableC0246;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p052.AbstractC1324;
import p052.C1319;
import p052.C1328;
import p052.C1329;
import p447.AbstractC5179;
import ˈˉ.ﹳﹳ;
import ˈי.ʾˈ;
import ˏʼ.ʽᐧ;

/* renamed from: ˎˉ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2665 implements InterfaceC2663 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1328 f10552;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Handler f10553;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public ʽᐧ f10554;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ﹳﹳ f10555;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f10556;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ThreadPoolExecutor f10557;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ThreadPoolExecutor f10558;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f10559;

    public C2665(Context context, C1328 c1328) {
        ﹳﹳ r0 = C2672.f10567;
        this.f10559 = new Object();
        ʾˈ.ʿʼ(context, "Context cannot be null");
        this.f10556 = context.getApplicationContext();
        this.f10552 = c1328;
        this.f10555 = r0;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6843() {
        synchronized (this.f10559) {
            try {
                this.f10554 = null;
                Handler handler = this.f10553;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f10553 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f10558;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f10557 = null;
                this.f10558 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6844() {
        synchronized (this.f10559) {
            try {
                if (this.f10554 == null) {
                    return;
                }
                if (this.f10557 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2667("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f10558 = threadPoolExecutor;
                    this.f10557 = threadPoolExecutor;
                }
                this.f10557.execute(new RunnableC0246(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p192.InterfaceC2663
    /* renamed from: ـﹶ */
    public final void mo3956(ʽᐧ r2) {
        synchronized (this.f10559) {
            this.f10554 = r2;
        }
        m6844();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1319 m6845() {
        try {
            ﹳﹳ r2 = this.f10555;
            Context context = this.f10556;
            C1328 c1328 = this.f10552;
            r2.getClass();
            Object[] objArr = {c1328};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C1329 c1329M4624 = AbstractC1324.m4624(context, DesugarCollections.unmodifiableList(arrayList));
            int i = c1329M4624.f5397;
            if (i != 0) {
                throw new RuntimeException(AbstractC5179.m11548(i, "fetchFonts failed (", ")"));
            }
            C1319[] c1319Arr = (C1319[]) c1329M4624.f5396.get(0);
            if (c1319Arr == null || c1319Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1319Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
