package p225;

import android.content.Context;

/* renamed from: ˏᵢ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3002 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Context f11528;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11529;

    public /* synthetic */ RunnableC3002(Context context, int i) {
        this.f11529 = i;
        this.f11528 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.f11529
            switch(r0) {
                case 0: goto L31;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            ʻˉ.ـﹶ r0 = new ʻˉ.ـﹶ
            r1 = 1
            r0.<init>(r1)
            ـˊ.ʿʼ r1 = p404.AbstractC4630.f17739
            r2 = 0
            android.content.Context r3 = r11.f11528
            p404.AbstractC4630.m10531(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            ˏᵢ.ˑי r1 = new ˏᵢ.ˑי
            android.content.Context r2 = r11.f11528
            r3 = 2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L31:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb1
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f11528
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto Lb1
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L8a
            ˎٴ.ٴˎ r0 = p225.AbstractC3014.f11579
            r0.getClass()
            ˎٴ.ـﹶ r2 = new ˎٴ.ـﹶ
            r2.<init>(r0)
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            ˏᵢ.ᵎˏ r0 = (p225.AbstractC3014) r0
            if (r0 == 0) goto L59
            ˏᵢ.ᵢʿ r0 = (p225.LayoutInflaterFactory2C3017) r0
            android.content.Context r0 = r0.f11657
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L79
        L78:
            r0 = 0
        L79:
            if (r0 == 0) goto L8f
            android.os.LocaleList r0 = p225.AbstractC2996.m7423(r0)
            ﾞᐧ.ﹳﹳ r2 = new ﾞᐧ.ﹳﹳ
            ﾞᐧ.ˏᵢ r6 = new ﾞᐧ.ˏᵢ
            r6.<init>(r0)
            r2.<init>(r6)
            goto L91
        L8a:
            ﾞᐧ.ﹳﹳ r2 = p225.AbstractC3014.f11574
            if (r2 == 0) goto L8f
            goto L91
        L8f:
            ﾞᐧ.ﹳﹳ r2 = p453.C5201.f20023
        L91:
            ﾞᐧ.ٴˎ r0 = r2.f20024
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            java.lang.String r0 = p307.AbstractC3569.m8461(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto Laa
            android.os.LocaleList r0 = p225.AbstractC3015.m7453(r0)
            p225.AbstractC2996.m7422(r2, r0)
        Laa:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb1:
            p225.AbstractC3014.f11578 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.RunnableC3002.run():void");
    }
}
