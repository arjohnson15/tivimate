package p356;

import android.net.Uri;
import java.util.ArrayList;
import p166.C2431;
import p345.AbstractC3980;
import p424.InterfaceC4906;
import ˊﹶ.ˋˉ;

/* renamed from: ᵔˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4033 extends AbstractC4034 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C4032 f15514;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ˋˉ f15515;

    public C4033(long j, C2431 c2431, AbstractC3980 abstractC3980, C4035 c4035, ArrayList arrayList) {
        super(c2431, abstractC3980, c4035, arrayList);
        Uri.parse(((C4030) abstractC3980.get(0)).f15503);
        long j2 = c4035.f15521;
        C4032 c4032 = j2 <= 0 ? null : new C4032(c4035.f15522, j2, null);
        this.f15514 = c4032;
        this.f15515 = c4032 == null ? new ˋˉ(27, new C4032(0L, -1L, null)) : null;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String mo9294() {
        return null;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4032 mo9295() {
        return this.f15514;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC4906 mo9296() {
        return this.f15515;
    }
}
