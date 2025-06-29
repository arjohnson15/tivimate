package p428;

import java.io.IOException;
import p036.C1259;
import p136.C2098;
import ˉˆ.ﹳﹳ;

/* renamed from: ﹶˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4941 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f18689 = null;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f18690 = null;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﹳﹳ f18691;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C2098 f18688 = new C2098(2);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1259 f18687 = new C1259(20);

    public C4941(ﹳﹳ r2) {
        this.f18691 = r2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m11065(ﹳﹳ r1, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            r1.ﹳﹳ(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
        }
    }
}
