package p275;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import p383.AbstractC4470;
import ـˏ.ٴˎ;

/* renamed from: ـᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3350 extends AbstractC3345 {
    public static final Parcelable.Creator<C3350> CREATOR = new ٴˎ(14);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f13135;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final byte[] f13136;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f13137;

    public C3350(long j, byte[] bArr, long j2) {
        this.f13137 = j2;
        this.f13135 = j;
        this.f13136 = bArr;
    }

    public C3350(Parcel parcel) {
        this.f13137 = parcel.readLong();
        this.f13135 = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = AbstractC4470.f17202;
        this.f13136 = bArrCreateByteArray;
    }

    @Override // p275.AbstractC3345
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f13137);
        sb.append(", identifier= ");
        return AbstractC0002.m42(sb, this.f13135, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13137);
        parcel.writeLong(this.f13135);
        parcel.writeByteArray(this.f13136);
    }
}
