package p361;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ᵔᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4083 implements InterfaceC4104 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f15753;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4104 f15754;

    public C4083(float f, InterfaceC4104 interfaceC4104) {
        while (interfaceC4104 instanceof C4083) {
            interfaceC4104 = ((C4083) interfaceC4104).f15754;
            f += ((C4083) interfaceC4104).f15753;
        }
        this.f15754 = interfaceC4104;
        this.f15753 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4083)) {
            return false;
        }
        C4083 c4083 = (C4083) obj;
        return this.f15754.equals(c4083.f15754) && this.f15753 == c4083.f15753;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15754, Float.valueOf(this.f15753)});
    }

    @Override // p361.InterfaceC4104
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float mo9371(RectF rectF) {
        return Math.max(0.0f, this.f15754.mo9371(rectF) + this.f15753);
    }
}
