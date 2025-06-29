package p309;

import com.rapid7.helper.smbj.io.SMB2Exception;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1689;
import p109.EnumC1805;
import p143.C2227;
import p200.C2753;
import p225.AbstractC3019;
import p296.C3486;

/* renamed from: ᐧˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3578 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2227 f13766;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f13767;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f13768;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final EnumC1689 f13769;

    public AbstractC3578(C2227 c2227) {
        C3486 c3486 = c2227.f8864;
        this.f13769 = (EnumC1689) ((C2753) c3486.f13462.f11939).f10767;
        this.f13766 = c2227;
        this.f13767 = c2227.f8865;
        this.f13768 = c3486.f13470.f5200;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1685 m8472(AbstractC1685 abstractC1685, EnumSet enumSet) throws IOException {
        try {
            try {
                AbstractC1685 abstractC16852 = (AbstractC1685) this.f13766.m6209(abstractC1685).f19092.get(this.f13768, TimeUnit.MILLISECONDS);
                C1696 c1696 = (C1696) abstractC16852.ᵢʿ();
                if (enumSet.contains(EnumC1805.m5549(c1696.f6598))) {
                    return abstractC16852;
                }
                throw new SMB2Exception(c1696, "expected=" + enumSet);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (TimeoutException e3) {
                InterruptedByTimeoutException interruptedByTimeoutExceptionM7491 = AbstractC3019.m7491();
                interruptedByTimeoutExceptionM7491.initCause(e3);
                throw interruptedByTimeoutExceptionM7491;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new IOException(e5);
        }
    }
}
