package p379;

import java.io.IOException;
import okhttp3.internal.http2.StreamResetException;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4151;
import p366.InterfaceC4163;

/* renamed from: ᵢᐧ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4416 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f17036;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f17037;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4143 f17038 = new C4143();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4143 f17039 = new C4143();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f17040;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C4401 f17041;

    public C4416(C4401 c4401, long j, boolean z) {
        this.f17041 = c4401;
        this.f17040 = j;
        this.f17036 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C4401 c4401 = this.f17041;
        synchronized (c4401) {
            this.f17037 = true;
            C4143 c4143 = this.f17039;
            j = c4143.f16041;
            c4143.m9508();
            c4401.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = AbstractC2339.f9301;
            this.f17041.f16944.m10020(j);
        }
        this.f17041.m9998();
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws Throwable {
        Throwable streamResetException;
        boolean z;
        long jMo4577;
        do {
            C4401 c4401 = this.f17041;
            synchronized (c4401) {
                c4401.f16949.m9582();
                try {
                    if (c4401.m9999() == 0 || this.f17036) {
                        streamResetException = null;
                    } else {
                        streamResetException = c4401.f16955;
                        if (streamResetException == null) {
                            streamResetException = new StreamResetException(c4401.m9999());
                        }
                    }
                    if (this.f17037) {
                        throw new IOException("stream closed");
                    }
                    C4143 c41432 = this.f17039;
                    long j2 = c41432.f16041;
                    z = false;
                    if (j2 > 0) {
                        jMo4577 = c41432.mo4577(c4143, Math.min(8192L, j2));
                        long j3 = c4401.f16951 + jMo4577;
                        c4401.f16951 = j3;
                        long j4 = j3 - c4401.f16956;
                        if (streamResetException == null && j4 >= c4401.f16944.f17010.m10027() / 2) {
                            c4401.f16944.m10023(c4401.f16952, j4);
                            c4401.f16956 = c4401.f16951;
                        }
                    } else {
                        if (!this.f17036 && streamResetException == null) {
                            c4401.m9994();
                            z = true;
                        }
                        jMo4577 = -1;
                    }
                    c4401.f16949.m9988();
                } finally {
                }
            }
        } while (z);
        if (jMo4577 != -1) {
            return jMo4577;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f17041.f16949;
    }
}
