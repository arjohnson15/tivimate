package p419;

import java.util.ArrayList;
import java.util.Iterator;
import p117.AbstractC1841;
import p117.AbstractC1845;

/* renamed from: ﹳᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4853 extends AbstractC1841 implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f18353;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f18354;

    public C4853(ArrayList arrayList) {
        super(AbstractC1845.f7075);
        this.f18353 = arrayList;
    }

    public C4853(ArrayList arrayList, byte[] bArr) {
        super(AbstractC1845.f7075);
        this.f18353 = arrayList;
        this.f18354 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f18353).iterator();
    }

    @Override // p117.AbstractC1841
    /* renamed from: ﹳﹳ */
    public final Object mo5457() {
        return new ArrayList(this.f18353);
    }
}
