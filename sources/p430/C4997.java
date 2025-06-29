package p430;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p070.AbstractC1549;
import p126.AbstractC2019;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˏ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4997 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18903;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f18904;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f18905;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f18906;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18907;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f18908;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f18909;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f18910;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f18911;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Pattern f18899 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final Pattern f18902 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final Pattern f18900 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Pattern f18901 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C4997(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18907 = str;
        this.f18903 = str2;
        this.f18906 = j;
        this.f18910 = str3;
        this.f18904 = str4;
        this.f18908 = z;
        this.f18909 = z2;
        this.f18905 = z3;
        this.f18911 = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4997) {
            C4997 c4997 = (C4997) obj;
            if (AbstractC1549.m5138(c4997.f18907, this.f18907) && AbstractC1549.m5138(c4997.f18903, this.f18903) && c4997.f18906 == this.f18906 && AbstractC1549.m5138(c4997.f18910, this.f18910) && AbstractC1549.m5138(c4997.f18904, this.f18904) && c4997.f18908 == this.f18908 && c4997.f18909 == this.f18909 && c4997.f18905 == this.f18905 && c4997.f18911 == this.f18911) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(527, 31, this.f18907), 31, this.f18903);
        long j = this.f18906;
        return ((((((ᵎˏ.ˏʾ(ᵎˏ.ˏʾ((i + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f18910), 31, this.f18904) + (this.f18908 ? 1231 : 1237)) * 31) + (this.f18909 ? 1231 : 1237)) * 31) + (this.f18905 ? 1231 : 1237)) * 31) + (this.f18911 ? 1231 : 1237);
    }

    public final String toString() {
        return m11086(false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m11086(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18907);
        sb.append('=');
        sb.append(this.f18903);
        if (this.f18905) {
            long j = this.f18906;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) AbstractC2019.f7663.get()).format(new Date(j)));
            }
        }
        if (!this.f18911) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f18910);
        }
        sb.append("; path=");
        sb.append(this.f18904);
        if (this.f18908) {
            sb.append("; secure");
        }
        if (this.f18909) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
