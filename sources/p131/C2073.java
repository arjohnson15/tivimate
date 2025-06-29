package p131;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import p200.C2741;

/* renamed from: ˉʻ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2073 {

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final Matrix f7861 = new Matrix();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Path f7862;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Paint f7863;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f7864;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f7865;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public String f7866;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public float f7867;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C2741 f7868;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f7869;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Matrix f7870;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Path f7871;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public PathMeasure f7872;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2065 f7873;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public Boolean f7874;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Paint f7875;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f7876;

    public C2073() {
        this.f7870 = new Matrix();
        this.f7869 = 0.0f;
        this.f7876 = 0.0f;
        this.f7864 = 0.0f;
        this.f7867 = 0.0f;
        this.f7865 = 255;
        this.f7866 = null;
        this.f7874 = null;
        this.f7868 = new C2741(0);
        this.f7873 = new C2065();
        this.f7871 = new Path();
        this.f7862 = new Path();
    }

    public C2073(C2073 c2073) {
        this.f7870 = new Matrix();
        this.f7869 = 0.0f;
        this.f7876 = 0.0f;
        this.f7864 = 0.0f;
        this.f7867 = 0.0f;
        this.f7865 = 255;
        this.f7866 = null;
        this.f7874 = null;
        C2741 c2741 = new C2741(0);
        this.f7868 = c2741;
        this.f7873 = new C2065(c2073.f7873, c2741);
        this.f7871 = new Path(c2073.f7871);
        this.f7862 = new Path(c2073.f7862);
        this.f7869 = c2073.f7869;
        this.f7876 = c2073.f7876;
        this.f7864 = c2073.f7864;
        this.f7867 = c2073.f7867;
        this.f7865 = c2073.f7865;
        this.f7866 = c2073.f7866;
        String str = c2073.f7866;
        if (str != null) {
            c2741.put(str, this);
        }
        this.f7874 = c2073.f7874;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f7865;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f7865 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5734(p131.C2065 r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.C2073.m5734(ˉʻ.ˏʾ, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }
}
