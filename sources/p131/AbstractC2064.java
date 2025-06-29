package p131;

import com.google.android.gms.internal.play_billing.ˎˑ;
import p421.C4857;

/* renamed from: ˉʻ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2064 extends AbstractC2063 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7818;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7819;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4857[] f7820;

    public AbstractC2064() {
        this.f7820 = null;
        this.f7819 = 0;
    }

    public AbstractC2064(AbstractC2064 abstractC2064) {
        this.f7820 = null;
        this.f7819 = 0;
        this.f7818 = abstractC2064.f7818;
        this.f7820 = ˎˑ.ˉⁱ(abstractC2064.f7820);
    }

    public C4857[] getPathData() {
        return this.f7820;
    }

    public String getPathName() {
        return this.f7818;
    }

    public void setPathData(C4857[] c4857Arr) {
        if (!ˎˑ.ˑʽ(this.f7820, c4857Arr)) {
            this.f7820 = ˎˑ.ˉⁱ(c4857Arr);
            return;
        }
        C4857[] c4857Arr2 = this.f7820;
        for (int i = 0; i < c4857Arr.length; i++) {
            c4857Arr2[i].f18358 = c4857Arr[i].f18358;
            int i2 = 0;
            while (true) {
                float[] fArr = c4857Arr[i].f18357;
                if (i2 < fArr.length) {
                    c4857Arr2[i].f18357[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
