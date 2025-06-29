package p372;

import java.util.List;
import p256.AbstractC3190;
import p324.AbstractC3713;

/* renamed from: ᵢˆ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4230 extends AbstractC3190 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f16376;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final List f16377;

    public C4230(long j, List list) {
        super(0L, list.size() - 1);
        this.f16376 = j;
        this.f16377 = list;
    }

    @Override // p256.InterfaceC3194
    /* renamed from: ˎٴ */
    public final long mo7665() {
        m7890();
        return this.f16376 + ((AbstractC3713) this.f16377.get((int) this.f12388)).f14332;
    }

    @Override // p256.InterfaceC3194
    /* renamed from: ـﹶ */
    public final long mo7666() {
        m7890();
        AbstractC3713 abstractC3713 = (AbstractC3713) this.f16377.get((int) this.f12388);
        return this.f16376 + abstractC3713.f14332 + abstractC3713.f14334;
    }
}
