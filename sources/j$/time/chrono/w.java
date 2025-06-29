package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p334.C3789;

/* loaded from: classes2.dex */
public final class w extends AbstractC5398c {
    static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient x b;
    private transient int c;

    w(LocalDate localDate) {
        if (localDate.isBefore(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        x xVarG = x.g(localDate);
        this.b = xVarG;
        this.c = (localDate.getYear() - xVarG.m().getYear()) + 1;
        this.a = localDate;
    }

    w(x xVar, int i, LocalDate localDate) {
        if (localDate.isBefore(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = xVar;
        this.c = i;
        this.a = localDate;
    }

    private w a0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new w(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final l D() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.p pVar) {
        return (w) super.H(pVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDate n(long j, TemporalUnit temporalUnit) {
        return (w) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final int O() {
        x xVar = this.b;
        x xVarQ = xVar.q();
        LocalDate localDate = this.a;
        int iO = (xVarQ == null || xVarQ.m().getYear() != localDate.getYear()) ? localDate.O() : xVarQ.m().Y() - 1;
        return this.c == 1 ? iO - (xVar.m().Y() - 1) : iO;
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate U(long j) {
        return a0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate V(long j) {
        return a0(this.a.j0(j));
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate W(long j) {
        return a0(this.a.l0(j));
    }

    public final x X() {
        return this.b;
    }

    public final w Y(long j, ChronoUnit chronoUnit) {
        return (w) super.e(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final w d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (w) super.d(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (v(aVar) == j) {
            return this;
        }
        int[] iArr = v.a;
        int i = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            u uVar = u.d;
            int iA = uVar.K(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return a0(localDate.s0(uVar.g(this.b, iA)));
            }
            if (i2 == 8) {
                return a0(localDate.s0(uVar.g(x.u(iA), this.c)));
            }
            if (i2 == 9) {
                return a0(localDate.s0(iA));
            }
        }
        return a0(localDate.d(j, qVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return u.d;
    }

    public final w b0(j$.time.temporal.o oVar) {
        return (w) super.r(oVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate e(long j, TemporalUnit temporalUnit) {
        return (w) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (w) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).C() : qVar != null && qVar.s(this);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        u.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: k */
    public final ChronoLocalDate r(j$.time.temporal.m mVar) {
        return (w) super.r(mVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (w) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        return (w) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (!f(qVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = v.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.j(1L, this.a.b0());
        }
        if (i == 2) {
            return j$.time.temporal.t.j(1L, O());
        }
        if (i != 3) {
            return u.d.K(aVar);
        }
        x xVar = this.b;
        int year = xVar.m().getYear();
        return xVar.q() != null ? j$.time.temporal.t.j(1L, (r6.m().getYear() - year) + 1) : j$.time.temporal.t.j(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = v.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.c;
        x xVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.Y() - xVar.m().Y()) + 1 : localDate.Y();
            case 3:
                return i2;
            case 4:
            case 5:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
            case 8:
                return xVar.getValue();
            default:
                return localDate.v(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final long w() {
        return this.a.w();
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.k kVar) {
        return C5400e.T(this, kVar);
    }
}
