package p122;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈי.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1981 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1981 f7550 = new C1981();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7547 = C1787.m5530("timestamp");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7549 = C1787.m5530("type");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7553 = C1787.m5530("app");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7548 = C1787.m5530("device");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1787 f7551 = C1787.m5530("log");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1787 f7552 = C1787.m5530("rollouts");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1976 c1976 = (C1976) ((AbstractC1962) obj);
        interfaceC1792.mo4582(f7547, c1976.f7538);
        interfaceC1792.mo4589(f7549, c1976.f7535);
        interfaceC1792.mo4589(f7553, c1976.f7537);
        interfaceC1792.mo4589(f7548, c1976.f7540);
        interfaceC1792.mo4589(f7551, c1976.f7536);
        interfaceC1792.mo4589(f7552, c1976.f7539);
    }
}
