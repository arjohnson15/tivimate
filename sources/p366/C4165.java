package p366;

import java.util.RandomAccess;
import p013.AbstractC1033;

/* renamed from: ᵔﾞ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4165 extends AbstractC1033 implements RandomAccess {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int[] f16081;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4155[] f16082;

    public C4165(C4155[] c4155Arr, int[] iArr) {
        this.f16082 = c4155Arr;
        this.f16081 = iArr;
    }

    @Override // p013.AbstractC1033, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C4155) {
            return super.contains((C4155) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f16082[i];
    }

    @Override // p013.AbstractC1033, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C4155) {
            return super.indexOf((C4155) obj);
        }
        return -1;
    }

    @Override // p013.AbstractC1033, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C4155) {
            return super.lastIndexOf((C4155) obj);
        }
        return -1;
    }

    @Override // p013.AbstractC1033
    /* renamed from: ٴˎ */
    public final int mo3982() {
        return this.f16082.length;
    }
}
