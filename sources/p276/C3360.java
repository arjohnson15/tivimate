package p276;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p036.C1262;
import p041.C1276;
import p158.AbstractC2339;
import p366.C4143;

/* renamed from: ـⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3360 extends AbstractC3358 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C1262 f13158;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f13159;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360(C1262 c1262, long j) {
        super(c1262);
        this.f13158 = c1262;
        this.f13159 = j;
        if (j == 0) {
            m8178();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM6444;
        if (this.f13154) {
            return;
        }
        if (this.f13159 != 0) {
            try {
                zM6444 = AbstractC2339.m6444(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zM6444 = false;
            }
            if (!zM6444) {
                ((C1276) this.f13158.f5177).m4551();
                m8178();
            }
        }
        this.f13154 = true;
    }

    @Override // p276.AbstractC3358, p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        if (this.f13154) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f13159;
        if (j2 == 0) {
            return -1L;
        }
        long jMo4577 = super.mo4577(c4143, Math.min(j2, 8192L));
        if (jMo4577 == -1) {
            ((C1276) this.f13158.f5177).m4551();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m8178();
            throw protocolException;
        }
        long j3 = this.f13159 - jMo4577;
        this.f13159 = j3;
        if (j3 == 0) {
            m8178();
        }
        return jMo4577;
    }
}
