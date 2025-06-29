package p009;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p329.AbstractC3742;

/* renamed from: ʻˋ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0988 implements InterfaceC0992 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ ˋˊ f4336;

    public C0988(ˋˊ r1) {
        this.f4336 = r1;
    }

    @Override // p009.InterfaceC0992
    /* renamed from: ـﹶ */
    public final void mo1568(boolean z) {
        ArrayList arrayList;
        AbstractC3742.m8713();
        synchronized (this.f4336) {
            arrayList = new ArrayList((HashSet) this.f4336.ᐧˋ);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0992) it.next()).mo1568(z);
        }
    }
}
