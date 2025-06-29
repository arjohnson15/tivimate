package p091;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p456.C5279;

/* renamed from: ʿﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1753 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f6785;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6786 = 0;

    public C1753(C1751 c1751) {
        this.f6785 = c1751;
    }

    public C1753(C5279 c5279) {
        this.f6785 = c5279.f20460.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6786) {
            case 0:
                try {
                    return ((C1751) this.f6785).available() > 0;
                } catch (IOException unused) {
                    return false;
                }
            default:
                return ((Iterator) this.f6785).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6786) {
            case 0:
                try {
                    return ((C1751) this.f6785).m5467();
                } catch (Exception e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                return (String) ((Iterator) this.f6785).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6786) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
