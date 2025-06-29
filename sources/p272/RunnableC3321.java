package p272;

import androidx.media3.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.measurement.C0559;
import p337.InterfaceC3822;
import p383.AbstractC4470;
import p438.C5107;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;

/* renamed from: ـᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3321 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12880;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12881;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12882;

    public /* synthetic */ RunnableC3321(int i, Object obj, boolean z) {
        this.f12882 = i;
        this.f12881 = obj;
        this.f12880 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f12880;
        Object obj = this.f12881;
        switch (this.f12882) {
            case 0:
                int i = AspectRatioFrameLayout.f1448;
                ((AspectRatioFrameLayout) obj).m1149(z);
                break;
            default:
                C0559 c0559 = (C0559) obj;
                c0559.getClass();
                int i2 = AbstractC4470.f17202;
                C5118 c5118 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247;
                if (c5118.f19576 != z) {
                    c5118.f19576 = z;
                    c5118.f19524.ᐧʻ(23, new C5107(1, z));
                    break;
                }
                break;
        }
    }
}
