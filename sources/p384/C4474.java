package p384;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p383.C4457;
import ʿﾞ.ﹳﹳ;

/* renamed from: ᵢⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4474 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f17228;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long[] f17229;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long[] f17230;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public static Serializable m10222(int i, C4457 c4457) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c4457.m10094()));
        }
        if (i == 1) {
            return Boolean.valueOf(c4457.m10086() == 1);
        }
        if (i == 2) {
            return m10223(c4457);
        }
        if (i != 3) {
            if (i == 8) {
                return m10224(c4457);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c4457.m10094()));
                c4457.m10085(2);
                return date;
            }
            int iM10106 = c4457.m10106();
            ArrayList arrayList = new ArrayList(iM10106);
            for (int i2 = 0; i2 < iM10106; i2++) {
                Serializable serializableM10222 = m10222(c4457.m10086(), c4457);
                if (serializableM10222 != null) {
                    arrayList.add(serializableM10222);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM10223 = m10223(c4457);
            int iM10086 = c4457.m10086();
            if (iM10086 == 9) {
                return map;
            }
            Serializable serializableM102222 = m10222(iM10086, c4457);
            if (serializableM102222 != null) {
                map.put(strM10223, serializableM102222);
            }
        }
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public static String m10223(C4457 c4457) {
        int iM10100 = c4457.m10100();
        int i = c4457.f17169;
        c4457.m10085(iM10100);
        return new String(c4457.f17171, i, iM10100);
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public static HashMap m10224(C4457 c4457) {
        int iM10106 = c4457.m10106();
        HashMap map = new HashMap(iM10106);
        for (int i = 0; i < iM10106; i++) {
            String strM10223 = m10223(c4457);
            Serializable serializableM10222 = m10222(c4457.m10086(), c4457);
            if (serializableM10222 != null) {
                map.put(strM10223, serializableM10222);
            }
        }
        return map;
    }
}
