package p011;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1027 implements InterfaceC2425 {
    public static final Parcelable.Creator<C1027> CREATOR = new ـﹶ(8);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f4415;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f4416;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f4417;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f4418;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f4419;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f4420;

    public C1027(int i, int i2, String str, String str2, String str3, boolean z) {
        AbstractC4464.m10142(i2 == -1 || i2 > 0);
        this.f4419 = i;
        this.f4415 = str;
        this.f4417 = str2;
        this.f4418 = str3;
        this.f4416 = z;
        this.f4420 = i2;
    }

    public C1027(Parcel parcel) {
        this.f4419 = parcel.readInt();
        this.f4415 = parcel.readString();
        this.f4417 = parcel.readString();
        this.f4418 = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f4416 = parcel.readInt() != 0;
        this.f4420 = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p011.C1027 m3976(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p011.C1027.m3976(java.util.Map):ʻˏ.ʽᐧ");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1027.class != obj.getClass()) {
            return false;
        }
        C1027 c1027 = (C1027) obj;
        return this.f4419 == c1027.f4419 && AbstractC4470.m10194(this.f4415, c1027.f4415) && AbstractC4470.m10194(this.f4417, c1027.f4417) && AbstractC4470.m10194(this.f4418, c1027.f4418) && this.f4416 == c1027.f4416 && this.f4420 == c1027.f4420;
    }

    public final int hashCode() {
        int i = (527 + this.f4419) * 31;
        String str = this.f4415;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4417;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4418;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4416 ? 1 : 0)) * 31) + this.f4420;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f4417 + "\", genre=\"" + this.f4415 + "\", bitrate=" + this.f4419 + ", metadataInterval=" + this.f4420;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4419);
        parcel.writeString(this.f4415);
        parcel.writeString(this.f4417);
        parcel.writeString(this.f4418);
        int i2 = AbstractC4470.f17202;
        parcel.writeInt(this.f4416 ? 1 : 0);
        parcel.writeInt(this.f4420);
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ C2431 mo3977() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ byte[] mo3978() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo3979(C2400 c2400) {
        String str = this.f4417;
        if (str != null) {
            c2400.f9472 = str;
        }
        String str2 = this.f4415;
        if (str2 != null) {
            c2400.f9469 = str2;
        }
    }
}
