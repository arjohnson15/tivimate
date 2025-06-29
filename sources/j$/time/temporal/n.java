package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        switch (this.a) {
            case 0:
                int iP = temporal.p(a.DAY_OF_WEEK);
                int i = this.b;
                if (iP == i) {
                    return temporal;
                }
                return temporal.e(iP - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iP2 = temporal.p(a.DAY_OF_WEEK);
                int i2 = this.b;
                if (iP2 == i2) {
                    return temporal;
                }
                return temporal.n(i2 - iP2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
