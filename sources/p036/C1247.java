package p036;

import p166.C2433;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼﹶ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1247 extends AbstractC1256 implements Comparable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f5108;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f5109;

    public C1247(int i, C2433 c2433, int i2, C1245 c1245, int i3) {
        super(i, c2433, i2);
        this.f5108 = ᐧʻ.ˏᵢ(i3, c1245.f5093) ? 1 : 0;
        this.f5109 = this.f5160.m6539();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5109, ((C1247) obj).f5109);
    }

    @Override // p036.AbstractC1256
    /* renamed from: ʽᐧ */
    public final /* bridge */ /* synthetic */ boolean mo4469(AbstractC1256 abstractC1256) {
        return false;
    }

    @Override // p036.AbstractC1256
    /* renamed from: ـﹶ */
    public final int mo4470() {
        return this.f5108;
    }
}
