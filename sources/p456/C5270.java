package p456;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p080.AbstractC1702;
import p417.AbstractC4753;
import ˆʽ.ᵎˏ;

/* renamed from: ﾞⁱ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AtomicReference f20402 = new AtomicReference();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AtomicReference f20403 = new AtomicReference();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final AtomicReference f20404 = new AtomicReference();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5325 f20405;

    public C5270(C5325 c5325) {
        this.f20405 = c5325;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m11768(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC4753.m10683(atomicReference);
        AbstractC4753.m10685(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m11769(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20405.m11999() ? str : m11768(str, AbstractC5310.f20604, AbstractC5310.f20597, f20402);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String m11770(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM5407 = AbstractC1702.m5407("[");
        for (Object obj : objArr) {
            String strM11771 = obj instanceof Bundle ? m11771((Bundle) obj) : String.valueOf(obj);
            if (strM11771 != null) {
                if (sbM5407.length() != 1) {
                    sbM5407.append(", ");
                }
                sbM5407.append(strM11771);
            }
        }
        sbM5407.append("]");
        return sbM5407.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m11771(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f20405.m11999()) {
            return bundle.toString();
        }
        StringBuilder sbM5407 = AbstractC1702.m5407("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM5407.length() != 8) {
                sbM5407.append(", ");
            }
            sbM5407.append(m11772(str));
            sbM5407.append("=");
            Object obj = bundle.get(str);
            sbM5407.append(obj instanceof Bundle ? m11770(new Object[]{obj}) : obj instanceof Object[] ? m11770((Object[]) obj) : obj instanceof ArrayList ? m11770(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbM5407.append("}]");
        return sbM5407.toString();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String m11772(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20405.m11999() ? str : m11768(str, AbstractC5310.f20596, AbstractC5310.f20602, f20403);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String m11773(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20405.m11999() ? str : str.startsWith("_exp_") ? ᵎˏ.ˑי("experiment_id(", str, ")") : m11768(str, AbstractC5310.f20598, AbstractC5310.f20606, f20404);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m11774(C5343 c5343) {
        C5325 c5325 = this.f20405;
        if (!c5325.m11999()) {
            return c5343.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c5343.f20719);
        sb.append(",name=");
        sb.append(m11769(c5343.f20721));
        sb.append(",params=");
        C5279 c5279 = c5343.f20718;
        sb.append(c5279 == null ? null : !c5325.m11999() ? c5279.f20460.toString() : m11771(c5279.m11851()));
        return sb.toString();
    }
}
