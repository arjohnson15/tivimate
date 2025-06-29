package p383;

/* renamed from: ᵢᵢ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4458 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f17172;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f17173;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f17174;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ThreadLocal f17175 = new ThreadLocal();

    public C4458(long j) {
        m10118(j);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized long m10112(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f17173;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return m10116((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized long m10113() {
        return this.f17172;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m10114(boolean z, long j) {
        try {
            AbstractC4464.m10132(this.f17174 == 9223372036854775806L);
            if (m10117()) {
                return;
            }
            if (z) {
                this.f17175.set(Long.valueOf(j));
            } else {
                while (!m10117()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized long m10115(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f17173;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = j4 / 8589934592L;
            Long.signum(j5);
            long j6 = (j5 * 8589934592L) + j;
            j2 = ((j5 + 1) * 8589934592L) + j;
            if (j6 >= j4) {
                j2 = j6;
            }
        } else {
            j2 = j;
        }
        return m10116((j2 * 1000000) / 90000);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized long m10116(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m10117()) {
                long jLongValue = this.f17174;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.f17175.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.f17172 = jLongValue - j;
                notifyAll();
            }
            this.f17173 = j;
            return j + this.f17172;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final synchronized boolean m10117() {
        return this.f17172 != -9223372036854775807L;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final synchronized void m10118(long j) {
        this.f17174 = j;
        this.f17172 = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f17173 = -9223372036854775807L;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized long m10119() {
        long j;
        j = this.f17174;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }
}
