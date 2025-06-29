package p293;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.HandlerC0413;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p062.AbstractC1445;
import p195.AbstractC2709;
import p200.C2752;
import p238.AbstractC3095;
import p305.C3524;
import p305.C3525;
import p319.C3636;
import p331.C3758;
import p417.C4750;
import p417.C4752;
import ﹶⁱ.ـﹶ;

/* renamed from: ٴᵎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3464 implements Handler.Callback {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static C3464 f13396;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C2752 f13400;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13401;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Context f13402;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final AtomicInteger f13403;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C4752 f13404;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public volatile boolean f13405;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final HandlerC0413 f13406;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final AtomicInteger f13407;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3636 f13408;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f13409;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final ConcurrentHashMap f13410;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3525 f13411;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3758 f13412;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C2752 f13413;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final Status f13399 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final Status f13397 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static final Object f13398 = new Object();

    public C3464(Context context, Looper looper) {
        C3525 c3525 = C3525.f13650;
        this.f13409 = 10000L;
        this.f13401 = false;
        this.f13403 = new AtomicInteger(1);
        this.f13407 = new AtomicInteger(0);
        this.f13410 = new ConcurrentHashMap(5, 0.75f, 1);
        this.f13413 = new C2752(0);
        this.f13400 = new C2752(0);
        this.f13405 = true;
        this.f13402 = context;
        HandlerC0413 handlerC0413 = new HandlerC0413(looper, this);
        Looper.getMainLooper();
        this.f13406 = handlerC0413;
        this.f13411 = c3525;
        this.f13412 = new C3758(18);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC3095.f11949 == null) {
            AbstractC3095.f11949 = Boolean.valueOf(AbstractC3095.m7610() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC3095.f11949.booleanValue()) {
            this.f13405 = false;
        }
        handlerC0413.sendMessage(handlerC0413.obtainMessage(6));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Status m8308(C3463 c3463, C3524 c3524) {
        return new Status(17, "API: " + ((String) c3463.f13393.f2913) + " is not available on this device. Connection failed with: " + String.valueOf(c3524), c3524.f13646, c3524);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C3464 m8309(Context context) {
        C3464 c3464;
        synchronized (f13398) {
            try {
                if (f13396 == null) {
                    Looper looper = C4750.m10673().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C3525.f13649;
                    f13396 = new C3464(applicationContext, looper);
                }
                c3464 = f13396;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3464;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p293.C3464.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3469 m8310(C3636 c3636) {
        ConcurrentHashMap concurrentHashMap = this.f13410;
        C3463 c3463 = c3636.f13885;
        C3469 c3469 = (C3469) concurrentHashMap.get(c3463);
        if (c3469 == null) {
            c3469 = new C3469(this, c3636);
            concurrentHashMap.put(c3463, c3469);
        }
        if (c3469.f13418.m9260()) {
            this.f13400.add(c3463);
        }
        c3469.m8318();
        return c3469;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m8311(C3524 c3524, int i) {
        C3525 c3525 = this.f13411;
        c3525.getClass();
        Context context = this.f13402;
        if (ـﹶ.ᐧⁱ(context)) {
            return false;
        }
        int i2 = c3524.f13645;
        PendingIntent activity = c3524.f13646;
        if (!((i2 == 0 || activity == null) ? false : true)) {
            activity = null;
            Intent intentM8427 = c3525.m8427(i2, context, null);
            if (intentM8427 != null) {
                activity = PendingIntent.getActivity(context, 0, intentM8427, AbstractC2709.f10607 | 134217728);
            }
        }
        if (activity == null) {
            return false;
        }
        int i3 = GoogleApiActivity.f2408;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        c3525.m8410(context, i2, PendingIntent.getActivity(context, 0, intent, AbstractC1445.f5915 | 134217728));
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8312(C3524 c3524, int i) {
        if (m8311(c3524, i)) {
            return;
        }
        HandlerC0413 handlerC0413 = this.f13406;
        handlerC0413.sendMessage(handlerC0413.obtainMessage(5, i, 0, c3524));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8313() {
        /*
            r5 = this;
            ﹳᴵ.ˉⁱ r0 = r5.f13404
            if (r0 == 0) goto L53
            int r1 = r0.f18237
            if (r1 > 0) goto L3a
            boolean r1 = r5.f13401
            if (r1 == 0) goto Ld
            goto L50
        Ld:
            java.lang.Class<ﹳᴵ.ˉי> r1 = ﹳᴵ.ˉי.class
            monitor-enter(r1)
            ﹳᴵ.ˉי r2 = ﹳᴵ.ˉי.ˆʿ     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            ﹳᴵ.ˉי r2 = new ﹳᴵ.ˉי     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            ﹳᴵ.ˉי.ˆʿ = r2     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L38
        L1f:
            ﹳᴵ.ˉי r2 = ﹳᴵ.ˉי.ˆʿ     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            r2.getClass()
            ᴵﹳ.ʿʼ r1 = r5.f13412
            java.lang.Object r1 = r1.f14519
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r2 = 203400000(0xc1fa340, float:1.2298041E-31)
            r3 = -1
            int r1 = r1.get(r2, r3)
            if (r1 == r3) goto L3a
            if (r1 != 0) goto L50
            goto L3a
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L3a:
            ᴵʽ.ˑʽ r1 = r5.f13408
            if (r1 != 0) goto L4b
            ᴵʽ.ˑʽ r1 = new ᴵʽ.ˑʽ
            ᵎﾞ.ʽᐧ r2 = p349.C3997.f15435
            android.content.Context r3 = r5.f13402
            com.google.android.gms.internal.measurement.ﹳﾞ r4 = p319.C3636.f13883
            r1.<init>(r3, r4, r2)
            r5.f13408 = r1
        L4b:
            ᴵʽ.ˑʽ r1 = r5.f13408
            r1.m8564(r0)
        L50:
            r0 = 0
            r5.f13404 = r0
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p293.C3464.m8313():void");
    }
}
