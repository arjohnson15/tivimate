package p179;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4464;
import ˆٴ.ˉˏ;

/* renamed from: ˋᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2494 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2494> CREATOR = new ˉˏ(24);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f9920;

    public C2494(ArrayList arrayList) {
        this.f9920 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C2493) arrayList.get(0)).f9917;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C2493) arrayList.get(i)).f9919 < j) {
                    z = true;
                    break;
                } else {
                    j = ((C2493) arrayList.get(i)).f9917;
                    i++;
                }
            }
        }
        AbstractC4464.m10142(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2494.class != obj.getClass()) {
            return false;
        }
        return this.f9920.equals(((C2494) obj).f9920);
    }

    public final int hashCode() {
        return this.f9920.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f9920;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f9920);
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
