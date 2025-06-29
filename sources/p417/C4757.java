package p417;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p305.C3529;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4757 extends AbstractC2491 {
    public static final Parcelable.Creator<C4757> CREATOR = new C3529(28);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f18247;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f18248;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f18249;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f18250;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18251;

    public C4757(int i, int i2, int i3, boolean z, boolean z2) {
        this.f18251 = i;
        this.f18247 = z;
        this.f18249 = z2;
        this.f18250 = i2;
        this.f18248 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f18251);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(this.f18247 ? 1 : 0);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f18249 ? 1 : 0);
        ˉⁱ.ᵢٴ(parcel, 4, 4);
        parcel.writeInt(this.f18250);
        ˉⁱ.ᵢٴ(parcel, 5, 4);
        parcel.writeInt(this.f18248);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
