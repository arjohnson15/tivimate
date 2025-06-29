package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z extends AbstractC5396a implements Serializable {
    public static final z d = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new B(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDate J(Map map, j$.time.format.F f) {
        return (B) super.J(map, f);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i = y.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVarN = j$.time.temporal.a.PROLEPTIC_MONTH.n();
            return j$.time.temporal.t.j(tVarN.e() - 22932, tVarN.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.t tVarN2 = j$.time.temporal.a.YEAR.n();
            return j$.time.temporal.t.k(1L, tVarN2.d() - 1911, (-tVarN2.e()) + 1912);
        }
        if (i != 3) {
            return aVar.n();
        }
        j$.time.temporal.t tVarN3 = j$.time.temporal.a.YEAR.n();
        return j$.time.temporal.t.j(tVarN3.e() - 1911, tVarN3.d() - 1911);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.T(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List N() {
        return j$.com.android.tools.r8.a.l(C.values());
    }

    @Override // j$.time.chrono.k
    public final boolean Q(long j) {
        return r.d.Q(j + 1911);
    }

    @Override // j$.time.chrono.k
    public final l R(int i) {
        if (i == 0) {
            return C.BEFORE_ROC;
        }
        if (i == 1) {
            return C.ROC;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof C) {
            return lVar == C.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate l(long j) {
        return new B(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "Minguo";
    }

    @Override // j$.time.chrono.AbstractC5396a
    public final ChronoLocalDate p() {
        return new B(LocalDate.U(LocalDate.e0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof B ? (B) temporalAccessor : new B(LocalDate.U(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final String u() {
        return "roc";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i, int i2) {
        return new B(LocalDate.h0(i + 1911, i2));
    }
}
