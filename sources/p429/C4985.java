package p429;

import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;

/* renamed from: ﹶˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4985 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4985 f18829 = new C4985();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f18826 = C1787.m5530("appId");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f18828 = C1787.m5530("deviceModel");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f18832 = C1787.m5530("sessionSdkVersion");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f18827 = C1787.m5530("osVersion");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1787 f18830 = C1787.m5530("logEnvironment");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1787 f18831 = C1787.m5530("androidAppInfo");

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        C4945 c4945 = (C4945) obj;
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        interfaceC1792.mo4589(f18826, c4945.f18705);
        interfaceC1792.mo4589(f18828, c4945.f18703);
        interfaceC1792.mo4589(f18832, "2.0.3");
        interfaceC1792.mo4589(f18827, c4945.f18704);
        interfaceC1792.mo4589(f18830, EnumC4958.f18747);
        interfaceC1792.mo4589(f18831, c4945.f18706);
    }
}
