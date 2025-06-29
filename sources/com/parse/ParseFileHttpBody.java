package com.parse;

import com.parse.http.ParseHttpBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
class ParseFileHttpBody extends ParseHttpBody {
    final File file;

    public ParseFileHttpBody(File file, String str) {
        super(str, file.length());
        this.file = file;
    }

    @Override // com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream can not be null");
        }
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            ParseIOUtils.copy(fileInputStream, outputStream);
        } finally {
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
        }
    }
}
