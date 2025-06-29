package p208;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.ˑʽ;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;

/* renamed from: ˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2797 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2797> CREATOR = new ˑʽ(0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f10903;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f10904;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f10905;

    public C2797(long j, long j2, long j3) {
        this.f10905 = j;
        this.f10903 = j2;
        this.f10904 = j3;
    }

    public C2797(Parcel parcel) {
        this.f10905 = parcel.readLong();
        this.f10903 = parcel.readLong();
        this.f10904 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2797)) {
            return false;
        }
        C2797 c2797 = (C2797) obj;
        return this.f10905 == c2797.f10905 && this.f10903 == c2797.f10903 && this.f10904 == c2797.f10904;
    }

    public final int hashCode() {
        return ˑʽ.ˏᴵ(this.f10904) + ((ˑʽ.ˏᴵ(this.f10903) + ((ˑʽ.ˏᴵ(this.f10905) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10905 + ", modification time=" + this.f10903 + ", timescale=" + this.f10904;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f10905);
        parcel.writeLong(this.f10903);
        parcel.writeLong(this.f10904);
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
