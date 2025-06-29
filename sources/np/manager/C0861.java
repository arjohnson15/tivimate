package np.manager;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: np.manager.̅, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0861 {

    /* renamed from: ̅, reason: not valid java name and contains not printable characters */
    public static boolean f3903 = false;

    /* renamed from: ̍, reason: not valid java name and contains not printable characters */
    private static final short[] f3904 = {1853, 1841, 1822, 1834, 1853, 1800, 1817, 1834, 1798, 1800, 1851, 1843, 1852, 1846, 1898, 1816, 1851, 1800, 1809, 1837, 1802, 1901, 1843, 1841, 1853, 1848, 1890, 1890, 1574, 1613, 1606, 1547, 1587, 1553, 1593, 1551, 1565, 1554, 1563, 1610, 1563, 1580, 1610, 1592, 1563, 1576, 1585, 1549, 1578, 1613, 1555, 1553, 1565, 1560, 1602, 1602};

    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    public static boolean f3905 = true;

    /* renamed from: ̍, reason: not valid java name and contains not printable characters */
    public static String m3553(Object obj) {
        String name = ((Method) obj).getName();
        while (true) {
            int i = 1708705 ^ 14757;
            while (true) {
                switch (i) {
                    case -1060848036:
                        return name;
                    case 1714948:
                        i = -1060848036;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x002b -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3554(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.StringBuilder r0 = r0.append(r1)
        Le:
            r7 = 1709077(0x1a1415, float:2.394927E-39)
            goto L12
        L12:
            r9 = 37493(0x9275, float:5.2539E-41)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case -1834964072: goto L2a;
                case 1738336: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L26
        L26:
            r7 = -1834964072(0xffffffff92a0ab98, float:-1.0139721E-27)
            goto L17
        L2a:
            return r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3554(java.lang.Object, java.lang.Object):java.lang.StringBuilder");
    }

    /* renamed from: ̐, reason: not valid java name and contains not printable characters */
    public static void m3555(Object obj) throws IOException {
        ((FileInputStream) obj).close();
        while (true) {
            int i = 1736853 ^ 14667;
            while (true) {
                switch (i) {
                    case 1751518:
                        i = 401229226;
                    case 401229226:
                        return;
                }
            }
        }
    }

    /* renamed from: ̒, reason: not valid java name and contains not printable characters */
    public static Method m3556(Object obj, Object obj2, Object obj3) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        while (true) {
            int i = 1736884 ^ 52863;
            while (true) {
                switch (i) {
                    case 1724107:
                        i = 107826461;
                    case 107826461:
                        return declaredMethod;
                }
            }
        }
    }

    /* renamed from: ̓, reason: not valid java name and contains not printable characters */
    public static Object m3557(Object obj, Object obj2, Object obj3) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) obj, (Class[]) obj2, (InvocationHandler) obj3);
        while (true) {
            int i = 1736915 ^ 53927;
            while (true) {
                switch (i) {
                    case -185574588:
                        return objNewProxyInstance;
                    case 1725044:
                        i = -185574588;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̔, reason: not valid java name and contains not printable characters */
    public static android.content.pm.ApplicationInfo m3558(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
        La:
            r6 = 1736946(0x1a80f2, float:2.43398E-39)
            goto Le
        Le:
            r8 = 32721(0x7fd1, float:4.5852E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 1769251: goto L17;
                case 963244506: goto L22;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L24
        L22:
            return r0
            goto L18
        L24:
            r6 = 963244506(0x3969f1da, float:2.2310708E-4)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3558(java.lang.Object):android.content.pm.ApplicationInfo");
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̕, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m3559(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = m3610(r0)
        La:
            r6 = 1736977(0x1a8111, float:2.434023E-39)
            goto Le
        Le:
            r8 = 68985(0x10d79, float:9.6669E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 1805416: goto L17;
                case 669882869: goto L22;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L24
        L22:
            return r0
            goto L18
        L24:
            r6 = 669882869(0x27ed99f5, float:6.5947635E-15)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3559(java.lang.Object):java.lang.Class");
    }

    /* renamed from: ̖, reason: not valid java name and contains not printable characters */
    public static Object m3560(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        Object obj3 = ((Field) obj).get(obj2);
        while (true) {
            int i = 1737008 ^ 99635;
            while (true) {
                switch (i) {
                    case 1770499:
                        i = 376315454;
                    case 376315454:
                        return obj3;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0029 -> 0x001e
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static java.lang.reflect.Field m3561(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
        L10:
            r7 = 1708457(0x1a11a9, float:2.394058E-39)
            goto L14
        L14:
            r9 = 84519(0x14a27, float:1.18436E-40)
            r7 = r7 ^ r9
        L19:
            switch(r7) {
                case -155771795: goto L28;
                case 1792910: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L10
        L1d:
            goto L2a
        L28:
            return r0
            goto L1e
        L2a:
            r7 = -155771795(0xfffffffff6b71c6d, float:-1.8569665E33)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3561(java.lang.Object, java.lang.Object):java.lang.reflect.Field");
    }

    /* renamed from: ̘, reason: not valid java name and contains not printable characters */
    public static Object m3562(Object obj) {
        Object next = ((Iterator) obj).next();
        while (true) {
            int i = 53062561 ^ 35300;
            while (true) {
                switch (i) {
                    case -1796589631:
                        return next;
                    case 53027397:
                        i = -1796589631;
                }
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static void m3563(Object obj, boolean z) {
        ((Method) obj).setAccessible(z);
        while (true) {
            int i = 52971328 ^ 42116;
            while (true) {
                switch (i) {
                    case 53011396:
                        i = 2128239431;
                    case 2128239431:
                        return;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̚, reason: not valid java name and contains not printable characters */
    public static int m3564(java.lang.Object r84, int r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.codePointAt(r1)
        Le:
            r7 = 52971700(0x32848b4, float:4.945422E-37)
            goto L12
        L12:
            r9 = 79775(0x1379f, float:1.11789E-40)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 53051179: goto L1b;
                case 1354204712: goto L26;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L28
        L26:
            return r0
            goto L1c
        L28:
            r7 = 1354204712(0x50b78628, float:2.463218E10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3564(java.lang.Object, int):int");
    }

    /* renamed from: ̜, reason: not valid java name and contains not printable characters */
    public static void m3565(Object obj, Object obj2) throws IOException {
        ((DataInputStream) obj).readFully((byte[]) obj2);
        while (true) {
            int i = 52999476 ^ 51839;
            while (true) {
                switch (i) {
                    case -704626988:
                        return;
                    case 52985675:
                        i = -704626988;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:252)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:55)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 7 */
    /* renamed from: ̝, reason: not valid java name and contains not printable characters */
    public static int m3566(java.lang.Object r84, java.lang.Object r85) {
        /*
            r0 = 1
            return r0
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            int r0 = android.util.Log.e(r0, r1)
        L14:
            r7 = 52999507(0x328b553, float:4.9578913E-37)
            goto L18
        L18:
            r9 = 51794(0xca52, float:7.2579E-41)
            r7 = r7 ^ r9
        L1d:
            switch(r7) {
                case -998035074: goto L23;
                case 52985601: goto L21;
                default: goto L20;
            }
        L20:
            goto L14
        L21:
            goto L30
        L22:
        L23:
            return r0
            goto L22
        L30:
            r7 = -998035074(0xffffffffc483317e, float:-1049.5466)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3566(java.lang.Object, java.lang.Object):int");
    }

    /* renamed from: ̞, reason: not valid java name and contains not printable characters */
    public static Class m3567(Object obj) {
        Class<?> cls = obj.getClass();
        while (true) {
            int i = 52999538 ^ 64882;
            while (true) {
                switch (i) {
                    case -1291322145:
                        return cls;
                    case 52971520:
                        i = -1291322145;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3568(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.io.File r0 = (java.io.File) r0
            java.lang.String r0 = r0.getAbsolutePath()
        La:
            r6 = 52999569(0x328b591, float:4.957919E-37)
            goto Le
        Le:
            r8 = 16735(0x415f, float:2.3451E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -142588790: goto L22;
                case 53015758: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L24
        L22:
            return r0
            goto L18
        L24:
            r6 = -142588790(0xfffffffff780448a, float:-5.203157E33)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3568(java.lang.Object):java.lang.String");
    }

    /*  JADX ERROR: Failed to set jump: 0x0021 -> 0x0016
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3569(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.String r0 = r0.toString()
        L8:
            r6 = 52999600(0x328b5b0, float:4.957933E-37)
            goto Lc
        Lc:
            r8 = 48986(0xbf5a, float:6.8644E-41)
            r6 = r6 ^ r8
        L11:
            switch(r6) {
                case -435965172: goto L20;
                case 52955882: goto L15;
                default: goto L14;
            }
        L14:
            goto L8
        L15:
            goto L22
        L20:
            return r0
            goto L16
        L22:
            r6 = -435965172(0xffffffffe603b30c, float:-1.5548321E23)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3569(java.lang.Object):java.lang.String");
    }

    /* renamed from: ̡, reason: not valid java name and contains not printable characters */
    public static Boolean m3570(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        while (true) {
            int i = 52999631 ^ 41094;
            while (true) {
                switch (i) {
                    case -729370031:
                        return boolValueOf;
                    case 52958537:
                        i = -729370031;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̢, reason: not valid java name and contains not printable characters */
    public static int m3571(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
        La:
            r6 = 52971080(0x3284648, float:4.945144E-37)
            goto Le
        Le:
            r8 = 80438(0x13a36, float:1.12718E-40)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -1261571038: goto L26;
                case 53050494: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = -1261571038(0xffffffffb4cdf422, float:-3.8361856E-7)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3571(java.lang.Object):int");
    }

    /* renamed from: ̩, reason: not valid java name and contains not printable characters */
    public static Object m3572(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = ((Method) obj).invoke(obj2, (Object[]) obj3);
        while (true) {
            int i = 53074093 ^ 86055;
            while (true) {
                switch (i) {
                    case -252741314:
                        return objInvoke;
                    case 52988042:
                        i = -252741314;
                }
            }
        }
    }

    /* renamed from: ̪, reason: not valid java name and contains not printable characters */
    public static boolean m3573(Object obj, Object obj2) {
        boolean zAdd = ((ArrayList) obj).add(obj2);
        while (true) {
            int i = 52982860 ^ 57466;
            while (true) {
                switch (i) {
                    case -622949683:
                        return zAdd;
                    case 52991030:
                        i = -622949683;
                }
            }
        }
    }

    /* renamed from: ̫, reason: not valid java name and contains not printable characters */
    public static int m3574(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        while (true) {
            int i = 52983232 ^ 60659;
            while (true) {
                switch (i) {
                    case -1397034920:
                        return iIntValue;
                    case 52992307:
                        i = -1397034920;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0021 -> 0x0016
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̬, reason: not valid java name and contains not printable characters */
    public static int m3575(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            int r0 = r0.hashCode()
        L8:
            r6 = 53011008(0x328e240, float:4.9630485E-37)
            goto Lc
        Lc:
            r8 = 49113(0xbfd9, float:6.8822E-41)
            r6 = r6 ^ r8
        L11:
            switch(r6) {
                case 52977049: goto L15;
                case 839180358: goto L20;
                default: goto L14;
            }
        L14:
            goto L8
        L15:
            goto L22
        L20:
            return r0
            goto L16
        L22:
            r6 = 839180358(0x3204e046, float:7.734405E-9)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3575(java.lang.Object):int");
    }

    /* renamed from: ̯, reason: not valid java name and contains not printable characters */
    public static void m3576(Object obj) {
        ((Application) obj).onCreate();
        while (true) {
            int i = 53011039 ^ 71708;
            while (true) {
                switch (i) {
                    case 53082691:
                        i = 545685052;
                    case 545685052:
                        return;
                }
            }
        }
    }

    /* renamed from: ̲, reason: not valid java name and contains not printable characters */
    public static boolean m3577() {
        while (true) {
            int i = 53011070 ^ 24497;
            while (true) {
                switch (i) {
                    case 53001679:
                        i = 252326672;
                    case 252326672:
                        return true;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:252)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:55)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 7 */
    /* renamed from: ̳, reason: not valid java name and contains not printable characters */
    public static int m3578(java.lang.Object r84, java.lang.Object r85) {
        /*
            r0 = 1
            return r0
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            int r0 = android.util.Log.i(r0, r1)
        L14:
            r7 = 53011101(0x328e29d, float:4.96309E-37)
            goto L18
        L18:
            r9 = 89247(0x15c9f, float:1.25062E-40)
            r7 = r7 ^ r9
        L1d:
            switch(r7) {
                case 53067266: goto L21;
                case 1401039958: goto L23;
                default: goto L20;
            }
        L20:
            goto L14
        L21:
            goto L25
        L22:
        L23:
            return r0
            goto L22
        L25:
            r7 = 1401039958(0x53822c56, float:1.1181792E12)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3578(java.lang.Object, java.lang.Object):int");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̴, reason: not valid java name and contains not printable characters */
    public static byte[] m3579(java.lang.Object r84, int r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = android.util.Base64.decode(r0, r1)
        Le:
            r7 = 53011132(0x328e2bc, float:4.963104E-37)
            goto L12
        L12:
            r9 = 98734(0x181ae, float:1.38356E-40)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 53043986: goto L1b;
                case 1107818212: goto L26;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L28
        L26:
            return r0
            goto L1c
        L28:
            r7 = 1107818212(0x4207f6e4, float:33.991104)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3579(java.lang.Object, int):byte[]");
    }

    /* renamed from: ̵, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3580(Object obj, Object obj2) {
        StringBuilder sbAppend = ((StringBuilder) obj).append((String) obj2);
        while (true) {
            int i = 53011163 ^ 34366;
            while (true) {
                switch (i) {
                    case 52978917:
                        i = 814349301;
                    case 814349301:
                        return sbAppend;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̶, reason: not valid java name and contains not printable characters */
    public static java.util.Iterator m3581(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            r6 = 52982612(0x3287354, float:4.9503153E-37)
            goto Le
        Le:
            r8 = 29716(0x7414, float:4.1641E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 52954944: goto L17;
                case 282086684: goto L22;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L24
        L22:
            return r0
            goto L18
        L24:
            r6 = 282086684(0x10d04d1c, float:8.216034E-29)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3581(java.lang.Object):java.util.Iterator");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̹, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3583(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
        La:
            r6 = 53872064(0x33605c0, float:5.3491594E-37)
            goto Le
        Le:
            r8 = 94781(0x1723d, float:1.32816E-40)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -561714770: goto L26;
                case 53966845: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = -561714770(0xffffffffde84e9ae, float:-4.7886887E18)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3583(java.lang.Object):java.lang.Object");
    }

    /* renamed from: ̻, reason: not valid java name and contains not printable characters */
    public static boolean m3584(Object obj, Object obj2) {
        boolean zRemove = ((ArrayList) obj).remove(obj2);
        while (true) {
            int i = 53872095 ^ 42293;
            while (true) {
                switch (i) {
                    case -855111903:
                        return zRemove;
                    case 53911786:
                        i = -855111903;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0029 -> 0x001a
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̼, reason: not valid java name and contains not printable characters */
    public static boolean m3585(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            boolean r0 = r0.equals(r1)
        Lc:
            r7 = 53872126(0x33605fe, float:5.349187E-37)
            goto L10
        L10:
            r9 = 30777(0x7839, float:4.3128E-41)
            r7 = r7 ^ r9
        L15:
            switch(r7) {
                case -1148464980: goto L28;
                case 53902791: goto L19;
                default: goto L18;
            }
        L18:
            goto Lc
        L19:
            goto L24
        L24:
            r7 = -1148464980(0xffffffffbb8bd0ac, float:-0.004266819)
            goto L15
        L28:
            return r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3585(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: ̽, reason: not valid java name and contains not printable characters */
    public static int m3586(Object obj) {
        int i = ((DataInputStream) obj).read();
        while (true) {
            int i2 = 53872157 ^ 68186;
            while (true) {
                switch (i2) {
                    case 370407:
                        return i;
                    case 53939271:
                        i2 = 370407;
                }
            }
        }
    }

    /* renamed from: ̾, reason: not valid java name and contains not printable characters */
    public static boolean m3587(Object obj, Object obj2) {
        boolean zContains = ((String) obj).contains((CharSequence) obj2);
        while (true) {
            int i = 53872188 ^ 97551;
            while (true) {
                switch (i) {
                    case -293155279:
                        return zContains;
                    case 53967667:
                        i = -293155279;
                }
            }
        }
    }

    /* renamed from: ̿, reason: not valid java name and contains not printable characters */
    public static int m3588(Object obj) throws IOException {
        int i = ((DataInputStream) obj).readInt();
        while (true) {
            int i2 = 53872219 ^ 81210;
            while (true) {
                switch (i2) {
                    case -586447739:
                        return i;
                    case 53951329:
                        i2 = -586447739;
                }
            }
        }
    }

    /* renamed from: ͂, reason: not valid java name and contains not printable characters */
    public static String m3589(Object obj) {
        String stackTraceString = Log.getStackTraceString((Throwable) obj);
        while (true) {
            int i = 53843668 ^ 76190;
            while (true) {
                switch (i) {
                    case -1118806686:
                        return stackTraceString;
                    case 53788490:
                        i = -1118806686;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̓, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3590(java.lang.Object r84, char r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.StringBuilder r0 = r0.append(r1)
        Le:
            r7 = 53936110(0x336ffee, float:5.3778786E-37)
            goto L12
        L12:
            r9 = 12998(0x32c6, float:1.8214E-41)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 53923112: goto L1b;
                case 1796862984: goto L26;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L28
        L26:
            return r0
            goto L1c
        L28:
            r7 = 1796862984(0x6b19f408, float:1.8611806E26)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3590(java.lang.Object, char):java.lang.StringBuilder");
    }

    /* renamed from: ͅ, reason: not valid java name and contains not printable characters */
    public static Set m3591(Object obj) {
        Set setKeySet = ((Map) obj).keySet();
        while (true) {
            int i = 53844877 ^ 44036;
            while (true) {
                switch (i) {
                    case 53819273:
                        i = 1426760808;
                    case 1426760808:
                        return setKeySet;
                }
            }
        }
    }

    /* renamed from: ͆, reason: not valid java name and contains not printable characters */
    public static Collection m3592(Object obj) {
        Collection collectionValues = ((ArrayMap) obj).values();
        while (true) {
            int i = 53845249 ^ 52862;
            while (true) {
                switch (i) {
                    case 53826431:
                        i = 652571678;
                    case 652571678:
                        return collectionValues;
                }
            }
        }
    }

    /* renamed from: ͇, reason: not valid java name and contains not printable characters */
    public static Iterator m3593(Object obj) {
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            int i = 53873025 ^ 25125;
            while (true) {
                switch (i) {
                    case -1406165135:
                        return it;
                    case 53898148:
                        i = -1406165135;
                }
            }
        }
    }

    /* renamed from: ͈, reason: not valid java name and contains not printable characters */
    public static Thread m3594() {
        Thread threadCurrentThread = Thread.currentThread();
        while (true) {
            int i = 53873056 ^ 55512;
            while (true) {
                switch (i) {
                    case -1699489011:
                        return threadCurrentThread;
                    case 53924216:
                        i = -1699489011;
                }
            }
        }
    }

    /* renamed from: ͉, reason: not valid java name and contains not printable characters */
    public static Object m3595(Object obj, Object obj2) {
        Object obj3 = ((Map) obj).get(obj2);
        while (true) {
            int i = 53873087 ^ 74156;
            while (true) {
                switch (i) {
                    case -1992872966:
                        return obj3;
                    case 53946387:
                        i = -1992872966;
                }
            }
        }
    }

    /* renamed from: ͊, reason: not valid java name and contains not printable characters */
    public static String m3596(Object obj, Object obj2, Object obj3) {
        String strReplace = ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        while (true) {
            int i = 53873118 ^ 35302;
            while (true) {
                switch (i) {
                    case -844134504:
                        return strReplace;
                    case 53903416:
                        i = -844134504;
                }
            }
        }
    }

    /* renamed from: ͋, reason: not valid java name and contains not printable characters */
    public static PackageManager m3597(Object obj) {
        PackageManager packageManager = ((Context) obj).getPackageManager();
        while (true) {
            int i = 53873149 ^ 15709;
            while (true) {
                switch (i) {
                    case -1137563230:
                        return packageManager;
                    case 53884064:
                        i = -1137563230;
                }
            }
        }
    }

    /* renamed from: ͌, reason: not valid java name and contains not printable characters */
    public static void m3598(Object obj, boolean z) {
        ((Field) obj).setAccessible(z);
        while (true) {
            int i = 53873180 ^ 15332;
            while (true) {
                switch (i) {
                    case -1430970268:
                        return;
                    case 53883384:
                        i = -1430970268;
                }
            }
        }
    }

    /* renamed from: ͍, reason: not valid java name and contains not printable characters */
    public static Signature[] m3599(Object obj) {
        Signature[] apkContentsSigners = ((SigningInfo) obj).getApkContentsSigners();
        while (true) {
            int i = 53844629 ^ 5462;
            while (true) {
                switch (i) {
                    case -1963211797:
                        return apkContentsSigners;
                    case 53841859:
                        i = -1963211797;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0075 -> 0x004c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ͎, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3600(short[] r87, int r88, int r89, int r90) {
        /*
            r39 = r90
            r38 = r89
            r37 = r88
            r36 = r87
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            char[] r1 = new char[r5]
            r0 = 0
        L13:
            r12 = 53937071(0x33703af, float:5.3783095E-37)
            goto L17
        L17:
            r14 = 69100(0x10dec, float:9.683E-41)
            r12 = r12 ^ r14
        L1c:
            switch(r12) {
                case -1934634591: goto L82;
                case -1087930910: goto L76;
                case 53874243: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L13
        L20:
            goto L66
        L21:
            int r2 = r4 + r0
            short r2 = r3[r2]
            r2 = r2 ^ r6
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
        L2b:
            r12 = 53845838(0x3359f4e, float:5.337399E-37)
            goto L2f
        L2f:
            r14 = 66432(0x10380, float:9.3091E-41)
            r12 = r12 ^ r14
        L34:
            switch(r12) {
                case 53779662: goto L38;
                case 582314413: goto L87;
                default: goto L37;
            }
        L37:
            goto L2b
        L38:
            goto L5a
        L39:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L3e:
            r12 = 53846210(0x335a0c2, float:5.337566E-37)
            goto L42
        L42:
            r14 = 32967(0x80c7, float:4.6197E-41)
            r12 = r12 ^ r14
        L47:
            switch(r12) {
                case -191849242: goto L74;
                case 53813253: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L3e
        L4b:
            goto L83
        L5a:
            r12 = 582314413(0x22b569ad, float:4.9172037E-18)
            goto L34
        L5e:
            r12 = -1087930910(0xffffffffbf277de2, float:-0.65426457)
            goto L1c
        L62:
            r12 = -1934697395(0xffffffff8caedc4d, float:-2.6941534E-31)
            goto L17
        L66:
            if (r0 >= r5) goto L62
            goto L5e
        L74:
            return r0
            goto L4c
        L76:
            goto L21
        L82:
            goto L39
        L83:
            r12 = -191849242(0xfffffffff4909ce6, float:-9.1659305E31)
            goto L47
        L87:
            goto L13
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3600(short[], int, int, int):java.lang.String");
    }

    /*  JADX ERROR: Failed to set jump: 0x0021 -> 0x0016
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ͏, reason: not valid java name and contains not printable characters */
    public static java.lang.Integer m3601(int r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L8:
            r6 = 53873986(0x3360d42, float:5.350021E-37)
            goto Lc
        Lc:
            r8 = 91176(0x16428, float:1.27765E-40)
            r6 = r6 ^ r8
        L11:
            switch(r6) {
                case 53963114: goto L15;
                case 2044410685: goto L20;
                default: goto L14;
            }
        L14:
            goto L8
        L15:
            goto L22
        L20:
            return r0
            goto L16
        L22:
            r6 = 2044410685(0x79db3b3d, float:1.4228931E35)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3601(int):java.lang.Integer");
    }

    /* renamed from: ͐, reason: not valid java name and contains not printable characters */
    public static ClassLoader m3602(Object obj) {
        ClassLoader classLoader = ((Class) obj).getClassLoader();
        while (true) {
            int i = 53874017 ^ 82726;
            while (true) {
                switch (i) {
                    case 53956167:
                        i = 1750869680;
                    case 1750869680:
                        return classLoader;
                }
            }
        }
    }

    /* renamed from: ͑, reason: not valid java name and contains not printable characters */
    public static boolean m3603(Object obj) {
        boolean zExists = ((File) obj).exists();
        while (true) {
            int i = 53874048 ^ 75239;
            while (true) {
                switch (i) {
                    case 53946471:
                        i = 1457605104;
                    case 1457605104:
                        return zExists;
                }
            }
        }
    }

    /* renamed from: ͒, reason: not valid java name and contains not printable characters */
    public static Method m3604(Object obj, Object obj2, Object obj3) throws NoSuchMethodException, SecurityException {
        Method method = ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        while (true) {
            int i = 53874079 ^ 54146;
            while (true) {
                switch (i) {
                    case -1688624195:
                        return method;
                    case 53927453:
                        i = -1688624195;
                }
            }
        }
    }

    /* renamed from: ͓, reason: not valid java name and contains not printable characters */
    public static boolean m3605(Object obj) {
        boolean zHasNext = ((Iterator) obj).hasNext();
        while (true) {
            int i = 53874110 ^ 32261;
            while (true) {
                switch (i) {
                    case -1982068539:
                        return zHasNext;
                    case 53900219:
                        i = -1982068539;
                }
            }
        }
    }

    /* renamed from: ͔, reason: not valid java name and contains not printable characters */
    public static void m3606(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException {
        ((Field) obj).set(obj2, obj3);
        while (true) {
            int i = 53874141 ^ 5767;
            while (true) {
                switch (i) {
                    case 53877594:
                        i = 2019519430;
                    case 2019519430:
                        return;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ͕, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3607(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r0 = r0.getPackageName()
        La:
            r6 = 53845590(0x3359e56, float:5.337288E-37)
            goto Le
        Le:
            r8 = 65353(0xff49, float:9.1579E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 53829919: goto L17;
                case 1487324983: goto L22;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L24
        L22:
            return r0
            goto L18
        L24:
            r6 = 1487324983(0x58a6c737, float:1.4669964E15)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0861.m3607(java.lang.Object):java.lang.String");
    }

    /* renamed from: ͗, reason: not valid java name and contains not printable characters */
    public static int m3609(Object obj) {
        int iHashCode = obj.hashCode();
        while (true) {
            int i = 53938032 ^ 35211;
            while (true) {
                switch (i) {
                    case 53972731:
                        i = 1533273916;
                    case 1533273916:
                        return iHashCode;
                }
            }
        }
    }

    /* renamed from: ͚, reason: not valid java name and contains not printable characters */
    public static boolean m3612() {
        while (true) {
            int i = 53875009 ^ 93479;
            while (true) {
                switch (i) {
                    case 53967974:
                        i = 2038357784;
                    case 2038357784:
                        return false;
                }
            }
        }
    }

    /* renamed from: ͗, reason: not valid java name and contains not printable characters */
    public static Class<?> m3610(String str) throws ClassNotFoundException {
        Class<?> cls = Class.forName(str);
        while (true) {
            int i = 53846799 ^ 39678;
            while (true) {
                switch (i) {
                    case 53819889:
                        i = 1163078315;
                    case 1163078315:
                        return cls;
                }
            }
        }
    }

    /* renamed from: ̷, reason: not valid java name and contains not printable characters */
    public static String m3582(Object obj) {
        String str;
        String name = ((Class) obj).getName();
        int iHashCode = Base64.encodeToString(name.getBytes(), 0).trim().hashCode();
        int iHashCode2 = m3611(f3904, 1748420 ^ m3609((Object) "ۡۙۜ"), 1758967 ^ m3609((Object) "۬ۘۗ"), 1755000 ^ m3609((Object) "ۦۖۗ")).hashCode();
        while (true) {
            char c = 64557;
            while (true) {
                int i = c ^ 13510;
                while (true) {
                    switch (i) {
                        case -1228610870:
                            str = new String(Base64.decode(m3611(f3904, 1752185 ^ m3609((Object) "ۥۖۖ"), 1738322 ^ m3609((Object) "ۖۨ۠"), 1757888 ^ m3609((Object) "۫ۥۙ")), 0));
                            break;
                        case 53987563:
                            if (iHashCode != iHashCode2) {
                                i = -1228610870;
                            }
                            break;
                        case 1658617613:
                            str = name;
                            while (true) {
                                int i2 = 53844288 ^ 36995;
                                while (true) {
                                    switch (i2) {
                                        case 53807555:
                                            i2 = 1497090076;
                                        case 1497090076:
                                            break;
                                    }
                                }
                            }
                    }
                }
                c = 19403;
            }
        }
        while (true) {
            int i3 = 53843916 ^ 19689;
            while (true) {
                switch (i3) {
                    case -2023757246:
                        return str;
                    case 53861157:
                        i3 = -2023757246;
                }
            }
        }
    }

    /* renamed from: ͖, reason: not valid java name and contains not printable characters */
    public static String m3608(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            charArray[i] = (char) (charArray[i] ^ 27016);
            if (i + 1 < charArray.length) {
                i++;
                charArray[i] = (char) (charArray[i] ^ i);
            }
            i++;
        }
        return new String(charArray);
    }

    /* renamed from: ͗, reason: not valid java name and contains not printable characters */
    public static String m3611(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            char c = 42115;
            while (true) {
                int i5 = c ^ 22227;
                while (true) {
                    switch (i5) {
                        case -1815502693:
                            cArr[i4] = (char) (sArr[i + i4] ^ i3);
                            i4++;
                            while (true) {
                                int i6 = 53874947 ^ 49642;
                                while (true) {
                                    switch (i6) {
                                        case -1669765929:
                                            break;
                                        case 53924073:
                                            i6 = -1669765929;
                                    }
                                }
                            }
                            break;
                        case -1707140652:
                            String str = new String(cArr);
                            while (true) {
                                int i7 = 53874978 ^ 72965;
                                while (true) {
                                    switch (i7) {
                                        case -1963084101:
                                            return str;
                                        case 53939239:
                                            i7 = -1963084101;
                                    }
                                }
                            }
                        case 53867088:
                            if (i4 < i2) {
                                i5 = -1815502693;
                            }
                            break;
                    }
                }
                c = 20231;
            }
        }
    }
}
