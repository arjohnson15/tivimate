package p178;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ˋᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2492 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f9916 = new ArrayList();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m6607(String str) {
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        ArrayList arrayList = this.f9916;
        if (arrayList.size() > 0) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                sb.append("\t[");
                sb.append(1);
                sb.append(':');
                throw null;
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }
}
