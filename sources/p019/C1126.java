package p019;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p192.C2676;
import ⁱـ.ˑי;

/* renamed from: ʻﹳ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1126 extends ˑי {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1125 f4753;

    public C1126(TextView textView) {
        this.f4753 = new C1125(textView);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final InputFilter[] m4139(InputFilter[] inputFilterArr) {
        return !(C2676.f10575 != null) ? inputFilterArr : this.f4753.m4134(inputFilterArr);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m4140(boolean z) {
        if (C2676.f10575 != null) {
            this.f4753.m4135(z);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m4141() {
        return this.f4753.f4752;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final TransformationMethod m4142(TransformationMethod transformationMethod) {
        return !(C2676.f10575 != null) ? transformationMethod : this.f4753.m4137(transformationMethod);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m4143(boolean z) {
        boolean z2 = C2676.f10575 != null;
        C1125 c1125 = this.f4753;
        if (z2) {
            c1125.m4138(z);
        } else {
            c1125.f4752 = z;
        }
    }
}
