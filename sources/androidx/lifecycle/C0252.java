package androidx.lifecycle;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0104;
import p226.AbstractActivityC3030;
import p285.InterfaceC3388;

/* renamed from: androidx.lifecycle.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0252 implements InterfaceC3388 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f1308;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1309;

    public /* synthetic */ C0252(int i, Object obj) {
        this.f1309 = i;
        this.f1308 = obj;
    }

    @Override // p285.InterfaceC3388
    /* renamed from: ـﹶ */
    public final Bundle mo629() {
        switch (this.f1309) {
            case 0:
                return C0251.m1057((C0251) this.f1308);
            case 1:
                return AbstractActivityC3030.m7522((AbstractActivityC3030) this.f1308);
            default:
                return ((AbstractC0104) this.f1308).m686();
        }
    }
}
