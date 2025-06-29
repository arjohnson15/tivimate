package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
