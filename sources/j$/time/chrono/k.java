package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface k extends Comparable {
    ChronoLocalDateTime B(Temporal temporal);

    ChronoLocalDate G(int i, int i2, int i3);

    ChronoLocalDate J(Map map, j$.time.format.F f);

    j$.time.temporal.t K(j$.time.temporal.a aVar);

    ChronoZonedDateTime L(Instant instant, ZoneId zoneId);

    List N();

    boolean Q(long j);

    l R(int i);

    int g(l lVar, int i);

    ChronoLocalDate l(long j);

    String m();

    ChronoLocalDate q(TemporalAccessor temporalAccessor);

    String u();

    ChronoLocalDate x(int i, int i2);

    ChronoZonedDateTime z(Temporal temporal);
}
