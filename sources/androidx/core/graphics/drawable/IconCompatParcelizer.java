package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p287.AbstractC3393;
import p287.C3391;
import p334.C3789;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC3393 abstractC3393) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f318 = abstractC3393.m8260(iconCompat.f318, 1);
        byte[] bArr = iconCompat.f317;
        if (abstractC3393.mo8251(2)) {
            Parcel parcel = ((C3391) abstractC3393).f13231;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f317 = bArr;
        iconCompat.f321 = abstractC3393.m8261(iconCompat.f321, 3);
        iconCompat.f314 = abstractC3393.m8260(iconCompat.f314, 4);
        iconCompat.f319 = abstractC3393.m8260(iconCompat.f319, 5);
        iconCompat.f320 = (ColorStateList) abstractC3393.m8261(iconCompat.f320, 6);
        String string = iconCompat.f322;
        if (abstractC3393.mo8251(7)) {
            string = ((C3391) abstractC3393).f13231.readString();
        }
        iconCompat.f322 = string;
        String string2 = iconCompat.f315;
        if (abstractC3393.mo8251(8)) {
            string2 = ((C3391) abstractC3393).f13231.readString();
        }
        iconCompat.f315 = string2;
        iconCompat.f316 = PorterDuff.Mode.valueOf(iconCompat.f322);
        switch (iconCompat.f318) {
            case -1:
                Parcelable parcelable = iconCompat.f321;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f313 = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f321;
                if (parcelable2 != null) {
                    iconCompat.f313 = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f317;
                    iconCompat.f313 = bArr3;
                    iconCompat.f318 = 3;
                    iconCompat.f314 = 0;
                    iconCompat.f319 = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f317, Charset.forName("UTF-16"));
                iconCompat.f313 = str;
                if (iconCompat.f318 == 2 && iconCompat.f315 == null) {
                    iconCompat.f315 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f313 = iconCompat.f317;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC3393 abstractC3393) {
        abstractC3393.getClass();
        iconCompat.f322 = iconCompat.f316.name();
        switch (iconCompat.f318) {
            case -1:
                iconCompat.f321 = (Parcelable) iconCompat.f313;
                break;
            case 1:
            case 5:
                iconCompat.f321 = (Parcelable) iconCompat.f313;
                break;
            case 2:
                iconCompat.f317 = ((String) iconCompat.f313).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f317 = (byte[]) iconCompat.f313;
                break;
            case 4:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f317 = iconCompat.f313.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f318;
        if (-1 != i) {
            abstractC3393.m8255(i, 1);
        }
        byte[] bArr = iconCompat.f317;
        if (bArr != null) {
            abstractC3393.mo8253(2);
            int length = bArr.length;
            Parcel parcel = ((C3391) abstractC3393).f13231;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f321;
        if (parcelable != null) {
            abstractC3393.m8257(parcelable, 3);
        }
        int i2 = iconCompat.f314;
        if (i2 != 0) {
            abstractC3393.m8255(i2, 4);
        }
        int i3 = iconCompat.f319;
        if (i3 != 0) {
            abstractC3393.m8255(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f320;
        if (colorStateList != null) {
            abstractC3393.m8257(colorStateList, 6);
        }
        String str = iconCompat.f322;
        if (str != null) {
            abstractC3393.mo8253(7);
            ((C3391) abstractC3393).f13231.writeString(str);
        }
        String str2 = iconCompat.f315;
        if (str2 != null) {
            abstractC3393.mo8253(8);
            ((C3391) abstractC3393).f13231.writeString(str2);
        }
    }
}
