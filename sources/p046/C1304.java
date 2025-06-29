package p046;

import com.bumptech.glide.load.data.InterfaceC0279;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p188.InterfaceC2615;
import p314.InterfaceC3601;

/* renamed from: ʽᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1304 implements InterfaceC0279, InterfaceC2615, InterfaceC3601 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ByteBuffer f5328;

    public C1304() {
        this.f5328 = ByteBuffer.allocate(4);
    }

    public C1304(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.f5328 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f5328 = byteBuffer;
                break;
        }
    }

    @Override // p188.InterfaceC2615
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f5328;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0279
    /* renamed from: ʽᐧ */
    public void mo1538() {
    }

    @Override // p188.InterfaceC2615
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public short mo4604() throws IOException {
        ByteBuffer byteBuffer = this.f5328;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new IOException() { // from class: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
        };
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0279
    /* renamed from: ـﹶ */
    public Object mo1539() {
        ByteBuffer byteBuffer = this.f5328;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p188.InterfaceC2615
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int mo4605(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f5328;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // p188.InterfaceC2615
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int mo4606() {
        return (mo4604() << 8) | mo4604();
    }

    @Override // p314.InterfaceC3601
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void mo4607(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f5328) {
            this.f5328.position(0);
            messageDigest.update(this.f5328.putInt(num.intValue()).array());
        }
    }
}
