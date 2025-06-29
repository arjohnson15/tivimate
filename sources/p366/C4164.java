package p366;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ᵔﾞ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4164 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Inflater f16077;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16078;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f16079;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4149 f16080;

    public C4164(C4149 c4149, Inflater inflater) {
        this.f16080 = c4149;
        this.f16077 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16079) {
            return;
        }
        this.f16077.end();
        this.f16079 = true;
        this.f16080.close();
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws DataFormatException, IOException {
        long j2;
        while (!this.f16079) {
            C4149 c4149 = this.f16080;
            Inflater inflater = this.f16077;
            try {
                C4172 c4172M9514 = c4143.m9514(1);
                int iMin = (int) Math.min(8192L, 8192 - c4172M9514.f16101);
                if (inflater.needsInput() && !c4149.m9551()) {
                    C4172 c4172 = c4149.f16049.f16042;
                    int i = c4172.f16101;
                    int i2 = c4172.f16099;
                    int i3 = i - i2;
                    this.f16078 = i3;
                    inflater.setInput(c4172.f16102, i2, i3);
                }
                int iInflate = inflater.inflate(c4172M9514.f16102, c4172M9514.f16101, iMin);
                int i4 = this.f16078;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f16078 -= remaining;
                    c4149.skip(remaining);
                }
                if (iInflate > 0) {
                    c4172M9514.f16101 += iInflate;
                    j2 = iInflate;
                    c4143.f16041 += j2;
                } else {
                    if (c4172M9514.f16099 == c4172M9514.f16101) {
                        c4143.f16042 = c4172M9514.m9588();
                        AbstractC4171.m9585(c4172M9514);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c4149.m9551()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f16080.f16051.mo8177();
    }
}
