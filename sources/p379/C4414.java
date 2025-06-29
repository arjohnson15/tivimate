package p379;

import java.net.SocketTimeoutException;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4151;
import p366.InterfaceC4168;

/* renamed from: ᵢᐧ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4414 implements InterfaceC4168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4143 f17026 = new C4143();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f17027;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C4401 f17028;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f17029;

    public C4414(C4401 c4401, boolean z) {
        this.f17028 = c4401;
        this.f17029 = z;
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        C4401 c4401 = this.f17028;
        byte[] bArr = AbstractC2339.f9301;
        synchronized (c4401) {
            if (this.f17027) {
                return;
            }
            boolean z = c4401.m9999() == 0;
            C4401 c44012 = this.f17028;
            if (!c44012.f16946.f17029) {
                if (this.f17026.f16041 > 0) {
                    while (this.f17026.f16041 > 0) {
                        m10025(true);
                    }
                } else if (z) {
                    c44012.f16944.m10019(c44012.f16952, true, null, 0L);
                }
            }
            synchronized (this.f17028) {
                this.f17027 = true;
            }
            this.f17028.f16944.flush();
            this.f17028.m9998();
        }
    }

    @Override // p366.InterfaceC4168, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        C4401 c4401 = this.f17028;
        byte[] bArr = AbstractC2339.f9301;
        synchronized (c4401) {
            c4401.m9991();
        }
        while (this.f17026.f16041 > 0) {
            m10025(false);
            this.f17028.f16944.flush();
        }
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי */
    public final C4151 mo4565() {
        return this.f17028.f16947;
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) throws SocketTimeoutException {
        byte[] bArr = AbstractC2339.f9301;
        C4143 c41432 = this.f17026;
        c41432.mo4566(c4143, j);
        while (c41432.f16041 >= 16384) {
            m10025(false);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10025(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        C4401 c4401 = this.f17028;
        synchronized (c4401) {
            c4401.f16947.m9582();
            while (c4401.f16945 >= c4401.f16953 && !this.f17029 && !this.f17027 && c4401.m9999() == 0) {
                try {
                    c4401.m9994();
                } finally {
                    c4401.f16947.m9988();
                }
            }
            c4401.f16947.m9988();
            c4401.m9991();
            jMin = Math.min(c4401.f16953 - c4401.f16945, this.f17026.f16041);
            c4401.f16945 += jMin;
            z2 = z && jMin == this.f17026.f16041;
        }
        this.f17028.f16947.m9582();
        try {
            C4401 c44012 = this.f17028;
            c44012.f16944.m10019(c44012.f16952, z2, this.f17026, jMin);
        } finally {
            c4401 = this.f17028;
        }
    }
}
