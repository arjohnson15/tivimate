package p291;

import java.io.Writer;

/* renamed from: ٴᐧ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3447 extends Writer {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final StringBuilder f13362 = new StringBuilder(128);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f13363 = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m8297();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m8297();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m8297();
            } else {
                this.f13362.append(c);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8297() {
        StringBuilder sb = this.f13362;
        if (sb.length() > 0) {
            String str = this.f13363;
            sb.toString();
            sb.delete(0, sb.length());
        }
    }
}
