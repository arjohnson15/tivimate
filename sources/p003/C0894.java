package p003;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ʻʾ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0894 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Map f4031;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new C0896(property)));
        }
        f4031 = DesugarCollections.unmodifiableMap(map);
    }
}
