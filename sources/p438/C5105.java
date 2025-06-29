package p438;

import android.content.SharedPreferences;
import android.os.SystemClock;
import p166.C2441;
import p383.AbstractC4470;
import p383.C4460;
import p417.AbstractC4753;
import p456.C5280;

/* renamed from: ﹶﾞ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5105 implements InterfaceC5111 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f19431;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f19432;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f19433;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f19434;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f19435;

    public C5105(C4460 c4460) {
        this.f19434 = c4460;
        this.f19432 = C2441.f9727;
    }

    public C5105(C5280 c5280, String str, long j) {
        this.f19432 = c5280;
        AbstractC4753.m10688(str);
        this.f19434 = str;
        this.f19435 = j;
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʽᐧ */
    public void mo1113(C2441 c2441) {
        if (this.f19431) {
            m11315(mo1135());
        }
        this.f19432 = c2441;
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʿʼ */
    public C2441 mo1114() {
        return (C2441) this.f19432;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m11314(long j) {
        SharedPreferences.Editor editorEdit = ((C5280) this.f19432).m11856().edit();
        editorEdit.putLong((String) this.f19434, j);
        editorEdit.apply();
        this.f19433 = j;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m11315(long j) {
        this.f19435 = j;
        if (this.f19431) {
            ((C4460) this.f19434).getClass();
            this.f19433 = SystemClock.elapsedRealtime();
        }
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ـﹶ */
    public /* synthetic */ boolean mo1128() {
        return false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m11316() {
        if (this.f19431) {
            return;
        }
        ((C4460) this.f19434).getClass();
        this.f19433 = SystemClock.elapsedRealtime();
        this.f19431 = true;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long m11317() {
        if (!this.f19431) {
            this.f19431 = true;
            this.f19433 = ((C5280) this.f19432).m11856().getLong((String) this.f19434, this.f19435);
        }
        return this.f19433;
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ﹳﹳ */
    public long mo1135() {
        long j = this.f19435;
        if (!this.f19431) {
            return j;
        }
        ((C4460) this.f19434).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f19433;
        return j + (((C2441) this.f19432).f9730 == 1.0f ? AbstractC4470.m10206(jElapsedRealtime) : jElapsedRealtime * r4.f9729);
    }
}
