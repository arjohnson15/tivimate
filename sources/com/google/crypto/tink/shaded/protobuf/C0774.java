package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.play_billing.C0654;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0774 implements InterfaceC0727 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC0777 f3633;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0751 f3634;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0758 f3635;

    public C0774(AbstractC0777 abstractC0777, C0751 c0751, AbstractC0758 abstractC0758) {
        this.f3633 = abstractC0777;
        c0751.getClass();
        this.f3634 = c0751;
        this.f3635 = abstractC0758;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ʽᐧ */
    public final boolean mo2934(Object obj) {
        this.f3634.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ʿʼ */
    public final void mo2935(Object obj, Object obj2) {
        AbstractC0734.m2996(this.f3633, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˉי */
    public final int mo2936(AbstractC0785 abstractC0785) {
        ((C0755) this.f3633).getClass();
        return abstractC0785.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˏᵢ */
    public final void mo2937(Object obj, byte[] bArr, int i, int i2, C0654 c0654) {
        AbstractC0785 abstractC0785 = (AbstractC0785) obj;
        if (abstractC0785.unknownFields == C0741.f3558) {
            abstractC0785.unknownFields = C0741.m3054();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˑʽ */
    public final Object mo2938() {
        AbstractC0758 abstractC0758 = this.f3635;
        return abstractC0758 instanceof AbstractC0785 ? ((AbstractC0785) abstractC0758).m3245() : abstractC0758.mo3168().m2945();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ـﹶ */
    public final void mo2939(Object obj) {
        this.f3633.mo3135(obj);
        this.f3634.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ٴˎ */
    public final void mo2940(Object obj, C0746 c0746, C0747 c0747) {
        this.f3633.mo3136(obj);
        this.f3634.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ᐧʻ */
    public final boolean mo2941(AbstractC0785 abstractC0785, Object obj) {
        C0755 c0755 = (C0755) this.f3633;
        c0755.getClass();
        C0741 c0741 = abstractC0785.unknownFields;
        c0755.getClass();
        return c0741.equals(((AbstractC0785) obj).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ﹳﹳ */
    public final int mo2942(AbstractC0785 abstractC0785) {
        ((C0755) this.f3633).getClass();
        C0741 c0741 = abstractC0785.unknownFields;
        int i = c0741.f3563;
        if (i != -1) {
            return i;
        }
        int iM3016 = 0;
        for (int i2 = 0; i2 < c0741.f3562; i2++) {
            int i3 = c0741.f3559[i2] >>> 3;
            AbstractC0748 abstractC0748 = (AbstractC0748) c0741.f3561[i2];
            iM3016 += C0735.m3016(3, abstractC0748) + C0735.m3029(2, i3) + (C0735.m3030(1) * 2);
        }
        c0741.f3563 = iM3016;
        return iM3016;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ﹶˆ */
    public final void mo2943(Object obj, C0756 c0756) {
        this.f3634.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }
}
