package p004;

/* renamed from: ʻʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0928 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f4114;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f4115;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f4116;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f4117;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f4118;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f4119;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f4120;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f4121;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f4122;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float m3787(long j) {
        if (j < this.f4115) {
            return 0.0f;
        }
        long j2 = this.f4120;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC0920.m3757((j - r0) / this.f4118, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f4116;
        return (ViewOnTouchListenerC0920.m3757((j - j2) / this.f4122, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
