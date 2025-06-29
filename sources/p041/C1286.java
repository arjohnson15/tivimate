package p041;

import java.io.IOException;
import java.net.ProtocolException;
import p366.AbstractC4153;
import p366.C4143;
import p366.InterfaceC4163;

/* renamed from: ʽˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1286 extends AbstractC4153 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f5286;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f5287;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f5288;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f5289;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f5290;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1273 f5291;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1286(C1273 c1273, InterfaceC4163 interfaceC4163, long j) {
        super(interfaceC4163);
        this.f5291 = c1273;
        this.f5286 = j;
        this.f5289 = true;
        if (j == 0) {
            m4578(null);
        }
    }

    @Override // p366.AbstractC4153, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5290) {
            return;
        }
        this.f5290 = true;
        try {
            super.close();
            m4578(null);
        } catch (IOException e) {
            throw m4578(e);
        }
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        if (this.f5290) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo4577 = this.f16062.mo4577(c4143, 8192L);
            if (this.f5289) {
                this.f5289 = false;
                this.f5291.getClass();
            }
            if (jMo4577 == -1) {
                m4578(null);
                return -1L;
            }
            long j2 = this.f5288 + jMo4577;
            long j3 = this.f5286;
            if (j3 == -1 || j2 <= j3) {
                this.f5288 = j2;
                if (j2 == j3) {
                    m4578(null);
                }
                return jMo4577;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw m4578(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IOException m4578(IOException iOException) {
        if (this.f5287) {
            return iOException;
        }
        this.f5287 = true;
        C1273 c1273 = this.f5291;
        if (iOException == null && this.f5289) {
            this.f5289 = false;
            c1273.getClass();
        }
        return c1273.m4534(true, false, iOException);
    }
}
