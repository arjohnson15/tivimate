package p192;

import java.nio.ByteBuffer;
import p250.C3126;

/* renamed from: ˎˉ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2662 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2660 f10546;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10547;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2660 f10548;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f10549 = 1;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10550;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2660 f10551;

    public C2662(C2660 c2660) {
        this.f10546 = c2660;
        this.f10548 = c2660;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6840() {
        C3126 c3126M6834 = this.f10548.f10542.m6834();
        int iM4692 = c3126M6834.m4692(6);
        return !(iM4692 == 0 || ((ByteBuffer) c3126M6834.f5491).get(iM4692 + c3126M6834.f5492) == 0) || this.f10547 == 65039;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6841() {
        this.f10549 = 1;
        this.f10548 = this.f10546;
        this.f10550 = 0;
    }
}
