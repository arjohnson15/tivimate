package p008;

import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: ʻˊ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0971 extends AbstractC0975 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public byte[] f4290;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Deflater f4291;

    @Override // p008.AbstractC0975, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // p008.AbstractC0975, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // p008.AbstractC0975, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        Deflater deflater = this.f4291;
        deflater.setInput(bArr, i, i2);
        while (!deflater.needsInput()) {
            Deflater deflater2 = this.f4291;
            byte[] bArr2 = this.f4290;
            int iDeflate = deflater2.deflate(bArr2, 0, bArr2.length);
            if (iDeflate > 0) {
                super.write(bArr2, 0, iDeflate);
            }
        }
    }

    @Override // p008.AbstractC0975
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo3941() throws IOException {
        Deflater deflater = this.f4291;
        if (!deflater.finished()) {
            deflater.finish();
            while (!deflater.finished()) {
                Deflater deflater2 = this.f4291;
                byte[] bArr = this.f4290;
                int iDeflate = deflater2.deflate(bArr, 0, bArr.length);
                if (iDeflate > 0) {
                    super.write(bArr, 0, iDeflate);
                }
            }
        }
        deflater.end();
        super.mo3941();
    }
}
