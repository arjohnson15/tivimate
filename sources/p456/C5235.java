package p456;

import android.os.SystemClock;
import p101.C1778;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʻٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5235 extends AbstractC5274 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f20089;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ Object f20090;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5235(int i, Object obj, InterfaceC5281 interfaceC5281) {
        super(interfaceC5281);
        this.f20089 = i;
        this.f20090 = obj;
    }

    @Override // p456.AbstractC5274
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo11643() {
        switch (this.f20089) {
            case 0:
                C1778 c1778 = (C1778) this.f20090;
                ((C5255) c1778.f6899).m11846();
                C5255 c5255 = (C5255) c1778.f6899;
                ((C5236) ((ﹳﹳ) c5255).ᐧⁱ).f20107.getClass();
                c1778.m5501(SystemClock.elapsedRealtime(), false, false);
                C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
                C5241 c5241M11651 = c5236.m11651();
                c5236.f20107.getClass();
                c5241M11651.m11694(SystemClock.elapsedRealtime());
                break;
            default:
                C5259 c5259 = (C5259) this.f20090;
                c5259.m11761();
                c5259.ˏᵢ().f20566.m4533("Starting upload from DelayedRunnable");
                c5259.f20703.m11803();
                break;
        }
    }
}
