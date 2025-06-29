package p193;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p332.C3776;
import p332.C3779;

/* renamed from: ˎˊ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2681 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2689 f10590;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f10591 = 0;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public AbstractC2690 f10592 = m6861();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3776 f10593;

    public C2681(byte[] bArr, InterfaceC2689 interfaceC2689) {
        this.f10593 = new C3776(bArr, true, C3779.f14620);
        this.f10590 = interfaceC2689;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10592 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC2690 abstractC2690 = this.f10592;
        if (abstractC2690 == null) {
            throw new NoSuchElementException();
        }
        this.f10592 = m6861();
        return abstractC2690;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC2690 m6861() {
        AbstractC2690 abstractC2690 = null;
        while (abstractC2690 == null) {
            try {
                int i = this.f10591;
                if (i == -1) {
                    break;
                }
                C3776 c3776 = this.f10593;
                c3776.f14614 = i;
                abstractC2690 = (AbstractC2690) this.f10590.mo6864(c3776);
                int i2 = (int) abstractC2690.f10599;
                if (i2 == 0) {
                    this.f10591 = -1;
                } else {
                    this.f10591 += i2;
                }
            } catch (Buffer$BufferException e) {
                throw new SMBRuntimeException(e);
            }
        }
        return abstractC2690;
    }
}
