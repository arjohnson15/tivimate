package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: E */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    k a();

    j$.time.k b();

    ChronoLocalDate c();

    ChronoZonedDateTime o(ZoneId zoneId);

    long toEpochSecond(ZoneOffset zoneOffset);
}
