package p279;

import p457.C5391;

/* renamed from: ٴ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3373 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f13197 = C5391.m12164("NetworkStateTracker");

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p023.C1150 m8228(android.net.ConnectivityManager r8) {
        /*
            android.net.NetworkInfo r0 = r8.getActiveNetworkInfo()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 >= r5) goto L19
        L17:
            r4 = 0
            goto L37
        L19:
            android.net.Network r4 = p406.AbstractC4655.m10558(r8)     // Catch: java.lang.SecurityException -> L2a
            android.net.NetworkCapabilities r4 = p406.AbstractC4661.m10566(r8, r4)     // Catch: java.lang.SecurityException -> L2a
            if (r4 == 0) goto L17
            r5 = 16
            boolean r4 = p406.AbstractC4661.m10564(r4, r5)     // Catch: java.lang.SecurityException -> L2a
            goto L37
        L2a:
            r4 = move-exception
            ﾞﹶ.ﾞˊ r5 = p457.C5391.m12163()
            java.lang.String r6 = p279.AbstractC3373.f13197
            java.lang.String r7 = "Unable to validate active network"
            r5.m12170(r6, r7, r4)
            goto L17
        L37:
            boolean r8 = r8.isActiveNetworkMetered()
            if (r0 == 0) goto L44
            boolean r0 = r0.isRoaming()
            if (r0 != 0) goto L44
            goto L45
        L44:
            r1 = 0
        L45:
            ʼʾ.ﹶˆ r0 = new ʼʾ.ﹶˆ
            r0.<init>(r3, r4, r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p279.AbstractC3373.m8228(android.net.ConnectivityManager):ʼʾ.ﹶˆ");
    }
}
