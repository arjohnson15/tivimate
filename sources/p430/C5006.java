package p430;

import java.util.concurrent.TimeUnit;

/* renamed from: ﹶˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5006 {

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f18983 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f18984;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f18985;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean f18986;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean f18987;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public String f18988;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean f18989;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f18990;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f18991;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f18992;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f18993;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f18994;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f18995;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f18996;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public C5006(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f18992 = z;
        this.f18984 = z2;
        this.f18991 = i;
        this.f18995 = i2;
        this.f18985 = z3;
        this.f18993 = z4;
        this.f18994 = z5;
        this.f18990 = i3;
        this.f18996 = i4;
        this.f18986 = z6;
        this.f18989 = z7;
        this.f18987 = z8;
        this.f18988 = str;
    }

    public final String toString() {
        String str = this.f18988;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18992) {
            sb.append("no-cache, ");
        }
        if (this.f18984) {
            sb.append("no-store, ");
        }
        int i = this.f18991;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f18995;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f18985) {
            sb.append("private, ");
        }
        if (this.f18993) {
            sb.append("public, ");
        }
        if (this.f18994) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f18990;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f18996;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f18986) {
            sb.append("only-if-cached, ");
        }
        if (this.f18989) {
            sb.append("no-transform, ");
        }
        if (this.f18987) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.f18988 = string;
        return string;
    }
}
