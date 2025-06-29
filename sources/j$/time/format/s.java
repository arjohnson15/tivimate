package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* loaded from: classes2.dex */
final class s extends j {
    private char g;
    private int h;

    s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, G.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    private j g(Locale locale) {
        j$.time.temporal.q qVarH;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            qVarH = weekFieldsOf.h();
        } else {
            if (c == 'Y') {
                j$.time.temporal.q qVarG = weekFieldsOf.g();
                int i = this.h;
                if (i == 2) {
                    return new p(qVarG, this.e);
                }
                return new j(qVarG, i, 19, i < 4 ? G.NORMAL : G.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                qVarH = weekFieldsOf.d();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                qVarH = weekFieldsOf.i();
            }
        }
        return new j(qVarH, this.b, this.c, G.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    final j f(int i) {
        int i2 = this.e + i;
        return new s(this.g, this.h, this.b, this.c, i2);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        return g(zVar.c()).n(zVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        return g(wVar.i()).p(wVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? G.NORMAL : G.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
