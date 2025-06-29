package p013;

import java.util.Iterator;
import p218.C2832;
import p218.InterfaceC2836;
import p317.C3626;
import p317.C3627;

/* renamed from: ʻי.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1040 implements InterfaceC2836 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f4438;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4439;

    public /* synthetic */ C1040(int i, Object obj) {
        this.f4439 = i;
        this.f4438 = obj;
    }

    public C1040(C3626 c3626) {
        this.f4439 = 1;
        C3627 c3627 = C3627.f13873;
        this.f4438 = c3626;
    }

    @Override // p218.InterfaceC2836
    public final Iterator iterator() {
        switch (this.f4439) {
            case 0:
                return ((Iterable) this.f4438).iterator();
            case 1:
                return new C2832(this);
            default:
                return (Iterator) this.f4438;
        }
    }
}
