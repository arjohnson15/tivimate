package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p334.C3789;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.m, ChronoLocalDate, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        of(1970, 1, 1);
    }

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static LocalDate T(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.r.d.Q(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.V(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate U(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.A(j$.time.temporal.l.f());
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int V(j$.time.temporal.q qVar) {
        int i;
        int i2 = h.a[((j$.time.temporal.a) qVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return Y();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return X().getValue();
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                i = (s - 1) % 7;
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((Y() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Y() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return i + 1;
    }

    private long a0() {
        return ((this.a * 12) + this.b) - 1;
    }

    private long d0(LocalDate localDate) {
        return (((localDate.a0() * 32) + localDate.c) - ((a0() * 32) + this.c)) / 32;
    }

    public static LocalDate e0(b bVar) {
        Objects.requireNonNull(bVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneIdA = bVar.a();
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return g0(j$.com.android.tools.r8.a.o(instantOfEpochMilli.U() + zoneIdA.T().d(instantOfEpochMilli).a0(), 86400));
    }

    public static LocalDate f0(int i, m mVar, int i2) {
        j$.time.temporal.a.YEAR.T(i);
        Objects.requireNonNull(mVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.T(i2);
        return T(i, mVar.getValue(), i2);
    }

    public static LocalDate g0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.T(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.S(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate h0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.T(j);
        j$.time.temporal.a.DAY_OF_YEAR.T(i2);
        boolean zQ = j$.time.chrono.r.d.Q(j);
        if (i2 == 366 && !zQ) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        m mVarV = m.V(((i2 - 1) / 31) + 1);
        if (i2 > (mVarV.T(zQ) + mVarV.S(zQ)) - 1) {
            mVarV = mVarV.W();
        }
        return new LocalDate(i, mVarV.getValue(), (i2 - mVarV.S(zQ)) + 1);
    }

    private static LocalDate m0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.r.d.Q((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        return e0(b.b());
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.T(i);
        j$.time.temporal.a.MONTH_OF_YEAR.T(i2);
        j$.time.temporal.a.DAY_OF_MONTH.T(i3);
        return T(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.d(charSequence, new g(0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this : AbstractC5402g.j(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return AbstractC5402g.a(this, temporal);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l D() {
        return getYear() >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.p pVar) {
        if (pVar instanceof s) {
            return j0(((s) pVar).d()).plusDays(r4.a());
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (LocalDate) pVar.n(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean I() {
        return j$.time.chrono.r.d.Q(this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int O() {
        return I() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? S((LocalDate) chronoLocalDate) : AbstractC5402g.b(this, chronoLocalDate);
    }

    final int S(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final int W() {
        return this.c;
    }

    public final DayOfWeek X() {
        return DayOfWeek.of(((int) j$.com.android.tools.r8.a.n(w() + 3, 7)) + 1);
    }

    public final int Y() {
        return (m.V(this.b).S(I()) + this.c) - 1;
    }

    public final int Z() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k a() {
        return j$.time.chrono.r.d;
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.a0(this, k.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b bVarF;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeA0 = LocalDateTime.a0(this, k.g);
        if (!(zoneId instanceof ZoneOffset) && (bVarF = zoneId.T().f(localDateTimeA0)) != null && bVarF.C()) {
            localDateTimeA0 = bVarF.n();
        }
        return ZonedDateTime.U(localDateTimeA0, zoneId, null);
    }

    public final int b0() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : I() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && S((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return AbstractC5402g.h(this, qVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.n(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return k0(j);
            case 3:
                return j0(j);
            case 4:
                return l0(j);
            case 5:
                return l0(j$.com.android.tools.r8.a.p(j, 10));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return l0(j$.com.android.tools.r8.a.p(j, 100));
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return l0(j$.com.android.tools.r8.a.p(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.j(v(aVar), j), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? S((LocalDate) chronoLocalDate) < 0 : w() < chronoLocalDate.w();
    }

    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? S((LocalDate) chronoLocalDate) == 0 : w() == chronoLocalDate.w();
    }

    public final LocalDate j0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return m0(j$.time.temporal.a.YEAR.S(j$.com.android.tools.r8.a.o(j2, j3)), ((int) j$.com.android.tools.r8.a.n(j2, j3)) + 1, this.c);
    }

    public final LocalDate k0(long j) {
        return plusDays(j$.com.android.tools.r8.a.p(j, 7));
    }

    public final LocalDate l0(long j) {
        return j == 0 ? this : m0(j$.time.temporal.a.YEAR.S(this.a + j), this.b, this.c);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public LocalDate minusMonths(long j) {
        return j == Long.MIN_VALUE ? j0(Long.MAX_VALUE).j0(1L) : j0(-j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDate) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.T(j);
        int i = h.a[aVar.ordinal()];
        int i2 = this.a;
        switch (i) {
            case 1:
                return p0((int) j);
            case 2:
                return q0((int) j);
            case 3:
                return k0(j - v(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return s0((int) j);
            case 5:
                return plusDays(j - X().getValue());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return plusDays(j - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return plusDays(j - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return g0(j);
            case 9:
                return k0(j - v(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return r0((int) j);
            case 11:
                return j0(j - a0());
            case 12:
                return s0((int) j);
            case 13:
                return v(j$.time.temporal.a.ERA) == j ? this : s0(1 - i2);
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate r(j$.time.temporal.m mVar) {
        return mVar instanceof LocalDate ? (LocalDate) mVar : (LocalDate) mVar.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? V(qVar) : j$.time.temporal.l.a(this, qVar);
    }

    public final LocalDate p0(int i) {
        return this.c == i ? this : of(this.a, this.b, i);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jB0 = b0();
                if (j2 <= jB0) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jB0));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.T(i2);
                return new LocalDate(i2, 1, (int) (j2 - jB0));
            }
        }
        return g0(j$.com.android.tools.r8.a.j(w(), j));
    }

    public final LocalDate q0(int i) {
        return Y() == i ? this : h0(this.a, i);
    }

    public final LocalDate r0(int i) {
        if (this.b == i) {
            return this;
        }
        j$.time.temporal.a.MONTH_OF_YEAR.T(i);
        return m0(this.a, i, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.C()) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        int i = h.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.j(1L, b0());
        }
        if (i == 2) {
            return j$.time.temporal.t.j(1L, O());
        }
        if (i == 3) {
            return j$.time.temporal.t.j(1L, (m.V(this.b) != m.FEBRUARY || I()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) qVar).n();
        }
        return j$.time.temporal.t.j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    public final LocalDate s0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.T(i);
        return m0(i, this.b, this.c);
    }

    final void t0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateU = U(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateU);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateU.w() - w();
            case 2:
                return (localDateU.w() - w()) / 7;
            case 3:
                return d0(localDateU);
            case 4:
                return d0(localDateU) / 12;
            case 5:
                return d0(localDateU) / 120;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return d0(localDateU) / 1200;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return d0(localDateU) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateU.v(aVar) - v(aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.EPOCH_DAY ? w() : qVar == j$.time.temporal.a.PROLEPTIC_MONTH ? a0() : V(qVar) : qVar.r(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long w() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !I() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(k kVar) {
        return LocalDateTime.a0(this, kVar);
    }
}
