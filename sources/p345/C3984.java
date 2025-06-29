package p345;

import java.io.Serializable;
import java.util.ArrayList;
import p353.InterfaceC4012;

/* renamed from: ᵎᴵ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3984 implements InterfaceC4012, Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f15364;

    public C3984() {
        AbstractC3968.m9177(2, "expectedValuesPerKey");
        this.f15364 = 2;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        return new ArrayList(this.f15364);
    }
}
