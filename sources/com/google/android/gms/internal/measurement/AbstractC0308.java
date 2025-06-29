package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0308 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f2424;

    static {
        char[] cArr = new char[80];
        f2424 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1814(com.google.android.gms.internal.measurement.AbstractC0583 r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0308.m1814(com.google.android.gms.internal.measurement.ﾞﹶ, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m1815(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m1815(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m1815(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m1816(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0315 c0315 = C0315.f2430;
            sb.append(AbstractC0543.m2449(new C0315(((String) obj).getBytes(AbstractC0412.f2705))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0315) {
            sb.append(": \"");
            sb.append(AbstractC0543.m2449((C0315) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0583) {
            sb.append(" {");
            m1814((AbstractC0583) obj, sb, i + 2);
            sb.append("\n");
            m1816(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m1815(sb, i3, "key", entry.getKey());
        m1815(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m1816(i, sb);
        sb.append("}");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m1816(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f2424, 0, i2);
            i -= i2;
        }
    }
}
