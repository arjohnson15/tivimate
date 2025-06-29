package p361;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ᵔᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4097 implements InterfaceC4104 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f15806;

    public C4097(float f) {
        this.f15806 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4097) && this.f15806 == ((C4097) obj).f15806;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15806)});
    }

    public final String toString() {
        return this.f15806 + "px";
    }

    @Override // p361.InterfaceC4104
    /* renamed from: ـﹶ */
    public final float mo9371(RectF rectF) {
        return this.f15806;
    }
}
