package p218;

import java.util.ArrayList;
import java.util.Iterator;
import p013.AbstractC1041;
import p013.AbstractC1052;
import p013.C1032;
import p378.C4373;
import p407.InterfaceC4671;

/* renamed from: ˏי.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2831 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Iterator f10985;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f10986;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10987;

    public C2831(C1032 c1032) {
        this.f10987 = 1;
        this.f10986 = new ArrayList();
        this.f10985 = c1032;
    }

    public C2831(C2837 c2837) {
        this.f10987 = 0;
        this.f10986 = c2837;
        this.f10985 = c2837.f10993.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10987) {
        }
        return this.f10985.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ʿ.ˉי, ᵎˈ.ˉⁱ] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10987) {
            case 0:
                return ((C2837) this.f10986).f10992.mo4036(this.f10985.next());
            default:
                Object next = this.f10985.next();
                Iterator it = (Iterator) C4373.f16880.mo4036(next);
                ArrayList arrayList = (ArrayList) this.f10986;
                if (it == null || !it.hasNext()) {
                    while (!this.f10985.hasNext() && !arrayList.isEmpty()) {
                        this.f10985 = (Iterator) AbstractC1041.m4034(arrayList);
                        AbstractC1052.m4040(arrayList);
                    }
                } else {
                    arrayList.add(this.f10985);
                    this.f10985 = it;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10987) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
