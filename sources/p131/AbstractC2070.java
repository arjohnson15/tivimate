package p131;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.ArrayList;
import p371.AbstractC4205;
import p421.C4857;

/* renamed from: ˉʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2070 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f7854 = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f7848 = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int[] f7853 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f7857 = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f7849 = {R.attr.drawable};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int[] f7855 = {R.attr.name, R.attr.animation};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final int[] f7856 = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final int[] f7852 = {R.attr.ordering};

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final int[] f7858 = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final int[] f7850 = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int[] f7851 = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static PropertyValuesHolder m5730(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m5731(i4)) || (z2 && m5731(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i != 2) {
            C2072 c2072 = i == 3 ? C2072.f7860 : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m5731(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m5731(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m5731(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolderOfInt == null || c2072 == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(c2072);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C4857[] c4857Arr = ˎˑ.ﹶˆ(string);
        C4857[] c4857Arr2 = ˎˑ.ﹶˆ(string2);
        if (c4857Arr == null && c4857Arr2 == null) {
            return null;
        }
        if (c4857Arr == null) {
            if (c4857Arr2 != null) {
                return PropertyValuesHolder.ofObject(str, new C2071(), c4857Arr2);
            }
            return null;
        }
        C2071 c2071 = new C2071();
        if (c4857Arr2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c2071, c4857Arr);
        } else {
            if (!ˎˑ.ˑʽ(c4857Arr, c4857Arr2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c2071, c4857Arr, c4857Arr2);
        }
        return propertyValuesHolderOfObject;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m5731(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x039c, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039e, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a0, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03af, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b1, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bd, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c3, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m5732(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.AbstractC2070.m5732(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ValueAnimator m5733(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        int i = 1;
        TypedArray typedArrayM9648 = AbstractC4205.m9648(resources, theme, attributeSet, f7856);
        TypedArray typedArrayM96482 = AbstractC4205.m9648(resources, theme, attributeSet, f7851);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = AbstractC4205.m9643(xmlResourceParser, "duration") ? typedArrayM9648.getInt(1, 300) : 300;
        long j2 = !AbstractC4205.m9643(xmlResourceParser, "startOffset") ? 0 : typedArrayM9648.getInt(2, 0);
        int i2 = !AbstractC4205.m9643(xmlResourceParser, "valueType") ? 4 : typedArrayM9648.getInt(7, 4);
        if (AbstractC4205.m9643(xmlResourceParser, "valueFrom") && AbstractC4205.m9643(xmlResourceParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayM9648.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i3 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM9648.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i2 = ((z && m5731(i3)) || (z2 && m5731(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM5730 = m5730(typedArrayM9648, i2, 5, 6, "");
            if (propertyValuesHolderM5730 != null) {
                valueAnimator3.setValues(propertyValuesHolderM5730);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(!AbstractC4205.m9643(xmlResourceParser, "repeatCount") ? 0 : typedArrayM9648.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC4205.m9643(xmlResourceParser, "repeatMode") ? 1 : typedArrayM9648.getInt(4, 1));
        if (typedArrayM96482 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strM9653 = AbstractC4205.m9653(typedArrayM96482, xmlResourceParser, "pathData", 1);
            if (strM9653 != null) {
                String strM96532 = AbstractC4205.m9653(typedArrayM96482, xmlResourceParser, "propertyXName", 2);
                String strM96533 = AbstractC4205.m9653(typedArrayM96482, xmlResourceParser, "propertyYName", 3);
                if (strM96532 == null && strM96533 == null) {
                    throw new InflateException(typedArrayM96482.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = ˎˑ.ˉי(strM9653);
                PathMeasure pathMeasure = new PathMeasure(path, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                    i = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(path, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + i);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM9648;
                int i4 = 0;
                int i5 = 0;
                float f2 = 0.0f;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f2 += f;
                    int i7 = i4 + 1;
                    if (i7 < arrayList.size() && f2 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i7;
                    }
                    i5++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM96532 != null ? PropertyValuesHolder.ofFloat(strM96532, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM96533 != null ? PropertyValuesHolder.ofFloat(strM96533, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM9648;
                objectAnimator2.setPropertyName(AbstractC4205.m9653(typedArrayM96482, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayM9648;
        }
        if (AbstractC4205.m9643(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayM96482 != null) {
            typedArrayM96482.recycle();
        }
        return valueAnimator2;
    }
}
