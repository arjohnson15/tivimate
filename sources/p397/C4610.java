package p397;

import android.util.SparseArray;
import java.util.List;
import p166.C2430;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p260.C3222;
import p293.C3474;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;

/* renamed from: ⁱᵎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4610 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3474 f17632;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3222 f17633;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3165 f17634;

    public C4610(InterfaceC3165 interfaceC3165, C3474 c3474) {
        this.f17634 = interfaceC3165;
        this.f17632 = c3474;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
        this.f17634.mo4073();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        return this.f17634.mo4074(interfaceC3168);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) {
        return this.f17634.mo4075(interfaceC3168, c2430);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        C3222 c3222 = this.f17633;
        if (c3222 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) c3222.f12540;
                if (i >= sparseArray.size()) {
                    break;
                }
                InterfaceC4602 interfaceC4602 = ((C4604) sparseArray.valueAt(i)).f17614;
                if (interfaceC4602 != null) {
                    interfaceC4602.mo2495();
                }
                i++;
            }
        }
        this.f17634.mo4082(j, j2);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        C3222 c3222 = new C3222(interfaceC3177, this.f17632);
        this.f17633 = c3222;
        this.f17634.mo4084(c3222);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this.f17634;
    }
}
