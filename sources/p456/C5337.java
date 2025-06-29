package p456;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ᵢﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5337 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C5244 f20698;

    public C5337(C5244 c5244) {
        this.f20698 = c5244;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r10, android.os.Bundle r11) {
        /*
            r9 = this;
            ﾞⁱ.ʾˈ r0 = r9.f20698
            ﾞⁱ.ـˆ r1 = r0.ˏᵢ()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            ʽˉ.ʽᐧ r1 = r1.f20566     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            java.lang.String r2 = "onActivityCreated"
            r1.m4533(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            android.content.Intent r1 = r10.getIntent()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 != 0) goto L1b
            ﾞⁱ.ᵔᵢ r0 = r0.m11849()
            r0.m12007(r10, r11)
            return
        L1b:
            android.net.Uri r2 = r1.getData()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L2e
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 == 0) goto L2e
        L27:
            r6 = r2
            goto L47
        L29:
            r1 = move-exception
            goto L9e
        L2c:
            r1 = move-exception
            goto L8b
        L2e:
            android.os.Bundle r2 = r1.getExtras()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 != 0) goto L45
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            goto L27
        L45:
            r2 = 0
            goto L27
        L47:
            if (r6 == 0) goto L83
            boolean r2 = r6.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 != 0) goto L50
            goto L83
        L50:
            r0.ﹶﾞ()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r1 = p456.C5316.m11938(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L5d
            java.lang.String r1 = "gs"
        L5b:
            r7 = r1
            goto L60
        L5d:
            java.lang.String r1 = "auto"
            goto L5b
        L60:
            java.lang.String r1 = "referrer"
            java.lang.String r8 = r6.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r11 != 0) goto L6b
            r1 = 1
            r5 = 1
            goto L6d
        L6b:
            r1 = 0
            r5 = 0
        L6d:
            ﾞⁱ.ʿˊ r1 = r0.ʽᐧ()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            ﾞⁱ.ﹶʾ r2 = new ﾞⁱ.ﹶʾ     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r3 = r2
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r1.m11743(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            ﾞⁱ.ᵔᵢ r0 = r0.m11849()
            r0.m12007(r10, r11)
            return
        L83:
            ﾞⁱ.ᵔᵢ r0 = r0.m11849()
            r0.m12007(r10, r11)
            return
        L8b:
            ﾞⁱ.ـˆ r2 = r0.ˏᵢ()     // Catch: java.lang.Throwable -> L29
            ʽˉ.ʽᐧ r2 = r2.f20571     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.m4531(r1, r3)     // Catch: java.lang.Throwable -> L29
            ﾞⁱ.ᵔᵢ r0 = r0.m11849()
            r0.m12007(r10, r11)
            return
        L9e:
            ﾞⁱ.ᵔᵢ r0 = r0.m11849()
            r0.m12007(r10, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5337.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C5328 c5328M11849 = this.f20698.m11849();
        synchronized (c5328M11849.f20659) {
            try {
                if (activity == c5328M11849.f20667) {
                    c5328M11849.f20667 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11729()) {
            c5328M11849.f20666.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C5328 c5328M11849 = this.f20698.m11849();
        synchronized (c5328M11849.f20659) {
            c5328M11849.f20668 = false;
            c5328M11849.f20661 = true;
        }
        ((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20107.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11729()) {
            C5297 c5297M12006 = c5328M11849.m12006(activity);
            c5328M11849.f20664 = c5328M11849.f20662;
            c5328M11849.f20662 = null;
            c5328M11849.ʽᐧ().m11743(new RunnableC5282(c5328M11849, c5297M12006, jElapsedRealtime));
        } else {
            c5328M11849.f20662 = null;
            c5328M11849.ʽᐧ().m11743(new RunnableC5344(c5328M11849, jElapsedRealtime, 1));
        }
        C5255 c5255M11848 = this.f20698.m11848();
        ((C5236) ((ﹳﹳ) c5255M11848).ᐧⁱ).f20107.getClass();
        c5255M11848.ʽᐧ().m11743(new RunnableC5342(c5255M11848, SystemClock.elapsedRealtime(), 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C5255 c5255M11848 = this.f20698.m11848();
        ((C5236) ((ﹳﹳ) c5255M11848).ᐧⁱ).f20107.getClass();
        c5255M11848.ʽᐧ().m11743(new RunnableC5342(c5255M11848, SystemClock.elapsedRealtime(), 0));
        C5328 c5328M11849 = this.f20698.m11849();
        synchronized (c5328M11849.f20659) {
            c5328M11849.f20668 = true;
            if (activity != c5328M11849.f20667) {
                synchronized (c5328M11849.f20659) {
                    c5328M11849.f20667 = activity;
                    c5328M11849.f20661 = false;
                }
                if (((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11729()) {
                    c5328M11849.f20663 = null;
                    c5328M11849.ʽᐧ().m11743(new RunnableC5237(c5328M11849, 1));
                }
            }
        }
        if (!((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11729()) {
            c5328M11849.f20662 = c5328M11849.f20663;
            c5328M11849.ʽᐧ().m11743(new RunnableC5237(c5328M11849, 0));
            return;
        }
        c5328M11849.m12003(activity, c5328M11849.m12006(activity), false);
        C5241 c5241M11651 = ((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).m11651();
        ((C5236) ((ﹳﹳ) c5241M11651).ᐧⁱ).f20107.getClass();
        c5241M11651.ʽᐧ().m11743(new RunnableC5344(c5241M11651, SystemClock.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C5297 c5297;
        C5328 c5328M11849 = this.f20698.m11849();
        if (!((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11729() || bundle == null || (c5297 = (C5297) c5328M11849.f20666.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c5297.f20550);
        bundle2.putString("name", c5297.f20551);
        bundle2.putString("referrer_name", c5297.f20548);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
