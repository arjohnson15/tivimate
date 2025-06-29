package p138;

import android.content.Context;
import p266.C3263;
import p411.InterfaceC4690;
import ˈˉ.ﹳﹳ;
import ᵔʼ.ˑʽ;

/* renamed from: ˉˊ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2111 implements InterfaceC4690 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3263 f8338;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f8339;

    public /* synthetic */ C2111(C3263 c3263, int i) {
        this.f8339 = i;
        this.f8338 = c3263;
    }

    @Override // p452.InterfaceC5193
    public final Object get() {
        switch (this.f8339) {
            case 0:
                return new C2116((Context) this.f8338.f12727, new ˑʽ(), new ﹳﹳ(22));
            default:
                String packageName = ((Context) this.f8338.f12727).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
