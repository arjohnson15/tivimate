package p447;

import java.util.ArrayList;
import p441.AbstractC5133;
import p441.C5138;

/* renamed from: ﾞˊ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5172 extends C5171 {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public C5171[] f19840 = new C5171[4];

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public int f19841 = 0;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public void mo11514() {
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m11515(int i, ArrayList arrayList, C5138 c5138) {
        for (int i2 = 0; i2 < this.f19841; i2++) {
            C5171 c5171 = this.f19840[i2];
            ArrayList arrayList2 = c5138.f19653;
            if (!arrayList2.contains(c5171)) {
                arrayList2.add(c5171);
            }
        }
        for (int i3 = 0; i3 < this.f19841; i3++) {
            AbstractC5133.m11424(this.f19840[i3], i, arrayList, c5138);
        }
    }
}
