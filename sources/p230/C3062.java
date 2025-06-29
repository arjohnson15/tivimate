package p230;

import java.nio.ByteBuffer;
import p166.C2431;
import p312.C3589;
import p383.AbstractC4470;
import p383.C4457;
import p438.AbstractC5115;
import p456.C5349;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˑˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3062 extends AbstractC5115 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C3589 f11789;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public long f11790;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public long f11791;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C4457 f11792;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC3070 f11793;

    public C3062() {
        super(6);
        this.f11789 = new C3589(1, 0);
        this.f11792 = new C4457();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ */
    public final void mo1115(C2431[] c2431Arr, long j, long j2) {
        this.f11791 = j2;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ */
    public final int mo1118(C2431 c2431) {
        return "application/x-camera-motion".equals(c2431.f9667) ? ᐧʻ.ˑʽ(4, 0, 0, 0) : ᐧʻ.ˑʽ(0, 0, 0, 0);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return m11335();
    }

    @Override // p438.AbstractC5115, p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public final void mo1125(int i, Object obj) {
        if (i == 8) {
            this.f11793 = (InterfaceC3070) obj;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) {
        this.f11790 = Long.MIN_VALUE;
        InterfaceC3070 interfaceC3070 = this.f11793;
        if (interfaceC3070 != null) {
            interfaceC3070.mo7557();
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        InterfaceC3070 interfaceC3070 = this.f11793;
        if (interfaceC3070 != null) {
            interfaceC3070.mo7557();
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "CameraMotionRenderer";
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ */
    public final void mo1138(long j, long j2) {
        float[] fArr;
        while (!m11335() && this.f11790 < 100000 + j) {
            C3589 c3589 = this.f11789;
            c3589.mo8492();
            C5349 c5349 = this.f19479;
            c5349.m12099();
            if (m11336(c5349, c3589, 0) != -4 || c3589.m4401(4)) {
                return;
            }
            long j3 = c3589.f13807;
            this.f11790 = j3;
            boolean z = j3 < this.f19475;
            if (this.f11793 != null && !z) {
                c3589.m8494();
                ByteBuffer byteBuffer = c3589.f13800;
                int i = AbstractC4470.f17202;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C4457 c4457 = this.f11792;
                    c4457.m10081(iLimit, bArrArray);
                    c4457.m10108(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(c4457.m10083());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f11793.mo7556(this.f11790 - this.f11791, fArr);
                }
            }
        }
    }
}
