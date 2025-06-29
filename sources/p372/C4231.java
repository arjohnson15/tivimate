package p372;

import android.os.SystemClock;
import java.util.List;
import p036.AbstractC1238;
import p256.InterfaceC3194;

/* renamed from: ᵢˆ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4231 extends AbstractC1238 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f16378;

    @Override // p036.InterfaceC1239
    /* renamed from: ˉⁱ */
    public final int mo4448() {
        return 0;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˋⁱ */
    public final int mo4449() {
        return this.f16378;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˎٴ */
    public final void mo4450(long j, long j2, long j3, List list, InterfaceC3194[] interfaceC3194Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo4438(this.f16378, jElapsedRealtime)) {
            for (int i = this.f5055 - 1; i >= 0; i--) {
                if (!mo4438(i, jElapsedRealtime)) {
                    this.f16378 = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˑי */
    public final Object mo4451() {
        return null;
    }
}
