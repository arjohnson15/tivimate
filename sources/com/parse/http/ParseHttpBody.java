package com.parse.http;

import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class ParseHttpBody {
    private final long contentLength;
    private final String contentType;

    public ParseHttpBody(String str, long j) {
        this.contentType = str;
        this.contentLength = j;
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    public abstract void writeTo(OutputStream outputStream);
}
