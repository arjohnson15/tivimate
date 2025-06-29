package p122;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈי.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1923 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1923 f7312 = new C1923();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7309 = C1787.m5530("baseAddress");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7311 = C1787.m5530("size");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7313 = C1787.m5530("name");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7310 = C1787.m5530("uuid");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1904 c1904 = (C1904) ((AbstractC1936) obj);
        interfaceC1792.mo4582(f7309, c1904.f7225);
        interfaceC1792.mo4582(f7311, c1904.f7223);
        interfaceC1792.mo4589(f7313, c1904.f7224);
        String str = c1904.f7226;
        interfaceC1792.mo4589(f7310, str != null ? str.getBytes(AbstractC1920.f7288) : null);
    }
}
