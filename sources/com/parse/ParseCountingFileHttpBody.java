package com.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
class ParseCountingFileHttpBody extends ParseFileHttpBody {
    private final ProgressCallback progressCallback;

    public ParseCountingFileHttpBody(File file, String str, ProgressCallback progressCallback) {
        super(file, str);
        this.progressCallback = progressCallback;
    }

    @Override // com.parse.ParseFileHttpBody, com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            byte[] bArr = new byte[4096];
            long length = this.file.length();
            long j = 0;
            while (true) {
                int i = fileInputStream.read(bArr);
                if (-1 == i) {
                    return;
                }
                outputStream.write(bArr, 0, i);
                j += i;
                ProgressCallback progressCallback = this.progressCallback;
                if (progressCallback != null) {
                    ((C0839) progressCallback).m3530(Integer.valueOf((int) ((100 * j) / length)));
                }
            }
        } finally {
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
        }
    }
}
