package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5402g {
    public static Temporal a(ChronoLocalDate chronoLocalDate, Temporal temporal) {
        return temporal.d(chronoLocalDate.w(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int iCompare = Long.compare(chronoLocalDate.w(), chronoLocalDate2.w());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC5396a) chronoLocalDate.a()).m().compareTo(chronoLocalDate2.a().m());
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.c().compareTo(chronoLocalDateTime2.c());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iS = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        if (iS != 0) {
            return iS;
        }
        return ((AbstractC5396a) chronoLocalDateTime.a()).m().compareTo(chronoLocalDateTime2.a().m());
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iY = chronoZonedDateTime.b().Y() - chronoZonedDateTime2.b().Y();
        if (iY != 0) {
            return iY;
        }
        int iE = chronoZonedDateTime.F().compareTo(chronoZonedDateTime2.F());
        if (iE != 0) {
            return iE;
        }
        int iCompareTo = chronoZonedDateTime.t().m().compareTo(chronoZonedDateTime2.t().m());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return ((AbstractC5396a) chronoZonedDateTime.a()).m().compareTo(chronoZonedDateTime2.a().m());
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.a(chronoZonedDateTime, qVar);
        }
        int i = AbstractC5403h.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.F().p(qVar) : chronoZonedDateTime.h().a0();
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(l lVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? lVar.getValue() : j$.time.temporal.l.a(lVar, aVar);
    }

    public static long g(l lVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.r(lVar);
    }

    public static boolean h(ChronoLocalDate chronoLocalDate, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).C() : qVar != null && qVar.s(chronoLocalDate);
    }

    public static boolean i(l lVar, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(lVar);
    }

    public static Object j(ChronoLocalDate chronoLocalDate, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.l() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.i() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        return rVar == j$.time.temporal.l.e() ? chronoLocalDate.a() : rVar == j$.time.temporal.l.j() ? ChronoUnit.DAYS : rVar.g(chronoLocalDate);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.l() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.i()) {
            return null;
        }
        return rVar == j$.time.temporal.l.g() ? chronoLocalDateTime.b() : rVar == j$.time.temporal.l.e() ? chronoLocalDateTime.a() : rVar == j$.time.temporal.l.j() ? ChronoUnit.NANOS : rVar.g(chronoLocalDateTime);
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.l()) ? chronoZonedDateTime.t() : rVar == j$.time.temporal.l.i() ? chronoZonedDateTime.h() : rVar == j$.time.temporal.l.g() ? chronoZonedDateTime.b() : rVar == j$.time.temporal.l.e() ? chronoZonedDateTime.a() : rVar == j$.time.temporal.l.j() ? ChronoUnit.NANOS : rVar.g(chronoZonedDateTime);
    }

    public static Object m(l lVar, j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.j() ? ChronoUnit.ERAS : j$.time.temporal.l.c(lVar, rVar);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.c().w() * 86400) + chronoLocalDateTime.b().l0()) - zoneOffset.a0();
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().w() * 86400) + chronoZonedDateTime.b().l0()) - chronoZonedDateTime.h().a0();
    }

    public static k p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (k) temporalAccessor.A(j$.time.temporal.l.e());
        r rVar = r.d;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) objRequireNonNull;
    }
}
