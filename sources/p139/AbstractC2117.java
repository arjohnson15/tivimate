package p139;

import android.animation.Animator;
import android.view.View;
import java.util.HashMap;

/* renamed from: ˉˋ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2117 extends AbstractC2160 {

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final String[] f8348 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f8349 = 3;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m5977(C2123 c2123) {
        int visibility = c2123.f8361.getVisibility();
        HashMap map = c2123.f8363;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c2123.f8361;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: ﾞˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p139.C2151 m5978(p139.C2123 r8, p139.C2123 r9) {
        /*
            ˉˋ.ᵔﹳ r0 = new ˉˋ.ᵔﹳ
            r0.<init>()
            r1 = 0
            r0.f8425 = r1
            r0.f8422 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f8363
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f8424 = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f8423 = r6
            goto L33
        L2f:
            r0.f8424 = r3
            r0.f8423 = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f8363
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f8427 = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f8426 = r2
            goto L56
        L52:
            r0.f8427 = r3
            r0.f8426 = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f8424
            int r9 = r0.f8427
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f8423
            android.view.ViewGroup r4 = r0.f8426
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f8422 = r1
            r0.f8425 = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f8422 = r2
            r0.f8425 = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f8426
            if (r8 != 0) goto L81
            r0.f8422 = r1
            r0.f8425 = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f8423
            if (r8 != 0) goto L9f
            r0.f8422 = r2
            r0.f8425 = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f8427
            if (r8 != 0) goto L95
            r0.f8422 = r2
            r0.f8425 = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f8424
            if (r8 != 0) goto L9f
            r0.f8422 = r1
            r0.f8425 = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139.AbstractC2117.m5978(ˉˋ.ˆᵔ, ˉˋ.ˆᵔ):ˉˋ.ᵔﹳ");
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void mo5979(C2123 c2123) {
        m5977(c2123);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public abstract Animator mo5980(View view, C2123 c2123);

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public abstract Animator mo5981(View view, C2123 c2123, C2123 c21232);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (m5978(m6080(r3, false), m6086(r3, false)).f8425 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    @Override // p139.AbstractC2160
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo5982(android.view.ViewGroup r21, p139.C2123 r22, p139.C2123 r23) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139.AbstractC2117.mo5982(android.view.ViewGroup, ˉˋ.ˆᵔ, ˉˋ.ˆᵔ):android.animation.Animator");
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo5983(C2123 c2123) {
        m5977(c2123);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean mo5984(C2123 c2123, C2123 c21232) {
        if (c2123 == null && c21232 == null) {
            return false;
        }
        if (c2123 != null && c21232 != null && c21232.f8363.containsKey("android:visibility:visibility") != c2123.f8363.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2151 c2151M5978 = m5978(c2123, c21232);
        if (c2151M5978.f8425) {
            return c2151M5978.f8424 == 0 || c2151M5978.f8427 == 0;
        }
        return false;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final String[] mo5985() {
        return f8348;
    }
}
