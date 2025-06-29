package p374;

import p076.C1653;
import p166.AbstractC2394;
import p166.C2402;
import p166.C2412;
import p166.C2434;
import p383.AbstractC4464;

/* renamed from: ᵢˎ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4256 extends AbstractC4250 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f16530;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final boolean f16531;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C4281 f16532;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C2412 f16533;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C2434 f16534;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f16535;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f16536;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public C4289 f16537;

    public C4256(InterfaceC4277 interfaceC4277, boolean z) {
        super(interfaceC4277);
        this.f16531 = z && interfaceC4277.mo9712();
        this.f16534 = new C2434();
        this.f16533 = new C2412();
        AbstractC2394 abstractC2394Mo9714 = interfaceC4277.mo9714();
        if (abstractC2394Mo9714 == null) {
            this.f16537 = new C4289(new C4246(interfaceC4277.mo6119()), C2434.f9702, C4289.f16687);
        } else {
            this.f16537 = new C4289(abstractC2394Mo9714, null, null);
            this.f16535 = true;
        }
    }

    @Override // p374.AbstractC4250, p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final void mo6115(C2402 c2402) {
        if (this.f16535) {
            C4289 c4289 = this.f16537;
            this.f16537 = new C4289(new C4271(this.f16537.f16576, c2402), c4289.f16688, c4289.f16689);
        } else {
            this.f16537 = new C4289(new C4246(c2402), C2434.f9702, C4289.f16687);
        }
        this.f16503.mo6115(c2402);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m9720(long j) {
        C4281 c4281 = this.f16532;
        int iMo6469 = this.f16537.mo6469(c4281.f16623.f16693);
        if (iMo6469 == -1) {
            return false;
        }
        C4289 c4289 = this.f16537;
        C2412 c2412 = this.f16533;
        c4289.mo6180(iMo6469, c2412, false);
        long j2 = c2412.f9580;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c4281.f16625 = j;
        return true;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C4281 c4281 = (C4281) interfaceC4294;
        if (c4281.f16620 != null) {
            InterfaceC4277 interfaceC4277 = c4281.f16622;
            interfaceC4277.getClass();
            interfaceC4277.mo6116(c4281.f16620);
        }
        if (interfaceC4294 == this.f16532) {
            this.f16532 = null;
        }
    }

    @Override // p374.AbstractC4250
    /* renamed from: ˎˑ */
    public final C4290 mo9713(C4290 c4290) {
        Object obj = c4290.f16693;
        Object obj2 = this.f16537.f16689;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C4289.f16687;
        }
        return c4290.m9754(obj);
    }

    @Override // p374.AbstractC4265, p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p374.AbstractC4250
    /* renamed from: ᐧˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9706(p166.AbstractC2394 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4256.mo9706(ˊﹶ.ʻʿ):void");
    }

    @Override // p374.AbstractC4250
    /* renamed from: ᵢʿ */
    public final void mo9717() {
        if (this.f16531) {
            return;
        }
        this.f16536 = true;
        m9710();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ﹳﹶ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4281 mo6113(C4290 c4290, C1653 c1653, long j) {
        C4281 c4281 = new C4281(c4290, c1653, j);
        AbstractC4464.m10132(c4281.f16622 == null);
        c4281.f16622 = this.f16503;
        if (this.f16530) {
            Object obj = this.f16537.f16689;
            Object obj2 = c4290.f16693;
            if (obj != null && obj2.equals(C4289.f16687)) {
                obj2 = this.f16537.f16689;
            }
            c4281.m9740(c4290.m9754(obj2));
        } else {
            this.f16532 = c4281;
            if (!this.f16536) {
                this.f16536 = true;
                m9710();
            }
        }
        return c4281;
    }

    @Override // p374.AbstractC4265, p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        this.f16530 = false;
        this.f16536 = false;
        super.mo6120();
    }
}
