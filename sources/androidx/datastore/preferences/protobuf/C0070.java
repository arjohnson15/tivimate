package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0070 implements InterfaceC0025 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC0055 f492;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0041 f493;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0083 f494;

    public C0070(AbstractC0055 abstractC0055, C0041 c0041, AbstractC0083 abstractC0083) {
        this.f492 = abstractC0055;
        c0041.getClass();
        this.f493 = c0041;
        this.f494 = abstractC0083;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ʽᐧ */
    public final boolean mo299(Object obj) {
        this.f493.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ʿʼ */
    public final void mo300(Object obj, C0030 c0030) {
        this.f493.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ˏᵢ */
    public final int mo301(AbstractC0052 abstractC0052) {
        ((C0067) this.f492).getClass();
        C0051 c0051 = ((AbstractC0083) abstractC0052).unknownFields;
        int i = c0051.f463;
        if (i != -1) {
            return i;
        }
        int iM404 = 0;
        for (int i2 = 0; i2 < c0051.f462; i2++) {
            int i3 = c0051.f459[i2] >>> 3;
            C0056 c0056 = (C0056) c0051.f461[i2];
            iM404 += C0040.m404(3, c0056) + C0040.m409(2, i3) + (C0040.m401(1) * 2);
        }
        c0051.f463 = iM404;
        return iM404;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ˑʽ */
    public final Object mo302() {
        return ((AbstractC0018) this.f494.mo581(5)).m282();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ـﹶ */
    public final void mo303(Object obj) {
        ((C0067) this.f492).getClass();
        ((AbstractC0083) obj).unknownFields.f460 = false;
        this.f493.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ٴˎ */
    public final int mo304(AbstractC0083 abstractC0083) {
        ((C0067) this.f492).getClass();
        return abstractC0083.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ᐧʻ */
    public final boolean mo305(AbstractC0083 abstractC0083, Object obj) {
        C0067 c0067 = (C0067) this.f492;
        c0067.getClass();
        C0051 c0051 = abstractC0083.unknownFields;
        c0067.getClass();
        return c0051.equals(((AbstractC0083) obj).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ﹳﹳ */
    public final void mo306(Object obj, InterfaceC0017 interfaceC0017, C0062 c0062) {
        ((C0067) this.f492).getClass();
        AbstractC0083 abstractC0083 = (AbstractC0083) obj;
        if (abstractC0083.unknownFields == C0051.f458) {
            abstractC0083.unknownFields = C0051.m475();
        }
        this.f493.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ﹶˆ */
    public final void mo307(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832) {
        AbstractC0074.m544(this.f492, abstractC0083, abstractC00832);
    }
}
