package p174;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ˋˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2473 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2473 f9825 = new C2473();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Map f9824 = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2474 m6597(EnumC2475 enumC2475) {
        Object obj = f9824.get(enumC2475);
        if (obj != null) {
            return (C2474) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC2475 + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #0 {all -> 0x00bd, blocks: (B:22:0x0094, B:25:0x00a4, B:26:0x00bc), top: B:31:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6598(p185.AbstractC2562 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p174.C2471
            if (r0 == 0) goto L13
            r0 = r11
            ˋˎ.ʽᐧ r0 = (p174.C2471) r0
            int r1 = r0.f9814
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9814 = r1
            goto L18
        L13:
            ˋˎ.ʽᐧ r0 = new ˋˎ.ʽᐧ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f9819
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f9814
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f9817
            java.util.Map r4 = r0.f9816
            java.util.Map r4 = (java.util.Map) r4
            ˈˈ.ـﹶ r5 = r0.f9821
            ˋˎ.ﹳﹳ r6 = r0.f9820
            java.util.Iterator r7 = r0.f9815
            java.util.Map r8 = r0.f9818
            java.util.Map r8 = (java.util.Map) r8
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            goto L93
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            java.util.Map r2 = p174.C2473.f9824
            int r4 = r2.size()
            int r4 = p013.AbstractC1035.m3985(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L5b:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lc2
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            ˋˎ.ﹳﹳ r6 = (p174.EnumC2475) r6
            java.lang.Object r11 = r11.getValue()
            ˋˎ.ـﹶ r11 = (p174.C2474) r11
            ˈˈ.ﹳﹳ r5 = r11.f9827
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f9818 = r11
            r0.f9815 = r7
            r0.f9820 = r6
            r0.f9821 = r5
            r0.f9816 = r11
            r0.f9817 = r2
            r0.f9814 = r3
            java.lang.Object r11 = r5.mo5613(r0)
            if (r11 != r1) goto L92
            return r1
        L92:
            r8 = r4
        L93:
            r11 = 0
            ˋˎ.ـﹶ r9 = m6597(r6)     // Catch: java.lang.Throwable -> Lbd
            ﹶˊ.ˉי r9 = r9.f9826     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto La4
            r5.mo5615(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L5b
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lbd
            r1.append(r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbd
            throw r0     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            r5.mo5615(r11)
            throw r0
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174.C2473.m6598(ˎʻ.ˑʽ):java.lang.Object");
    }
}
