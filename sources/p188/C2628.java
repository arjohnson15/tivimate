package p188;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p063.C1451;
import p261.InterfaceC3251;
import p314.C3598;
import p314.InterfaceC3595;
import p329.AbstractC3731;

/* renamed from: ˎʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2628 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1451 f10419;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10420;

    public C2628(int i) {
        this.f10420 = i;
        switch (i) {
            case 1:
                this.f10419 = new C1451();
                break;
            default:
                this.f10419 = new C1451();
                break;
        }
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final /* bridge */ /* synthetic */ boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f10420) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f10420) {
            case 0:
                return this.f10419.m5007(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c3598);
            default:
                return this.f10419.m5007(ImageDecoder.createSource(AbstractC3731.m8693((InputStream) obj)), i, i2, c3598);
        }
    }
}
