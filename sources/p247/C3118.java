package p247;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ˈⁱ.ˉⁱ;

/* renamed from: יʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3118 extends ˉⁱ {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f12021;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12022;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f12023 = -1;

    public C3118(SwipeDismissBehavior swipeDismissBehavior) {
        this.f12021 = swipeDismissBehavior;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m7648(View view) {
        return view.getWidth();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m7649(int i) {
        this.f12021.getClass();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7650(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f12021.f3139;
        if (i2 == 0) {
            if (z) {
                width = this.f12022 - view.getWidth();
                width2 = this.f12022;
            } else {
                width = this.f12022;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f12022 - view.getWidth();
            width2 = view.getWidth() + this.f12022;
        } else if (z) {
            width = this.f12022;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f12022 - view.getWidth();
            width2 = this.f12022;
        }
        return Math.min(Math.max(width, i), width2);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m7651(View view, int i) {
        int i2 = this.f12023;
        return (i2 == -1 || i2 == i) && this.f12021.mo2807(view);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m7652(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f12021;
        float f = width * swipeDismissBehavior.f3134;
        float width2 = view.getWidth() * swipeDismissBehavior.f3137;
        float fAbs = Math.abs(i - this.f12022);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m7653(View view, int i) {
        this.f12023 = i;
        this.f12022 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f12021;
            swipeDismissBehavior.f3135 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3135 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7654(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f12023 = r11
            int r11 = r9.getWidth()
            r0 = 0
            r1 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f12021
            r3 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r1) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            int r6 = r2.f3139
            r7 = 2
            if (r6 != r7) goto L1f
            goto L54
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L68
            goto L54
        L28:
            if (r4 <= 0) goto L68
            goto L54
        L2b:
            if (r6 != r1) goto L68
            if (r5 == 0) goto L32
            if (r4 <= 0) goto L68
            goto L54
        L32:
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L68
            goto L54
        L37:
            int r4 = r9.getLeft()
            int r5 = r8.f12022
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r2.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L68
        L54:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L63
            int r10 = r9.getLeft()
            int r0 = r8.f12022
            if (r10 >= r0) goto L61
            goto L63
        L61:
            int r0 = r0 + r11
            goto L6b
        L63:
            int r10 = r8.f12022
            int r0 = r10 - r11
            goto L6b
        L68:
            int r0 = r8.f12022
            r1 = 0
        L6b:
            ﾞˎ.ﹳﹳ r10 = r2.f3136
            int r11 = r9.getTop()
            boolean r10 = r10.m11572(r0, r11)
            if (r10 == 0) goto L7f
            ⁱـ.ˎٴ r10 = new ⁱـ.ˎٴ
            r10.<init>(r2, r9, r1)
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p247.C3118.m7654(android.view.View, float, float):void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m7655(View view, int i) {
        return view.getTop();
    }
}
