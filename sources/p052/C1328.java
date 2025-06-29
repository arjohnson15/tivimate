package p052;

import android.util.Base64;
import java.util.List;

/* renamed from: ʾʼ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1328 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f5391;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f5392;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f5393;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f5394;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f5395;

    public C1328(String str, String str2, String str3, List list) {
        str.getClass();
        this.f5394 = str;
        str2.getClass();
        this.f5391 = str2;
        this.f5393 = str3;
        list.getClass();
        this.f5395 = list;
        this.f5392 = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5394 + ", mProviderPackage: " + this.f5391 + ", mQuery: " + this.f5393 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f5395;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
