package android.support.v4.media.session;

import androidx.datastore.preferences.protobuf.C0040;
import androidx.lifecycle.AbstractC0207;
import androidx.lifecycle.InterfaceC0208;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C0371;
import com.google.android.gms.internal.measurement.InterfaceC0465;
import com.google.android.gms.internal.play_billing.C0642;
import com.google.android.gms.internal.play_billing.C0678;
import com.google.android.gms.internal.play_billing.InterfaceC0680;
import com.google.crypto.tink.shaded.protobuf.C0735;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p068.AbstractC1540;
import p070.InterfaceC1564;
import p145.C2237;
import p176.InterfaceC2487;
import p458.AbstractC5393;

/* renamed from: android.support.v4.media.session.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0002 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final boolean m34(int i) {
        return !AbstractC1540.f6258.get();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m35(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m36(int i, int i2, int i3, int i4) {
        return C0735.m3035(i) + i2 + i3 + i4;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static String m37(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m1312());
        return sb.toString();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static String m38(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static /* synthetic */ String m39(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "WRITE_AHEAD_LOGGING" : "TRUNCATE" : "AUTOMATIC";
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static StringBuilder m40(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m41(InterfaceC0680 interfaceC0680) {
        if (interfaceC0680 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static String m42(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static LinkedHashSet m43(LinkedHashMap linkedHashMap, String str, C2237 c2237) {
        linkedHashMap.put(str, c2237);
        return new LinkedHashSet();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m44(int i, int i2, int i3, int i4) {
        return C0040.m387(i) + i2 + i3 + i4;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean m45(int i) {
        Boolean bool;
        if (AbstractC1540.f6258.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC1540.f6259.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static /* synthetic */ void m46(InterfaceC0465 interfaceC0465) {
        if (interfaceC0465 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AbstractC0207 m47(InterfaceC0208 interfaceC0208, InterfaceC2487 interfaceC2487, AbstractC5393 abstractC5393) {
        return interfaceC0208.mo1003(((InterfaceC1564) interfaceC2487).mo5134(), abstractC5393);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m48(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m49(int i, int i2, int i3) {
        return C0678.m2747(i) + i2 + i3;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static StringBuilder m50(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m51(C0642 c0642) {
        if (c0642 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static /* synthetic */ void m52(C0371 c0371) {
        if (c0371 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m53(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m54(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m55(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }
}
