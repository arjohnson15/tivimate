package p456;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0383;
import java.util.concurrent.atomic.AtomicInteger;
import p149.C2308;
import p238.C3097;
import p293.C3474;
import p417.AbstractC4753;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5236 implements InterfaceC5281 {

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static volatile C5236 f20091;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C5318 f20092;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public volatile boolean f20093;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f20094;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C5316 f20095;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public Boolean f20096;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f20097;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f20098;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f20099;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public long f20100;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C5323 f20101;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C5280 f20102;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public C5254 f20103;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final Boolean f20104;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f20105;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C5244 f20106;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C3097 f20107;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C5270 f20108;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final Boolean f20109;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C5301 f20110;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final long f20112;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f20113;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f20114;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C5247 f20115;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C5346 f20117;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final String f20118;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C5241 f20119;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3474 f20120;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C5328 f20121;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public volatile Boolean f20122;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5245 f20123;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C5272 f20124;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C5255 f20125;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f20116 = false;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final AtomicInteger f20111 = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        throw r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5236(p149.C2308 r12) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5236.<init>(ˊʾ.ﹳˑ):void");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m11644(ﹳﹳ r1) {
        if (r1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C5236 m11645(Context context, C0383 c0383, Long l) {
        Bundle bundle;
        if (c0383 != null && (c0383.f2651 == null || c0383.f2656 == null)) {
            c0383 = new C0383(c0383.f2655, c0383.f2650, c0383.f2653, c0383.f2654, null, null, c0383.f2657, null);
        }
        AbstractC4753.m10683(context);
        AbstractC4753.m10683(context.getApplicationContext());
        if (f20091 == null) {
            synchronized (C5236.class) {
                try {
                    if (f20091 == null) {
                        f20091 = new C5236(new C2308(context, c0383, l));
                    }
                } finally {
                }
            }
        } else if (c0383 != null && (bundle = c0383.f2657) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC4753.m10683(f20091);
            f20091.f20122 = Boolean.valueOf(c0383.f2657.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC4753.m10683(f20091);
        return f20091;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m11646(AbstractC5257 abstractC5257) {
        if (abstractC5257 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC5257.f20365) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC5257.getClass())));
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m11647(AbstractC5324 abstractC5324) {
        if (abstractC5324 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC5324.f20648) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC5324.getClass())));
        }
    }

    @Override // p456.InterfaceC5281
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5247 mo11648() {
        C5247 c5247 = this.f20115;
        m11647(c5247);
        return c5247;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11649() {
        /*
            r7 = this;
            boolean r0 = r7.f20116
            if (r0 == 0) goto Lb4
            ﾞⁱ.ʿˊ r0 = r7.f20115
            m11647(r0)
            r0.m11740()
            java.lang.Boolean r0 = r7.f20096
            ˑᐧ.ـﹶ r1 = r7.f20107
            if (r0 == 0) goto L34
            long r2 = r7.f20100
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.f20100
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f20100 = r0
            ﾞⁱ.ᴵˊ r0 = r7.f20095
            m11644(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.m11977(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.m11977(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r7.f20114
            ʻˋ.ᴵʿ r4 = p436.C5068.m11225(r1)
            boolean r4 = r4.m3957()
            if (r4 != 0) goto L74
            ﾞⁱ.ʿʼ r4 = r7.f20123
            boolean r4 = r4.m11735()
            if (r4 != 0) goto L74
            boolean r4 = p456.C5316.m11949(r1)
            if (r4 == 0) goto L76
            boolean r1 = p456.C5316.m11929(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = 1
            goto L77
        L76:
            r1 = 0
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r7.f20096 = r4
            if (r1 == 0) goto Lad
            ﾞⁱ.ˆᵔ r1 = r7.m11654()
            java.lang.String r1 = r1.m11754()
            ﾞⁱ.ˆᵔ r4 = r7.m11654()
            r4.m11757()
            java.lang.String r4 = r4.f20352
            boolean r0 = r0.m11980(r1, r4)
            if (r0 != 0) goto La7
            ﾞⁱ.ˆᵔ r0 = r7.m11654()
            r0.m11757()
            java.lang.String r0 = r0.f20352
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = 0
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.f20096 = r0
        Lad:
            java.lang.Boolean r0 = r7.f20096
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5236.m11649():boolean");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int m11650() {
        C5247 c5247 = this.f20115;
        m11647(c5247);
        c5247.m11740();
        Boolean boolM11725 = this.f20123.m11725("firebase_analytics_collection_deactivated");
        if (boolM11725 != null && boolM11725.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f20109;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C5247 c52472 = this.f20115;
        m11647(c52472);
        c52472.m11740();
        if (!this.f20093) {
            return 8;
        }
        C5280 c5280 = this.f20102;
        m11644(c5280);
        c5280.ʼᵎ();
        Boolean boolValueOf = c5280.m11856().contains("measurement_enabled") ? Boolean.valueOf(c5280.m11856().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolM117252 = this.f20123.m11725("firebase_analytics_collection_enabled");
        if (boolM117252 != null) {
            return boolM117252.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f20104;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f20122 == null || this.f20122.booleanValue()) ? 0 : 7;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C5241 m11651() {
        C5241 c5241 = this.f20119;
        if (c5241 != null) {
            return c5241;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C5272 m11652() {
        m11646(this.f20124);
        return this.f20124;
    }

    @Override // p456.InterfaceC5281
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C3097 mo11653() {
        return this.f20107;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C5254 m11654() {
        m11646(this.f20103);
        return this.f20103;
    }

    @Override // p456.InterfaceC5281
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5301 mo11655() {
        C5301 c5301 = this.f20110;
        m11647(c5301);
        return c5301;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C5346 m11656() {
        m11646(this.f20117);
        return this.f20117;
    }

    @Override // p456.InterfaceC5281
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context mo11657() {
        return this.f20114;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C5323 m11658() {
        m11647(this.f20101);
        return this.f20101;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m11659() {
        m11644(this.f20095);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C5270 m11660() {
        return this.f20108;
    }

    @Override // p456.InterfaceC5281
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3474 mo11661() {
        return this.f20120;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m11662() {
        return m11650() == 0;
    }
}
