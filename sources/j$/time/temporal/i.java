package j$.time.temporal;

import j$.time.chrono.AbstractC5396a;
import j$.time.chrono.AbstractC5402g;

/* loaded from: classes2.dex */
public abstract class i {
    public static final q a = g.QUARTER_OF_YEAR;
    public static final q b = g.WEEK_OF_WEEK_BASED_YEAR;
    public static final q c = g.WEEK_BASED_YEAR;
    public static final TemporalUnit d = h.WEEK_BASED_YEARS;

    static {
        h hVar = h.WEEK_BASED_YEARS;
    }

    static boolean a(TemporalAccessor temporalAccessor) {
        return ((AbstractC5396a) AbstractC5402g.p(temporalAccessor)).equals(j$.time.chrono.r.d);
    }
}
