package p188;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p260.C3222;
import p261.InterfaceC3251;
import p314.C3598;
import p314.InterfaceC3595;
import p331.C3762;

/* renamed from: ˎʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2611 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2631 f10389;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10390;

    public /* synthetic */ C2611(C2631 c2631, int i) {
        this.f10390 = i;
        this.f10389 = c2631;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f10390) {
            case 0:
                this.f10389.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f10390) {
            case 0:
                C2631 c2631 = this.f10389;
                return c2631.m6816(new C3222((ByteBuffer) obj, c2631.f10433, c2631.f10431, 7, false), i, i2, c3598, C2631.f10424);
            default:
                C2631 c26312 = this.f10389;
                return c26312.m6816(new C3762((ParcelFileDescriptor) obj, c26312.f10433, c26312.f10431), i, i2, c3598, C2631.f10424);
        }
    }
}
