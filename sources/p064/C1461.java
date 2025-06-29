package p064;

import androidx.leanback.widget.ﾞᐧ;
import p068.AbstractC1540;
import ˈˉ.ﹳﹳ;
import ᵔʼ.ˑʽ;
import ᵔᵔ.ٴˎ;
import ﹳᴵ.ˉי;

/* renamed from: ʾᵎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1461 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1461 f5979 = new C1461(new ٴˎ(10));

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1461 f5980 = new C1461(new ٴˎ(11));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1474 f5981;

    static {
        new C1461(new ﹳﹳ(12));
        new C1461(new ˉי(11));
        new C1461(new ˉי(10));
        new C1461(new ˑʽ());
        new C1461(new ﹳﹳ(11));
    }

    public C1461(InterfaceC1464 interfaceC1464) {
        if (AbstractC1540.f6258.get()) {
            this.f5981 = new C1466(interfaceC1464, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f5981 = new C1466(interfaceC1464, 0);
        } else {
            this.f5981 = new ﾞᐧ(12, interfaceC1464);
        }
    }
}
