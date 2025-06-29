package p374;

import p036.C1255;
import p353.InterfaceC4012;
import p438.C5076;
import p438.C5117;
import ᵢˈ.ˑי;

/* renamed from: ᵢˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4253 implements InterfaceC4012 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f16519;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16520;

    public /* synthetic */ C4253(int i, Object obj) {
        this.f16520 = i;
        this.f16519 = obj;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        switch (this.f16520) {
            case 0:
                try {
                    return (InterfaceC4270) ((Class) this.f16519).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (C5117) this.f16519;
            case 2:
                return (C1255) this.f16519;
            case 3:
                return (ˑי) this.f16519;
            default:
                return Boolean.valueOf(((C5076) this.f16519).f19259);
        }
    }
}
