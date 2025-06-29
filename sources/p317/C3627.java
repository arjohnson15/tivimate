package p317;

import java.util.regex.Matcher;
import p070.C1554;
import p338.InterfaceC3856;

/* renamed from: ᴵ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C3627 extends C1554 implements InterfaceC3856 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final C3627 f13873 = new C3627(1, C3615.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        C3615 c3615 = (C3615) obj;
        Matcher matcher = c3615.f13859;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = c3615.f13857;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        if (matcher2.find(iEnd)) {
            return new C3615(matcher2, str);
        }
        return null;
    }
}
