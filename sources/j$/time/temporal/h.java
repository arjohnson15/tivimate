package j$.time.temporal;

/* loaded from: classes2.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", j$.time.e.v(31556952)),
    QUARTER_YEARS("QuarterYears", j$.time.e.v(7889238));

    private final String a;
    private final j$.time.e b;

    h(String str, j$.time.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            q qVar = i.c;
            return j$.com.android.tools.r8.a.q(temporal2.v(qVar), temporal.v(qVar));
        }
        if (i == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal n(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return temporal.d(j$.com.android.tools.r8.a.j(temporal.p(r0), j), i.c);
        }
        if (i == 2) {
            return temporal.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.e p() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
