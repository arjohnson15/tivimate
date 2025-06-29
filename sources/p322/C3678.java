package p322;

import p072.AbstractC1642;
import p077.C1673;
import p164.InterfaceC2379;

/* renamed from: ᴵˉ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3678 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C3676 f14102;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2379 f14103;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1673 f14098 = new C1673("firebase_sessions_enabled");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1673 f14101 = new C1673("firebase_sessions_sampling_rate");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1673 f14097 = new C1673("firebase_sessions_restart_timeout");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1673 f14099 = new C1673("firebase_sessions_cache_duration");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1673 f14100 = new C1673("firebase_sessions_cache_updated_time");

    public C3678(InterfaceC2379 interfaceC2379) throws Throwable {
        this.f14103 = interfaceC2379;
        AbstractC1642.m5302(new C3672(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8626(p077.C1673 r6, java.lang.Object r7, p185.AbstractC2562 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p322.C3670
            if (r0 == 0) goto L13
            r0 = r8
            ᴵˉ.ˉⁱ r0 = (p322.C3670) r0
            int r1 = r0.f14076
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14076 = r1
            goto L18
        L13:
            ᴵˉ.ˉⁱ r0 = new ᴵˉ.ˉⁱ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f14075
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f14076
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ˈⁱ.ˉⁱ.ˆʿ(r8)     // Catch: java.io.IOException -> L27
            goto L5b
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            ˊᵔ.ᐧʻ r8 = r5.f14103     // Catch: java.io.IOException -> L27
            ᴵˉ.ˋⁱ r2 = new ᴵˉ.ˋⁱ     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f14076 = r3     // Catch: java.io.IOException -> L27
            ʿˊ.ᐧʻ r6 = new ʿˊ.ᐧʻ     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.mo5364(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5b
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
        L5b:
            ٴˑ.ˉⁱ r6 = p288.C3397.f13249
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p322.C3678.m8626(ʿˊ.ʿʼ, java.lang.Object, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m8627() {
        C3676 c3676 = this.f14102;
        Long l = (c3676 == null ? null : c3676).f14092;
        if (c3676 == null) {
            c3676 = null;
        }
        Integer num = c3676.f14095;
        return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
    }
}
