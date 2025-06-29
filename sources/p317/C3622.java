package p317;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.regex.Pattern;
import p013.C1040;
import p334.C3789;

/* renamed from: ᴵ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3622 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Pattern f13862;

    public C3622(String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3622(String str, int i) {
        int i2;
        switch (1) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 8;
                break;
            case 3:
                i2 = 16;
                break;
            case 4:
                i2 = 1;
                break;
            case 5:
                i2 = 4;
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                i2 = 32;
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                i2 = 128;
                break;
            default:
                throw null;
        }
        this(Pattern.compile(str, (i2 & 2) != 0 ? i2 | 64 : i2));
    }

    public C3622(Pattern pattern) {
        this.f13862 = pattern;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1040 m8558(C3622 c3622, String str) {
        c3622.getClass();
        if (str.length() >= 0) {
            C3626 c3626 = new C3626(c3622, str, 0);
            C3627 c3627 = C3627.f13873;
            return new C1040(c3626);
        }
        StringBuilder sbM40 = AbstractC0002.m40(0, "Start index out of bounds: ", ", input length: ");
        sbM40.append(str.length());
        throw new IndexOutOfBoundsException(sbM40.toString());
    }

    public final String toString() {
        return this.f13862.toString();
    }
}
