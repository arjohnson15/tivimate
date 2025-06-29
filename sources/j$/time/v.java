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

/* loaded from: classes2.dex */
public final class v implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.y(Locale.getDefault());
    }

    private v(int i) {
        this.a = i;
    }

    public static v S(int i) {
        j$.time.temporal.a.YEAR.T(i);
        return new v(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.e() ? j$.time.chrono.r.d : rVar == j$.time.temporal.l.j() ? ChronoUnit.YEARS : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        if (!((AbstractC5396a) AbstractC5402g.p(temporal)).equals(j$.time.chrono.r.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final v e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (v) temporalUnit.n(this, j);
        }
        int i = u.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return U(j);
        }
        if (i == 2) {
            return U(j$.com.android.tools.r8.a.p(j, 10));
        }
        if (i == 3) {
            return U(j$.com.android.tools.r8.a.p(j, 100));
        }
        if (i == 4) {
            return U(j$.com.android.tools.r8.a.p(j, 1000));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.j(v(aVar), j), aVar);
        }
        throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
    }

    public final v U(long j) {
        return j == 0 ? this : S(j$.time.temporal.a.YEAR.S(this.a + j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final v d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.T(j);
        int i = u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return S((int) j);
        }
        if (i == 2) {
            return S((int) j);
        }
        if (i == 3) {
            return v(j$.time.temporal.a.ERA) == j ? this : S(1 - i2);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    final void W(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((v) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a == ((v) obj).a;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        return this.a;
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
        return (v) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        v vVarS;
        if (temporal instanceof v) {
            vVarS = (v) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.d.equals(AbstractC5402g.p(temporal))) {
                    temporal = LocalDate.U(temporal);
                }
                vVarS = S(temporal.p(j$.time.temporal.a.YEAR));
            } catch (c e) {
                throw new c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, vVarS);
        }
        long j = vVarS.a - this.a;
        int i = u.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return vVarS.v(aVar) - v(aVar);
        }
        throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = u.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }
}
