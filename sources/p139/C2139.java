package p139;

import android.os.Build;
import android.view.View;

/* renamed from: ˉˋ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2139 extends C2161 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static boolean f8396 = true;

    /* renamed from: ﾞʽ */
    public void mo6037(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.ﾞʽ(view, i);
        } else if (f8396) {
            try {
                AbstractC2119.m5986(view, i);
            } catch (NoSuchMethodError unused) {
                f8396 = false;
            }
        }
    }
}
