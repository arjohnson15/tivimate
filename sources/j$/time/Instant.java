package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p334.C3789;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    static {
        W(-31557014167219200L, 0L);
        W(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant S(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant T(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return W(temporalAccessor.v(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.p(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant W(long j, long j2) {
        return S(j$.com.android.tools.r8.a.j(j, j$.com.android.tools.r8.a.o(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.n(j2, 1000000000L));
    }

    private Instant X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return W(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.j(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long Z(Instant instant) {
        long jQ = j$.com.android.tools.r8.a.q(instant.a, this.a);
        long j = instant.b - this.b;
        return (jQ <= 0 || j >= 0) ? (jQ >= 0 || j <= 0) ? jQ : jQ + 1 : jQ - 1;
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return S(j$.com.android.tools.r8.a.o(j, j2), ((int) j$.com.android.tools.r8.a.n(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return S(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.j()) {
            return ChronoUnit.NANOS;
        }
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.l() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.i() || rVar == j$.time.temporal.l.f() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        return rVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public final long U() {
        return this.a;
    }

    public final int V() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.n(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(0L, j);
            case 2:
                return X(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return X(j / 1000, (j % 1000) * 1000000);
            case 4:
                return X(j, 0L);
            case 5:
                return X(j$.com.android.tools.r8.a.p(j, 60), 0L);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return X(j$.com.android.tools.r8.a.p(j, 3600), 0L);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return X(j$.com.android.tools.r8.a.p(j, 43200), 0L);
            case 8:
                return X(j$.com.android.tools.r8.a.p(j, 86400), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    final void a0(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.U(this, zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.T(j);
        int i = f.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return S(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return S(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
                }
                if (j != j2) {
                    return S(j, i2);
                }
            }
        } else if (j != i2) {
            return S(j2, (int) j);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.d(this, qVar).a(qVar.r(this), qVar);
        }
        int i = f.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.S(this.a);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        localDate.getClass();
        return (Instant) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j, 1000), i / 1000000) : j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j + 1, 1000), (i / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.f.format(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantT = T(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantT);
        }
        int i = f.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j$.com.android.tools.r8.a.q(instantT.a, j), 1000000000L), instantT.b - i2);
            case 2:
                return j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j$.com.android.tools.r8.a.q(instantT.a, j), 1000000000L), instantT.b - i2) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.q(instantT.toEpochMilli(), toEpochMilli());
            case 4:
                return Z(instantT);
            case 5:
                return Z(instantT) / 60;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return Z(instantT) / 3600;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return Z(instantT) / 43200;
            case 8:
                return Z(instantT) / 86400;
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i2 = f.a[((j$.time.temporal.a) qVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
            }
            i = i3 / 1000000;
        }
        return i;
    }
}
