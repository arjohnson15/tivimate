package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F extends AbstractC5396a implements Serializable {
    public static final F d = new F();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private F() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new H(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDate J(Map map, j$.time.format.F f) {
        return (H) super.J(map, f);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i = E.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVarN = j$.time.temporal.a.PROLEPTIC_MONTH.n();
            return j$.time.temporal.t.j(tVarN.e() + 6516, tVarN.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.t tVarN2 = j$.time.temporal.a.YEAR.n();
            return j$.time.temporal.t.k(1L, (-(tVarN2.e() + 543)) + 1, tVarN2.d() + 543);
        }
        if (i != 3) {
            return aVar.n();
        }
        j$.time.temporal.t tVarN3 = j$.time.temporal.a.YEAR.n();
        return j$.time.temporal.t.j(tVarN3.e() + 543, tVarN3.d() + 543);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.T(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List N() {
        return j$.com.android.tools.r8.a.l(I.values());
    }

    @Override // j$.time.chrono.k
    public final boolean Q(long j) {
        return r.d.Q(j - 543);
    }

    @Override // j$.time.chrono.k
    public final l R(int i) {
        if (i == 0) {
            return I.BEFORE_BE;
        }
        if (i == 1) {
            return I.BE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof I) {
            return lVar == I.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate l(long j) {
        return new H(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.AbstractC5396a
    public final ChronoLocalDate p() {
        return new H(LocalDate.U(LocalDate.e0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof H ? (H) temporalAccessor : new H(LocalDate.U(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final String u() {
        return "buddhist";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i, int i2) {
        return new H(LocalDate.h0(i - 543, i2));
    }
}
