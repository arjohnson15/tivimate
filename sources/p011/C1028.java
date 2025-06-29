package p011;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;
import java.util.Arrays;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;

/* renamed from: ʻˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1028 implements InterfaceC2425 {
    public static final Parcelable.Creator<C1028> CREATOR = new ـﹶ(9);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f4421;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f4422;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final byte[] f4423;

    public C1028(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f4423 = bArrCreateByteArray;
        this.f4421 = parcel.readString();
        this.f4422 = parcel.readString();
    }

    public C1028(String str, String str2, byte[] bArr) {
        this.f4423 = bArr;
        this.f4421 = str;
        this.f4422 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1028.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4423, ((C1028) obj).f4423);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4423);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f4421 + "\", url=\"" + this.f4422 + "\", rawMetadata.length=\"" + this.f4423.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f4423);
        parcel.writeString(this.f4421);
        parcel.writeString(this.f4422);
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
    public final void mo3979(C2400 c2400) {
        String str = this.f4421;
        if (str != null) {
            c2400.f9480 = str;
        }
    }
}
