package p188;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p314.InterfaceC3601;

/* renamed from: ˎʾ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2637 implements InterfaceC3601 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ByteBuffer f10446;

    public C2637() {
        this.f10446 = ByteBuffer.allocate(8);
    }

    public C2637(int i, byte[] bArr) {
        this.f10446 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public short m6820(int i) {
        ByteBuffer byteBuffer = this.f10446;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    @Override // p314.InterfaceC3601
    /* renamed from: ﹶˆ */
    public void mo4607(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f10446) {
            this.f10446.position(0);
            messageDigest.update(this.f10446.putLong(l.longValue()).array());
        }
    }
}
