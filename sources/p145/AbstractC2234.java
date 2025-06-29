package p145;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.support.v4.media.session.AbstractC0001;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p013.AbstractC1052;
import p013.C1034;
import p013.C1038;
import p013.C1056;
import p034.InterfaceC1226;
import p057.C1342;
import p057.C1344;
import p057.C1345;
import p057.C1347;
import p065.AbstractC1484;
import p065.AbstractC1498;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p148.C2267;
import p185.AbstractC2562;
import p262.InterfaceC3254;
import p262.InterfaceC3255;
import p278.AbstractC3362;
import p317.AbstractC3616;
import p317.AbstractC3617;
import p317.AbstractC3629;
import p330.InterfaceC3747;
import p338.InterfaceC3856;
import p395.AbstractC4535;
import ʽᵔ.ʽⁱ;
import ﹶⁱ.ـﹶ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˉᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2234 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String[] f8898 = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int m6218(InterfaceC3254 interfaceC3254, String str) {
        int i;
        int iMo6101 = interfaceC3254.mo6101();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= iMo6101) {
                i2 = -1;
                break;
            }
            if (str.equals(interfaceC3254.mo6099(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = "`" + str + '`';
        int iMo61012 = interfaceC3254.mo6101();
        int i3 = 0;
        while (true) {
            if (i3 >= iMo61012) {
                i3 = -1;
                break;
            }
            if (str2.equals(interfaceC3254.mo6099(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int iMo61013 = interfaceC3254.mo6101();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i4 = 0; i4 < iMo61013; i4++) {
                String strMo6099 = interfaceC3254.mo6099(i4);
                if (strMo6099.length() >= str.length() + 2 && (AbstractC3629.m8561(strMo6099, strConcat, false) || (strMo6099.charAt(0) == '`' && AbstractC3629.m8561(strMo6099, str3, false)))) {
                    i = i4;
                    break;
                }
            }
        }
        return i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String m6219(Collection collection) {
        return !collection.isEmpty() ? AbstractC3617.m8554(AbstractC1041.m4033(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final long m6220(InterfaceC3255 interfaceC3255) {
        if (m6224(interfaceC3255) == 0) {
            return -1L;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT last_insert_rowid()");
        try {
            interfaceC3254Mo6108.mo6098();
            return interfaceC3254Mo6108.mo6095(0);
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final Set m6221(String str) {
        if (str.length() == 0) {
            return C1038.f4437;
        }
        String strSubstring = str.substring(AbstractC3616.m8527(str, '(', 0, false, 6) + 1, AbstractC3616.m8534(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        C1056 c1056 = new C1056();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i2);
            int i4 = i3 + 1;
            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                if (c1056.isEmpty()) {
                    c1056.addFirst(Character.valueOf(cCharAt));
                } else {
                    Character ch = (Character) (c1056.isEmpty() ? null : c1056.f4454[c1056.f4456]);
                    if (ch != null && ch.charValue() == cCharAt) {
                        AbstractC1052.m4040(c1056);
                    }
                }
            } else if (cCharAt == '[') {
                if (c1056.isEmpty()) {
                    c1056.addFirst(Character.valueOf(cCharAt));
                }
            } else if (cCharAt == ']') {
                if (!c1056.isEmpty()) {
                    Character ch2 = (Character) (c1056.isEmpty() ? null : c1056.f4454[c1056.f4456]);
                    if (ch2 != null && ch2.charValue() == '[') {
                        AbstractC1052.m4040(c1056);
                    }
                }
            } else if (cCharAt == ',' && c1056.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = AbstractC1549.m5145(strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i5++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(AbstractC3616.m8539(strSubstring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String[] strArr = f8898;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                }
                if (AbstractC3629.m8560(str2, strArr[i6], false)) {
                    arrayList2.add(next);
                    break;
                }
                i6++;
            }
        }
        return AbstractC1041.m4029(arrayList2);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Object m6222(AbstractC1484 abstractC1484, boolean z, boolean z2, InterfaceC3856 interfaceC3856) {
        abstractC1484.m5049();
        abstractC1484.m5041();
        return AbstractC1642.m5302(new C2239(abstractC1484, null, interfaceC3856, z, z2));
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final List m6223(InterfaceC3254 interfaceC3254) {
        int iM6218 = m6218(interfaceC3254, "id");
        int iM62182 = m6218(interfaceC3254, "seq");
        int iM62183 = m6218(interfaceC3254, "from");
        int iM62184 = m6218(interfaceC3254, "to");
        C1344 c1344 = new C1344(10);
        while (interfaceC3254.mo6098()) {
            c1344.add(new C2238((int) interfaceC3254.mo6095(iM6218), (int) interfaceC3254.mo6095(iM62182), interfaceC3254.mo6094(iM62183), interfaceC3254.mo6094(iM62184)));
        }
        return AbstractC1041.m4017(AbstractC3362.m8205(c1344));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int m6224(InterfaceC3255 interfaceC3255) {
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT changes()");
        try {
            interfaceC3254Mo6108.mo6098();
            return (int) interfaceC3254Mo6108.mo6095(0);
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final Cursor m6225(WorkDatabase_Impl workDatabase_Impl, InterfaceC1226 interfaceC1226) {
        Cursor cursorM5052 = workDatabase_Impl.m5052(interfaceC1226, null);
        if (!(cursorM5052 instanceof AbstractWindowedCursor)) {
            return cursorM5052;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM5052;
        int count = abstractWindowedCursor.getCount();
        int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
        if (Build.VERSION.SDK_INT >= 23 && numRows >= count) {
            return cursorM5052;
        }
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursorM5052.getColumnNames(), cursorM5052.getCount());
            while (cursorM5052.moveToNext()) {
                Object[] objArr = new Object[cursorM5052.getColumnCount()];
                int columnCount = cursorM5052.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursorM5052.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursorM5052.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursorM5052.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursorM5052.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = cursorM5052.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC0001.m5(cursorM5052, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0001.m5(cursorM5052, th);
                throw th2;
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final int m6226(InterfaceC3254 interfaceC3254, String str) {
        int iM6218 = m6218(interfaceC3254, str);
        if (iM6218 >= 0) {
            return iM6218;
        }
        int iMo6101 = interfaceC3254.mo6101();
        ArrayList arrayList = new ArrayList(iMo6101);
        for (int i = 0; i < iMo6101; i++) {
            arrayList.add(interfaceC3254.mo6099(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + AbstractC1041.m4033(arrayList, null, null, null, null, 63) + ']');
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean m6227(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return AbstractC1549.m5138(AbstractC3616.m8539(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static C2245 m6228(InterfaceC3255 interfaceC3255, String str) {
        C1342 c1342 = new C1342();
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA table_info(`" + str + "`)");
        try {
            if (interfaceC3254Mo6108.mo6098()) {
                int iM6218 = m6218(interfaceC3254Mo6108, "name");
                do {
                    c1342.add(interfaceC3254Mo6108.mo6094(iM6218));
                } while (interfaceC3254Mo6108.mo6098());
            }
            interfaceC3254Mo6108.close();
            C1342 c1342M10326 = AbstractC4535.m10326(c1342);
            interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String strMo6094 = interfaceC3254Mo6108.mo6098() ? interfaceC3254Mo6108.mo6094(m6218(interfaceC3254Mo6108, "sql")) : "";
                interfaceC3254Mo6108.close();
                return new C2245(str, c1342M10326, m6221(strMo6094));
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m6229(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int m6230(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        int i = -1;
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        int length = columnNames.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = columnNames[i2];
            int i4 = i3 + 1;
            if (str3.length() >= str.length() + 2 && (AbstractC3629.m8561(str3, strConcat, false) || (str3.charAt(0) == '`' && AbstractC3629.m8561(str3, str2, false)))) {
                i = i3;
                break;
            }
            i2++;
            i3 = i4;
        }
        return i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final int m6231(Cursor cursor, String str) {
        String string;
        int iM6230 = m6230(cursor, str);
        if (iM6230 >= 0) {
            return iM6230;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str2 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                ᵢʿ.ـﹶ(sb, str2, (InterfaceC3856) null);
            }
            sb.append((CharSequence) "");
            string = sb.toString();
        } catch (Exception e) {
            string = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m6232(p065.AbstractC1484 r16, boolean r17, boolean r18, p338.InterfaceC3856 r19, p185.AbstractC2562 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p145.AbstractC2234.m6232(ʾᵔ.ˆᵔ, boolean, boolean, ᵎˈ.ˉⁱ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final C2236 m6233(InterfaceC3255 interfaceC3255, String str, boolean z) {
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM6218 = m6218(interfaceC3254Mo6108, "seqno");
            int iM62182 = m6218(interfaceC3254Mo6108, "cid");
            int iM62183 = m6218(interfaceC3254Mo6108, "name");
            int iM62184 = m6218(interfaceC3254Mo6108, "desc");
            if (iM6218 != -1 && iM62182 != -1 && iM62183 != -1 && iM62184 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC3254Mo6108.mo6098()) {
                    if (((int) interfaceC3254Mo6108.mo6095(iM62182)) >= 0) {
                        int iMo6095 = (int) interfaceC3254Mo6108.mo6095(iM6218);
                        String strMo6094 = interfaceC3254Mo6108.mo6094(iM62183);
                        String str2 = interfaceC3254Mo6108.mo6095(iM62184) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(iMo6095), strMo6094);
                        linkedHashMap2.put(Integer.valueOf(iMo6095), str2);
                    }
                }
                List listM4018 = AbstractC1041.m4018(linkedHashMap.entrySet(), new ʽⁱ(7));
                ArrayList arrayList = new ArrayList(AbstractC1039.m4012(listM4018, 10));
                Iterator it = listM4018.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM4016 = AbstractC1041.m4016(arrayList);
                List listM40182 = AbstractC1041.m4018(linkedHashMap2.entrySet(), new ʽⁱ(8));
                ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(listM40182, 10));
                Iterator it2 = listM40182.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C2236 c2236 = new C2236(str, z, listM4016, AbstractC1041.m4016(arrayList2));
                interfaceC3254Mo6108.close();
                return c2236;
            }
            interfaceC3254Mo6108.close();
            return null;
        } catch (Throwable th) {
            interfaceC3254Mo6108.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C2243 m6234(InterfaceC3255 interfaceC3255, String str) {
        Map map;
        C1342 c1342M10326;
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (interfaceC3254Mo6108.mo6098()) {
                int iM6218 = m6218(interfaceC3254Mo6108, "name");
                int iM62182 = m6218(interfaceC3254Mo6108, "type");
                int iM62183 = m6218(interfaceC3254Mo6108, "notnull");
                int iM62184 = m6218(interfaceC3254Mo6108, "pk");
                int iM62185 = m6218(interfaceC3254Mo6108, "dflt_value");
                C1347 c1347 = new C1347();
                while (true) {
                    String strMo6094 = interfaceC3254Mo6108.mo6094(iM6218);
                    c1347.put(strMo6094, new C2237((int) interfaceC3254Mo6108.mo6095(iM62184), 2, strMo6094, interfaceC3254Mo6108.mo6094(iM62182), interfaceC3254Mo6108.mo6096(iM62185) ? null : interfaceC3254Mo6108.mo6094(iM62185), interfaceC3254Mo6108.mo6095(iM62183) != j));
                    if (!interfaceC3254Mo6108.mo6098()) {
                        break;
                    }
                    j = 0;
                }
                c1347.m4695();
                c1347.f5499 = true;
                map = c1347.f5500 > 0 ? c1347 : C1347.f5493;
            } else {
                map = C1034.f4436;
            }
            interfaceC3254Mo6108.close();
            interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iM62186 = m6218(interfaceC3254Mo6108, "id");
                int iM62187 = m6218(interfaceC3254Mo6108, "seq");
                int iM62188 = m6218(interfaceC3254Mo6108, "table");
                int iM62189 = m6218(interfaceC3254Mo6108, "on_delete");
                int iM621810 = m6218(interfaceC3254Mo6108, "on_update");
                List listM6223 = m6223(interfaceC3254Mo6108);
                interfaceC3254Mo6108.mo6102();
                C1342 c1342 = new C1342();
                while (interfaceC3254Mo6108.mo6098()) {
                    if (interfaceC3254Mo6108.mo6095(iM62187) == 0) {
                        int iMo6095 = (int) interfaceC3254Mo6108.mo6095(iM62186);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i = iM62186;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listM6223) {
                            int i2 = iM62187;
                            List list = listM6223;
                            if (((C2238) obj).f8918 == iMo6095) {
                                arrayList3.add(obj);
                            }
                            iM62187 = i2;
                            listM6223 = list;
                        }
                        int i3 = iM62187;
                        List list2 = listM6223;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C2238 c2238 = (C2238) it.next();
                            arrayList.add(c2238.f8916);
                            arrayList2.add(c2238.f8917);
                        }
                        c1342.add(new C2235(interfaceC3254Mo6108.mo6094(iM62188), interfaceC3254Mo6108.mo6094(iM62189), interfaceC3254Mo6108.mo6094(iM621810), arrayList, arrayList2));
                        iM62186 = i;
                        iM62187 = i3;
                        listM6223 = list2;
                    }
                }
                C1342 c1342M103262 = AbstractC4535.m10326(c1342);
                interfaceC3254Mo6108.close();
                interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA index_list(`" + str + "`)");
                try {
                    int iM621811 = m6218(interfaceC3254Mo6108, "name");
                    int iM621812 = m6218(interfaceC3254Mo6108, "origin");
                    int iM621813 = m6218(interfaceC3254Mo6108, "unique");
                    if (iM621811 == -1 || iM621812 == -1 || iM621813 == -1) {
                        interfaceC3254Mo6108.close();
                        c1342M10326 = null;
                        break;
                    }
                    C1342 c13422 = new C1342();
                    while (interfaceC3254Mo6108.mo6098()) {
                        if ("c".equals(interfaceC3254Mo6108.mo6094(iM621812))) {
                            C2236 c2236M6233 = m6233(interfaceC3255, interfaceC3254Mo6108.mo6094(iM621811), interfaceC3254Mo6108.mo6095(iM621813) == 1);
                            if (c2236M6233 == null) {
                                interfaceC3254Mo6108.close();
                                c1342M10326 = null;
                                break;
                            }
                            c13422.add(c2236M6233);
                        }
                    }
                    c1342M10326 = AbstractC4535.m10326(c13422);
                    return new C2243(str, map, c1342M103262, c1342M10326);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final void m6235(HashMap map, InterfaceC3856 interfaceC3856) {
        int i;
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object obj : map.keySet()) {
                map2.put(obj, map.get(obj));
                i++;
                if (i == 999) {
                    break;
                }
            }
            interfaceC3856.mo4036(map2);
            map2.clear();
        }
        if (i > 0) {
            interfaceC3856.mo4036(map2);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final void m6236(InterfaceC3255 interfaceC3255) {
        C1344 c1344 = new C1344(10);
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC3254Mo6108.mo6098()) {
            try {
                c1344.add(interfaceC3254Mo6108.mo6094(0));
            } catch (Throwable th) {
                interfaceC3254Mo6108.close();
                throw th;
            }
        }
        interfaceC3254Mo6108.close();
        ListIterator listIterator = AbstractC3362.m8205(c1344).listIterator(0);
        while (true) {
            C1345 c1345 = (C1345) listIterator;
            if (!c1345.hasNext()) {
                return;
            }
            String str = (String) c1345.next();
            if (AbstractC3629.m8560(str, "room_fts_content_sync_", false)) {
                ـﹶ.ﹳˎ(interfaceC3255, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final InterfaceC3747 m6237(AbstractC1484 abstractC1484, boolean z, AbstractC2562 abstractC2562) {
        if (!abstractC1484.m5051()) {
            return ((C2267) abstractC1484.m5043()).f8999;
        }
        if (abstractC2562.mo3963().mo3966(AbstractC1498.f6090) != null) {
            throw new ClassCastException();
        }
        if (!z) {
            C2267 c2267 = abstractC1484.f6053;
            return (c2267 != null ? c2267 : null).f8999;
        }
        InterfaceC3747 interfaceC3747 = abstractC1484.f6048;
        if (interfaceC3747 == null) {
            return null;
        }
        return interfaceC3747;
    }
}
