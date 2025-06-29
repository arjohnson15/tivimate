package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class u extends t {
    private static final ConcurrentHashMap i = new ConcurrentHashMap();
    private final TextStyle e;
    private final boolean f;
    private final HashMap g;
    private final HashMap h;

    u(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.l.k(), "ZoneText(" + textStyle + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
        this.f = z;
    }

    @Override // j$.time.format.t
    protected final n a(w wVar) {
        n nVarF;
        TextStyle textStyle = TextStyle.NARROW;
        TextStyle textStyle2 = this.e;
        if (textStyle2 == textStyle) {
            return super.a(wVar);
        }
        Locale localeI = wVar.i();
        boolean zK = wVar.k();
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        HashMap map = zK ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(localeI);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (nVarF = (n) ((SoftReference) entry.getValue()).get()) == null) {
            nVarF = n.f(wVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(localeI).getZoneStrings();
            int length = zoneStrings.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (setA.contains(str)) {
                    nVarF.a(str, str);
                    String strA = H.a(str, localeI);
                    for (int i3 = textStyle2 != TextStyle.FULL ? 2 : 1; i3 < strArr.length; i3 += 2) {
                        nVarF.a(strArr[i3], strA);
                    }
                }
                i2++;
            }
            map.put(localeI, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVarF)));
        }
        return nVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // j$.time.format.t, j$.time.format.InterfaceC5410f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(j$.time.format.z r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.n(j$.time.format.z, java.lang.StringBuilder):boolean");
    }
}
