package p135;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p123.InterfaceC1996;
import p183.C2531;
import p278.AbstractC3362;

/* renamed from: ˉʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2094 implements InterfaceC1996 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C2094 f8273;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String f8274;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C2094 f8275;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Set f8276;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8277;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8278;

    static {
        String strM8217 = AbstractC3362.m8217("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8274 = strM8217;
        String strM82172 = AbstractC3362.m8217("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM82173 = AbstractC3362.m8217("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8276 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new C2531("proto"), new C2531("json"))));
        f8273 = new C2094(strM8217, null);
        f8275 = new C2094(strM82172, strM82173);
    }

    public C2094(String str, String str2) {
        this.f8278 = str;
        this.f8277 = str2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2094 m5940(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2094(str2, str3);
    }
}
