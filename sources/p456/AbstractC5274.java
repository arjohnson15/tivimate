package p456;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC0413;
import p251.RunnableC3129;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5274 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static volatile HandlerC0413 f20448;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final RunnableC3129 f20449;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile long f20450;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC5281 f20451;

    public AbstractC5274(InterfaceC5281 interfaceC5281) {
        AbstractC4753.m10683(interfaceC5281);
        this.f20451 = interfaceC5281;
        this.f20449 = new RunnableC3129(this, 25, interfaceC5281);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11843(long j) {
        m11844();
        if (j >= 0) {
            this.f20451.mo11653().getClass();
            this.f20450 = System.currentTimeMillis();
            if (m11845().postDelayed(this.f20449, j)) {
                return;
            }
            this.f20451.mo11655().f20571.m4531(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* renamed from: ˑʽ */
    public abstract void mo11643();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11844() {
        this.f20450 = 0L;
        m11845().removeCallbacks(this.f20449);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Handler m11845() {
        HandlerC0413 handlerC0413;
        if (f20448 != null) {
            return f20448;
        }
        synchronized (AbstractC5274.class) {
            try {
                if (f20448 == null) {
                    f20448 = new HandlerC0413(this.f20451.mo11657().getMainLooper(), 0);
                }
                handlerC0413 = f20448;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC0413;
    }
}
