package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
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
import java.util.List;

/* loaded from: classes2.dex */
final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C5400e a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private j(ZoneId zoneId, ZoneOffset zoneOffset, C5400e c5400e) {
        this.a = (C5400e) Objects.requireNonNull(c5400e, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    static j C(k kVar, Temporal temporal) {
        j jVar = (j) temporal;
        AbstractC5396a abstractC5396a = (AbstractC5396a) kVar;
        if (abstractC5396a.equals(jVar.a())) {
            return jVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC5396a.m() + ", actual: " + jVar.a().m());
    }

    static ChronoZonedDateTime S(ZoneId zoneId, ZoneOffset zoneOffset, C5400e c5400e) {
        Objects.requireNonNull(c5400e, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, c5400e);
        }
        j$.time.zone.f fVarT = zoneId.T();
        LocalDateTime localDateTimeT = LocalDateTime.T(c5400e);
        List listG = fVarT.g(localDateTimeT);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarT.f(localDateTimeT);
            c5400e = c5400e.V(bVarF.r().r());
            zoneOffset = bVarF.s();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, c5400e);
    }

    static j T(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.T().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new j(zoneId, zoneOffsetD, (C5400e) kVar.B(LocalDateTime.b0(instant.U(), instant.V(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.l(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime F() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return C(a(), temporalUnit.n(this, j));
        }
        return C(a(), this.a.e(j, temporalUnit).C(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.k b() {
        return ((C5400e) F()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate c() {
        return ((C5400e) F()).c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC5402g.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return C(a(), qVar.v(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = AbstractC5404i.a[aVar.ordinal()];
        if (i == 1) {
            return e(j - AbstractC5402g.o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C5400e c5400e = this.a;
        if (i != 2) {
            return S(zoneId, this.b, c5400e.d(j, qVar));
        }
        return T(a(), c5400e.X(ZoneOffset.d0(aVar.S(j))), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC5402g.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.s(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return T(a(), this.a.X(this.b), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        return S(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return C(a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return AbstractC5402g.e(this, qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        return C(a(), localDate.C(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).n() : ((C5400e) F()).s(qVar) : qVar.A(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId t() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return AbstractC5402g.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.W(toEpochSecond(), b().Y());
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeZ = a().z(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.until(chronoZonedDateTimeZ.i(this.b).F(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeZ);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = AbstractC5403h.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? ((C5400e) F()).v(qVar) : h().a0() : toEpochSecond();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }
}
