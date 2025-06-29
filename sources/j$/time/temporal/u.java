package j$.time.temporal;

import j$.time.chrono.AbstractC5402g;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.F;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class u implements q {
    private static final t f = t.j(1, 7);
    private static final t g = t.k(0, 4, 6);
    private static final t h = t.k(0, 52, 54);
    private static final t i = t.k(1, 52, 53);
    private final String a;
    private final WeekFields b;
    private final Enum c;
    private final Enum d;
    private final t e;

    /* JADX WARN: Multi-variable type inference failed */
    private u(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, t tVar) {
        this.a = str;
        this.b = weekFields;
        this.c = (Enum) temporalUnit;
        this.d = (Enum) temporalUnit2;
        this.e = tVar;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return l.h(temporalAccessor.p(a.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue()) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iP = temporalAccessor.p(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iP2 = temporalAccessor.p(aVar);
        int iL = l(iP2, iB);
        int iA = a(iL, iP2);
        if (iA == 0) {
            return iP - 1;
        }
        return iA >= a(iL, this.b.e() + ((int) temporalAccessor.s(aVar).d())) ? iP + 1 : iP;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iP = temporalAccessor.p(aVar);
        int iL = l(iP, iB);
        int iA = a(iL, iP);
        if (iA == 0) {
            return d(AbstractC5402g.p(temporalAccessor).q(temporalAccessor).n(iP, ChronoUnit.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iL, this.b.e() + ((int) temporalAccessor.s(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    static u e(WeekFields weekFields) {
        return new u("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    private ChronoLocalDate f(j$.time.chrono.k kVar, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateG = kVar.G(i2, 1, 1);
        int iL = l(1, b(chronoLocalDateG));
        int i5 = i4 - 1;
        return chronoLocalDateG.e(((Math.min(i3, a(iL, this.b.e() + chronoLocalDateG.O()) - 1) - 1) * 7) + i5 + (-iL), (TemporalUnit) ChronoUnit.DAYS);
    }

    static u g(WeekFields weekFields) {
        return new u("WeekBasedYear", weekFields, i.d, ChronoUnit.FOREVER, a.YEAR.n());
    }

    static u h(WeekFields weekFields) {
        return new u("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    static u i(WeekFields weekFields) {
        return new u("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, i.d, i);
    }

    private t j(TemporalAccessor temporalAccessor, a aVar) {
        int iL = l(temporalAccessor.p(aVar), b(temporalAccessor));
        t tVarS = temporalAccessor.s(aVar);
        return t.j(a(iL, (int) tVarS.e()), a(iL, (int) tVarS.d()));
    }

    private t k(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.f(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iP = temporalAccessor.p(aVar);
        int iL = l(iP, iB);
        int iA = a(iL, iP);
        if (iA == 0) {
            return k(AbstractC5402g.p(temporalAccessor).q(temporalAccessor).n(iP + 7, ChronoUnit.DAYS));
        }
        return iA >= a(iL, this.b.e() + ((int) temporalAccessor.s(aVar).d())) ? k(AbstractC5402g.p(temporalAccessor).q(temporalAccessor).e((r0 - iP) + 8, (TemporalUnit) ChronoUnit.DAYS)) : t.j(1L, r1 - 1);
    }

    private int l(int i2, int i3) {
        int iH = l.h(i2 - i3);
        return iH + 1 > this.b.e() ? 7 - iH : -iH;
    }

    @Override // j$.time.temporal.q
    public final t A(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return this.e;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return j(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return j(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (r1 == WeekFields.h) {
            return k(temporalAccessor);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return a.YEAR.n();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + r1 + ", this: " + this);
    }

    @Override // j$.time.temporal.q
    public final boolean C() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final t n() {
        return this.e;
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f2) {
        ChronoLocalDate chronoLocalDateE;
        ChronoLocalDate chronoLocalDateE2;
        a aVar;
        ChronoLocalDate chronoLocalDateE3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int i2 = j$.com.android.tools.r8.a.i(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r7 = this.d;
        t tVar = this.e;
        WeekFields weekFields = this.b;
        if (r7 == chronoUnit) {
            long jH = l.h((tVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jH));
        } else {
            a aVar2 = a.DAY_OF_WEEK;
            if (map.containsKey(aVar2)) {
                int iH = l.h(aVar2.S(((Long) map.get(aVar2)).longValue()) - weekFields.getFirstDayOfWeek().getValue()) + 1;
                j$.time.chrono.k kVarP = AbstractC5402g.p(temporalAccessor);
                a aVar3 = a.YEAR;
                if (map.containsKey(aVar3)) {
                    int iS = aVar3.S(((Long) map.get(aVar3)).longValue());
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (r7 == chronoUnit2) {
                        a aVar4 = a.MONTH_OF_YEAR;
                        if (map.containsKey(aVar4)) {
                            long jLongValue2 = ((Long) map.get(aVar4)).longValue();
                            long j = i2;
                            if (f2 == F.LENIENT) {
                                ChronoLocalDate chronoLocalDateE4 = kVarP.G(iS, 1, 1).e(j$.com.android.tools.r8.a.q(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                                int iB = b(chronoLocalDateE4);
                                int iP = chronoLocalDateE4.p(a.DAY_OF_MONTH);
                                chronoLocalDateE3 = chronoLocalDateE4.e(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j$.com.android.tools.r8.a.q(j, a(l(iP, iB), iP)), 7), iH - b(chronoLocalDateE4)), (TemporalUnit) ChronoUnit.DAYS);
                                aVar = aVar4;
                            } else {
                                aVar = aVar4;
                                ChronoLocalDate chronoLocalDateG = kVarP.G(iS, aVar.S(jLongValue2), 1);
                                long jA = tVar.a(j, this);
                                int iB2 = b(chronoLocalDateG);
                                int iP2 = chronoLocalDateG.p(a.DAY_OF_MONTH);
                                ChronoLocalDate chronoLocalDateE5 = chronoLocalDateG.e((((int) (jA - a(l(iP2, iB2), iP2))) * 7) + (iH - b(chronoLocalDateG)), (TemporalUnit) ChronoUnit.DAYS);
                                if (f2 == F.STRICT && chronoLocalDateE5.v(aVar) != jLongValue2) {
                                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                                }
                                chronoLocalDateE3 = chronoLocalDateE5;
                            }
                            map.remove(this);
                            map.remove(aVar3);
                            map.remove(aVar);
                            map.remove(aVar2);
                            return chronoLocalDateE3;
                        }
                    }
                    if (r7 == ChronoUnit.YEARS) {
                        long j2 = i2;
                        ChronoLocalDate chronoLocalDateG2 = kVarP.G(iS, 1, 1);
                        if (f2 == F.LENIENT) {
                            int iB3 = b(chronoLocalDateG2);
                            int iP3 = chronoLocalDateG2.p(a.DAY_OF_YEAR);
                            chronoLocalDateE2 = chronoLocalDateG2.e(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j$.com.android.tools.r8.a.q(j2, a(l(iP3, iB3), iP3)), 7), iH - b(chronoLocalDateG2)), (TemporalUnit) ChronoUnit.DAYS);
                        } else {
                            long jA2 = tVar.a(j2, this);
                            int iB4 = b(chronoLocalDateG2);
                            int iP4 = chronoLocalDateG2.p(a.DAY_OF_YEAR);
                            ChronoLocalDate chronoLocalDateE6 = chronoLocalDateG2.e((((int) (jA2 - a(l(iP4, iB4), iP4))) * 7) + (iH - b(chronoLocalDateG2)), (TemporalUnit) ChronoUnit.DAYS);
                            if (f2 == F.STRICT && chronoLocalDateE6.v(aVar3) != iS) {
                                throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
                            }
                            chronoLocalDateE2 = chronoLocalDateE6;
                        }
                        map.remove(this);
                        map.remove(aVar3);
                        map.remove(aVar2);
                        return chronoLocalDateE2;
                    }
                } else if ((r7 == WeekFields.h || r7 == ChronoUnit.FOREVER) && map.containsKey(weekFields.f) && map.containsKey(weekFields.e)) {
                    int iA = ((u) weekFields.f).e.a(((Long) map.get(weekFields.f)).longValue(), weekFields.f);
                    if (f2 == F.LENIENT) {
                        chronoLocalDateE = f(kVarP, iA, 1, iH).e(j$.com.android.tools.r8.a.q(((Long) map.get(weekFields.e)).longValue(), 1L), (TemporalUnit) chronoUnit);
                    } else {
                        ChronoLocalDate chronoLocalDateF = f(kVarP, iA, ((u) weekFields.e).e.a(((Long) map.get(weekFields.e)).longValue(), weekFields.e), iH);
                        if (f2 == F.STRICT && c(chronoLocalDateF) != iA) {
                            throw new j$.time.c("Strict mode rejected resolved date as it is in a different week-based-year");
                        }
                        chronoLocalDateE = chronoLocalDateF;
                    }
                    map.remove(this);
                    map.remove(weekFields.f);
                    map.remove(weekFields.e);
                    map.remove(aVar2);
                    return chronoLocalDateE;
                }
            }
        }
        return null;
    }

    @Override // j$.time.temporal.q
    public final long r(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            iC = b(temporalAccessor);
        } else {
            if (r1 == ChronoUnit.MONTHS) {
                int iB = b(temporalAccessor);
                int iP = temporalAccessor.p(a.DAY_OF_MONTH);
                return a(l(iP, iB), iP);
            }
            if (r1 == ChronoUnit.YEARS) {
                int iB2 = b(temporalAccessor);
                int iP2 = temporalAccessor.p(a.DAY_OF_YEAR);
                return a(l(iP2, iB2), iP2);
            }
            if (r1 == WeekFields.h) {
                iC = d(temporalAccessor);
            } else {
                if (r1 != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable, rangeUnit: " + r1 + ", this: " + this);
                }
                iC = c(temporalAccessor);
            }
        }
        return iC;
    }

    @Override // j$.time.temporal.q
    public final boolean s(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return true;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return temporalAccessor.f(a.DAY_OF_MONTH);
        }
        if (r1 != ChronoUnit.YEARS && r1 != WeekFields.h) {
            if (r1 == ChronoUnit.FOREVER) {
                return temporalAccessor.f(a.YEAR);
            }
            return false;
        }
        return temporalAccessor.f(a.DAY_OF_YEAR);
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalUnit, java.lang.Enum] */
    @Override // j$.time.temporal.q
    public final Temporal v(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.p(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.e(r0 - r1, this.c);
        }
        WeekFields weekFields = this.b;
        return f(AbstractC5402g.p(temporal), (int) j, temporal.p(weekFields.e), temporal.p(weekFields.c));
    }
}
