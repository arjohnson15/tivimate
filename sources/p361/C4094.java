package p361;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ᵔᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4094 implements InterfaceC4104 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f15799;

    public C4094(float f) {
        this.f15799 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4094) && this.f15799 == ((C4094) obj).f15799;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15799)});
    }

    @Override // p361.InterfaceC4104
    /* renamed from: ـﹶ */
    public final float mo9371(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.f15799;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }
}
