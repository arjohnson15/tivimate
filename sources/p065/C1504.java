package p065;

import p072.C1602;
import p252.AbstractC3139;
import p262.InterfaceC3255;
import p288.C3397;
import p289.AbstractC3407;
import p330.C3748;
import p338.InterfaceC3856;
import ʼʽ.ʿʼ;
import ˊﹶ.ˋˉ;

/* renamed from: ʾᵔ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1504 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f6106;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6107;

    public /* synthetic */ C1504(int i, Object obj) {
        this.f6107 = i;
        this.f6106 = obj;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        switch (this.f6107) {
            case 0:
                try {
                    return ((InterfaceC3856) this.f6106).mo4036((InterfaceC3255) obj);
                } catch (Exception unused) {
                    AbstractC3407.f13261.ᴵʼ("SafeRoomLiveData");
                    ˋˉ.ˑﾞ(new Object[0]);
                    return null;
                }
            case 1:
                ʿʼ r3 = (ʿʼ) obj;
                C3748 c3748 = (C3748) this.f6106;
                boolean z = AbstractC3139.f12115;
                try {
                    c3748.mo3974(r3);
                } catch (Exception unused2) {
                }
                return C3397.f13249;
            default:
                C3397 c3397 = C3397.f13249;
                ((C1602) this.f6106).mo3974(c3397);
                return c3397;
        }
    }
}
