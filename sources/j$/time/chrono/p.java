package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import p334.C3789;

/* loaded from: classes2.dex */
public final class p extends AbstractC5398c {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient n a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private p(n nVar, int i, int i2, int i3) {
        nVar.Y(i, i2, i3);
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private p(n nVar, long j) {
        int[] iArrZ = nVar.Z((int) j);
        this.a = nVar;
        this.b = iArrZ[0];
        this.c = iArrZ[1];
        this.d = iArrZ[2];
    }

    private int X() {
        return this.a.X(this.b, this.c) + this.d;
    }

    static p Y(n nVar, int i, int i2, int i3) {
        return new p(nVar, i, i2, i3);
    }

    static p Z(n nVar, long j) {
        return new p(nVar, j);
    }

    private p c0(int i, int i2, int i3) {
        n nVar = this.a;
        int iA0 = nVar.a0(i, i2);
        if (i3 > iA0) {
            i3 = iA0;
        }
        return new p(nVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final l D() {
        return q.AH;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.p pVar) {
        return (p) super.H(pVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final boolean I() {
        return this.a.Q(this.b);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDate n(long j, TemporalUnit temporalUnit) {
        return (p) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final int O() {
        return this.a.b0(this.b);
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate W(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return c0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC5398c
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final p U(long j) {
        return new p(this.a, w() + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC5398c
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final p V(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return c0(this.a.U(j$.com.android.tools.r8.a.o(j2, 12L)), ((int) j$.com.android.tools.r8.a.n(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final p d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (p) super.d(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        n nVar = this.a;
        nVar.K(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = o.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return c0(i5, i4, i);
            case 2:
                return U(Math.min(i, O()) - X());
            case 3:
                return U((j - v(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return U(j - (((int) j$.com.android.tools.r8.a.n(w() + 3, 7)) + 1));
            case 5:
                return U(j - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return U(j - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p(nVar, j);
            case 8:
                return U((j - v(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return c0(i5, i, i3);
            case 10:
                return V(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return c0(i, i4, i3);
            case 12:
                return c0(i, i4, i3);
            case 13:
                return c0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate e(long j, TemporalUnit temporalUnit) {
        return (p) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (p) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.a.equals(pVar.a);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int iHashCode = this.a.m().hashCode();
        int i = this.b;
        return (iHashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: k */
    public final ChronoLocalDate r(j$.time.temporal.m mVar) {
        return (p) super.r(mVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (p) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        return (p) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (!AbstractC5402g.h(this, qVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = o.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.K(aVar) : j$.time.temporal.t.j(1L, 5L) : j$.time.temporal.t.j(1L, O()) : j$.time.temporal.t.j(1L, r2.a0(this.b, this.c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = o.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return X();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.n(w() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((X() - 1) % 7) + 1;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return w();
            case 8:
                return ((X() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final long w() {
        return this.a.Y(this.b, this.c, this.d);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.k kVar) {
        return C5400e.T(this, kVar);
    }
}
