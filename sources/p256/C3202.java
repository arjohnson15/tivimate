package p256;

import android.util.SparseArray;
import p166.C2428;
import p166.C2430;
import p166.C2431;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p293.C3474;
import p331.C3759;
import p383.AbstractC4464;

/* renamed from: יᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3202 implements InterfaceC3177, InterfaceC3199 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final C2428 f12453;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C2430 f12454;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f12455;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f12456;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC3157 f12457;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2431 f12458;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C2431[] f12459;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final SparseArray f12460 = new SparseArray();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3165 f12461;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C3759 f12462;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f12463;

    static {
        C2428 c2428 = new C2428();
        c2428.f9649 = new C3474(8);
        f12453 = c2428;
        f12454 = new C2430();
    }

    public C3202(InterfaceC3165 interfaceC3165, int i, C2431 c2431) {
        this.f12461 = interfaceC3165;
        this.f12455 = i;
        this.f12458 = c2431;
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ */
    public final void mo4850() {
        SparseArray sparseArray = this.f12460;
        C2431[] c2431Arr = new C2431[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C2431 c2431 = ((C3197) sparseArray.valueAt(i)).f12439;
            AbstractC4464.m10146(c2431);
            c2431Arr[i] = c2431;
        }
        this.f12459 = c2431Arr;
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ */
    public final InterfaceC3178 mo4851(int i, int i2) {
        SparseArray sparseArray = this.f12460;
        C3197 c3197 = (C3197) sparseArray.get(i);
        if (c3197 == null) {
            AbstractC4464.m10132(this.f12459 == null);
            c3197 = new C3197(i, i2, i2 == this.f12455 ? this.f12458 : null);
            C3759 c3759 = this.f12462;
            long j = this.f12463;
            if (c3759 == null) {
                c3197.f12435 = c3197.f12436;
            } else {
                c3197.f12438 = j;
                InterfaceC3178 interfaceC3178M8747 = c3759.m8747(i2);
                c3197.f12435 = interfaceC3178M8747;
                C2431 c2431 = c3197.f12439;
                if (c2431 != null) {
                    interfaceC3178M8747.mo7840(c2431);
                }
            }
            sparseArray.put(i, c3197);
        }
        return c3197;
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ */
    public final void mo4858(InterfaceC3157 interfaceC3157) {
        this.f12457 = interfaceC3157;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7905(C3759 c3759, long j, long j2) {
        this.f12462 = c3759;
        this.f12463 = j2;
        boolean z = this.f12456;
        InterfaceC3165 interfaceC3165 = this.f12461;
        if (!z) {
            interfaceC3165.mo4084(this);
            if (j != -9223372036854775807L) {
                interfaceC3165.mo4082(0L, j);
            }
            this.f12456 = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC3165.mo4082(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f12460;
            if (i >= sparseArray.size()) {
                return;
            }
            C3197 c3197 = (C3197) sparseArray.valueAt(i);
            if (c3759 == null) {
                c3197.f12435 = c3197.f12436;
            } else {
                c3197.f12438 = j2;
                InterfaceC3178 interfaceC3178M8747 = c3759.m8747(c3197.f12437);
                c3197.f12435 = interfaceC3178M8747;
                C2431 c2431 = c3197.f12439;
                if (c2431 != null) {
                    interfaceC3178M8747.mo7840(c2431);
                }
            }
            i++;
        }
    }
}
