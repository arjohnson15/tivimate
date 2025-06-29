package p218;

import java.util.Iterator;
import p070.AbstractC1547;
import p338.InterfaceC3856;

/* renamed from: ˏי.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2837 implements InterfaceC2836 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC1547 f10992;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2836 f10993;

    /* JADX WARN: Multi-variable type inference failed */
    public C2837(InterfaceC2836 interfaceC2836, InterfaceC3856 interfaceC3856) {
        this.f10993 = interfaceC2836;
        this.f10992 = (AbstractC1547) interfaceC3856;
    }

    @Override // p218.InterfaceC2836
    public final Iterator iterator() {
        return new C2831(this);
    }
}
