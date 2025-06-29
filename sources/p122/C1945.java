package p122;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈי.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1945 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1945 f7422 = new C1945();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7419 = C1787.m5530("platform");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7421 = C1787.m5530("version");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7423 = C1787.m5530("buildVersion");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7420 = C1787.m5530("jailbroken");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1953 c1953 = (C1953) ((AbstractC1972) obj);
        interfaceC1792.mo4586(f7419, c1953.f7456);
        interfaceC1792.mo4589(f7421, c1953.f7454);
        interfaceC1792.mo4589(f7423, c1953.f7455);
        interfaceC1792.mo4588(f7420, c1953.f7457);
    }
}
