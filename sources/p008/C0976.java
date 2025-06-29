package p008;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.crypto.Mac;
import p298.C3495;
import p367.C4173;
import p367.InterfaceC4176;
import p383.C4456;

/* renamed from: ʻˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0976 extends AbstractC0970 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f4316;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f4317;

    @Override // p008.AbstractC0970, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // p008.AbstractC0970, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // p008.AbstractC0970, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f4317;
        int i5 = 16 - i4;
        byte[] bArr2 = this.f4316;
        if (i2 < i5) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f4317 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, 16 - i4);
        super.write(bArr2, 0, bArr2.length);
        int i6 = 16 - this.f4317;
        int i7 = i2 - i6;
        this.f4317 = 0;
        if (i7 != 0 && (i3 = i7 % 16) != 0) {
            System.arraycopy(bArr, (i7 + i6) - i3, bArr2, 0, i3);
            this.f4317 = i3;
            i7 -= i3;
        }
        super.write(bArr, i6, i7);
    }

    @Override // p008.AbstractC0970
    /* renamed from: ʽᐧ */
    public final InterfaceC4176 mo3939(C3495 c3495, char[] cArr, boolean z) throws IOException {
        C4173 c4173 = new C4173(cArr, c3495.f13527, z);
        this.f4289.write(c4173.f16113);
        this.f4289.write(c4173.f16110);
        return c4173;
    }

    @Override // p008.AbstractC0970
    /* renamed from: ـﹶ */
    public final void mo3940() throws IllegalStateException, IOException {
        int i = this.f4317;
        if (i != 0) {
            super.write(this.f4316, 0, i);
            this.f4317 = 0;
        }
        C4456 c4456 = ((C4173) this.f4288).f16106;
        if (((ByteArrayOutputStream) c4456.f17162).size() > 0) {
            c4456.m10072(0);
        }
        byte[] bArr = new byte[10];
        System.arraycopy(((Mac) c4456.f17163).doFinal(), 0, bArr, 0, 10);
        C0972 c0972 = this.f4289;
        c0972.getClass();
        c0972.write(bArr, 0, 10);
        super.mo3940();
    }
}
