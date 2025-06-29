package p220;

import android.os.Parcel;
import android.os.Parcelable;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ˏٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2849 extends AbstractC4002 {
    public static final Parcelable.Creator<C2849> CREATOR = new C1404(2);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f11088;

    public C2849(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11088 = parcel.readInt() == 1;
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11088 ? 1 : 0);
    }
}
