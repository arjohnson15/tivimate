package p419;

import java.util.HashSet;
import java.util.Iterator;
import p117.AbstractC1841;
import p117.AbstractC1845;

/* renamed from: ﹳᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4851 extends AbstractC1841 implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashSet f18347;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f18348;

    public C4851(HashSet hashSet, byte[] bArr) {
        super(AbstractC1845.f7074);
        this.f18347 = hashSet;
        this.f18348 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.f18347).iterator();
    }

    @Override // p117.AbstractC1841
    /* renamed from: ﹳﹳ */
    public final Object mo5457() {
        return new HashSet(this.f18347);
    }
}
