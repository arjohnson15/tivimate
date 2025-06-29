package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes2.dex */
class t implements InterfaceC5410f {
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;
    private final j$.time.temporal.r a;
    private final String b;

    t(j$.time.temporal.r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }

    private static int b(w wVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || wVar.b(charSequence.charAt(i2), 'Z')) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        w wVarD = wVar.d();
        int iP = kVar.p(wVarD, charSequence, i2);
        try {
            if (iP >= 0) {
                wVar.n(ZoneId.V(upperCase, ZoneOffset.d0((int) wVarD.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iP;
            }
            if (kVar == k.e) {
                return ~i;
            }
            wVar.n(ZoneId.of(upperCase));
            return i2;
        } catch (j$.time.c unused) {
            return ~i;
        }
    }

    protected n a(w wVar) {
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = wVar.k() ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = wVar.k() ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), n.g(setA, wVar));
                        if (wVar.k()) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC5410f
    public boolean n(z zVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) zVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.m());
        return true;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(wVar, charSequence, i, i, k.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (wVar.b(cCharAt, 'U') && wVar.b(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !wVar.b(charSequence.charAt(i3), 'C')) ? b(wVar, charSequence, i, i3, k.f) : b(wVar, charSequence, i, i4, k.f);
            }
            if (wVar.b(cCharAt, 'G') && length >= (i2 = i + 3) && wVar.b(cCharAt2, 'M') && wVar.b(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !wVar.b(charSequence.charAt(i2), '0')) {
                    return b(wVar, charSequence, i, i2, k.f);
                }
                wVar.n(ZoneId.of("GMT0"));
                return i5;
            }
        }
        n nVarA = a(wVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strD = nVarA.d(charSequence, parsePosition);
        if (strD != null) {
            wVar.n(ZoneId.of(strD));
            return parsePosition.getIndex();
        }
        if (!wVar.b(cCharAt, 'Z')) {
            return ~i;
        }
        wVar.n(ZoneOffset.UTC);
        return i + 1;
    }

    public final String toString() {
        return this.b;
    }
}
