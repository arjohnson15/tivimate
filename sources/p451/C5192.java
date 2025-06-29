package p451;

import android.os.Parcel;
import android.os.Parcelable;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p417.C4749;
import ˆʽ.ᵎˏ;

/* renamed from: ﾞי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5192 implements InterfaceC2425 {
    public static final Parcelable.Creator<C5192> CREATOR = new C4749(5);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f20015;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f20016;

    public C5192(int i, String str) {
        this.f20016 = i;
        this.f20015 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f20016);
        sb.append(",url=");
        return ᵎˏ.ˎٴ(sb, this.f20015, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20015);
        parcel.writeInt(this.f20016);
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
