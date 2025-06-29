package p222;

import androidx.appcompat.widget.Toolbar;
import p320.C3644;

/* renamed from: ˏᴵ.יי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2922 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f11319;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11320;

    public /* synthetic */ RunnableC2922(Toolbar toolbar, int i) {
        this.f11320 = i;
        this.f11319 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11320) {
            case 0:
                C2881 c2881 = this.f11319.f224;
                C3644 c3644 = c2881 == null ? null : c2881.f11151;
                if (c3644 != null) {
                    c3644.collapseActionView();
                    break;
                }
                break;
            default:
                this.f11319.m159();
                break;
        }
    }
}
