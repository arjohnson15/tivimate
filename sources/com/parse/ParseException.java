package com.parse;

/* loaded from: classes.dex */
public class ParseException extends Exception {
    private final int code;

    public ParseException(int i, String str) {
        super(str);
        this.code = i;
    }

    public ParseException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }

    public ParseException(Throwable th) {
        super(th);
        this.code = -1;
    }

    public int getCode() {
        return this.code;
    }
}
