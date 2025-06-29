package p371;

import android.content.res.Resources;
import j$.util.Objects;

/* renamed from: ᵢʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4207 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Resources.Theme f16222;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Resources f16223;

    public C4207(Resources resources, Resources.Theme theme) {
        this.f16223 = resources;
        this.f16222 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4207.class != obj.getClass()) {
            return false;
        }
        C4207 c4207 = (C4207) obj;
        return this.f16223.equals(c4207.f16223) && Objects.equals(this.f16222, c4207.f16222);
    }

    public final int hashCode() {
        return Objects.hash(this.f16223, this.f16222);
    }
}
