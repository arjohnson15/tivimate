package p065;

import com.bumptech.glide.C0295;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import p013.AbstractC1035;
import p057.C1342;
import p070.AbstractC1547;
import p072.AbstractC1642;
import p280.C3375;
import p288.C3395;
import p395.AbstractC4535;

/* renamed from: ʾᵔ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1512 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final String[] f6152 = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f6153;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String[] f6154;

    /* renamed from: ˉי, reason: contains not printable characters */
    public AbstractC1547 f6155;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C0295 f6156;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f6157;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1484 f6158;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final LinkedHashMap f6159;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ReentrantLock f6160 = new ReentrantLock();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final LinkedHashMap f6161;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3375 f6162;

    public C1512(AbstractC1484 abstractC1484, HashMap map, HashMap map2, String[] strArr) {
        this.f6158 = abstractC1484;
        this.f6153 = map;
        this.f6157 = map2;
        C3375 c3375 = new C3375();
        c3375.f13201 = 0;
        this.f6162 = c3375;
        this.f6155 = C1488.f6065;
        this.f6161 = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.f6161.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.f6153.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.f6154 = strArr2;
        for (Map.Entry entry : this.f6153.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f6161.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.f6161;
                linkedHashMap.put(lowerCase4, AbstractC1035.m3989(linkedHashMap, lowerCase3));
            }
        }
        this.f6159 = new LinkedHashMap();
        int length2 = this.f6154.length;
        C0295 c0295 = new C0295();
        c0295.f2402 = new ReentrantLock();
        c0295.f2403 = new long[length2];
        c0295.f2405 = new boolean[length2];
        this.f6156 = c0295;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r5v3, types: [ʿ.ˉי, ᵎˈ.ـﹶ] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5082(p065.C1512 r8, p185.AbstractC2562 r9) throws java.lang.Throwable {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof p065.C1494
            if (r0 == 0) goto L16
            r0 = r9
            ʾᵔ.ˋﾞ r0 = (p065.C1494) r0
            int r1 = r0.f6080
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6080 = r1
            goto L1b
        L16:
            ʾᵔ.ˋﾞ r0 = new ʾᵔ.ˋﾞ
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f6082
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6080
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            ـˊ.ˑʽ r8 = r0.f6079
            ʾᵔ.ٴﹶ r0 = r0.f6081
            ˈⁱ.ˉⁱ.ˆʿ(r9)     // Catch: java.lang.Throwable -> L32
            r2 = r8
            r8 = r0
            goto L80
        L32:
            r9 = move-exception
            goto Lbd
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            ʾᵔ.ˆᵔ r9 = r8.f6158
            ـˊ.ˑʽ r2 = r9.f6055
            boolean r5 = r2.m8031()
            if (r5 == 0) goto L5b
            ٴʻ.ـﹶ r5 = r8.f6162     // Catch: java.lang.Throwable -> Lb9
            r5.getClass()     // Catch: java.lang.Throwable -> Lbb
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = p280.C3375.f13200     // Catch: java.lang.Throwable -> Lbb
            r7 = 0
            boolean r5 = r6.compareAndSet(r5, r4, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L5e
        L58:
            r2.m8040()
        L5b:
            r1 = r3
            goto Lc1
        L5e:
            ʿ.ˉי r5 = r8.f6155     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r5 = r5.mo1053()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r5 != 0) goto L6d
            goto L58
        L6d:
            ʾᵔ.ʿˊ r5 = new ʾᵔ.ʿˊ     // Catch: java.lang.Throwable -> Lb9
            r6 = 0
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> Lb9
            r0.f6081 = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f6079 = r2     // Catch: java.lang.Throwable -> Lb9
            r0.f6080 = r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r9 = r9.m5054(r7, r5, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r9 != r1) goto L80
            goto Lc1
        L80:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L58
            java.util.concurrent.locks.ReentrantLock r0 = r8.f6160     // Catch: java.lang.Throwable -> Lb5
            r0.lock()     // Catch: java.lang.Throwable -> Lb5
            java.util.LinkedHashMap r8 = r8.f6159     // Catch: java.lang.Throwable -> La9
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> La9
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> La9
        L99:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> La9
            ʾᵔ.ﾞʽ r1 = (p065.C1531) r1     // Catch: java.lang.Throwable -> La9
            r1.m5113(r9)     // Catch: java.lang.Throwable -> La9
            goto L99
        La9:
            r8 = move-exception
            goto Laf
        Lab:
            r0.unlock()     // Catch: java.lang.Throwable -> Lb5
            goto L58
        Laf:
            r0.unlock()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        Lb3:
            r9 = r8
            goto Lb7
        Lb5:
            r8 = move-exception
            goto Lb3
        Lb7:
            r8 = r2
            goto Lbd
        Lb9:
            r9 = move-exception
            goto Lb7
        Lbb:
            r8 = move-exception
            goto Lb3
        Lbd:
            r8.m8040()
            throw r9
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5082(ʾᵔ.ٴﹶ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r11v7, types: [ʾᵔ.יʻ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00de -> B:24:0x00e1). Please report as a decompilation issue!!! */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5083(p065.C1512 r10, p065.InterfaceC1521 r11, int r12, p185.AbstractC2562 r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5083(ʾᵔ.ٴﹶ, ʾᵔ.ᵔٴ, int, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5084(p065.C1512 r4, p065.InterfaceC1506 r5, p185.AbstractC2562 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof p065.C1490
            if (r0 == 0) goto L16
            r0 = r6
            ʾᵔ.ˊᵔ r0 = (p065.C1490) r0
            int r1 = r0.f6072
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6072 = r1
            goto L1b
        L16:
            ʾᵔ.ˊᵔ r0 = new ʾᵔ.ˊᵔ
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f6069
            ˊˋ.ـﹶ r6 = p155.EnumC2332.f9250
            int r1 = r0.f6072
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.f6070
            java.util.Set r5 = (java.util.Set) r5
            ˈⁱ.ˉⁱ.ˆʿ(r4)
            goto L69
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.f6070
            ʾᵔ.יʻ r5 = (p065.InterfaceC1506) r5
            ˈⁱ.ˉⁱ.ˆʿ(r4)
            goto L53
        L41:
            ˈⁱ.ˉⁱ.ˆʿ(r4)
            ʾᵔ.ᵔ r4 = p065.C1520.f6183
            r0.f6070 = r5
            r0.f6072 = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.mo5080(r1, r4, r0)
            if (r4 != r6) goto L53
            goto L6c
        L53:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L6b
            r0.f6070 = r4
            r0.f6072 = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = p065.AbstractC1502.m5068(r5, r1, r0)
            if (r5 != r6) goto L68
            goto L6c
        L68:
            r5 = r4
        L69:
            r6 = r5
            goto L6c
        L6b:
            r6 = r4
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5084(ʾᵔ.ٴﹶ, ʾᵔ.יʻ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v5, types: [ʾᵔ.יʻ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008b -> B:19:0x008e). Please report as a decompilation issue!!! */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5085(p065.C1512 r7, p065.InterfaceC1521 r8, int r9, p185.AbstractC2562 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof p065.C1476
            if (r0 == 0) goto L16
            r0 = r10
            ʾᵔ.ʻﹳ r0 = (p065.C1476) r0
            int r1 = r0.f6013
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6013 = r1
            goto L1b
        L16:
            ʾᵔ.ʻﹳ r0 = new ʾᵔ.ʻﹳ
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f6008
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6013
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.f6007
            int r8 = r0.f6012
            java.lang.String[] r9 = r0.f6011
            java.lang.String r2 = r0.f6006
            ʾᵔ.יʻ r4 = r0.f6009
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            r10 = r9
            r9 = r4
            goto L8e
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            java.lang.String[] r7 = r7.f6154
            r7 = r7[r9]
            java.lang.String[] r9 = p065.C1512.f6152
            r10 = 0
            r2 = 3
            r2 = r7
            r10 = r9
            r7 = 3
            r9 = r8
            r8 = 0
        L4e:
            if (r8 >= r7) goto L90
            r4 = r10[r8]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.f6009 = r9
            r0.f6006 = r2
            r0.f6011 = r10
            r0.f6012 = r8
            r0.f6007 = r7
            r0.f6013 = r3
            java.lang.Object r4 = p065.AbstractC1502.m5068(r9, r4, r0)
            if (r4 != r1) goto L8e
            goto L92
        L8e:
            int r8 = r8 + r3
            goto L4e
        L90:
            ٴˑ.ˉⁱ r1 = p288.C3397.f13249
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5085(ʾᵔ.ٴﹶ, ʾᵔ.ᵔٴ, int, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5086(p065.AbstractC1487 r5, p185.AbstractC2562 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p065.C1533
            if (r0 == 0) goto L13
            r0 = r6
            ʾᵔ.ﾞˎ r0 = (p065.C1533) r0
            int r1 = r0.f6233
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6233 = r1
            goto L18
        L13:
            ʾᵔ.ﾞˎ r0 = new ʾᵔ.ﾞˎ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6230
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6233
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.f6231
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            boolean r5 = r4.m5089(r5)
            if (r5 == 0) goto L45
            r0.f6231 = r5
            r0.f6233 = r3
            java.lang.Object r6 = r4.m5091(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5086(ʾᵔ.ˉי, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3395 m5087(String[] strArr) {
        C1342 c1342 = new C1342();
        for (String str : strArr) {
            Set set = (Set) this.f6157.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                c1342.addAll(set);
            } else {
                c1342.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC4535.m10326(c1342).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f6161.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        return new C3395(strArr2, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5088(p065.AbstractC1487 r20, p185.AbstractC2562 r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            boolean r2 = r0 instanceof p065.C1495
            if (r2 == 0) goto L17
            r2 = r0
            ʾᵔ.ˎˉ r2 = (p065.C1495) r2
            int r3 = r2.f6087
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f6087 = r3
            goto L1c
        L17:
            ʾᵔ.ˎˉ r2 = new ʾᵔ.ˎˉ
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f6084
            ˊˋ.ـﹶ r3 = p155.EnumC2332.f9250
            int r4 = r2.f6087
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            boolean r2 = r2.f6085
            ˈⁱ.ˉⁱ.ˆʿ(r0)
            goto L91
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            ˈⁱ.ˉⁱ.ˆʿ(r0)
            java.util.concurrent.locks.ReentrantLock r4 = r1.f6160
            r4.lock()
            java.util.LinkedHashMap r0 = r1.f6159     // Catch: java.lang.Throwable -> L97
            r6 = r20
            java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L97
            ʾᵔ.ﾞʽ r0 = (p065.C1531) r0     // Catch: java.lang.Throwable -> L97
            r4.unlock()
            r4 = 0
            if (r0 == 0) goto L83
            int[] r0 = r0.f6222
            com.bumptech.glide.ﹶˆ r6 = r1.f6156
            java.lang.Object r7 = r6.f2402
            java.util.concurrent.locks.ReentrantLock r7 = (java.util.concurrent.locks.ReentrantLock) r7
            r7.lock()
            int r8 = r0.length     // Catch: java.lang.Throwable -> L73
            r9 = 0
            r10 = 0
        L5b:
            if (r9 >= r8) goto L78
            r11 = r0[r9]     // Catch: java.lang.Throwable -> L73
            java.lang.Object r12 = r6.f2403     // Catch: java.lang.Throwable -> L73
            long[] r12 = (long[]) r12     // Catch: java.lang.Throwable -> L73
            r13 = r12[r11]     // Catch: java.lang.Throwable -> L73
            r15 = 1
            long r17 = r13 - r15
            r12[r11] = r17     // Catch: java.lang.Throwable -> L73
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 != 0) goto L75
            r6.f2404 = r5     // Catch: java.lang.Throwable -> L73
            r10 = 1
            goto L75
        L73:
            r0 = move-exception
            goto L7f
        L75:
            int r9 = r9 + 1
            goto L5b
        L78:
            r7.unlock()
            if (r10 == 0) goto L83
            r4 = 1
            goto L83
        L7f:
            r7.unlock()
            throw r0
        L83:
            if (r4 == 0) goto L92
            r2.f6085 = r4
            r2.f6087 = r5
            java.lang.Object r0 = r1.m5091(r2)
            if (r0 != r3) goto L90
            return r3
        L90:
            r2 = r4
        L91:
            r4 = r2
        L92:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L97:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5088(ʾᵔ.ˉי, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m5089(AbstractC1487 abstractC1487) {
        C3395 c3395M5087 = m5087(abstractC1487.f6064);
        String[] strArr = (String[]) c3395M5087.f13245;
        int[] iArr = (int[]) c3395M5087.f13244;
        C1531 c1531 = new C1531(abstractC1487, iArr, strArr);
        ReentrantLock reentrantLock = this.f6160;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f6159;
        try {
            C1531 c15312 = linkedHashMap.containsKey(abstractC1487) ? (C1531) AbstractC1035.m3989(linkedHashMap, abstractC1487) : (C1531) linkedHashMap.put(abstractC1487, c1531);
            reentrantLock.unlock();
            if (c15312 != null) {
                return false;
            }
            C0295 c0295 = this.f6156;
            ReentrantLock reentrantLock2 = (ReentrantLock) c0295.f2402;
            reentrantLock2.lock();
            try {
                boolean z = false;
                for (int i : iArr) {
                    long[] jArr = (long[]) c0295.f2403;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        c0295.f2404 = true;
                        z = true;
                    }
                }
                return z;
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5090(C1501 c1501, C1501 c15012) {
        C3375 c3375 = this.f6162;
        c3375.getClass();
        if (C3375.f13200.compareAndSet(c3375, 0, 1)) {
            c1501.mo1053();
            AbstractC1642.m5294(this.f6158.m5043(), null, 0, new C1525(this, c15012, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5091(p185.AbstractC2562 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p065.C1486
            if (r0 == 0) goto L13
            r0 = r7
            ʾᵔ.ˈﹳ r0 = (p065.C1486) r0
            int r1 = r0.f6063
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6063 = r1
            goto L18
        L13:
            ʾᵔ.ˈﹳ r0 = new ʾᵔ.ˈﹳ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6060
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6063
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ـˊ.ˑʽ r0 = r0.f6061
            ˈⁱ.ˉⁱ.ˆʿ(r7)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            ʾᵔ.ˆᵔ r7 = r6.f6158
            ـˊ.ˑʽ r2 = r7.f6055
            boolean r4 = r2.m8031()
            if (r4 == 0) goto L5f
            ʾᵔ.ٴᐧ r4 = new ʾᵔ.ٴᐧ     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L59
            r0.f6061 = r2     // Catch: java.lang.Throwable -> L59
            r0.f6063 = r3     // Catch: java.lang.Throwable -> L59
            r3 = 0
            java.lang.Object r7 = r7.m5054(r3, r4, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L52
            return r1
        L52:
            r0 = r2
        L53:
            r0.m8040()
            goto L5f
        L57:
            r0 = r2
            goto L5b
        L59:
            r7 = move-exception
            goto L57
        L5b:
            r0.m8040()
            throw r7
        L5f:
            ٴˑ.ˉⁱ r7 = p288.C3397.f13249
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1512.m5091(ˎʻ.ˑʽ):java.lang.Object");
    }
}
