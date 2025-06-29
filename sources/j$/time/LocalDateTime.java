package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p334.C3789;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = a0(LocalDate.d, k.e);
    public static final LocalDateTime d = a0(LocalDate.e, k.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final k b;

    private LocalDateTime(LocalDate localDate, k kVar) {
        this.a = localDate;
        this.b = kVar;
    }

    private int S(LocalDateTime localDateTime) {
        int iS = this.a.S(localDateTime.c());
        return iS == 0 ? this.b.compareTo(localDateTime.b) : iS;
    }

    public static LocalDateTime T(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).X();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.U(temporalAccessor), k.U(temporalAccessor));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static LocalDateTime Y(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), k.a0(0));
    }

    public static LocalDateTime Z(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), k.b0(i4, i5, i6, 0));
    }

    public static LocalDateTime a0(LocalDate localDate, k kVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(localDate, kVar);
    }

    public static LocalDateTime b0(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.T(j2);
        return new LocalDateTime(LocalDate.g0(j$.com.android.tools.r8.a.o(j + zoneOffset.a0(), 86400)), k.c0((((int) j$.com.android.tools.r8.a.n(r5, r7)) * 1000000000) + j2));
    }

    private LocalDateTime d0(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        long j5 = j | j2 | j3 | j4;
        k kVarC0 = this.b;
        if (j5 == 0) {
            return g0(localDate, kVarC0);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = i;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jK0 = kVarC0.k0();
        long j10 = (j9 * j8) + jK0;
        long jO = j$.com.android.tools.r8.a.o(j10, 86400000000000L) + (j7 * j8);
        long jN = j$.com.android.tools.r8.a.n(j10, 86400000000000L);
        if (jN != jK0) {
            kVarC0 = k.c0(jN);
        }
        return g0(localDate.plusDays(jO), kVarC0);
    }

    private LocalDateTime g0(LocalDate localDate, k kVar) {
        return (this.a == localDate && this.b == kVar) ? this : new LocalDateTime(localDate, kVar);
    }

    public static LocalDateTime now() {
        b bVarB = b.b();
        Objects.requireNonNull(bVarB, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return b0(instantOfEpochMilli.U(), instantOfEpochMilli.V(), bVarB.a().T().d(instantOfEpochMilli));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return b0(instant.U(), instant.V(), zoneId.T().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new g(1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this.a : AbstractC5402g.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(((LocalDate) c()).w(), j$.time.temporal.a.EPOCH_DAY).d(b().k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? S((LocalDateTime) chronoLocalDateTime) : AbstractC5402g.c(this, chronoLocalDateTime);
    }

    public final int U() {
        return this.b.Y();
    }

    public final int V() {
        return this.b.Z();
    }

    public final boolean W(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return S(localDateTime) > 0;
        }
        long jW = c().w();
        long jW2 = localDateTime.c().w();
        return jW > jW2 || (jW == jW2 && this.b.k0() > localDateTime.b.k0());
    }

    public final boolean X(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return S(localDateTime) < 0;
        }
        long jW = c().w();
        long jW2 = localDateTime.c().w();
        return jW < jW2 || (jW == jW2 && this.b.k0() < localDateTime.b.k0());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime o(ZoneId zoneId) {
        return ZonedDateTime.U(this, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k b() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.n(this, j);
        }
        switch (i.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return d0(this.a, 0L, 0L, 0L, j, 1);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j / 86400000000L);
                return localDateTimePlusDays.d0(localDateTimePlusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000, 1);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j / 86400000);
                return localDateTimePlusDays2.d0(localDateTimePlusDays2.a, 0L, 0L, 0L, (j % 86400000) * 1000000, 1);
            case 4:
                return plusSeconds(j);
            case 5:
                return d0(this.a, 0L, j, 0L, 0L, 1);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return d0(this.a, j, 0L, 0L, 0L, 1);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                LocalDateTime localDateTimePlusDays3 = plusDays(j / 256);
                return localDateTimePlusDays3.d0(localDateTimePlusDays3.a, (j % 256) * 12, 0L, 0L, 0L, 1);
            default:
                return g0(this.a.e(j, temporalUnit), this.b);
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) qVar.v(this, j);
        }
        boolean zU = ((j$.time.temporal.a) qVar).U();
        k kVar = this.b;
        LocalDate localDate = this.a;
        return zU ? g0(localDate, kVar.d(j, qVar)) : g0(localDate.d(j, qVar), kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.C() || aVar.U();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime r(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return g0(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) AbstractC5402g.a(localDate, this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int getDayOfMonth() {
        return this.a.W();
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.X();
    }

    public int getHour() {
        return this.b.W();
    }

    public int getMinute() {
        return this.b.X();
    }

    public int getMonthValue() {
        return this.a.Z();
    }

    public int getYear() {
        return this.a.getYear();
    }

    final void h0(DataOutput dataOutput) {
        this.a.t0(dataOutput);
        this.b.r0(dataOutput);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public LocalDateTime minusMinutes(long j) {
        return d0(this.a, 0L, j, 0L, 0L, -1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() ? this.b.p(qVar) : this.a.p(qVar) : j$.time.temporal.l.a(this, qVar);
    }

    public LocalDateTime plusDays(long j) {
        return g0(this.a.plusDays(j), this.b);
    }

    public LocalDateTime plusSeconds(long j) {
        return d0(this.a, 0L, 0L, j, 0L, 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (!((j$.time.temporal.a) qVar).U()) {
            return this.a.s(qVar);
        }
        k kVar = this.b;
        kVar.getClass();
        return j$.time.temporal.l.d(kVar, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC5402g.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate c() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    public LocalDateTime truncatedTo(TemporalUnit temporalUnit) {
        k kVarC0 = this.b;
        kVarC0.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            e eVarP = temporalUnit.p();
            if (eVarP.r() > 86400) {
                throw new j$.time.temporal.s("Unit is too large to be used for truncation");
            }
            long jC = eVarP.C();
            if (86400000000000L % jC != 0) {
                throw new j$.time.temporal.s("Unit must divide into a standard day without remainder");
            }
            kVarC0 = k.c0((kVarC0.k0() / jC) * jC);
        }
        return g0(this.a, kVarC0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long until(j$.time.temporal.Temporal r11, j$.time.temporal.TemporalUnit r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.until(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() ? this.b.v(qVar) : this.a.v(qVar) : qVar.r(this);
    }

    public LocalDateTime withDayOfMonth(int i) {
        return g0(this.a.p0(i), this.b);
    }

    public LocalDateTime withHour(int i) {
        return g0(this.a, this.b.n0(i));
    }

    public LocalDateTime withMinute(int i) {
        return g0(this.a, this.b.o0(i));
    }

    public LocalDateTime withMonth(int i) {
        return g0(this.a.r0(i), this.b);
    }

    public LocalDateTime withSecond(int i) {
        return g0(this.a, this.b.q0(i));
    }

    public LocalDateTime withYear(int i) {
        return g0(this.a.s0(i), this.b);
    }
}
