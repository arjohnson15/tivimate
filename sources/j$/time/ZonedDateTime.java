package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime C(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.T().d(Instant.W(j, i));
        return new ZonedDateTime(LocalDateTime.b0(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime S(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId zoneIdS = ZoneId.S(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporal.f(aVar) ? C(temporal.v(aVar), temporal.p(j$.time.temporal.a.NANO_OF_SECOND), zoneIdS) : U(LocalDateTime.a0(LocalDate.U(temporal), k.U(temporal)), zoneIdS, null);
        } catch (c e) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    public static ZonedDateTime T(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return C(instant.U(), instant.V(), zoneId);
    }

    public static ZonedDateTime U(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarT = zoneId.T();
        List listG = fVarT.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarT.f(localDateTime);
            localDateTime = localDateTime.plusSeconds(bVarF.r().r());
            zoneOffset = bVarF.s();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listG.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    static ZonedDateTime W(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        LocalDateTime localDateTimeA0 = LocalDateTime.a0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput));
        ZoneOffset zoneOffsetF0 = ZoneOffset.f0(objectInput);
        ZoneId zoneId = (ZoneId) t.a(objectInput);
        Objects.requireNonNull(localDateTimeA0, "localDateTime");
        Objects.requireNonNull(zoneOffsetF0, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffsetF0.equals(zoneId)) {
            return new ZonedDateTime(localDateTimeA0, zoneId, zoneOffsetF0);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this.a.c() : AbstractC5402g.l(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime F() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.n(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return U(localDateTime.e(j, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeE = localDateTime.e(j, temporalUnit);
        Objects.requireNonNull(localDateTimeE, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.T().g(localDateTimeE).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTimeE, zoneId, zoneOffset);
        }
        localDateTimeE.getClass();
        return C(AbstractC5402g.n(localDateTimeE, zoneOffset), localDateTimeE.U(), zoneId);
    }

    public final LocalDateTime X() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return C(AbstractC5402g.n(localDateTime, this.b), localDateTime.U(), zoneId);
    }

    final void Z(DataOutput dataOutput) {
        this.a.h0(dataOutput);
        this.b.g0(dataOutput);
        this.c.X((ObjectOutput) dataOutput);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k b() {
        return this.a.b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate c() {
        return this.a.c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC5402g.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = z.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        ZoneId zoneId = this.c;
        if (i == 1) {
            return C(j, localDateTime.U(), zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return U(localDateTime.d(j, qVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetD0 = ZoneOffset.d0(aVar.S(j));
        return (zoneOffsetD0.equals(zoneOffset) || !zoneId.T().g(localDateTime).contains(zoneOffsetD0)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetD0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c);
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
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : U(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return AbstractC5402g.e(this, qVar);
        }
        int i = z.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.p(qVar) : this.b.a0();
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return U(LocalDateTime.a0(localDate, localDateTime.b()), zoneId, zoneOffset);
        }
        localDate.getClass();
        return (ZonedDateTime) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).n() : this.a.s(qVar) : qVar.A(this);
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
        ZonedDateTime zonedDateTimeS = S(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeS);
        }
        ZonedDateTime zonedDateTimeI = zonedDateTimeS.i(this.c);
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime = this.a;
        LocalDateTime localDateTime2 = zonedDateTimeI.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? OffsetDateTime.T(localDateTime, this.b).until(OffsetDateTime.T(localDateTime2, zonedDateTimeI.b), temporalUnit) : localDateTime.until(localDateTime2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = z.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.v(qVar) : this.b.a0() : AbstractC5402g.o(this);
    }
}
