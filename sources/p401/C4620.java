package p401;

import android.graphics.Color;
import android.support.v4.media.session.AbstractC0001;
import p334.C3789;
import p383.AbstractC4464;
import ᵎﹳ.ᐧʻ;

/* renamed from: ⁱﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4620 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17675;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f17676;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f17677;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f17678;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Integer f17679;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f17680;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f17681;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f17682;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f17683;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f17684;

    public C4620(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f17680 = str;
        this.f17675 = i;
        this.f17679 = num;
        this.f17683 = num2;
        this.f17676 = f;
        this.f17681 = z;
        this.f17682 = z2;
        this.f17678 = z3;
        this.f17684 = z4;
        this.f17677 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m10507(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC4464.m10127("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Integer m10508(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC4464.m10142(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC0001.m12(((j >> 24) & 255) ^ 255), AbstractC0001.m12(j & 255), AbstractC0001.m12((j >> 8) & 255), AbstractC0001.m12((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC4464.m10127("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m10509(String str) throws NumberFormatException {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        ᐧʻ.ﹳˎ("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }
}
