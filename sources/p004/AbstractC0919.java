package p004;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p107.AbstractC1801;
import p171.AbstractC2466;
import p222.C2900;
import p222.C2965;
import p334.C3789;

/* renamed from: ʻʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0919 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Drawable m3740(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m3741(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m3742(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m3743(C2900 c2900, int i) {
        c2900.setHyphenationFrequency(i);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean m3744(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m3745(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m3746(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m3747(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m3748(Context context, int i) {
        return context.getColor(i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static Icon m3749(IconCompat iconCompat) {
        Icon iconCreateWithBitmap;
        String strM3763;
        int i;
        int i2 = iconCompat.f318;
        switch (i2) {
            case -1:
                return (Icon) iconCompat.f313;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f313);
                break;
            case 2:
                if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f313;
                    if (i >= 28) {
                        strM3763 = AbstractC0921.m3763(obj);
                    } else {
                        try {
                            strM3763 = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            strM3763 = null;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f315;
                    strM3763 = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f313).split(":", -1)[0] : iconCompat.f315;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM3763, iconCompat.f314);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f313, iconCompat.f314, iconCompat.f319);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f313);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    Bitmap bitmap = (Bitmap) iconCompat.f313;
                    int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float f = iMin * 0.5f;
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f, f, 0.9166667f * f, paint);
                    canvas.setBitmap(null);
                    iconCreateWithBitmap = Icon.createWithBitmap(bitmapCreateBitmap);
                    break;
                } else {
                    iconCreateWithBitmap = AbstractC1801.m5541((Bitmap) iconCompat.f313);
                    break;
                }
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT < 30) {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m200());
                }
                iconCreateWithBitmap = AbstractC2466.m6585(iconCompat.m200());
                break;
        }
        ColorStateList colorStateList = iconCompat.f320;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f316;
        if (mode != IconCompat.f312) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m3750(C2900 c2900) {
        return c2900.getBreakStrategy();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Object m3751(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m3752(Context context, Class cls) {
        return context.getSystemServiceName(cls);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m3753(C2965 c2965, boolean z) {
        c2965.setOverlapAnchor(z);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m3754(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m3755(C2900 c2900) {
        return c2900.getHyphenationFrequency();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m3756(C2900 c2900, int i) {
        c2900.setBreakStrategy(i);
    }
}
