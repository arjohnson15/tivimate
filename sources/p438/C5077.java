package p438;

import java.util.Arrays;

/* renamed from: ﹶﾞ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5077 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f19294;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f19295;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f19296;

    public C5077(C5101 c5101) {
        this.f19296 = c5101.f19426;
        this.f19294 = c5101.f19424;
        this.f19295 = c5101.f19425;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5077)) {
            return false;
        }
        C5077 c5077 = (C5077) obj;
        return this.f19296 == c5077.f19296 && this.f19294 == c5077.f19294 && this.f19295 == c5077.f19295;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19296), Float.valueOf(this.f19294), Long.valueOf(this.f19295)});
    }
}
