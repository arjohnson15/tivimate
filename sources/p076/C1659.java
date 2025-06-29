package p076;

import android.os.Looper;
import android.os.SystemClock;
import androidx.leanback.widget.RunnableC0183;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p192.ThreadFactoryC2667;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʿˉ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1659 implements InterfaceC1662 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public HandlerC1655 f6472;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public IOException f6473;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ExecutorService f6474;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C1654 f6470 = new C1654(-9223372036854775807L, false, 0);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C1654 f6469 = new C1654(-9223372036854775807L, false, 2);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C1654 f6471 = new C1654(-9223372036854775807L, false, 3);

    public C1659(String str) {
        String str2 = ᐧʻ.ﾞˊ("ExoPlayer:Loader:", str);
        int i = AbstractC4470.f17202;
        this.f6474 = Executors.newSingleThreadExecutor(new ThreadFactoryC2667(str2, 1));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5330() {
        HandlerC1655 handlerC1655 = this.f6472;
        AbstractC4464.m10146(handlerC1655);
        handlerC1655.m5324(false);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5331(InterfaceC1666 interfaceC1666) {
        HandlerC1655 handlerC1655 = this.f6472;
        if (handlerC1655 != null) {
            handlerC1655.m5324(true);
        }
        ExecutorService executorService = this.f6474;
        if (interfaceC1666 != null) {
            executorService.execute(new RunnableC0183(7, interfaceC1666));
        }
        executorService.shutdown();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m5332() {
        return this.f6473 != null;
    }

    @Override // p076.InterfaceC1662
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5333() throws IOException {
        IOException iOException;
        IOException iOException2 = this.f6473;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1655 handlerC1655 = this.f6472;
        if (handlerC1655 != null && (iOException = handlerC1655.f6454) != null && handlerC1655.f6461 > handlerC1655.f6459) {
            throw iOException;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long m5334(InterfaceC1656 interfaceC1656, InterfaceC1658 interfaceC1658, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC4464.m10146(looperMyLooper);
        this.f6473 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC1655 handlerC1655 = new HandlerC1655(this, looperMyLooper, interfaceC1656, interfaceC1658, i, jElapsedRealtime);
        AbstractC4464.m10132(this.f6472 == null);
        this.f6472 = handlerC1655;
        handlerC1655.f6454 = null;
        this.f6474.execute(handlerC1655);
        return jElapsedRealtime;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m5335() {
        return this.f6472 != null;
    }
}
