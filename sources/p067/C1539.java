package p067;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import p013.AbstractC1033;
import p013.AbstractC1036;

/* renamed from: ʾﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1539 extends AbstractC1033 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Enum[] f6257;

    public C1539(Enum[] enumArr) {
        this.f6257 = enumArr;
    }

    @Override // p013.AbstractC1033, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) AbstractC1036.m4000(r4.ordinal(), this.f6257)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f6257;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // p013.AbstractC1033, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) AbstractC1036.m4000(iOrdinal, this.f6257)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p013.AbstractC1033, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // p013.AbstractC1033
    /* renamed from: ٴˎ */
    public final int mo3982() {
        return this.f6257.length;
    }
}
