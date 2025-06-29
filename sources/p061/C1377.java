package p061;

import android.os.Parcel;
import android.os.Parcelable;
import p350.AbstractC4002;

/* renamed from: ʾـ.ˊﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1377 extends AbstractC4002 {
    public static final Parcelable.Creator<C1377> CREATOR = new C1404(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Parcelable f5628;

    public C1377(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5628 = parcel.readParcelable(classLoader == null ? AbstractC1402.class.getClassLoader() : classLoader);
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5628, 0);
    }
}
