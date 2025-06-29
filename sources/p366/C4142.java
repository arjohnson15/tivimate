package p366;

import java.io.IOException;
import java.io.OutputStream;
import ˎˊ.ˆʿ;

/* renamed from: ᵔﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4142 implements InterfaceC4168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f16038;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f16039;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16040;

    public /* synthetic */ C4142(Object obj, int i, Object obj2) {
        this.f16040 = i;
        this.f16038 = obj;
        this.f16039 = obj2;
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f16040) {
            case 0:
                C4142 c4142 = (C4142) this.f16039;
                C4146 c4146 = (C4146) this.f16038;
                c4146.m9582();
                try {
                    c4142.close();
                    if (c4146.m9583()) {
                        throw c4146.m9541(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!c4146.m9583()) {
                        throw e;
                    }
                    throw c4146.m9541(e);
                } finally {
                    c4146.m9583();
                }
            default:
                ((OutputStream) this.f16038).close();
                return;
        }
    }

    @Override // p366.InterfaceC4168, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f16040) {
            case 0:
                C4142 c4142 = (C4142) this.f16039;
                C4146 c4146 = (C4146) this.f16038;
                c4146.m9582();
                try {
                    c4142.flush();
                    if (c4146.m9583()) {
                        throw c4146.m9541(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!c4146.m9583()) {
                        throw e;
                    }
                    throw c4146.m9541(e);
                } finally {
                    c4146.m9583();
                }
            default:
                ((OutputStream) this.f16038).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f16040) {
            case 0:
                return "AsyncTimeout.sink(" + ((C4142) this.f16039) + ')';
            default:
                return "sink(" + ((OutputStream) this.f16038) + ')';
        }
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי */
    public final C4151 mo4565() {
        switch (this.f16040) {
            case 0:
                return (C4146) this.f16038;
            default:
                return (C4151) this.f16039;
        }
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) throws IOException {
        switch (this.f16040) {
            case 0:
                ˆʿ.ʽᐧ(c4143.f16041, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    C4172 c4172 = c4143.f16042;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += c4172.f16101 - c4172.f16099;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                c4172 = c4172.f16103;
                            }
                        }
                    }
                    C4142 c4142 = (C4142) this.f16039;
                    C4146 c4146 = (C4146) this.f16038;
                    c4146.m9582();
                    try {
                        c4142.mo4566(c4143, j2);
                        if (c4146.m9583()) {
                            throw c4146.m9541(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!c4146.m9583()) {
                            throw e;
                        }
                        throw c4146.m9541(e);
                    } finally {
                        c4146.m9583();
                    }
                }
            default:
                ˆʿ.ʽᐧ(c4143.f16041, 0L, j);
                while (j > 0) {
                    ((C4151) this.f16039).mo9538();
                    C4172 c41722 = c4143.f16042;
                    int iMin = (int) Math.min(j, c41722.f16101 - c41722.f16099);
                    ((OutputStream) this.f16038).write(c41722.f16102, c41722.f16099, iMin);
                    int i = c41722.f16099 + iMin;
                    c41722.f16099 = i;
                    long j3 = iMin;
                    j -= j3;
                    c4143.f16041 -= j3;
                    if (i == c41722.f16101) {
                        c4143.f16042 = c41722.m9588();
                        AbstractC4171.m9585(c41722);
                    }
                }
                return;
        }
    }
}
