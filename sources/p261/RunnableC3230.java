package p261;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C0284;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0279;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import p014.C1060;
import p080.AbstractC1702;
import p082.C1707;
import p082.InterfaceC1706;
import p188.C2631;
import p260.C3222;
import p305.C3532;
import p314.C3598;
import p314.C3602;
import p314.InterfaceC3594;
import p314.InterfaceC3597;
import p329.AbstractC3737;
import p329.C3738;
import p331.C3762;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ـ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3230 implements InterfaceC3242, Runnable, Comparable, InterfaceC1706 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public long f12554;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public int f12555;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f12556;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public volatile InterfaceC3243 f12557;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3222 f12559;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f12560;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public volatile boolean f12561;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public InterfaceC3594 f12562;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C0284 f12563;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public Object f12564;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f12565;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C3246 f12567;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C3231 f12568;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f12569;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f12570;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public InterfaceC3594 f12571;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3532 f12572;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public EnumC0293 f12574;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public InterfaceC0270 f12575;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public Thread f12576;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public Object f12577;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f12578;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public C3598 f12580;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public volatile boolean f12581;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC3594 f12583;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C3234 f12584;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3237 f12573 = new C3237();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f12558 = new ArrayList();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1707 f12566 = new C1707();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3222 f12579 = new C3222(11, false);

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3250 f12582 = new C3250();

    public RunnableC3230(C3532 c3532, C3222 c3222) {
        this.f12572 = c3532;
        this.f12559 = c3222;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3230 runnableC3230 = (RunnableC3230) obj;
        int iOrdinal = this.f12574.ordinal() - runnableC3230.f12574.ordinal();
        return iOrdinal == 0 ? this.f12578 - runnableC3230.f12578 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0270 interfaceC0270 = this.f12575;
        try {
            try {
                if (this.f12581) {
                    m7964();
                    if (interfaceC0270 != null) {
                        interfaceC0270.mo1527();
                        return;
                    }
                    return;
                }
                m7975();
                if (interfaceC0270 != null) {
                    interfaceC0270.mo1527();
                }
            } catch (C3238 e) {
                throw e;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    String str = "DecodeJob threw unexpectedly, isCancelled: " + this.f12581 + ", stage: " + ᵎˏ.יʻ(this.f12570);
                }
                if (this.f12570 != 5) {
                    this.f12558.add(th);
                    m7964();
                }
                if (!this.f12581) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (interfaceC0270 != null) {
                interfaceC0270.mo1527();
            }
            throw th2;
        }
    }

    @Override // p261.InterfaceC3242
    /* renamed from: ʽᐧ */
    public final void mo7959(InterfaceC3594 interfaceC3594, Object obj, InterfaceC0270 interfaceC0270, int i, InterfaceC3594 interfaceC35942) {
        this.f12583 = interfaceC3594;
        this.f12564 = obj;
        this.f12575 = interfaceC0270;
        this.f12560 = i;
        this.f12562 = interfaceC35942;
        this.f12565 = interfaceC3594 != this.f12573.m7993().get(0);
        if (Thread.currentThread() != this.f12576) {
            m7969(3);
        } else {
            m7972();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC3251 m7963(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C3237 c3237 = this.f12573;
        C3232 c3232M7992 = c3237.m7992(cls);
        C3598 c3598 = this.f12580;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || c3237.f12622;
            C3602 c3602 = C2631.f10428;
            Boolean bool = (Boolean) c3598.m8502(c3602);
            if (bool == null || (bool.booleanValue() && !z)) {
                c3598 = new C3598();
                C3598 c35982 = this.f12580;
                C3738 c3738 = c3598.f13814;
                c3738.mo7017(c35982.f13814);
                c3738.put(c3602, Boolean.valueOf(z));
            }
        }
        C3598 c35983 = c3598;
        InterfaceC0279 interfaceC0279M1588 = this.f12563.m1555().m1588(obj);
        try {
            return c3232M7992.m7979(this.f12556, this.f12569, interfaceC0279M1588, new C1060(i, this), c35983);
        } finally {
            interfaceC0279M1588.mo1538();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m7964() {
        m7967();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f12558));
        C3246 c3246 = this.f12567;
        synchronized (c3246) {
            c3246.f12673 = glideException;
        }
        c3246.m8005();
        m7965();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m7965() {
        boolean zM8008;
        C3250 c3250 = this.f12582;
        synchronized (c3250) {
            c3250.f12700 = true;
            zM8008 = c3250.m8008();
        }
        if (zM8008) {
            m7974();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m7966() {
        boolean zM8008;
        C3250 c3250 = this.f12582;
        synchronized (c3250) {
            c3250.f12701 = true;
            zM8008 = c3250.m8008();
        }
        if (zM8008) {
            m7974();
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m7967() {
        this.f12566.m5423();
        if (this.f12561) {
            throw new IllegalStateException("Already notified", this.f12558.isEmpty() ? null : (Throwable) ˉᵎ.ﹶˆ(1, this.f12558));
        }
        this.f12561 = true;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7968() {
        boolean zM8008;
        C3250 c3250 = this.f12582;
        synchronized (c3250) {
            c3250.f12699 = true;
            zM8008 = c3250.m8008();
        }
        if (zM8008) {
            m7974();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m7969(int i) {
        this.f12555 = i;
        C3246 c3246 = this.f12567;
        (c3246.f12666 ? c3246.f12667 : c3246.f12662).execute(this);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int m7970(int i) {
        boolean z;
        boolean z2;
        int iM5411 = AbstractC1702.m5411(i);
        if (iM5411 == 0) {
            switch (this.f12568.f12588) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return m7970(2);
        }
        if (iM5411 != 1) {
            if (iM5411 == 2) {
                return 4;
            }
            if (iM5411 == 3 || iM5411 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(ᵎˏ.יʻ(i)));
        }
        switch (this.f12568.f12588) {
            case 0:
                z2 = false;
                break;
            case 1:
            default:
                z2 = true;
                break;
        }
        if (z2) {
            return 3;
        }
        return m7970(3);
    }

    @Override // p082.InterfaceC1706
    /* renamed from: ˑʽ */
    public final C1707 mo5422() {
        return this.f12566;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m7971() {
        this.f12576 = Thread.currentThread();
        int i = AbstractC3737.f14494;
        this.f12554 = SystemClock.elapsedRealtimeNanos();
        boolean zMo7962 = false;
        while (!this.f12581 && this.f12557 != null && !(zMo7962 = this.f12557.mo7962())) {
            this.f12570 = m7970(this.f12570);
            this.f12557 = m7973();
            if (this.f12570 == 4) {
                m7969(2);
                return;
            }
        }
        if ((this.f12570 == 6 || this.f12581) && !zMo7962) {
            m7964();
        }
    }

    @Override // p261.InterfaceC3242
    /* renamed from: ـﹶ */
    public final void mo7961(InterfaceC3594 interfaceC3594, Exception exc, InterfaceC0270 interfaceC0270, int i) {
        interfaceC0270.mo1527();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1533 = interfaceC0270.mo1533();
        glideException.f2330 = interfaceC3594;
        glideException.f2332 = i;
        glideException.f2333 = clsMo1533;
        this.f12558.add(glideException);
        if (Thread.currentThread() != this.f12576) {
            m7969(2);
        } else {
            m7971();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7972() {
        InterfaceC3251 interfaceC3251M7976;
        if (Log.isLoggable("DecodeJob", 2)) {
            m7977(this.f12554, "Retrieved data", "data: " + this.f12564 + ", cache key: " + this.f12583 + ", fetcher: " + this.f12575);
        }
        C3252 c3252 = null;
        try {
            interfaceC3251M7976 = m7976(this.f12575, this.f12564, this.f12560);
        } catch (GlideException e) {
            InterfaceC3594 interfaceC3594 = this.f12562;
            int i = this.f12560;
            e.f2330 = interfaceC3594;
            e.f2332 = i;
            e.f2333 = null;
            this.f12558.add(e);
            interfaceC3251M7976 = null;
        }
        if (interfaceC3251M7976 == null) {
            m7971();
            return;
        }
        int i2 = this.f12560;
        boolean z = this.f12565;
        if (interfaceC3251M7976 instanceof InterfaceC3228) {
            ((InterfaceC3228) interfaceC3251M7976).mo5003();
        }
        boolean z2 = true;
        if (((C3252) this.f12579.f12540) != null) {
            c3252 = (C3252) C3252.f12702.m7947();
            c3252.f12705 = false;
            c3252.f12704 = true;
            c3252.f12703 = interfaceC3251M7976;
            interfaceC3251M7976 = c3252;
        }
        m7967();
        C3246 c3246 = this.f12567;
        synchronized (c3246) {
            c3246.f12665 = interfaceC3251M7976;
            c3246.f12675 = i2;
            c3246.f12661 = z;
        }
        c3246.m8002();
        this.f12570 = 5;
        try {
            C3222 c3222 = this.f12579;
            if (((C3252) c3222.f12540) == null) {
                z2 = false;
            }
            if (z2) {
                C3532 c3532 = this.f12572;
                C3598 c3598 = this.f12580;
                c3222.getClass();
                try {
                    c3532.m8419().mo7038((InterfaceC3594) c3222.f12538, new C3762((InterfaceC3597) c3222.f12539, (C3252) c3222.f12540, c3598, 9));
                    ((C3252) c3222.f12540).m8010();
                } catch (Throwable th) {
                    ((C3252) c3222.f12540).m8010();
                    throw th;
                }
            }
            m7968();
        } finally {
            if (c3252 != null) {
                c3252.m8010();
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC3243 m7973() {
        int iM5411 = AbstractC1702.m5411(this.f12570);
        C3237 c3237 = this.f12573;
        if (iM5411 == 1) {
            return new C3240(c3237, this);
        }
        if (iM5411 == 2) {
            return new C3249(c3237.m7993(), c3237, this);
        }
        if (iM5411 == 3) {
            return new C3229(c3237, this);
        }
        if (iM5411 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(ᵎˏ.יʻ(this.f12570)));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m7974() {
        C3250 c3250 = this.f12582;
        synchronized (c3250) {
            c3250.f12699 = false;
            c3250.f12701 = false;
            c3250.f12700 = false;
        }
        C3222 c3222 = this.f12579;
        c3222.f12538 = null;
        c3222.f12539 = null;
        c3222.f12540 = null;
        C3237 c3237 = this.f12573;
        c3237.f12626 = null;
        c3237.f12633 = null;
        c3237.f12631 = null;
        c3237.f12630 = null;
        c3237.f12623 = null;
        c3237.f12634 = null;
        c3237.f12624 = null;
        c3237.f12619 = null;
        c3237.f12627 = null;
        c3237.f12628.clear();
        c3237.f12620 = false;
        c3237.f12617.clear();
        c3237.f12621 = false;
        this.f12561 = false;
        this.f12563 = null;
        this.f12571 = null;
        this.f12580 = null;
        this.f12574 = null;
        this.f12584 = null;
        this.f12567 = null;
        this.f12570 = 0;
        this.f12557 = null;
        this.f12576 = null;
        this.f12583 = null;
        this.f12564 = null;
        this.f12560 = 0;
        this.f12575 = null;
        this.f12554 = 0L;
        this.f12581 = false;
        this.f12558.clear();
        this.f12559.m7946(this);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m7975() {
        int iM5411 = AbstractC1702.m5411(this.f12555);
        if (iM5411 == 0) {
            this.f12570 = m7970(1);
            this.f12557 = m7973();
            m7971();
        } else if (iM5411 == 1) {
            m7971();
        } else if (iM5411 == 2) {
            m7972();
        } else {
            int i = this.f12555;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC3251 m7976(InterfaceC0270 interfaceC0270, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = AbstractC3737.f14494;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC3251 interfaceC3251M7963 = m7963(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m7977(jElapsedRealtimeNanos, "Decoded result " + interfaceC3251M7963, null);
            }
            return interfaceC3251M7963;
        } finally {
            interfaceC0270.mo1527();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7977(long j, String str, String str2) {
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " in ");
        sbM5409.append(AbstractC3737.m8704(j));
        sbM5409.append(", load key: ");
        sbM5409.append(this.f12584);
        sbM5409.append(str2 != null ? ", ".concat(str2) : "");
        sbM5409.append(", thread: ");
        sbM5409.append(Thread.currentThread().getName());
        sbM5409.toString();
    }
}
