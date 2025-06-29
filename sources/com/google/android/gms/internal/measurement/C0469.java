package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0469 implements InterfaceC0489 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f2788;

    public C0469(Boolean bool) {
        if (bool == null) {
            this.f2788 = false;
        } else {
            this.f2788 = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0469) && this.f2788 == ((C0469) obj).f2788;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f2788).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f2788);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        return Double.valueOf(this.f2788 ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return new C0469(Boolean.valueOf(this.f2788));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r3, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f2788;
        if (zEquals) {
            return new C0429(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        return Boolean.valueOf(this.f2788);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        return Boolean.toString(this.f2788);
    }
}
