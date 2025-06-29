package p379;

import java.io.IOException;
import p363.AbstractC4133;

/* renamed from: ᵢᐧ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4419 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f17046;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ int f17047;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ C4413 f17048;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ int f17049;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4419(String str, C4413 c4413, int i, int i2, int i3) {
        super(str, true);
        this.f17046 = i3;
        this.f17048 = c4413;
        this.f17049 = i;
        this.f17047 = i2;
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ */
    public final long mo4576() {
        switch (this.f17046) {
            case 0:
                int i = this.f17049;
                int i2 = this.f17047;
                C4413 c4413 = this.f17048;
                c4413.getClass();
                try {
                    c4413.f17008.m10033(i, true, i2);
                    break;
                } catch (IOException e) {
                    c4413.m10022(2, 2, e);
                    return -1L;
                }
            default:
                C4413 c44132 = this.f17048;
                try {
                    c44132.f17008.m10032(this.f17049, this.f17047);
                    break;
                } catch (IOException e2) {
                    c44132.m10022(2, 2, e2);
                    return -1L;
                }
        }
        return -1L;
    }
}
