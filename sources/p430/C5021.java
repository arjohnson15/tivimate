package p430;

import androidx.leanback.widget.ʿˏ;
import java.util.LinkedHashMap;
import java.util.Map;
import p013.AbstractC1037;
import p288.C3395;

/* renamed from: ﹶˏ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5021 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f19049;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Map f19050;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5014 f19051;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5004 f19052;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5006 f19053;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC4996 f19054;

    public C5021(C5004 c5004, String str, C5014 c5014, AbstractC4996 abstractC4996, Map map) {
        this.f19052 = c5004;
        this.f19049 = str;
        this.f19051 = c5014;
        this.f19054 = abstractC4996;
        this.f19050 = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f19049);
        sb.append(", url=");
        sb.append(this.f19052);
        C5014 c5014 = this.f19051;
        if (c5014.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c5014) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC1037.m4008();
                    throw null;
                }
                C3395 c3395 = (C3395) obj;
                String str = (String) c3395.f13245;
                String str2 = (String) c3395.f13244;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.f19050;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ʿˏ m11111() {
        ʿˏ r0 = new ʿˏ();
        r0.ˆᵔ = new LinkedHashMap();
        r0.ᐧⁱ = this.f19052;
        r0.ˆʿ = this.f19049;
        r0.ᐧˋ = this.f19054;
        Map map = this.f19050;
        r0.ˆᵔ = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        r0.ˎˑ = this.f19051.m11106();
        return r0;
    }
}
