package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class g implements q {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.q
            public final t A(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jV = temporalAccessor.v(g.QUARTER_OF_YEAR);
                if (jV == 1) {
                    return j$.time.chrono.r.d.Q(temporalAccessor.v(a.YEAR)) ? t.j(1L, 91L) : t.j(1L, 90L);
                }
                return jV == 2 ? t.j(1L, 91L) : (jV == 3 || jV == 4) ? t.j(1L, 92L) : n();
            }

            @Override // j$.time.temporal.q
            public final t n() {
                return t.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f) {
                long jQ;
                LocalDate localDateJ0;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                q qVar = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(qVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iS = aVar.S(l.longValue());
                long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                if (!i.a(temporalAccessor)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (f == F.LENIENT) {
                    localDateJ0 = LocalDate.of(iS, 1, 1).j0(j$.com.android.tools.r8.a.p(j$.com.android.tools.r8.a.q(l2.longValue(), 1L), 3));
                    jQ = j$.com.android.tools.r8.a.q(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iS, ((qVar.n().a(l2.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (f == F.STRICT) {
                            A(localDateOf).b(jLongValue, this);
                        } else {
                            n().b(jLongValue, this);
                        }
                    }
                    jQ = jLongValue - 1;
                    localDateJ0 = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(qVar);
                return localDateJ0.plusDays(jQ);
            }

            @Override // j$.time.temporal.q
            public final long r(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.p(a.DAY_OF_YEAR) - g.a[((temporalAccessor.p(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.r.d.Q(temporalAccessor.v(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR) && i.a(temporalAccessor);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.q
            public final Temporal v(Temporal temporal, long j) {
                long jR = r(temporal);
                n().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - jR) + temporal.v(aVar), aVar);
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final t A(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return n();
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final t n() {
                return t.j(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final long r(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return (temporalAccessor.v(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.MONTH_OF_YEAR) && i.a(temporalAccessor);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.q
            public final Temporal v(Temporal temporal, long j) {
                long jR = r(temporal);
                n().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - jR) * 3) + temporal.v(aVar), aVar);
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final t A(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return g.W(LocalDate.U(temporalAccessor));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final t n() {
                return t.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f) {
                LocalDate localDateD;
                long j;
                long j2;
                q qVar = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = qVar.n().a(l.longValue(), qVar);
                long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (!i.a(temporalAccessor)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (f == F.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        localDateOf = localDateOf.k0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.k0(j$.com.android.tools.r8.a.q(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        localDateD = localDateOf.k0(j$.com.android.tools.r8.a.q(jLongValue, j)).d(jLongValue2, aVar);
                    }
                    j = 1;
                    jLongValue2 = j2 + 1;
                    localDateD = localDateOf.k0(j$.com.android.tools.r8.a.q(jLongValue, j)).d(jLongValue2, aVar);
                } else {
                    int iS = aVar.S(l2.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (f == F.STRICT) {
                            g.W(localDateOf).b(jLongValue, this);
                        } else {
                            n().b(jLongValue, this);
                        }
                    }
                    localDateD = localDateOf.k0(jLongValue - 1).d(iS, aVar);
                }
                map.remove(this);
                map.remove(qVar);
                map.remove(aVar);
                return localDateD;
            }

            @Override // j$.time.temporal.q
            public final long r(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return g.T(LocalDate.U(temporalAccessor));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && i.a(temporalAccessor);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.q
            public final Temporal v(Temporal temporal, long j) {
                n().b(j, this);
                return temporal.e(j$.com.android.tools.r8.a.q(j, r(temporal)), ChronoUnit.WEEKS);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final t A(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return n();
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final t n() {
                return a.YEAR.n();
            }

            @Override // j$.time.temporal.q
            public final long r(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return g.X(LocalDate.U(temporalAccessor));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && i.a(temporalAccessor);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.q
            public final Temporal v(Temporal temporal, long j) {
                if (!s(temporal)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.n().a(j, g.WEEK_BASED_YEAR);
                LocalDate localDateU = LocalDate.U(temporal);
                int iP = localDateU.p(a.DAY_OF_WEEK);
                int iT = g.T(localDateU);
                if (iT == 53 && g.Y(iA) == 52) {
                    iT = 52;
                }
                return temporal.r(LocalDate.of(iA, 1, 4).plusDays(((iT - 1) * 7) + (iP - r6.p(r0))));
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int T(LocalDate localDate) {
        int iOrdinal = localDate.X().ordinal();
        int i = 1;
        int iY = localDate.Y() - 1;
        int i2 = (3 - iOrdinal) + iY;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (iY < i4) {
            return (int) t.j(1L, Y(X(localDate.q0(180).l0(-1L)))).d();
        }
        int i5 = ((iY - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.I())) {
            i = i5;
        }
        return i;
    }

    static t W(LocalDate localDate) {
        return t.j(1L, Y(X(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int X(LocalDate localDate) {
        int year = localDate.getYear();
        int iY = localDate.Y();
        if (iY <= 3) {
            return iY - localDate.X().ordinal() < -2 ? year - 1 : year;
        }
        if (iY >= 363) {
            return ((iY - 363) - (localDate.I() ? 1 : 0)) - localDate.X().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Y(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.X() != DayOfWeek.THURSDAY) {
            return (localDateOf.X() == DayOfWeek.WEDNESDAY && localDateOf.I()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.q
    public final boolean C() {
        return true;
    }

    public /* synthetic */ TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f) {
        return null;
    }
}
