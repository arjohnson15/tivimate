package p372;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p305.C3529;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢˆ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4233 implements InterfaceC2425 {
    public static final Parcelable.Creator<C4233> CREATOR = new C3529(8);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f16381;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final List f16382;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f16383;

    public C4233(Parcel parcel) {
        this.f16383 = parcel.readString();
        this.f16381 = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C4223) parcel.readParcelable(C4223.class.getClassLoader()));
        }
        this.f16382 = DesugarCollections.unmodifiableList(arrayList);
    }

    public C4233(String str, String str2, List list) {
        this.f16383 = str;
        this.f16381 = str2;
        this.f16382 = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4233.class != obj.getClass()) {
            return false;
        }
        C4233 c4233 = (C4233) obj;
        return TextUtils.equals(this.f16383, c4233.f16383) && TextUtils.equals(this.f16381, c4233.f16381) && this.f16382.equals(c4233.f16382);
    }

    public final int hashCode() {
        String str = this.f16383;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16381;
        return this.f16382.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f16383;
        sb.append(str != null ? ᵎˏ.ˎٴ(AbstractC0002.m50(" [", str, ", "), this.f16381, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16383);
        parcel.writeString(this.f16381);
        List list = this.f16382;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
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
