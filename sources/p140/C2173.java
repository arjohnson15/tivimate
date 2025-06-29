package p140;

import p070.AbstractC1547;
import p262.InterfaceC3255;
import p331.C3761;
import p338.InterfaceC3865;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2173 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f8541;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3761 f8542;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ String f8543;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2173(C3761 c3761, String str, int i) {
        super(0);
        this.f8541 = i;
        this.f8542 = c3761;
        this.f8543 = str;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        switch (this.f8541) {
            case 0:
                InterfaceC3255 interfaceC3255Mo8011 = this.f8542.mo8011(this.f8543);
                ـﹶ.ﹳˎ(interfaceC3255Mo8011, "PRAGMA query_only = 1");
                return interfaceC3255Mo8011;
            default:
                return this.f8542.mo8011(this.f8543);
        }
    }
}
