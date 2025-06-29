package p337;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p056.AbstractC1339;
import p056.C1333;

/* renamed from: ᵎˆ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3831 extends AbstractC1339 {

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final int f14731 = Float.floatToIntBits(Float.NaN);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m8946(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == f14731) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏᵢ */
    public final C1333 mo4665(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c1333.f5417;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 4 ? new C1333(c1333.f5418, c1333.f5416, 4) : C1333.f5415;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c1333);
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    public final void mo4657(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM4667;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f5462.f5417;
        if (i2 == 21) {
            byteBufferM4667 = m4667((i / 3) * 4);
            while (iPosition < iLimit) {
                m8946(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM4667);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM4667 = m4667(i);
            while (iPosition < iLimit) {
                m8946((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM4667);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM4667 = m4667((i / 3) * 4);
            while (iPosition < iLimit) {
                m8946(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM4667);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM4667 = m4667(i);
            while (iPosition < iLimit) {
                m8946((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM4667);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM4667.flip();
    }
}
