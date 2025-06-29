package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p061.AbstractC1371;
import p061.AbstractC1375;
import p061.AbstractC1402;
import p061.C1438;

/* renamed from: androidx.leanback.widget.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0164 extends RecyclerView {

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public InterfaceC0165 f1114;

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public int f1115;

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public AbstractC1371 f1116;

    /* renamed from: יʾ, reason: contains not printable characters */
    public boolean f1117;

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public int f1118;

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public GridLayoutManager f1119;

    /* renamed from: ﾞי, reason: contains not printable characters */
    public boolean f1120;

    public AbstractC0164(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1120 = true;
        this.f1117 = true;
        this.f1118 = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.f1119 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C1438) getItemAnimator()).f5896 = false;
        this.f1679.add(new C0174(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0165 interfaceC0165 = this.f1114;
        return (interfaceC0165 != null && interfaceC0165.mo960(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.f1119;
            View viewMo1262 = gridLayoutManager.mo1262(gridLayoutManager.f791);
            if (viewMo1262 != null) {
                return focusSearch(viewMo1262, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        GridLayoutManager gridLayoutManager = this.f1119;
        View viewMo1262 = gridLayoutManager.mo1262(gridLayoutManager.f791);
        return (viewMo1262 != null && i2 >= (iIndexOfChild = indexOfChild(viewMo1262))) ? i2 < i + (-1) ? ((iIndexOfChild + i) - 1) - i2 : iIndexOfChild : i2;
    }

    public int getExtraLayoutSpace() {
        return this.f1119.f799;
    }

    public int getFocusScrollStrategy() {
        return this.f1119.f812;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f1119.f802;
    }

    public int getHorizontalSpacing() {
        return this.f1119.f802;
    }

    public int getInitialPrefetchItemCount() {
        return this.f1118;
    }

    public int getItemAlignmentOffset() {
        return ((C0190) this.f1119.f794.f12540).f1168;
    }

    public float getItemAlignmentOffsetPercent() {
        return ((C0190) this.f1119.f794.f12540).f1170;
    }

    public int getItemAlignmentViewId() {
        return ((C0190) this.f1119.f794.f12540).f1171;
    }

    public InterfaceC0175 getOnUnhandledKeyListener() {
        return null;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f1119.f785.f1032;
    }

    public final int getSaveChildrenPolicy() {
        return this.f1119.f785.f1034;
    }

    public int getSelectedPosition() {
        return this.f1119.f791;
    }

    public int getSelectedSubPosition() {
        return this.f1119.f818;
    }

    public InterfaceC0178 getSmoothScrollByBehavior() {
        return null;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.f1119.f814;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.f1119.f803;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f1119.f817;
    }

    public int getVerticalSpacing() {
        return this.f1119.f817;
    }

    public int getWindowAlignment() {
        return ((C0149) this.f1119.f788.ᐧˋ).f1060;
    }

    public int getWindowAlignmentOffset() {
        return ((C0149) this.f1119.f788.ᐧˋ).f1061;
    }

    public float getWindowAlignmentOffsetPercent() {
        return ((C0149) this.f1119.f788.ᐧˋ).f1057;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1117;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        GridLayoutManager gridLayoutManager = this.f1119;
        if (!z) {
            gridLayoutManager.getClass();
            return;
        }
        int i2 = gridLayoutManager.f791;
        while (true) {
            View viewMo1262 = gridLayoutManager.mo1262(i2);
            if (viewMo1262 == null) {
                return;
            }
            if (viewMo1262.getVisibility() == 0 && viewMo1262.hasFocusable()) {
                viewMo1262.requestFocus();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if ((this.f1115 & 1) == 1) {
            return false;
        }
        GridLayoutManager gridLayoutManager = this.f1119;
        int i5 = gridLayoutManager.f812;
        if (i5 != 1 && i5 != 2) {
            View viewMo1262 = gridLayoutManager.mo1262(gridLayoutManager.f791);
            if (viewMo1262 != null) {
                return viewMo1262.requestFocus(i, rect);
            }
            return false;
        }
        int iM4846 = gridLayoutManager.m4846();
        if ((i & 2) != 0) {
            i3 = iM4846;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = iM4846 - 1;
            i3 = -1;
            i4 = -1;
        }
        C0149 c0149 = (C0149) gridLayoutManager.f788.ᐧˋ;
        int i6 = c0149.f1054;
        int i7 = ((c0149.f1063 - i6) - c0149.f1056) + i6;
        while (true) {
            if (i2 == i3) {
                z = false;
                break;
            }
            View viewM4847 = gridLayoutManager.m4847(i2);
            if (viewM4847.getVisibility() == 0 && gridLayoutManager.f821.mo4722(viewM4847) >= i6 && gridLayoutManager.f821.mo4725(viewM4847) <= i7 && viewM4847.requestFocus(i, rect)) {
                break;
            }
            i2 += i4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r7) {
        /*
            r6 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r6.f1119
            if (r0 == 0) goto L31
            int r1 = r0.f813
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L11
            if (r7 != r3) goto Lf
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L15
        Lf:
            r1 = 0
            goto L15
        L11:
            if (r7 != r3) goto Lf
            r1 = 524288(0x80000, float:7.34684E-40)
        L15:
            int r4 = r0.f790
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 != r1) goto L1d
            goto L31
        L1d:
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f790 = r1
            ﹶˋ.ـﹶ r0 = r0.f788
            java.lang.Object r0 = r0.ˎˑ
            androidx.leanback.widget.ˊˆ r0 = (androidx.leanback.widget.C0149) r0
            if (r7 != r3) goto L2f
            r2 = 1
        L2f:
            r0.f1055 = r2
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.AbstractC0164.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z = view.hasFocus() && isFocusable();
        if (z) {
            this.f1115 = 1 | this.f1115;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.f1115 ^= -2;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        boolean zHasFocus = getChildAt(i).hasFocus();
        if (zHasFocus) {
            this.f1115 |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (zHasFocus) {
            this.f1115 ^= -2;
        }
    }

    public void setAnimateChildLayout(boolean z) {
        if (this.f1120 != z) {
            this.f1120 = z;
            if (z) {
                super.setItemAnimator(this.f1116);
            } else {
                this.f1116 = getItemAnimator();
                super.setItemAnimator(null);
            }
        }
    }

    public void setChildrenVisibility(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        gridLayoutManager.f811 = i;
        if (i != -1) {
            int iM4846 = gridLayoutManager.m4846();
            for (int i2 = 0; i2 < iM4846; i2++) {
                gridLayoutManager.m4847(i2).setVisibility(gridLayoutManager.f811);
            }
        }
    }

    public void setExtraLayoutSpace(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        int i2 = gridLayoutManager.f799;
        if (i2 == i) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        gridLayoutManager.f799 = i;
        gridLayoutManager.m4838();
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f1119.f812 = i;
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : 262144);
        GridLayoutManager gridLayoutManager = this.f1119;
        gridLayoutManager.f790 = (z ? 32768 : 0) | (gridLayoutManager.f790 & (-32769));
    }

    public void setGravity(int i) {
        this.f1119.f815 = i;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.f1117 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if (gridLayoutManager.f813 == 0) {
            gridLayoutManager.f802 = i;
            gridLayoutManager.f784 = i;
        } else {
            gridLayoutManager.f802 = i;
            gridLayoutManager.f816 = i;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.f1118 = i;
    }

    public void setItemAlignmentOffset(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        ((C0190) gridLayoutManager.f794.f12540).f1168 = i;
        gridLayoutManager.m809();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        GridLayoutManager gridLayoutManager = this.f1119;
        ((C0190) gridLayoutManager.f794.f12540).m982(f);
        gridLayoutManager.m809();
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        GridLayoutManager gridLayoutManager = this.f1119;
        ((C0190) gridLayoutManager.f794.f12540).f1172 = z;
        gridLayoutManager.m809();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        ((C0190) gridLayoutManager.f794.f12540).f1171 = i;
        gridLayoutManager.m809();
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        gridLayoutManager.f802 = i;
        gridLayoutManager.f817 = i;
        gridLayoutManager.f816 = i;
        gridLayoutManager.f784 = i;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        GridLayoutManager gridLayoutManager = this.f1119;
        int i = gridLayoutManager.f790;
        if (((i & 512) != 0) != z) {
            gridLayoutManager.f790 = (i & (-513)) | (z ? 512 : 0);
            gridLayoutManager.m4838();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(AbstractC1402 abstractC1402) {
        if (abstractC1402 != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) abstractC1402;
            this.f1119 = gridLayoutManager;
            gridLayoutManager.f801 = this;
            gridLayoutManager.f798 = null;
            super.setLayoutManager(abstractC1402);
            return;
        }
        super.setLayoutManager(null);
        GridLayoutManager gridLayoutManager2 = this.f1119;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.f801 = null;
            gridLayoutManager2.f798 = null;
        }
        this.f1119 = null;
    }

    public void setOnChildLaidOutListener(InterfaceC0155 interfaceC0155) {
        this.f1119.getClass();
    }

    @SuppressLint({"ReferencesDeprecated"})
    public void setOnChildSelectedListener(InterfaceC0184 interfaceC0184) {
        this.f1119.f800 = interfaceC0184;
    }

    public void setOnChildViewHolderSelectedListener(AbstractC0141 abstractC0141) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if (abstractC0141 == null) {
            gridLayoutManager.f809 = null;
            return;
        }
        ArrayList arrayList = gridLayoutManager.f809;
        if (arrayList == null) {
            gridLayoutManager.f809 = new ArrayList();
        } else {
            arrayList.clear();
        }
        gridLayoutManager.f809.add(abstractC0141);
    }

    public void setOnKeyInterceptListener(InterfaceC0165 interfaceC0165) {
        this.f1114 = interfaceC0165;
    }

    public void setOnMotionInterceptListener(InterfaceC0199 interfaceC0199) {
    }

    public void setOnTouchInterceptListener(InterfaceC0140 interfaceC0140) {
    }

    public void setOnUnhandledKeyListener(InterfaceC0175 interfaceC0175) {
    }

    public void setPruneChild(boolean z) {
        GridLayoutManager gridLayoutManager = this.f1119;
        int i = gridLayoutManager.f790;
        if (((i & 65536) != 0) != z) {
            gridLayoutManager.f790 = (i & (-65537)) | (z ? 65536 : 0);
            if (z) {
                gridLayoutManager.m4838();
            }
        }
    }

    public final void setSaveChildrenLimitNumber(int i) {
        C0137 c0137 = this.f1119.f785;
        c0137.f1032 = i;
        c0137.m903();
    }

    public final void setSaveChildrenPolicy(int i) {
        C0137 c0137 = this.f1119.f785;
        c0137.f1034 = i;
        c0137.m903();
    }

    public void setScrollEnabled(boolean z) {
        int i;
        GridLayoutManager gridLayoutManager = this.f1119;
        int i2 = gridLayoutManager.f790;
        if (((i2 & 131072) != 0) != z) {
            int i3 = (i2 & (-131073)) | (z ? 131072 : 0);
            gridLayoutManager.f790 = i3;
            if ((i3 & 131072) == 0 || gridLayoutManager.f812 != 0 || (i = gridLayoutManager.f791) == -1) {
                return;
            }
            gridLayoutManager.m850(i, true, gridLayoutManager.f818);
        }
    }

    public void setSelectedPosition(int i) {
        this.f1119.m860(i, false);
    }

    public void setSelectedPositionSmooth(int i) {
        this.f1119.m860(i, true);
    }

    public final void setSmoothScrollByBehavior(InterfaceC0178 interfaceC0178) {
    }

    public final void setSmoothScrollMaxPendingMoves(int i) {
        this.f1119.f814 = i;
    }

    public final void setSmoothScrollSpeedFactor(float f) {
        this.f1119.f803 = f;
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if (gridLayoutManager.f813 == 1) {
            gridLayoutManager.f817 = i;
            gridLayoutManager.f784 = i;
        } else {
            gridLayoutManager.f817 = i;
            gridLayoutManager.f816 = i;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        ((C0149) this.f1119.f788.ᐧˋ).f1060 = i;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        ((C0149) this.f1119.f788.ᐧˋ).f1061 = i;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        C0149 c0149 = (C0149) this.f1119.f788.ᐧˋ;
        c0149.getClass();
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        c0149.f1057 = f;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        C0149 c0149 = (C0149) this.f1119.f788.ᐧˋ;
        c0149.f1053 = z ? c0149.f1053 | 2 : c0149.f1053 & (-3);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        C0149 c0149 = (C0149) this.f1119.f788.ᐧˋ;
        c0149.f1053 = z ? c0149.f1053 | 1 : c0149.f1053 & (-2);
        requestLayout();
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final void m954(int i, InterfaceC0131 interfaceC0131) {
        AbstractC1375 abstractC1375M1292 = m1292(i, false);
        if (abstractC1375M1292 == null || m1304()) {
            C0136 c0136 = new C0136((VerticalGridView) this, i, interfaceC0131);
            GridLayoutManager gridLayoutManager = this.f1119;
            if (gridLayoutManager.f809 == null) {
                gridLayoutManager.f809 = new ArrayList();
            }
            gridLayoutManager.f809.add(c0136);
        } else {
            interfaceC0131.mo897(abstractC1375M1292);
        }
        setSelectedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final void mo955(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if ((gridLayoutManager.f790 & 64) != 0) {
            gridLayoutManager.m860(i, false);
        } else {
            super.mo955(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void mo956(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if ((gridLayoutManager.f790 & 64) != 0) {
            gridLayoutManager.m860(i, false);
        } else {
            super.mo956(i);
        }
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final void m957(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0171.f1134);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        GridLayoutManager gridLayoutManager = this.f1119;
        gridLayoutManager.f790 = (z ? 2048 : 0) | (gridLayoutManager.f790 & (-6145)) | (z2 ? 4096 : 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        GridLayoutManager gridLayoutManager2 = this.f1119;
        gridLayoutManager2.f790 = (z3 ? 8192 : 0) | (gridLayoutManager2.f790 & (-24577)) | (z4 ? 16384 : 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (gridLayoutManager2.f813 == 1) {
            gridLayoutManager2.f817 = dimensionPixelSize;
            gridLayoutManager2.f784 = dimensionPixelSize;
        } else {
            gridLayoutManager2.f817 = dimensionPixelSize;
            gridLayoutManager2.f816 = dimensionPixelSize;
        }
        GridLayoutManager gridLayoutManager3 = this.f1119;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (gridLayoutManager3.f813 == 0) {
            gridLayoutManager3.f802 = dimensionPixelSize2;
            gridLayoutManager3.f784 = dimensionPixelSize2;
        } else {
            gridLayoutManager3.f802 = dimensionPixelSize2;
            gridLayoutManager3.f816 = dimensionPixelSize2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void mo958(int i, int i2) {
        m1300(i, false, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void mo959(int i, int i2) {
        m1300(i, false, i2);
    }
}
