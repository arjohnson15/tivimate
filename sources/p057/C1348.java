package p057;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p407.InterfaceC4671;

/* renamed from: ʾˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1348 extends AbstractC1346 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f5507;

    public C1348(C1347 c1347, int i) {
        this.f5507 = i;
        this.f5491 = c1347;
        this.f5489 = -1;
        this.f5490 = c1347.f5497;
        m4693();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5507) {
            case 0:
                m4688();
                int i = this.f5492;
                C1347 c1347 = (C1347) this.f5491;
                if (i >= c1347.f5504) {
                    throw new NoSuchElementException();
                }
                this.f5492 = i + 1;
                this.f5489 = i;
                C1341 c1341 = new C1341(c1347, i);
                m4693();
                return c1341;
            case 1:
                m4688();
                int i2 = this.f5492;
                C1347 c13472 = (C1347) this.f5491;
                if (i2 >= c13472.f5504) {
                    throw new NoSuchElementException();
                }
                this.f5492 = i2 + 1;
                this.f5489 = i2;
                Object obj = c13472.f5502[i2];
                m4693();
                return obj;
            default:
                m4688();
                int i3 = this.f5492;
                C1347 c13473 = (C1347) this.f5491;
                if (i3 >= c13473.f5504) {
                    throw new NoSuchElementException();
                }
                this.f5492 = i3 + 1;
                this.f5489 = i3;
                Object obj2 = c13473.f5495[i3];
                m4693();
                return obj2;
        }
    }
}
