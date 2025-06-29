package p366;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p065.C1514;

/* renamed from: ᵔﾞ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4157 extends AbstractC4147 {
    public String toString() {
        return "JvmSystemFileSystem";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9573(C4167 c4167) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = new File(c4167.f16084.m9564());
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + c4167);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List m9574(C4167 c4167) throws IOException {
        File file = new File(c4167.f16084.m9564());
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + c4167);
            }
            throw new FileNotFoundException("no such file: " + c4167);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(c4167.m9579(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p366.AbstractC4147
    /* renamed from: ـﹶ */
    public final C4154 mo9542(C4167 c4167) {
        return new C4154(new RandomAccessFile(new File(c4167.f16084.m9564()), "r"));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1514 mo9575(C4167 c4167) {
        c4167.getClass();
        File file = new File(c4167.f16084.m9564());
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C1514(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }
}
