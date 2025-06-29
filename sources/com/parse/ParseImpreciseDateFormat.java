package com.parse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
class ParseImpreciseDateFormat {
    private static final ParseImpreciseDateFormat INSTANCE = new ParseImpreciseDateFormat();
    private final DateFormat dateFormat;
    private final Object lock = new Object();

    private ParseImpreciseDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        this.dateFormat = simpleDateFormat;
    }

    public static ParseImpreciseDateFormat getInstance() {
        return INSTANCE;
    }

    public Date parse(String str) {
        Date date;
        synchronized (this.lock) {
            try {
                try {
                    date = this.dateFormat.parse(str);
                } catch (java.text.ParseException e) {
                    PLog.e("ParseDateFormat", "could not parse date: " + str, e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return date;
    }
}
