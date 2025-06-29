package j$.time.temporal;

/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", j$.time.e.s(1)),
    MICROS("Micros", j$.time.e.s(1000)),
    MILLIS("Millis", j$.time.e.s(1000000)),
    SECONDS("Seconds", j$.time.e.v(1)),
    MINUTES("Minutes", j$.time.e.v(60)),
    HOURS("Hours", j$.time.e.v(3600)),
    HALF_DAYS("HalfDays", j$.time.e.v(43200)),
    DAYS("Days", j$.time.e.v(86400)),
    WEEKS("Weeks", j$.time.e.v(604800)),
    MONTHS("Months", j$.time.e.v(2629746)),
    YEARS("Years", j$.time.e.v(31556952)),
    DECADES("Decades", j$.time.e.v(315569520)),
    CENTURIES("Centuries", j$.time.e.v(3155695200L)),
    MILLENNIA("Millennia", j$.time.e.v(31556952000L)),
    ERAS("Eras", j$.time.e.v(31556952000000000L)),
    FOREVER("Forever", j$.time.e.A(Long.MAX_VALUE, 999999999));

    private final String a;
    private final j$.time.e b;

    ChronoUnit(String str, j$.time.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal n(Temporal temporal, long j) {
        return temporal.e(j, this);
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
