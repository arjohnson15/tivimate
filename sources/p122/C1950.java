package p122;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1950 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1950 f7444 = new C1950();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7442 = C1787.m5530("arch");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7443 = C1787.m5530("libraryName");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7445 = C1787.m5530("buildId");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1956 c1956 = (C1956) ((AbstractC1980) obj);
        interfaceC1792.mo4589(f7442, c1956.f7468);
        interfaceC1792.mo4589(f7443, c1956.f7466);
        interfaceC1792.mo4589(f7445, c1956.f7467);
    }
}
