package p246;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p166.AbstractC2435;
import p166.C2400;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4470;
import ˏ.ˑʽ;

/* renamed from: יʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3117 implements InterfaceC2425 {
    public static final Parcelable.Creator<C3117> CREATOR;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final C2431 f12013;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C2431 f12014;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f12015;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final byte[] f12016;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f12017;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f12018;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f12019;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f12020;

    static {
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("application/id3");
        f12014 = new C2431(c2417);
        C2417 c24172 = new C2417();
        c24172.f9602 = AbstractC2435.m6559("application/x-scte35");
        f12013 = new C2431(c24172);
        CREATOR = new ˑʽ(8);
    }

    public C3117(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f12019 = string;
        this.f12015 = parcel.readString();
        this.f12017 = parcel.readLong();
        this.f12018 = parcel.readLong();
        this.f12016 = parcel.createByteArray();
    }

    public C3117(String str, String str2, long j, long j2, byte[] bArr) {
        this.f12019 = str;
        this.f12015 = str2;
        this.f12017 = j;
        this.f12018 = j2;
        this.f12016 = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3117.class != obj.getClass()) {
            return false;
        }
        C3117 c3117 = (C3117) obj;
        return this.f12017 == c3117.f12017 && this.f12018 == c3117.f12018 && AbstractC4470.m10194(this.f12019, c3117.f12019) && AbstractC4470.m10194(this.f12015, c3117.f12015) && Arrays.equals(this.f12016, c3117.f12016);
    }

    public final int hashCode() {
        if (this.f12020 == 0) {
            String str = this.f12019;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12015;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f12017;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f12018;
            this.f12020 = Arrays.hashCode(this.f12016) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f12020;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f12019 + ", id=" + this.f12018 + ", durationMs=" + this.f12017 + ", value=" + this.f12015;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12019);
        parcel.writeString(this.f12015);
        parcel.writeLong(this.f12017);
        parcel.writeLong(this.f12018);
        parcel.writeByteArray(this.f12016);
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ٴˎ */
    public final C2431 mo3977() {
        String str = this.f12019;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f12013;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f12014;
            default:
                return null;
        }
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ᐧʻ */
    public final byte[] mo3978() {
        if (mo3977() != null) {
            return this.f12016;
        }
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo3979(C2400 c2400) {
    }
}
