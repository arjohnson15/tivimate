package p009;

import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0222;
import androidx.lifecycle.InterfaceC0238;
import androidx.lifecycle.InterfaceC0262;
import java.util.HashSet;
import java.util.Iterator;
import p329.AbstractC3742;

/* renamed from: ʻˋ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0989 implements InterfaceC0994, InterfaceC0222 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractC0233 f4337;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HashSet f4338 = new HashSet();

    public C0989(AbstractC0233 abstractC0233) {
        this.f4337 = abstractC0233;
        abstractC0233.mo1032(this);
    }

    @InterfaceC0238(EnumC0247.ON_DESTROY)
    public void onDestroy(InterfaceC0262 interfaceC0262) {
        Iterator it = AbstractC3742.m8709(this.f4338).iterator();
        while (it.hasNext()) {
            ((InterfaceC1000) it.next()).mo1560();
        }
        interfaceC0262.getLifecycle().mo1031(this);
    }

    @InterfaceC0238(EnumC0247.ON_START)
    public void onStart(InterfaceC0262 interfaceC0262) {
        Iterator it = AbstractC3742.m8709(this.f4338).iterator();
        while (it.hasNext()) {
            ((InterfaceC1000) it.next()).mo1559();
        }
    }

    @InterfaceC0238(EnumC0247.ON_STOP)
    public void onStop(InterfaceC0262 interfaceC0262) {
        Iterator it = AbstractC3742.m8709(this.f4338).iterator();
        while (it.hasNext()) {
            ((InterfaceC1000) it.next()).mo1562();
        }
    }

    @Override // p009.InterfaceC0994
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo3952(InterfaceC1000 interfaceC1000) {
        this.f4338.add(interfaceC1000);
        EnumC0230 enumC0230 = ((C0236) this.f4337).f1275;
        if (enumC0230 == EnumC0230.f1254) {
            interfaceC1000.mo1560();
        } else if (enumC0230.m1030(EnumC0230.f1253)) {
            interfaceC1000.mo1559();
        } else {
            interfaceC1000.mo1562();
        }
    }

    @Override // p009.InterfaceC0994
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo3953(InterfaceC1000 interfaceC1000) {
        this.f4338.remove(interfaceC1000);
    }
}
