package p337;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p056.AbstractC1339;
import p056.C1333;

/* renamed from: ᵎˆ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3824 extends AbstractC1339 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public int[] f14704;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int[] f14705;

    @Override // p056.AbstractC1339
    /* renamed from: ˏʾ */
    public final void mo4668() {
        this.f14704 = null;
        this.f14705 = null;
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏᵢ */
    public final C1333 mo4665(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        int[] iArr = this.f14705;
        if (iArr == null) {
            return C1333.f5415;
        }
        if (c1333.f5417 != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c1333);
        }
        int length = iArr.length;
        int i = c1333.f5416;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new AudioProcessor$UnhandledAudioFormatException(c1333);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new C1333(c1333.f5418, iArr.length, 2) : C1333.f5415;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    public final void mo4657(ByteBuffer byteBuffer) {
        int[] iArr = this.f14704;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM4667 = m4667(((iLimit - iPosition) / this.f5462.f5419) * this.f5465.f5419);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM4667.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f5462.f5419;
        }
        byteBuffer.position(iLimit);
        byteBufferM4667.flip();
    }

    @Override // p056.AbstractC1339
    /* renamed from: ﹶˆ */
    public final void mo4669() {
        this.f14704 = this.f14705;
    }
}
