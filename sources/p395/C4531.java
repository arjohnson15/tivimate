package p395;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
import ˎˊ.ˏʾ;

/* renamed from: ⁱـ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4531 extends ˏʾ {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final Unsafe f17413;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final long f17414;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final long f17415;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final long f17416;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final long f17417;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final long f17418;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C4534());
            }
            try {
                f17417 = unsafe.objectFieldOffset(AbstractC4541.class.getDeclaredField("ˎˑ"));
                f17414 = unsafe.objectFieldOffset(AbstractC4541.class.getDeclaredField("ˆʿ"));
                f17415 = unsafe.objectFieldOffset(AbstractC4541.class.getDeclaredField("ᐧⁱ"));
                f17416 = unsafe.objectFieldOffset(C4532.class.getDeclaredField("ـﹶ"));
                f17418 = unsafe.objectFieldOffset(C4532.class.getDeclaredField("ʽᐧ"));
                f17413 = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10313(AbstractC4541 abstractC4541, Object obj, Object obj2) {
        return AbstractC4530.m10312(f17413, abstractC4541, f17415, obj, obj2);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C4532 m10314(AbstractC4541 abstractC4541) {
        C4532 c4532;
        C4532 c45322 = C4532.f17419;
        do {
            c4532 = abstractC4541.f17441;
            if (c45322 == c4532) {
                return c4532;
            }
        } while (!m10315(abstractC4541, c4532, c45322));
        return c4532;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m10315(AbstractC4541 abstractC4541, C4532 c4532, C4532 c45322) {
        return AbstractC4536.m10400(f17413, abstractC4541, f17417, c4532, c45322);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C4545 m10316(AbstractC4541 abstractC4541) {
        C4545 c4545;
        C4545 c45452 = C4545.f17445;
        do {
            c4545 = abstractC4541.f17440;
            if (c45452 == c4545) {
                return c4545;
            }
        } while (!m10319(abstractC4541, c4545, c45452));
        return c4545;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10317(C4532 c4532, C4532 c45322) {
        f17413.putObject(c4532, f17418, c45322);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m10318(C4532 c4532, Thread thread) {
        f17413.putObject(c4532, f17416, thread);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m10319(AbstractC4541 abstractC4541, C4545 c4545, C4545 c45452) {
        return AbstractC4546.m10417(f17413, abstractC4541, f17414, c4545, c45452);
    }
}
