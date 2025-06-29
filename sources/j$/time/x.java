package j$.time;

import j$.time.chrono.AbstractC5396a;
import j$.time.chrono.AbstractC5402g;
import j$.time.format.G;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import p334.C3789;

/* loaded from: classes2.dex */
public final class x implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.y(Locale.getDefault());
    }

    private x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long S() {
        return ((this.a * 12) + this.b) - 1;
    }

    public static x T(int i, int i2) {
        j$.time.temporal.a.YEAR.T(i);
        j$.time.temporal.a.MONTH_OF_YEAR.T(i2);
        return new x(i, i2);
    }

    private x X(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new x(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.e() ? j$.time.chrono.r.d : rVar == j$.time.temporal.l.j() ? ChronoUnit.MONTHS : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        if (!((AbstractC5396a) AbstractC5402g.p(temporal)).equals(j$.time.chrono.r.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(S(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final x e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (x) temporalUnit.n(this, j);
        }
        switch (w.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return V(j);
            case 2:
                return W(j);
            case 3:
                return W(j$.com.android.tools.r8.a.p(j, 10));
            case 4:
                return W(j$.com.android.tools.r8.a.p(j, 100));
            case 5:
                return W(j$.com.android.tools.r8.a.p(j, 1000));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.j(v(aVar), j), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    public final x V(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return X(j$.time.temporal.a.YEAR.S(j$.com.android.tools.r8.a.o(j2, j3)), ((int) j$.com.android.tools.r8.a.n(j2, j3)) + 1);
    }

    public final x W(long j) {
        return j == 0 ? this : X(j$.time.temporal.a.YEAR.S(this.a + j), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final x d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (x) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.T(j);
        int i = w.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.T(i3);
            return X(i2, i3);
        }
        if (i == 2) {
            return V(j - S());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.T(i5);
            return X(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.T(i6);
            return X(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        if (v(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.T(i7);
        return X(i7, i4);
    }

    final void Z(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i = this.a - xVar.a;
        return i == 0 ? this.b - xVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return s(qVar).a(v(qVar), qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        localDate.getClass();
        return (x) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        x xVarT;
        if (temporal instanceof x) {
            xVarT = (x) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.d.equals(AbstractC5402g.p(temporal))) {
                    temporal = LocalDate.U(temporal);
                }
                xVarT = T(temporal.p(j$.time.temporal.a.YEAR), temporal.p(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e) {
                throw new c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, xVarT);
        }
        long jS = xVarT.S() - S();
        switch (w.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jS;
            case 2:
                return jS / 12;
            case 3:
                return jS / 120;
            case 4:
                return jS / 1200;
            case 5:
                return jS / 12000;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return xVarT.v(aVar) - v(aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = w.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return S();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }
}
