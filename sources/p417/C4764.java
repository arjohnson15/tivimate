package p417;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4764 extends AbstractC2491 {
    public static final Parcelable.Creator<C4764> CREATOR = new C4749(0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f18264;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f18265;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f18266;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int[] f18267;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4757 f18268;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int[] f18269;

    public C4764(C4757 c4757, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f18268 = c4757;
        this.f18264 = z;
        this.f18266 = z2;
        this.f18267 = iArr;
        this.f18265 = i;
        this.f18269 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ـˆ(parcel, 1, this.f18268, i);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(this.f18264 ? 1 : 0);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f18266 ? 1 : 0);
        int[] iArr = this.f18267;
        if (iArr != null) {
            int i3 = ˉⁱ.ˑﾞ(parcel, 4);
            parcel.writeIntArray(iArr);
            ˉⁱ.ˑⁱ(parcel, i3);
        }
        ˉⁱ.ᵢٴ(parcel, 5, 4);
        parcel.writeInt(this.f18265);
        int[] iArr2 = this.f18269;
        if (iArr2 != null) {
            int i4 = ˉⁱ.ˑﾞ(parcel, 6);
            parcel.writeIntArray(iArr2);
            ˉⁱ.ˑⁱ(parcel, i4);
        }
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
