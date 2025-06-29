package p061;

import android.os.Parcel;
import android.os.Parcelable;
import p190.C2643;
import p220.C2849;
import p222.C2958;
import p290.C3411;
import p291.C3445;
import p315.C3606;
import p334.C3789;
import p350.AbstractC4002;
import p357.C4071;
import p413.C4711;

/* renamed from: ʾـ.ᐧʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1404 implements Parcelable.ClassLoaderCreator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5735;

    public /* synthetic */ C1404(int i) {
        this.f5735 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5735) {
            case 0:
                return new C1377(parcel, null);
            case 1:
                return new C2643(parcel, null);
            case 2:
                return new C2849(parcel, null);
            case 3:
                return new C2958(parcel, null);
            case 4:
                return new C3411(parcel, (ClassLoader) null);
            case 5:
                return new C3445(parcel, null);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C3606(parcel, null);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC4002.f15437;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new C4071(parcel, null);
            default:
                return new C4711(parcel, (ClassLoader) null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5735) {
            case 0:
                return new C1377(parcel, classLoader);
            case 1:
                return new C2643(parcel, classLoader);
            case 2:
                return new C2849(parcel, classLoader);
            case 3:
                return new C2958(parcel, classLoader);
            case 4:
                return new C3411(parcel, classLoader);
            case 5:
                return new C3445(parcel, classLoader);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C3606(parcel, classLoader);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC4002.f15437;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new C4071(parcel, classLoader);
            default:
                return new C4711(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5735) {
            case 0:
                return new C1377[i];
            case 1:
                return new C2643[i];
            case 2:
                return new C2849[i];
            case 3:
                return new C2958[i];
            case 4:
                return new C3411[i];
            case 5:
                return new C3445[i];
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C3606[i];
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new AbstractC4002[i];
            case 8:
                return new C4071[i];
            default:
                return new C4711[i];
        }
    }
}
