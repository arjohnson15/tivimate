package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0421 implements InterfaceC0489 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f2715;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0489 f2716;

    public C0421(String str) {
        this.f2716 = InterfaceC0489.f2827;
        this.f2715 = str;
    }

    public C0421(String str, InterfaceC0489 interfaceC0489) {
        this.f2716 = interfaceC0489;
        this.f2715 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0421)) {
            return false;
        }
        C0421 c0421 = (C0421) obj;
        return this.f2715.equals(c0421.f2715) && this.f2716.equals(c0421.f2716);
    }

    public final int hashCode() {
        return this.f2716.hashCode() + (this.f2715.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return new C0421(this.f2715, this.f2716.mo1862());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r2, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        throw new IllegalStateException("Control is not a String");
    }
}
