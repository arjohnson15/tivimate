package p122;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ˈי.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1966 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1966 f7507 = new C1966();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7504 = C1787.m5530("batteryLevel");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7506 = C1787.m5530("batteryVelocity");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7510 = C1787.m5530("proximityOn");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7505 = C1787.m5530("orientation");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1787 f7508 = C1787.m5530("ramUsed");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1787 f7509 = C1787.m5530("diskUsed");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        C1979 c1979 = (C1979) ((AbstractC1985) obj);
        interfaceC1792.mo4589(f7504, c1979.f7544);
        interfaceC1792.mo4586(f7506, c1979.f7541);
        interfaceC1792.mo4588(f7510, c1979.f7543);
        interfaceC1792.mo4586(f7505, c1979.f7546);
        interfaceC1792.mo4582(f7508, c1979.f7542);
        interfaceC1792.mo4582(f7509, c1979.f7545);
    }
}
