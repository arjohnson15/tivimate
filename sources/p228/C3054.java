package p228;

import android.graphics.Typeface;
import p371.AbstractC4205;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˑʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3054 extends AbstractC4205 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ ᵢʿ f11761;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final /* synthetic */ C3057 f11762;

    public C3054(C3057 c3057, ᵢʿ r2) {
        this.f11762 = c3057;
        this.f11761 = r2;
    }

    @Override // p371.AbstractC4205
    /* renamed from: ˉי */
    public final void mo7176(Typeface typeface) {
        C3057 c3057 = this.f11762;
        c3057.f11779 = Typeface.create(typeface, c3057.f11784);
        c3057.f11783 = true;
        this.f11761.ﾞˊ(c3057.f11779, false);
    }

    @Override // p371.AbstractC4205
    /* renamed from: ﹶˆ */
    public final void mo7177(int i) {
        this.f11762.f11783 = true;
        this.f11761.ˋˊ(i);
    }
}
