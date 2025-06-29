package p029;

import p016.C1072;
import p310.C3580;

/* renamed from: ʼˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1182 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1183 f4890;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3580 f4886 = new C3580();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String f4888 = m4235("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String f4889 = m4235("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1072 f4887 = new C1072(6);

    public C1182(C1183 c1183) {
        this.f4890 = c1183;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m4235(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
