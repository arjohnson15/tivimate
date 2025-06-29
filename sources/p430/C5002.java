package p430;

import java.util.regex.Pattern;
import p070.AbstractC1549;

/* renamed from: ﹶˏ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5002 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18948;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String[] f18949;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18950;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f18947 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Pattern f18946 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C5002(String str, String str2, String[] strArr) {
        this.f18950 = str;
        this.f18948 = str2;
        this.f18949 = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5002) && AbstractC1549.m5138(((C5002) obj).f18950, this.f18950);
    }

    public final int hashCode() {
        return this.f18950.hashCode();
    }

    public final String toString() {
        return this.f18950;
    }
}
