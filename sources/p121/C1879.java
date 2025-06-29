package p121;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1879 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1879 f7170 = new C1879();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7168 = C1787.m5530("networkType");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7169 = C1787.m5530("mobileSubtype");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1875 c1875 = (C1875) ((AbstractC1874) obj);
        interfaceC1792.mo4589(f7168, c1875.f7165);
        interfaceC1792.mo4589(f7169, c1875.f7164);
    }
}
