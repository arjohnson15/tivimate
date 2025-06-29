package p115;

import java.nio.charset.Charset;
import p418.C4780;
import p418.C4781;
import p418.C4792;
import p418.C4818;
import p418.C4821;
import p418.C4822;
import p418.EnumC4778;
import p418.EnumC4829;

/* renamed from: ˈʽ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1829 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f7051 = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4818 m5566(C4792 c4792) {
        C4781 c4781M10837 = C4818.m10837();
        int iM10751 = c4792.m10751();
        c4781M10837.m2948();
        C4818.m10836((C4818) c4781M10837.f3527, iM10751);
        for (C4780 c4780 : c4792.m10749()) {
            C4821 c4821M10845 = C4822.m10845();
            String strM10786 = c4780.m10717().m10786();
            c4821M10845.m2948();
            C4822.m10846((C4822) c4821M10845.f3527, strM10786);
            EnumC4829 enumC4829M10718 = c4780.m10718();
            c4821M10845.m2948();
            C4822.m10844((C4822) c4821M10845.f3527, enumC4829M10718);
            EnumC4778 enumC4778M10720 = c4780.m10720();
            c4821M10845.m2948();
            C4822.m10848((C4822) c4821M10845.f3527, enumC4778M10720);
            int iM10719 = c4780.m10719();
            c4821M10845.m2948();
            C4822.m10847((C4822) c4821M10845.f3527, iM10719);
            C4822 c4822 = (C4822) c4821M10845.m2947();
            c4781M10837.m2948();
            C4818.m10838((C4818) c4781M10837.f3527, c4822);
        }
        return (C4818) c4781M10837.m2947();
    }
}
