package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p334.C3789;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5400e implements ChronoLocalDateTime, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient ChronoLocalDate a;
    private final transient j$.time.k b;

    private C5400e(ChronoLocalDate chronoLocalDate, j$.time.k kVar) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(kVar, "time");
        this.a = chronoLocalDate;
        this.b = kVar;
    }

    static C5400e S(k kVar, Temporal temporal) {
        C5400e c5400e = (C5400e) temporal;
        AbstractC5396a abstractC5396a = (AbstractC5396a) kVar;
        if (abstractC5396a.equals(c5400e.a.a())) {
            return c5400e;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC5396a.m() + ", actual: " + c5400e.a.a().m());
    }

    static C5400e T(ChronoLocalDate chronoLocalDate, j$.time.k kVar) {
        return new C5400e(chronoLocalDate, kVar);
    }

    private C5400e W(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.k kVarC0 = this.b;
        if (j5 == 0) {
            return Z(chronoLocalDate, kVarC0);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jK0 = kVarC0.k0();
        long j10 = j9 + jK0;
        long jO = j$.com.android.tools.r8.a.o(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jN = j$.com.android.tools.r8.a.n(j10, 86400000000000L);
        if (jN != jK0) {
            kVarC0 = j$.time.k.c0(jN);
        }
        return Z(chronoLocalDate.e(jO, (TemporalUnit) ChronoUnit.DAYS), kVarC0);
    }

    private C5400e Z(Temporal temporal, j$.time.k kVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == kVar) ? this : new C5400e(AbstractC5398c.S(chronoLocalDate.a(), temporal), kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(c().w(), j$.time.temporal.a.EPOCH_DAY).d(b().k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: E */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC5402g.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final C5400e e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return S(chronoLocalDate.a(), temporalUnit.n(this, j));
        }
        int i = AbstractC5399d.a[((ChronoUnit) temporalUnit).ordinal()];
        j$.time.k kVar = this.b;
        switch (i) {
            case 1:
                return W(this.a, 0L, 0L, 0L, j);
            case 2:
                C5400e c5400eZ = Z(chronoLocalDate.e(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), kVar);
                return c5400eZ.W(c5400eZ.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C5400e c5400eZ2 = Z(chronoLocalDate.e(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), kVar);
                return c5400eZ2.W(c5400eZ2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return V(j);
            case 5:
                return W(this.a, 0L, j, 0L, 0L);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return W(this.a, j, 0L, 0L, 0L);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C5400e c5400eZ3 = Z(chronoLocalDate.e(j / 256, (TemporalUnit) ChronoUnit.DAYS), kVar);
                return c5400eZ3.W(c5400eZ3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(chronoLocalDate.e(j, temporalUnit), kVar);
        }
    }

    final C5400e V(long j) {
        return W(this.a, 0L, 0L, j, 0L);
    }

    public final Instant X(ZoneOffset zoneOffset) {
        return Instant.W(AbstractC5402g.n(this, zoneOffset), this.b.Y());
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C5400e d(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof j$.time.temporal.a;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return S(chronoLocalDate.a(), qVar.v(this, j));
        }
        boolean zU = ((j$.time.temporal.a) qVar).U();
        j$.time.k kVar = this.b;
        return zU ? Z(chronoLocalDate, kVar.d(j, qVar)) : Z(chronoLocalDate.d(j, qVar), kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.k b() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && AbstractC5402g.c(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.C() || aVar.U();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return S(this.a.a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneId zoneId) {
        return j.S(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() ? this.b.p(qVar) : this.a.p(qVar) : s(qVar).a(v(qVar), qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        if (localDate instanceof ChronoLocalDate) {
            return Z(localDate, this.b);
        }
        k kVarA = this.a.a();
        localDate.getClass();
        return S(kVarA, (C5400e) AbstractC5402g.a(localDate, this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (!((j$.time.temporal.a) qVar).U()) {
            return this.a.s(qVar);
        }
        j$.time.k kVar = this.b;
        kVar.getClass();
        return j$.time.temporal.l.d(kVar, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC5402g.n(this, zoneOffset);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDate = this.a;
        ChronoLocalDateTime chronoLocalDateTimeB = chronoLocalDate.a().B(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeB);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        j$.time.k kVar = this.b;
        if (!z) {
            ChronoLocalDate chronoLocalDateC = chronoLocalDateTimeB.c();
            if (chronoLocalDateTimeB.b().compareTo(kVar) < 0) {
                chronoLocalDateC = chronoLocalDateC.n(1L, chronoUnit);
            }
            return chronoLocalDate.until(chronoLocalDateC, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jV = chronoLocalDateTimeB.v(aVar) - chronoLocalDate.v(aVar);
        switch (AbstractC5399d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jV = j$.com.android.tools.r8.a.p(jV, 86400000000000L);
                break;
            case 2:
                jV = j$.com.android.tools.r8.a.p(jV, 86400000000L);
                break;
            case 3:
                jV = j$.com.android.tools.r8.a.p(jV, 86400000L);
                break;
            case 4:
                jV = j$.com.android.tools.r8.a.p(jV, 86400);
                break;
            case 5:
                jV = j$.com.android.tools.r8.a.p(jV, 1440);
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                jV = j$.com.android.tools.r8.a.p(jV, 24);
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                jV = j$.com.android.tools.r8.a.p(jV, 2);
                break;
        }
        return j$.com.android.tools.r8.a.j(jV, kVar.until(chronoLocalDateTimeB.b(), temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).U() ? this.b.v(qVar) : this.a.v(qVar) : qVar.r(this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }
}
