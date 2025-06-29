package p456;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.AbstractC0312;
import com.google.android.gms.internal.measurement.AbstractC0370;
import com.google.android.gms.internal.measurement.AbstractC0546;
import com.google.android.gms.internal.measurement.C0296;
import com.google.android.gms.internal.measurement.C0298;
import com.google.android.gms.internal.measurement.C0302;
import com.google.android.gms.internal.measurement.C0303;
import com.google.android.gms.internal.measurement.C0304;
import com.google.android.gms.internal.measurement.C0314;
import com.google.android.gms.internal.measurement.C0338;
import com.google.android.gms.internal.measurement.C0350;
import com.google.android.gms.internal.measurement.C0351;
import com.google.android.gms.internal.measurement.C0352;
import com.google.android.gms.internal.measurement.C0357;
import com.google.android.gms.internal.measurement.C0369;
import com.google.android.gms.internal.measurement.C0388;
import com.google.android.gms.internal.measurement.C0394;
import com.google.android.gms.internal.measurement.C0407;
import com.google.android.gms.internal.measurement.C0416;
import com.google.android.gms.internal.measurement.C0423;
import com.google.android.gms.internal.measurement.C0425;
import com.google.android.gms.internal.measurement.C0438;
import com.google.android.gms.internal.measurement.C0460;
import com.google.android.gms.internal.measurement.C0462;
import com.google.android.gms.internal.measurement.C0472;
import com.google.android.gms.internal.measurement.C0473;
import com.google.android.gms.internal.measurement.C0492;
import com.google.android.gms.internal.measurement.C0570;
import com.google.android.gms.internal.measurement.InterfaceC0309;
import com.google.android.gms.internal.measurement.InterfaceC0465;
import com.google.android.gms.internal.measurement.zzlk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p192.RunnableC2657;
import p334.C3789;
import p417.AbstractC4753;
import p424.C4894;
import ʿﾞ.ﹳﹳ;
import ᵢ.ʿʼ;

/* renamed from: ﾞⁱ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5292 extends AbstractC5295 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f20543;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5292(C5273 c5273, int i) {
        super(c5273);
        this.f20543 = i;
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public static byte[] m11870(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static Bundle m11871(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(m11871((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public static HashMap m11872(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m11872((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m11872((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m11872((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public static ArrayList m11873(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public static void m11874(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m11884(builder, str3, string, set);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m11875(StringBuilder sb, int i, String str, C0388 c0388) {
        String str2;
        if (c0388 == null) {
            return;
        }
        m11880(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0388.m2120()) {
            int iM2116 = c0388.m2116();
            if (iM2116 == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM2116 == 2) {
                str2 = "LESS_THAN";
            } else if (iM2116 == 3) {
                str2 = "GREATER_THAN";
            } else if (iM2116 == 4) {
                str2 = "EQUAL";
            } else {
                if (iM2116 != 5) {
                    throw null;
                }
                str2 = "BETWEEN";
            }
            m11888(sb, i, "comparison_type", str2);
        }
        if (c0388.m2114()) {
            m11888(sb, i, "match_as_float", Boolean.valueOf(c0388.m2113()));
        }
        if (c0388.m2119()) {
            m11888(sb, i, "comparison_value", c0388.m2115());
        }
        if (c0388.m2112()) {
            m11888(sb, i, "min_comparison_value", c0388.m2111());
        }
        if (c0388.m2118()) {
            m11888(sb, i, "max_comparison_value", c0388.m2117());
        }
        m11880(i, sb);
        sb.append("}\n");
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public static AbstractC0312 m11876(AbstractC0312 abstractC0312, byte[] bArr) throws zzlk {
        C0350 c0350M2077;
        C0350 c0350 = C0350.f2479;
        if (c0350 == null) {
            synchronized (C0350.class) {
                try {
                    c0350M2077 = C0350.f2479;
                    if (c0350M2077 == null) {
                        c0350M2077 = AbstractC0370.m2077();
                        C0350.f2479 = c0350M2077;
                    }
                } finally {
                }
            }
            c0350 = c0350M2077;
        }
        if (c0350 != null) {
            abstractC0312.getClass();
            abstractC0312.m1822(bArr, bArr.length, c0350);
            return abstractC0312;
        }
        abstractC0312.getClass();
        abstractC0312.m1822(bArr, bArr.length, C0350.f2478);
        return abstractC0312;
    }

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public static boolean m11877(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public static C5343 m11878(C0423 c0423) {
        Object obj;
        Bundle bundleM11871 = m11871(c0423.f2719, true);
        String string = (!bundleM11871.containsKey("_o") || (obj = bundleM11871.get("_o")) == null) ? "app" : obj.toString();
        String strM11923 = AbstractC5310.m11923(c0423.f2720, AbstractC5310.f20597, AbstractC5310.f20604);
        if (strM11923 == null) {
            strM11923 = c0423.f2720;
        }
        return new C5343(strM11923, new C5279(bundleM11871), string, c0423.f2718);
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public static boolean m11879(InterfaceC0309 interfaceC0309, int i) {
        if (i < (interfaceC0309.size() << 6)) {
            return ((1 << (i % 64)) & ((Long) interfaceC0309.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public static void m11880(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public static Bundle[] m11881(InterfaceC0465 interfaceC0465) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0465.iterator();
        while (it.hasNext()) {
            C0369 c0369 = (C0369) it.next();
            if (c0369 != null) {
                Bundle bundle = new Bundle();
                for (C0369 c03692 : c0369.m2070()) {
                    if (c03692.m2061()) {
                        bundle.putString(c03692.m2063(), c03692.m2069());
                    } else if (c03692.m2067()) {
                        bundle.putLong(c03692.m2063(), c03692.m2062());
                    } else if (c03692.m2065()) {
                        bundle.putDouble(c03692.m2063(), c03692.m2068());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public static C0369 m11882(C0304 c0304, String str) {
        for (C0369 c0369 : c0304.m1802()) {
            if (c0369.m2063().equals(str)) {
                return c0369;
            }
        }
        return null;
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public static Bundle m11883(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0369 c0369 = (C0369) it.next();
            String strM2063 = c0369.m2063();
            if (c0369.m2065()) {
                bundle.putDouble(strM2063, c0369.m2068());
            } else if (c0369.m2066()) {
                bundle.putFloat(strM2063, c0369.m2071());
            } else if (c0369.m2061()) {
                bundle.putString(strM2063, c0369.m2069());
            } else if (c0369.m2067()) {
                bundle.putLong(strM2063, c0369.m2062());
            }
        }
        return bundle;
    }

    /* renamed from: יי, reason: contains not printable characters */
    public static void m11884(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public static String m11885(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static int m11886(C0416 c0416, String str) {
        for (int i = 0; i < ((C0302) c0416.f2428).m1722(); i++) {
            if (str.equals(((C0302) c0416.f2428).m1725(i).m2318())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public static Serializable m11887(C0304 c0304, String str) {
        C0369 c0369M11882 = m11882(c0304, str);
        if (c0369M11882 == null) {
            return null;
        }
        if (c0369M11882.m2061()) {
            return c0369M11882.m2069();
        }
        if (c0369M11882.m2067()) {
            return Long.valueOf(c0369M11882.m2062());
        }
        if (c0369M11882.m2065()) {
            return Double.valueOf(c0369M11882.m2068());
        }
        if (c0369M11882.m2064() > 0) {
            return m11881((InterfaceC0465) c0369M11882.m2070());
        }
        return null;
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public static void m11888(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m11880(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static void m11889(C0351 c0351, String str, Long l) {
        List listM1950 = c0351.m1950();
        int i = 0;
        while (true) {
            if (i >= listM1950.size()) {
                i = -1;
                break;
            } else if (str.equals(((C0369) listM1950.get(i)).m2063())) {
                break;
            } else {
                i++;
            }
        }
        C0473 c0473M2055 = C0369.m2055();
        c0473M2055.m2262(str);
        if (l instanceof Long) {
            c0473M2055.m2261(l.longValue());
        }
        if (i < 0) {
            c0351.m1946(c0473M2055);
        } else {
            c0351.m1820();
            C0304.m1794((C0304) c0351.f2428, i, (C0369) c0473M2055.m1821());
        }
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public static void m11890(StringBuilder sb, String str, C0462 c0462) {
        if (c0462 == null) {
            return;
        }
        m11880(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0462.m2256() != 0) {
            m11880(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : c0462.m2252()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (c0462.m2257() != 0) {
            m11880(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : c0462.m2258()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c0462.m2254() != 0) {
            m11880(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C0357 c0357 : c0462.m2253()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(c0357.m1993() ? Integer.valueOf(c0357.m1991()) : null);
                sb.append(":");
                sb.append(c0357.m1990() ? Long.valueOf(c0357.m1992()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c0462.m2259() != 0) {
            m11880(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C0303 c0303 : c0462.m2255()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(c0303.m1790() ? Integer.valueOf(c0303.m1787()) : null);
                sb.append(": [");
                Iterator it = c0303.m1791().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m11880(3, sb);
        sb.append("}\n");
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public C5307 m11891(String str, C0416 c0416, C0351 c0351, String str2) {
        int iIndexOf;
        C0407.m2142();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (!c5236.f20123.m11727(str, AbstractC5248.f20283)) {
            return null;
        }
        c5236.f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5250 c5250 = AbstractC5248.f20253;
        C5245 c5245 = c5236.f20123;
        String[] strArrSplit = c5245.m11723(str, c5250).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        C5353 c5353 = this.f20703.f20437;
        String strM12124 = c5353.m12022().m12124(str);
        Uri.Builder builder = new Uri.Builder();
        C5236 c52362 = (C5236) ((ﹳﹳ) c5353).ᐧⁱ;
        builder.scheme(c52362.f20123.m11723(str, AbstractC5248.f20215));
        boolean zIsEmpty = TextUtils.isEmpty(strM12124);
        C5245 c52452 = c52362.f20123;
        if (zIsEmpty) {
            builder.authority(c52452.m11723(str, AbstractC5248.f20284));
        } else {
            builder.authority(strM12124 + "." + c52452.m11723(str, AbstractC5248.f20284));
        }
        builder.path(c52452.m11723(str, AbstractC5248.f20225));
        m11884(builder, "gmp_app_id", ((C0302) c0416.f2428).m1741(), setUnmodifiableSet);
        m11884(builder, "gmp_version", "102001", setUnmodifiableSet);
        String strM1751 = ((C0302) c0416.f2428).m1751();
        C5250 c52502 = AbstractC5248.f20264;
        if (c5245.m11727(str, c52502) && m12022().m12126(str)) {
            strM1751 = "";
        }
        m11884(builder, "app_instance_id", strM1751, setUnmodifiableSet);
        m11884(builder, "rdid", ((C0302) c0416.f2428).m1763(), setUnmodifiableSet);
        m11884(builder, "bundle_id", c0416.m2153(), setUnmodifiableSet);
        String strM1949 = c0351.m1949();
        String strM11923 = AbstractC5310.m11923(strM1949, AbstractC5310.f20604, AbstractC5310.f20597);
        if (!TextUtils.isEmpty(strM11923)) {
            strM1949 = strM11923;
        }
        m11884(builder, "app_event_name", strM1949, setUnmodifiableSet);
        m11884(builder, "app_version", String.valueOf(((C0302) c0416.f2428).m1709()), setUnmodifiableSet);
        String strM1767 = ((C0302) c0416.f2428).m1767();
        if (c5245.m11727(str, c52502) && m12022().m12120(str) && !TextUtils.isEmpty(strM1767) && (iIndexOf = strM1767.indexOf(".")) != -1) {
            strM1767 = strM1767.substring(0, iIndexOf);
        }
        m11884(builder, "os_version", strM1767, setUnmodifiableSet);
        m11884(builder, "timestamp", String.valueOf(c0351.m1951()), setUnmodifiableSet);
        if (((C0302) c0416.f2428).m1717()) {
            m11884(builder, "lat", "1", setUnmodifiableSet);
        }
        m11884(builder, "privacy_sandbox_version", String.valueOf(((C0302) c0416.f2428).m1758()), setUnmodifiableSet);
        m11884(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        m11884(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        m11884(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C0369> listM1950 = c0351.m1950();
        Bundle bundle = new Bundle();
        for (C0369 c0369 : listM1950) {
            String strM2063 = c0369.m2063();
            if (c0369.m2065()) {
                bundle.putString(strM2063, String.valueOf(c0369.m2068()));
            } else if (c0369.m2066()) {
                bundle.putString(strM2063, String.valueOf(c0369.m2071()));
            } else if (c0369.m2061()) {
                bundle.putString(strM2063, c0369.m2069());
            } else if (c0369.m2067()) {
                bundle.putString(strM2063, String.valueOf(c0369.m2062()));
            }
        }
        m11874(builder, c5245.m11723(str, AbstractC5248.f20193).split("\\|"), bundle, setUnmodifiableSet);
        List<C0492> listUnmodifiableList = DesugarCollections.unmodifiableList(((C0302) c0416.f2428).m1728());
        Bundle bundle2 = new Bundle();
        for (C0492 c0492 : listUnmodifiableList) {
            String strM2318 = c0492.m2318();
            if (c0492.m2315()) {
                bundle2.putString(strM2318, String.valueOf(c0492.m2322()));
            } else if (c0492.m2323()) {
                bundle2.putString(strM2318, String.valueOf(c0492.m2317()));
            } else if (c0492.m2319()) {
                bundle2.putString(strM2318, c0492.m2320());
            } else if (c0492.m2325()) {
                bundle2.putString(strM2318, String.valueOf(c0492.m2324()));
            }
        }
        m11874(builder, c5245.m11723(str, AbstractC5248.f20210).split("\\|"), bundle2, setUnmodifiableSet);
        m11884(builder, "dma", ((C0302) c0416.f2428).m1756() ? "1" : "0", setUnmodifiableSet);
        if (!((C0302) c0416.f2428).m1747().isEmpty()) {
            m11884(builder, "dma_cps", ((C0302) c0416.f2428).m1747(), setUnmodifiableSet);
        }
        if (c5245.m11727(null, AbstractC5248.f20245) && ((C0302) c0416.f2428).m1771()) {
            C0338 c0338M1711 = ((C0302) c0416.f2428).m1711();
            if (!c0338M1711.m1901().isEmpty()) {
                m11884(builder, "dl_gclid", c0338M1711.m1901(), setUnmodifiableSet);
            }
            if (!c0338M1711.m1900().isEmpty()) {
                m11884(builder, "dl_gbraid", c0338M1711.m1900(), setUnmodifiableSet);
            }
            if (!c0338M1711.m1906().isEmpty()) {
                m11884(builder, "dl_gs", c0338M1711.m1906(), setUnmodifiableSet);
            }
            if (c0338M1711.m1902() > 0) {
                m11884(builder, "dl_ss_ts", String.valueOf(c0338M1711.m1902()), setUnmodifiableSet);
            }
            if (!c0338M1711.m1899().isEmpty()) {
                m11884(builder, "mr_gclid", c0338M1711.m1899(), setUnmodifiableSet);
            }
            if (!c0338M1711.m1895().isEmpty()) {
                m11884(builder, "mr_gbraid", c0338M1711.m1895(), setUnmodifiableSet);
            }
            if (!c0338M1711.m1909().isEmpty()) {
                m11884(builder, "mr_gs", c0338M1711.m1909(), setUnmodifiableSet);
            }
            if (c0338M1711.m1896() > 0) {
                m11884(builder, "mr_click_ts", String.valueOf(c0338M1711.m1896()), setUnmodifiableSet);
            }
        }
        return new C5307(1, jCurrentTimeMillis, builder.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[RETURN] */
    /* renamed from: ʻـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m11892(java.lang.String r14) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5292.m11892(java.lang.String):boolean");
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public void m11893(C0394 c0394, Object obj) {
        AbstractC4753.m10683(obj);
        c0394.m1820();
        C0492.m2308((C0492) c0394.f2428);
        c0394.m1820();
        C0492.m2314((C0492) c0394.f2428);
        c0394.m1820();
        C0492.m2306((C0492) c0394.f2428);
        if (obj instanceof String) {
            c0394.m1820();
            C0492.m2310((C0492) c0394.f2428, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c0394.m1820();
            C0492.m2311((C0492) c0394.f2428, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                ˏᵢ().f20571.m4531(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            c0394.m1820();
            C0492.m2309((C0492) c0394.f2428, dDoubleValue);
        }
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public List m11894(InterfaceC0309 interfaceC0309, List list) {
        int i;
        ArrayList arrayList = new ArrayList(interfaceC0309);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                ˏᵢ().f20568.m4531(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    ˏᵢ().f20568.m4529(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public void m11895(C0416 c0416) {
        ˏᵢ().f20566.m4533("Checking account type status for ad personalization signals");
        if (m11892(c0416.m2153())) {
            ˏᵢ().f20567.m4533("Turning off ad personalization due to account type");
            C0394 c0394M2307 = C0492.m2307();
            c0394M2307.m1820();
            C0492.m2312((C0492) c0394M2307.f2428, "_npa");
            C5323 c5323M11658 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).m11658();
            c5323M11658.ʼᵎ();
            long j = c5323M11658.f20647;
            c0394M2307.m1820();
            C0492.m2313((C0492) c0394M2307.f2428, j);
            c0394M2307.m1820();
            C0492.m2311((C0492) c0394M2307.f2428, 1L);
            C0492 c0492 = (C0492) c0394M2307.m1821();
            int i = 0;
            while (true) {
                if (i >= ((C0302) c0416.f2428).m1722()) {
                    c0416.m1820();
                    C0302.m1652((C0302) c0416.f2428, c0492);
                    break;
                } else {
                    if ("_npa".equals(((C0302) c0416.f2428).m1725(i).m2318())) {
                        c0416.m1820();
                        C0302.m1662((C0302) c0416.f2428, i, c0492);
                        break;
                    }
                    i++;
                }
            }
            ʿʼ r0 = ʿʼ.ˏᴵ(((C0302) c0416.f2428).m1776());
            r0.ˋˊ(EnumC5341.f20710, EnumC5286.CHILD_ACCOUNT);
            String string = r0.toString();
            c0416.m1820();
            C0302.m1704((C0302) c0416.f2428, string);
        }
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public boolean m11896() {
        m11909();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public void m11897(C0473 c0473, Object obj) {
        c0473.m1820();
        C0369.m2052((C0369) c0473.f2428);
        c0473.m1820();
        C0369.m2054((C0369) c0473.f2428);
        c0473.m1820();
        C0369.m2060((C0369) c0473.f2428);
        c0473.m1820();
        C0369.m2056((C0369) c0473.f2428);
        if (obj instanceof String) {
            c0473.m2263((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0473.m2261(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c0473.m1820();
            C0369.m2053((C0369) c0473.f2428, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            ˏᵢ().f20571.m4531(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0473 c0473M2055 = C0369.m2055();
                for (String str : bundle.keySet()) {
                    C0473 c0473M20552 = C0369.m2055();
                    c0473M20552.m2262(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c0473M20552.m2261(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c0473M20552.m2263((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c0473M20552.m1820();
                        C0369.m2053((C0369) c0473M20552.f2428, dDoubleValue2);
                    }
                    c0473M2055.m1820();
                    C0369.m2058((C0369) c0473M2055.f2428, (C0369) c0473M20552.m1821());
                }
                if (((C0369) c0473M2055.f2428).m2064() > 0) {
                    arrayList.add((C0369) c0473M2055.m1821());
                }
            }
        }
        c0473.m1820();
        C0369.m2051((C0369) c0473.f2428, arrayList);
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public Parcelable m11898(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader$ParseException unused) {
            ˏᵢ().f20571.m4533("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public byte[] m11899(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            ˏᵢ().f20571.m4531(e, "Failed to ungzip content");
            throw e;
        }
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public C0304 m11900(C4894 c4894) {
        C0351 c0351M1795 = C0304.m1795();
        c0351M1795.m1820();
        C0304.m1798(c4894.f18478, (C0304) c0351M1795.f2428);
        C5279 c5279 = (C5279) c4894.f18481;
        c5279.getClass();
        Bundle bundle = c5279.f20460;
        for (String str : bundle.keySet()) {
            C0473 c0473M2055 = C0369.m2055();
            c0473M2055.m2262(str);
            Object obj = bundle.get(str);
            AbstractC4753.m10683(obj);
            m11897(c0473M2055, obj);
            c0351M1795.m1946(c0473M2055);
        }
        if (((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20187)) {
            String str2 = (String) c4894.f18480;
            if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
                C0473 c0473M20552 = C0369.m2055();
                c0473M20552.m2262("_o");
                c0473M20552.m2263(str2);
                c0351M1795.m1947((C0369) c0473M20552.m1821());
            }
        }
        return (C0304) c0351M1795.m1821();
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public boolean m11901(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public byte[] m11902(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ˏᵢ().f20571.m4531(e, "Failed to gzip content");
            throw e;
        }
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public void m11903(StringBuilder sb, int i, InterfaceC0465 interfaceC0465) {
        if (interfaceC0465 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = interfaceC0465.iterator();
        while (it.hasNext()) {
            C0369 c0369 = (C0369) it.next();
            if (c0369 != null) {
                m11880(i2, sb);
                sb.append("param {\n");
                m11888(sb, i2, "name", c0369.m2072() ? ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11772(c0369.m2063()) : null);
                m11888(sb, i2, "string_value", c0369.m2061() ? c0369.m2069() : null);
                m11888(sb, i2, "int_value", c0369.m2067() ? Long.valueOf(c0369.m2062()) : null);
                m11888(sb, i2, "double_value", c0369.m2065() ? Double.valueOf(c0369.m2068()) : null);
                if (c0369.m2064() > 0) {
                    m11903(sb, i2, (InterfaceC0465) c0369.m2070());
                }
                m11880(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public ArrayList m11904() throws NumberFormatException {
        Context context = this.f20703.f20418.f20114;
        List list = AbstractC5248.f20251;
        C0460 c0460M2240 = C0460.m2240(context.getContentResolver(), AbstractC0546.m2451("com.google.android.gms.measurement"), new RunnableC2657(2));
        Map mapEmptyMap = c0460M2240 == null ? Collections.emptyMap() : c0460M2240.m2241();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) AbstractC5248.f20185.m11751(null)).intValue();
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt((String) entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            ˏᵢ().f20568.m4531(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    ˏᵢ().f20568.m4531(e, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // p456.AbstractC5295
    /* renamed from: ᴵˋ */
    public final boolean mo11760() {
        switch (this.f20543) {
        }
        return false;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public long m11905(byte[] bArr) {
        AbstractC4753.m10683(bArr);
        ﹶﾞ().ʼᵎ();
        MessageDigest messageDigestM11928 = C5316.m11928();
        if (messageDigestM11928 != null) {
            return C5316.m11946(messageDigestM11928.digest(bArr));
        }
        ˏᵢ().f20571.m4533("Failed to get MD5");
        return 0L;
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public String m11906(C0438 c0438) {
        C0425 c0425M1718;
        if (c0438 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        C0472.m2260();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (c5236.f20123.m11727(null, AbstractC5248.f20231) && c0438.m2220() > 0) {
            ﹶﾞ();
            if (C5316.m11945(c0438.m2219().m1740())) {
                if (c0438.m2217()) {
                    m11888(sb, 0, "upload_subdomain", c0438.m2216());
                }
                if (c0438.m2215()) {
                    m11888(sb, 0, "sgtm_join_id", c0438.m2221());
                }
            }
        }
        for (C0302 c0302 : c0438.m2218()) {
            if (c0302 != null) {
                m11880(1, sb);
                sb.append("bundle {\n");
                if (c0302.m1780()) {
                    m11888(sb, 1, "protocol_version", Integer.valueOf(c0302.m1769()));
                }
                C0570.f2930.get();
                String strM1740 = c0302.m1740();
                C5250 c5250 = AbstractC5248.f20281;
                C5245 c5245 = c5236.f20123;
                if (c5245.m11727(strM1740, c5250) && c0302.m1778()) {
                    m11888(sb, 1, "session_stitching_token", c0302.m1708());
                }
                m11888(sb, 1, "platform", c0302.m1735());
                if (c0302.m1737()) {
                    m11888(sb, 1, "gmp_version", Long.valueOf(c0302.m1774()));
                }
                if (c0302.m1755()) {
                    m11888(sb, 1, "uploading_gmp_version", Long.valueOf(c0302.m1746()));
                }
                if (c0302.m1724()) {
                    m11888(sb, 1, "dynamite_version", Long.valueOf(c0302.m1775()));
                }
                if (c0302.m1738()) {
                    m11888(sb, 1, "config_version", Long.valueOf(c0302.m1773()));
                }
                m11888(sb, 1, "gmp_app_id", c0302.m1741());
                m11888(sb, 1, "admob_app_id", c0302.m1720());
                m11888(sb, 1, "app_id", c0302.m1740());
                m11888(sb, 1, "app_version", c0302.m1764());
                if (c0302.m1733()) {
                    m11888(sb, 1, "app_version_major", Integer.valueOf(c0302.m1709()));
                }
                m11888(sb, 1, "firebase_instance_id", c0302.m1714());
                if (c0302.m1729()) {
                    m11888(sb, 1, "dev_cert_hash", Long.valueOf(c0302.m1745()));
                }
                m11888(sb, 1, "app_store", c0302.m1723());
                if (c0302.m1754()) {
                    m11888(sb, 1, "upload_timestamp_millis", Long.valueOf(c0302.m1749()));
                }
                if (c0302.m1760()) {
                    m11888(sb, 1, "start_timestamp_millis", Long.valueOf(c0302.m1779()));
                }
                if (c0302.m1768()) {
                    m11888(sb, 1, "end_timestamp_millis", Long.valueOf(c0302.m1777()));
                }
                if (c0302.m1752()) {
                    m11888(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0302.m1730()));
                }
                if (c0302.m1727()) {
                    m11888(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0302.m1716()));
                }
                m11888(sb, 1, "app_instance_id", c0302.m1751());
                m11888(sb, 1, "resettable_device_id", c0302.m1763());
                m11888(sb, 1, "ds_id", c0302.m1782());
                if (c0302.m1712()) {
                    m11888(sb, 1, "limited_ad_tracking", Boolean.valueOf(c0302.m1717()));
                }
                m11888(sb, 1, "os_version", c0302.m1767());
                m11888(sb, 1, "device_model", c0302.m1753());
                m11888(sb, 1, "user_default_language", c0302.m1761());
                if (c0302.m1765()) {
                    m11888(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c0302.m1748()));
                }
                if (c0302.m1736()) {
                    m11888(sb, 1, "bundle_sequential_index", Integer.valueOf(c0302.m1762()));
                }
                C0472.m2260();
                ﹶﾞ();
                if (C5316.m11945(c0302.m1740()) && c5245.m11727(null, AbstractC5248.f20231) && c0302.m1750()) {
                    m11888(sb, 1, "delivery_index", Integer.valueOf(c0302.m1719()));
                }
                if (c0302.m1757()) {
                    m11888(sb, 1, "service_upload", Boolean.valueOf(c0302.m1726()));
                }
                m11888(sb, 1, "health_monitor", c0302.m1739());
                if (c0302.m1710()) {
                    m11888(sb, 1, "retry_counter", Integer.valueOf(c0302.m1742()));
                }
                if (c0302.m1783()) {
                    m11888(sb, 1, "consent_signals", c0302.m1731());
                }
                if (c0302.m1706()) {
                    m11888(sb, 1, "is_dma_region", Boolean.valueOf(c0302.m1756()));
                }
                if (c0302.m1707()) {
                    m11888(sb, 1, "core_platform_services", c0302.m1747());
                }
                if (c0302.m1772()) {
                    m11888(sb, 1, "consent_diagnostics", c0302.m1776());
                }
                if (c0302.m1770()) {
                    m11888(sb, 1, "target_os_version", Long.valueOf(c0302.m1713()));
                }
                C0407.m2142();
                if (c5245.m11727(c0302.m1740(), AbstractC5248.f20283)) {
                    m11888(sb, 1, "ad_services_version", Integer.valueOf(c0302.m1758()));
                    if (c0302.m1743() && (c0425M1718 = c0302.m1718()) != null) {
                        m11880(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        m11888(sb, 2, "eligible", Boolean.valueOf(c0425M1718.m2201()));
                        m11888(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c0425M1718.m2202()));
                        m11888(sb, 2, "pre_r", Boolean.valueOf(c0425M1718.m2204()));
                        m11888(sb, 2, "r_extensions_too_old", Boolean.valueOf(c0425M1718.m2200()));
                        m11888(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c0425M1718.m2203()));
                        m11888(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c0425M1718.m2205()));
                        m11888(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c0425M1718.m2199()));
                        m11880(2, sb);
                        sb.append("}\n");
                    }
                }
                C0298.m1629();
                if (c5245.m11727(null, AbstractC5248.f20202) && c0302.m1771()) {
                    C0338 c0338M1711 = c0302.m1711();
                    m11880(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (c0338M1711.m1897()) {
                        m11888(sb, 2, "deep_link_gclid", c0338M1711.m1901());
                    }
                    if (c0338M1711.m1907()) {
                        m11888(sb, 2, "deep_link_gbraid", c0338M1711.m1900());
                    }
                    if (c0338M1711.m1898()) {
                        m11888(sb, 2, "deep_link_gad_source", c0338M1711.m1906());
                    }
                    if (c0338M1711.m1905()) {
                        m11888(sb, 2, "deep_link_session_millis", Long.valueOf(c0338M1711.m1902()));
                    }
                    if (c0338M1711.m1908()) {
                        m11888(sb, 2, "market_referrer_gclid", c0338M1711.m1899());
                    }
                    if (c0338M1711.m1903()) {
                        m11888(sb, 2, "market_referrer_gbraid", c0338M1711.m1895());
                    }
                    if (c0338M1711.m1904()) {
                        m11888(sb, 2, "market_referrer_gad_source", c0338M1711.m1909());
                    }
                    if (c0338M1711.m1894()) {
                        m11888(sb, 2, "market_referrer_click_millis", Long.valueOf(c0338M1711.m1896()));
                    }
                    m11880(2, sb);
                    sb.append("}\n");
                }
                InterfaceC0465<C0492> interfaceC0465M1728 = c0302.m1728();
                C5270 c5270 = c5236.f20108;
                if (interfaceC0465M1728 != null) {
                    for (C0492 c0492 : interfaceC0465M1728) {
                        if (c0492 != null) {
                            m11880(2, sb);
                            sb.append("user_property {\n");
                            m11888(sb, 2, "set_timestamp_millis", c0492.m2316() ? Long.valueOf(c0492.m2321()) : null);
                            m11888(sb, 2, "name", c5270.m11773(c0492.m2318()));
                            m11888(sb, 2, "string_value", c0492.m2320());
                            m11888(sb, 2, "int_value", c0492.m2325() ? Long.valueOf(c0492.m2324()) : null);
                            m11888(sb, 2, "double_value", c0492.m2315() ? Double.valueOf(c0492.m2322()) : null);
                            m11880(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0465<C0352> interfaceC0465M1759 = c0302.m1759();
                if (interfaceC0465M1759 != null) {
                    for (C0352 c0352 : interfaceC0465M1759) {
                        if (c0352 != null) {
                            m11880(2, sb);
                            sb.append("audience_membership {\n");
                            if (c0352.m1961()) {
                                m11888(sb, 2, "audience_id", Integer.valueOf(c0352.m1960()));
                            }
                            if (c0352.m1957()) {
                                m11888(sb, 2, "new_audience", Boolean.valueOf(c0352.m1958()));
                            }
                            m11890(sb, "current_data", c0352.m1963());
                            if (c0352.m1959()) {
                                m11890(sb, "previous_data", c0352.m1962());
                            }
                            m11880(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0465<C0304> interfaceC0465M1781 = c0302.m1781();
                if (interfaceC0465M1781 != null) {
                    for (C0304 c0304 : interfaceC0465M1781) {
                        if (c0304 != null) {
                            m11880(2, sb);
                            sb.append("event {\n");
                            m11888(sb, 2, "name", c5270.m11769(c0304.m1806()));
                            if (c0304.m1803()) {
                                m11888(sb, 2, "timestamp_millis", Long.valueOf(c0304.m1801()));
                            }
                            if (c0304.m1811()) {
                                m11888(sb, 2, "previous_timestamp_millis", Long.valueOf(c0304.m1807()));
                            }
                            if (c0304.m1809()) {
                                m11888(sb, 2, "count", Integer.valueOf(c0304.m1808()));
                            }
                            if (c0304.m1810() != 0) {
                                m11903(sb, 2, c0304.m1802());
                            }
                            m11880(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m11880(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public void m11907(StringBuilder sb, int i, C0296 c0296) {
        String str;
        if (c0296 == null) {
            return;
        }
        m11880(i, sb);
        sb.append("filter {\n");
        if (c0296.m1627()) {
            m11888(sb, i, "complement", Boolean.valueOf(c0296.m1620()));
        }
        if (c0296.m1621()) {
            m11888(sb, i, "param_name", ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11772(c0296.m1619()));
        }
        if (c0296.m1625()) {
            int i2 = i + 1;
            C0314 c0314M1624 = c0296.m1624();
            if (c0314M1624 != null) {
                m11880(i2, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c0314M1624.m1827()) {
                    switch (c0314M1624.m1826()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "IN_LIST";
                            break;
                        default:
                            throw null;
                    }
                    m11888(sb, i2, "match_type", str);
                }
                if (c0314M1624.m1830()) {
                    m11888(sb, i2, "expression", c0314M1624.m1829());
                }
                if (c0314M1624.m1831()) {
                    m11888(sb, i2, "case_sensitive", Boolean.valueOf(c0314M1624.m1825()));
                }
                if (c0314M1624.m1828() > 0) {
                    m11880(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c0314M1624.m1824()) {
                        m11880(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m11880(i2, sb);
                sb.append("}\n");
            }
        }
        if (c0296.m1626()) {
            m11875(sb, i + 1, "number_filter", c0296.m1623());
        }
        m11880(i, sb);
        sb.append("}\n");
    }
}
