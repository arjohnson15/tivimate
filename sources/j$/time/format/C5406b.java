package j$.time.format;

import java.util.Iterator;
import java.util.Locale;

/* renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5406b extends C {
    final /* synthetic */ B e;

    C5406b(B b) {
        this.e = b;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.k kVar, j$.time.temporal.q qVar, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }

    @Override // j$.time.format.C
    public final String f(j$.time.temporal.q qVar, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.k kVar, j$.time.temporal.q qVar, TextStyle textStyle, Locale locale) {
        return this.e.b(textStyle);
    }

    @Override // j$.time.format.C
    public final Iterator h(j$.time.temporal.q qVar, TextStyle textStyle, Locale locale) {
        return this.e.b(textStyle);
    }
}
