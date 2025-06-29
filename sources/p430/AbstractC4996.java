package p430;

import p158.AbstractC2339;
import p366.C4155;
import p366.InterfaceC4160;
import p396.C4571;

/* renamed from: ﹶˏ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4996 {
    public static final C5018 Companion = new C5018();

    public static final AbstractC4996 create(C5002 c5002, C4155 c4155) {
        Companion.getClass();
        return new C4571(c5002, c4155);
    }

    public static final AbstractC4996 create(C5002 c5002, byte[] bArr) {
        Companion.getClass();
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = AbstractC2339.f9301;
        if ((j | j2) < 0 || j > length2 || length2 - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new C5008(c5002, length, bArr, 0);
    }

    public static final AbstractC4996 create(byte[] bArr) {
        Companion.getClass();
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = AbstractC2339.f9301;
        if ((j | j2) < 0 || j > length2 || length2 - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new C5008(null, length, bArr, 0);
    }

    public abstract long contentLength();

    public abstract C5002 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC4160 interfaceC4160);
}
