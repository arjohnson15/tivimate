package p195;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ـˈ.ˉᵎ;

/* renamed from: ˎˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2710 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f10608 = 0;

    static {
        AbstractC2710.class.getClassLoader();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6872(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ˉᵎ.ˉⁱ("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m6873(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Parcelable m6874(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
