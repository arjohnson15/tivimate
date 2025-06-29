package p393;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: ⁱˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4526 extends ByteArrayOutputStream {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4522 f17405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4526(C4522 c4522, int i) {
        super(i);
        this.f17405 = c4522;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            this.f17405.getClass();
            return new String(bArr, 0, i, AbstractC4525.f17404.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
