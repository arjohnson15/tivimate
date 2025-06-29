package p261;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C0284;
import com.bumptech.glide.C0292;
import com.bumptech.glide.EnumC0293;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.HashMap;
import p080.AbstractC1702;
import p150.ExecutorC2314;
import p166.C2428;
import p260.C3222;
import p266.C3262;
import p305.C3532;
import p314.C3598;
import p314.InterfaceC3594;
import p329.AbstractC3737;
import p329.C3738;
import p329.C3744;
import p346.C3993;
import p368.C4179;
import p377.ExecutorServiceC4328;
import ˉˆ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ᵔᵔ.ٴˎ;

/* renamed from: ـ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3233 {

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final boolean f12592 = Log.isLoggable("Engine", 2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ٴˎ f12593;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2428 f12594;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3262 f12595;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4179 f12596;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0292 f12597;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3532 f12598;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ᐧʻ f12599;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ﹳﹳ f12600;

    public C3233(C4179 c4179, ᵢٴ r11, ExecutorServiceC4328 executorServiceC4328, ExecutorServiceC4328 executorServiceC43282, ExecutorServiceC4328 executorServiceC43283, ExecutorServiceC4328 executorServiceC43284) {
        this.f12596 = c4179;
        C3532 c3532 = new C3532(r11);
        this.f12598 = c3532;
        C3262 c3262 = new C3262(10);
        this.f12595 = c3262;
        synchronized (this) {
            synchronized (c3262) {
                c3262.f12725 = this;
            }
        }
        this.f12593 = new ٴˎ(29);
        this.f12597 = new C0292(2);
        this.f12600 = new ﹳﹳ(executorServiceC4328, executorServiceC43282, executorServiceC43283, executorServiceC43284, this, this);
        this.f12599 = new ᐧʻ(c3532);
        this.f12594 = new C2428(6);
        c4179.f16125 = this;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m7980(InterfaceC3251 interfaceC3251) {
        if (!(interfaceC3251 instanceof C3245)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3245) interfaceC3251).m7996();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m7981(String str, long j, C3234 c3234) {
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " in ");
        sbM5409.append(AbstractC3737.m8704(j));
        sbM5409.append("ms, key: ");
        sbM5409.append(c3234);
        sbM5409.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3245 m7982(C3234 c3234) {
        Object obj;
        C4179 c4179 = this.f12596;
        synchronized (c4179) {
            C3744 c3744 = (C3744) c4179.f14488.remove(c3234);
            if (c3744 == null) {
                obj = null;
            } else {
                c4179.f14487 -= c3744.f14506;
                obj = c3744.f14507;
            }
        }
        InterfaceC3251 interfaceC3251 = (InterfaceC3251) obj;
        C3245 c3245 = interfaceC3251 != null ? interfaceC3251 instanceof C3245 ? (C3245) interfaceC3251 : new C3245(interfaceC3251, true, true, c3234, this) : null;
        if (c3245 != null) {
            c3245.m7997();
            this.f12595.m8043(c3234, c3245);
        }
        return c3245;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m7983(C3246 c3246, C3234 c3234, C3245 c3245) {
        if (c3245 != null) {
            try {
                if (c3245.f12653) {
                    this.f12595.m8043(c3234, c3245);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0292 c0292 = this.f12597;
        c0292.getClass();
        c3246.getClass();
        HashMap map = c0292.f2385;
        if (c3246.equals(map.get(c3234))) {
            map.remove(c3234);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3262 m7984(C0284 c0284, Object obj, InterfaceC3594 interfaceC3594, int i, int i2, Class cls, Class cls2, EnumC0293 enumC0293, C3231 c3231, C3738 c3738, boolean z, boolean z2, C3598 c3598, boolean z3, boolean z4, C3993 c3993, ExecutorC2314 executorC2314, C3234 c3234, long j) {
        C3246 c3246 = (C3246) this.f12597.f2385.get(c3234);
        if (c3246 != null) {
            c3246.m8003(c3993, executorC2314);
            if (f12592) {
                m7981("Added to existing load", j, c3234);
            }
            return new C3262(this, c3993, c3246);
        }
        C3246 c32462 = (C3246) ((C3222) this.f12600.ﹳﹶ).m7947();
        synchronized (c32462) {
            c32462.f12678 = c3234;
            c32462.f12658 = z3;
            c32462.f12666 = z4;
        }
        ᐧʻ r15 = this.f12599;
        RunnableC3230 runnableC3230 = (RunnableC3230) ((C3222) r15.ᐧˋ).m7947();
        int i3 = r15.ˆʿ;
        r15.ˆʿ = i3 + 1;
        C3237 c3237 = runnableC3230.f12573;
        c3237.f12626 = c0284;
        c3237.f12633 = obj;
        c3237.f12631 = interfaceC3594;
        c3237.f12618 = i;
        c3237.f12629 = i2;
        c3237.f12627 = c3231;
        c3237.f12630 = cls;
        c3237.f12625 = runnableC3230.f12572;
        c3237.f12623 = cls2;
        c3237.f12624 = enumC0293;
        c3237.f12634 = c3598;
        c3237.f12619 = c3738;
        c3237.f12632 = z;
        c3237.f12622 = z2;
        runnableC3230.f12563 = c0284;
        runnableC3230.f12571 = interfaceC3594;
        runnableC3230.f12574 = enumC0293;
        runnableC3230.f12584 = c3234;
        runnableC3230.f12556 = i;
        runnableC3230.f12569 = i2;
        runnableC3230.f12568 = c3231;
        runnableC3230.f12580 = c3598;
        runnableC3230.f12567 = c32462;
        runnableC3230.f12578 = i3;
        runnableC3230.f12555 = 1;
        runnableC3230.f12577 = obj;
        C0292 c0292 = this.f12597;
        c0292.getClass();
        c0292.f2385.put(c3234, c32462);
        c32462.m8003(c3993, executorC2314);
        c32462.m8001(runnableC3230);
        if (f12592) {
            m7981("Started new load", j, c3234);
        }
        return new C3262(this, c3993, c32462);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3245 m7985(C3234 c3234, boolean z, long j) {
        C3245 c3245;
        if (!z) {
            return null;
        }
        C3262 c3262 = this.f12595;
        synchronized (c3262) {
            C3226 c3226 = (C3226) ((HashMap) c3262.f12726).get(c3234);
            if (c3226 == null) {
                c3245 = null;
            } else {
                c3245 = (C3245) c3226.get();
                if (c3245 == null) {
                    c3262.m8042(c3226);
                }
            }
        }
        if (c3245 != null) {
            c3245.m7997();
        }
        if (c3245 != null) {
            if (f12592) {
                m7981("Loaded resource from active resources", j, c3234);
            }
            return c3245;
        }
        C3245 c3245M7982 = m7982(c3234);
        if (c3245M7982 == null) {
            return null;
        }
        if (f12592) {
            m7981("Loaded resource from cache", j, c3234);
        }
        return c3245M7982;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3262 m7986(C0284 c0284, Object obj, InterfaceC3594 interfaceC3594, int i, int i2, Class cls, Class cls2, EnumC0293 enumC0293, C3231 c3231, C3738 c3738, boolean z, boolean z2, C3598 c3598, boolean z3, boolean z4, C3993 c3993, ExecutorC2314 executorC2314) {
        long jElapsedRealtimeNanos;
        if (f12592) {
            int i3 = AbstractC3737.f14494;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.f12593.getClass();
        C3234 c3234 = new C3234(obj, interfaceC3594, i, i2, c3738, cls, cls2, c3598);
        synchronized (this) {
            try {
                C3245 c3245M7985 = m7985(c3234, z3, j);
                if (c3245M7985 == null) {
                    return m7984(c0284, obj, interfaceC3594, i, i2, cls, cls2, enumC0293, c3231, c3738, z, z2, c3598, z3, z4, c3993, executorC2314, c3234, j);
                }
                c3993.m9251(c3245M7985, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7987(C3234 c3234, C3245 c3245) {
        C3262 c3262 = this.f12595;
        synchronized (c3262) {
            C3226 c3226 = (C3226) ((HashMap) c3262.f12726).remove(c3234);
            if (c3226 != null) {
                c3226.f12543 = null;
                c3226.clear();
            }
        }
        if (c3245.f12653) {
        } else {
            this.f12594.m6534(c3245, false);
        }
    }
}
