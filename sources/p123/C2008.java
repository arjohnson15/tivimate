package p123;

import androidx.leanback.widget.ʿˏ;
import java.util.Set;
import p183.C2531;
import p183.InterfaceC2532;
import p183.InterfaceC2536;

/* renamed from: ˈـ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2008 implements InterfaceC2532 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1995 f7636;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1998 f7637;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Set f7638;

    public C2008(Set set, C1995 c1995, C1998 c1998) {
        this.f7638 = set;
        this.f7636 = c1995;
        this.f7637 = c1998;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ʿˏ m5652(String str, C2531 c2531, InterfaceC2536 interfaceC2536) {
        Set set = this.f7638;
        if (set.contains(c2531)) {
            return new ʿˏ(this.f7636, str, c2531, interfaceC2536, this.f7637);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2531, set));
    }
}
