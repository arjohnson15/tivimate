package p148;

import p070.AbstractC1549;
import p330.InterfaceC3756;

/* renamed from: ˊʻ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2261 implements InterfaceC3756 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ThreadLocal f8993;

    public C2261(ThreadLocal threadLocal) {
        this.f8993 = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2261) && AbstractC1549.m5138(this.f8993, ((C2261) obj).f8993);
    }

    public final int hashCode() {
        return this.f8993.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f8993 + ')';
    }
}
