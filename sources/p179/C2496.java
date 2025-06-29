package p179;

import android.os.Parcel;
import android.os.Parcelable;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import ˆٴ.ˉˏ;

/* renamed from: ˋᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2496 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2496> CREATOR = new ˉˏ(26);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9926;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f9927;

    public C2496(int i, float f) {
        this.f9927 = f;
        this.f9926 = i;
    }

    public C2496(Parcel parcel) {
        this.f9927 = parcel.readFloat();
        this.f9926 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2496.class != obj.getClass()) {
            return false;
        }
        C2496 c2496 = (C2496) obj;
        return this.f9927 == c2496.f9927 && this.f9926 == c2496.f9926;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9927).hashCode() + 527) * 31) + this.f9926;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f9927 + ", svcTemporalLayerCount=" + this.f9926;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f9927);
        parcel.writeInt(this.f9926);
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
