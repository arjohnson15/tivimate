package p412;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0002;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p080.AbstractC1702;
import p172.AbstractC2468;
import p244.AbstractC3114;
import p334.C3789;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹳˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4696 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final SparseIntArray f17889;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final SparseIntArray f17890;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f17891 = {0, 4, 8};

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f17894 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f17892 = true;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f17893 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17889 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f17890 = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(ModuleDescriptor.MODULE_VERSION, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m10610(C4708 c4708, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            char c = 65535;
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    c = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    c = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (c == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c4708.f17996 = str;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int[] m10611(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC4699.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f266) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f266.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m10612(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10613(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p412.C4696.m10613(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x05fa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0088. Please report as an issue. */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C4700 m10614(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        Object obj;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        C4700 c4700 = new C4700();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC4702.f17912 : AbstractC4702.f17913);
        int[] iArr = f17891;
        SparseIntArray sparseIntArray = f17889;
        C4698 c4698 = c4700.f17901;
        String[] strArr = AbstractC2468.f9811;
        C4695 c4695 = c4700.f17902;
        C4694 c4694 = c4700.f17903;
        C4709 c4709 = c4700.f17906;
        String str4 = "Unknown attribute 0x";
        String str5 = "ConstraintSet";
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C4705 c4705 = new C4705();
            c4705.f17937 = new int[10];
            c4705.f17930 = new int[10];
            c4705.f17936 = 0;
            c4705.f17940 = new int[10];
            c4705.f17931 = new float[10];
            c4705.f17938 = 0;
            c4705.f17939 = new int[5];
            c4705.f17935 = new String[5];
            c4705.f17941 = 0;
            c4705.f17932 = new int[4];
            c4705.f17934 = new boolean[4];
            c4705.f17933 = 0;
            c4694.getClass();
            c4709.getClass();
            c4695.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f17890.get(index)) {
                    case 2:
                        str3 = str4;
                        c4705.m10622(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18027));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str4);
                        str3 = str4;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        sb.toString();
                        i3 = 1;
                        break;
                    case 5:
                        str3 = str4;
                        c4705.m10623(5, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                        str3 = str4;
                        c4705.m10622(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4709.f18019));
                        i3 = 1;
                        break;
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        str3 = str4;
                        c4705.m10622(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4709.f18032));
                        i3 = 1;
                        break;
                    case 8:
                        str3 = str4;
                        c4705.m10622(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18046));
                        i3 = 1;
                        break;
                    case 11:
                        str3 = str4;
                        c4705.m10622(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18066));
                        i3 = 1;
                        break;
                    case 12:
                        str3 = str4;
                        c4705.m10622(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18034));
                        i3 = 1;
                        break;
                    case 13:
                        str3 = str4;
                        c4705.m10622(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18015));
                        i3 = 1;
                        break;
                    case 14:
                        str3 = str4;
                        c4705.m10622(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18042));
                        i3 = 1;
                        break;
                    case 15:
                        str3 = str4;
                        c4705.m10622(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18064));
                        i3 = 1;
                        break;
                    case 16:
                        str3 = str4;
                        c4705.m10622(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18043));
                        i3 = 1;
                        break;
                    case 17:
                        str3 = str4;
                        c4705.m10622(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4709.f18071));
                        i3 = 1;
                        break;
                    case 18:
                        str3 = str4;
                        c4705.m10622(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4709.f18016));
                        i3 = 1;
                        break;
                    case 19:
                        str3 = str4;
                        c4705.m10624(19, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18049));
                        i3 = 1;
                        break;
                    case 20:
                        str3 = str4;
                        c4705.m10624(20, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18075));
                        i3 = 1;
                        break;
                    case 21:
                        str3 = str4;
                        c4705.m10622(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c4709.f18039));
                        i3 = 1;
                        break;
                    case 22:
                        str3 = str4;
                        c4705.m10622(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c4698.f17899)]);
                        i3 = 1;
                        break;
                    case 23:
                        str3 = str4;
                        c4705.m10622(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c4709.f18014));
                        i3 = 1;
                        break;
                    case 24:
                        str3 = str4;
                        c4705.m10622(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18020));
                        i3 = 1;
                        break;
                    case 27:
                        str3 = str4;
                        c4705.m10622(27, typedArrayObtainStyledAttributes.getInt(index, c4709.f18053));
                        i3 = 1;
                        break;
                    case 28:
                        str3 = str4;
                        c4705.m10622(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18065));
                        i3 = 1;
                        break;
                    case 31:
                        str3 = str4;
                        c4705.m10622(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18055));
                        i3 = 1;
                        break;
                    case 34:
                        str3 = str4;
                        c4705.m10622(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18072));
                        i3 = 1;
                        break;
                    case 37:
                        str3 = str4;
                        c4705.m10624(37, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18074));
                        i3 = 1;
                        break;
                    case 38:
                        str3 = str4;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c4700.f17904);
                        c4700.f17904 = resourceId;
                        c4705.m10622(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str3 = str4;
                        c4705.m10624(39, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18062));
                        i3 = 1;
                        break;
                    case 40:
                        str3 = str4;
                        c4705.m10624(40, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18063));
                        i3 = 1;
                        break;
                    case 41:
                        str3 = str4;
                        c4705.m10622(41, typedArrayObtainStyledAttributes.getInt(index, c4709.f18076));
                        i3 = 1;
                        break;
                    case 42:
                        str3 = str4;
                        c4705.m10622(42, typedArrayObtainStyledAttributes.getInt(index, c4709.f18026));
                        i3 = 1;
                        break;
                    case 43:
                        str3 = str4;
                        c4705.m10624(43, typedArrayObtainStyledAttributes.getFloat(index, c4698.f17898));
                        i3 = 1;
                        break;
                    case 44:
                        str3 = str4;
                        c4705.m10625(44, true);
                        c4705.m10624(44, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17880));
                        i3 = 1;
                        break;
                    case 45:
                        str3 = str4;
                        c4705.m10624(45, typedArrayObtainStyledAttributes.getFloat(index, c4695.f17876));
                        i3 = 1;
                        break;
                    case 46:
                        str3 = str4;
                        c4705.m10624(46, typedArrayObtainStyledAttributes.getFloat(index, c4695.f17883));
                        i3 = 1;
                        break;
                    case 47:
                        str3 = str4;
                        c4705.m10624(47, typedArrayObtainStyledAttributes.getFloat(index, c4695.f17887));
                        i3 = 1;
                        break;
                    case 48:
                        str3 = str4;
                        c4705.m10624(48, typedArrayObtainStyledAttributes.getFloat(index, c4695.f17877));
                        i3 = 1;
                        break;
                    case 49:
                        str3 = str4;
                        c4705.m10624(49, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17885));
                        i3 = 1;
                        break;
                    case 50:
                        str3 = str4;
                        c4705.m10624(50, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17886));
                        i3 = 1;
                        break;
                    case 51:
                        str3 = str4;
                        c4705.m10624(51, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17888));
                        i3 = 1;
                        break;
                    case 52:
                        str3 = str4;
                        c4705.m10624(52, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17878));
                        i3 = 1;
                        break;
                    case 53:
                        str3 = str4;
                        c4705.m10624(53, typedArrayObtainStyledAttributes.getDimension(index, c4695.f17881));
                        i3 = 1;
                        break;
                    case 54:
                        str3 = str4;
                        c4705.m10622(54, typedArrayObtainStyledAttributes.getInt(index, c4709.f18030));
                        i3 = 1;
                        break;
                    case 55:
                        str3 = str4;
                        c4705.m10622(55, typedArrayObtainStyledAttributes.getInt(index, c4709.f18057));
                        i3 = 1;
                        break;
                    case 56:
                        str3 = str4;
                        c4705.m10622(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18017));
                        i3 = 1;
                        break;
                    case 57:
                        str3 = str4;
                        c4705.m10622(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18024));
                        i3 = 1;
                        break;
                    case 58:
                        str3 = str4;
                        c4705.m10622(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18067));
                        i3 = 1;
                        break;
                    case 59:
                        str3 = str4;
                        c4705.m10622(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18031));
                        i3 = 1;
                        break;
                    case 60:
                        str3 = str4;
                        c4705.m10624(60, typedArrayObtainStyledAttributes.getFloat(index, c4695.f17884));
                        i3 = 1;
                        break;
                    case 62:
                        str3 = str4;
                        c4705.m10622(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18021));
                        i3 = 1;
                        break;
                    case 63:
                        str3 = str4;
                        c4705.m10624(63, typedArrayObtainStyledAttributes.getFloat(index, c4709.f18054));
                        i3 = 1;
                        break;
                    case 64:
                        str3 = str4;
                        c4705.m10622(64, m10612(typedArrayObtainStyledAttributes, index, c4694.f17870));
                        i3 = 1;
                        break;
                    case 65:
                        str3 = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c4705.m10623(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c4705.m10623(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str3 = str4;
                        c4705.m10622(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str3 = str4;
                        c4705.m10624(67, typedArrayObtainStyledAttributes.getFloat(index, c4694.f17867));
                        i3 = 1;
                        break;
                    case 68:
                        str3 = str4;
                        c4705.m10624(68, typedArrayObtainStyledAttributes.getFloat(index, c4698.f17900));
                        i3 = 1;
                        break;
                    case 69:
                        str3 = str4;
                        c4705.m10624(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str3 = str4;
                        c4705.m10624(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str3 = str4;
                        i3 = 1;
                        break;
                    case 72:
                        str3 = str4;
                        c4705.m10622(72, typedArrayObtainStyledAttributes.getInt(index, c4709.f18022));
                        i3 = 1;
                        break;
                    case 73:
                        str3 = str4;
                        c4705.m10622(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18013));
                        i3 = 1;
                        break;
                    case 74:
                        str3 = str4;
                        c4705.m10623(74, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 75:
                        str3 = str4;
                        c4705.m10625(75, typedArrayObtainStyledAttributes.getBoolean(index, c4709.f18040));
                        i3 = 1;
                        break;
                    case 76:
                        str3 = str4;
                        c4705.m10622(76, typedArrayObtainStyledAttributes.getInt(index, c4694.f17869));
                        i3 = 1;
                        break;
                    case 77:
                        str3 = str4;
                        c4705.m10623(77, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 78:
                        str3 = str4;
                        c4705.m10622(78, typedArrayObtainStyledAttributes.getInt(index, c4698.f17897));
                        i3 = 1;
                        break;
                    case 79:
                        str3 = str4;
                        c4705.m10624(79, typedArrayObtainStyledAttributes.getFloat(index, c4694.f17873));
                        i3 = 1;
                        break;
                    case 80:
                        str3 = str4;
                        c4705.m10625(80, typedArrayObtainStyledAttributes.getBoolean(index, c4709.f18058));
                        i3 = 1;
                        break;
                    case 81:
                        str3 = str4;
                        c4705.m10625(81, typedArrayObtainStyledAttributes.getBoolean(index, c4709.f18035));
                        i3 = 1;
                        break;
                    case 82:
                        str3 = str4;
                        c4705.m10622(82, typedArrayObtainStyledAttributes.getInteger(index, c4694.f17866));
                        i3 = 1;
                        break;
                    case 83:
                        str3 = str4;
                        c4705.m10622(83, m10612(typedArrayObtainStyledAttributes, index, c4695.f17882));
                        i3 = 1;
                        break;
                    case 84:
                        str3 = str4;
                        c4705.m10622(84, typedArrayObtainStyledAttributes.getInteger(index, c4694.f17872));
                        i3 = 1;
                        break;
                    case 85:
                        str3 = str4;
                        c4705.m10624(85, typedArrayObtainStyledAttributes.getFloat(index, c4694.f17871));
                        i3 = 1;
                        break;
                    case 86:
                        str3 = str4;
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c4694.f17874 = resourceId2;
                            c4705.m10622(89, resourceId2);
                            if (c4694.f17874 != -1) {
                                c4705.m10622(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c4694.f17868 = string;
                            c4705.m10623(90, string);
                            if (c4694.f17868.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c4694.f17874 = resourceId3;
                                c4705.m10622(89, resourceId3);
                                c4705.m10622(88, -2);
                            } else {
                                c4705.m10622(88, -1);
                            }
                        } else {
                            c4705.m10622(88, typedArrayObtainStyledAttributes.getInteger(index, c4694.f17874));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str3 = str4;
                        String str6 = "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index);
                        i3 = 1;
                        break;
                    case 93:
                        str3 = str4;
                        c4705.m10622(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18077));
                        i3 = 1;
                        break;
                    case 94:
                        str3 = str4;
                        c4705.m10622(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4709.f18011));
                        i3 = 1;
                        break;
                    case 95:
                        str3 = str4;
                        m10613(c4705, typedArrayObtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str3 = str4;
                        i3 = 1;
                        m10613(c4705, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str3 = str4;
                        c4705.m10622(97, typedArrayObtainStyledAttributes.getInt(index, c4709.f18068));
                        i3 = 1;
                        break;
                    case 98:
                        str3 = str4;
                        int i7 = AbstractC3114.f12010;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c4700.f17904 = typedArrayObtainStyledAttributes.getResourceId(index, c4700.f17904);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str3 = str4;
                        c4705.m10625(99, typedArrayObtainStyledAttributes.getBoolean(index, c4709.f18052));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str4 = str3;
            }
        } else {
            Object obj2 = "CURRENTLY UNSUPPORTED";
            String str7 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    c4694.getClass();
                    c4709.getClass();
                    c4695.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18041 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18041);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18027 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18027);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18037 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18037);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18056 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18056);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18044 = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18019 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4709.f18019);
                        i2 = 1;
                        break;
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18032 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4709.f18032);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18046 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18046);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18028 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18028);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18018 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18018);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18066 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18066);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18034 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18034);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18015 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18015);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18042 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18042);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18064 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18064);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18043 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18043);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18071 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4709.f18071);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18016 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4709.f18016);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18049 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18049);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18075 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18075);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18039 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c4709.f18039);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        int i10 = typedArrayObtainStyledAttributes.getInt(index2, c4698.f17899);
                        c4698.f17899 = i10;
                        c4698.f17899 = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18014 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c4709.f18014);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18020);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18038 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18038);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18073 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18073);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18053 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18053);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18065 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18065);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18023 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18023);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18036 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18036);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18055 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18055);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18059 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18059);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18069 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18069);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18072 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18072);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18029 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18029);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18025 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18025);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18074 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18074);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4700.f17904 = typedArrayObtainStyledAttributes.getResourceId(index2, c4700.f17904);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18062 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18062);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18063 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18063);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18076 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18076);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18026 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18026);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4698.f17898 = typedArrayObtainStyledAttributes.getFloat(index2, c4698.f17898);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17879 = true;
                        c4695.f17880 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17880);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17876 = typedArrayObtainStyledAttributes.getFloat(index2, c4695.f17876);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17883 = typedArrayObtainStyledAttributes.getFloat(index2, c4695.f17883);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17887 = typedArrayObtainStyledAttributes.getFloat(index2, c4695.f17887);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17877 = typedArrayObtainStyledAttributes.getFloat(index2, c4695.f17877);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17885 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17885);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17886 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17886);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17888 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17888);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17878 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17878);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17881 = typedArrayObtainStyledAttributes.getDimension(index2, c4695.f17881);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18030 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18030);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18057 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18057);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18017 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18017);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18024 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18024);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18067 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18067);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18031 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18031);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4695.f17884 = typedArrayObtainStyledAttributes.getFloat(index2, c4695.f17884);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18070 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18070);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18021 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18021);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4709.f18054 = typedArrayObtainStyledAttributes.getFloat(index2, c4709.f18054);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        c4694.f17870 = m10612(typedArrayObtainStyledAttributes, index2, c4694.f17870);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str8 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c4694.getClass();
                            i2 = 1;
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c4694.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c4694.getClass();
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        c4694.f17867 = typedArrayObtainStyledAttributes.getFloat(index2, c4694.f17867);
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        c4698.f17900 = typedArrayObtainStyledAttributes.getFloat(index2, c4698.f17900);
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        c4709.f18045 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        c4709.f18012 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        obj = obj2;
                        str = str7;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str = str7;
                        c4709.f18022 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18022);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str = str7;
                        c4709.f18013 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18013);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str = str7;
                        c4709.f18047 = typedArrayObtainStyledAttributes.getString(index2);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str = str7;
                        c4709.f18040 = typedArrayObtainStyledAttributes.getBoolean(index2, c4709.f18040);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str = str7;
                        c4694.f17869 = typedArrayObtainStyledAttributes.getInt(index2, c4694.f17869);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str = str7;
                        c4709.f18061 = typedArrayObtainStyledAttributes.getString(index2);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str = str7;
                        c4698.f17897 = typedArrayObtainStyledAttributes.getInt(index2, c4698.f17897);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str = str7;
                        c4694.f17873 = typedArrayObtainStyledAttributes.getFloat(index2, c4694.f17873);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str = str7;
                        c4709.f18058 = typedArrayObtainStyledAttributes.getBoolean(index2, c4709.f18058);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str = str7;
                        c4709.f18035 = typedArrayObtainStyledAttributes.getBoolean(index2, c4709.f18035);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str = str7;
                        c4694.f17866 = typedArrayObtainStyledAttributes.getInteger(index2, c4694.f17866);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str = str7;
                        c4695.f17882 = m10612(typedArrayObtainStyledAttributes, index2, c4695.f17882);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str = str7;
                        c4694.f17872 = typedArrayObtainStyledAttributes.getInteger(index2, c4694.f17872);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str = str7;
                        c4694.f17871 = typedArrayObtainStyledAttributes.getFloat(index2, c4694.f17871);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str = str7;
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c4694.f17874 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c4694.f17868 = string2;
                            if (string2.indexOf("/") > 0) {
                                c4694.f17874 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c4694.f17874);
                        }
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str = str7;
                        String str9 = "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str7;
                        StringBuilder sb2 = new StringBuilder(str);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        sb2.toString();
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str = str7;
                        c4709.f18060 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18060);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str = str7;
                        c4709.f18033 = m10612(typedArrayObtainStyledAttributes, index2, c4709.f18033);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str = str7;
                        c4709.f18077 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18077);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str = str7;
                        c4709.f18011 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4709.f18011);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str = str7;
                        m10613(c4709, typedArrayObtainStyledAttributes, index2, 0);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str = str7;
                        m10613(c4709, typedArrayObtainStyledAttributes, index2, 1);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str = str7;
                        c4709.f18068 = typedArrayObtainStyledAttributes.getInt(index2, c4709.f18068);
                        obj = obj2;
                        str2 = str5;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str7 = str;
                str5 = str2;
                obj2 = obj;
                i8 = 1;
            }
            if (c4709.f18047 != null) {
                c4709.f18051 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c4700;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10615(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        C4696 c4696 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c4696.f17893;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C4708 c4708 = (C4708) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c4696.f17892 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new C4700());
            }
            C4700 c4700 = (C4700) map3.get(Integer.valueOf(id));
            if (c4700 == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = c4696.f17894;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    C4703 c4703 = (C4703) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new C4703(c4703, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                StringBuilder sbM50 = AbstractC0002.m50(" Custom Attribute \"", str, "\" not found on ");
                                sbM50.append(cls.getName());
                                sbM50.toString();
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                String str2 = cls.getName() + " must have a method " + str;
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                StringBuilder sbM502 = AbstractC0002.m50(" Custom Attribute \"", str, "\" not found on ");
                                sbM502.append(cls.getName());
                                sbM502.toString();
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new C4703(c4703, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                c4700.f17905 = map5;
                c4700.f17904 = id;
                int i4 = c4708.f17947;
                C4709 c4709 = c4700.f17906;
                c4709.f18038 = i4;
                c4709.f18073 = c4708.f17980;
                c4709.f18023 = c4708.f17983;
                c4709.f18036 = c4708.f17969;
                c4709.f18025 = c4708.f18004;
                c4709.f18029 = c4708.f17954;
                c4709.f18056 = c4708.f17967;
                c4709.f18037 = c4708.f17956;
                c4709.f18041 = c4708.f17960;
                c4709.f18060 = c4708.f17987;
                c4709.f18033 = c4708.f17968;
                c4709.f18059 = c4708.f17990;
                c4709.f18069 = c4708.f18000;
                c4709.f18018 = c4708.f17949;
                c4709.f18028 = c4708.f17959;
                c4709.f18075 = c4708.f17984;
                c4709.f18074 = c4708.f17951;
                c4709.f18044 = c4708.f17996;
                c4709.f18070 = c4708.f17972;
                c4709.f18021 = c4708.f17991;
                c4709.f18054 = c4708.f17964;
                c4709.f18019 = c4708.f17994;
                c4709.f18032 = c4708.f17993;
                c4709.f18053 = c4708.f18007;
                c4709.f18049 = c4708.f17970;
                c4709.f18071 = c4708.f17979;
                c4709.f18016 = c4708.f17945;
                c4709.f18014 = ((ViewGroup.MarginLayoutParams) c4708).width;
                c4709.f18039 = ((ViewGroup.MarginLayoutParams) c4708).height;
                c4709.f18020 = ((ViewGroup.MarginLayoutParams) c4708).leftMargin;
                c4709.f18065 = ((ViewGroup.MarginLayoutParams) c4708).rightMargin;
                c4709.f18072 = ((ViewGroup.MarginLayoutParams) c4708).topMargin;
                c4709.f18027 = ((ViewGroup.MarginLayoutParams) c4708).bottomMargin;
                c4709.f18077 = c4708.f17963;
                c4709.f18063 = c4708.f17958;
                c4709.f18062 = c4708.f18003;
                c4709.f18026 = c4708.f17986;
                c4709.f18076 = c4708.f17977;
                c4709.f18058 = c4708.f17957;
                c4709.f18035 = c4708.f17961;
                c4709.f18030 = c4708.f18008;
                c4709.f18057 = c4708.f17946;
                c4709.f18017 = c4708.f17997;
                c4709.f18024 = c4708.f17965;
                c4709.f18067 = c4708.f17974;
                c4709.f18031 = c4708.f17973;
                c4709.f18045 = c4708.f17995;
                c4709.f18012 = c4708.f17942;
                c4709.f18061 = c4708.f17988;
                c4709.f18043 = c4708.f18005;
                c4709.f18066 = c4708.f18001;
                c4709.f18015 = c4708.f18006;
                c4709.f18042 = c4708.f17975;
                c4709.f18064 = c4708.f17952;
                c4709.f18034 = c4708.f17985;
                c4709.f18011 = c4708.f17950;
                c4709.f18068 = c4708.f17948;
                c4709.f18046 = c4708.getMarginEnd();
                c4709.f18055 = c4708.getMarginStart();
                int visibility = childAt.getVisibility();
                C4698 c4698 = c4700.f17901;
                c4698.f17899 = visibility;
                c4698.f17898 = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C4695 c4695 = c4700.f17902;
                c4695.f17884 = rotation;
                c4695.f17876 = childAt.getRotationX();
                c4695.f17883 = childAt.getRotationY();
                c4695.f17887 = childAt.getScaleX();
                c4695.f17877 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c4695.f17885 = pivotX;
                    c4695.f17886 = pivotY;
                }
                c4695.f17888 = childAt.getTranslationX();
                c4695.f17878 = childAt.getTranslationY();
                c4695.f17881 = childAt.getTranslationZ();
                if (c4695.f17879) {
                    c4695.f17880 = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c4709.f18040 = barrier.getAllowsGoneWidget();
                    c4709.f18051 = barrier.getReferencedIds();
                    c4709.f18022 = barrier.getType();
                    c4709.f18013 = barrier.getMargin();
                }
            }
            i2++;
            c4696 = this;
            childCount = i;
            map3 = map;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10616(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C4700 c4700M10614 = m10614(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c4700M10614.f17906.f18048 = true;
                    }
                    this.f17893.put(Integer.valueOf(c4700M10614.f17904), c4700M10614);
                }
            }
        } catch (IOException e) {
            String str = "Error parsing resource: " + i;
        } catch (XmlPullParserException e2) {
            String str2 = "Error parsing resource: " + i;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10617(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i;
        HashMap map;
        int i2;
        int i3;
        HashMap map2;
        String resourceEntryName;
        C4696 c4696 = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i4 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c4696.f17893;
        HashSet hashSet = new HashSet(map3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            int id = childAt.getId();
            if (!map3.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                sb.toString();
            } else {
                if (c4696.f17892 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map3.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C4700 c4700 = (C4700) map3.get(Integer.valueOf(id));
                        if (c4700 != null) {
                            if (childAt instanceof Barrier) {
                                C4709 c4709 = c4700.f17906;
                                c4709.f18050 = i4;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c4709.f18022);
                                barrier.setMargin(c4709.f18013);
                                barrier.setAllowsGoneWidget(c4709.f18040);
                                int[] iArr = c4709.f18051;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c4709.f18047;
                                    if (str != null) {
                                        int[] iArrM10611 = m10611(barrier, str);
                                        c4709.f18051 = iArrM10611;
                                        barrier.setReferencedIds(iArrM10611);
                                    }
                                }
                            }
                            C4708 c4708 = (C4708) childAt.getLayoutParams();
                            c4708.m10626();
                            c4700.m10619(c4708);
                            HashMap map4 = c4700.f17905;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map4.keySet()) {
                                C4703 c4703 = (C4703) map4.get(str2);
                                String str3 = !c4703.f17921 ? ᐧʻ.ﾞˊ("set", str2) : str2;
                                HashMap map5 = map4;
                                try {
                                    switch (AbstractC1702.m5411(c4703.f17918)) {
                                        case 0:
                                            i3 = childCount;
                                            map2 = map3;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(str3, clsArr).invoke(childAt, Integer.valueOf(c4703.f17920));
                                            } catch (IllegalAccessException e) {
                                                StringBuilder sbM50 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM50.append(cls.getName());
                                                sbM50.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e2) {
                                                String str4 = cls.getName() + " must have a method " + str3;
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e3) {
                                                StringBuilder sbM502 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM502.append(cls.getName());
                                                sbM502.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        case 1:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c4703.f17924));
                                            break;
                                        case 2:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c4703.f17923));
                                            break;
                                        case 3:
                                            i3 = childCount;
                                            map2 = map3;
                                            Method method = cls.getMethod(str3, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c4703.f17923);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(str3, CharSequence.class).invoke(childAt, c4703.f17919);
                                            break;
                                        case 5:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c4703.f17922));
                                            break;
                                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                            i3 = childCount;
                                            try {
                                                map2 = map3;
                                            } catch (IllegalAccessException e4) {
                                                map2 = map3;
                                                StringBuilder sbM503 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM503.append(cls.getName());
                                                sbM503.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e5) {
                                                map2 = map3;
                                                String str42 = cls.getName() + " must have a method " + str3;
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e6) {
                                                map2 = map3;
                                                StringBuilder sbM5022 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM5022.append(cls.getName());
                                                sbM5022.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                            try {
                                                cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c4703.f17924));
                                            } catch (IllegalAccessException e7) {
                                                StringBuilder sbM5032 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM5032.append(cls.getName());
                                                sbM5032.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e8) {
                                                String str422 = cls.getName() + " must have a method " + str3;
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e9) {
                                                StringBuilder sbM50222 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM50222.append(cls.getName());
                                                sbM50222.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                            i3 = childCount;
                                            try {
                                                cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c4703.f17920));
                                                map2 = map3;
                                            } catch (IllegalAccessException e10) {
                                                map2 = map3;
                                                StringBuilder sbM50322 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM50322.append(cls.getName());
                                                sbM50322.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e11) {
                                                map2 = map3;
                                                String str4222 = cls.getName() + " must have a method " + str3;
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e12) {
                                                map2 = map3;
                                                StringBuilder sbM502222 = AbstractC0002.m50(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM502222.append(cls.getName());
                                                sbM502222.toString();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        default:
                                            i3 = childCount;
                                            map2 = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e13) {
                                    i3 = childCount;
                                } catch (NoSuchMethodException e14) {
                                    i3 = childCount;
                                } catch (InvocationTargetException e15) {
                                    i3 = childCount;
                                }
                                map4 = map5;
                                childCount = i3;
                                map3 = map2;
                            }
                            i = childCount;
                            map = map3;
                            childAt.setLayoutParams(c4708);
                            C4698 c4698 = c4700.f17901;
                            if (c4698.f17897 == 0) {
                                childAt.setVisibility(c4698.f17899);
                            }
                            childAt.setAlpha(c4698.f17898);
                            C4695 c4695 = c4700.f17902;
                            childAt.setRotation(c4695.f17884);
                            childAt.setRotationX(c4695.f17876);
                            childAt.setRotationY(c4695.f17883);
                            childAt.setScaleX(c4695.f17887);
                            childAt.setScaleY(c4695.f17877);
                            if (c4695.f17882 != -1) {
                                if (((View) childAt.getParent()).findViewById(c4695.f17882) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c4695.f17885)) {
                                    childAt.setPivotX(c4695.f17885);
                                }
                                if (!Float.isNaN(c4695.f17886)) {
                                    childAt.setPivotY(c4695.f17886);
                                }
                            }
                            childAt.setTranslationX(c4695.f17888);
                            childAt.setTranslationY(c4695.f17878);
                            childAt.setTranslationZ(c4695.f17881);
                            if (c4695.f17879) {
                                childAt.setElevation(c4695.f17880);
                            }
                        }
                    } else {
                        i = childCount;
                        map = map3;
                        String str5 = "WARNING NO CONSTRAINTS for view " + id;
                    }
                    i2 = 1;
                }
                i5 += i2;
                c4696 = this;
                constraintLayout2 = constraintLayout;
                childCount = i;
                map3 = map;
                i4 = 1;
            }
            i = childCount;
            map = map3;
            i2 = 1;
            i5 += i2;
            c4696 = this;
            constraintLayout2 = constraintLayout;
            childCount = i;
            map3 = map;
            i4 = 1;
        }
        int i6 = childCount;
        HashMap map6 = map3;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap map7 = map6;
            C4700 c47002 = (C4700) map7.get(num);
            if (c47002 != null) {
                C4709 c47092 = c47002.f17906;
                if (c47092.f18050 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c47092.f18051;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str6 = c47092.f18047;
                        if (str6 != null) {
                            int[] iArrM106112 = m10611(barrier2, str6);
                            c47092.f18051 = iArrM106112;
                            barrier2.setReferencedIds(iArrM106112);
                        }
                    }
                    barrier2.setType(c47092.f18022);
                    barrier2.setMargin(c47092.f18013);
                    C4708 c4708M168 = ConstraintLayout.m168();
                    barrier2.m10601();
                    c47002.m10619(c4708M168);
                    viewGroup = constraintLayout;
                    viewGroup.addView(barrier2, c4708M168);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c47092.f18048) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C4708 c4708M1682 = ConstraintLayout.m168();
                    c47002.m10619(c4708M1682);
                    viewGroup.addView(guideline, c4708M1682);
                }
            }
            map6 = map7;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof AbstractC4692) {
                ((AbstractC4692) childAt2).mo175(constraintLayout);
            }
        }
    }
}
