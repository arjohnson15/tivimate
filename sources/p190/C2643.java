package p190;

import android.os.Parcel;
import android.os.Parcelable;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ˎˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2643 extends AbstractC4002 {
    public static final Parcelable.Creator<C2643> CREATOR = new C1404(1);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f10480;

    public C2643(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C2643.class.getClassLoader();
        }
        this.f10480 = parcel.readInt() == 1;
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10480 ? 1 : 0);
    }
}
