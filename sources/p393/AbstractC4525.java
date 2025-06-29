package p393;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: ⁱˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4525 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Charset f17404 = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10300(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m10300(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
