package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;
import p334.C3789;

/* renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5398c implements ChronoLocalDate, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC5398c() {
    }

    static ChronoLocalDate S(k kVar, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        AbstractC5396a abstractC5396a = (AbstractC5396a) kVar;
        if (abstractC5396a.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC5396a.m() + ", actual: " + chronoLocalDate.a().m());
    }

    private long T(ChronoLocalDate chronoLocalDate) {
        if (a().K(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jV = v(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((chronoLocalDate.v(aVar) * 32) + chronoLocalDate.p(aVar2)) - (jV + j$.time.temporal.l.a(this, aVar2))) / 32;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.j(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal C(Temporal temporal) {
        return AbstractC5402g.a(this, temporal);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public l D() {
        return a().R(j$.time.temporal.l.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate H(j$.time.temporal.p pVar) {
        return S(a(), pVar.n(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean I() {
        return a().Q(v(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M */
    public ChronoLocalDate n(long j, TemporalUnit temporalUnit) {
        return S(a(), j$.time.temporal.l.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int O() {
        return I() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: P */
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return AbstractC5402g.b(this, chronoLocalDate);
    }

    abstract ChronoLocalDate U(long j);

    abstract ChronoLocalDate V(long j);

    abstract ChronoLocalDate W(long j);

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return S(a(), qVar.v(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return S(a(), temporalUnit.n(this, j));
            }
            throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC5397b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return U(j);
            case 2:
                return U(j$.com.android.tools.r8.a.p(j, 7));
            case 3:
                return V(j);
            case 4:
                return W(j);
            case 5:
                return W(j$.com.android.tools.r8.a.p(j, 10));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return W(j$.com.android.tools.r8.a.p(j, 100));
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return W(j$.com.android.tools.r8.a.p(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.j(v(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && AbstractC5402g.b(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return AbstractC5402g.h(this, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jW = w();
        return ((AbstractC5396a) a()).hashCode() ^ ((int) (jW ^ (jW >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public ChronoLocalDate r(j$.time.temporal.m mVar) {
        return S(a(), mVar.C(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long jV = v(j$.time.temporal.a.YEAR_OF_ERA);
        long jV2 = v(j$.time.temporal.a.MONTH_OF_YEAR);
        long jV3 = v(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC5396a) a()).m());
        sb.append(" ");
        sb.append(D());
        sb.append(" ");
        sb.append(jV);
        sb.append(jV2 < 10 ? "-0" : "-");
        sb.append(jV2);
        sb.append(jV3 < 10 ? "-0" : "-");
        sb.append(jV3);
        return sb.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateQ = a().q(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateQ);
        }
        switch (AbstractC5397b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateQ.w() - w();
            case 2:
                return (chronoLocalDateQ.w() - w()) / 7;
            case 3:
                return T(chronoLocalDateQ);
            case 4:
                return T(chronoLocalDateQ) / 12;
            case 5:
                return T(chronoLocalDateQ) / 120;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return T(chronoLocalDateQ) / 1200;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return T(chronoLocalDateQ) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return chronoLocalDateQ.v(aVar) - v(aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long w() {
        return v(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime y(j$.time.k kVar) {
        return C5400e.T(this, kVar);
    }
}
