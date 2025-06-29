package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: ʻ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0878 implements InterfaceC0875 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f3991;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Uri f3992;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0875 f3993;

    public C0878(InterfaceC0875 interfaceC0875) {
        interfaceC0875.getClass();
        this.f3993 = interfaceC0875;
        this.f3992 = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        this.f3993.close();
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) {
        int iMo3679 = this.f3993.mo3679(bArr, i, i2);
        if (iMo3679 != -1) {
            this.f3991 += iMo3679;
        }
        return iMo3679;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        return this.f3993.mo3674();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) {
        this.f3992 = c0882.f4004;
        Collections.emptyMap();
        InterfaceC0875 interfaceC0875 = this.f3993;
        long jMo3680 = interfaceC0875.mo3680(c0882);
        Uri uriMo3681 = interfaceC0875.mo3681();
        uriMo3681.getClass();
        this.f3992 = uriMo3681;
        interfaceC0875.mo3674();
        return jMo3680;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f3993.mo3681();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        interfaceC0880.getClass();
        this.f3993.mo3678(interfaceC0880);
    }
}
