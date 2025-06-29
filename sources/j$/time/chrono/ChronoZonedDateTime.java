package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime F();

    k a();

    j$.time.k b();

    ChronoLocalDate c();

    ZoneOffset h();

    ChronoZonedDateTime i(ZoneId zoneId);

    ChronoZonedDateTime j(ZoneId zoneId);

    ZoneId t();

    long toEpochSecond();

    Instant toInstant();
}
