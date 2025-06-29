package p378;

import android.view.DisplayCutout;
import j$.util.Objects;

/* renamed from: ᵢٴ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4356 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final DisplayCutout f16862;

    public C4356(DisplayCutout displayCutout) {
        this.f16862 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4356.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f16862, ((C4356) obj).f16862);
    }

    public final int hashCode() {
        return this.f16862.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f16862 + "}";
    }
}
