package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal d(long j, q qVar);

    Temporal e(long j, TemporalUnit temporalUnit);

    Temporal n(long j, ChronoUnit chronoUnit);

    Temporal r(LocalDate localDate);

    long until(Temporal temporal, TemporalUnit temporalUnit);
}
