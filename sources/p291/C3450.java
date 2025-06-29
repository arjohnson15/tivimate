package p291;

import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import java.util.ArrayList;

/* renamed from: ٴᐧ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3450 implements InterfaceC3418 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f13364;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0104 f13365;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f13366;

    public C3450(AbstractC0104 abstractC0104, int i, int i2) {
        this.f13365 = abstractC0104;
        this.f13366 = i;
        this.f13364 = i2;
    }

    @Override // p291.InterfaceC3418
    /* renamed from: ـﹶ */
    public final boolean mo703(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0104 abstractC0104 = this.f13365;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = abstractC0104.f630;
        int i = this.f13366;
        if (abstractComponentCallbacksC0100 == null || i >= 0 || !abstractComponentCallbacksC0100.getChildFragmentManager().m649(-1, 0)) {
            return abstractC0104.m653(arrayList, arrayList2, i, this.f13364);
        }
        return false;
    }
}
