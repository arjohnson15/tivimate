package p028;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p298.C3493;

/* renamed from: ʼˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1171 extends AbstractC1173 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public File f4841;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4842;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f4843;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f4844;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public RandomAccessFile f4845;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte[] f4846;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f4845;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4846;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4845.read(bArr, i, i2);
        if ((i3 == i2 && i3 != -1) || !this.f4844) {
            return i3;
        }
        m4225(this.f4842 + 1);
        this.f4842++;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f4845.read(bArr, i3, i2 - i3);
        return i4 > 0 ? i3 + i4 : i3;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4225(int i) throws IOException {
        int i2 = this.f4843;
        File file = this.f4841;
        if (i != i2) {
            String canonicalPath = file.getCanonicalPath();
            file = new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")) + (i >= 9 ? ".z" : ".z0") + (i + 1));
        }
        if (file.exists()) {
            this.f4845.close();
            this.f4845 = new RandomAccessFile(file, "r");
        } else {
            throw new FileNotFoundException("zip split file does not exist: " + file);
        }
    }

    @Override // p028.AbstractC1173
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo4226(C3493 c3493) throws IOException {
        if (this.f4844) {
            int i = this.f4842;
            int i2 = c3493.f13510;
            if (i != i2) {
                m4225(i2);
                this.f4842 = c3493.f13510;
            }
        }
        this.f4845.seek(c3493.f13512);
    }
}
