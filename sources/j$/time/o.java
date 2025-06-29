package j$.time;

import j$.time.chrono.AbstractC5396a;
import j$.time.chrono.AbstractC5402g;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.f("--");
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.DAY_OF_MONTH, 2);
        vVar.y(Locale.getDefault());
    }

    private o(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static o S(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        byte b2 = objectInput.readByte();
        m mVarV = m.V(b);
        Objects.requireNonNull(mVarV, "month");
        j$.time.temporal.a.DAY_OF_MONTH.T(b2);
        if (b2 <= mVarV.U()) {
            return new o(mVarV.getValue(), b2);
        }
        throw new c("Illegal value for DayOfMonth field, value " + ((int) b2) + " is not valid for month " + mVarV.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.e() ? j$.time.chrono.r.d : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        if (!((AbstractC5396a) AbstractC5402g.p(temporal)).equals(j$.time.chrono.r.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        Temporal temporalD = temporal.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalD.d(Math.min(temporalD.s(aVar).d(), this.b), aVar);
    }

    final void T(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i = this.a - oVar.a;
        return i == 0 ? this.b - oVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return s(qVar).a(v(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.n();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.l.d(this, qVar);
        }
        m mVarV = m.V(this.a);
        mVarV.getClass();
        int i = l.a[mVarV.ordinal()];
        return j$.time.temporal.t.k(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, m.V(r8).U());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i2 = n.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
            }
            i = this.a;
        }
        return i;
    }
}
