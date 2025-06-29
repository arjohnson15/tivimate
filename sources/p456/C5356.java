package p456;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: ﾞⁱ.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5356 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5356 f20781 = new C5356(100, null, null);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f20782;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumMap f20783;

    public C5356(int i, Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        this.f20783 = enumMap;
        EnumC5341 enumC5341 = EnumC5341.f20709;
        EnumC5288 enumC5288 = EnumC5288.f20522;
        EnumC5288 enumC52882 = EnumC5288.f20520;
        EnumC5288 enumC52883 = EnumC5288.f20519;
        enumMap.put((EnumMap) enumC5341, (EnumC5341) (bool == null ? enumC52883 : bool.booleanValue() ? enumC52882 : enumC5288));
        EnumC5341 enumC53412 = EnumC5341.f20711;
        if (bool2 == null) {
            enumC5288 = enumC52883;
        } else if (bool2.booleanValue()) {
            enumC5288 = enumC52882;
        }
        enumMap.put((EnumMap) enumC53412, (EnumC5341) enumC5288);
        this.f20782 = i;
    }

    public C5356(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(EnumC5341.class);
        this.f20783 = enumMap2;
        enumMap2.putAll(enumMap);
        this.f20782 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m12135(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C5356 m12136(int i, Bundle bundle) {
        if (bundle == null) {
            return new C5356(i, null, null);
        }
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        for (EnumC5341 enumC5341 : EnumC5230.STORAGE.f20035) {
            enumMap.put((EnumMap) enumC5341, (EnumC5341) m12141(bundle.getString(enumC5341.f20714)));
        }
        return new C5356(enumMap, i);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m12137(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static EnumC5288 m12138(char c) {
        return c != '+' ? c != '0' ? c != '1' ? EnumC5288.f20519 : EnumC5288.f20520 : EnumC5288.f20522 : EnumC5288.f20521;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static char m12139(EnumC5288 enumC5288) {
        if (enumC5288 == null) {
            return '-';
        }
        int iOrdinal = enumC5288.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C5356 m12140(int i, String str) {
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        if (str == null) {
            str = "";
        }
        EnumC5230 enumC5230 = EnumC5230.STORAGE;
        int i2 = 0;
        while (true) {
            EnumC5341[] enumC5341Arr = enumC5230.f20035;
            if (i2 >= enumC5341Arr.length) {
                return new C5356(enumMap, i);
            }
            EnumC5341 enumC5341 = enumC5341Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) enumC5341, (EnumC5341) m12138(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) enumC5341, (EnumC5341) EnumC5288.f20519);
            }
            i2++;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static EnumC5288 m12141(String str) {
        EnumC5288 enumC5288 = EnumC5288.f20519;
        return str == null ? enumC5288 : str.equals("granted") ? EnumC5288.f20520 : str.equals("denied") ? EnumC5288.f20522 : enumC5288;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5356)) {
            return false;
        }
        C5356 c5356 = (C5356) obj;
        for (EnumC5341 enumC5341 : EnumC5230.STORAGE.f20035) {
            if (this.f20783.get(enumC5341) != c5356.f20783.get(enumC5341)) {
                return false;
            }
        }
        return this.f20782 == c5356.f20782;
    }

    public final int hashCode() {
        int iHashCode = this.f20782 * 17;
        Iterator it = this.f20783.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC5288) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m12135(this.f20782));
        for (EnumC5341 enumC5341 : EnumC5230.STORAGE.f20035) {
            sb.append(",");
            sb.append(enumC5341.f20714);
            sb.append("=");
            EnumC5288 enumC5288 = (EnumC5288) this.f20783.get(enumC5341);
            if (enumC5288 == null) {
                enumC5288 = EnumC5288.f20519;
            }
            sb.append(enumC5288);
        }
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C5356 m12142(C5356 c5356) {
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        for (EnumC5341 enumC5341 : EnumC5230.STORAGE.f20035) {
            EnumC5288 enumC5288 = (EnumC5288) this.f20783.get(enumC5341);
            if (enumC5288 == EnumC5288.f20519) {
                enumC5288 = (EnumC5288) c5356.f20783.get(enumC5341);
            }
            if (enumC5288 != null) {
                enumMap.put((EnumMap) enumC5341, (EnumC5341) enumC5288);
            }
        }
        return new C5356(enumMap, this.f20782);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final Boolean m12143() {
        EnumC5288 enumC5288 = (EnumC5288) this.f20783.get(EnumC5341.f20709);
        if (enumC5288 == null) {
            return null;
        }
        int iOrdinal = enumC5288.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Boolean m12144() {
        EnumC5288 enumC5288 = (EnumC5288) this.f20783.get(EnumC5341.f20711);
        if (enumC5288 == null) {
            return null;
        }
        int iOrdinal = enumC5288.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m12145(C5356 c5356, EnumC5341... enumC5341Arr) {
        for (EnumC5341 enumC5341 : enumC5341Arr) {
            EnumC5288 enumC5288 = (EnumC5288) this.f20783.get(enumC5341);
            EnumC5288 enumC52882 = (EnumC5288) c5356.f20783.get(enumC5341);
            EnumC5288 enumC52883 = EnumC5288.f20522;
            if (enumC5288 == enumC52883 && enumC52882 != enumC52883) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final String m12146() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC5341 enumC5341 : EnumC5230.STORAGE.f20035) {
            sb.append(m12139((EnumC5288) this.f20783.get(enumC5341)));
        }
        return sb.toString();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m12147() {
        return m12151(EnumC5341.f20711);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5356 m12148(p456.C5356 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ﾞⁱ.ⁱⁱ> r1 = p456.EnumC5341.class
            r0.<init>(r1)
            ﾞⁱ.ʻʻ r1 = p456.EnumC5230.STORAGE
            ﾞⁱ.ⁱⁱ[] r1 = r1.f20035
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f20783
            java.lang.Object r5 = r5.get(r4)
            ﾞⁱ.ˑʾ r5 = (p456.EnumC5288) r5
            java.util.EnumMap r6 = r9.f20783
            java.lang.Object r6 = r6.get(r4)
            ﾞⁱ.ˑʾ r6 = (p456.EnumC5288) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            ﾞⁱ.ˑʾ r7 = p456.EnumC5288.f20519
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            ﾞⁱ.ˑʾ r7 = p456.EnumC5288.f20521
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            ﾞⁱ.ˑʾ r7 = p456.EnumC5288.f20522
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            ﾞⁱ.ˑʾ r5 = p456.EnumC5288.f20520
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            ﾞⁱ.ﾞﾞ r9 = new ﾞⁱ.ﾞﾞ
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5356.m12148(ﾞⁱ.ﾞﾞ):ﾞⁱ.ﾞﾞ");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12149() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            ﾞⁱ.ʻʻ r1 = p456.EnumC5230.STORAGE
            ﾞⁱ.ⁱⁱ[] r1 = r1.f20035
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f20783
            java.lang.Object r4 = r5.get(r4)
            ﾞⁱ.ˑʾ r4 = (p456.EnumC5288) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5356.m12149():java.lang.String");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m12150() {
        Iterator it = this.f20783.values().iterator();
        while (it.hasNext()) {
            if (((EnumC5288) it.next()) != EnumC5288.f20519) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m12151(EnumC5341 enumC5341) {
        return ((EnumC5288) this.f20783.get(enumC5341)) != EnumC5288.f20522;
    }
}
