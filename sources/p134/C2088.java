package p134;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p022.InterfaceC1133;
import p166.C2418;
import p166.C2431;

/* renamed from: ˉʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2088 implements InterfaceC1133 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f8245;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2089 f8246;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f8247;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f8248;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8249;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2085[] f8250;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f8251;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f8252;

    public C2088(int i, int i2, long j, long j2, int i3, boolean z, C2089 c2089, C2085[] c2085Arr) {
        this.f8249 = i;
        this.f8245 = i2;
        this.f8251 = j;
        this.f8247 = j2;
        this.f8248 = i3;
        this.f8252 = z;
        this.f8246 = c2089;
        this.f8250 = c2085Arr;
    }

    @Override // p022.InterfaceC1133
    /* renamed from: ـﹶ */
    public final Object mo4158(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C2085 c2085 = null;
        int i = 0;
        while (i < arrayList.size()) {
            C2418 c2418 = (C2418) arrayList.get(i);
            C2085 c20852 = this.f8250[c2418.f9630];
            if (c20852 != c2085 && c2085 != null) {
                arrayList2.add(c2085.m5919((C2431[]) arrayList3.toArray(new C2431[0])));
                arrayList3.clear();
            }
            arrayList3.add(c20852.f8214[c2418.f9631]);
            i++;
            c2085 = c20852;
        }
        if (c2085 != null) {
            arrayList2.add(c2085.m5919((C2431[]) arrayList3.toArray(new C2431[0])));
        }
        C2085[] c2085Arr = (C2085[]) arrayList2.toArray(new C2085[0]);
        return new C2088(this.f8249, this.f8245, this.f8251, this.f8247, this.f8248, this.f8252, this.f8246, c2085Arr);
    }
}
