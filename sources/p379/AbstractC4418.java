package p379;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p366.C4155;

/* renamed from: ᵢᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4418 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Map f17044;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4410[] f17045;

    static {
        C4410 c4410 = new C4410(C4410.f16995, "");
        C4155 c4155 = C4410.f16992;
        C4410 c44102 = new C4410(c4155, "GET");
        C4410 c44103 = new C4410(c4155, "POST");
        C4155 c41552 = C4410.f16993;
        C4410 c44104 = new C4410(c41552, "/");
        C4410 c44105 = new C4410(c41552, "/index.html");
        C4155 c41553 = C4410.f16991;
        C4410 c44106 = new C4410(c41553, "http");
        C4410 c44107 = new C4410(c41553, "https");
        C4155 c41554 = C4410.f16990;
        C4410[] c4410Arr = {c4410, c44102, c44103, c44104, c44105, c44106, c44107, new C4410(c41554, "200"), new C4410(c41554, "204"), new C4410(c41554, "206"), new C4410(c41554, "304"), new C4410(c41554, "400"), new C4410(c41554, "404"), new C4410(c41554, "500"), new C4410("accept-charset", ""), new C4410("accept-encoding", "gzip, deflate"), new C4410("accept-language", ""), new C4410("accept-ranges", ""), new C4410("accept", ""), new C4410("access-control-allow-origin", ""), new C4410("age", ""), new C4410("allow", ""), new C4410("authorization", ""), new C4410("cache-control", ""), new C4410("content-disposition", ""), new C4410("content-encoding", ""), new C4410("content-language", ""), new C4410("content-length", ""), new C4410("content-location", ""), new C4410("content-range", ""), new C4410("content-type", ""), new C4410("cookie", ""), new C4410("date", ""), new C4410("etag", ""), new C4410("expect", ""), new C4410("expires", ""), new C4410("from", ""), new C4410("host", ""), new C4410("if-match", ""), new C4410("if-modified-since", ""), new C4410("if-none-match", ""), new C4410("if-range", ""), new C4410("if-unmodified-since", ""), new C4410("last-modified", ""), new C4410("link", ""), new C4410("location", ""), new C4410("max-forwards", ""), new C4410("proxy-authenticate", ""), new C4410("proxy-authorization", ""), new C4410("range", ""), new C4410("referer", ""), new C4410("refresh", ""), new C4410("retry-after", ""), new C4410("server", ""), new C4410("set-cookie", ""), new C4410("strict-transport-security", ""), new C4410("transfer-encoding", ""), new C4410("user-agent", ""), new C4410("vary", ""), new C4410("via", ""), new C4410("www-authenticate", "")};
        f17045 = c4410Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c4410Arr[i].f16998)) {
                linkedHashMap.put(c4410Arr[i].f16998, Integer.valueOf(i));
            }
        }
        f17044 = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10028(C4155 c4155) throws IOException {
        int iMo9566 = c4155.mo9566();
        for (int i = 0; i < iMo9566; i++) {
            byte bMo9565 = c4155.mo9565(i);
            if (65 <= bMo9565 && bMo9565 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c4155.m9564()));
            }
        }
    }
}
