package p337;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p056.AbstractC1339;
import p056.C1333;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3830 extends AbstractC1339 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f14724;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f14725;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public byte[] f14726;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f14727;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f14728;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f14729;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14730;

    @Override // p056.AbstractC1339
    /* renamed from: ˉי */
    public final void mo4666() {
        if (this.f14727) {
            if (this.f14729 > 0) {
                this.f14728 += r0 / this.f5462.f5419;
            }
            this.f14729 = 0;
        }
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏʾ */
    public final void mo4668() {
        this.f14726 = AbstractC4470.f17203;
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏᵢ */
    public final C1333 mo4665(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        if (c1333.f5417 != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c1333);
        }
        this.f14727 = true;
        return (this.f14730 == 0 && this.f14724 == 0) ? C1333.f5415 : c1333;
    }

    @Override // p056.AbstractC1339, p056.InterfaceC1335
    /* renamed from: ˑʽ */
    public final boolean mo4654() {
        return super.mo4654() && this.f14729 == 0;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    public final void mo4657(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f14725);
        this.f14728 += iMin / this.f5462.f5419;
        this.f14725 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f14725 > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f14729 + i2) - this.f14726.length;
        ByteBuffer byteBufferM4667 = m4667(length);
        int iM10172 = AbstractC4470.m10172(length, 0, this.f14729);
        byteBufferM4667.put(this.f14726, 0, iM10172);
        int iM101722 = AbstractC4470.m10172(length - iM10172, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM101722);
        byteBufferM4667.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM101722;
        int i4 = this.f14729 - iM10172;
        this.f14729 = i4;
        byte[] bArr = this.f14726;
        System.arraycopy(bArr, iM10172, bArr, 0, i4);
        byteBuffer.get(this.f14726, this.f14729, i3);
        this.f14729 += i3;
        byteBufferM4667.flip();
    }

    @Override // p056.AbstractC1339, p056.InterfaceC1335
    /* renamed from: ﹳﹳ */
    public final ByteBuffer mo4658() {
        int i;
        if (super.mo4654() && (i = this.f14729) > 0) {
            m4667(i).put(this.f14726, 0, this.f14729).flip();
            this.f14729 = 0;
        }
        return super.mo4658();
    }

    @Override // p056.AbstractC1339
    /* renamed from: ﹶˆ */
    public final void mo4669() {
        if (this.f14727) {
            this.f14727 = false;
            int i = this.f14724;
            int i2 = this.f5462.f5419;
            this.f14726 = new byte[i * i2];
            this.f14725 = this.f14730 * i2;
        }
        this.f14729 = 0;
    }
}
