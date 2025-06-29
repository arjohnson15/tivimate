package p456;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p417.AbstractC4753;
import p417.C4749;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞⁱ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5343 extends AbstractC2491 {
    public static final Parcelable.Creator<C5343> CREATOR = new C4749(9);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C5279 f20718;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f20719;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f20720;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f20721;

    public C5343(String str, C5279 c5279, String str2, long j) {
        this.f20721 = str;
        this.f20718 = c5279;
        this.f20719 = str2;
        this.f20720 = j;
    }

    public C5343(C5343 c5343, long j) {
        AbstractC4753.m10683(c5343);
        this.f20721 = c5343.f20721;
        this.f20718 = c5343.f20718;
        this.f20719 = c5343.f20719;
        this.f20720 = j;
    }

    public final String toString() {
        return "origin=" + this.f20719 + ",name=" + this.f20721 + ",params=" + String.valueOf(this.f20718);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᴵʼ(parcel, 2, this.f20721);
        ˉⁱ.ـˆ(parcel, 3, this.f20718, i);
        ˉⁱ.ᴵʼ(parcel, 4, this.f20719);
        ˉⁱ.ᵢٴ(parcel, 5, 8);
        parcel.writeLong(this.f20720);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
