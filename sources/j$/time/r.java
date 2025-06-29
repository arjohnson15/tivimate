package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p334.C3789;

/* loaded from: classes2.dex */
public final class r implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final k a;
    private final ZoneOffset b;

    static {
        k kVar = k.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        kVar.getClass();
        S(kVar, zoneOffset);
        k kVar2 = k.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        kVar2.getClass();
        S(kVar2, zoneOffset2);
    }

    private r(k kVar, ZoneOffset zoneOffset) {
        this.a = (k) Objects.requireNonNull(kVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static r S(k kVar, ZoneOffset zoneOffset) {
        return new r(kVar, zoneOffset);
    }

    static r U(ObjectInput objectInput) {
        return new r(k.j0(objectInput), ZoneOffset.f0(objectInput));
    }

    private long V() {
        return this.a.k0() - (this.b.a0() * 1000000000);
    }

    private r W(k kVar, ZoneOffset zoneOffset) {
        return (this.a == kVar && this.b.equals(zoneOffset)) ? this : new r(kVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i() || rVar == j$.time.temporal.l.k()) {
            return this.b;
        }
        if (((rVar == j$.time.temporal.l.l()) || (rVar == j$.time.temporal.l.e())) || rVar == j$.time.temporal.l.f()) {
            return null;
        }
        return rVar == j$.time.temporal.l.g() ? this.a : rVar == j$.time.temporal.l.j() ? ChronoUnit.NANOS : rVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(this.a.k0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.a0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final r e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? W(this.a.e(j, temporalUnit), this.b) : (r) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        r rVar = (r) obj;
        boolean zEquals = this.b.equals(rVar.b);
        k kVar = this.a;
        k kVar2 = rVar.a;
        return (zEquals || (iCompare = Long.compare(V(), rVar.V())) == 0) ? kVar.compareTo(kVar2) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        k kVar = this.a;
        return qVar == aVar ? W(kVar, ZoneOffset.d0(((j$.time.temporal.a) qVar).S(j))) : W(kVar.d(j, qVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        localDate.getClass();
        return (r) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) qVar).n();
        }
        k kVar = this.a;
        kVar.getClass();
        return j$.time.temporal.l.d(kVar, qVar);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        r rVar;
        if (temporal instanceof r) {
            rVar = (r) temporal;
        } else {
            try {
                rVar = new r(k.U(temporal), ZoneOffset.Z(temporal));
            } catch (c e) {
                throw new c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, rVar);
        }
        long jV = rVar.V() - V();
        switch (q.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jV;
            case 2:
                return jV / 1000;
            case 3:
                return jV / 1000000;
            case 4:
                return jV / 1000000000;
            case 5:
                return jV / 60000000000L;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return jV / 3600000000000L;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return jV / 43200000000000L;
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.a0() : this.a.v(qVar) : qVar.r(this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.r0(objectOutput);
        this.b.g0(objectOutput);
    }
}
