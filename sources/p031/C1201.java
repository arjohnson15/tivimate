package p031;

import p016.C1072;
import p450.InterfaceC5190;
import p450.InterfaceC5191;

/* renamed from: ʼـ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1201 implements InterfaceC5190 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1072 f4943 = new C1072(7);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1198 f4944 = new C1198(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public volatile InterfaceC5190 f4945;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC5191 f4946;

    public C1201(C1072 c1072, InterfaceC5190 interfaceC5190) {
        this.f4946 = c1072;
        this.f4945 = interfaceC5190;
    }

    @Override // p450.InterfaceC5190
    public final Object get() {
        return this.f4945.get();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4253(InterfaceC5191 interfaceC5191) {
        InterfaceC5190 interfaceC5190;
        InterfaceC5190 interfaceC51902;
        InterfaceC5190 interfaceC51903 = this.f4945;
        C1198 c1198 = f4944;
        if (interfaceC51903 != c1198) {
            interfaceC5191.mo4097(interfaceC51903);
            return;
        }
        synchronized (this) {
            interfaceC5190 = this.f4945;
            if (interfaceC5190 != c1198) {
                interfaceC51902 = interfaceC5190;
            } else {
                this.f4946 = new C1195(this.f4946, 0, interfaceC5191);
                interfaceC51902 = null;
            }
        }
        if (interfaceC51902 != null) {
            interfaceC5191.mo4097(interfaceC5190);
        }
    }
}
