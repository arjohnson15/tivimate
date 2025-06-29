package p013;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p407.InterfaceC4671;

/* renamed from: ʻי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1032 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f4433;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f4434;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4435;

    public /* synthetic */ C1032(int i, Object obj) {
        this.f4435 = i;
        this.f4434 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4435) {
            case 0:
                if (this.f4433 < ((AbstractC1033) this.f4434).mo3982()) {
                }
                break;
            case 1:
                if (this.f4433 < ((Object[]) this.f4434).length) {
                }
                break;
            case 2:
                if (this.f4433 < ((LongSparseArray) this.f4434).size()) {
                }
                break;
            default:
                if (this.f4433 < ((ViewGroup) this.f4434).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4435) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f4433;
                this.f4433 = i + 1;
                return ((AbstractC1033) this.f4434).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f4434;
                    int i2 = this.f4433;
                    this.f4433 = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4433--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i3 = this.f4433;
                this.f4433 = i3 + 1;
                return Long.valueOf(((LongSparseArray) this.f4434).keyAt(i3));
            default:
                int i4 = this.f4433;
                this.f4433 = i4 + 1;
                View childAt = ((ViewGroup) this.f4434).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4435) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f4433 - 1;
                this.f4433 = i;
                ((ViewGroup) this.f4434).removeViewAt(i);
                return;
        }
    }
}
