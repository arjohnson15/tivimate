package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class r implements InterfaceC5410f {
    private final j$.time.temporal.q a;
    private final TextStyle b;
    private final C c;
    private volatile j d;

    r(j$.time.temporal.q qVar, TextStyle textStyle, C c) {
        this.a = qVar;
        this.b = textStyle;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        String strF;
        Long lE = zVar.e(this.a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) zVar.d().A(j$.time.temporal.l.e());
        if (kVar == null || kVar == j$.time.chrono.r.d) {
            strF = this.c.f(this.a, lE.longValue(), this.b, zVar.c());
        } else {
            strF = this.c.e(kVar, this.a, lE.longValue(), this.b, zVar.c());
        }
        if (strF != null) {
            sb.append(strF);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, G.NORMAL);
        }
        return this.d.n(zVar, sb);
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        TextStyle textStyle = wVar.l() ? this.b : null;
        j$.time.chrono.k kVarH = wVar.h();
        C c = this.c;
        j$.time.temporal.q qVar = this.a;
        Iterator itH = (kVarH == null || kVarH == j$.time.chrono.r.d) ? c.h(qVar, textStyle, wVar.i()) : c.g(kVarH, qVar, textStyle, wVar.i());
        if (itH != null) {
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                String str = (String) entry.getKey();
                if (wVar.s(str, 0, charSequence, i, str.length())) {
                    return wVar.o(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (qVar == j$.time.temporal.a.ERA && !wVar.l()) {
                Iterator it = kVarH.N().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.l) it.next()).toString();
                    if (wVar.s(string, 0, charSequence, i, string.length())) {
                        return wVar.o(this.a, r1.getValue(), i, string.length() + i);
                    }
                }
            }
            if (wVar.l()) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, G.NORMAL);
        }
        return this.d.p(wVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        j$.time.temporal.q qVar = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + textStyle2 + ")";
    }
}
