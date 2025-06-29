package p218;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013.C1040;
import p317.C3626;
import p317.C3627;
import p407.InterfaceC4671;

/* renamed from: ˏי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2832 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f10988 = -2;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1040 f10989;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f10990;

    public C2832(C1040 c1040) {
        this.f10989 = c1040;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10988 < 0) {
            m7105();
        }
        return this.f10988 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10988 < 0) {
            m7105();
        }
        if (this.f10988 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10990;
        this.f10988 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7105() {
        Object objMo4036;
        int i = this.f10988;
        C1040 c1040 = this.f10989;
        if (i == -2) {
            objMo4036 = ((C3626) c1040.f4438).mo1053();
        } else {
            c1040.getClass();
            objMo4036 = C3627.f13873.mo4036(this.f10990);
        }
        this.f10990 = objMo4036;
        this.f10988 = objMo4036 == null ? 0 : 1;
    }
}
