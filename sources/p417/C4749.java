package p417;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p305.C3542;
import p334.C3789;
import p451.C5192;
import p456.C5253;
import p456.C5279;
import p456.C5290;
import p456.C5307;
import p456.C5309;
import p456.C5343;
import p456.C5345;
import ˈⁱ.ˉⁱ;
import ˈⁱ.ﹳﹳ;
import ﹳᵎ.ˑי;
import ﹶʽ.ˑʽ;
import ﹶʽ.ـﹶ;

/* renamed from: ﹳᴵ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4749 implements Parcelable.Creator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f18225;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10672(C4765 c4765, Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        int i3 = c4765.f18281;
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(i3);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(c4765.f18273);
        ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(c4765.f18276);
        ˉⁱ.ᴵʼ(parcel, 4, c4765.f18280);
        ˉⁱ.ˋˉ(parcel, 5, c4765.f18274);
        ˉⁱ.ﾞᐧ(parcel, 6, c4765.f18283, i);
        ˉⁱ.ﹳﹶ(parcel, 7, c4765.f18284);
        ˉⁱ.ـˆ(parcel, 8, c4765.f18275, i);
        ˉⁱ.ﾞᐧ(parcel, 10, c4765.f18279, i);
        ˉⁱ.ﾞᐧ(parcel, 11, c4765.f18282, i);
        ˉⁱ.ᵢٴ(parcel, 12, 4);
        parcel.writeInt(c4765.f18285 ? 1 : 0);
        ˉⁱ.ᵢٴ(parcel, 13, 4);
        parcel.writeInt(c4765.f18272);
        boolean z = c4765.f18278;
        ˉⁱ.ᵢٴ(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        ˉⁱ.ᴵʼ(parcel, 15, c4765.f18277);
        ˉⁱ.ˑⁱ(parcel, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18225) {
            case 0:
                int i = ﹳﹳ.ᵔ(parcel);
                C4757 c4757 = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean z = false;
                boolean z2 = false;
                int i2 = 0;
                while (parcel.dataPosition() < i) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            c4757 = (C4757) ﹳﹳ.ˏᵢ(parcel, i3, C4757.CREATOR);
                            break;
                        case 2:
                            z = ﹳﹳ.ᵢʿ(parcel, i3);
                            break;
                        case 3:
                            z2 = ﹳﹳ.ᵢʿ(parcel, i3);
                            break;
                        case 4:
                            int i4 = ﹳﹳ.ـˆ(parcel, i3);
                            int iDataPosition = parcel.dataPosition();
                            if (i4 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + i4);
                                break;
                            } else {
                                iArrCreateIntArray = null;
                                break;
                            }
                        case 5:
                            i2 = ﹳﹳ.ﹳﹶ(parcel, i3);
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            int i5 = ﹳﹳ.ـˆ(parcel, i3);
                            int iDataPosition2 = parcel.dataPosition();
                            if (i5 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + i5);
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                                break;
                            }
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i3);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i);
                return new C4764(c4757, z, z2, iArrCreateIntArray, i2, iArrCreateIntArray2);
            case 1:
                int i6 = ﹳﹳ.ᵔ(parcel);
                Scope[] scopeArr = C4765.f18271;
                Bundle bundle = new Bundle();
                C3542[] c3542Arr = C4765.f18270;
                C3542[] c3542Arr2 = c3542Arr;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                boolean z3 = false;
                int i10 = 0;
                boolean z4 = false;
                while (parcel.dataPosition() < i6) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            i7 = ﹳﹳ.ﹳﹶ(parcel, i11);
                            break;
                        case 2:
                            i8 = ﹳﹳ.ﹳﹶ(parcel, i11);
                            break;
                        case 3:
                            i9 = ﹳﹳ.ﹳﹶ(parcel, i11);
                            break;
                        case 4:
                            str = ﹳﹳ.ˉי(parcel, i11);
                            break;
                        case 5:
                            int i12 = ﹳﹳ.ـˆ(parcel, i11);
                            int iDataPosition3 = parcel.dataPosition();
                            if (i12 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition3 + i12);
                                iBinder = strongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) ﹳﹳ.ˉⁱ(parcel, i11, Scope.CREATOR);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = ﹳﹳ.ٴˎ(parcel, i11);
                            break;
                        case '\b':
                            account = (Account) ﹳﹳ.ˏᵢ(parcel, i11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i11);
                            break;
                        case '\n':
                            c3542Arr = (C3542[]) ﹳﹳ.ˉⁱ(parcel, i11, C3542.CREATOR);
                            break;
                        case 11:
                            c3542Arr2 = (C3542[]) ﹳﹳ.ˉⁱ(parcel, i11, C3542.CREATOR);
                            break;
                        case '\f':
                            z3 = ﹳﹳ.ᵢʿ(parcel, i11);
                            break;
                        case '\r':
                            i10 = ﹳﹳ.ﹳﹶ(parcel, i11);
                            break;
                        case 14:
                            z4 = ﹳﹳ.ᵢʿ(parcel, i11);
                            break;
                        case 15:
                            str2 = ﹳﹳ.ˉי(parcel, i11);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i6);
                return new C4765(i7, i8, i9, str, iBinder, scopeArr, bundle, account, c3542Arr, c3542Arr2, z3, i10, z4, str2);
            case 2:
                return new ˑי(parcel.readParcelable(ˑי.class.getClassLoader()));
            case 3:
                return new ـﹶ(parcel.readString());
            case 4:
                return new ˑʽ(parcel.readString());
            case 5:
                String string = parcel.readString();
                string.getClass();
                return new C5192(parcel.readInt(), string);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                int i13 = ﹳﹳ.ᵔ(parcel);
                String str3 = null;
                String str4 = null;
                C5290 c5290 = null;
                String str5 = null;
                C5343 c5343 = null;
                C5343 c53432 = null;
                C5343 c53433 = null;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                boolean z5 = false;
                while (parcel.dataPosition() < i13) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            str3 = ﹳﹳ.ˉי(parcel, i14);
                            break;
                        case 3:
                            str4 = ﹳﹳ.ˉי(parcel, i14);
                            break;
                        case 4:
                            c5290 = (C5290) ﹳﹳ.ˏᵢ(parcel, i14, C5290.CREATOR);
                            break;
                        case 5:
                            j = ﹳﹳ.ˋˉ(parcel, i14);
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            z5 = ﹳﹳ.ᵢʿ(parcel, i14);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            str5 = ﹳﹳ.ˉי(parcel, i14);
                            break;
                        case '\b':
                            c5343 = (C5343) ﹳﹳ.ˏᵢ(parcel, i14, C5343.CREATOR);
                            break;
                        case '\t':
                            j2 = ﹳﹳ.ˋˉ(parcel, i14);
                            break;
                        case '\n':
                            c53432 = (C5343) ﹳﹳ.ˏᵢ(parcel, i14, C5343.CREATOR);
                            break;
                        case 11:
                            j3 = ﹳﹳ.ˋˉ(parcel, i14);
                            break;
                        case '\f':
                            c53433 = (C5343) ﹳﹳ.ˏᵢ(parcel, i14, C5343.CREATOR);
                            break;
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i14);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i13);
                return new C5345(str3, str4, c5290, j, z5, str5, c5343, j2, c53432, j3, c53433);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i15 = ﹳﹳ.ᵔ(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < i15) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        ﹳﹳ.ᵔﹳ(parcel, i16);
                    } else {
                        bundle2 = ﹳﹳ.ٴˎ(parcel, i16);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i15);
                return new C5309(bundle2);
            case 8:
                int i17 = ﹳﹳ.ᵔ(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < i17) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        ﹳﹳ.ᵔﹳ(parcel, i18);
                    } else {
                        bundle3 = ﹳﹳ.ٴˎ(parcel, i18);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i17);
                return new C5279(bundle3);
            case 9:
                int i19 = ﹳﹳ.ᵔ(parcel);
                String str6 = null;
                C5279 c5279 = null;
                String str7 = null;
                long j4 = 0;
                while (parcel.dataPosition() < i19) {
                    int i20 = parcel.readInt();
                    char c = (char) i20;
                    if (c == 2) {
                        str6 = ﹳﹳ.ˉי(parcel, i20);
                    } else if (c == 3) {
                        c5279 = (C5279) ﹳﹳ.ˏᵢ(parcel, i20, C5279.CREATOR);
                    } else if (c == 4) {
                        str7 = ﹳﹳ.ˉי(parcel, i20);
                    } else if (c != 5) {
                        ﹳﹳ.ᵔﹳ(parcel, i20);
                    } else {
                        j4 = ﹳﹳ.ˋˉ(parcel, i20);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i19);
                return new C5343(str6, c5279, str7, j4);
            case 10:
                int i21 = ﹳﹳ.ᵔ(parcel);
                String str8 = null;
                long j5 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < i21) {
                    int i23 = parcel.readInt();
                    char c2 = (char) i23;
                    if (c2 == 1) {
                        str8 = ﹳﹳ.ˉי(parcel, i23);
                    } else if (c2 == 2) {
                        j5 = ﹳﹳ.ˋˉ(parcel, i23);
                    } else if (c2 != 3) {
                        ﹳﹳ.ᵔﹳ(parcel, i23);
                    } else {
                        i22 = ﹳﹳ.ﹳﹶ(parcel, i23);
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i21);
                return new C5307(i22, j5, str8);
            case 11:
                int i24 = ﹳﹳ.ᵔ(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = -2147483648L;
                String str19 = "";
                String str20 = str19;
                String str21 = str20;
                String str22 = str21;
                boolean z6 = true;
                boolean z7 = false;
                int i25 = 0;
                boolean z8 = true;
                boolean z9 = false;
                boolean z10 = false;
                int i26 = 100;
                int i27 = 0;
                while (parcel.dataPosition() < i24) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            str9 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 3:
                            str10 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 4:
                            str11 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 5:
                            str12 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            j6 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            j7 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case '\b':
                            str13 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case '\t':
                            z6 = ﹳﹳ.ᵢʿ(parcel, i28);
                            break;
                        case '\n':
                            z7 = ﹳﹳ.ᵢʿ(parcel, i28);
                            break;
                        case 11:
                            j13 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case '\f':
                            str14 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case '\r':
                            j8 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case 14:
                            j9 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case 15:
                            i25 = ﹳﹳ.ﹳﹶ(parcel, i28);
                            break;
                        case 16:
                            z8 = ﹳﹳ.ᵢʿ(parcel, i28);
                            break;
                        case 17:
                        case 20:
                        case '!':
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i28);
                            break;
                        case 18:
                            z9 = ﹳﹳ.ᵢʿ(parcel, i28);
                            break;
                        case 19:
                            str15 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 21:
                            int i29 = ﹳﹳ.ـˆ(parcel, i28);
                            if (i29 != 0) {
                                ﹳﹳ.ˊᵔ(parcel, i29, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case 22:
                            j10 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case 23:
                            int i30 = ﹳﹳ.ـˆ(parcel, i28);
                            int iDataPosition4 = parcel.dataPosition();
                            if (i30 != 0) {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition4 + i30);
                                arrayList = arrayListCreateStringArrayList;
                                break;
                            } else {
                                arrayList = null;
                                break;
                            }
                        case 24:
                            str16 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 25:
                            str19 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 26:
                            str20 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 27:
                            str17 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case 28:
                            z10 = ﹳﹳ.ᵢʿ(parcel, i28);
                            break;
                        case 29:
                            j11 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case 30:
                            i26 = ﹳﹳ.ﹳﹶ(parcel, i28);
                            break;
                        case 31:
                            str21 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case ' ':
                            i27 = ﹳﹳ.ﹳﹶ(parcel, i28);
                            break;
                        case '\"':
                            j12 = ﹳﹳ.ˋˉ(parcel, i28);
                            break;
                        case '#':
                            str18 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                        case '$':
                            str22 = ﹳﹳ.ˉי(parcel, i28);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i24);
                return new C5253(str9, str10, str11, str12, j6, j7, str13, z6, z7, j13, str14, j8, j9, i25, z8, z9, str15, boolValueOf, j10, arrayList, str16, str19, str20, str17, z10, j11, i26, str21, i27, j12, str18, str22);
            default:
                int i31 = ﹳﹳ.ᵔ(parcel);
                String str23 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String str24 = null;
                String str25 = null;
                Double dValueOf = null;
                long j14 = 0;
                int i32 = 0;
                while (parcel.dataPosition() < i31) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            i32 = ﹳﹳ.ﹳﹶ(parcel, i33);
                            break;
                        case 2:
                            str23 = ﹳﹳ.ˉי(parcel, i33);
                            break;
                        case 3:
                            j14 = ﹳﹳ.ˋˉ(parcel, i33);
                            break;
                        case 4:
                            int i34 = ﹳﹳ.ـˆ(parcel, i33);
                            if (i34 != 0) {
                                ﹳﹳ.ˊᵔ(parcel, i34, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                lValueOf = null;
                                break;
                            }
                        case 5:
                            int i35 = ﹳﹳ.ـˆ(parcel, i33);
                            if (i35 != 0) {
                                ﹳﹳ.ˊᵔ(parcel, i35, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            str24 = ﹳﹳ.ˉי(parcel, i33);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            str25 = ﹳﹳ.ˉי(parcel, i33);
                            break;
                        case '\b':
                            int i36 = ﹳﹳ.ـˆ(parcel, i33);
                            if (i36 != 0) {
                                ﹳﹳ.ˊᵔ(parcel, i36, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                dValueOf = null;
                                break;
                            }
                        default:
                            ﹳﹳ.ᵔﹳ(parcel, i33);
                            break;
                    }
                }
                ﹳﹳ.ˏᴵ(parcel, i31);
                return new C5290(i32, str23, j14, lValueOf, fValueOf, str24, str25, dValueOf);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f18225) {
            case 0:
                return new C4764[i];
            case 1:
                return new C4765[i];
            case 2:
                return new ˑי[i];
            case 3:
                return new ـﹶ[i];
            case 4:
                return new ˑʽ[i];
            case 5:
                return new C5192[i];
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C5345[i];
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C5309[i];
            case 8:
                return new C5279[i];
            case 9:
                return new C5343[i];
            case 10:
                return new C5307[i];
            case 11:
                return new C5253[i];
            default:
                return new C5290[i];
        }
    }
}
