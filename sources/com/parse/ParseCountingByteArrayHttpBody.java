package com.parse;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
class ParseCountingByteArrayHttpBody extends ParseByteArrayHttpBody {
    private final ProgressCallback progressCallback;

    public ParseCountingByteArrayHttpBody(byte[] bArr, String str, ProgressCallback progressCallback) {
        super(bArr, str);
        this.progressCallback = progressCallback;
    }

    @Override // com.parse.ParseByteArrayHttpBody, com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        int length = this.content.length;
        int i = 0;
        while (i < length) {
            int iMin = Math.min(length - i, 4096);
            outputStream.write(this.content, i, iMin);
            outputStream.flush();
            ProgressCallback progressCallback = this.progressCallback;
            if (progressCallback != null) {
                i += iMin;
                ((C0839) progressCallback).m3530(Integer.valueOf((i * 100) / length));
            }
        }
    }
}
