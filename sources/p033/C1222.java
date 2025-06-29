package p033;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import p166.C2417;
import p166.C2431;
import p166.C2437;
import p166.InterfaceC2446;
import p383.InterfaceC4461;

/* renamed from: ʼᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1222 implements InterfaceC4461 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2437 f5022;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5023 = 0;

    public /* synthetic */ C1222(C1218 c1218, C2437 c2437) {
        this.f5022 = c2437;
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public final void mo4092(Object obj) {
        switch (this.f5023) {
            case 0:
                C1213 c1213 = (C1213) obj;
                ᐧʻ r0 = c1213.f4971;
                C2437 c2437 = this.f5022;
                if (r0 != null) {
                    C2431 c2431 = (C2431) r0.ˎˑ;
                    if (c2431.f9687 == -1) {
                        C2417 c2417M6541 = c2431.m6541();
                        c2417M6541.f9607 = c2437.f9724;
                        c2417M6541.f9620 = c2437.f9722;
                        c1213.f4971 = new ᐧʻ(new C2431(c2417M6541), r0.ˆʿ, (String) r0.ᐧˋ, 2);
                    }
                }
                int i = c2437.f9724;
                break;
            default:
                ((InterfaceC2446) obj).mo4340(this.f5022);
                break;
        }
    }
}
