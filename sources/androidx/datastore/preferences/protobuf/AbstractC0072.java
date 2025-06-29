package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p334.C3789;

/* renamed from: androidx.datastore.preferences.protobuf.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0072 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C0049 f496 = new C0049();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0010 f495 = new C0010();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m502(byte b) {
        return b >= 0;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String m503(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m504(androidx.datastore.preferences.protobuf.AbstractC0083 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0072.m504(androidx.datastore.preferences.protobuf.ﾞˊ, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final void m505(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m505(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m505(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0056 c0056 = C0056.f467;
            sb.append(m506(new C0056(((String) obj).getBytes(AbstractC0077.f505))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0056) {
            sb.append(": \"");
            sb.append(m506((C0056) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0083) {
            sb.append(" {");
            m504((AbstractC0083) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m505(sb, i4, "key", entry.getKey());
        m505(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static String m506(C0056 c0056) {
        StringBuilder sb = new StringBuilder(c0056.size());
        for (int i = 0; i < c0056.size(); i++) {
            byte b = c0056.f469[i];
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m507(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b < -62 || m510(b2)) {
            throw InvalidProtocolBufferException.m221();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m508(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!m510(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m510(b3) && !m510(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.m221();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m509(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (m510(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m510(b3)))) {
            throw InvalidProtocolBufferException.m221();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m510(byte b) {
        return b > -65;
    }

    /* renamed from: ˉי */
    public abstract int mo237(byte[] bArr, int i, int i2);

    /* renamed from: ˋⁱ */
    public abstract void mo417(byte[] bArr, int i, int i2);

    /* renamed from: ٴˎ */
    public abstract String mo238(byte[] bArr, int i, int i2);

    /* renamed from: ᐧʻ */
    public abstract int mo239(String str, byte[] bArr, int i, int i2);
}
