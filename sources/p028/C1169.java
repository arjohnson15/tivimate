package p028;

import java.io.IOException;
import net.lingala.zip4j.exception.ZipException;
import p235.C3088;
import p298.C3500;
import p367.InterfaceC4174;
import ᵢ.ʿʼ;
import ﹳᴵ.ˉי;

/* renamed from: ʼˋ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1169 extends AbstractC1168 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f4836;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1169(C1170 c1170, C3500 c3500, char[] cArr, int i, boolean z, int i2) {
        super(c1170, c3500, cArr, i, z);
        this.f4836 = i2;
    }

    @Override // p028.AbstractC1168
    /* renamed from: ʽᐧ */
    public final InterfaceC4174 mo4222(C3500 c3500, char[] cArr, boolean z) throws IOException {
        byte bM7591;
        switch (this.f4836) {
            case 0:
                return new ˉי(6);
            default:
                long j = c3500.f13507;
                long j2 = c3500.f13505;
                byte[] bArr = new byte[12];
                m4223(bArr);
                ʿʼ r0 = new ʿʼ(0, false);
                C3088 c3088 = new C3088();
                r0.ˆʿ = c3088;
                if (cArr == null || cArr.length <= 0) {
                    throw new ZipException("Wrong password!");
                }
                c3088.m7589(cArr, z);
                int i = 0;
                byte b = bArr[0];
                while (i < 12) {
                    i++;
                    if (i == 12 && (bM7591 = (byte) (c3088.m7591() ^ b)) != ((byte) (j >> 24)) && bM7591 != ((byte) (j2 >> 8))) {
                        throw new ZipException("Wrong password!");
                    }
                    c3088.m7590((byte) (c3088.m7591() ^ b));
                    if (i != 12) {
                        b = bArr[i];
                    }
                }
                return r0;
        }
    }
}
