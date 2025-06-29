package p142;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p200.AbstractC2746;
import p200.C2742;
import p200.C2757;
import p340.AbstractC3876;
import ˆˑ.ﹳﹳ;

/* renamed from: ˉי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2220 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Resources f8790;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f8791;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f8792;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f8793;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f8794;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public boolean f8795;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f8796;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f8797;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C2742 f8798;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public boolean f8799;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f8800;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ColorStateList f8801;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f8802;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Rect f8803;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f8804;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f8805;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f8806;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f8807;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f8808;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C2757 f8809;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2221 f8810;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public SparseArray f8811;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Drawable[] f8812;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public PorterDuff.Mode f8813;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ColorFilter f8814;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f8815;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f8816;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f8817;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f8818;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f8819;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int f8820;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f8821;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int[][] f8822;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f8823;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f8824;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f8825;

    public C2220(C2220 c2220, C2221 c2221, Resources resources) {
        this.f8823 = false;
        this.f8797 = false;
        this.f8825 = true;
        this.f8808 = 0;
        this.f8820 = 0;
        this.f8810 = c2221;
        this.f8790 = resources != null ? resources : c2220 != null ? c2220.f8790 : null;
        int i = c2220 != null ? c2220.f8806 : 0;
        int i2 = AbstractC2224.f8837;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f8806 = i;
        if (c2220 != null) {
            this.f8821 = c2220.f8821;
            this.f8791 = c2220.f8791;
            this.f8792 = true;
            this.f8799 = true;
            this.f8823 = c2220.f8823;
            this.f8797 = c2220.f8797;
            this.f8825 = c2220.f8825;
            this.f8824 = c2220.f8824;
            this.f8808 = c2220.f8808;
            this.f8820 = c2220.f8820;
            this.f8795 = c2220.f8795;
            this.f8814 = c2220.f8814;
            this.f8793 = c2220.f8793;
            this.f8801 = c2220.f8801;
            this.f8813 = c2220.f8813;
            this.f8794 = c2220.f8794;
            this.f8818 = c2220.f8818;
            if (c2220.f8806 == i) {
                if (c2220.f8796) {
                    this.f8803 = c2220.f8803 != null ? new Rect(c2220.f8803) : null;
                    this.f8796 = true;
                }
                if (c2220.f8800) {
                    this.f8815 = c2220.f8815;
                    this.f8804 = c2220.f8804;
                    this.f8807 = c2220.f8807;
                    this.f8817 = c2220.f8817;
                    this.f8800 = true;
                }
            }
            if (c2220.f8802) {
                this.f8816 = c2220.f8816;
                this.f8802 = true;
            }
            if (c2220.f8819) {
                this.f8819 = true;
            }
            Drawable[] drawableArr = c2220.f8812;
            this.f8812 = new Drawable[drawableArr.length];
            this.f8805 = c2220.f8805;
            SparseArray sparseArray = c2220.f8811;
            if (sparseArray != null) {
                this.f8811 = sparseArray.clone();
            } else {
                this.f8811 = new SparseArray(this.f8805);
            }
            int i3 = this.f8805;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f8811.put(i4, constantState);
                    } else {
                        this.f8812[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.f8812 = new Drawable[10];
            this.f8805 = 0;
        }
        if (c2220 != null) {
            this.f8822 = c2220.f8822;
        } else {
            this.f8822 = new int[this.f8812.length][];
        }
        if (c2220 != null) {
            this.f8798 = c2220.f8798;
            this.f8809 = c2220.f8809;
        } else {
            this.f8798 = new C2742();
            this.f8809 = new C2757();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f8805;
        Drawable[] drawableArr = this.f8812;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8811.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f8821 | this.f8791;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2221(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2221(this, resources);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6190() {
        this.f8800 = true;
        m6192();
        int i = this.f8805;
        Drawable[] drawableArr = this.f8812;
        this.f8804 = -1;
        this.f8815 = -1;
        this.f8817 = 0;
        this.f8807 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f8815) {
                this.f8815 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f8804) {
                this.f8804 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f8807) {
                this.f8807 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f8817) {
                this.f8817 = minimumHeight;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m6191(int i) {
        ?? r5;
        if (i < 0) {
            return 0;
        }
        C2757 c2757 = this.f8809;
        int i2 = 0;
        int iM9072 = AbstractC3876.m9072(c2757.f10787, i, c2757.f10788);
        if (iM9072 >= 0 && (r5 = c2757.f10786[iM9072]) != AbstractC2746.f10740) {
            i2 = r5;
        }
        return i2.intValue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6192() {
        SparseArray sparseArray = this.f8811;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f8811.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8811.valueAt(i);
                Drawable[] drawableArr = this.f8812;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f8790);
                if (Build.VERSION.SDK_INT >= 23) {
                    ﹳﹳ.ˈٴ(drawableNewDrawable, this.f8824);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f8810);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f8811 = null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6193(Drawable drawable) {
        int i = this.f8805;
        if (i >= this.f8812.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f8812;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f8812 = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f8822, 0, iArr, 0, i);
            this.f8822 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f8810);
        this.f8812[i] = drawable;
        this.f8805++;
        this.f8791 = drawable.getChangingConfigurations() | this.f8791;
        this.f8802 = false;
        this.f8819 = false;
        this.f8803 = null;
        this.f8796 = false;
        this.f8800 = false;
        this.f8792 = false;
        return i;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m6194(int[] iArr) {
        int[][] iArr2 = this.f8822;
        int i = this.f8805;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Drawable m6195(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f8812[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f8811;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f8811.valueAt(iIndexOfKey)).newDrawable(this.f8790);
        if (Build.VERSION.SDK_INT >= 23) {
            ﹳﹳ.ˈٴ(drawableNewDrawable, this.f8824);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f8810);
        this.f8812[i] = drawableMutate;
        this.f8811.removeAt(iIndexOfKey);
        if (this.f8811.size() == 0) {
            this.f8811 = null;
        }
        return drawableMutate;
    }
}
