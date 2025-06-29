package p374;

/* renamed from: ᵢˎ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4290 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f16690;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f16691;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f16692;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f16693;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f16694;

    public C4290(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C4290(Object obj) {
        this(-1L, obj);
    }

    public C4290(Object obj, int i, int i2, long j, int i3) {
        this.f16693 = obj;
        this.f16690 = i;
        this.f16692 = i2;
        this.f16694 = j;
        this.f16691 = i3;
    }

    public C4290(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4290)) {
            return false;
        }
        C4290 c4290 = (C4290) obj;
        return this.f16693.equals(c4290.f16693) && this.f16690 == c4290.f16690 && this.f16692 == c4290.f16692 && this.f16694 == c4290.f16694 && this.f16691 == c4290.f16691;
    }

    public final int hashCode() {
        return ((((((((this.f16693.hashCode() + 527) * 31) + this.f16690) * 31) + this.f16692) * 31) + ((int) this.f16694)) * 31) + this.f16691;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m9753() {
        return this.f16690 != -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4290 m9754(Object obj) {
        if (this.f16693.equals(obj)) {
            return this;
        }
        return new C4290(obj, this.f16690, this.f16692, this.f16694, this.f16691);
    }
}
