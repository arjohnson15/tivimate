package p371;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p052.C1328;
import p095.AbstractC1761;
import p290.RunnableC3408;
import p421.AbstractC4862;

/* renamed from: ᵢʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4205 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Method f16218;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean f16219;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final float[][] f16217 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final float[][] f16214 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final float[] f16216 = {95.047f, 100.0f, 108.883f};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final float[][] f16220 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Object f16215 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m9642(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m9643(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static List m9644(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m9645(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            AbstractC4210.m9657(theme);
            return;
        }
        if (i >= 23) {
            synchronized (f16215) {
                if (!f16219) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        f16218 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                    }
                    f16219 = true;
                }
                Method method = f16218;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        f16218 = null;
                    }
                }
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static InterfaceC4216 m9646(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1761.f6816);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(5);
            String string3 = typedArrayObtainAttributes.getString(6);
            String string4 = typedArrayObtainAttributes.getString(2);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(3, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
            String string5 = typedArrayObtainAttributes.getString(7);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m9652(xmlResourceParser);
                }
                List listM9644 = m9644(resources, resourceId);
                return new C4215(new C1328(string, string2, string3, listM9644), string4 != null ? new C1328(string, string2, string4, listM9644) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1761.f6818);
                        int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                        int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i4);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m9652(xmlResourceParser);
                        }
                        arrayList.add(new C4214(string7, i, z, string6, i3, resourceId2));
                    } else {
                        m9652(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C4206((C4214[]) arrayList.toArray(new C4214[0]));
            }
        } else {
            m9652(xmlResourceParser);
        }
        return null;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static float m9647() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static TypedArray m9648(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ᐧʻ m9649(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ᐧʻ r3;
        if (m9643(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ᐧʻ((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                r3 = ᐧʻ.ʿʼ(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                r3 = null;
            }
            if (r3 != null) {
                return r3;
            }
        }
        return new ᐧʻ((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m9650(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f16216;
        return AbstractC4862.m10941(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static float m9651(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m9652(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m9653(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (m9643(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: ˉי */
    public abstract void mo7176(Typeface typeface);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m9654(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3408(i, 1, this));
    }

    /* renamed from: ﹶˆ */
    public abstract void mo7177(int i);
}
