package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p222.AbstractC2891;
import p222.C2869;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC2891 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m138(View view) {
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m138(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // p222.AbstractC2891, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = 0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            ˏᴵ.ʽⁱ r6 = (p222.C2869) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8d
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L98
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L8b:
            int r7 = r7 - r8
            goto L98
        L8d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L8b
        L98:
            boolean r8 = r9.m7229(r0)
            if (r8 == 0) goto L9f
            int r12 = r12 + r14
        L9f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lad:
            int r0 = r0 + 1
            goto L50
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p222.AbstractC2891, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM138;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id._2_res_0x7f0b03a3) {
                    view = childAt;
                } else if (id == R.id._2_res_0x7f0b00b4) {
                    view2 = childAt;
                } else {
                    if ((id != R.id._2_res_0x7f0b00f2 && id != R.id._2_res_0x7f0b010a) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM138 = m138(view2);
            measuredHeight = view2.getMeasuredHeight() - iM138;
            paddingBottom += iM138;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM138 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iM138;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM138 += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM138, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    C2869 c2869 = (C2869) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c2869).width == -1) {
                        int i8 = ((LinearLayout.LayoutParams) c2869).height;
                        ((LinearLayout.LayoutParams) c2869).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) c2869).height = i8;
                    }
                }
            }
        }
    }
}
