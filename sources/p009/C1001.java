package p009;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p259.InterfaceC3214;
import p329.AbstractC3742;

/* renamed from: ʻˋ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1001 implements InterfaceC1000 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Set f4351 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי */
    public final void mo1559() {
        Iterator it = AbstractC3742.m8709(this.f4351).iterator();
        while (it.hasNext()) {
            ((InterfaceC3214) it.next()).mo1559();
        }
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ */
    public final void mo1560() {
        Iterator it = AbstractC3742.m8709(this.f4351).iterator();
        while (it.hasNext()) {
            ((InterfaceC3214) it.next()).mo1560();
        }
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ */
    public final void mo1562() {
        Iterator it = AbstractC3742.m8709(this.f4351).iterator();
        while (it.hasNext()) {
            ((InterfaceC3214) it.next()).mo1562();
        }
    }
}
