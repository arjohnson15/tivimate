package p008;

import java.io.IOException;
import p223.AbstractC2978;
import p298.C3495;
import p367.InterfaceC4176;
import p456.C5349;
import ﹳᴵ.ˉי;

/* renamed from: ʻˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0977 extends AbstractC0970 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f4318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0977(C0972 c0972, C3495 c3495, char[] cArr, boolean z, int i) {
        super(c0972, c3495, cArr, z);
        this.f4318 = i;
    }

    @Override // p008.AbstractC0970, java.io.OutputStream
    public void write(int i) throws IOException {
        switch (this.f4318) {
            case 1:
                super.write(new byte[]{(byte) i}, 0, 1);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // p008.AbstractC0970, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f4318) {
            case 1:
                super.write(bArr, 0, bArr.length);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // p008.AbstractC0970
    /* renamed from: ʽᐧ */
    public final InterfaceC4176 mo3939(C3495 c3495, char[] cArr, boolean z) throws IOException {
        switch (this.f4318) {
            case 0:
                return new ˉי(3);
            default:
                C5349 c5349 = new C5349(cArr, c3495.f13521 ? (AbstractC2978.m7352(c3495.f13520) & 65535) << 16 : c3495.f13524, z);
                this.f4289.write((byte[]) c5349.f20757);
                return c5349;
        }
    }
}
