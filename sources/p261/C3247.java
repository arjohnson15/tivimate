package p261;

import java.io.IOException;

/* renamed from: ـ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3247 implements Appendable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f12679 = true;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Appendable f12680;

    public C3247(Appendable appendable) {
        this.f12680 = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f12679;
        Appendable appendable = this.f12680;
        if (z) {
            this.f12679 = false;
            appendable.append("  ");
        }
        this.f12679 = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f12679;
        Appendable appendable = this.f12680;
        boolean z2 = false;
        if (z) {
            this.f12679 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f12679 = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
