package p456;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p417.C4749;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞⁱ.ٴᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5307 extends AbstractC2491 {
    public static final Parcelable.Creator<C5307> CREATOR = new C4749(10);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f20586;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f20587;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f20588;

    public C5307(int i, long j, String str) {
        this.f20588 = str;
        this.f20586 = j;
        this.f20587 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᴵʼ(parcel, 1, this.f20588);
        ˉⁱ.ᵢٴ(parcel, 2, 8);
        parcel.writeLong(this.f20586);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f20587);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
