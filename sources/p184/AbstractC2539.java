package p184;

import p034.C1228;

/* renamed from: ˎ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2539 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1228 f10082 = new C1228("NONE", 1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1228 f10081 = new C1228("PENDING", 1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final InterfaceC2551 m6671(InterfaceC2551 interfaceC2551) {
        if (interfaceC2551 instanceof InterfaceC2544) {
            return interfaceC2551;
        }
        if (!(interfaceC2551 instanceof C2538)) {
            return new C2538(interfaceC2551);
        }
        ((C2538) interfaceC2551).getClass();
        return interfaceC2551;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0052, B:28:0x0067, B:30:0x006f, B:20:0x0047, B:23:0x004e), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [ﹶʻ.ˋˊ] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ﹶʻ.ˋˊ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m6672(p184.InterfaceC2552 r7, p423.InterfaceC4876 r8, boolean r9, p185.AbstractC2562 r10) {
        /*
            boolean r0 = r10 instanceof p184.C2547
            if (r0 == 0) goto L13
            r0 = r10
            ˎ.ˏᵢ r0 = (p184.C2547) r0
            int r1 = r0.f10103
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10103 = r1
            goto L18
        L13:
            ˎ.ˏᵢ r0 = new ˎ.ˏᵢ
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10102
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10103
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f10106
            ﹶʻ.ˑʽ r7 = r0.f10105
            ﹶʻ.ˋˊ r8 = r0.f10101
            ˎ.ᐧʻ r2 = r0.f10104
            ˈⁱ.ˉⁱ.ˆʿ(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L52
        L35:
            r7 = move-exception
            goto L8c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f10106
            ﹶʻ.ˑʽ r7 = r0.f10105
            ﹶʻ.ˋˊ r8 = r0.f10101
            ˎ.ᐧʻ r2 = r0.f10104
            ˈⁱ.ˉⁱ.ˆʿ(r10)     // Catch: java.lang.Throwable -> L35
            goto L67
        L4b:
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            ﹶʻ.ˑʽ r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            r0.f10104 = r7     // Catch: java.lang.Throwable -> L35
            r0.f10101 = r8     // Catch: java.lang.Throwable -> L35
            r0.f10105 = r10     // Catch: java.lang.Throwable -> L35
            r0.f10106 = r9     // Catch: java.lang.Throwable -> L35
            r0.f10103 = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.m10962(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.m10963()     // Catch: java.lang.Throwable -> L35
            r0.f10104 = r2     // Catch: java.lang.Throwable -> L35
            r0.f10101 = r8     // Catch: java.lang.Throwable -> L35
            r0.f10105 = r7     // Catch: java.lang.Throwable -> L35
            r0.f10106 = r9     // Catch: java.lang.Throwable -> L35
            r0.f10103 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.mo3959(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
            return r1
        L84:
            if (r9 == 0) goto L89
            r8.mo10961(r3)
        L89:
            ٴˑ.ˉⁱ r7 = p288.C3397.f13249
            return r7
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L97
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L97:
            if (r3 != 0) goto La3
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La3:
            r8.mo10961(r3)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.AbstractC2539.m6672(ˎ.ᐧʻ, ﹶʻ.ˏʾ, boolean, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable m6673(p184.InterfaceC2551 r5, p184.InterfaceC2552 r6, p185.AbstractC2562 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p184.C2541
            if (r0 == 0) goto L13
            r0 = r7
            ˎ.ˉⁱ r0 = (p184.C2541) r0
            int r1 = r0.f10090
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10090 = r1
            goto L18
        L13:
            ˎ.ˉⁱ r0 = new ˎ.ˉⁱ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10088
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10090
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ʿ.ᵎˏ r5 = r0.f10089
            ˈⁱ.ˉⁱ.ˆʿ(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            r1 = r6
            goto L52
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            ʿ.ᵎˏ r7 = new ʿ.ᵎˏ
            r7.<init>()
            ʼʾ.ˏᴵ r2 = new ʼʾ.ˏᴵ     // Catch: java.lang.Throwable -> L4f
            r4 = 1
            r2.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L4f
            r0.f10089 = r7     // Catch: java.lang.Throwable -> L4f
            r0.f10090 = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.mo3972(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            goto L81
        L4d:
            r1 = 0
            goto L81
        L4f:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.f6302
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5e
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L7e
        L5e:
            ʿʽ.ʿˏ r6 = p072.C1584.f6341
            ᴵⁱ.ˉי r7 = r0.f10143
            ᴵⁱ.ˏᵢ r6 = r7.mo3966(r6)
            ʿʽ.ﾞˎ r6 = (p072.InterfaceC1643) r6
            if (r6 == 0) goto L7f
            boolean r7 = r6.isCancelled()
            if (r7 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r6 = r6.mo5169()
            if (r6 == 0) goto L7f
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L7e
            goto L7f
        L7e:
            throw r1
        L7f:
            if (r5 != 0) goto L82
        L81:
            return r1
        L82:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L8a
            ˈי.ʾˈ.ـﹶ(r5, r1)
            throw r5
        L8a:
            ˈי.ʾˈ.ـﹶ(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.AbstractC2539.m6673(ˎ.ٴˎ, ˎ.ᐧʻ, ˎʻ.ˑʽ):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m6674(p184.InterfaceC2551 r6, p185.AbstractC2562 r7) {
        /*
            boolean r0 = r7 instanceof p184.C2549
            if (r0 == 0) goto L13
            r0 = r7
            ˎ.ˑי r0 = (p184.C2549) r0
            int r1 = r0.f10112
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10112 = r1
            goto L18
        L13:
            ˎ.ˑי r0 = new ˎ.ˑי
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10111
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10112
            ʼᵔ.ـﹶ r3 = p010.AbstractC1014.f4386
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            ˎ.ˏᴵ r6 = r0.f10109
            ʿ.ᵎˏ r0 = r0.f10110
            ˈⁱ.ˉⁱ.ˆʿ(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            ʿ.ᵎˏ r7 = new ʿ.ᵎˏ
            r7.<init>()
            r7.f6302 = r3
            ˎ.ˏᴵ r2 = new ˎ.ˏᴵ
            r5 = 0
            r2.<init>(r5, r7)
            r0.f10110 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f10109 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f10112 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.mo3972(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            ˎ.ˏᴵ r1 = r7.f3891
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.f6302
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.AbstractC2539.m6674(ˎ.ٴˎ, ˎʻ.ˑʽ):java.lang.Object");
    }
}
