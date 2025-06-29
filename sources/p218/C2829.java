package p218;

import java.util.Iterator;
import p013.C1046;

/* renamed from: ˏי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2829 implements InterfaceC2836 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f10979;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2836 f10980;

    public C2829(InterfaceC2836 interfaceC2836, int i) {
        this.f10980 = interfaceC2836;
        this.f10979 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p218.InterfaceC2836
    public final Iterator iterator() {
        return new C1046(this);
    }
}
