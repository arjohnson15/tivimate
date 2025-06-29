package p341;

/* renamed from: ᵎˑ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3898 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f15095;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String f15096;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f15097;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15098;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f15099;

    public C3898(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C3898(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f15098 = str;
        this.f15095 = i2;
        this.f15097 = i3;
        this.f15099 = Integer.MIN_VALUE;
        this.f15096 = "";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9091() {
        if (this.f15099 == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9092() {
        int i = this.f15099;
        this.f15099 = i == Integer.MIN_VALUE ? this.f15095 : i + this.f15097;
        this.f15096 = this.f15098 + this.f15099;
    }
}
