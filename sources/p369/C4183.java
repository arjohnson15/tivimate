package p369;

import java.io.IOException;
import ˉˆ.ﹳﹳ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ᵢʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4183 implements InterfaceC4184 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ᐧⁱ f16136 = new ᐧⁱ(5);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f16137;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f16138;

    public C4183(ﹳﹳ r1) {
        this.f16138 = r1;
        this.f16137 = f16136;
    }

    public C4183(byte[] bArr, int[] iArr) {
        this.f16138 = bArr;
        this.f16137 = iArr;
    }

    @Override // p369.InterfaceC4184
    /* renamed from: ـﹶ */
    public void mo6532(C4195 c4195, int i) throws IOException {
        int[] iArr = (int[]) this.f16137;
        try {
            c4195.read((byte[]) this.f16138, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c4195.close();
        }
    }
}
