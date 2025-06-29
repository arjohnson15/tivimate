package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
class n {
    protected String a;
    protected String b;
    protected char c;
    protected n d;
    protected n e;

    private n(String str, String str2, n nVar) {
        this.a = str;
        this.b = str2;
        this.d = nVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    /* synthetic */ n(String str, String str2, n nVar, int i) {
        this(str, str2, nVar);
    }

    private boolean b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && c(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i != this.a.length()) {
            n nVarE = e(this.a.substring(i), this.b, this.d);
            this.a = str.substring(0, i);
            this.d = nVarE;
            if (i < str.length()) {
                this.d.e = e(str.substring(i), str2, null);
                this.b = null;
            } else {
                this.b = str2;
            }
            return true;
        }
        if (i >= str.length()) {
            this.b = str2;
            return true;
        }
        String strSubstring = str.substring(i);
        for (n nVar = this.d; nVar != null; nVar = nVar.e) {
            if (c(nVar.c, strSubstring.charAt(0))) {
                return nVar.b(strSubstring, str2);
            }
        }
        n nVarE2 = e(strSubstring, str2, null);
        nVarE2.e = this.d;
        this.d = nVarE2;
        return true;
    }

    public static n f(w wVar) {
        return wVar.k() ? new n("", null, null) : new m("", null, null);
    }

    public static n g(Set set, w wVar) {
        n nVarF = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            nVarF.b(str, str);
        }
        return nVarF;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c, char c2) {
        return c == c2;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        n nVar = this.d;
        if (nVar != null && length2 != length) {
            while (true) {
                if (c(nVar.c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strD = nVar.d(charSequence, parsePosition);
                    if (strD != null) {
                        return strD;
                    }
                } else {
                    nVar = nVar.e;
                    if (nVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    protected n e(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    protected boolean h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!c(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
