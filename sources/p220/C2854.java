package p220;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p255.C3189;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˏٴ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2854 extends ᵢʿ {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ int f11095;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final /* synthetic */ Object f11096;

    public /* synthetic */ C2854(int i, Object obj) {
        this.f11095 = i;
        this.f11096 = obj;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    private final void m7167(int i) {
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m7168(int i) {
        switch (this.f11095) {
            case 0:
                C2846 c2846 = (C2846) this.f11096;
                c2846.f11070 = true;
                InterfaceC2843 interfaceC2843 = (InterfaceC2843) c2846.f11066.get();
                if (interfaceC2843 != null) {
                    C3189 c3189 = (C3189) interfaceC2843;
                    c3189.m7885();
                    c3189.invalidateSelf();
                    break;
                }
                break;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m7169(Typeface typeface, boolean z) {
        switch (this.f11095) {
            case 0:
                if (!z) {
                    C2846 c2846 = (C2846) this.f11096;
                    c2846.f11070 = true;
                    InterfaceC2843 interfaceC2843 = (InterfaceC2843) c2846.f11066.get();
                    if (interfaceC2843 != null) {
                        C3189 c3189 = (C3189) interfaceC2843;
                        c3189.m7885();
                        c3189.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f11096;
                C3189 c31892 = chip.f3237;
                chip.setText(c31892.f12357 ? c31892.f12352 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
