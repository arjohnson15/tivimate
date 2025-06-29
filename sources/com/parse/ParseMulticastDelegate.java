package com.parse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
class ParseMulticastDelegate<T> {
    private final List<ParseCallback2<T, ParseException>> callbacks = new LinkedList();

    public void invoke(T t, ParseException parseException) {
        Iterator it = new ArrayList(this.callbacks).iterator();
        while (it.hasNext()) {
            ((ParseCallback2) it.next()).done(t, parseException);
        }
    }

    public void subscribe(ParseCallback2<T, ParseException> parseCallback2) {
        this.callbacks.add(parseCallback2);
    }

    public void unsubscribe(ParseCallback2<T, ParseException> parseCallback2) {
        this.callbacks.remove(parseCallback2);
    }
}
