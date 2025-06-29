package p019;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import ⁱـ.ˑי;

/* renamed from: ʻﹳ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1125 extends ˑי {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final TextView f4750;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1127 f4751;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f4752 = true;

    public C1125(TextView textView) {
        this.f4750 = textView;
        this.f4751 = new C1127(textView);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final InputFilter[] m4134(InputFilter[] inputFilterArr) {
        if (!this.f4752) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C1127) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C1127 c1127 = this.f4751;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1127;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c1127) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m4135(boolean z) {
        if (z) {
            TextView textView = this.f4750;
            textView.setTransformationMethod(m4137(textView.getTransformationMethod()));
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m4136() {
        return this.f4752;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final TransformationMethod m4137(TransformationMethod transformationMethod) {
        return this.f4752 ? ((transformationMethod instanceof C1121) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1121(transformationMethod) : transformationMethod instanceof C1121 ? ((C1121) transformationMethod).f4742 : transformationMethod;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m4138(boolean z) {
        this.f4752 = z;
        TextView textView = this.f4750;
        textView.setTransformationMethod(m4137(textView.getTransformationMethod()));
        textView.setFilters(m4134(textView.getFilters()));
    }
}
