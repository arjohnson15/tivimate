package p417;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p305.C3529;
import p305.C3542;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳᴵ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4767 extends AbstractC2491 {
    public static final Parcelable.Creator<C4767> CREATOR = new C3529(29);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3542[] f18293;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f18294;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C4764 f18295;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Bundle f18296;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ﹳﹶ(parcel, 1, this.f18296);
        ˉⁱ.ﾞᐧ(parcel, 2, this.f18293, i);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f18294);
        ˉⁱ.ـˆ(parcel, 4, this.f18295, i);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
