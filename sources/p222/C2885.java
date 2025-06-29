package p222;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: ˏᴵ.ˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2885 implements InterfaceC2942 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f11170;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Drawable f11171;

    /* renamed from: ˉי, reason: contains not printable characters */
    public CharSequence f11172;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f11173;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C2908 f11174;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Window.Callback f11175;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public Drawable f11176;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public CharSequence f11177;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public View f11178;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Toolbar f11179;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Drawable f11180;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f11181;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f11182;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Drawable f11183;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public CharSequence f11184;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7208() {
        if ((this.f11170 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f11172);
            Toolbar toolbar = this.f11179;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f11182);
            } else {
                toolbar.setNavigationContentDescription(this.f11172);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7209() {
        Drawable drawable;
        int i = this.f11170;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f11171) == null) {
            drawable = this.f11183;
        }
        this.f11179.setLogo(drawable);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7210(int i) {
        View view;
        int i2 = this.f11170 ^ i;
        this.f11170 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m7208();
                }
                int i3 = this.f11170 & 4;
                Toolbar toolbar = this.f11179;
                if (i3 != 0) {
                    Drawable drawable = this.f11180;
                    if (drawable == null) {
                        drawable = this.f11176;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m7209();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f11179;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f11177);
                    toolbar2.setSubtitle(this.f11184);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f11178) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }
}
