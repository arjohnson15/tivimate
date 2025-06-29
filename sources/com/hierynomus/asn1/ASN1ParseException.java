package com.hierynomus.asn1;

/* loaded from: classes.dex */
public class ASN1ParseException extends RuntimeException {
    public ASN1ParseException(Exception exc, String str, Object... objArr) {
        super(String.format(str, objArr), exc);
    }

    public ASN1ParseException(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
