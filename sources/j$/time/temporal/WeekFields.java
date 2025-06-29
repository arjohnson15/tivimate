package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class WeekFields implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final TemporalUnit h;
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek a;
    private final int b;
    private final transient q c = u.e(this);
    private final transient q d = u.h(this);
    private final transient q e;
    private final transient q f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        f(DayOfWeek.SUNDAY, 1);
        h = i.d;
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.e = u.i(this);
        this.f = u.g(this);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WeekFields f(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentHashMap.get(str);
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        return f(DayOfWeek.SUNDAY.plus(r4.getFirstDayOfWeek() - 1), Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final q d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final q g() {
        return this.f;
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.a;
    }

    public final q h() {
        return this.d;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final q i() {
        return this.e;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
