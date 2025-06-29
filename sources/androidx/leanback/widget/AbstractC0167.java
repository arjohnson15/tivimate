package androidx.leanback.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import p061.C1364;
import p061.C1425;

/* renamed from: androidx.leanback.widget.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0167 extends C1425 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final /* synthetic */ GridLayoutManager f1124;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f1125;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0167(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager.f801.getContext());
        this.f1124 = gridLayoutManager;
    }

    @Override // p061.C1425
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int mo961(int i) {
        int iMo961 = super.mo961(i);
        int i2 = ((C0149) this.f1124.f788.ᐧˋ).f1063;
        if (i2 <= 0) {
            return iMo961;
        }
        float f = (30.0f / i2) * i;
        return ((float) iMo961) < f ? (int) f : iMo961;
    }

    /* renamed from: ˏʾ */
    public void mo943() {
        View viewMo1262 = this.f5804.f1683.mo1262(this.f5814);
        GridLayoutManager gridLayoutManager = this.f1124;
        if (viewMo1262 == null) {
            int i = this.f5814;
            if (i >= 0) {
                gridLayoutManager.m850(i, false, 0);
                return;
            }
            return;
        }
        int i2 = gridLayoutManager.f791;
        int i3 = this.f5814;
        if (i2 != i3) {
            gridLayoutManager.f791 = i3;
        }
        if (gridLayoutManager.m4842()) {
            gridLayoutManager.f790 |= 32;
            viewMo1262.requestFocus();
            gridLayoutManager.f790 &= -33;
        }
        gridLayoutManager.m798();
        gridLayoutManager.m816();
    }

    @Override // p061.C1425
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo962() {
        super.mo962();
        if (!this.f1125) {
            mo943();
        }
        GridLayoutManager gridLayoutManager = this.f1124;
        if (gridLayoutManager.f823 == this) {
            gridLayoutManager.f823 = null;
        }
        if (gridLayoutManager.f796 == this) {
            gridLayoutManager.f796 = null;
        }
    }

    @Override // p061.C1425
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float mo963(DisplayMetrics displayMetrics) {
        return super.mo963(displayMetrics) * this.f1124.f803;
    }

    @Override // p061.C1425
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo964(View view, C1364 c1364) {
        int i;
        int i2;
        int[] iArr = GridLayoutManager.f783;
        GridLayoutManager gridLayoutManager = this.f1124;
        if (gridLayoutManager.m802(view, null, iArr)) {
            if (gridLayoutManager.f813 == 0) {
                i = iArr[0];
                i2 = iArr[1];
            } else {
                i = iArr[1];
                i2 = iArr[0];
            }
            int iCeil = (int) Math.ceil(mo961((int) Math.sqrt((i2 * i2) + (i * i))) / 0.3356d);
            DecelerateInterpolator decelerateInterpolator = this.f5806;
            c1364.f5534 = i;
            c1364.f5531 = i2;
            c1364.f5533 = iCeil;
            c1364.f5532 = decelerateInterpolator;
            c1364.f5535 = true;
        }
    }
}
