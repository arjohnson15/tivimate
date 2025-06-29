package p091;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import p117.AbstractC1841;
import p117.AbstractC1845;
import ˈˉ.ﹳﹳ;

/* renamed from: ʿﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1752 extends FilterOutputStream {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ﹳﹳ f6784;

    public C1752(ﹳﹳ r1, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f6784 = r1;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5468(AbstractC1841 abstractC1841) throws IOException {
        AbstractC1845 abstractC1845 = abstractC1841.f7065;
        write((byte) (abstractC1845.f7081 | abstractC1845.f7083.f7089 | abstractC1845.f7084.f7071));
        ﹳﹳ r0 = abstractC1841.f7065.mo5605(this.f6784);
        int i = r0.ˏ(abstractC1841);
        if (i < 127) {
            write(i);
        } else {
            int i2 = 1;
            for (int i3 = i; i3 > 255; i3 >>= 8) {
                i2++;
            }
            write(i2 | 128);
            while (i2 > 0) {
                write(i >> ((i2 - 1) * 8));
                i2--;
            }
        }
        r0.ᵢᵢ(abstractC1841, this);
    }
}
