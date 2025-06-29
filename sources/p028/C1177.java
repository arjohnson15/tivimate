package p028;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import ˆʽ.ᵎˏ;

/* renamed from: ʼˋ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1177 extends RandomAccessFile {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final File[] f4868;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4869;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public RandomAccessFile f4870;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final byte[] f4871;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f4872;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f4873;

    public C1177(File file, File[] fileArr) throws IOException {
        super(file, "r");
        this.f4871 = new byte[1];
        this.f4869 = 0;
        super.close();
        int i = 1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            String strSubstring = !name.contains(".") ? "" : name.substring(name.lastIndexOf(".") + 1);
            try {
                if (i != Integer.parseInt(strSubstring)) {
                    throw new IOException("Split file number " + i + " does not exist");
                }
                i++;
            } catch (NumberFormatException unused) {
                throw new IOException(ᵎˏ.ˑי("Split file extension not in expected format. Found: ", strSubstring, " expected of format: .001, .002, etc"));
            }
        }
        this.f4870 = new RandomAccessFile(file, "r");
        this.f4868 = fileArr;
        this.f4872 = file.length();
        this.f4873 = "r";
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f4870;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        super.close();
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return this.f4870.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final long length() {
        return this.f4870.length();
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        byte[] bArr = this.f4871;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4870.read(bArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.f4869;
        if (i4 == this.f4868.length - 1) {
            return -1;
        }
        m4231(i4 + 1);
        return read(bArr, i, i2);
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j) throws IOException {
        long j2 = this.f4872;
        int i = (int) (j / j2);
        if (i != this.f4869) {
            m4231(i);
        }
        this.f4870.seek(j - (i * j2));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4231(int i) throws IOException {
        if (this.f4869 == i) {
            return;
        }
        File[] fileArr = this.f4868;
        if (i > fileArr.length - 1) {
            throw new IOException("split counter greater than number of split files");
        }
        RandomAccessFile randomAccessFile = this.f4870;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f4870 = new RandomAccessFile(fileArr[i], this.f4873);
        this.f4869 = i;
    }
}
