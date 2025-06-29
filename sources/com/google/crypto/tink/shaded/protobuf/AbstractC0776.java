package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0776 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f3638;

    static {
        char[] cArr = new char[80];
        f3638 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m3212(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3212(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3212(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m3214(i, sb);
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
            C0762 c0762 = AbstractC0748.f3592;
            sb.append(ﹶⁱ.ـﹶ.ᵎˏ(new C0762(((String) obj).getBytes(AbstractC0731.f3531))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0748) {
            sb.append(": \"");
            sb.append(ﹶⁱ.ـﹶ.ᵎˏ((AbstractC0748) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0785) {
            sb.append(" {");
            m3213((AbstractC0785) obj, sb, i + 2);
            sb.append("\n");
            m3214(i, sb);
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
        m3212(sb, i3, "key", entry.getKey());
        m3212(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m3214(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3213(com.google.crypto.tink.shaded.protobuf.AbstractC0785 r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC0776.m3213(com.google.crypto.tink.shaded.protobuf.ﾞˊ, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3214(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f3638, 0, i2);
            i -= i2;
        }
    }
}
