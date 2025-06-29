package p139;

import java.util.ArrayList;

/* renamed from: ˉˋ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2129 extends AbstractC2159 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8378;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C2148 f8379;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f8380;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f8381;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8382;

    public C2129(C2148 c2148, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f8379 = c2148;
        this.f8381 = obj;
        this.f8378 = arrayList;
        this.f8380 = obj2;
        this.f8382 = arrayList2;
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        abstractC2160.mo6019(this);
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ﹳﹳ */
    public final void mo5994(AbstractC2160 abstractC2160) {
        C2148 c2148 = this.f8379;
        Object obj = this.f8381;
        if (obj != null) {
            c2148.m6062(obj, this.f8378, null);
        }
        Object obj2 = this.f8380;
        if (obj2 != null) {
            c2148.m6062(obj2, this.f8382, null);
        }
    }
}
