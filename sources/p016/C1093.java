package p016;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p065.AbstractC1524;
import p115.AbstractC1833;
import p115.C1821;
import p115.InterfaceC1830;
import p313.C3590;
import p418.C4794;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʻᐧ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1093 implements InterfaceC1830 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final byte[] f4668 = new byte[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3590 f4669;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4794 f4670;

    public C1093(C4794 c4794, C3590 c3590) {
        this.f4670 = c4794;
        this.f4669 = c3590;
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC1830) AbstractC1833.m5582(this.f4669.mo4121(bArr3, f4668), this.f4670.m10765())).mo4121(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws InterruptedException {
        AbstractC0758 abstractC0758;
        C4794 c4794 = this.f4670;
        AtomicReference atomicReference = AbstractC1833.f7060;
        synchronized (AbstractC1833.class) {
            try {
                AbstractC1524 abstractC1524 = ((C1821) AbstractC1833.f7060.get()).m5565(c4794.m10765()).f7062;
                Class cls = (Class) abstractC1524.f6194;
                if (!((Map) abstractC1524.f6193).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1524.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) AbstractC1833.f7059.get(c4794.m10765())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + c4794.m10765());
                }
                AbstractC0748 abstractC0748M10766 = c4794.m10766();
                try {
                    ﹳﹳ r1 = abstractC1524.mo4114();
                    AbstractC0758 abstractC07582 = r1.ⁱⁱ(abstractC0748M10766);
                    r1.ʽⁱ(abstractC07582);
                    abstractC0758 = r1.ᵎـ(abstractC07582);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC1524.mo4114().ᐧⁱ).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrM3165 = abstractC0758.m3165();
        byte[] bArrMo4122 = this.f4669.mo4122(bArrM3165, f4668);
        byte[] bArrMo41222 = ((InterfaceC1830) AbstractC1833.m5582(bArrM3165, this.f4670.m10765())).mo4122(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo4122.length + 4 + bArrMo41222.length).putInt(bArrMo4122.length).put(bArrMo4122).put(bArrMo41222).array();
    }
}
