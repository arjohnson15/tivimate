package p061;

import androidx.leanback.widget.ﾞᐧ;

/* renamed from: ʾـ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1400 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﾞᐧ f5711;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5708 = 0;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5710 = -1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5712 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f5709 = null;

    public C1400(ﾞᐧ r2) {
        this.f5711 = r2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4809(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.f5708 == 3 && i <= (i4 = this.f5712 + (i3 = this.f5710)) && (i5 = i + i2) >= i3 && this.f5709 == obj) {
            this.f5710 = Math.min(i, i3);
            this.f5712 = Math.max(i4, i5) - this.f5710;
            return;
        }
        m4811();
        this.f5710 = i;
        this.f5712 = i2;
        this.f5709 = obj;
        this.f5708 = 3;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4810(int i, int i2) {
        m4811();
        ((AbstractC1373) this.f5711.ˆʿ).f5598.m4952(i, i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4811() {
        int i = this.f5708;
        if (i == 0) {
            return;
        }
        ﾞᐧ r2 = this.f5711;
        if (i == 1) {
            r2.ˋˉ(this.f5710, this.f5712);
        } else if (i == 2) {
            r2.ﾞᐧ(this.f5710, this.f5712);
        } else if (i == 3) {
            ((AbstractC1373) r2.ˆʿ).m4757(this.f5710, this.f5712, this.f5709);
        }
        this.f5709 = null;
        this.f5708 = 0;
    }
}
