package p430;

import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import p013.C1032;
import p035.C1232;
import p158.AbstractC2339;
import p288.C3395;
import p317.AbstractC3629;
import p407.InterfaceC4671;

/* renamed from: ﹶˏ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5014 implements Iterable, InterfaceC4671 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String[] f19030;

    public C5014(String[] strArr) {
        this.f19030 = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5014) {
            if (Arrays.equals(this.f19030, ((C5014) obj).f19030)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19030);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C3395[] c3395Arr = new C3395[size];
        for (int i = 0; i < size; i++) {
            c3395Arr[i] = new C3395(m11105(i), m11103(i));
        }
        return new C1032(1, c3395Arr);
    }

    public final int size() {
        return this.f19030.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM11105 = m11105(i);
            String strM11103 = m11103(i);
            sb.append(strM11105);
            sb.append(": ");
            if (AbstractC2339.m6436(strM11105)) {
                strM11103 = "██";
            }
            sb.append(strM11103);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final TreeMap m11102() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = m11105(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m11103(i));
        }
        return treeMap;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String m11103(int i) {
        return this.f19030[(i * 2) + 1];
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String m11104(String str) {
        String[] strArr = this.f19030;
        int length = strArr.length - 2;
        int i = ˎˑ.ˑי(length, 0, -2);
        if (i <= length) {
            while (!AbstractC3629.m8562(str, strArr[length])) {
                if (length != i) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String m11105(int i) {
        return this.f19030[i * 2];
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1232 m11106() {
        C1232 c1232 = new C1232(1);
        c1232.f5042.addAll(Arrays.asList(this.f19030));
        return c1232;
    }
}
