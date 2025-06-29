package p179;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.ˑʽ;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import ˆٴ.ˉˏ;

/* renamed from: ˋᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2495 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2495> CREATOR = new ˉˏ(23);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f9921;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f9922;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f9923;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f9924;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f9925;

    public C2495(long j, long j2, long j3, long j4, long j5) {
        this.f9925 = j;
        this.f9921 = j2;
        this.f9923 = j3;
        this.f9924 = j4;
        this.f9922 = j5;
    }

    public C2495(Parcel parcel) {
        this.f9925 = parcel.readLong();
        this.f9921 = parcel.readLong();
        this.f9923 = parcel.readLong();
        this.f9924 = parcel.readLong();
        this.f9922 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2495.class != obj.getClass()) {
            return false;
        }
        C2495 c2495 = (C2495) obj;
        return this.f9925 == c2495.f9925 && this.f9921 == c2495.f9921 && this.f9923 == c2495.f9923 && this.f9924 == c2495.f9924 && this.f9922 == c2495.f9922;
    }

    public final int hashCode() {
        return ˑʽ.ˏᴵ(this.f9922) + ((ˑʽ.ˏᴵ(this.f9924) + ((ˑʽ.ˏᴵ(this.f9923) + ((ˑʽ.ˏᴵ(this.f9921) + ((ˑʽ.ˏᴵ(this.f9925) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f9925 + ", photoSize=" + this.f9921 + ", photoPresentationTimestampUs=" + this.f9923 + ", videoStartPosition=" + this.f9924 + ", videoSize=" + this.f9922;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9925);
        parcel.writeLong(this.f9921);
        parcel.writeLong(this.f9923);
        parcel.writeLong(this.f9924);
        parcel.writeLong(this.f9922);
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ٴˎ */
    public final /* synthetic */ C2431 mo3977() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ᐧʻ */
    public final /* synthetic */ byte[] mo3978() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo3979(C2400 c2400) {
    }
}
