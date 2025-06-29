package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0640 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f3021;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f3022;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f3023;

    public C0640(Object obj, Object obj2, Object obj3) {
        this.f3023 = obj;
        this.f3021 = obj2;
        this.f3022 = obj3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IllegalArgumentException m2655() {
        Object obj = this.f3023;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f3021) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f3022));
    }
}
