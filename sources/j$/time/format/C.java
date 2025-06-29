package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class C {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new A();
    private static final C c = new C();
    public static final /* synthetic */ int d = 0;

    private static Object b(j$.time.temporal.q qVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object b2;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(qVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry3);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        int i = 0;
        if (qVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    map3.put(Long.valueOf(j), c(eras[i]));
                }
                i++;
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            b2 = new B(map);
            simpleImmutableEntry2 = simpleImmutableEntry3;
        } else {
            String str = "";
            int i2 = 1;
            if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                int length = dateFormatSymbols2.getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (i2 < length) {
                    TimeZone timeZone = TimeZone.getTimeZone("UTC");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL", locale);
                    simpleDateFormat.setTimeZone(timeZone);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i, i2, i);
                    String str2 = simpleDateFormat.format(calendar.getTime());
                    long j2 = i2;
                    linkedHashMap.put(Long.valueOf(j2), str2);
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = simpleImmutableEntry3;
                    linkedHashMap2.put(Long.valueOf(j2), str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("LLL", locale);
                    simpleDateFormat2.setTimeZone(timeZone2);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(0, i2, 0);
                    linkedHashMap3.put(Long.valueOf(j2), simpleDateFormat2.format(calendar2.getTime()));
                    i2++;
                    str = str;
                    simpleImmutableEntry3 = simpleImmutableEntry4;
                    i = 0;
                }
                simpleImmutableEntry = simpleImmutableEntry3;
                String str3 = str;
                if (length > 0) {
                    long j3 = length;
                    linkedHashMap.put(Long.valueOf(j3), str3);
                    linkedHashMap2.put(Long.valueOf(j3), str3);
                    linkedHashMap3.put(Long.valueOf(j3), str3);
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                }
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i3 = 0; i3 < months.length; i3++) {
                    if (!months[i3].isEmpty()) {
                        long j4 = i3 + 1;
                        map4.put(Long.valueOf(j4), months[i3]);
                        map5.put(Long.valueOf(j4), c(months[i3]));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                HashMap map6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                for (int i4 = 0; i4 < shortMonths.length; i4++) {
                    if (!shortMonths[i4].isEmpty()) {
                        map6.put(Long.valueOf(i4 + 1), shortMonths[i4]);
                    }
                }
                if (!map6.isEmpty()) {
                    map.put(TextStyle.SHORT, map6);
                }
                b2 = new B(map);
            } else {
                simpleImmutableEntry = simpleImmutableEntry3;
                if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap map7 = new HashMap();
                    String[] weekdays = dateFormatSymbols3.getWeekdays();
                    map7.put(1L, weekdays[2]);
                    map7.put(2L, weekdays[3]);
                    map7.put(3L, weekdays[4]);
                    map7.put(4L, weekdays[5]);
                    map7.put(5L, weekdays[6]);
                    map7.put(6L, weekdays[7]);
                    map7.put(7L, weekdays[1]);
                    map.put(TextStyle.FULL, map7);
                    HashMap map8 = new HashMap();
                    map8.put(1L, c(weekdays[2]));
                    map8.put(2L, c(weekdays[3]));
                    map8.put(3L, c(weekdays[4]));
                    map8.put(4L, c(weekdays[5]));
                    map8.put(5L, c(weekdays[6]));
                    map8.put(6L, c(weekdays[7]));
                    map8.put(7L, c(weekdays[1]));
                    map.put(TextStyle.NARROW, map8);
                    HashMap map9 = new HashMap();
                    String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                    map9.put(1L, shortWeekdays[2]);
                    map9.put(2L, shortWeekdays[3]);
                    map9.put(3L, shortWeekdays[4]);
                    map9.put(4L, shortWeekdays[5]);
                    map9.put(5L, shortWeekdays[6]);
                    map9.put(6L, shortWeekdays[7]);
                    map9.put(7L, shortWeekdays[1]);
                    map.put(TextStyle.SHORT, map9);
                    b2 = new B(map);
                } else if (qVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap map10 = new HashMap();
                    HashMap map11 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                    for (int i5 = 0; i5 < amPmStrings.length; i5++) {
                        if (!amPmStrings[i5].isEmpty()) {
                            long j5 = i5;
                            map10.put(Long.valueOf(j5), amPmStrings[i5]);
                            map11.put(Long.valueOf(j5), c(amPmStrings[i5]));
                        }
                    }
                    if (!map10.isEmpty()) {
                        map.put(TextStyle.FULL, map10);
                        map.put(TextStyle.SHORT, map10);
                        map.put(TextStyle.NARROW, map11);
                    }
                    b2 = new B(map);
                } else {
                    b2 = "";
                }
            }
            simpleImmutableEntry2 = simpleImmutableEntry;
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry2, b2);
        return concurrentHashMap.get(simpleImmutableEntry2);
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    static C d() {
        return c;
    }

    public String e(j$.time.chrono.k kVar, j$.time.temporal.q qVar, long j, TextStyle textStyle, Locale locale) {
        if (kVar == j$.time.chrono.r.d || !(qVar instanceof j$.time.temporal.a)) {
            return f(qVar, j, textStyle, locale);
        }
        return null;
    }

    public String f(j$.time.temporal.q qVar, long j, TextStyle textStyle, Locale locale) {
        Object objB = b(qVar, locale);
        if (objB instanceof B) {
            return ((B) objB).a(j, textStyle);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.k kVar, j$.time.temporal.q qVar, TextStyle textStyle, Locale locale) {
        if (kVar == j$.time.chrono.r.d || !(qVar instanceof j$.time.temporal.a)) {
            return h(qVar, textStyle, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.q qVar, TextStyle textStyle, Locale locale) {
        Object objB = b(qVar, locale);
        if (objB instanceof B) {
            return ((B) objB).b(textStyle);
        }
        return null;
    }
}
