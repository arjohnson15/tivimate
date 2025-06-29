package p317;

import p070.AbstractC1547;
import p163.C2357;
import p338.InterfaceC3856;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3620 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f13860;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f13861;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3620(String str, int i) {
        super(1);
        this.f13860 = i;
        this.f13861 = str;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        switch (this.f13860) {
            case 0:
                String str = (String) obj;
                boolean zM8523 = AbstractC3616.m8523(str);
                String str2 = this.f13861;
                return zM8523 ? str.length() < str2.length() ? str2 : str : ᐧʻ.ˉⁱ(str2, str);
            default:
                C2357 c2357 = (C2357) obj;
                return this.f13861.subSequence(c2357.f9332, c2357.f9330 + 1).toString();
        }
    }
}
