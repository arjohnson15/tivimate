package p060;

import java.util.Iterator;
import java.util.Set;

/* renamed from: ʾי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1353 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˑʽ f5509;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f5510;

    public C1353(Set set, ˑʽ r2) {
        this.f5510 = m4705(set);
        this.f5509 = r2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m4705(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1354 c1354 = (C1354) it.next();
            sb.append(c1354.f5512);
            sb.append('/');
            sb.append(c1354.f5511);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
