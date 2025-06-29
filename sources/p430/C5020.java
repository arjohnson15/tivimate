package p430;

import android.support.v4.media.session.AbstractC0002;
import com.google.android.gms.internal.play_billing.ˎˑ;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p013.AbstractC1041;
import p158.AbstractC2339;
import p222.C2860;
import p425.C4907;

/* renamed from: ﹶˏ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5020 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C5020 f19042;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C5020 f19043;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C5020 f19044;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f19045;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String[] f19046;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f19047;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String[] f19048;

    static {
        C5005 c5005 = C5005.f18968;
        C5005 c50052 = C5005.f18977;
        C5005 c50053 = C5005.f18979;
        C5005 c50054 = C5005.f18966;
        C5005 c50055 = C5005.f18976;
        C5005 c50056 = C5005.f18967;
        C5005 c50057 = C5005.f18970;
        C5005 c50058 = C5005.f18978;
        C5005 c50059 = C5005.f18973;
        C5005[] c5005Arr = {c5005, c50052, c50053, c50054, c50055, c50056, c50057, c50058, c50059, C5005.f18965, C5005.f18969, C5005.f18971, C5005.f18981, C5005.f18974, C5005.f18975, C5005.f18964};
        C2860 c2860 = new C2860();
        c2860.m7180((C5005[]) Arrays.copyOf(new C5005[]{c5005, c50052, c50053, c50054, c50055, c50056, c50057, c50058, c50059}, 9));
        EnumC4995 enumC4995 = EnumC4995.f18892;
        EnumC4995 enumC49952 = EnumC4995.f18894;
        c2860.m7179(enumC4995, enumC49952);
        if (!c2860.f11120) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c2860.f11118 = true;
        c2860.m7181();
        C2860 c28602 = new C2860();
        c28602.m7180((C5005[]) Arrays.copyOf(c5005Arr, 16));
        c28602.m7179(enumC4995, enumC49952);
        if (!c28602.f11120) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c28602.f11118 = true;
        f19042 = c28602.m7181();
        C2860 c28603 = new C2860();
        c28603.m7180((C5005[]) Arrays.copyOf(c5005Arr, 16));
        c28603.m7179(enumC4995, enumC49952, EnumC4995.f18895, EnumC4995.f18893);
        if (!c28603.f11120) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c28603.f11118 = true;
        f19043 = c28603.m7181();
        f19044 = new C5020(false, false, null, null);
    }

    public C5020(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f19047 = z;
        this.f19045 = z2;
        this.f19046 = strArr;
        this.f19048 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5020)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5020 c5020 = (C5020) obj;
        boolean z = c5020.f19047;
        boolean z2 = this.f19047;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f19046, c5020.f19046) && Arrays.equals(this.f19048, c5020.f19048) && this.f19045 == c5020.f19045);
    }

    public final int hashCode() {
        if (!this.f19047) {
            return 17;
        }
        String[] strArr = this.f19046;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f19048;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f19045 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f19047) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m11110(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m11109(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0002.m38(sb, this.f19045, ')');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m11108(SSLSocket sSLSocket) {
        if (!this.f19047) {
            return false;
        }
        String[] strArr = this.f19048;
        if (strArr != null && !AbstractC2339.m6437(strArr, sSLSocket.getEnabledProtocols(), C4907.f18570)) {
            return false;
        }
        String[] strArr2 = this.f19046;
        return strArr2 == null || AbstractC2339.m6437(strArr2, sSLSocket.getEnabledCipherSuites(), C5005.f18972);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List m11109() {
        String[] strArr = this.f19048;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ˎˑ.ˋⁱ(str));
        }
        return AbstractC1041.m4016(arrayList);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List m11110() {
        String[] strArr = this.f19046;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C5005.f18963.m11082(str));
        }
        return AbstractC1041.m4016(arrayList);
    }
}
