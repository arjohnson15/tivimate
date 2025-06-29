package p380;

import android.os.Parcel;
import android.os.Parcelable;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4423 extends AbstractC4424 {
    public static final Parcelable.Creator<C4423> CREATOR = new C3529(14);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17060;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17061;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f17062;

    public C4423(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17060 = string;
        this.f17061 = parcel.readString();
        this.f17062 = parcel.readString();
    }

    public C4423(String str, String str2, String str3) {
        super("COMM");
        this.f17060 = str;
        this.f17061 = str2;
        this.f17062 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4423.class != obj.getClass()) {
            return false;
        }
        C4423 c4423 = (C4423) obj;
        return AbstractC4470.m10194(this.f17061, c4423.f17061) && AbstractC4470.m10194(this.f17060, c4423.f17060) && AbstractC4470.m10194(this.f17062, c4423.f17062);
    }

    public final int hashCode() {
        String str = this.f17060;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17061;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17062;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": language=" + this.f17060 + ", description=" + this.f17061 + ", text=" + this.f17062;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17063);
        parcel.writeString(this.f17060);
        parcel.writeString(this.f17062);
    }
}
