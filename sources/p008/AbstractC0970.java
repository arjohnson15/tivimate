package p008;

import java.io.IOException;
import java.io.OutputStream;
import p298.C3495;
import p367.InterfaceC4176;

/* renamed from: ʻˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0970 extends OutputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4176 f4288;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0972 f4289;

    public AbstractC0970(C0972 c0972, C3495 c3495, char[] cArr, boolean z) {
        this.f4289 = c0972;
        this.f4288 = mo3939(c3495, cArr, z);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4289.getClass();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f4289.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f4289.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f4288.mo9590(bArr, i, i2);
        this.f4289.write(bArr, i, i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract InterfaceC4176 mo3939(C3495 c3495, char[] cArr, boolean z);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo3940() {
        this.f4289.f4293 = true;
    }
}
