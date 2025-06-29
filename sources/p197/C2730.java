package p197;

/* renamed from: ˎˑ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2730 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f10682;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final float f10683;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public float f10684;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f10685;

    public C2730(float f) {
        this.f10683 = f;
    }

    public C2730(float f, float f2) {
        this.f10683 = f;
        this.f10684 = f2;
        this.f10685 = true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2730 clone() {
        boolean z = this.f10685;
        float f = this.f10683;
        C2730 c2730 = z ? new C2730(f, this.f10684) : new C2730(f);
        c2730.f10682 = this.f10682;
        return c2730;
    }
}
