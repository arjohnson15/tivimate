package p023;

import android.net.ConnectivityManager;
import p184.C2548;
import p269.InterfaceC3287;
import p330.C3749;
import p331.C3768;
import p457.C5358;

/* renamed from: ʼʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1141 implements InterfaceC3287 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f4776;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ConnectivityManager f4777;

    public C1141(ConnectivityManager connectivityManager) {
        long j = AbstractC1148.f4790;
        this.f4777 = connectivityManager;
        this.f4776 = j;
    }

    @Override // p269.InterfaceC3287
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo4160(C3768 c3768) {
        return c3768.f14565.m12153() != null;
    }

    @Override // p269.InterfaceC3287
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo4161(C3768 c3768) {
        if (mo4160(c3768)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // p269.InterfaceC3287
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2548 mo4162(C5358 c5358) {
        return new C2548(new C1146(c5358, this, null), C3749.f14510, -2, 1);
    }
}
