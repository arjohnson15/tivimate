package p379;

import java.io.IOException;
import p363.AbstractC4133;

/* renamed from: ᵢᐧ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4402 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C4413 f16958;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f16959;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ long f16960;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4402(String str, C4413 c4413, int i, long j) {
        super(str, true);
        this.f16958 = c4413;
        this.f16959 = i;
        this.f16960 = j;
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ */
    public final long mo4576() {
        C4413 c4413 = this.f16958;
        try {
            c4413.f17008.m10036(this.f16959, this.f16960);
            return -1L;
        } catch (IOException e) {
            c4413.m10022(2, 2, e);
            return -1L;
        }
    }
}
