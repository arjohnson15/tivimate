package p200;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p407.InterfaceC4671;

/* renamed from: ˎٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2751 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f10758;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f10759;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f10760;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f10761;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f10762;

    public C2751(int i) {
        this.f10762 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2751(C2741 c2741, int i) {
        this(c2741.f10778);
        this.f10761 = i;
        switch (i) {
            case 1:
                this.f10759 = c2741;
                this(c2741.f10778);
                break;
            default:
                this.f10759 = c2741;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2751(C2752 c2752) {
        this(c2752.f10764);
        this.f10761 = 2;
        this.f10759 = c2752;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10758 < this.f10762;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM7021;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f10758;
        switch (this.f10761) {
            case 0:
                objM7021 = ((C2741) this.f10759).m7021(i);
                break;
            case 1:
                objM7021 = ((C2741) this.f10759).m7016(i);
                break;
            default:
                objM7021 = ((C2752) this.f10759).f10763[i];
                break;
        }
        this.f10758++;
        this.f10760 = true;
        return objM7021;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10760) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f10758 - 1;
        this.f10758 = i;
        switch (this.f10761) {
            case 0:
                ((C2741) this.f10759).mo7022(i);
                break;
            case 1:
                ((C2741) this.f10759).mo7022(i);
                break;
            default:
                ((C2752) this.f10759).m7001(i);
                break;
        }
        this.f10762--;
        this.f10760 = false;
    }
}
