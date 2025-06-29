package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p278.AbstractC3362;

/* renamed from: com.google.android.gms.internal.play_billing.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0609 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f2978;

    static {
        char[] cArr = new char[80];
        f2978 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m2607(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f2978, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2608(com.google.android.gms.internal.play_billing.AbstractC0662 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC0609.m2608(com.google.android.gms.internal.play_billing.ᵢʿ, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m2609(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m2609(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m2609(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m2607(i, sb);
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
            sb.append(AbstractC3362.m8211(new C0615(((String) obj).getBytes(AbstractC0595.f2962))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0615) {
            sb.append(": \"");
            sb.append(AbstractC3362.m8211((C0615) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0662) {
            sb.append(" {");
            m2608((AbstractC0662) obj, sb, i + 2);
            sb.append("\n");
            m2607(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m2609(sb, i3, "key", entry.getKey());
        m2609(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m2607(i, sb);
        sb.append("}");
    }
}
