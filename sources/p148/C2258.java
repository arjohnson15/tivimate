package p148;

import p140.C2185;
import p330.C3749;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p330.InterfaceC3756;
import p338.InterfaceC3864;
import ᴵﹳ.ٴˎ;

/* renamed from: ˊʻ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2258 implements InterfaceC3750 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ThreadLocal f8982;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2261 f8983;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2185 f8984;

    public C2258(C2185 c2185, ThreadLocal threadLocal) {
        this.f8984 = c2185;
        this.f8982 = threadLocal;
        this.f8983 = new C2261(threadLocal);
    }

    @Override // p330.InterfaceC3750
    public final InterfaceC3756 getKey() {
        return this.f8983;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f8984 + ", threadLocal = " + this.f8982 + ')';
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        return this.f8983.equals(interfaceC3756) ? C3749.f14510 : this;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6260(Object obj) {
        this.f8982.set(obj);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        if (this.f8983.equals(interfaceC3756)) {
            return this;
        }
        return null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object m6261(InterfaceC3747 interfaceC3747) {
        ThreadLocal threadLocal = this.f8982;
        Object obj = threadLocal.get();
        threadLocal.set(this.f8984);
        return obj;
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ᐧˋ */
    public final InterfaceC3747 mo3967(InterfaceC3747 interfaceC3747) {
        return ٴˎ.ˋⁱ(this, interfaceC3747);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ﾞʽ */
    public final Object mo3968(Object obj, InterfaceC3864 interfaceC3864) {
        return interfaceC3864.mo1054(obj, this);
    }
}
