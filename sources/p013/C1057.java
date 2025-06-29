package p013;

import androidx.lifecycle.C0248;
import java.util.Iterator;
import p317.C3614;
import p317.C3623;
import p407.InterfaceC4671;

/* renamed from: ʻי.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1057 implements Iterable, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f4457;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4458;

    public /* synthetic */ C1057(int i, Object obj) {
        this.f4458 = i;
        this.f4457 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4458) {
            case 0:
                return new C1046(((Iterable) ((C0248) this.f4457).f1299).iterator());
            default:
                return new C3614((C3623) this.f4457);
        }
    }
}
