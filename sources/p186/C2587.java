package p186;

import android.content.Context;
import ar.tvplayer.tv.LibTvPlayerApplication;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import p288.C3406;

/* renamed from: ˎʼ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2587 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3406 f10274 = null;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3406 f10275 = new C3406();

    static {
        Object objM1484i = LibTvPlayerApplication.m1484i(31);
        LibTvPlayerApplication.m1499i(28, objM1484i, 13);
        Object objM1484i2 = LibTvPlayerApplication.m1484i(27);
        LibTvPlayerApplication.m1502i(26, objM1484i2, objM1484i);
        LibTvPlayerApplication.m1498i(417, objM1484i2);
        Object objM1484i3 = LibTvPlayerApplication.m1484i(31);
        LibTvPlayerApplication.m1499i(28, objM1484i3, 14);
        Object objM1484i4 = LibTvPlayerApplication.m1484i(27);
        LibTvPlayerApplication.m1502i(26, objM1484i4, objM1484i3);
        LibTvPlayerApplication.m1498i(555, objM1484i4);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6712() {
        Object objI;
        if (LibTvPlayerApplication.m1510i(760)) {
            LibTvPlayerApplication.m1484i(123);
            Object objM1484i = LibTvPlayerApplication.m1484i(826);
            if (objM1484i != null) {
                Object objM1490i = LibTvPlayerApplication.m1490i(-1, LibTvPlayerApplication.m1488i(88, objM1484i), (Object) ProtectedTvPlayerApplication.s("t"));
                if (LibTvPlayerApplication.m1512i(-2, objM1490i)) {
                    objM1490i = null;
                }
                if (objM1490i != null && (objI = LibTvPlayerApplication.i(543, 3, objM1490i)) != null && LibTvPlayerApplication.i(522, objI) == '.') {
                    return;
                }
            }
            LibTvPlayerApplication.m1509i(540, false);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C2571 m6713() {
        return (C2571) LibTvPlayerApplication.m1488i(84, LibTvPlayerApplication.m1484i(852));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:252)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:55)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 7, instructions: 13 */
    /* renamed from: ˉי, reason: contains not printable characters */
    public static boolean m6714(int r11, java.lang.String r12) {
        /*
            r2 = 1
            return r2
            r11 = r11 & r2
            if (r11 == 0) goto L7
            java.lang.String r12 = ""
        L7:
            r0 = 85
            java.lang.Object r11 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)
            r0 = 293(0x125, float:4.1E-43)
            java.lang.Object r11 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r11)     // Catch: java.lang.Throwable -> L94
            r0 = 564(0x234, float:7.9E-43)
            java.lang.Object[] r3 = ar.tvplayer.tv.LibTvPlayerApplication.m1520i(r0, r11, r12)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L94
            int r4 = r3.length     // Catch: java.lang.Throwable -> L94
            r5 = 0
            r6 = 0
        L1e:
            if (r6 >= r4) goto L94
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L94
            r0 = 182(0xb6, float:2.55E-43)
            int r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1480i(r0, r12)     // Catch: java.lang.Throwable -> L94
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            r0 = 783(0x30f, float:1.097E-42)
            java.lang.Object r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)     // Catch: java.lang.Throwable -> L94
            r0 = 227(0xe3, float:3.18E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1498i(r0, r8)     // Catch: java.lang.Throwable -> L94
            r0 = 17
            ar.tvplayer.tv.LibTvPlayerApplication.m1490i(r0, r8, r12)     // Catch: java.lang.Throwable -> L94
            r9 = 47
            r0 = 531(0x213, float:7.44E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.i(r0, r8, r9)     // Catch: java.lang.Throwable -> L94
            r0 = 17
            ar.tvplayer.tv.LibTvPlayerApplication.m1490i(r0, r8, r7)     // Catch: java.lang.Throwable -> L94
            r0 = 319(0x13f, float:4.47E-43)
            java.lang.Object r7 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r8)     // Catch: java.lang.Throwable -> L94
        L4d:
            r0 = 281(0x119, float:3.94E-43)
            java.lang.Object r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1490i(r0, r11, r7)     // Catch: java.lang.Throwable -> L87
            boolean r9 = r8 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L5a
            java.io.BufferedInputStream r8 = (java.io.BufferedInputStream) r8     // Catch: java.lang.Throwable -> L87
            goto L68
        L5a:
            r0 = 372(0x174, float:5.21E-43)
            java.lang.Object r9 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)     // Catch: java.lang.Throwable -> L87
            r10 = 8192(0x2000, float:1.148E-41)
            r0 = 323(0x143, float:4.53E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1503i(r0, r9, r8, r10)     // Catch: java.lang.Throwable -> L87
            r8 = r9
        L68:
            r0 = 646(0x286, float:9.05E-43)
            boolean r9 = ar.tvplayer.tv.LibTvPlayerApplication.m1512i(r0, r8)     // Catch: java.lang.Throwable -> L7e
            r10 = 0
            if (r9 == 0) goto L78
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r8, r10)     // Catch: java.lang.Throwable -> L87
        L76:
            r2 = 0
            goto L94
        L78:
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r8, r10)     // Catch: java.lang.Throwable -> L87
            goto L91
        L7e:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L80
        L80:
            r10 = move-exception
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r8, r9)     // Catch: java.lang.Throwable -> L87
            throw r10     // Catch: java.lang.Throwable -> L87
        L87:
            r8 = 2
            r0 = 389(0x185, float:5.45E-43)
            boolean r7 = ar.tvplayer.tv.LibTvPlayerApplication.m1511i(r0, r8, r7)     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L91
            goto L76
        L91:
            int r6 = r6 + 1
            goto L1e
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p186.C2587.m6714(int, java.lang.String):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:252)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:55)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 9 */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m6715(android.content.Context r8) {
        /*
            r1 = 1
            return r1
            r0 = 317(0x13d, float:4.44E-43)
            java.lang.Object r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class r8 = java.lang.Class.forName(r8)
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.Object[] r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1519i(r0, r8)
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L19:
            r5 = 1
            if (r4 >= r2) goto L2d
            r6 = r8[r4]
            java.lang.Class<java.lang.reflect.InvocationHandler> r7 = java.lang.reflect.InvocationHandler.class
            r0 = 40
            boolean r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1513i(r0, r6, r7)
            if (r6 == 0) goto L2a
            r3 = 1
            goto L2d
        L2a:
            int r4 = r4 + 1
            goto L19
        L2d:
            r8 = r3 ^ 1
            r0 = 309(0x135, float:4.33E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1509i(r0, r8)
            r0 = 176(0xb0, float:2.47E-43)
            boolean r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1510i(r0)
            if (r8 != 0) goto L41
            r0 = 228(0xe4, float:3.2E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1494i(r0)
        L41:
            r0 = 176(0xb0, float:2.47E-43)
            boolean r8 = ar.tvplayer.tv.LibTvPlayerApplication.m1510i(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p186.C2587.m6715(android.content.Context):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ boolean m6716() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 11, instructions: 43 */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static boolean m6717() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 24, instructions: 61 */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static boolean m6718() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m6719(java.io.BufferedInputStream r6) {
        /*
            r2 = 0
            return r2
            r0 = 511(0x1ff, float:7.16E-43)
            java.lang.Object r3 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)     // Catch: java.lang.Throwable -> L52
            r0 = 730(0x2da, float:1.023E-42)
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r3, r6)     // Catch: java.lang.Throwable -> L52
        Ld:
            r0 = 686(0x2ae, float:9.61E-43)
            java.lang.Object r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r3)     // Catch: java.lang.Throwable -> L49
            r4 = 0
            if (r6 != 0) goto L1c
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r3, r4)     // Catch: java.lang.Throwable -> L52
            return r2
        L1c:
            r0 = 356(0x164, float:4.99E-43)
            boolean r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1512i(r0, r6)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Ld
            r0 = 804(0x324, float:1.127E-42)
            java.lang.Object r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r6)     // Catch: java.lang.Throwable -> L49
            r0 = 46
            java.lang.Object r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 2
            ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r0, r5)     // Catch: java.lang.Throwable -> L49
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.Object r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 582(0x246, float:8.16E-43)
            boolean r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1513i(r0, r6, r5)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto Ld
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r3, r4)     // Catch: java.lang.Throwable -> L52
            r6 = 1
            return r6
        L49:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r4 = move-exception
            r0 = 65
            ar.tvplayer.tv.LibTvPlayerApplication.m1502i(r0, r3, r6)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p186.C2587.m6719(java.io.BufferedInputStream):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 11 */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m6720(Context context) {
        return "ar.tvplayer.tv.ProtectedTvPlayerApplication";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e3  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m6721(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p186.C2587.m6721(java.lang.String, boolean):int");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C2579 m6722() {
        return (C2579) LibTvPlayerApplication.m1488i(84, LibTvPlayerApplication.m1484i(812));
    }

    /* JADX WARN: Unreachable blocks removed: 15, instructions: 30 */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m6723() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m6724() {
        /*
            r1 = 1
            r1 = 382(0x17e, float:5.35E-43)
            java.lang.Object r3 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r1 = 349(0x15d, float:4.89E-43)
            boolean r4 = ar.tvplayer.tv.LibTvPlayerApplication.m1510i(r1)
            r4 = 3
            r1 = 153(0x99, float:2.14E-43)
            java.lang.Object r3 = ar.tvplayer.tv.LibTvPlayerApplication.i(r1, r4, r3)
            r1 = 711(0x2c7, float:9.96E-43)
            java.lang.Object r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r1 = 153(0x99, float:2.14E-43)
            java.lang.Object r4 = ar.tvplayer.tv.LibTvPlayerApplication.i(r1, r4, r5)
            r1 = 62
            java.lang.Object r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r1 = 121(0x79, float:1.7E-43)
            java.lang.Object r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r1, r5)
            r1 = 182(0xb6, float:2.55E-43)
            int r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1480i(r1, r6)
            if (r6 != 0) goto L37
            goto L80
        L37:
            r1 = 216(0xd8, float:3.03E-43)
            int r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1480i(r1, r5)
            r7 = 5
            if (r6 >= r7) goto L48
            r1 = 226(0xe2, float:3.17E-43)
            int r6 = ar.tvplayer.tv.LibTvPlayerApplication.i(r1)
            if (r6 < r7) goto L80
        L48:
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Object r3 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r1, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            r1 = 100
            long r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1483i(r1, r3)
            r1 = 593(0x251, float:8.31E-43)
            java.lang.Object r3 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r8 = 10
            r1 = 166(0xa6, float:2.33E-43)
            long r10 = ar.tvplayer.tv.LibTvPlayerApplication.i(r1, r3, r8)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto L82
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Object r4 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r1, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            r1 = 100
            long r6 = ar.tvplayer.tv.LibTvPlayerApplication.m1483i(r1, r4)
            r1 = 166(0xa6, float:2.33E-43)
            long r3 = ar.tvplayer.tv.LibTvPlayerApplication.i(r1, r3, r8)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L82
        L80:
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            if (r3 == 0) goto L97
            r1 = 203(0xcb, float:2.84E-43)
            java.lang.Object r4 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r1 = 121(0x79, float:1.7E-43)
            java.lang.Object r4 = ar.tvplayer.tv.LibTvPlayerApplication.m1488i(r1, r5)
            r1 = 722(0x2d2, float:1.012E-42)
            ar.tvplayer.tv.LibTvPlayerApplication.m1498i(r1, r4)
            goto La9
        L97:
            java.lang.String r4 = ""
            r1 = 261(0x105, float:3.66E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1498i(r1, r4)
            r1 = 247(0xf7, float:3.46E-43)
            java.lang.Object r5 = ar.tvplayer.tv.LibTvPlayerApplication.m1484i(r1)
            r1 = 115(0x73, float:1.61E-43)
            ar.tvplayer.tv.LibTvPlayerApplication.m1498i(r1, r4)
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p186.C2587.m6724():boolean");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m6725() {
        LibTvPlayerApplication.m1488i(2, LibTvPlayerApplication.m1484i(46));
        return (String) LibTvPlayerApplication.m1484i(808);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 13 */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m6726() {
        return true;
    }
}
