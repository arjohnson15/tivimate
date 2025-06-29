package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p334.C3789;

/* loaded from: classes2.dex */
public final class k implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final k e;
    public static final k f;
    public static final k g;
    private static final k[] h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            k[] kVarArr = h;
            if (i >= kVarArr.length) {
                k kVar = kVarArr[0];
                g = kVar;
                k kVar2 = kVarArr[12];
                e = kVar;
                f = new k(23, 59, 59, 999999999);
                return;
            }
            kVarArr[i] = new k(i, 0, 0, 0);
            i++;
        }
    }

    private k(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static k T(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new k(i, i2, i3, i4);
    }

    public static k U(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        k kVar = (k) temporalAccessor.A(j$.time.temporal.l.g());
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int V(j$.time.temporal.q qVar) {
        int i = j.a[((j$.time.temporal.a) qVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return (int) (k0() / 1000000);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.c;
            case 8:
                return l0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    public static k a0(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.T(i);
        return h[i];
    }

    public static k b0(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.T(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.T(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.T(i3);
        j$.time.temporal.a.NANO_OF_SECOND.T(i4);
        return T(i, i2, i3, i4);
    }

    public static k c0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.T(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return T(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static k d0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.T(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return T(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    static k j0(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 >= 0) {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r5 = ~b2;
                i2 = 0;
                b = r5;
                i = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i = ~b3;
                    b = b2;
                } else {
                    int i4 = objectInput.readInt();
                    i = b3;
                    i2 = i4;
                    b = b2;
                }
            }
            return b0(i3, b, i, i2);
        }
        i3 = ~i3;
        i = 0;
        i2 = 0;
        return b0(i3, b, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.l() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.i()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.l.f()) {
            return null;
        }
        return rVar == j$.time.temporal.l.j() ? ChronoUnit.NANOS : rVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.a, kVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.b, kVar.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.c, kVar.c);
        return iCompare3 == 0 ? Integer.compare(this.d, kVar.d) : iCompare3;
    }

    public final int W() {
        return this.a;
    }

    public final int X() {
        return this.b;
    }

    public final int Y() {
        return this.d;
    }

    public final int Z() {
        return this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final k e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (k) temporalUnit.n(this, j);
        }
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return h0(j);
            case 2:
                return h0((j % 86400000000L) * 1000);
            case 3:
                return h0((j % 86400000) * 1000000);
            case 4:
                return i0(j);
            case 5:
                return g0(j);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return f0(j);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return f0((j % 2) * 12);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() : qVar != null && qVar.s(this);
    }

    public final k f0(long j) {
        if (j == 0) {
            return this;
        }
        return T(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final k g0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : T(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final k h0(long j) {
        if (j == 0) {
            return this;
        }
        long jK0 = k0();
        long j2 = (((j % 86400000000000L) + jK0) + 86400000000000L) % 86400000000000L;
        return jK0 == j2 ? this : T((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final int hashCode() {
        long jK0 = k0();
        return (int) (jK0 ^ (jK0 >>> 32));
    }

    public final k i0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : T(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final long k0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int l0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final k d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (k) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.T(j);
        int i = j.a[aVar.ordinal()];
        byte b = this.a;
        switch (i) {
            case 1:
                return p0((int) j);
            case 2:
                return c0(j);
            case 3:
                return p0(((int) j) * 1000);
            case 4:
                return c0(j * 1000);
            case 5:
                return p0(((int) j) * 1000000);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return c0(j * 1000000);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return q0((int) j);
            case 8:
                return i0(j - l0());
            case 9:
                return o0((int) j);
            case 10:
                return g0(j - ((b * 60) + this.b));
            case 11:
                return f0(j - (b % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return f0(j - (b % 12));
            case 13:
                return n0((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return n0((int) j);
            case 15:
                return f0((j - (b / 12)) * 12);
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    public final k n0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.HOUR_OF_DAY.T(i);
        return T(i, this.b, this.c, this.d);
    }

    public final k o0(int i) {
        if (this.b == i) {
            return this;
        }
        j$.time.temporal.a.MINUTE_OF_HOUR.T(i);
        return T(this.a, i, this.c, this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? V(qVar) : j$.time.temporal.l.a(this, qVar);
    }

    public final k p0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.T(i);
        return T(this.a, this.b, this.c, i);
    }

    public final k q0(int i) {
        if (this.c == i) {
            return this;
        }
        j$.time.temporal.a.SECOND_OF_MINUTE.T(i);
        return T(this.a, this.b, i, this.d);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        localDate.getClass();
        return (k) AbstractC5402g.a(localDate, this);
    }

    final void r0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        k kVarU = U(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, kVarU);
        }
        long jK0 = kVarU.k0() - k0();
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jK0;
            case 2:
                return jK0 / 1000;
            case 3:
                return jK0 / 1000000;
            case 4:
                return jK0 / 1000000000;
            case 5:
                return jK0 / 60000000000L;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return jK0 / 3600000000000L;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return jK0 / 43200000000000L;
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.NANO_OF_DAY ? k0() : qVar == j$.time.temporal.a.MICRO_OF_DAY ? k0() / 1000 : V(qVar) : qVar.r(this);
    }
}
