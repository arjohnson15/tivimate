package p072;

import java.util.concurrent.CancellationException;
import p070.AbstractC1549;
import p338.InterfaceC3870;

/* renamed from: ʿʽ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1599 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC1640 f6359;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Throwable f6360;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3870 f6361;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f6362;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f6363;

    public C1599(Object obj, InterfaceC1640 interfaceC1640, InterfaceC3870 interfaceC3870, Object obj2, Throwable th) {
        this.f6362 = obj;
        this.f6359 = interfaceC1640;
        this.f6361 = interfaceC3870;
        this.f6363 = obj2;
        this.f6360 = th;
    }

    public /* synthetic */ C1599(Object obj, InterfaceC1640 interfaceC1640, InterfaceC3870 interfaceC3870, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC1640, (i & 4) != 0 ? null : interfaceC3870, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1599 m5196(C1599 c1599, InterfaceC1640 interfaceC1640, CancellationException cancellationException, int i) {
        Object obj = c1599.f6362;
        if ((i & 2) != 0) {
            interfaceC1640 = c1599.f6359;
        }
        InterfaceC1640 interfaceC16402 = interfaceC1640;
        InterfaceC3870 interfaceC3870 = c1599.f6361;
        Object obj2 = c1599.f6363;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c1599.f6360;
        }
        c1599.getClass();
        return new C1599(obj, interfaceC16402, interfaceC3870, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1599)) {
            return false;
        }
        C1599 c1599 = (C1599) obj;
        return AbstractC1549.m5138(this.f6362, c1599.f6362) && AbstractC1549.m5138(this.f6359, c1599.f6359) && AbstractC1549.m5138(this.f6361, c1599.f6361) && AbstractC1549.m5138(this.f6363, c1599.f6363) && AbstractC1549.m5138(this.f6360, c1599.f6360);
    }

    public final int hashCode() {
        Object obj = this.f6362;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1640 interfaceC1640 = this.f6359;
        int iHashCode2 = (iHashCode + (interfaceC1640 == null ? 0 : interfaceC1640.hashCode())) * 31;
        InterfaceC3870 interfaceC3870 = this.f6361;
        int iHashCode3 = (iHashCode2 + (interfaceC3870 == null ? 0 : interfaceC3870.hashCode())) * 31;
        Object obj2 = this.f6363;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6360;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6362 + ", cancelHandler=" + this.f6359 + ", onCancellation=" + this.f6361 + ", idempotentResume=" + this.f6363 + ", cancelCause=" + this.f6360 + ')';
    }
}
