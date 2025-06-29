package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import p447.AbstractC5179;

/* renamed from: androidx.datastore.preferences.protobuf.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0056 implements Iterable, Serializable {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0056 f467 = new C0056(AbstractC0077.f504);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0053 f468;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f469;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f470 = 0;

    static {
        f468 = AbstractC0043.m472() ? new C0053(1) : new C0053(0);
    }

    public C0056(byte[] bArr) {
        bArr.getClass();
        this.f469 = bArr;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C0056 m484(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException(AbstractC5179.m11548(i, "Beginning index: ", " < 0"));
            }
            if (i3 < i) {
                throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i3, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i3, length, "End index: ", " >= "));
        }
        switch (f468.f464) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new C0056(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0056) || size() != ((C0056) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0056)) {
            return obj.equals(this);
        }
        C0056 c0056 = (C0056) obj;
        int i = this.f470;
        int i2 = c0056.f470;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0056.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0056.size()) {
            StringBuilder sbM40 = AbstractC0002.m40(size, "Ran off end of other: 0, ", ", ");
            sbM40.append(c0056.size());
            throw new IllegalArgumentException(sbM40.toString());
        }
        int iM485 = m485() + size;
        int iM4852 = m485();
        int iM4853 = c0056.m485();
        while (iM4852 < iM485) {
            if (this.f469[iM4852] != c0056.f469[iM4853]) {
                return false;
            }
            iM4852++;
            iM4853++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f470;
        if (i == 0) {
            int size = size();
            int iM485 = m485();
            int i2 = size;
            for (int i3 = iM485; i3 < iM485 + size; i3++) {
                i2 = (i2 * 31) + this.f469[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f470 = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0016(this);
    }

    public int size() {
        return this.f469.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m485() {
        return 0;
    }
}
