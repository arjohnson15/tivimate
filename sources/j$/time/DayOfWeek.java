package j$.time;

import j$.time.format.TextStyle;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DayOfWeek implements TemporalAccessor, j$.time.temporal.m {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;
    private static final DayOfWeek[] a;
    private static final /* synthetic */ DayOfWeek[] b;

    static {
        DayOfWeek dayOfWeek = new DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        DayOfWeek dayOfWeek2 = new DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        DayOfWeek dayOfWeek3 = new DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        DayOfWeek dayOfWeek4 = new DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        DayOfWeek dayOfWeek5 = new DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        DayOfWeek dayOfWeek6 = new DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        DayOfWeek dayOfWeek7 = new DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        b = new DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        a = values();
    }

    public static DayOfWeek of(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new c("Invalid value for DayOfWeek: " + i);
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.j() ? ChronoUnit.DAYS : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.DAY_OF_WEEK : qVar != null && qVar.s(this);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.l(j$.time.temporal.a.DAY_OF_WEEK, textStyle);
        return vVar.y(locale).format(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.l.a(this, qVar);
    }

    public DayOfWeek plus(long j) {
        return a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? qVar.n() : j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }
}
