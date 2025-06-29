package p456;

import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5322 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f20632;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f20633;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Long f20634;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Boolean f20635;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Long f20636;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f20637;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f20638;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f20639;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f20640;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f20641;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Long f20642;

    public C5322(long j, String str, String str2) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }

    public C5322(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        AbstractC4753.m10688(str);
        AbstractC4753.m10688(str2);
        AbstractC4753.m10685(j >= 0);
        AbstractC4753.m10685(j2 >= 0);
        AbstractC4753.m10685(j3 >= 0);
        AbstractC4753.m10685(j5 >= 0);
        this.f20638 = str;
        this.f20632 = str2;
        this.f20637 = j;
        this.f20641 = j2;
        this.f20633 = j3;
        this.f20639 = j4;
        this.f20640 = j5;
        this.f20636 = l;
        this.f20642 = l2;
        this.f20634 = l3;
        this.f20635 = bool;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5322 m11993(Long l, Long l2, Boolean bool) {
        return new C5322(this.f20638, this.f20632, this.f20637, this.f20641, this.f20633, this.f20639, this.f20640, this.f20636, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5322 m11994(long j) {
        return new C5322(this.f20638, this.f20632, this.f20637, this.f20641, this.f20633, j, this.f20640, this.f20636, this.f20642, this.f20634, this.f20635);
    }
}
