package p412;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4703 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f17918;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String f17919;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f17920;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f17921 = false;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f17922;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f17923;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f17924;

    public C4703(C4703 c4703, Object obj) {
        c4703.getClass();
        this.f17918 = c4703.f17918;
        m10621(obj);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10620(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4702.f17916);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (string != null && objValueOf != null) {
            C4703 c4703 = new C4703();
            c4703.f17918 = i;
            c4703.f17921 = z;
            c4703.m10621(objValueOf);
            map.put(string, c4703);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10621(Object obj) {
        switch (AbstractC1702.m5411(this.f17918)) {
            case 0:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f17920 = ((Integer) obj).intValue();
                break;
            case 1:
                this.f17924 = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f17923 = ((Integer) obj).intValue();
                break;
            case 4:
                this.f17919 = (String) obj;
                break;
            case 5:
                this.f17922 = ((Boolean) obj).booleanValue();
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f17924 = ((Float) obj).floatValue();
                break;
        }
    }
}
