package p226;

import androidx.fragment.app.C0118;
import java.util.ListIterator;
import p013.C1056;
import p070.AbstractC1547;
import p288.C3397;
import p338.InterfaceC3865;

/* renamed from: ˑʽ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3038 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f11727;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3031 f11728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3038(C3031 c3031, int i) {
        super(0);
        this.f11727 = i;
        this.f11728 = c3031;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        C0118 c0118Previous;
        switch (this.f11727) {
            case 0:
                this.f11728.m7526();
                break;
            case 1:
                C3031 c3031 = this.f11728;
                C0118 c0118 = c3031.f11709;
                if (c0118 == null) {
                    C1056 c1056 = c3031.f11707;
                    ListIterator listIterator = c1056.listIterator(c1056.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c0118Previous = listIterator.previous();
                            if (((C0118) c0118Previous).f713) {
                            }
                        } else {
                            c0118Previous = 0;
                        }
                    }
                    c0118 = c0118Previous;
                }
                c3031.f11709 = null;
                if (c0118 != null) {
                    c0118.m746();
                }
                break;
            default:
                this.f11728.m7526();
                break;
        }
        return C3397.f13249;
    }
}
