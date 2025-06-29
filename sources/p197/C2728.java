package p197;

/* renamed from: ˎˑ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2728 implements InterfaceC2717, InterfaceC2724 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C2728 f10678 = new C2728(0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C2728 f10679 = new C2728(1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10680;

    public /* synthetic */ C2728(int i) {
        this.f10680 = i;
    }

    @Override // p197.InterfaceC2724
    public float getInterpolation(float f) {
        switch (this.f10680) {
            case 2:
                return ((float) (Math.cos((f + 1.0f) * 3.141592653589793d) / 2.0d)) + 0.5f;
            default:
                return f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p197.InterfaceC2717
    /* renamed from: ـﹶ */
    public Object mo6883(float f, Float f2, Float f3) {
        switch (this.f10680) {
            case 0:
                float fFloatValue = f2.floatValue();
                return Float.valueOf(((f3.floatValue() - fFloatValue) * f) + fFloatValue);
            default:
                return Integer.valueOf((int) ((f * (((Integer) f3).intValue() - r3)) + ((Integer) f2).intValue()));
        }
    }
}
