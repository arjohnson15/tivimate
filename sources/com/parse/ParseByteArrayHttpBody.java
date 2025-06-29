package com.parse;

import com.parse.http.ParseHttpBody;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
class ParseByteArrayHttpBody extends ParseHttpBody {
    final byte[] content;
    final InputStream contentInputStream;

    public ParseByteArrayHttpBody(String str, String str2) {
        this(str.getBytes("UTF-8"), str2);
    }

    public ParseByteArrayHttpBody(byte[] bArr, String str) {
        super(str, bArr.length);
        this.content = bArr;
        this.contentInputStream = new ByteArrayInputStream(bArr);
    }

    @Override // com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outputStream.write(this.content);
    }
}
