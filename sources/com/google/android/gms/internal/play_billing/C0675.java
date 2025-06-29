package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0675 extends AbstractC0597 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C0675 f3093 = new C0675(0, new Object[0]);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient Object[] f3094;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f3095;

    public C0675(int i, Object[] objArr) {
        this.f3094 = objArr;
        this.f3095 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ˈי.ʾˈ.ˎٴ(i, this.f3095);
        Object obj = this.f3094[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3095;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ٴˎ */
    public final int mo2558() {
        return this.f3095;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ᐧʻ */
    public final int mo2559() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0597, com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ﹳﹳ */
    public final int mo2560(Object[] objArr) {
        Object[] objArr2 = this.f3094;
        int i = this.f3095;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ﹶˆ */
    public final Object[] mo2561() {
        return this.f3094;
    }
}
