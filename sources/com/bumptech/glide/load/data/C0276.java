package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p137.C2106;

/* renamed from: com.bumptech.glide.load.data.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0276 extends OutputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public byte[] f2320;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2106 f2321;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f2322;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final FileOutputStream f2323;

    public C0276(FileOutputStream fileOutputStream, C2106 c2106) {
        this.f2323 = fileOutputStream;
        this.f2321 = c2106;
        this.f2320 = (byte[]) c2106.m5971(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2323;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2320;
            if (bArr != null) {
                this.f2321.m5966(bArr);
                this.f2320 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2322;
        FileOutputStream fileOutputStream = this.f2323;
        if (i > 0) {
            fileOutputStream.write(this.f2320, 0, i);
            this.f2322 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2320;
        int i2 = this.f2322;
        int i3 = i2 + 1;
        this.f2322 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f2323.write(bArr, 0, i3);
        this.f2322 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f2322;
            FileOutputStream fileOutputStream = this.f2323;
            if (i6 == 0 && i4 >= this.f2320.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f2320.length - i6);
            System.arraycopy(bArr, i5, this.f2320, this.f2322, iMin);
            int i7 = this.f2322 + iMin;
            this.f2322 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f2320;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f2322 = 0;
            }
        } while (i3 < i2);
    }
}
