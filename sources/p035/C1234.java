package p035;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p200.C2741;
import p261.C3232;
import p261.C3235;
import p329.C3734;
import p445.C5155;

/* renamed from: ʼⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1234 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3232 f5045 = new C3232(Object.class, Object.class, Object.class, Collections.singletonList(new C3235(Object.class, Object.class, Object.class, Collections.emptyList(), new C5155(0), null)), null);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2741 f5047 = new C2741(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AtomicReference f5046 = new AtomicReference();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4430(Class cls, Class cls2, Class cls3, C3232 c3232) {
        synchronized (this.f5047) {
            C2741 c2741 = this.f5047;
            C3734 c3734 = new C3734(cls, cls2, cls3);
            if (c3232 == null) {
                c3232 = f5045;
            }
            c2741.put(c3734, c3232);
        }
    }
}
