package p208;

import android.os.Parcel;
import android.os.Parcelable;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4464;
import ˆٴ.ˉˏ;

/* renamed from: ˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2791 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2791> CREATOR = new ˉˏ(29);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final float f10857;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f10858;

    public C2791(float f, float f2) {
        AbstractC4464.m10124("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f10858 = f;
        this.f10857 = f2;
    }

    public C2791(Parcel parcel) {
        this.f10858 = parcel.readFloat();
        this.f10857 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2791.class != obj.getClass()) {
            return false;
        }
        C2791 c2791 = (C2791) obj;
        return this.f10858 == c2791.f10858 && this.f10857 == c2791.f10857;
    }

    public final int hashCode() {
        return Float.valueOf(this.f10857).hashCode() + ((Float.valueOf(this.f10858).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f10858 + ", longitude=" + this.f10857;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f10858);
        parcel.writeFloat(this.f10857);
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
