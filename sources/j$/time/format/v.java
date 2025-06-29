package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class v {
    private static final C5405a h = new C5405a();
    private static final HashMap i;
    private v a;
    private final v b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.q qVar = j$.time.temporal.i.a;
        map.put('Q', qVar);
        map.put('q', qVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.a);
    }

    public v() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private v(v vVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = vVar;
        this.d = true;
    }

    private int d(InterfaceC5410f interfaceC5410f) {
        Objects.requireNonNull(interfaceC5410f, "pp");
        v vVar = this.a;
        int i2 = vVar.e;
        if (i2 > 0) {
            if (interfaceC5410f != null) {
                interfaceC5410f = new l(interfaceC5410f, i2, vVar.f);
            }
            vVar.e = 0;
            vVar.f = (char) 0;
        }
        vVar.c.add(interfaceC5410f);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    private void m(j jVar) {
        j jVarE;
        v vVar = this.a;
        int i2 = vVar.g;
        if (i2 < 0) {
            vVar.g = d(jVar);
            return;
        }
        j jVar2 = (j) vVar.c.get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == G.NOT_NEGATIVE) {
            jVarE = jVar2.f(i4);
            d(jVar.e());
            this.a.g = i2;
        } else {
            jVarE = jVar2.e();
            this.a.g = d(jVar);
        }
        this.a.c.set(i2, jVarE);
    }

    private DateTimeFormatter z(Locale locale, F f, j$.time.chrono.r rVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            r();
        }
        C5409e c5409e = new C5409e(this.c, false);
        D d = D.a;
        return new DateTimeFormatter(c5409e, locale, f, rVar);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            d(new C5411g(aVar, i2, i3, z));
        } else {
            m(new C5411g(aVar, i2, i3, z));
        }
    }

    public final void c() {
        d(new C5412h());
    }

    public final void e(char c) {
        d(new C5408d(c));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new C5408d(str.charAt(0)));
        } else {
            d(new i(1, str));
        }
    }

    public final void g(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new i(0, textStyle));
    }

    public final void h(String str, String str2) {
        d(new k(str, str2));
    }

    public final void i() {
        d(k.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0474 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.j(java.lang.String):void");
    }

    public final void k(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        d(new r(aVar, textStyle, new C5406b(new B(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void l(j$.time.temporal.q qVar, TextStyle textStyle) {
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        d(new r(qVar, textStyle, C.d()));
    }

    public final void n(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        m(new j(qVar, 1, 19, G.NORMAL));
    }

    public final void o(j$.time.temporal.q qVar, int i2) {
        Objects.requireNonNull(qVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            m(new j(qVar, i2, i2, G.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void p(j$.time.temporal.q qVar, int i2, int i3, G g) {
        if (i2 == i3 && g == G.NOT_NEGATIVE) {
            o(qVar, i3);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(g, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            m(new j(qVar, i2, i3, g));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void q() {
        d(new t(h, "ZoneRegionId()"));
    }

    public final void r() {
        v vVar = this.a;
        if (vVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (vVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        v vVar2 = this.a;
        C5409e c5409e = new C5409e(vVar2.c, vVar2.d);
        this.a = this.a.b;
        d(c5409e);
    }

    public final void s() {
        v vVar = this.a;
        vVar.g = -1;
        this.a = new v(vVar);
    }

    public final void t() {
        d(q.INSENSITIVE);
    }

    public final void u() {
        d(q.SENSITIVE);
    }

    public final void v() {
        d(q.LENIENT);
    }

    public final void w() {
        d(q.STRICT);
    }

    final DateTimeFormatter x(F f, j$.time.chrono.r rVar) {
        return z(Locale.getDefault(), f, rVar);
    }

    public final DateTimeFormatter y(Locale locale) {
        return z(locale, F.SMART, null);
    }
}
