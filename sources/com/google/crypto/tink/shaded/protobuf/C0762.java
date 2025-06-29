package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0002;
import androidx.datastore.preferences.protobuf.C0016;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0762 extends AbstractC0748 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final byte[] f3602;

    public C0762(byte[] bArr) {
        this.f3594 = 0;
        bArr.getClass();
        this.f3602 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0748) || size() != ((AbstractC0748) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0762)) {
            return obj.equals(this);
        }
        C0762 c0762 = (C0762) obj;
        int i = this.f3594;
        int i2 = c0762.f3594;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0762.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0762.size()) {
            StringBuilder sbM40 = AbstractC0002.m40(size, "Ran off end of other: 0, ", ", ");
            sbM40.append(c0762.size());
            throw new IllegalArgumentException(sbM40.toString());
        }
        int iMo3169 = mo3169() + size;
        int iMo31692 = mo3169();
        int iMo31693 = c0762.mo3169();
        while (iMo31692 < iMo3169) {
            if (this.f3602[iMo31692] != c0762.f3602[iMo31693]) {
                return false;
            }
            iMo31692++;
            iMo31693++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0016(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0748
    public int size() {
        return this.f3602.length;
    }

    /* renamed from: ˉⁱ */
    public int mo3169() {
        return 0;
    }

    /* renamed from: ˏᴵ */
    public byte mo3170(int i) {
        return this.f3602[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0748
    /* renamed from: ﹳﹳ */
    public byte mo3131(int i) {
        return this.f3602[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0748
    /* renamed from: ﹶˆ */
    public void mo3132(int i, byte[] bArr) {
        System.arraycopy(this.f3602, 0, bArr, 0, i);
    }
}
