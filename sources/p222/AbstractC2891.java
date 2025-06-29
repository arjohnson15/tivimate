package p222;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p300.AbstractC3505;
import p331.C3762;
import p378.AbstractC4345;

/* renamed from: ˏᴵ.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2891 extends ViewGroup {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f11197;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f11198;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f11199;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f11200;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f11201;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f11202;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f11203;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int[] f11204;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f11205;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f11206;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int[] f11207;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f11208;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f11209;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public float f11210;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public Drawable f11211;

    public AbstractC2891(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11206 = true;
        this.f11198 = -1;
        this.f11201 = 0;
        this.f11199 = 8388659;
        int[] iArr = AbstractC3505.f13591;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, 0);
        AbstractC4345.m9881(this, context, iArr, attributeSet, (TypedArray) c3762M8778.f14531, 0);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f11210 = typedArray.getFloat(4, -1.0f);
        this.f11198 = typedArray.getInt(3, -1);
        this.f11200 = typedArray.getBoolean(7, false);
        setDividerDrawable(c3762M8778.m8784(5));
        this.f11202 = typedArray.getInt(8, 0);
        this.f11209 = typedArray.getDimensionPixelSize(6, 0);
        c3762M8778.m8783();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2869;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f11198 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f11198;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f11198 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f11201;
        if (this.f11205 == 1 && (i = this.f11199 & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f11208) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f11208;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C2869) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f11198;
    }

    public Drawable getDividerDrawable() {
        return this.f11211;
    }

    public int getDividerPadding() {
        return this.f11209;
    }

    public int getDividerWidth() {
        return this.f11197;
    }

    public int getGravity() {
        return this.f11199;
    }

    public int getOrientation() {
        return this.f11205;
    }

    public int getShowDividers() {
        return this.f11202;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f11210;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f11211 == null) {
            return;
        }
        int i2 = 0;
        if (this.f11205 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m7229(i2)) {
                    m7228(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2869) childAt.getLayoutParams())).topMargin) - this.f11203);
                }
                i2++;
            }
            if (m7229(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m7228(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f11203 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2869) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = AbstractC2926.f11335;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m7229(i2)) {
                C2869 c2869 = (C2869) childAt3.getLayoutParams();
                m7227(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c2869).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2869).leftMargin) - this.f11197);
            }
            i2++;
        }
        if (m7229(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C2869 c28692 = (C2869) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c28692).leftMargin;
                    i = this.f11197;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c28692).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f11197;
                right = left - i;
            }
            m7227(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.AbstractC2891.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.AbstractC2891.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f11206 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f11198 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f11211) {
            return;
        }
        this.f11211 = drawable;
        if (drawable != null) {
            this.f11197 = drawable.getIntrinsicWidth();
            this.f11203 = drawable.getIntrinsicHeight();
        } else {
            this.f11197 = 0;
            this.f11203 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f11209 = i;
    }

    public void setGravity(int i) {
        if (this.f11199 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f11199 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f11199;
        if ((8388615 & i3) != i2) {
            this.f11199 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f11200 = z;
    }

    public void setOrientation(int i) {
        if (this.f11205 != i) {
            this.f11205 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f11202) {
            requestLayout();
        }
        this.f11202 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f11199;
        if ((i3 & 112) != i2) {
            this.f11199 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f11210 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m7227(Canvas canvas, int i) {
        this.f11211.setBounds(i, getPaddingTop() + this.f11209, this.f11197 + i, (getHeight() - getPaddingBottom()) - this.f11209);
        this.f11211.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ˏᵢ, reason: merged with bridge method [inline-methods] */
    public C2869 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2869 ? new C2869((C2869) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2869((ViewGroup.MarginLayoutParams) layoutParams) : new C2869(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ٴˎ, reason: merged with bridge method [inline-methods] */
    public C2869 generateDefaultLayoutParams() {
        int i = this.f11205;
        if (i == 0) {
            return new C2869(-2, -2);
        }
        if (i == 1) {
            return new C2869(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: ᐧʻ, reason: merged with bridge method [inline-methods] */
    public C2869 generateLayoutParams(AttributeSet attributeSet) {
        return new C2869(getContext(), attributeSet);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7228(Canvas canvas, int i) {
        this.f11211.setBounds(getPaddingLeft() + this.f11209, i, (getWidth() - getPaddingRight()) - this.f11209, this.f11203 + i);
        this.f11211.draw(canvas);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m7229(int i) {
        if (i == 0) {
            return (this.f11202 & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f11202 & 4) != 0;
        }
        if ((this.f11202 & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }
}
