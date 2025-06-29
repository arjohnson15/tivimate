package p142;

import android.graphics.drawable.Animatable;
import p131.C2061;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2223 extends ـﹶ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Animatable f8835;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f8836;

    public /* synthetic */ C2223(Animatable animatable, int i) {
        this.f8836 = i;
        this.f8835 = animatable;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m6203() {
        switch (this.f8836) {
            case 0:
                this.f8835.start();
                break;
            default:
                ((C2061) this.f8835).start();
                break;
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m6204() {
        switch (this.f8836) {
            case 0:
                this.f8835.stop();
                break;
            default:
                ((C2061) this.f8835).stop();
                break;
        }
    }
}
