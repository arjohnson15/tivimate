package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4433 extends AbstractC4424 {
    public static final Parcelable.Creator<C4433> CREATOR = new C3529(15);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17090;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final byte[] f17091;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17092;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f17093;

    public C4433(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17090 = string;
        this.f17092 = parcel.readString();
        this.f17093 = parcel.readString();
        this.f17091 = parcel.createByteArray();
    }

    public C4433(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f17090 = str;
        this.f17092 = str2;
        this.f17093 = str3;
        this.f17091 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4433.class != obj.getClass()) {
            return false;
        }
        C4433 c4433 = (C4433) obj;
        return AbstractC4470.m10194(this.f17090, c4433.f17090) && AbstractC4470.m10194(this.f17092, c4433.f17092) && AbstractC4470.m10194(this.f17093, c4433.f17093) && Arrays.equals(this.f17091, c4433.f17091);
    }

    public final int hashCode() {
        String str = this.f17090;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17092;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17093;
        return Arrays.hashCode(this.f17091) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": mimeType=" + this.f17090 + ", filename=" + this.f17092 + ", description=" + this.f17093;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17090);
        parcel.writeString(this.f17092);
        parcel.writeString(this.f17093);
        parcel.writeByteArray(this.f17091);
    }
}
