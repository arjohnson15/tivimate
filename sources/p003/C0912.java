package p003;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p314.C3598;

/* renamed from: ʻʾ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0912 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Set f4069 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0913 f4070;

    public C0912(InterfaceC0913 interfaceC0913) {
        this.f4070 = interfaceC0913;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        return this.f4070.mo3705(new C0893(((Uri) obj).toString()), i, i2, c3598);
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        return f4069.contains(((Uri) obj).getScheme());
    }
}
