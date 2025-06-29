package p013;

import android.support.v4.media.session.AbstractC0002;
import java.util.RandomAccess;
import ˎˊ.ˆʿ;

/* renamed from: ʻי.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1055 extends AbstractC1033 implements RandomAccess {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f4450;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f4451;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC1033 f4452;

    public C1055(AbstractC1033 abstractC1033, int i, int i2) {
        this.f4452 = abstractC1033;
        this.f4450 = i;
        ˆʿ.ˑʽ(i, i2, abstractC1033.mo3982());
        this.f4451 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4451;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return this.f4452.get(this.f4450 + i);
    }

    @Override // p013.AbstractC1033
    /* renamed from: ٴˎ */
    public final int mo3982() {
        return this.f4451;
    }
}
