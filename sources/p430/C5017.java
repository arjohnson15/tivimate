package p430;

import com.bumptech.glide.ˑʽ;
import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import p366.C4143;
import p366.C4155;
import p366.InterfaceC4160;

/* renamed from: ﹶˏ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5017 extends AbstractC4996 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C5002 f19033;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final byte[] f19034;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C5002 f19035;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final byte[] f19036;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final byte[] f19037;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f19038;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5002 f19039;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4155 f19040;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f19041;

    static {
        Pattern pattern = C5002.f18947;
        f19033 = ˑʽ.ˋⁱ("multipart/mixed");
        ˑʽ.ˋⁱ("multipart/alternative");
        ˑʽ.ˋⁱ("multipart/digest");
        ˑʽ.ˋⁱ("multipart/parallel");
        f19035 = ˑʽ.ˋⁱ("multipart/form-data");
        f19036 = new byte[]{58, 32};
        f19034 = new byte[]{13, 10};
        f19037 = new byte[]{45, 45};
    }

    public C5017(C4155 c4155, C5002 c5002, List list) {
        this.f19040 = c4155;
        this.f19038 = list;
        Pattern pattern = C5002.f18947;
        this.f19039 = ˑʽ.ˋⁱ(c5002 + "; boundary=" + c4155.m9564());
        this.f19041 = -1L;
    }

    @Override // p430.AbstractC4996
    public final long contentLength() throws EOFException {
        long j = this.f19041;
        if (j != -1) {
            return j;
        }
        long jM11107 = m11107(null, true);
        this.f19041 = jM11107;
        return jM11107;
    }

    @Override // p430.AbstractC4996
    public final C5002 contentType() {
        return this.f19039;
    }

    @Override // p430.AbstractC4996
    public final void writeTo(InterfaceC4160 interfaceC4160) throws EOFException {
        m11107(interfaceC4160, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m11107(InterfaceC4160 interfaceC4160, boolean z) throws EOFException {
        C4143 c4143;
        InterfaceC4160 c41432;
        if (z) {
            c41432 = new C4143();
            c4143 = c41432;
        } else {
            c4143 = 0;
            c41432 = interfaceC4160;
        }
        List list = this.f19038;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C4155 c4155 = this.f19040;
            byte[] bArr = f19037;
            byte[] bArr2 = f19034;
            if (i >= size) {
                c41432.write(bArr);
                c41432.mo9504(c4155);
                c41432.write(bArr);
                c41432.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + c4143.f16041;
                c4143.m9508();
                return j2;
            }
            C5015 c5015 = (C5015) list.get(i);
            C5014 c5014 = c5015.f19032;
            c41432.write(bArr);
            c41432.mo9504(c4155);
            c41432.write(bArr2);
            int size2 = c5014.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c41432.mo9525(c5014.m11105(i2)).write(f19036).mo9525(c5014.m11103(i2)).write(bArr2);
            }
            AbstractC4996 abstractC4996 = c5015.f19031;
            C5002 c5002ContentType = abstractC4996.contentType();
            if (c5002ContentType != null) {
                c41432.mo9525("Content-Type: ").mo9525(c5002ContentType.f18950).write(bArr2);
            }
            long jContentLength = abstractC4996.contentLength();
            if (jContentLength != -1) {
                c41432.mo9525("Content-Length: ").mo9501(jContentLength).write(bArr2);
            } else if (z) {
                c4143.m9508();
                return -1L;
            }
            c41432.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                abstractC4996.writeTo(c41432);
            }
            c41432.write(bArr2);
            i++;
        }
    }
}
