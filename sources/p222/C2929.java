package p222;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ˏᴵ.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2929 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final RectF f11339 = new RectF();

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final ConcurrentHashMap f11340 = new ConcurrentHashMap();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Context f11343;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2867 f11344;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public TextPaint f11345;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final TextView f11351;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f11347 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f11341 = false;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f11346 = -1.0f;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f11350 = -1.0f;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f11342 = -1.0f;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int[] f11348 = new int[0];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f11349 = false;

    public C2929(TextView textView) {
        this.f11351 = textView;
        this.f11343 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f11344 = new C2884();
        } else if (i >= 23) {
            this.f11344 = new C2863();
        } else {
            this.f11344 = new C2867();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int[] m7282(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Object m7283(Object obj, Object obj2, String str) {
        try {
            return m7284(str).invoke(obj, null);
        } catch (Exception e) {
            String str2 = "Failed to invoke TextView#" + str + "() method";
            return obj2;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Method m7284(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f11340;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            String str2 = "Failed to retrieve TextView#" + str + "() method";
            return null;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m7285() {
        return !(this.f11351 instanceof C2895);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7286(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f11347 = 1;
        this.f11350 = f;
        this.f11342 = f2;
        this.f11346 = f3;
        this.f11349 = false;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m7287() {
        if (m7285() && this.f11347 == 1) {
            if (!this.f11349 || this.f11348.length == 0) {
                int iFloor = ((int) Math.floor((this.f11342 - this.f11350) / this.f11346)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f11346) + this.f11350);
                }
                this.f11348 = m7282(iArr);
            }
            this.f11341 = true;
        } else {
            this.f11341 = false;
        }
        return this.f11341;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7288(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f11348.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f11348[i4];
            TextView textView = this.f11351;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f11345;
            if (textPaint == null) {
                this.f11345 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f11345.set(textView.getPaint());
            this.f11345.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m7283(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = AbstractC2921.m7272(text, alignment, iRound, maxLines, this.f11351, this.f11345, this.f11344);
            } else {
                staticLayout = new StaticLayout(text, this.f11345, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f11348[i3];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7289() {
        if (m7290()) {
            if (this.f11341) {
                if (this.f11351.getMeasuredHeight() <= 0 || this.f11351.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f11344.mo7184(this.f11351) ? 1048576 : (this.f11351.getMeasuredWidth() - this.f11351.getTotalPaddingLeft()) - this.f11351.getTotalPaddingRight();
                int height = (this.f11351.getHeight() - this.f11351.getCompoundPaddingBottom()) - this.f11351.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f11339;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM7288 = m7288(rectF);
                        if (fM7288 != this.f11351.getTextSize()) {
                            m7291(0, fM7288);
                        }
                    } finally {
                    }
                }
            }
            this.f11341 = true;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m7290() {
        return m7285() && this.f11347 != 0;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7291(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f11343;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f11351;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f11341 = false;
                try {
                    Method methodM7284 = m7284("nullLayouts");
                    if (methodM7284 != null) {
                        methodM7284.invoke(textView, null);
                    }
                } catch (Exception e) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m7292() {
        boolean z = this.f11348.length > 0;
        this.f11349 = z;
        if (z) {
            this.f11347 = 1;
            this.f11350 = r0[0];
            this.f11342 = r0[r1 - 1];
            this.f11346 = -1.0f;
        }
        return z;
    }
}
