package p209;

import android.os.Parcel;
import android.os.Parcelable;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4470;
import p395.AbstractC4535;
import ˆʽ.ᵎˏ;
import ˏ.ˑʽ;

/* renamed from: ˏʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2798 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2798> CREATOR = new ˑʽ(2);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f10906;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f10907;

    public C2798(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f10907 = string;
        this.f10906 = parcel.readString();
    }

    public C2798(String str, String str2) {
        this.f10907 = AbstractC4535.m10341(str);
        this.f10906 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2798 c2798 = (C2798) obj;
        return this.f10907.equals(c2798.f10907) && this.f10906.equals(c2798.f10906);
    }

    public final int hashCode() {
        return this.f10906.hashCode() + ᵎˏ.ˏʾ(527, 31, this.f10907);
    }

    public final String toString() {
        return "VC: " + this.f10907 + "=" + this.f10906;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10907);
        parcel.writeString(this.f10906);
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
        String str;
        String str2 = this.f10907;
        str2.getClass();
        str = this.f10906;
        switch (str2) {
            case "ALBUM":
                c2400.f9478 = str;
                break;
            case "TITLE":
                c2400.f9480 = str;
                break;
            case "DESCRIPTION":
                c2400.f9468 = str;
                break;
            case "ALBUMARTIST":
                c2400.f9487 = str;
                break;
            case "ARTIST":
                c2400.f9467 = str;
                break;
        }
    }
}
