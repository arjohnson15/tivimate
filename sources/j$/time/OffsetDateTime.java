package j$.time;

import j$.time.chrono.AbstractC5402g;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        T(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        T(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetDateTime S(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetZ = ZoneOffset.Z(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.A(j$.time.temporal.l.f());
            k kVar = (k) temporalAccessor.A(j$.time.temporal.l.g());
            return (localDate == null || kVar == null) ? U(Instant.T(temporalAccessor), zoneOffsetZ) : new OffsetDateTime(LocalDateTime.a0(localDate, kVar), zoneOffsetZ);
        } catch (c e) {
            throw new c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static OffsetDateTime T(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime U(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.T().d(instant);
        return new OffsetDateTime(LocalDateTime.b0(instant.U(), instant.V(), zoneOffsetD), zoneOffsetD);
    }

    static OffsetDateTime W(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        return new OffsetDateTime(LocalDateTime.a0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput)), ZoneOffset.f0(objectInput));
    }

    private OffsetDateTime X(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.d(charSequence, new g(2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i() || rVar == j$.time.temporal.l.k()) {
            return this.b;
        }
        if (rVar == j$.time.temporal.l.l()) {
            return null;
        }
        j$.time.temporal.r rVarF = j$.time.temporal.l.f();
        LocalDateTime localDateTime = this.a;
        return rVar == rVarF ? localDateTime.c() : rVar == j$.time.temporal.l.g() ? localDateTime.b() : rVar == j$.time.temporal.l.e() ? j$.time.chrono.r.d : rVar == j$.time.temporal.l.j() ? ChronoUnit.NANOS : rVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.d(localDateTime.c().w(), aVar).d(localDateTime.b().k0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.a0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? X(this.a.e(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(toEpochSecond(), offsetDateTime2.toEpochSecond());
            if (iCompare == 0) {
                iCompare = this.a.b().Y() - offsetDateTime2.a.b().Y();
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) qVar.v(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = p.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? X(localDateTime.d(j, qVar), zoneOffset) : X(localDateTime, ZoneOffset.d0(aVar.S(j))) : U(Instant.W(j, localDateTime.U()), zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.s(this));
    }

    public final ZoneOffset h() {
        return this.b;
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
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.a(this, qVar);
        }
        int i = p.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.p(qVar) : this.b.a0();
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (z) {
            return X(localDateTime.r(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) AbstractC5402g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).n() : this.a.s(qVar) : qVar.A(this);
    }

    public long toEpochSecond() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return AbstractC5402g.n(localDateTime, this.b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeS = S(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, offsetDateTimeS);
        }
        ZoneOffset zoneOffset = offsetDateTimeS.b;
        ZoneOffset zoneOffset2 = this.b;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTimeS = new OffsetDateTime(offsetDateTimeS.a.plusSeconds(zoneOffset2.a0() - zoneOffset.a0()), zoneOffset2);
        }
        return this.a.until(offsetDateTimeS.a, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = p.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.v(qVar) : this.b.a0() : toEpochSecond();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.h0(objectOutput);
        this.b.g0(objectOutput);
    }
}
