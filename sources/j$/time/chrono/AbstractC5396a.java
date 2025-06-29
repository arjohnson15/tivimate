package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5396a implements k {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC5396a() {
    }

    static void n(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    static k r(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            k kVar = (k) concurrentHashMap.get(str);
            if (kVar == null) {
                kVar = (k) b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(k.class).iterator();
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    if (str.equals(kVar2.m()) || str.equals(kVar2.u())) {
                        return kVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: " + str);
            }
            n nVar = n.o;
            s(nVar, nVar.m());
            u uVar = u.d;
            s(uVar, uVar.m());
            z zVar = z.d;
            s(zVar, zVar.m());
            F f = F.d;
            s(f, f.m());
            Iterator it2 = ServiceLoader.load(AbstractC5396a.class, null).iterator();
            while (it2.hasNext()) {
                AbstractC5396a abstractC5396a = (AbstractC5396a) it2.next();
                if (!abstractC5396a.m().equals("ISO")) {
                    s(abstractC5396a, abstractC5396a.m());
                }
            }
            r rVar = r.d;
            s(rVar, rVar.m());
        }
    }

    static k s(AbstractC5396a abstractC5396a, String str) {
        String strU;
        k kVar = (k) a.putIfAbsent(str, abstractC5396a);
        if (kVar == null && (strU = abstractC5396a.u()) != null) {
            b.putIfAbsent(strU, abstractC5396a);
        }
        return kVar;
    }

    static ChronoLocalDate v(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateE = chronoLocalDate.e(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateE2 = chronoLocalDateE.e(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateE2 = chronoLocalDateE2.e(j$.com.android.tools.r8.a.q(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateE2.r(new j$.time.temporal.n(DayOfWeek.of((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        chronoLocalDateE2 = chronoLocalDateE2.e(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateE2.r(new j$.time.temporal.n(DayOfWeek.of((int) j3).getValue(), 0));
    }

    void A(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.T(l.longValue());
            }
            ChronoLocalDate chronoLocalDateD = p().d(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).d(l.longValue(), (j$.time.temporal.q) aVar);
            n(map, j$.time.temporal.a.MONTH_OF_YEAR, chronoLocalDateD.p(r0));
            n(map, j$.time.temporal.a.YEAR, chronoLocalDateD.p(r0));
        }
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime B(Temporal temporal) {
        try {
            return q(temporal).y(j$.time.k.U(temporal));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    ChronoLocalDate C(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = K(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (f == j$.time.format.F.LENIENT) {
            long jQ = j$.com.android.tools.r8.a.q(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return G(iA, 1, 1).e(jQ, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.q(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (f != j$.time.format.F.SMART) {
            return G(iA, iA2, iA3);
        }
        try {
            return G(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return G(iA, iA2, 1).r(new j$.time.temporal.o(0));
        }
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDate J(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return l(((Long) map.remove(aVar)).longValue());
        }
        A(map, f);
        ChronoLocalDate chronoLocalDateS = S(map, f);
        if (chronoLocalDateS != null) {
            return chronoLocalDateS;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return C(map, f);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        long jQ = j$.com.android.tools.r8.a.q(((Long) map.remove(aVar3)).longValue(), 1L);
                        return G(iA, 1, 1).e(jQ, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    ChronoLocalDate chronoLocalDateE = G(iA, iA2, 1).e((K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (f != j$.time.format.F.STRICT || chronoLocalDateE.p(aVar3) == iA2) {
                        return chronoLocalDateE;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA4 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return v(G(iA4, 1, 1), j$.com.android.tools.r8.a.q(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.q(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.q(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA5 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate chronoLocalDateR = G(iA4, iA5, 1).e((K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).r(new j$.time.temporal.n(DayOfWeek.of(K(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (f != j$.time.format.F.STRICT || chronoLocalDateR.p(aVar3) == iA5) {
                        return chronoLocalDateR;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA6 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (f != j$.time.format.F.LENIENT) {
                return x(iA6, K(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return x(iA6, 1).e(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA7 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (f == j$.time.format.F.LENIENT) {
                return x(iA7, 1).e(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            ChronoLocalDate chronoLocalDateE2 = x(iA7, 1).e((K(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (f != j$.time.format.F.STRICT || chronoLocalDateE2.p(aVar2) == iA7) {
                return chronoLocalDateE2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA9 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (f == j$.time.format.F.LENIENT) {
            return v(x(iA9, 1), 0L, j$.com.android.tools.r8.a.q(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.q(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateR2 = x(iA9, 1).e((K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).r(new j$.time.temporal.n(DayOfWeek.of(K(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (f != j$.time.format.F.STRICT || chronoLocalDateR2.p(aVar2) == iA9) {
            return chronoLocalDateR2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    ChronoLocalDate S(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            K(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        int iA = f != j$.time.format.F.LENIENT ? K(aVar).a(l.longValue(), aVar) : j$.com.android.tools.r8.a.i(l.longValue());
        if (l2 != null) {
            n(map, j$.time.temporal.a.YEAR, g(R(K(r2).a(l2.longValue(), r2)), iA));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            n(map, aVar3, g(x(K(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).D(), iA));
            return null;
        }
        if (f == j$.time.format.F.STRICT) {
            map.put(aVar, l);
            return null;
        }
        if (N().isEmpty()) {
            n(map, aVar3, iA);
            return null;
        }
        n(map, aVar3, g((l) r9.get(r9.size() - 1), iA));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m().compareTo(((k) obj).m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC5396a) && m().compareTo(((AbstractC5396a) obj).m()) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ m().hashCode();
    }

    public abstract /* synthetic */ ChronoLocalDate p();

    public final String toString() {
        return m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.k
    public ChronoZonedDateTime z(Temporal temporal) {
        try {
            ZoneId zoneIdS = ZoneId.S(temporal);
            try {
                temporal = L(Instant.T(temporal), zoneIdS);
                return temporal;
            } catch (j$.time.c unused) {
                return j.S(zoneIdS, null, C5400e.S(this, B(temporal)));
            }
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }
}
