package p131;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p200.C2741;

/* renamed from: ˉʻ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2065 extends AbstractC2063 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f7821;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f7822;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Matrix f7823;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public String f7824;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f7825;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f7826;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Matrix f7827;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f7828;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f7829;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f7830;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f7831;

    public C2065() {
        this.f7827 = new Matrix();
        this.f7821 = new ArrayList();
        this.f7826 = 0.0f;
        this.f7830 = 0.0f;
        this.f7822 = 0.0f;
        this.f7828 = 1.0f;
        this.f7829 = 1.0f;
        this.f7825 = 0.0f;
        this.f7831 = 0.0f;
        this.f7823 = new Matrix();
        this.f7824 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2065(C2065 c2065, C2741 c2741) {
        C2076 c2076;
        this.f7827 = new Matrix();
        this.f7821 = new ArrayList();
        this.f7826 = 0.0f;
        this.f7830 = 0.0f;
        this.f7822 = 0.0f;
        this.f7828 = 1.0f;
        this.f7829 = 1.0f;
        this.f7825 = 0.0f;
        this.f7831 = 0.0f;
        Matrix matrix = new Matrix();
        this.f7823 = matrix;
        this.f7824 = null;
        this.f7826 = c2065.f7826;
        this.f7830 = c2065.f7830;
        this.f7822 = c2065.f7822;
        this.f7828 = c2065.f7828;
        this.f7829 = c2065.f7829;
        this.f7825 = c2065.f7825;
        this.f7831 = c2065.f7831;
        String str = c2065.f7824;
        this.f7824 = str;
        if (str != null) {
            c2741.put(str, this);
        }
        matrix.set(c2065.f7823);
        ArrayList arrayList = c2065.f7821;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C2065) {
                this.f7821.add(new C2065((C2065) obj, c2741));
            } else {
                if (obj instanceof C2062) {
                    C2062 c2062 = (C2062) obj;
                    C2062 c20622 = new C2062(c2062);
                    c20622.f7807 = 0.0f;
                    c20622.f7814 = 1.0f;
                    c20622.f7812 = 1.0f;
                    c20622.f7817 = 0.0f;
                    c20622.f7808 = 1.0f;
                    c20622.f7811 = 0.0f;
                    c20622.f7809 = Paint.Cap.BUTT;
                    c20622.f7810 = Paint.Join.MITER;
                    c20622.f7815 = 4.0f;
                    c20622.f7816 = c2062.f7816;
                    c20622.f7807 = c2062.f7807;
                    c20622.f7814 = c2062.f7814;
                    c20622.f7813 = c2062.f7813;
                    c20622.f7819 = c2062.f7819;
                    c20622.f7812 = c2062.f7812;
                    c20622.f7817 = c2062.f7817;
                    c20622.f7808 = c2062.f7808;
                    c20622.f7811 = c2062.f7811;
                    c20622.f7809 = c2062.f7809;
                    c20622.f7810 = c2062.f7810;
                    c20622.f7815 = c2062.f7815;
                    c2076 = c20622;
                } else {
                    if (!(obj instanceof C2076)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c2076 = new C2076((C2076) obj);
                }
                this.f7821.add(c2076);
                Object obj2 = c2076.f7818;
                if (obj2 != null) {
                    c2741.put(obj2, c2076);
                }
            }
        }
    }

    public String getGroupName() {
        return this.f7824;
    }

    public Matrix getLocalMatrix() {
        return this.f7823;
    }

    public float getPivotX() {
        return this.f7830;
    }

    public float getPivotY() {
        return this.f7822;
    }

    public float getRotation() {
        return this.f7826;
    }

    public float getScaleX() {
        return this.f7828;
    }

    public float getScaleY() {
        return this.f7829;
    }

    public float getTranslateX() {
        return this.f7825;
    }

    public float getTranslateY() {
        return this.f7831;
    }

    public void setPivotX(float f) {
        if (f != this.f7830) {
            this.f7830 = f;
            m5728();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f7822) {
            this.f7822 = f;
            m5728();
        }
    }

    public void setRotation(float f) {
        if (f != this.f7826) {
            this.f7826 = f;
            m5728();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f7828) {
            this.f7828 = f;
            m5728();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f7829) {
            this.f7829 = f;
            m5728();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f7825) {
            this.f7825 = f;
            m5728();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f7831) {
            this.f7831 = f;
            m5728();
        }
    }

    @Override // p131.AbstractC2063
    /* renamed from: ʽᐧ */
    public final boolean mo5726(int[] iArr) {
        int i = 0;
        boolean zMo5726 = false;
        while (true) {
            ArrayList arrayList = this.f7821;
            if (i >= arrayList.size()) {
                return zMo5726;
            }
            zMo5726 |= ((AbstractC2063) arrayList.get(i)).mo5726(iArr);
            i++;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5728() {
        Matrix matrix = this.f7823;
        matrix.reset();
        matrix.postTranslate(-this.f7830, -this.f7822);
        matrix.postScale(this.f7828, this.f7829);
        matrix.postRotate(this.f7826, 0.0f, 0.0f);
        matrix.postTranslate(this.f7825 + this.f7830, this.f7831 + this.f7822);
    }

    @Override // p131.AbstractC2063
    /* renamed from: ـﹶ */
    public final boolean mo5727() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7821;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC2063) arrayList.get(i)).mo5727()) {
                return true;
            }
            i++;
        }
    }
}
