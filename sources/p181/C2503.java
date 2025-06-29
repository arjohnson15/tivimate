package p181;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.play_billing.AbstractC0597;
import com.google.android.gms.internal.play_billing.AbstractC0602;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0590;
import com.google.android.gms.internal.play_billing.C0611;
import com.google.android.gms.internal.play_billing.C0627;
import com.google.android.gms.internal.play_billing.C0649;
import com.google.android.gms.internal.play_billing.C0650;
import com.google.android.gms.internal.play_billing.C0675;
import com.google.android.gms.internal.play_billing.InterfaceC0600;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p007.C0937;
import p186.C2586;
import p331.C3767;
import p395.RunnableC4533;
import p456.CallableC5302;
import ᵔʼ.ˑʽ;

/* renamed from: ˋᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2503 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9934;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Context f9935;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean f9936;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f9937;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f9938;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public ExecutorService f9939;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f9940;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f9941;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f9942;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f9943;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public volatile ServiceConnectionC2505 f9944;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Handler f9945;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f9946;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public volatile int f9947;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3767 f9948;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public volatile InterfaceC0600 f9949;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f9950;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f9951;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f9952;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final ˑʽ f9953;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile C0937 f9954;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f9955;

    public C2503(ˑʽ r5, Context context, C2586 c2586) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "7.0.0";
        }
        this.f9947 = 0;
        this.f9945 = new Handler(Looper.getMainLooper());
        this.f9937 = 0;
        this.f9934 = str;
        this.f9935 = context.getApplicationContext();
        C0649 c0649M2665 = C0650.m2665();
        c0649M2665.m2578();
        C0650.m2663((C0650) c0649M2665.f2966, str);
        String packageName = this.f9935.getPackageName();
        c0649M2665.m2578();
        C0650.m2664((C0650) c0649M2665.f2966, packageName);
        C3767 c3767 = new C3767(this.f9935, (C0650) c0649M2665.m2577());
        this.f9948 = c3767;
        this.f9954 = new C0937(this.f9935, c2586, c3767);
        this.f9953 = r5;
        this.f9936 = false;
        this.f9935.getPackageName();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6616(String str, InterfaceC2515 interfaceC2515) {
        if (!m6620()) {
            C2510 c2510 = AbstractC2507.f9963;
            m6618(AbstractC2508.m6628(2, 9, c2510));
            C0627 c0627 = AbstractC0597.f2964;
            interfaceC2515.mo4334(c2510, C0675.f3093);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC0629.m2646("BillingClient", "Please provide a valid product type.");
            C2510 c25102 = AbstractC2507.f9973;
            m6618(AbstractC2508.m6628(50, 9, c25102));
            C0627 c06272 = AbstractC0597.f2964;
            interfaceC2515.mo4334(c25102, C0675.f3093);
            return;
        }
        if (m6622(new CallableC2509(this, str, interfaceC2515, 0), 30000L, new RunnableC4533(this, 22, interfaceC2515), m6623()) == null) {
            C2510 c2510M6621 = m6621();
            m6618(AbstractC2508.m6628(25, 9, c2510M6621));
            C0627 c06273 = AbstractC0597.f2964;
            interfaceC2515.mo4334(c2510M6621, C0675.f3093);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6617(C2510 c2510) {
        if (Thread.interrupted()) {
            return;
        }
        this.f9945.post(new RunnableC4533(this, 24, c2510));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6618(C0611 c0611) {
        C3767 c3767 = this.f9948;
        int i = this.f9937;
        c3767.getClass();
        try {
            C0650 c0650 = (C0650) c3767.f14557;
            AbstractC0602 abstractC0602 = (AbstractC0602) c0650.mo2555(5);
            if (!abstractC0602.f2967.equals(c0650)) {
                if (!abstractC0602.f2966.m2707()) {
                    abstractC0602.m2579();
                }
                AbstractC0602.m2576(abstractC0602.f2966, c0650);
            }
            C0649 c0649 = (C0649) abstractC0602;
            c0649.m2578();
            C0650.m2666((C0650) c0649.f2966, i);
            c3767.f14557 = (C0650) c0649.m2577();
            c3767.m8803(c0611);
        } catch (Throwable th) {
            AbstractC0629.m2647("BillingLogger", "Unable to log.", th);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6619(C0559 c0559, InterfaceC2504 interfaceC2504) {
        if (!m6620()) {
            C2510 c2510 = AbstractC2507.f9963;
            m6618(AbstractC2508.m6628(2, 8, c2510));
            interfaceC2504.mo4250(c2510, null);
            return;
        }
        String str = (String) c0559.f2912;
        ArrayList arrayList = (ArrayList) c0559.f2913;
        if (TextUtils.isEmpty(str)) {
            AbstractC0629.m2646("BillingClient", "Please fix the input params. SKU type can't be empty.");
            C2510 c25102 = AbstractC2507.f9972;
            m6618(AbstractC2508.m6628(49, 8, c25102));
            interfaceC2504.mo4250(c25102, null);
            return;
        }
        if (arrayList == null) {
            AbstractC0629.m2646("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            C2510 c25103 = AbstractC2507.f9961;
            m6618(AbstractC2508.m6628(48, 8, c25103));
            interfaceC2504.mo4250(c25103, null);
            return;
        }
        if (m6622(new CallableC5302(this, str, arrayList, interfaceC2504), 30000L, new RunnableC4533(this, 21, interfaceC2504), m6623()) == null) {
            C2510 c2510M6621 = m6621();
            m6618(AbstractC2508.m6628(25, 8, c2510M6621));
            interfaceC2504.mo4250(c2510M6621, null);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6620() {
        return (this.f9947 != 2 || this.f9949 == null || this.f9944 == null) ? false : true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2510 m6621() {
        return (this.f9947 == 0 || this.f9947 == 3) ? AbstractC2507.f9963 : AbstractC2507.f9962;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Future m6622(Callable callable, long j, Runnable runnable, Handler handler) {
        if (this.f9939 == null) {
            this.f9939 = Executors.newFixedThreadPool(AbstractC0629.f3002, new ThreadFactoryC2513());
        }
        try {
            Future futureSubmit = this.f9939.submit(callable);
            handler.postDelayed(new RunnableC4533(futureSubmit, 26, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            AbstractC0629.m2647("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Handler m6623() {
        return Looper.myLooper() == null ? this.f9945 : new Handler(Looper.myLooper());
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m6624(C0590 c0590) {
        C3767 c3767 = this.f9948;
        int i = this.f9937;
        c3767.getClass();
        try {
            C0650 c0650 = (C0650) c3767.f14557;
            AbstractC0602 abstractC0602 = (AbstractC0602) c0650.mo2555(5);
            if (!abstractC0602.f2967.equals(c0650)) {
                if (!abstractC0602.f2966.m2707()) {
                    abstractC0602.m2579();
                }
                AbstractC0602.m2576(abstractC0602.f2966, c0650);
            }
            C0649 c0649 = (C0649) abstractC0602;
            c0649.m2578();
            C0650.m2666((C0650) c0649.f2966, i);
            c3767.f14557 = (C0650) c0649.m2577();
            c3767.m8814(c0590);
        } catch (Throwable th) {
            AbstractC0629.m2647("BillingLogger", "Unable to log.", th);
        }
    }
}
