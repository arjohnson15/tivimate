package p008;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
import p080.AbstractC1702;
import p223.AbstractC2978;
import p260.C3222;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻˊ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0974 extends OutputStream implements InterfaceC0978 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f4309;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f4310;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public File f4311;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f4312;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public RandomAccessFile f4313;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3222 f4314;

    public C0974(File file) {
        this(file, -1L);
    }

    public C0974(File file, long j) throws ZipException {
        this.f4314 = new C3222(9);
        if (j >= 0 && j < 65536) {
            throw new ZipException("split length less than minimum allowed split length of 65536 Bytes");
        }
        this.f4313 = new RandomAccessFile(file, "rw");
        this.f4309 = j;
        this.f4311 = file;
        this.f4312 = 0;
        this.f4310 = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4313.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return;
        }
        long j = this.f4309;
        if (j == -1) {
            this.f4313.write(bArr, i, i2);
            this.f4310 += i2;
            return;
        }
        long j2 = this.f4310;
        if (j2 >= j) {
            m3945();
            this.f4313.write(bArr, i, i2);
            this.f4310 = i2;
            return;
        }
        long j3 = i2;
        if (j2 + j3 <= j) {
            this.f4313.write(bArr, i, i2);
            this.f4310 += j3;
            return;
        }
        this.f4314.getClass();
        int iM7923 = C3222.m7923(0, bArr);
        for (int i3 : AbstractC1702.m5408(12)) {
            if (i3 != 8 && ˉᵎ.ʿʼ(i3) == iM7923) {
                m3945();
                this.f4313.write(bArr, i, i2);
                this.f4310 = j3;
                return;
            }
        }
        this.f4313.write(bArr, i, (int) (j - this.f4310));
        m3945();
        RandomAccessFile randomAccessFile = this.f4313;
        long j4 = j - this.f4310;
        randomAccessFile.write(bArr, i + ((int) j4), (int) (j3 - j4));
        this.f4310 = j3 - (j - this.f4310);
    }

    @Override // p008.InterfaceC0978
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long mo3944() {
        return this.f4313.getFilePointer();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3945() {
        String str;
        String strM7355 = AbstractC2978.m7355(this.f4311.getName());
        String absolutePath = this.f4311.getAbsolutePath();
        if (this.f4311.getParent() == null) {
            str = "";
        } else {
            str = this.f4311.getParent() + System.getProperty("file.separator");
        }
        String str2 = ".z0" + (this.f4312 + 1);
        if (this.f4312 >= 9) {
            str2 = ".z" + (this.f4312 + 1);
        }
        File file = new File(ᐧʻ.ˋⁱ(str, strM7355, str2));
        this.f4313.close();
        if (file.exists()) {
            throw new IOException("split file: " + file.getName() + " already exists in the current directory, cannot rename this file");
        }
        if (!this.f4311.renameTo(file)) {
            throw new IOException("cannot rename newly created split file");
        }
        this.f4311 = new File(absolutePath);
        this.f4313 = new RandomAccessFile(this.f4311, "rw");
        this.f4312++;
    }

    @Override // p008.InterfaceC0978
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int mo3946() {
        return this.f4312;
    }
}
