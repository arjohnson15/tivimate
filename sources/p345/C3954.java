package p345;

/* renamed from: ᵎᴵ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3954 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f15318;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f15319;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f15320;

    public C3954(Object obj, Object obj2, Object obj3) {
        this.f15320 = obj;
        this.f15318 = obj2;
        this.f15319 = obj3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IllegalArgumentException m9160() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f15320;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f15318);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f15319);
        return new IllegalArgumentException(sb.toString());
    }
}
