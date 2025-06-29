package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.leanback.widget.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0204 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Rect f1214 = new Rect();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m996(View view, C0189 c0189, int i) {
        View viewFindViewById;
        int i2;
        int height;
        int width;
        int width2;
        int width3;
        C0187 c0187 = (C0187) view.getLayoutParams();
        int i3 = c0189.f1171;
        if (i3 == 0 || (viewFindViewById = view.findViewById(i3)) == null) {
            viewFindViewById = view;
        }
        int paddingBottom = c0189.f1168;
        Rect rect = f1214;
        if (i != 0) {
            if (c0189.f1172) {
                float f = c0189.f1170;
                if (f == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingBottom();
                }
            }
            if (c0189.f1170 != -1.0f) {
                if (viewFindViewById == view) {
                    c0187.getClass();
                    height = (viewFindViewById.getHeight() - c0187.f1165) - c0187.f1164;
                } else {
                    height = viewFindViewById.getHeight();
                }
                paddingBottom += (int) ((height * c0189.f1170) / 100.0f);
            }
            if (view != viewFindViewById) {
                rect.top = paddingBottom;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                i2 = rect.top - c0187.f1165;
            } else {
                i2 = paddingBottom;
            }
            return c0189.f1169 ? i2 + viewFindViewById.getBaseline() : i2;
        }
        if (view.getLayoutDirection() != 1) {
            if (c0189.f1172) {
                float f2 = c0189.f1170;
                if (f2 == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingRight();
                }
            }
            if (c0189.f1170 != -1.0f) {
                if (viewFindViewById == view) {
                    c0187.getClass();
                    width = (viewFindViewById.getWidth() - c0187.f1160) - c0187.f1166;
                } else {
                    width = viewFindViewById.getWidth();
                }
                paddingBottom += (int) ((width * c0189.f1170) / 100.0f);
            }
            int i4 = paddingBottom;
            if (view == viewFindViewById) {
                return i4;
            }
            rect.left = i4;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
            return rect.left - c0187.f1160;
        }
        if (viewFindViewById == view) {
            c0187.getClass();
            width2 = (viewFindViewById.getWidth() - c0187.f1160) - c0187.f1166;
        } else {
            width2 = viewFindViewById.getWidth();
        }
        int paddingLeft = width2 - paddingBottom;
        if (c0189.f1172) {
            float f3 = c0189.f1170;
            if (f3 == 0.0f) {
                paddingLeft -= viewFindViewById.getPaddingRight();
            } else if (f3 == 100.0f) {
                paddingLeft += viewFindViewById.getPaddingLeft();
            }
        }
        if (c0189.f1170 != -1.0f) {
            if (viewFindViewById == view) {
                c0187.getClass();
                width3 = (viewFindViewById.getWidth() - c0187.f1160) - c0187.f1166;
            } else {
                width3 = viewFindViewById.getWidth();
            }
            paddingLeft -= (int) ((width3 * c0189.f1170) / 100.0f);
        }
        if (view == viewFindViewById) {
            return paddingLeft;
        }
        rect.right = paddingLeft;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
        return rect.right + c0187.f1166;
    }
}
