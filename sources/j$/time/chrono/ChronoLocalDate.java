package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes2.dex */
public interface ChronoLocalDate extends Temporal, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    l D();

    ChronoLocalDate H(j$.time.temporal.p pVar);

    boolean I();

    /* renamed from: M */
    ChronoLocalDate n(long j, TemporalUnit temporalUnit);

    int O();

    /* renamed from: P */
    int compareTo(ChronoLocalDate chronoLocalDate);

    k a();

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate d(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate e(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAccessor
    boolean f(j$.time.temporal.q qVar);

    int hashCode();

    /* renamed from: k */
    ChronoLocalDate r(j$.time.temporal.m mVar);

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    long w();

    ChronoLocalDateTime y(j$.time.k kVar);
}
