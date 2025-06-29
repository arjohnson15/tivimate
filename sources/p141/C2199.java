package p141;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3926;
import p345.C3929;
import p345.C3935;
import p345.C3967;
import p395.AbstractC4535;
import ʾי.ˑʽ;
import ˊﹶ.ˋˉ;

/* renamed from: ˉˑ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2199 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3935 f8653;

    static {
        new ˑʽ(26).ˉⁱ();
    }

    public C2199(ˑʽ r6) {
        C3935 c3935;
        Collection collectionEntrySet = ((C3926) ((ˋˉ) r6.ˆʿ).ˆʿ).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            c3935 = C3929.f15265;
        } else {
            C3967 c3967 = (C3967) collectionEntrySet;
            ᐧʻ r0 = new ᐧʻ(c3967.f15338.size());
            Iterator it = c3967.iterator();
            int size = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209((Collection) entry.getValue());
                if (!abstractC3980M9209.isEmpty()) {
                    r0.ﾞˊ(key, abstractC3980M9209);
                    size = abstractC3980M9209.size() + size;
                }
            }
            c3935 = new C3935(r0.ﹳﹳ(), size);
        }
        this.f8653 = c3935;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m6132(String str) {
        return AbstractC4535.m10360(str, "Accept") ? "Accept" : AbstractC4535.m10360(str, "Allow") ? "Allow" : AbstractC4535.m10360(str, "Authorization") ? "Authorization" : AbstractC4535.m10360(str, "Bandwidth") ? "Bandwidth" : AbstractC4535.m10360(str, "Blocksize") ? "Blocksize" : AbstractC4535.m10360(str, "Cache-Control") ? "Cache-Control" : AbstractC4535.m10360(str, "Connection") ? "Connection" : AbstractC4535.m10360(str, "Content-Base") ? "Content-Base" : AbstractC4535.m10360(str, "Content-Encoding") ? "Content-Encoding" : AbstractC4535.m10360(str, "Content-Language") ? "Content-Language" : AbstractC4535.m10360(str, "Content-Length") ? "Content-Length" : AbstractC4535.m10360(str, "Content-Location") ? "Content-Location" : AbstractC4535.m10360(str, "Content-Type") ? "Content-Type" : AbstractC4535.m10360(str, "CSeq") ? "CSeq" : AbstractC4535.m10360(str, "Date") ? "Date" : AbstractC4535.m10360(str, "Expires") ? "Expires" : AbstractC4535.m10360(str, "Location") ? "Location" : AbstractC4535.m10360(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : AbstractC4535.m10360(str, "Proxy-Require") ? "Proxy-Require" : AbstractC4535.m10360(str, "Public") ? "Public" : AbstractC4535.m10360(str, "Range") ? "Range" : AbstractC4535.m10360(str, "RTP-Info") ? "RTP-Info" : AbstractC4535.m10360(str, "RTCP-Interval") ? "RTCP-Interval" : AbstractC4535.m10360(str, "Scale") ? "Scale" : AbstractC4535.m10360(str, "Session") ? "Session" : AbstractC4535.m10360(str, "Speed") ? "Speed" : AbstractC4535.m10360(str, "Supported") ? "Supported" : AbstractC4535.m10360(str, "Timestamp") ? "Timestamp" : AbstractC4535.m10360(str, "Transport") ? "Transport" : AbstractC4535.m10360(str, "User-Agent") ? "User-Agent" : AbstractC4535.m10360(str, "Via") ? "Via" : AbstractC4535.m10360(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2199) {
            return this.f8653.equals(((C2199) obj).f8653);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8653.hashCode();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m6133(String str) {
        AbstractC3980 abstractC3980M9151 = this.f8653.m9151(m6132(str));
        if (abstractC3980M9151.isEmpty()) {
            return null;
        }
        return (String) AbstractC3968.m9180(abstractC3980M9151);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3935 m6134() {
        return this.f8653;
    }
}
