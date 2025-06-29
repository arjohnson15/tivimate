package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r extends AbstractC5396a implements Serializable {
    public static final r d = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    private r() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC5396a
    final void A(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.T(l.longValue());
            }
            AbstractC5396a.n(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.n(l.longValue(), r4)) + 1);
            AbstractC5396a.n(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.o(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDateTime B(Temporal temporal) {
        return LocalDateTime.T(temporal);
    }

    @Override // j$.time.chrono.AbstractC5396a
    final ChronoLocalDate C(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iS = aVar.S(((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (f == j$.time.format.F.LENIENT) {
            return LocalDate.of(iS, 1, 1).j0(j$.com.android.tools.r8.a.q(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.com.android.tools.r8.a.q(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iS2 = aVar2.S(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iS3 = aVar3.S(((Long) map.remove(aVar3)).longValue());
        if (f == j$.time.format.F.SMART) {
            if (iS2 == 4 || iS2 == 6 || iS2 == 9 || iS2 == 11) {
                iS3 = Math.min(iS3, 30);
            } else if (iS2 == 2) {
                j$.time.m mVar = j$.time.m.FEBRUARY;
                long j = iS;
                int i = j$.time.v.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iS3 = Math.min(iS3, mVar.T(z));
            }
        }
        return LocalDate.of(iS, iS2, iS3);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDate J(Map map, j$.time.format.F f) {
        return (LocalDate) super.J(map, f);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        return aVar.n();
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.T(instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List N() {
        return j$.com.android.tools.r8.a.l(s.values());
    }

    @Override // j$.time.chrono.k
    public final boolean Q(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // j$.time.chrono.k
    public final l R(int i) {
        if (i == 0) {
            return s.BCE;
        }
        if (i == 1) {
            return s.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC5396a
    final ChronoLocalDate S(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            aVar2.T(((Long) map.get(aVar2)).longValue());
            return null;
        }
        if (f != j$.time.format.F.LENIENT) {
            aVar.T(l.longValue());
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                AbstractC5396a.n(map, j$.time.temporal.a.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC5396a.n(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.q(1L, l.longValue()));
                return null;
            }
            throw new j$.time.c("Invalid value for era: " + l2);
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        Long l3 = (Long) map.get(aVar3);
        if (f != j$.time.format.F.STRICT) {
            AbstractC5396a.n(map, aVar3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.com.android.tools.r8.a.q(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(aVar, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.com.android.tools.r8.a.q(1L, jLongValue2);
        }
        AbstractC5396a.n(map, aVar3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate l(long j) {
        return LocalDate.g0(j);
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "ISO";
    }

    @Override // j$.time.chrono.AbstractC5396a
    public final ChronoLocalDate p() {
        j$.time.b bVarB = j$.time.b.b();
        Objects.requireNonNull(bVarB, "clock");
        return LocalDate.U(LocalDate.e0(bVarB));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return LocalDate.U(temporalAccessor);
    }

    @Override // j$.time.chrono.k
    public final String u() {
        return "iso8601";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i, int i2) {
        return LocalDate.h0(i, i2);
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoZonedDateTime z(Temporal temporal) {
        return ZonedDateTime.S(temporal);
    }
}
