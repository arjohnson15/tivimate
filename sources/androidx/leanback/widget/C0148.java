package androidx.leanback.widget;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import p139.AbstractC2157;
import p139.C2143;
import p139.C2156;
import p334.C3789;

/* renamed from: androidx.leanback.widget.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0148 extends Property {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1051;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0148(Class cls, String str, int i) {
        super(cls, str);
        this.f1051 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1051) {
            case 0:
                return Float.valueOf(((C0195) obj).f1190);
            case 1:
                return Float.valueOf(((C0195) obj).f1186);
            case 2:
                return Float.valueOf(((C0195) obj).f1189);
            case 3:
                return Integer.valueOf(((AbstractC0144) obj).getStreamPosition());
            case 4:
                return null;
            case 5:
                return null;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return null;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return Float.valueOf(AbstractC2157.f8452.ᴵʿ((View) obj));
            case 15:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f174);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1051) {
            case 0:
                C0195 c0195 = (C0195) obj;
                c0195.f1190 = ((Float) obj2).floatValue();
                c0195.m985();
                c0195.f1187.invalidate();
                break;
            case 1:
                C0195 c01952 = (C0195) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                c01952.f1186 = fFloatValue;
                float f = fFloatValue / 2.0f;
                c01952.f1191 = f;
                PagingIndicator pagingIndicator = c01952.f1187;
                c01952.f1192 = f * pagingIndicator.f873;
                pagingIndicator.invalidate();
                break;
            case 2:
                C0195 c01953 = (C0195) obj;
                c01953.f1189 = ((Float) obj2).floatValue() * c01953.f1188 * c01953.f1194;
                c01953.f1187.invalidate();
                break;
            case 3:
                ((AbstractC0144) obj).setStreamPosition(((Integer) obj2).intValue());
                break;
            case 4:
                C2156 c2156 = (C2156) obj;
                PointF pointF = (PointF) obj2;
                c2156.getClass();
                c2156.f8447 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c2156.f8444 = iRound;
                int i = c2156.f8448 + 1;
                c2156.f8448 = i;
                if (i == c2156.f8449) {
                    AbstractC2157.m6073(c2156.f8445, c2156.f8447, iRound, c2156.f8446, c2156.f8450);
                    c2156.f8448 = 0;
                    c2156.f8449 = 0;
                    break;
                }
                break;
            case 5:
                C2156 c21562 = (C2156) obj;
                PointF pointF2 = (PointF) obj2;
                c21562.getClass();
                c21562.f8446 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c21562.f8450 = iRound2;
                int i2 = c21562.f8449 + 1;
                c21562.f8449 = i2;
                if (c21562.f8448 == i2) {
                    AbstractC2157.m6073(c21562.f8445, c21562.f8447, c21562.f8444, c21562.f8446, iRound2);
                    c21562.f8448 = 0;
                    c21562.f8449 = 0;
                    break;
                }
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC2157.m6073(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC2157.m6073(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 8:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC2157.m6073(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 9:
                C2143 c2143 = (C2143) obj;
                PointF pointF6 = (PointF) obj2;
                c2143.getClass();
                c2143.f8402 = Math.round(pointF6.x);
                int iRound5 = Math.round(pointF6.y);
                c2143.f8399 = iRound5;
                int i3 = c2143.f8403 + 1;
                c2143.f8403 = i3;
                if (i3 == c2143.f8404) {
                    AbstractC2157.m6073(c2143.f8400, c2143.f8402, iRound5, c2143.f8401, c2143.f8405);
                    c2143.f8403 = 0;
                    c2143.f8404 = 0;
                    break;
                }
                break;
            case 10:
                C2143 c21432 = (C2143) obj;
                PointF pointF7 = (PointF) obj2;
                c21432.getClass();
                c21432.f8401 = Math.round(pointF7.x);
                int iRound6 = Math.round(pointF7.y);
                c21432.f8405 = iRound6;
                int i4 = c21432.f8404 + 1;
                c21432.f8404 = i4;
                if (c21432.f8403 == i4) {
                    AbstractC2157.m6073(c21432.f8400, c21432.f8402, c21432.f8399, c21432.f8401, iRound6);
                    c21432.f8403 = 0;
                    c21432.f8404 = 0;
                    break;
                }
                break;
            case 11:
                View view4 = (View) obj;
                PointF pointF8 = (PointF) obj2;
                AbstractC2157.m6073(view4, view4.getLeft(), view4.getTop(), Math.round(pointF8.x), Math.round(pointF8.y));
                break;
            case 12:
                View view5 = (View) obj;
                PointF pointF9 = (PointF) obj2;
                AbstractC2157.m6073(view5, Math.round(pointF9.x), Math.round(pointF9.y), view5.getRight(), view5.getBottom());
                break;
            case 13:
                View view6 = (View) obj;
                PointF pointF10 = (PointF) obj2;
                int iRound7 = Math.round(pointF10.x);
                int iRound8 = Math.round(pointF10.y);
                AbstractC2157.m6073(view6, iRound7, iRound8, view6.getWidth() + iRound7, view6.getHeight() + iRound8);
                break;
            case 14:
                float fFloatValue2 = ((Float) obj2).floatValue();
                AbstractC2157.f8452.ﾞˊ((View) obj, fFloatValue2);
                break;
            case 15:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
