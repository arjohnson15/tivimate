package p036;

import p353.InterfaceC4016;

/* renamed from: ʼﹶ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1252 implements InterfaceC4016 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C1255 f5129;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x0075, B:53:0x007f, B:55:0x008b, B:58:0x0096), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    @Override // p353.InterfaceC4016
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            ʼﹶ.ᵎˏ r3 = r8.f5129
            ˊﹶ.ᵎـ r9 = (p166.C2431) r9
            java.lang.Object r4 = r3.f5156
            monitor-enter(r4)
            ʼﹶ.ˏʾ r5 = r3.f5153     // Catch: java.lang.Throwable -> L67
            boolean r5 = r5.f5097     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L95
            boolean r5 = r3.f5155     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L95
            int r5 = r9.f9662     // Catch: java.lang.Throwable -> L67
            if (r5 <= r1) goto L95
            java.lang.String r5 = r9.f9667     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L1e
        L1c:
            r1 = 0
            goto L56
        L1e:
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case -2123537834: goto L47;
                case 187078296: goto L3c;
                case 187078297: goto L33;
                case 1504578661: goto L28;
                default: goto L26;
            }
        L26:
            r1 = -1
            goto L51
        L28:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r7 = "audio/ac4"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L51
            goto L26
        L3c:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L45
            goto L26
        L45:
            r1 = 1
            goto L51
        L47:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L50
            goto L26
        L50:
            r1 = 0
        L51:
            switch(r1) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L1c
        L55:
            r1 = 1
        L56:
            r5 = 32
            if (r1 == 0) goto L69
            int r1 = p383.AbstractC4470.f17202     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L95
            com.bumptech.glide.ﹶˆ r1 = r3.f5157     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L95
            boolean r1 = r1.f2404     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L95
            goto L69
        L67:
            r9 = move-exception
            goto L98
        L69:
            int r1 = p383.AbstractC4470.f17202     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L96
            com.bumptech.glide.ﹶˆ r1 = r3.f5157     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            boolean r5 = r1.f2404     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L96
            java.lang.Object r1 = r1.f2402     // Catch: java.lang.Throwable -> L67
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L67
            boolean r1 = p036.AbstractC1243.m4465(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            com.bumptech.glide.ﹶˆ r1 = r3.f5157     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r1.f2402     // Catch: java.lang.Throwable -> L67
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L67
            boolean r1 = p036.AbstractC1243.m4459(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            com.bumptech.glide.ﹶˆ r1 = r3.f5157     // Catch: java.lang.Throwable -> L67
            ˊﹶ.ʿʼ r3 = r3.f5152     // Catch: java.lang.Throwable -> L67
            boolean r9 = r1.m1610(r3, r9)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L96
        L95:
            r0 = 1
        L96:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            return r0
        L98:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p036.C1252.apply(java.lang.Object):boolean");
    }
}
