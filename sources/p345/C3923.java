package p345;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p080.AbstractC1702;
import p353.InterfaceC4016;

/* renamed from: ᵎᴵ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3923 extends AbstractC3986 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f15244;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f15245;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f15246;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Iterator f15247;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f15248;

    public C3923() {
        this.f15248 = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3923(Iterator it, InterfaceC4016 interfaceC4016) {
        this();
        this.f15246 = 0;
        this.f15247 = it;
        this.f15245 = interfaceC4016;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3923(C3955 c3955) {
        this();
        this.f15246 = 1;
        this.f15245 = c3955;
        this.f15247 = c3955.f15322.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f15248;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM5411 = AbstractC1702.m5411(i);
        if (iM5411 == 0) {
            return true;
        }
        if (iM5411 == 2) {
            return false;
        }
        this.f15248 = 4;
        switch (this.f15246) {
            case 0:
                do {
                    Iterator it = this.f15247;
                    if (!it.hasNext()) {
                        this.f15248 = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((InterfaceC4016) this.f15245).apply(next));
            default:
                do {
                    Iterator it2 = this.f15247;
                    if (!it2.hasNext()) {
                        this.f15248 = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((C3955) this.f15245).f15321.contains(next));
        }
        this.f15244 = next;
        if (this.f15248 == 3) {
            return false;
        }
        this.f15248 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15248 = 2;
        Object obj = this.f15244;
        this.f15244 = null;
        return obj;
    }
}
