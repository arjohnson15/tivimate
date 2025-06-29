package p013;

import java.util.Iterator;
import p218.C2829;
import p407.InterfaceC4671;

/* renamed from: ʻי.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1046 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Iterator f4443;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f4444;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4445 = 0;

    public C1046(Iterator it) {
        this.f4443 = it;
    }

    public C1046(C2829 c2829) {
        this.f4443 = c2829.f10980.iterator();
        this.f4444 = c2829.f10979;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f4445) {
            case 0:
                return this.f4443.hasNext();
        }
        while (true) {
            int i = this.f4444;
            it = this.f4443;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f4444--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f4445) {
            case 0:
                int i = this.f4444;
                this.f4444 = i + 1;
                if (i >= 0) {
                    return new C1058(i, this.f4443.next());
                }
                AbstractC1037.m4008();
                throw null;
        }
        while (true) {
            int i2 = this.f4444;
            it = this.f4443;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f4444--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4445) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
