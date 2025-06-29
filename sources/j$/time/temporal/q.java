package j$.time.temporal;

import j$.time.format.F;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface q {
    t A(TemporalAccessor temporalAccessor);

    boolean C();

    t n();

    TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f);

    long r(TemporalAccessor temporalAccessor);

    boolean s(TemporalAccessor temporalAccessor);

    Temporal v(Temporal temporal, long j);
}
