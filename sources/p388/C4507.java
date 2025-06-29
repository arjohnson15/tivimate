package p388;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import p007.C0945;
import p028.C1177;
import p223.AbstractC2978;
import p260.C3222;
import p266.C3262;
import p298.C3495;
import p298.C3496;
import p298.C3501;
import p303.C3514;
import p303.C3516;
import p303.C3517;
import p303.C3520;
import ˊﹶ.ˋˉ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ⁱʼ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4507 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3496 f17325;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3262 f17326;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f17327;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C0945 f17328;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final char[] f17329;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final File f17330;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f17331;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ArrayList f17332;

    public C4507(File file, char[] cArr) {
        this.f17326 = new C3262(14);
        this.f17331 = 4096;
        this.f17332 = new ArrayList();
        this.f17327 = true;
        if (file == null) {
            throw new IllegalArgumentException("input zip file parameter is null");
        }
        this.f17330 = file;
        this.f17329 = cArr;
        this.f17328 = new C0945();
    }

    public C4507(String str, char[] cArr) {
        this(new File(str), cArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f17332;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
        arrayList.clear();
    }

    public final String toString() {
        return this.f17330.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10265(String str) throws IOException {
        ᐧⁱ r0 = new ᐧⁱ(1);
        if (!AbstractC2978.m7367(str)) {
            throw new ZipException("output path is null or invalid");
        }
        File file = new File(str);
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new ZipException("output directory is not valid");
            }
        } else if (!file.mkdirs()) {
            throw new ZipException("Cannot create output directories");
        }
        if (this.f17325 == null) {
            m10268();
        }
        C3496 c3496 = this.f17325;
        if (c3496 == null) {
            throw new ZipException("Internal error occurred when extracting zip file");
        }
        new C3520(c3496, this.f17329, r0, new ˋˉ(19, this.f17328)).ﾞʽ(new C3516(str, new C3501(this.f17331, this.f17327)));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final RandomAccessFile m10266() throws IOException {
        File file = this.f17330;
        if (!file.getName().endsWith(".zip.001")) {
            return new RandomAccessFile(file, "r");
        }
        C1177 c1177 = new C1177(file, AbstractC2978.m7365(file));
        c1177.m4231(c1177.f4868.length - 1);
        return c1177;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10267(File file, C3495 c3495) throws IOException {
        List listSingletonList = Collections.singletonList(file);
        if (listSingletonList == null || listSingletonList.size() == 0) {
            throw new ZipException("input file List is null or empty");
        }
        m10268();
        if (this.f17325 == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (this.f17330.exists() && this.f17325.f13539) {
            throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
        }
        new C3514(this.f17325, this.f17329, this.f17326, new ˋˉ(19, this.f17328)).ﾞʽ(new C3517(listSingletonList, c3495, new C3501(this.f17331, this.f17327)));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10268() throws IOException {
        if (this.f17325 != null) {
            return;
        }
        File file = this.f17330;
        if (!file.exists()) {
            C3496 c3496 = new C3496();
            this.f17325 = c3496;
            c3496.f13534 = file;
            return;
        }
        if (!file.canRead()) {
            throw new ZipException("no read access for the input zip file");
        }
        try {
            RandomAccessFile randomAccessFileM10266 = m10266();
            try {
                C3496 c3496M7957 = new C3222(14).m7957(randomAccessFileM10266, new C3501(this.f17331, this.f17327));
                this.f17325 = c3496M7957;
                c3496M7957.f13534 = file;
                randomAccessFileM10266.close();
            } catch (Throwable th) {
                try {
                    randomAccessFileM10266.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (ZipException e) {
            throw e;
        } catch (IOException e2) {
            throw new ZipException(e2);
        }
    }
}
