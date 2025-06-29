package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    private final C5409e a;
    private final Locale b;
    private final D c;
    private final F d;
    private final j$.time.chrono.r e;

    static {
        v vVar = new v();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        G g = G.EXCEEDS_PAD;
        vVar.p(aVar, 4, 10, g);
        vVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        vVar.o(aVar2, 2);
        vVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        vVar.o(aVar3, 2);
        F f2 = F.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.d;
        DateTimeFormatter dateTimeFormatterX = vVar.x(f2, rVar);
        ISO_LOCAL_DATE = dateTimeFormatterX;
        v vVar2 = new v();
        vVar2.t();
        vVar2.a(dateTimeFormatterX);
        vVar2.i();
        vVar2.x(f2, rVar);
        v vVar3 = new v();
        vVar3.t();
        vVar3.a(dateTimeFormatterX);
        vVar3.s();
        vVar3.i();
        vVar3.x(f2, rVar);
        v vVar4 = new v();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        vVar4.o(aVar4, 2);
        vVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        vVar4.o(aVar5, 2);
        vVar4.s();
        vVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        vVar4.o(aVar6, 2);
        vVar4.s();
        vVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterX2 = vVar4.x(f2, null);
        v vVar5 = new v();
        vVar5.t();
        vVar5.a(dateTimeFormatterX2);
        vVar5.i();
        vVar5.x(f2, null);
        v vVar6 = new v();
        vVar6.t();
        vVar6.a(dateTimeFormatterX2);
        vVar6.s();
        vVar6.i();
        vVar6.x(f2, null);
        v vVar7 = new v();
        vVar7.t();
        vVar7.a(dateTimeFormatterX);
        vVar7.e('T');
        vVar7.a(dateTimeFormatterX2);
        DateTimeFormatter dateTimeFormatterX3 = vVar7.x(f2, rVar);
        v vVar8 = new v();
        vVar8.t();
        vVar8.a(dateTimeFormatterX3);
        vVar8.v();
        vVar8.i();
        vVar8.w();
        DateTimeFormatter dateTimeFormatterX4 = vVar8.x(f2, rVar);
        v vVar9 = new v();
        vVar9.a(dateTimeFormatterX4);
        vVar9.s();
        vVar9.e('[');
        vVar9.u();
        vVar9.q();
        vVar9.e(']');
        vVar9.x(f2, rVar);
        v vVar10 = new v();
        vVar10.a(dateTimeFormatterX3);
        vVar10.s();
        vVar10.i();
        vVar10.s();
        vVar10.e('[');
        vVar10.u();
        vVar10.q();
        vVar10.e(']');
        vVar10.x(f2, rVar);
        v vVar11 = new v();
        vVar11.t();
        vVar11.p(aVar, 4, 10, g);
        vVar11.e('-');
        vVar11.o(j$.time.temporal.a.DAY_OF_YEAR, 3);
        vVar11.s();
        vVar11.i();
        vVar11.x(f2, rVar);
        v vVar12 = new v();
        vVar12.t();
        vVar12.p(j$.time.temporal.i.c, 4, 10, g);
        vVar12.f("-W");
        vVar12.o(j$.time.temporal.i.b, 2);
        vVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        vVar12.o(aVar7, 1);
        vVar12.s();
        vVar12.i();
        vVar12.x(f2, rVar);
        v vVar13 = new v();
        vVar13.t();
        vVar13.c();
        f = vVar13.x(f2, null);
        v vVar14 = new v();
        vVar14.t();
        vVar14.o(aVar, 4);
        vVar14.o(aVar2, 2);
        vVar14.o(aVar3, 2);
        vVar14.s();
        vVar14.v();
        vVar14.h("+HHMMss", "Z");
        vVar14.w();
        vVar14.x(f2, rVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        v vVar15 = new v();
        vVar15.t();
        vVar15.v();
        vVar15.s();
        vVar15.k(aVar7, map);
        vVar15.f(", ");
        vVar15.r();
        vVar15.p(aVar3, 1, 2, G.NOT_NEGATIVE);
        vVar15.e(' ');
        vVar15.k(aVar2, map2);
        vVar15.e(' ');
        vVar15.o(aVar, 4);
        vVar15.e(' ');
        vVar15.o(aVar4, 2);
        vVar15.e(':');
        vVar15.o(aVar5, 2);
        vVar15.s();
        vVar15.e(':');
        vVar15.o(aVar6, 2);
        vVar15.r();
        vVar15.e(' ');
        vVar15.h("+HHMM", "GMT");
        vVar15.x(F.SMART, rVar);
    }

    DateTimeFormatter(C5409e c5409e, Locale locale, F f2, j$.time.chrono.r rVar) {
        D d = D.a;
        this.a = (C5409e) Objects.requireNonNull(c5409e, "printerParser");
        this.b = (Locale) Objects.requireNonNull(locale, "locale");
        this.c = (D) Objects.requireNonNull(d, "decimalStyle");
        this.d = (F) Objects.requireNonNull(f2, "resolverStyle");
        this.e = rVar;
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        w wVar = new w(this);
        int iP = this.a.p(wVar, charSequence, parsePosition.getIndex());
        if (iP < 0) {
            parsePosition.setErrorIndex(~iP);
            wVar = null;
        } else {
            parsePosition.setIndex(iP);
        }
        if (wVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return wVar.t(this.d);
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new x(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new x(str2, charSequence);
    }

    public static DateTimeFormatter ofPattern(String str) {
        v vVar = new v();
        vVar.j(str);
        return vVar.y(Locale.getDefault());
    }

    public final j$.time.chrono.k a() {
        return this.e;
    }

    public final D b() {
        return this.c;
    }

    public final Locale c() {
        return this.b;
    }

    public final Object d(CharSequence charSequence, j$.time.temporal.r rVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(rVar, "query");
        try {
            return ((E) e(charSequence)).A(rVar);
        } catch (x e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            x xVar = new x("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw xVar;
        }
    }

    final C5409e f() {
        return this.a.a();
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            this.a.n(new z(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
