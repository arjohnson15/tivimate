package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0672 extends AbstractC0597 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0597 f3087;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient int f3088;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f3089;

    public C0672(AbstractC0597 abstractC0597, int i, int i2) {
        this.f3087 = abstractC0597;
        this.f3088 = i;
        this.f3089 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ˈי.ʾˈ.ˎٴ(i, this.f3089);
        return this.f3087.get(i + this.f3088);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3089;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0597, java.util.List
    /* renamed from: ˉי, reason: merged with bridge method [inline-methods] */
    public final AbstractC0597 subList(int i, int i2) {
        ˈי.ʾˈ.ﹳˎ(i, i2, this.f3089);
        int i3 = this.f3088;
        return this.f3087.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ٴˎ */
    public final int mo2558() {
        return this.f3087.mo2559() + this.f3088 + this.f3089;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ᐧʻ */
    public final int mo2559() {
        return this.f3087.mo2559() + this.f3088;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ﹶˆ */
    public final Object[] mo2561() {
        return this.f3087.mo2561();
    }
}
