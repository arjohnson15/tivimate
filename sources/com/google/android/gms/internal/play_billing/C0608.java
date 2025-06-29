package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.play_billing.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0608 extends AbstractC0597 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f2977;

    public C0608(C0624 c0624) {
        this.f2977 = c0624;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C0624 c0624 = this.f2977;
        ˈי.ʾˈ.ˎٴ(i, c0624.f2994);
        int i2 = i + i;
        Object[] objArr = c0624.f2996;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2977.f2994;
    }
}
