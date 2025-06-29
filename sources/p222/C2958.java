package p222;

import android.os.Parcel;
import android.os.Parcelable;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ˏᴵ.ᵢⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2958 extends AbstractC4002 {
    public static final Parcelable.Creator<C2958> CREATOR = new C1404(3);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f11400;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f11401;

    public C2958(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11400 = parcel.readInt();
        this.f11401 = parcel.readInt() != 0;
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11400);
        parcel.writeInt(this.f11401 ? 1 : 0);
    }
}
