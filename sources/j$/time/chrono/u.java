package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p334.C3789;

/* loaded from: classes2.dex */
public final class u extends AbstractC5396a implements Serializable {
    public static final u d = new u();
    private static final long serialVersionUID = 459996390165777884L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new w(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDate J(Map map, j$.time.format.F f) {
        return (w) super.J(map, f);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        switch (t.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.s("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.t.k(1L, x.z(), 999999999 - x.l().m().getYear());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.time.temporal.t.k(1L, x.x(), j$.time.temporal.a.DAY_OF_YEAR.n().d());
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.temporal.t.j(w.d.getYear(), 999999999L);
            case 8:
                return j$.time.temporal.t.j(x.d.getValue(), x.l().getValue());
            default:
                return aVar.n();
        }
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.T(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List N() {
        return j$.com.android.tools.r8.a.l(x.B());
    }

    @Override // j$.time.chrono.k
    public final boolean Q(long j) {
        return r.d.Q(j);
    }

    @Override // j$.time.chrono.k
    public final l R(int i) {
        return x.u(i);
    }

    @Override // j$.time.chrono.AbstractC5396a
    final ChronoLocalDate S(Map map, j$.time.format.F f) {
        w wVarB0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        x xVarU = l != null ? x.u(K(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? K(aVar2).a(l2.longValue(), aVar2) : 0;
        if (xVarU == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && f != j$.time.format.F.STRICT) {
            xVarU = x.B()[x.B().length - 1];
        }
        if (l2 != null && xVarU != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return new w(LocalDate.of((xVarU.m().getYear() + iA) - 1, 1, 1)).Y(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).Y(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (f != j$.time.format.F.SMART) {
                        LocalDate localDate = w.d;
                        Objects.requireNonNull(xVarU, "era");
                        LocalDate localDateOf = LocalDate.of((xVarU.m().getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.isBefore(xVarU.m()) || xVarU != x.g(localDateOf)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new w(xVarU, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int year = (xVarU.m().getYear() + iA) - 1;
                    try {
                        wVarB0 = new w(LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.c unused) {
                        wVarB0 = new w(LocalDate.of(year, iA2, 1)).b0(new j$.time.temporal.o(0));
                    }
                    if (wVarB0.X() == xVarU || j$.time.temporal.l.a(wVarB0, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return wVarB0;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + xVarU + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (f == j$.time.format.F.LENIENT) {
                    return new w(LocalDate.h0((xVarU.m().getYear() + iA) - 1, 1)).Y(j$.com.android.tools.r8.a.q(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = w.d;
                Objects.requireNonNull(xVarU, "era");
                LocalDate localDateH0 = iA == 1 ? LocalDate.h0(xVarU.m().getYear(), (xVarU.m().Y() + iA4) - 1) : LocalDate.h0((xVarU.m().getYear() + iA) - 1, iA4);
                if (localDateH0.isBefore(xVarU.m()) || xVarU != x.g(localDateH0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new w(xVarU, iA, localDateH0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (!(lVar instanceof x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        x xVar = (x) lVar;
        int year = (xVar.m().getYear() + i) - 1;
        if (i == 1) {
            return year;
        }
        if (year < -999999999 || year > 999999999 || year < xVar.m().getYear() || lVar != x.g(LocalDate.of(year, 1, 1))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate l(long j) {
        return new w(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "Japanese";
    }

    @Override // j$.time.chrono.AbstractC5396a
    public final ChronoLocalDate p() {
        return new w(LocalDate.U(LocalDate.e0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof w ? (w) temporalAccessor : new w(LocalDate.U(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final String u() {
        return "japanese";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i, int i2) {
        return new w(LocalDate.h0(i, i2));
    }
}
