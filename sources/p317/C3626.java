package p317;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p070.AbstractC1547;
import p338.InterfaceC3865;

/* renamed from: ᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3626 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3622 f13870;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f13871;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f13872;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626(C3622 c3622, String str, int i) {
        super(0);
        this.f13870 = c3622;
        this.f13871 = str;
        this.f13872 = i;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        Pattern pattern = this.f13870.f13862;
        String str = this.f13871;
        Matcher matcher = pattern.matcher(str);
        if (matcher.find(this.f13872)) {
            return new C3615(matcher, str);
        }
        return null;
    }
}
