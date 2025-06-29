package p372;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p305.C3529;

/* renamed from: ᵢˆ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4223 implements Parcelable {
    public static final Parcelable.Creator<C4223> CREATOR = new C3529(9);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f16311;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f16312;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f16313;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f16314;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f16315;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f16316;

    public C4223(int i, int i2, String str, String str2, String str3, String str4) {
        this.f16315 = i;
        this.f16311 = i2;
        this.f16313 = str;
        this.f16314 = str2;
        this.f16312 = str3;
        this.f16316 = str4;
    }

    public C4223(Parcel parcel) {
        this.f16315 = parcel.readInt();
        this.f16311 = parcel.readInt();
        this.f16313 = parcel.readString();
        this.f16314 = parcel.readString();
        this.f16312 = parcel.readString();
        this.f16316 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4223.class != obj.getClass()) {
            return false;
        }
        C4223 c4223 = (C4223) obj;
        return this.f16315 == c4223.f16315 && this.f16311 == c4223.f16311 && TextUtils.equals(this.f16313, c4223.f16313) && TextUtils.equals(this.f16314, c4223.f16314) && TextUtils.equals(this.f16312, c4223.f16312) && TextUtils.equals(this.f16316, c4223.f16316);
    }

    public final int hashCode() {
        int i = ((this.f16315 * 31) + this.f16311) * 31;
        String str = this.f16313;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16314;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16312;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f16316;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16315);
        parcel.writeInt(this.f16311);
        parcel.writeString(this.f16313);
        parcel.writeString(this.f16314);
        parcel.writeString(this.f16312);
        parcel.writeString(this.f16316);
    }
}
