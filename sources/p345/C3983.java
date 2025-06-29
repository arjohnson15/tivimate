package p345;

import java.util.Comparator;

/* renamed from: ᵎᴵ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3983 extends AbstractC3952 {
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static AbstractC3952 m9214(int i) {
        return i < 0 ? AbstractC3952.f15313 : i > 0 ? AbstractC3952.f15314 : AbstractC3952.f15315;
    }

    @Override // p345.AbstractC3952
    /* renamed from: ʽᐧ */
    public final AbstractC3952 mo9155(Object obj, Object obj2, Comparator comparator) {
        return m9214(comparator.compare(obj, obj2));
    }

    @Override // p345.AbstractC3952
    /* renamed from: ʿʼ */
    public final int mo9156() {
        return 0;
    }

    @Override // p345.AbstractC3952
    /* renamed from: ˑʽ */
    public final AbstractC3952 mo9157(boolean z, boolean z2) {
        return m9214(z == z2 ? 0 : z ? 1 : -1);
    }

    @Override // p345.AbstractC3952
    /* renamed from: ـﹶ */
    public final AbstractC3952 mo9158(int i, int i2) {
        return m9214(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // p345.AbstractC3952
    /* renamed from: ﹳﹳ */
    public final AbstractC3952 mo9159(boolean z, boolean z2) {
        return m9214(z2 == z ? 0 : z2 ? 1 : -1);
    }
}
