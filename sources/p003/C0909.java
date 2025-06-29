package p003;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ʻʾ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0909 implements InterfaceC0899 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Map f4064 = DesugarCollections.unmodifiableMap(C0894.f4031);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile Map f4065;

    public final boolean equals(Object obj) {
        if (obj instanceof C0909) {
            return this.f4064.equals(((C0909) obj).f4064);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4064.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f4064 + '}';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Map m3728() {
        if (this.f4065 == null) {
            synchronized (this) {
                try {
                    if (this.f4065 == null) {
                        this.f4065 = DesugarCollections.unmodifiableMap(m3729());
                    }
                } finally {
                }
            }
        }
        return this.f4065;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap m3729() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f4064.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C0896) list.get(i)).f4033;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }
}
