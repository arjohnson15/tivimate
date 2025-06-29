package p092;

import android.R;
import android.content.res.ColorStateList;
import p222.C2936;
import p278.AbstractC3362;

/* renamed from: ˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1754 extends C2936 {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final int[][] f6787 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ColorStateList f6788;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f6789;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6788 == null) {
            int iM8199 = AbstractC3362.m8199(this, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040132);
            int iM81992 = AbstractC3362.m8199(this, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04014f);
            int iM81993 = AbstractC3362.m8199(this, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040169);
            this.f6788 = new ColorStateList(f6787, new int[]{AbstractC3362.m8206(1.0f, iM81993, iM8199), AbstractC3362.m8206(0.54f, iM81993, iM81992), AbstractC3362.m8206(0.38f, iM81993, iM81992), AbstractC3362.m8206(0.38f, iM81993, iM81992)});
        }
        return this.f6788;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6789 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6789 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
