package p122;

/* renamed from: ˈי.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1913 extends AbstractC1907 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f7255;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f7256;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7257;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f7258;

    public C1913(int i, int i2, String str, boolean z) {
        this.f7257 = str;
        this.f7255 = i;
        this.f7256 = i2;
        this.f7258 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1907)) {
            return false;
        }
        AbstractC1907 abstractC1907 = (AbstractC1907) obj;
        if (this.f7257.equals(((C1913) abstractC1907).f7257)) {
            C1913 c1913 = (C1913) abstractC1907;
            if (this.f7255 == c1913.f7255 && this.f7256 == c1913.f7256 && this.f7258 == c1913.f7258) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f7257.hashCode() ^ 1000003) * 1000003) ^ this.f7255) * 1000003) ^ this.f7256) * 1000003) ^ (this.f7258 ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f7257 + ", pid=" + this.f7255 + ", importance=" + this.f7256 + ", defaultProcess=" + this.f7258 + "}";
    }
}
