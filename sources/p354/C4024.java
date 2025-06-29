package p354;

import java.security.MessageDigest;
import p314.InterfaceC3594;
import p329.AbstractC3740;

/* renamed from: ᵔˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4024 implements InterfaceC3594 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f15473;

    public C4024(Object obj) {
        AbstractC3740.m8706(obj, "Argument must not be null");
        this.f15473 = obj;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (obj instanceof C4024) {
            return this.f15473.equals(((C4024) obj).f15473);
        }
        return false;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return this.f15473.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f15473 + '}';
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        messageDigest.update(this.f15473.toString().getBytes(InterfaceC3594.f13813));
    }
}
