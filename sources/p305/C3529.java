package p305;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p334.C3789;
import p345.AbstractC3980;
import p372.C4223;
import p372.C4233;
import p380.C4422;
import p380.C4423;
import p380.C4425;
import p380.C4426;
import p380.C4428;
import p380.C4430;
import p380.C4431;
import p380.C4432;
import p380.C4433;
import p380.C4435;
import p380.C4436;
import p417.C4752;
import p417.C4757;
import p417.C4764;
import p417.C4767;
import p417.C4775;
import ˈⁱ.ﹳﹳ;
import ᴵי.ˑי;
import ᵎﹳ.ʽᐧ;
import ᵎﹳ.ʿʼ;
import ᵎﹳ.ٴˎ;
import ᵢﹳ.ʻʿ;
import ᵢﹳ.ᵎˏ;
import ⁱᵢ.ˋⁱ;
import ⁱᵢ.ˎˑ;
import ⁱᵢ.ˏᵢ;

/* renamed from: ᐧˆ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3529 implements Parcelable.Creator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f13657;

    public /* synthetic */ C3529(int i) {
        this.f13657 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f13657) {
            case 0:
                int i4 = ﹳﹳ.ᵔ(parcel);
                boolean z = false;
                String str = null;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < i4) {
                    int i7 = parcel.readInt();
                    char c = (char) i7;
                    if (c == 1) {
                        z = ﹳﹳ.ᵢʿ(parcel, i7);
                    } else if (c == 2) {
                        str = ﹳﹳ.ˉי(parcel, i7);
                    } else if (c == 3) {
                        i5 = ﹳﹳ.ﹳﹶ(parcel, i7);
                    } else if (c != 4) {
                        ﹳﹳ.ᵔﹳ(parcel, i7);
                    } else {
                        i6 = ﹳﹳ.ﹳﹶ(parcel, i7);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i4);
                return new C3540(i5, i6, str, z);
            case 1:
                return new ˑי(parcel.readLong(), parcel.readParcelable(ˑי.class.getClassLoader()));
            case 2:
                return new ʽᐧ(parcel.readLong(), parcel.readLong(), parcel.readLong());
            case 3:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("PLAYLIST")) {
                    i = 1;
                } else if (string.equals("ALL_CHANNELS")) {
                    i = 2;
                } else if (string.equals("FAVORITES")) {
                    i = 3;
                } else {
                    if (!string.equals("GROUP")) {
                        throw new IllegalArgumentException("No enum constant ar.tvplayer.core.data.ChannelGroupType.".concat(string));
                    }
                    i = 4;
                }
                return new ᵎﹳ.ﹳﹳ(i, parcel.readLong(), parcel.readLong());
            case 4:
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("PLAYLIST")) {
                    i2 = 1;
                } else if (string2.equals("ALL_MOVIES")) {
                    i2 = 2;
                } else if (string2.equals("CATEGORY")) {
                    i2 = 3;
                } else if (string2.equals("HISTORY")) {
                    i2 = 4;
                } else {
                    if (!string2.equals("MY_LIST")) {
                        throw new IllegalArgumentException("No enum constant ar.tvplayer.core.data.MovieCategoryType.".concat(string2));
                    }
                    i2 = 5;
                }
                return new ʿʼ(i2, parcel.readLong(), parcel.readLong());
            case 5:
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("PLAYLIST")) {
                    i3 = 1;
                } else if (string3.equals("ALL_SERIES")) {
                    i3 = 2;
                } else if (string3.equals("CATEGORY")) {
                    i3 = 3;
                } else if (string3.equals("HISTORY")) {
                    i3 = 4;
                } else {
                    if (!string3.equals("MY_LIST")) {
                        throw new IllegalArgumentException("No enum constant ar.tvplayer.core.data.SeriesCategoryType.".concat(string3));
                    }
                    i3 = 5;
                }
                return new ٴˎ(i3, parcel.readLong(), parcel.readLong());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                int i8 = ﹳﹳ.ᵔ(parcel);
                String str2 = null;
                int i9 = 0;
                while (parcel.dataPosition() < i8) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 1) {
                        i9 = ﹳﹳ.ﹳﹶ(parcel, i10);
                    } else if (c2 != 2) {
                        ﹳﹳ.ᵔﹳ(parcel, i10);
                    } else {
                        str2 = ﹳﹳ.ˉי(parcel, i10);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i8);
                return new Scope(i9, str2);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i11 = ﹳﹳ.ᵔ(parcel);
                String str3 = null;
                PendingIntent pendingIntent = null;
                C3524 c3524 = null;
                int i12 = 0;
                while (parcel.dataPosition() < i11) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        i12 = ﹳﹳ.ﹳﹶ(parcel, i13);
                    } else if (c3 == 2) {
                        str3 = ﹳﹳ.ˉי(parcel, i13);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) ﹳﹳ.ˏᵢ(parcel, i13, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        ﹳﹳ.ᵔﹳ(parcel, i13);
                    } else {
                        c3524 = (C3524) ﹳﹳ.ˏᵢ(parcel, i13, C3524.CREATOR);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i11);
                return new Status(i12, str3, pendingIntent, c3524);
            case 8:
                return new C4233(parcel);
            case 9:
                return new C4223(parcel);
            case 10:
                return new C4432(parcel);
            case 11:
                return new C4422(parcel);
            case 12:
                return new C4430(parcel);
            case 13:
                return new C4436(parcel);
            case 14:
                return new C4423(parcel);
            case 15:
                return new C4433(parcel);
            case 16:
                return new C4425(parcel);
            case 17:
                return new C4426(parcel);
            case 18:
                return new C4435(parcel);
            case 19:
                String string4 = parcel.readString();
                string4.getClass();
                String string5 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C4428(string4, string5, AbstractC3980.m9210(strArrCreateStringArray));
            case 20:
                return new C4431(parcel);
            case 21:
                return new ᵎˏ(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
            case 22:
                return new ʻʿ(parcel.readInt() != 0);
            case 23:
                return new ˏᵢ(parcel.readString());
            case 24:
                return new ˋⁱ(parcel.readLong());
            case 25:
                return new ˎˑ(parcel.readString());
            case 26:
                int i14 = ﹳﹳ.ᵔ(parcel);
                int i15 = 0;
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (parcel.dataPosition() < i14) {
                        int i16 = parcel.readInt();
                        char c4 = (char) i16;
                        if (c4 == 1) {
                            i15 = ﹳﹳ.ﹳﹶ(parcel, i16);
                        } else if (c4 != 2) {
                            ﹳﹳ.ᵔﹳ(parcel, i16);
                        } else {
                            Parcelable.Creator<C4775> creator = C4775.CREATOR;
                            int i17 = ﹳﹳ.ـˆ(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (i17 == 0) {
                                break;
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + i17);
                        }
                    }
                    ﹳﹳ.ˏᴵ(parcel, i14);
                    return new C4752(i15, arrayListCreateTypedArrayList);
                    break;
                }
            case 27:
                int i18 = ﹳﹳ.ᵔ(parcel);
                String str4 = null;
                String str5 = null;
                long j = 0;
                long j2 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = -1;
                while (parcel.dataPosition() < i18) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            i19 = ﹳﹳ.ﹳﹶ(parcel, i24);
                            break;
                        case 2:
                            i20 = ﹳﹳ.ﹳﹶ(parcel, i24);
                            break;
                        case 3:
                            i21 = ﹳﹳ.ﹳﹶ(parcel, i24);
                            break;
                        case 4:
                            j = ﹳﹳ.ˋˉ(parcel, i24);
                            break;
                        case 5:
                            j2 = ﹳﹳ.ˋˉ(parcel, i24);
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            str4 = ﹳﹳ.ˉי(parcel, i24);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            str5 = ﹳﹳ.ˉי(parcel, i24);
                            break;
                        case '\b':
                            i22 = ﹳﹳ.ﹳﹶ(parcel, i24);
                            break;
                        case '\t':
                            i23 = ﹳﹳ.ﹳﹶ(parcel, i24);
                            break;
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i24);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i18);
                return new C4775(i19, i20, i21, j, j2, str4, str5, i22, i23);
            case 28:
                int i25 = ﹳﹳ.ᵔ(parcel);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < i25) {
                    int i29 = parcel.readInt();
                    char c5 = (char) i29;
                    if (c5 == 1) {
                        i26 = ﹳﹳ.ﹳﹶ(parcel, i29);
                    } else if (c5 == 2) {
                        z2 = ﹳﹳ.ᵢʿ(parcel, i29);
                    } else if (c5 == 3) {
                        z3 = ﹳﹳ.ᵢʿ(parcel, i29);
                    } else if (c5 == 4) {
                        i27 = ﹳﹳ.ﹳﹶ(parcel, i29);
                    } else if (c5 != 5) {
                        ﹳﹳ.ᵔﹳ(parcel, i29);
                    } else {
                        i28 = ﹳﹳ.ﹳﹶ(parcel, i29);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i25);
                return new C4757(i26, i27, i28, z2, z3);
            default:
                int i30 = ﹳﹳ.ᵔ(parcel);
                Bundle bundle = null;
                C3542[] c3542Arr = null;
                C4764 c4764 = null;
                int i31 = 0;
                while (parcel.dataPosition() < i30) {
                    int i32 = parcel.readInt();
                    char c6 = (char) i32;
                    if (c6 == 1) {
                        bundle = ﹳﹳ.ٴˎ(parcel, i32);
                    } else if (c6 == 2) {
                        c3542Arr = (C3542[]) ﹳﹳ.ˉⁱ(parcel, i32, C3542.CREATOR);
                    } else if (c6 == 3) {
                        i31 = ﹳﹳ.ﹳﹶ(parcel, i32);
                    } else if (c6 != 4) {
                        ﹳﹳ.ᵔﹳ(parcel, i32);
                    } else {
                        c4764 = (C4764) ﹳﹳ.ˏᵢ(parcel, i32, C4764.CREATOR);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i30);
                C4767 c4767 = new C4767();
                c4767.f18296 = bundle;
                c4767.f18293 = c3542Arr;
                c4767.f18294 = i31;
                c4767.f18295 = c4764;
                return c4767;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f13657) {
            case 0:
                return new C3540[i];
            case 1:
                return new ˑי[i];
            case 2:
                return new ʽᐧ[i];
            case 3:
                return new ᵎﹳ.ﹳﹳ[i];
            case 4:
                return new ʿʼ[i];
            case 5:
                return new ٴˎ[i];
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Scope[i];
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Status[i];
            case 8:
                return new C4233[i];
            case 9:
                return new C4223[i];
            case 10:
                return new C4432[i];
            case 11:
                return new C4422[i];
            case 12:
                return new C4430[i];
            case 13:
                return new C4436[i];
            case 14:
                return new C4423[i];
            case 15:
                return new C4433[i];
            case 16:
                return new C4425[i];
            case 17:
                return new C4426[i];
            case 18:
                return new C4435[i];
            case 19:
                return new C4428[i];
            case 20:
                return new C4431[i];
            case 21:
                return new ᵎˏ[i];
            case 22:
                return new ʻʿ[i];
            case 23:
                return new ˏᵢ[i];
            case 24:
                return new ˋⁱ[i];
            case 25:
                return new ˎˑ[i];
            case 26:
                return new C4752[i];
            case 27:
                return new C4775[i];
            case 28:
                return new C4757[i];
            default:
                return new C4767[i];
        }
    }
}
