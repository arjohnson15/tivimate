package p145;

/* renamed from: ˉᴵ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2238 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f8915;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f8916;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f8917;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f8918;

    public C2238(int i, int i2, String str, String str2) {
        this.f8918 = i;
        this.f8915 = i2;
        this.f8916 = str;
        this.f8917 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2238 c2238 = (C2238) obj;
        int i = this.f8918 - c2238.f8918;
        return i == 0 ? this.f8915 - c2238.f8915 : i;
    }
}
