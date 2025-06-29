package p417;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p305.C3529;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4775 extends AbstractC2491 {
    public static final Parcelable.Creator<C4775> CREATOR = new C3529(27);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f18302;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f18303;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f18304;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f18305;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f18306;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f18307;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18308;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f18309;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final String f18310;

    public C4775(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f18308 = i;
        this.f18302 = i2;
        this.f18305 = i3;
        this.f18307 = j;
        this.f18303 = j2;
        this.f18309 = str;
        this.f18310 = str2;
        this.f18304 = i4;
        this.f18306 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f18308);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(this.f18302);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f18305);
        ˉⁱ.ᵢٴ(parcel, 4, 8);
        parcel.writeLong(this.f18307);
        ˉⁱ.ᵢٴ(parcel, 5, 8);
        parcel.writeLong(this.f18303);
        ˉⁱ.ᴵʼ(parcel, 6, this.f18309);
        ˉⁱ.ᴵʼ(parcel, 7, this.f18310);
        ˉⁱ.ᵢٴ(parcel, 8, 4);
        parcel.writeInt(this.f18304);
        ˉⁱ.ᵢٴ(parcel, 9, 4);
        parcel.writeInt(this.f18306);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
