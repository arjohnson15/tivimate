package p446;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.mssmb2.SMBApiException;
import com.hierynomus.protocol.transport.TransportException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p018.C1095;
import p038.C1268;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p109.EnumC1805;
import p143.C2227;
import p200.C2753;
import p202.C2766;
import p293.C3474;
import p296.C3486;
import p390.C4514;
import p390.C4515;
import p408.C4672;
import p433.C5028;
import ˈי.ʾˈ;
import ٴᐧ.ᐧⁱ;
import ᵔᵔ.ٴˎ;

/* renamed from: ﾞˉ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5160 implements AutoCloseable {

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final ᐧⁱ f19708;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final C3474 f19709;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final long f19710;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2766 f19711;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final EnumC1689 f19712;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f19713;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f19714;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final AtomicBoolean f19715 = new AtomicBoolean(false);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final long f19716;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2227 f19717;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4672 f19718;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int f19719;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f19720;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final long f19721;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final long f19722;

    static {
        new C0559(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, 6, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
        f19708 = new ᐧⁱ(15);
        f19709 = new C3474(15);
    }

    public AbstractC5160(C4672 c4672, C2766 c2766) {
        this.f19718 = c4672;
        this.f19711 = c2766;
        C2227 c2227 = (C2227) c2766.f10820;
        this.f19717 = c2227;
        C3486 c3486 = (C3486) c2766.f10818;
        C2753 c2753 = (C2753) c3486.f13462.f11939;
        this.f19712 = (EnumC1689) c2753.f10767;
        C1268 c1268 = c3486.f13470;
        this.f19720 = Math.min(c1268.f5194, c2753.f10768);
        this.f19721 = c1268.f5202;
        this.f19713 = Math.min(c1268.f5189, c2753.f10770);
        this.f19716 = c1268.f5192;
        this.f19719 = Math.min(c1268.f5190, c2753.f10766);
        this.f19722 = c1268.f5200;
        this.f19710 = c2227.f8865;
        this.f19714 = c2766.f10817;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f19715.getAndSet(true)) {
            return;
        }
        C2766 c2766 = this.f19711;
        C4514 c4514 = (C4514) c2766.f10822;
        C3486 c3486 = (C3486) c2766.f10818;
        C2227 c2227 = (C2227) c2766.f10820;
        try {
            C5028 c5028M6209 = c2227.m6209(new C1095(4, (EnumC1689) ((C2753) c3486.f13462.f11939).f10767, EnumC1683.f6551, c2227.f8865, c2766.f10817));
            long j = c3486.f13470.f5200;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ٴˎ r8 = TransportException.f3662;
            AbstractC1685 abstractC1685 = (AbstractC1685) ʾˈ.ˏᵢ(c5028M6209, j, timeUnit);
            if (EnumC1805.m5550(((C1696) abstractC1685.ᵢʿ()).f6598)) {
                return;
            }
            throw new SMBApiException((C1696) abstractC1685.ᵢʿ(), "Error closing connection to " + ((C4672) c2766.f10819));
        } finally {
            c4514.f17374.ᵎـ(new C4515(c2227.f8865));
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC1685 m11457(AbstractC1685 abstractC1685, String str, Object obj, InterfaceC5161 interfaceC5161, long j) throws Throwable {
        AbstractC1685 abstractC16852;
        C5028 c5028M11458 = m11458(abstractC1685);
        try {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ٴˎ r1 = TransportException.f3662;
                abstractC16852 = (AbstractC1685) ʾˈ.ˏᵢ(c5028M11458, j, timeUnit);
            } else {
                ٴˎ r8 = TransportException.f3662;
                try {
                    abstractC16852 = (AbstractC1685) c5028M11458.f19092.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw r8.ˆʿ(e);
                } catch (ExecutionException e2) {
                    throw r8.ˆʿ(e2);
                }
            }
            if (interfaceC5161.mo8056(((C1696) abstractC16852.ᵢʿ()).f6598)) {
                return abstractC16852;
            }
            throw new SMBApiException((C1696) abstractC16852.ᵢʿ(), str + " failed for " + obj);
        } catch (TransportException e3) {
            throw new SMBRuntimeException(e3);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5028 m11458(AbstractC1685 abstractC1685) {
        if (this.f19715.get()) {
            throw new SMBRuntimeException(getClass().getSimpleName().concat(" has already been closed"));
        }
        try {
            return this.f19717.m6209(abstractC1685);
        } catch (TransportException e) {
            throw new SMBRuntimeException(e);
        }
    }
}
