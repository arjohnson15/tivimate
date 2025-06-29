package p383;

/* renamed from: ᵢᵢ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4467 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4467 f17187 = new C4467(-1, -1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17188;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f17189;

    static {
        new C4467(0, 0);
    }

    public C4467(int i, int i2) {
        AbstractC4464.m10142((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f17189 = i;
        this.f17188 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4467)) {
            return false;
        }
        C4467 c4467 = (C4467) obj;
        return this.f17189 == c4467.f17189 && this.f17188 == c4467.f17188;
    }

    public final int hashCode() {
        int i = this.f17189;
        return ((i >>> 16) | (i << 16)) ^ this.f17188;
    }

    public final String toString() {
        return this.f17189 + "x" + this.f17188;
    }
}
