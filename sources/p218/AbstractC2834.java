package p218;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p013.C1040;
import p013.C1053;
import p338.InterfaceC3856;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˏי.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2834 extends AbstractC2835 {
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static InterfaceC2836 m7106(Iterator it) {
        return new C2833(new C1040(2, it));
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static List m7107(InterfaceC2836 interfaceC2836) {
        Iterator it = interfaceC2836.iterator();
        if (!it.hasNext()) {
            return C1053.f4449;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static String m7108(InterfaceC2836 interfaceC2836, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC2836) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            ᵢʿ.ـﹶ(sb, obj, (InterfaceC3856) null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
