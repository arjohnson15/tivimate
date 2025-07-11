package p139;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.C0148;
import com.google.android.material.timepicker.ʿʼ;
import java.util.HashMap;
import p395.AbstractC4535;
import ᵔʼ.ˑʽ;

/* renamed from: ˉˋ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2144 extends AbstractC2160 {

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final String[] f8406 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final C0148 f8408 = new C0148(PointF.class, "topLeft", 9);

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static final C0148 f8409 = new C0148(PointF.class, "bottomRight", 10);

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static final C0148 f8407 = new C0148(PointF.class, "bottomRight", 11);

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static final C0148 f8411 = new C0148(PointF.class, "topLeft", 12);

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static final C0148 f8410 = new C0148(PointF.class, "position", 13);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m6042(C2123 c2123) {
        View view = c2123.f8361;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c2123.f8363;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c2123.f8361.getParent());
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˈٴ */
    public final boolean mo5998() {
        return true;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˉⁱ */
    public final void mo5979(C2123 c2123) {
        m6042(c2123);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p139.AbstractC2160
    /* renamed from: ˑי */
    public final Animator mo5982(ViewGroup viewGroup, C2123 c2123, C2123 c21232) {
        int i;
        ObjectAnimator objectAnimatorM6032;
        if (c2123 == null || c21232 == null) {
            return null;
        }
        HashMap map = c2123.f8363;
        HashMap map2 = c21232.f8363;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = c21232.f8361;
        boolean z = view instanceof TextView;
        C0148 c0148 = f8410;
        if (!z || (i2 == i3 && i6 == i7)) {
            AbstractC2157.m6073(view, i2, i4, i6, i8);
            if (i == 2) {
                if (i10 == i12 && i11 == i13) {
                    this.f8474.getClass();
                    objectAnimatorM6032 = AbstractC2134.m6032(view, c0148, ˑʽ.ﹳˎ(i2, i4, i3, i5));
                } else {
                    C2143 c2143 = new C2143(view);
                    this.f8474.getClass();
                    ObjectAnimator objectAnimatorM60322 = AbstractC2134.m6032(c2143, f8408, ˑʽ.ﹳˎ(i2, i4, i3, i5));
                    this.f8474.getClass();
                    ObjectAnimator objectAnimatorM60323 = AbstractC2134.m6032(c2143, f8409, ˑʽ.ﹳˎ(i6, i8, i7, i9));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorM60322, objectAnimatorM60323);
                    animatorSet.addListener(new ʿʼ(1));
                    objectAnimatorM6032 = animatorSet;
                }
            } else if (i2 == i3 && i4 == i5) {
                this.f8474.getClass();
                objectAnimatorM6032 = AbstractC2134.m6032(view, f8407, ˑʽ.ﹳˎ(i6, i8, i7, i9));
            } else {
                this.f8474.getClass();
                objectAnimatorM6032 = AbstractC2134.m6032(view, f8411, ˑʽ.ﹳˎ(i2, i4, i3, i5));
            }
        } else {
            AbstractC2157.m6073(view, i3, i4, i12 + i3, i13 + i4);
            float f = i3;
            this.f8474.getClass();
            objectAnimatorM6032 = AbstractC2134.m6032(view, c0148, ˑʽ.ﹳˎ(f, i4, f, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC4535.m10321(viewGroup4, true);
            m6082().m6085(new C2136(viewGroup4, 1));
        }
        return objectAnimatorM6032;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᐧʻ */
    public final void mo5983(C2123 c2123) {
        m6042(c2123);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﾞʽ */
    public final String[] mo5985() {
        return f8406;
    }
}
