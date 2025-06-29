package p378;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* renamed from: ᵢٴ.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4363 extends C4349 {
    public C4363(C4369 c4369, WindowInsets windowInsets) {
        super(c4369, windowInsets);
    }

    @Override // p378.AbstractC4385, p378.C4331
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4363)) {
            return false;
        }
        C4363 c4363 = (C4363) obj;
        return Objects.equals(this.f16902, c4363.f16902) && Objects.equals(this.f16904, c4363.f16904);
    }

    @Override // p378.C4331
    public int hashCode() {
        return this.f16902.hashCode();
    }

    @Override // p378.C4331
    /* renamed from: ʿʼ */
    public C4356 mo9831() {
        DisplayCutout displayCutout = this.f16902.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C4356(displayCutout);
    }

    @Override // p378.C4331
    /* renamed from: ـﹶ */
    public C4369 mo9838() {
        return C4369.m9950(null, this.f16902.consumeDisplayCutout());
    }
}
