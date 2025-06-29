package p317;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p163.C2357;
import p407.InterfaceC4671;
import p447.AbstractC5179;

/* renamed from: ᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3614 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f13851;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f13852;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f13853;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2357 f13854;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f13855 = -1;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C3623 f13856;

    public C3614(C3623 c3623) {
        this.f13856 = c3623;
        int i = c3623.f13863;
        int length = c3623.f13865.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f13851 = i;
        this.f13853 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13855 == -1) {
            m8510();
        }
        return this.f13855 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13855 == -1) {
            m8510();
        }
        if (this.f13855 == 0) {
            throw new NoSuchElementException();
        }
        C2357 c2357 = this.f13854;
        this.f13854 = null;
        this.f13855 = -1;
        return c2357;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [ʿ.ˉי, ᵎˈ.ˑי] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8510() {
        /*
            r8 = this;
            int r0 = r8.f13853
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f13855 = r1
            r0 = 0
            r8.f13854 = r0
            goto L75
        Lb:
            ᴵ.ˑʽ r2 = r8.f13856
            int r3 = r2.f13864
            java.lang.CharSequence r4 = r2.f13865
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.f13852
            int r7 = r7 + r6
            r8.f13852 = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            ˊᵎ.ˑʽ r0 = new ˊᵎ.ˑʽ
            int r1 = r8.f13851
            int r2 = p317.AbstractC3616.m8544(r4)
            r0.<init>(r1, r2, r6)
            r8.f13854 = r0
            r8.f13853 = r5
            goto L73
        L32:
            ʿ.ˉי r0 = r2.f13866
            int r2 = r8.f13853
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo1054(r4, r2)
            ٴˑ.ʿʼ r0 = (p288.C3395) r0
            if (r0 != 0) goto L52
            ˊᵎ.ˑʽ r0 = new ˊᵎ.ˑʽ
            int r1 = r8.f13851
            int r2 = p317.AbstractC3616.m8544(r4)
            r0.<init>(r1, r2, r6)
            r8.f13854 = r0
            r8.f13853 = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f13245
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f13244
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f13851
            ˊᵎ.ˑʽ r3 = ﾞﹶ.ᵢʿ.ˎˑ(r3, r2)
            r8.f13854 = r3
            int r2 = r2 + r0
            r8.f13851 = r2
            if (r0 != 0) goto L70
            r1 = 1
        L70:
            int r2 = r2 + r1
            r8.f13853 = r2
        L73:
            r8.f13855 = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p317.C3614.m8510():void");
    }
}
