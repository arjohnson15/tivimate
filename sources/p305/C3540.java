package p305;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p395.AbstractC4535;
import ˈⁱ.ˉⁱ;
import ᴵﹳ.ٴˎ;

/* renamed from: ᐧˆ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3540 extends AbstractC2491 {
    public static final Parcelable.Creator<C3540> CREATOR = new C3529(0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f13684;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f13685;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f13686;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f13687;

    public C3540(int i, int i2, String str, boolean z) {
        this.f13687 = z;
        this.f13684 = str;
        this.f13685 = AbstractC4535.m10372(i) - 1;
        this.f13686 = ٴˎ.ﹳˎ(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f13687 ? 1 : 0);
        ˉⁱ.ᴵʼ(parcel, 2, this.f13684);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f13685);
        ˉⁱ.ᵢٴ(parcel, 4, 4);
        parcel.writeInt(this.f13686);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
