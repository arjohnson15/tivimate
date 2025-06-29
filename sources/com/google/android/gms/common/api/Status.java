package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p177.AbstractC2491;
import p305.C3524;
import p305.C3529;
import p334.C3789;
import p417.AbstractC4753;
import ˈⁱ.ˉⁱ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class Status extends AbstractC2491 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C3529(7);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f2412;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final PendingIntent f2413;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3524 f2414;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f2415;

    public Status(int i, String str, PendingIntent pendingIntent, C3524 c3524) {
        this.f2415 = i;
        this.f2412 = str;
        this.f2413 = pendingIntent;
        this.f2414 = c3524;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2415 == status.f2415 && AbstractC4753.m10682(this.f2412, status.f2412) && AbstractC4753.m10682(this.f2413, status.f2413) && AbstractC4753.m10682(this.f2414, status.f2414);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2415), this.f2412, this.f2413, this.f2414});
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        String str = this.f2412;
        if (str == null) {
            int i = this.f2415;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = ˉᵎ.ˉⁱ("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c0559.m2487(str, "statusCode");
        c0559.m2487(this.f2413, "resolution");
        return c0559.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f2415);
        ˉⁱ.ᴵʼ(parcel, 2, this.f2412);
        ˉⁱ.ـˆ(parcel, 3, this.f2413, i);
        ˉⁱ.ـˆ(parcel, 4, this.f2414, i);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
