package p317;

import java.util.Iterator;
import p070.AbstractC1547;
import p218.InterfaceC2836;
import p338.InterfaceC3864;

/* renamed from: ᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3623 implements InterfaceC2836 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f13863;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f13864;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final CharSequence f13865;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1547 f13866;

    /* JADX WARN: Multi-variable type inference failed */
    public C3623(CharSequence charSequence, int i, int i2, InterfaceC3864 interfaceC3864) {
        this.f13865 = charSequence;
        this.f13863 = i;
        this.f13864 = i2;
        this.f13866 = (AbstractC1547) interfaceC3864;
    }

    @Override // p218.InterfaceC2836
    public final Iterator iterator() {
        return new C3614(this);
    }
}
