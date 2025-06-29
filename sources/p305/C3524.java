package p305;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p177.AbstractC2491;
import p334.C3789;
import p417.AbstractC4753;
import p447.AbstractC5179;
import ˈⁱ.ˉⁱ;
import ـˏ.ٴˎ;

/* renamed from: ᐧˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3524 extends AbstractC2491 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f13645;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final PendingIntent f13646;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f13647;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f13648;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C3524 f13644 = new C3524(0);
    public static final Parcelable.Creator<C3524> CREATOR = new ٴˎ(28);

    public C3524(int i) {
        this(1, i, null, null);
    }

    public C3524(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f13648 = i;
        this.f13645 = i2;
        this.f13646 = pendingIntent;
        this.f13647 = str;
    }

    public C3524(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m8406(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC5179.m11548(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3524)) {
            return false;
        }
        C3524 c3524 = (C3524) obj;
        return this.f13645 == c3524.f13645 && AbstractC4753.m10682(this.f13646, c3524.f13646) && AbstractC4753.m10682(this.f13647, c3524.f13647);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13645), this.f13646, this.f13647});
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        c0559.m2487(m8406(this.f13645), "statusCode");
        c0559.m2487(this.f13646, "resolution");
        c0559.m2487(this.f13647, "message");
        return c0559.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f13648);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(this.f13645);
        ˉⁱ.ـˆ(parcel, 3, this.f13646, i);
        ˉⁱ.ᴵʼ(parcel, 4, this.f13647);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
