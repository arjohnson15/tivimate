package p447;

import p334.C3789;
import p456.C5236;
import p456.C5272;

/* renamed from: ﾞˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5179 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m11548(int i, String str, String str2) {
        return str + i + str2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C5272 m11549(C5236 c5236) {
        C5272 c5272M11652 = c5236.m11652();
        c5272M11652.m11846();
        c5272M11652.m11757();
        return c5272M11652;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m11550(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m11551(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static /* synthetic */ String m11552(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static /* synthetic */ String m11553(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m11554(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }
}
