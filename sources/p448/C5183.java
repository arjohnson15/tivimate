package p448;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.leanback.widget.ﾞᐧ;
import p204.C2784;

/* renamed from: ﾞˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5183 extends ﾞᐧ {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5181 f19955;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183(AbstractC5181 abstractC5181) {
        super(25);
        this.f19955 = abstractC5181;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2784 m11563(int i) {
        return new C2784(AccessibilityNodeInfo.obtain(this.f19955.m11561(i).f10848));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11564(int r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            ﾞˎ.ʽᐧ r0 = r6.f19955
            com.google.android.material.chip.Chip r1 = r0.f19950
            r2 = -1
            if (r7 == r2) goto L85
            r9 = 1
            if (r8 == r9) goto L80
            r2 = 2
            if (r8 == r2) goto L7b
            r2 = 64
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r8 == r2) goto L50
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L40
            יـ.ʽᐧ r0 = (p255.C3186) r0
            r1 = 16
            if (r8 != r1) goto L8b
            com.google.android.material.chip.Chip r8 = r0.f12323
            if (r7 != 0) goto L29
            boolean r5 = r8.performClick()
            goto L8b
        L29:
            if (r7 != r9) goto L8b
            r8.playSoundEffect(r5)
            android.view.View$OnClickListener r7 = r8.f3239
            if (r7 == 0) goto L36
            r7.onClick(r8)
            r5 = 1
        L36:
            boolean r7 = r8.f3246
            if (r7 == 0) goto L8b
            יـ.ʽᐧ r7 = r8.f3235
            r7.m11562(r9, r9)
            goto L8b
        L40:
            int r8 = r0.f19945
            if (r8 != r7) goto L4d
            r0.f19945 = r4
            r1.invalidate()
            r0.m11562(r7, r3)
            goto L4e
        L4d:
            r9 = 0
        L4e:
            r5 = r9
            goto L8b
        L50:
            android.view.accessibility.AccessibilityManager r8 = r0.f19946
            boolean r2 = r8.isEnabled()
            if (r2 == 0) goto L4d
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L5f
            goto L4d
        L5f:
            int r8 = r0.f19945
            if (r8 == r7) goto L4d
            if (r8 == r4) goto L6f
            r0.f19945 = r4
            com.google.android.material.chip.Chip r2 = r0.f19950
            r2.invalidate()
            r0.m11562(r8, r3)
        L6f:
            r0.f19945 = r7
            r1.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r0.m11562(r7, r8)
            goto L4e
        L7b:
            boolean r5 = r0.m11557(r7)
            goto L8b
        L80:
            boolean r5 = r0.m11560(r7)
            goto L8b
        L85:
            java.util.WeakHashMap r7 = p378.AbstractC4345.f16838
            boolean r5 = r1.performAccessibilityAction(r8, r9)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p448.C5183.m11564(int, int, android.os.Bundle):boolean");
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2784 m11565(int i) {
        AbstractC5181 abstractC5181 = this.f19955;
        int i2 = i == 2 ? abstractC5181.f19945 : abstractC5181.f19943;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return m11563(i2);
    }
}
