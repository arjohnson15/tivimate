package p121;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1872 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1872 f7148 = new C1872();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7144 = C1787.m5530("requestTimeMs");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7147 = C1787.m5530("requestUptimeMs");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7151 = C1787.m5530("clientInfo");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7145 = C1787.m5530("logSource");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1787 f7149 = C1787.m5530("logSourceName");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1787 f7150 = C1787.m5530("logEvent");

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1787 f7146 = C1787.m5530("qosTier");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1895 c1895 = (C1895) ((AbstractC1870) obj);
        interfaceC1792.mo4582(f7144, c1895.f7201);
        interfaceC1792.mo4582(f7147, c1895.f7198);
        interfaceC1792.mo4589(f7151, c1895.f7200);
        interfaceC1792.mo4589(f7145, c1895.f7203);
        interfaceC1792.mo4589(f7149, c1895.f7199);
        interfaceC1792.mo4589(f7150, c1895.f7202);
        interfaceC1792.mo4589(f7146, EnumC1885.f7179);
    }
}
