package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p204.C2772;
import p204.C2784;
import p378.C4332;

/* renamed from: com.google.android.material.datepicker.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0699 extends C4332 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f3329;

    public /* synthetic */ C0699(int i) {
        this.f3329 = i;
    }

    @Override // p378.C4332
    /* renamed from: ˑʽ */
    public void mo2855(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3329) {
            case 3:
                super.mo2855(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo2855(view, accessibilityEvent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // p378.C4332
    /* renamed from: ᐧʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2856(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f3329
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.mo2856(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.mo2856(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1f
        L1c:
            r0 = 0
            goto La0
        L1f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3c
            int r7 = r2.height()
        L3c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L76
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L76
            goto L1c
        L4f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m202(r1, r0, r6)
            goto La0
        L76:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m202(r1, r0, r6)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C0699.mo2856(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        int scrollRange;
        switch (this.f3329) {
            case 0:
                this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                c2784.m7053(null);
                break;
            case 1:
                this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                c2784.m7055(false);
                break;
            case 2:
                this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                c2784.m7053(null);
                break;
            default:
                this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c2784.m7063(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c2784.m7055(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c2784.m7051(C2772.f10835);
                        c2784.m7051(C2772.f10832);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c2784.m7051(C2772.f10834);
                        c2784.m7051(C2772.f10831);
                        break;
                    }
                }
                break;
        }
    }
}
