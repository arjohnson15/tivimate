package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p004.AbstractC0921;
import p334.C3789;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final PorterDuff.Mode f312 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f313;

    /* renamed from: ˉי, reason: contains not printable characters */
    public String f315;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f318 = -1;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public byte[] f317 = null;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Parcelable f321 = null;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f314 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f319 = 0;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ColorStateList f320 = null;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public PorterDuff.Mode f316 = f312;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public String f322 = null;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static IconCompat m198(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f317 = null;
        iconCompat.f321 = null;
        iconCompat.f319 = 0;
        iconCompat.f320 = null;
        iconCompat.f316 = f312;
        iconCompat.f322 = null;
        iconCompat.f318 = 2;
        iconCompat.f314 = i;
        iconCompat.f313 = "";
        iconCompat.f315 = "";
        return iconCompat;
    }

    public final String toString() {
        String str;
        if (this.f318 == -1) {
            return String.valueOf(this.f313);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f318) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f318) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f313).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f313).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f315);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m199())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f314);
                if (this.f319 != 0) {
                    sb.append(" off=");
                    sb.append(this.f319);
                    break;
                }
                break;
            case 4:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f313);
                break;
        }
        if (this.f320 != null) {
            sb.append(" tint=");
            sb.append(this.f320);
        }
        if (this.f316 != f312) {
            sb.append(" mode=");
            sb.append(this.f316);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m199() {
        int i;
        int i2 = this.f318;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            if (i2 == 2) {
                return this.f314;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f313;
        if (i >= 28) {
            return AbstractC0921.m3775(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return 0;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Uri m200() {
        int i;
        int i2 = this.f318;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f313;
            if (i >= 28) {
                return AbstractC0921.m3766(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                return null;
            }
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f313);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }
}
