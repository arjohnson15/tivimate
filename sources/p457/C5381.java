package p457;

import java.util.LinkedHashSet;
import java.util.UUID;
import p065.AbstractC1524;
import p331.C3768;

/* renamed from: ﾞﹶ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5381 extends AbstractC1524 {
    @Override // p065.AbstractC1524
    /* renamed from: ˏᵢ */
    public final AbstractC1524 mo5106() {
        return this;
    }

    @Override // p065.AbstractC1524
    /* renamed from: ˑʽ */
    public final AbstractC5388 mo5107() {
        C3768 c3768 = (C3768) this.f6193;
        if (c3768.f14580) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new C5360((UUID) this.f6195, c3768, (LinkedHashSet) this.f6194);
    }
}
