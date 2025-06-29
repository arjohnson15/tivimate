package p009;

import androidx.media3.ui.AspectRatioFrameLayout;

/* renamed from: ʻˋ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0997 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f4344;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4345;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4346;

    public /* synthetic */ RunnableC0997(int i, Object obj, boolean z) {
        this.f4346 = i;
        this.f4345 = obj;
        this.f4344 = z;
    }

    public RunnableC0997(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f4346 = 2;
        this.f4345 = aspectRatioFrameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            r0 = 0
            int r1 = r8.f4346
            switch(r1) {
                case 0: goto Lad;
                case 1: goto La1;
                case 2: goto L95;
                case 3: goto L89;
                default: goto L6;
            }
        L6:
            java.lang.Object r1 = r8.f4345
            ﾞⁱ.ʾˈ r1 = (p456.C5244) r1
            java.lang.Object r2 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r2 = (p456.C5236) r2
            boolean r2 = r2.m11662()
            java.lang.Object r3 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r3 = (p456.C5236) r3
            java.lang.Boolean r4 = r3.f20122
            r5 = 1
            if (r4 == 0) goto L25
            java.lang.Boolean r3 = r3.f20122
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            java.lang.Object r4 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r4 = (p456.C5236) r4
            boolean r6 = r8.f4344
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r4.f20122 = r7
            if (r3 != r6) goto L48
            java.lang.Object r3 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r3 = (p456.C5236) r3
            ﾞⁱ.ـˆ r3 = r3.f20110
            p456.C5236.m11647(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            ʽˉ.ʽᐧ r3 = r3.f20566
            java.lang.String r7 = "Default data collection state already set to"
            r3.m4531(r4, r7)
        L48:
            java.lang.Object r3 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r3 = (p456.C5236) r3
            boolean r3 = r3.m11662()
            if (r3 == r2) goto L6d
            java.lang.Object r3 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r3 = (p456.C5236) r3
            boolean r3 = r3.m11662()
            java.lang.Object r4 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r4 = (p456.C5236) r4
            java.lang.Boolean r7 = r4.f20122
            if (r7 == 0) goto L6b
            java.lang.Boolean r4 = r4.f20122
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            r0 = 1
        L6b:
            if (r3 == r0) goto L85
        L6d:
            java.lang.Object r0 = r1.ᐧⁱ
            ﾞⁱ.ʻﹳ r0 = (p456.C5236) r0
            ﾞⁱ.ـˆ r0 = r0.f20110
            p456.C5236.m11647(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            ʽˉ.ʽᐧ r0 = r0.f20573
            java.lang.String r4 = "Default data collection is different than actual status"
            r0.m4529(r3, r2, r4)
        L85:
            r1.m11698()
            return
        L89:
            int r0 = ar.tvplayer.tv.base.ui.view.CircleButton.ᴵʼ
            java.lang.Object r0 = r8.f4345
            ar.tvplayer.tv.base.ui.view.CircleButton r0 = (ar.tvplayer.tv.base.ui.view.CircleButton) r0
            boolean r1 = r8.f4344
            r0.ˑʽ(r1)
            return
        L95:
            r8.f4344 = r0
            int r0 = androidx.media3.ui.AspectRatioFrameLayout.f1448
            java.lang.Object r0 = r8.f4345
            androidx.media3.ui.AspectRatioFrameLayout r0 = (androidx.media3.ui.AspectRatioFrameLayout) r0
            r0.getClass()
            return
        La1:
            java.lang.Object r0 = r8.f4345
            ʻˋ.ʿˏ r0 = (p009.C0983) r0
            ʻˋ.ˏᴵ r0 = r0.f4324
            boolean r1 = r8.f4344
            r0.mo1568(r1)
            return
        Lad:
            java.lang.Object r0 = r8.f4345
            ʻˋ.ˎٴ r0 = (ʻˋ.ˎٴ) r0
            r0.getClass()
            p329.AbstractC3742.m8713()
            java.lang.Object r0 = r0.ʽᐧ
            com.bumptech.glide.ﹶˆ r0 = (com.bumptech.glide.C0295) r0
            boolean r1 = r0.f2404
            boolean r2 = r8.f4344
            r0.f2404 = r2
            if (r1 == r2) goto Lca
            java.lang.Object r0 = r0.f2402
            ʻˋ.ˏᴵ r0 = (p009.C0988) r0
            r0.mo1568(r2)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009.RunnableC0997.run():void");
    }
}
