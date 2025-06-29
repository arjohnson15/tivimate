package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p177.AbstractC2491;
import p305.C3529;
import p417.AbstractC4753;
import ˈⁱ.ˉⁱ;

/* loaded from: classes.dex */
public final class Scope extends AbstractC2491 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3529(6);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f2410;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f2411;

    public Scope(int i, String str) {
        AbstractC4753.m10680(str, "scopeUri must not be null or empty");
        this.f2411 = i;
        this.f2410 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2410.equals(((Scope) obj).f2410);
    }

    public final int hashCode() {
        return this.f2410.hashCode();
    }

    public final String toString() {
        return this.f2410;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f2411);
        ˉⁱ.ᴵʼ(parcel, 2, this.f2410);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
