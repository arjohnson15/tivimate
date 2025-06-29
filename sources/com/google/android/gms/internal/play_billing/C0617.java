package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0617 extends AbstractC0597 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient int f2986;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient Object[] f2987;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f2988;

    public C0617(Object[] objArr, int i, int i2) {
        this.f2987 = objArr;
        this.f2988 = i;
        this.f2986 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ˈי.ʾˈ.ˎٴ(i, this.f2986);
        Object obj = this.f2987[i + i + this.f2988];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2986;
    }
}
