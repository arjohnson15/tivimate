package p361;

import android.graphics.RectF;
import java.util.Arrays;
import p447.AbstractC5179;

/* renamed from: ᵔᵔ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4086 implements InterfaceC4104 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f15756;

    public C4086(float f) {
        this.f15756 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4086) && this.f15756 == ((C4086) obj).f15756;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15756)});
    }

    public final String toString() {
        return AbstractC5179.m11550(new StringBuilder(), (int) (this.f15756 * 100.0f), "%");
    }

    @Override // p361.InterfaceC4104
    /* renamed from: ـﹶ */
    public final float mo9371(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f15756;
    }
}
