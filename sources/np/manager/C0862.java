package np.manager;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: np.manager.̍, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0862 {

    /* renamed from: ̅, reason: not valid java name and contains not printable characters */
    public static boolean f3906 = false;

    /* renamed from: ̍, reason: not valid java name and contains not printable characters */
    private static final short[] f3907 = {956, 903, 947, 939, 902, 908, 1002, 1002, 954, 903, 948, 994, 1856, 1895, 1898, 1855, 1856, 1911, 1876, 1854, 1858, 1865, 1876, 1849, 1859, 1914, 1840, 1840};

    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    public static boolean f3908 = true;

    /*  JADX ERROR: Failed to set jump: 0x001d -> 0x0012
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̍, reason: not valid java name and contains not printable characters */
    public static java.lang.Thread m3613() {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
        L4:
            r6 = 53875040(0x3361160, float:5.350494E-37)
            goto L8
        L8:
            r8 = 83340(0x1458c, float:1.16784E-40)
            r6 = r6 ^ r8
        Ld:
            switch(r6) {
                case -1107692565: goto L1c;
                case 53957868: goto L11;
                default: goto L10;
            }
        L10:
            goto L4
        L11:
            goto L1e
        L1c:
            return r0
            goto L12
        L1e:
            r6 = -1107692565(0xffffffffbdf9f3eb, float:-0.12204727)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3613():java.lang.Thread");
    }

    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    public static boolean m3614() {
        while (true) {
            int i = 53875071 ^ 91572;
            while (true) {
                switch (i) {
                    case -1401235108:
                        return true;
                    case 53966027:
                        i = -1401235108;
                }
            }
        }
    }

    /* renamed from: ̐, reason: not valid java name and contains not printable characters */
    public static void m3615(Object obj, Object obj2) throws IOException {
        ((DataInputStream) obj).readFully((byte[]) obj2);
        while (true) {
            int i = 53875102 ^ 46316;
            while (true) {
                switch (i) {
                    case -1694599291:
                        return;
                    case 53912946:
                        i = -1694599291;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x002d -> 0x001e
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̒, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3616(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
        L10:
            r7 = 53846551(0x335a217, float:5.337719E-37)
            goto L14
        L14:
            r9 = 92146(0x167f2, float:1.29124E-40)
            r7 = r7 ^ r9
        L19:
            switch(r7) {
                case 53790181: goto L1d;
                case 2068060500: goto L2c;
                default: goto L1c;
            }
        L1c:
            goto L10
        L1d:
            goto L28
        L28:
            r7 = 2068060500(0x7b441954, float:1.0182039E36)
            goto L19
        L2c:
            return r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3616(java.lang.Object, java.lang.Object):java.lang.StringBuilder");
    }

    /* renamed from: ̓, reason: not valid java name and contains not printable characters */
    public static void m3617(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException {
        ((Field) obj).set(obj2, obj3);
        while (true) {
            int i = 53938993 ^ 56515;
            while (true) {
                switch (i) {
                    case 53991410:
                        i = 688721083;
                    case 688721083:
                        return;
                }
            }
        }
    }

    /* renamed from: ̔, reason: not valid java name and contains not printable characters */
    public static Object m3618(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = ((Method) obj).invoke(obj2, (Object[]) obj3);
        while (true) {
            int i = 53847760 ^ 1899;
            while (true) {
                switch (i) {
                    case 53846459:
                        i = 318641533;
                    case 318641533:
                        return objInvoke;
                }
            }
        }
    }

    /* renamed from: ̕, reason: not valid java name and contains not printable characters */
    public static String m3619(Object obj) {
        String string = obj.toString();
        while (true) {
            int i = 53848132 ^ 55832;
            while (true) {
                switch (i) {
                    case -455533038:
                        return string;
                    case 53834332:
                        i = -455533038;
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
    /* renamed from: ̖, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3620(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r0 = r0.get(r1)
        Le:
            r7 = 53875908(0x33614c4, float:5.350883E-37)
            goto L12
        L12:
            r9 = 33958(0x84a6, float:4.7585E-41)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 53907554: goto L1b;
                case 1780777560: goto L2a;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L26
        L26:
            r7 = 1780777560(0x6a248258, float:4.971984E25)
            goto L17
        L2a:
            return r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3620(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static Object m3621(Object obj) {
        Object next = ((Iterator) obj).next();
        while (true) {
            int i = 53875939 ^ 96265;
            while (true) {
                switch (i) {
                    case 53964010:
                        i = 1487304054;
                    case 1487304054:
                        return next;
                }
            }
        }
    }

    /* renamed from: ̘, reason: not valid java name and contains not printable characters */
    public static Method m3622(Object obj, Object obj2, Object obj3) throws NoSuchMethodException, SecurityException {
        Method method = ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        while (true) {
            int i = 53875970 ^ 16471;
            while (true) {
                switch (i) {
                    case 53892437:
                        i = 1193956439;
                    case 1193956439:
                        return method;
                }
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static String m3623(Object obj, Object obj2, Object obj3) {
        String strReplace = ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        while (true) {
            int i = 53876001 ^ 67079;
            while (true) {
                switch (i) {
                    case -1952309713:
                        return strReplace;
                    case 53941030:
                        i = -1952309713;
                }
            }
        }
    }

    /* renamed from: ̚, reason: not valid java name and contains not printable characters */
    public static boolean m3624(Object obj, Object obj2) {
        boolean zContains = ((String) obj).contains((CharSequence) obj2);
        while (true) {
            int i = 53876032 ^ 77897;
            while (true) {
                switch (i) {
                    case 53945609:
                        i = 2049388256;
                    case 2049388256:
                        return zContains;
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
    /* renamed from: ̜, reason: not valid java name and contains not printable characters */
    public static android.content.pm.ApplicationInfo m3625(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
        La:
            r6 = 53876063(0x336155f, float:5.3509526E-37)
            goto Le
        Le:
            r8 = 27152(0x6a10, float:3.8048E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 53903183: goto L17;
                case 1755926330: goto L22;
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
            r6 = 1755926330(0x68a94f3a, float:6.396331E24)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3625(java.lang.Object):android.content.pm.ApplicationInfo");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̝, reason: not valid java name and contains not printable characters */
    public static java.util.Set m3626(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.keySet()
        La:
            r6 = 53847512(0x335a5d8, float:5.33815E-37)
            goto Le
        Le:
            r8 = 6426(0x191a, float:9.005E-42)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 53853378: goto L17;
                case 1223686525: goto L26;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = 1223686525(0x48eff97d, float:491467.9)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3626(java.lang.Object):java.util.Set");
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̞, reason: not valid java name and contains not printable characters */
    public static int m3627(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
        La:
            r6 = 53939954(0x3370ef2, float:5.3796023E-37)
            goto Le
        Le:
            r8 = 16451(0x4043, float:2.3053E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -155684230: goto L22;
                case 53956273: goto L17;
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
            r6 = -155684230(0xfffffffff6b8727a, float:-1.8705166E33)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3627(java.lang.Object):int");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̟, reason: not valid java name and contains not printable characters */
    public static int m3628(java.lang.Object r84, int r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.codePointAt(r1)
        Le:
            r7 = 53848721(0x335aa91, float:5.338692E-37)
            goto L12
        L12:
            r9 = 58045(0xe2bd, float:8.1338E-41)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case -525823638: goto L26;
                case 53823532: goto L1b;
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
            r7 = -525823638(0xffffffffe0a8916a, float:-9.717285E19)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3628(java.lang.Object, int):int");
    }

    /*  JADX ERROR: Failed to set jump: 0x0025 -> 0x0016
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̠, reason: not valid java name and contains not printable characters */
    public static java.lang.Integer m3629(int r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L8:
            r6 = 53849093(0x335ac05, float:5.338859E-37)
            goto Lc
        Lc:
            r8 = 53918(0xd29e, float:7.5555E-41)
            r6 = r6 ^ r8
        L11:
            switch(r6) {
                case -1299908779: goto L24;
                case 53837467: goto L15;
                default: goto L14;
            }
        L14:
            goto L8
        L15:
            goto L20
        L20:
            r6 = -1299908779(0xffffffffb284f755, float:-1.5479296E-8)
            goto L11
        L24:
            return r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3629(int):java.lang.Integer");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̡, reason: not valid java name and contains not printable characters */
    public static boolean m3630(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
        La:
            r6 = 53876869(0x3361885, float:5.351314E-37)
            goto Le
        Le:
            r8 = 68560(0x10bd0, float:9.6073E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 53941077: goto L17;
                case 936338287: goto L26;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = 936338287(0x37cf636f, float:2.4722625E-5)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3630(java.lang.Object):boolean");
    }

    /*  JADX ERROR: Failed to set jump: 0x002d -> 0x0022
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̢, reason: not valid java name and contains not printable characters */
    public static int m3631(java.lang.Object r84, java.lang.Object r85) {
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
            r7 = 53876900(0x33618a4, float:5.351328E-37)
            goto L18
        L18:
            r9 = 14609(0x3911, float:2.0472E-41)
            r7 = r7 ^ r9
        L1d:
            switch(r7) {
                case 53879221: goto L21;
                case 642864721: goto L2c;
                default: goto L20;
            }
        L20:
            goto L14
        L21:
            goto L2e
        L2c:
            return r0
            goto L22
        L2e:
            r7 = 642864721(0x26515651, float:7.262842E-16)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3631(java.lang.Object, java.lang.Object):int");
    }

    /* renamed from: ̩, reason: not valid java name and contains not printable characters */
    public static String m3632(Object obj) {
        String absolutePath = ((File) obj).getAbsolutePath();
        while (true) {
            int i = 53876931 ^ 71027;
            while (true) {
                switch (i) {
                    case 53939632:
                        i = 349528242;
                    case 349528242:
                        return absolutePath;
                }
            }
        }
    }

    /* renamed from: ̪, reason: not valid java name and contains not printable characters */
    public static PackageManager m3633(Object obj) {
        PackageManager packageManager = ((Context) obj).getPackageManager();
        while (true) {
            int i = 53876962 ^ 36916;
            while (true) {
                switch (i) {
                    case 53905622:
                        i = 1498278365;
                    case 1498278365:
                        return packageManager;
                }
            }
        }
    }

    /*  JADX ERROR: Failed to set jump: 0x0033 -> 0x0024
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̫, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3634(java.lang.Object r84, java.lang.Object r85, java.lang.Object r86) {
        /*
            r35 = r86
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            r2 = r35
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.reflect.InvocationHandler r2 = (java.lang.reflect.InvocationHandler) r2
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
        L16:
            r8 = 53876993(0x3361901, float:5.3513696E-37)
            goto L1a
        L1a:
            r10 = 58632(0xe508, float:8.2161E-41)
            r8 = r8 ^ r10
        L1f:
            switch(r8) {
                case 53935113: goto L23;
                case 1204839778: goto L32;
                default: goto L22;
            }
        L22:
            goto L16
        L23:
            goto L2e
        L2e:
            r8 = 1204839778(0x47d06562, float:106698.766)
            goto L1f
        L32:
            return r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3634(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ̯, reason: not valid java name and contains not printable characters */
    public static int m3636(Object obj) {
        int length = ((String) obj).length();
        while (true) {
            int i = 52991788 ^ 10607;
            while (true) {
                switch (i) {
                    case 53001795:
                        i = 330902355;
                    case 330902355:
                        return length;
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
    /* renamed from: ̲, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3637(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
        La:
            r6 = 52991819(0x328974b, float:4.954444E-37)
            goto Le
        Le:
            r8 = 36976(0x9070, float:5.1814E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 37525709: goto L22;
                case 52954939: goto L17;
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
            r6 = 37525709(0x23c98cd, float:1.385591E-37)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3637(java.lang.Object):java.lang.String");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̳, reason: not valid java name and contains not printable characters */
    public static java.util.Collection m3638(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            android.util.ArrayMap r0 = (android.util.ArrayMap) r0
            java.util.Collection r0 = r0.values()
        La:
            r6 = 52991850(0x328976a, float:4.9544578E-37)
            goto Le
        Le:
            r8 = 3309(0xced, float:4.637E-42)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -255917101: goto L26;
                case 52992903: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = -255917101(0xfffffffff0bf03d3, float:-4.7293008E29)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3638(java.lang.Object):java.util.Collection");
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
    /* renamed from: ̴, reason: not valid java name and contains not printable characters */
    public static int m3639(java.lang.Object r84, java.lang.Object r85) {
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
            r7 = 52991881(0x3289789, float:4.9544717E-37)
            goto L18
        L18:
            r9 = 73732(0x12004, float:1.0332E-40)
            r7 = r7 ^ r9
        L1d:
            switch(r7) {
                case 53065613: goto L21;
                case 892941154: goto L32;
                default: goto L20;
            }
        L20:
            goto L14
        L21:
            goto L23
        L22:
        L23:
            r7 = 892941154(0x35393362, float:6.899264E-7)
            goto L1d
        L32:
            return r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3639(java.lang.Object, java.lang.Object):int");
    }

    /*  JADX ERROR: Failed to set jump: 0x0023 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̵, reason: not valid java name and contains not printable characters */
    public static boolean m3640(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r0 = r0.hasNext()
        La:
            r6 = 52991912(0x32897a8, float:4.9544856E-37)
            goto Le
        Le:
            r8 = 26410(0x672a, float:3.7008E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 53014658: goto L17;
                case 599490253: goto L22;
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
            r6 = 599490253(0x23bb7ecd, float:2.0328283E-17)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3640(java.lang.Object):boolean");
    }

    /*  JADX ERROR: Failed to set jump: 0x0027 -> 0x0018
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ̶, reason: not valid java name and contains not printable characters */
    public static java.util.Iterator m3641(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            r6 = 52991943(0x32897c7, float:4.9544995E-37)
            goto Le
        Le:
            r8 = 63835(0xf95b, float:8.9452E-41)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case 52981404: goto L17;
                case 306108723: goto L26;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = 306108723(0x123ed933, float:6.0221148E-28)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3641(java.lang.Object):java.util.Iterator");
    }

    /* renamed from: ̷, reason: not valid java name and contains not printable characters */
    public static Class m3642(Object obj) {
        Class<?> cls = obj.getClass();
        while (true) {
            int i = 52963392 ^ 99018;
            while (true) {
                switch (i) {
                    case -226141841:
                        return cls;
                    case 53062282:
                        i = -226141841;
                }
            }
        }
    }

    /* renamed from: ̹, reason: not valid java name and contains not printable characters */
    public static byte[] m3643(Object obj, int i) {
        byte[] bArrDecode = Base64.decode((String) obj, i);
        while (true) {
            int i2 = 1645032097 ^ 90765;
            while (true) {
                switch (i2) {
                    case -593247780:
                        return bArrDecode;
                    case 1644974124:
                        i2 = -593247780;
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
    /* renamed from: ̻, reason: not valid java name and contains not printable characters */
    public static boolean m3644(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.remove(r1)
        Le:
            r7 = 1644940864(0x620bce40, float:6.447398E20)
            goto L12
        L12:
            r9 = 15003(0x3a9b, float:2.1024E-41)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case -963453324: goto L2a;
                case 1644950747: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L26
        L26:
            r7 = -963453324(0xffffffffc692de74, float:-18799.227)
            goto L17
        L2a:
            return r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3644(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: ̼, reason: not valid java name and contains not printable characters */
    public static String m3645(Object obj) {
        String packageName = ((Context) obj).getPackageName();
        while (true) {
            int i = 1644941236 ^ 52362;
            while (true) {
                switch (i) {
                    case -1737598359:
                        return packageName;
                    case 1644888894:
                        i = -1737598359;
                }
            }
        }
    }

    /* renamed from: ̽, reason: not valid java name and contains not printable characters */
    public static void m3646(Object obj, boolean z) {
        ((Method) obj).setAccessible(z);
        while (true) {
            int i = 1644969012 ^ 9919;
            while (true) {
                switch (i) {
                    case 498663272:
                        return;
                    case 1644960395:
                        i = 498663272;
                }
            }
        }
    }

    /* renamed from: ̾, reason: not valid java name and contains not printable characters */
    public static String m3647(Object obj) {
        String name = ((Class) obj).getName();
        while (true) {
            int i = 1644969043 ^ 94916;
            while (true) {
                switch (i) {
                    case 205165212:
                        return name;
                    case 1645039255:
                        i = 205165212;
                }
            }
        }
    }

    /* renamed from: ̿, reason: not valid java name and contains not printable characters */
    public static int m3648(Object obj) {
        int i = ((DataInputStream) obj).read();
        while (true) {
            int i2 = 1644969074 ^ 20987;
            while (true) {
                switch (i2) {
                    case -88164574:
                        return i;
                    case 1644981641:
                        i2 = -88164574;
                }
            }
        }
    }

    /* renamed from: ͂, reason: not valid java name and contains not printable characters */
    public static Iterator m3649(Object obj) {
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            int i = 1644969105 ^ 26080;
            while (true) {
                switch (i) {
                    case 1060605665:
                        return it;
                    case 1644976497:
                        i = 1060605665;
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
    /* renamed from: ̓, reason: not valid java name and contains not printable characters */
    public static boolean m3650(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            boolean r0 = r0.equals(r1)
        Lc:
            r7 = 1644969136(0x620c3cb0, float:6.467293E20)
            goto L10
        L10:
            r9 = 28557(0x6f8d, float:4.0017E-41)
            r7 = r7 ^ r9
        L15:
            switch(r7) {
                case 767204879: goto L28;
                case 1644974909: goto L19;
                default: goto L18;
            }
        L18:
            goto Lc
        L19:
            goto L24
        L24:
            r7 = 767204879(0x2dba9e0f, float:2.1215944E-11)
            goto L15
        L28:
            return r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3650(java.lang.Object, java.lang.Object):boolean");
    }

    /*  JADX ERROR: Failed to set jump: 0x002d -> 0x001e
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ͅ, reason: not valid java name and contains not printable characters */
    public static java.lang.reflect.Field m3651(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
        L10:
            r7 = 1644969167(0x620c3ccf, float:6.467315E20)
            goto L14
        L14:
            r9 = 73542(0x11f46, float:1.03054E-40)
            r7 = r7 ^ r9
        L19:
            switch(r7) {
                case 473753413: goto L2c;
                case 1645028233: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L10
        L1d:
            goto L28
        L28:
            r7 = 473753413(0x1c3ce745, float:6.250289E-22)
            goto L19
        L2c:
            return r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3651(java.lang.Object, java.lang.Object):java.lang.reflect.Field");
    }

    /* renamed from: ͆, reason: not valid java name and contains not printable characters */
    public static void m3652(Object obj) {
        ((Application) obj).onCreate();
        while (true) {
            int i = 1644940616 ^ 44280;
            while (true) {
                switch (i) {
                    case -58449992:
                        return;
                    case 1644913072:
                        i = -58449992;
                }
            }
        }
    }

    /* renamed from: ͇, reason: not valid java name and contains not printable characters */
    public static ClassLoader m3653(Object obj) {
        ClassLoader classLoader = ((Class) obj).getClassLoader();
        while (true) {
            int i = 1642203874 ^ 99687;
            while (true) {
                switch (i) {
                    case -1380502776:
                        return classLoader;
                    case 1642303365:
                        i = -1380502776;
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
    /* renamed from: ͈, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3654(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
        La:
            r6 = 1642112641(0x61e0a681, float:5.1800857E20)
            goto Le
        Le:
            r8 = 87340(0x1552c, float:1.2239E-40)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -1750618847: goto L26;
                case 1642197933: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = -1750618847(0xffffffff97a7ad21, float:-1.0835826E-24)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3654(java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Failed to set jump: 0x002b -> 0x001c
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.InsnNode.addAttr(jadx.api.plugins.input.data.attributes.IJadxAttrType, Object)" because "insnByOffset[target]" is null
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.addJump(ProcessInstructionsVisitor.java:153)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:74)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    /* renamed from: ͉, reason: not valid java name and contains not printable characters */
    public static boolean m3655(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.add(r1)
        Le:
            r7 = 1642113013(0x61e0a7f5, float:5.1802166E20)
            goto L12
        L12:
            r9 = 72796(0x11c5c, float:1.02009E-40)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 1642183593: goto L1b;
                case 1770239581: goto L2a;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L26
        L26:
            r7 = 1770239581(0x6983b65d, float:1.9903809E25)
            goto L17
        L2a:
            return r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3655(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: ͊, reason: not valid java name and contains not printable characters */
    public static Method m3656(Object obj, Object obj2, Object obj3) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        while (true) {
            int i = 1642140789 ^ 11371;
            while (true) {
                switch (i) {
                    case -288571234:
                        return declaredMethod;
                    case 1642149918:
                        i = -288571234;
                }
            }
        }
    }

    /* renamed from: ͋, reason: not valid java name and contains not printable characters */
    public static Signature[] m3657(Object obj) {
        Signature[] apkContentsSigners = ((SigningInfo) obj).getApkContentsSigners();
        while (true) {
            int i = 1642140820 ^ 28132;
            while (true) {
                switch (i) {
                    case -581984622:
                        return apkContentsSigners;
                    case 1642166640:
                        i = -581984622;
                }
            }
        }
    }

    /* renamed from: ͌, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3658(Object obj, Object obj2) {
        StringBuilder sbAppend = ((StringBuilder) obj).append(obj2);
        while (true) {
            int i = 1642140851 ^ 92386;
            while (true) {
                switch (i) {
                    case -875327211:
                        return sbAppend;
                    case 1642101841:
                        i = -875327211;
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
    /* renamed from: ͍, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3659(java.lang.Object r84, java.lang.Object r85) {
        /*
            r34 = r85
            r33 = r84
            r0 = r33
            r1 = r34
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
        Le:
            r7 = 1642140882(0x61e114d2, float:5.190022E20)
            goto L12
        L12:
            r9 = 4888(0x1318, float:6.85E-42)
            r7 = r7 ^ r9
        L17:
            switch(r7) {
                case 273411335: goto L2a;
                case 1642137546: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto Le
        L1b:
            goto L26
        L26:
            r7 = 273411335(0x104bed07, float:4.021729E-29)
            goto L17
        L2a:
            return r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3659(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ͎, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3660(Object obj, char c) {
        StringBuilder sbAppend = ((StringBuilder) obj).append(c);
        while (true) {
            int i = 1642140913 ^ 43845;
            while (true) {
                switch (i) {
                    case -19943451:
                        return sbAppend;
                    case 1642184628:
                        i = -19943451;
                }
            }
        }
    }

    /* renamed from: ͏, reason: not valid java name and contains not printable characters */
    public static void m3661(Object obj, boolean z) {
        ((Field) obj).setAccessible(z);
        while (true) {
            int i = 1642140944 ^ 5431;
            while (true) {
                switch (i) {
                    case -313385450:
                        return;
                    case 1642135591:
                        i = -313385450;
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
    /* renamed from: ͐, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m3662(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = np.manager.C0861.m3610(r0)
        La:
            r6 = 1642112393(0x61e0a589, float:5.1799984E20)
            goto Le
        Le:
            r8 = 88065(0x15801, float:1.23405E-40)
            r6 = r6 ^ r8
        L13:
            switch(r6) {
                case -845570465: goto L26;
                case 1642200456: goto L17;
                default: goto L16;
            }
        L16:
            goto La
        L17:
            goto L22
        L22:
            r6 = -845570465(0xffffffffcd999e5f, float:-3.2216163E8)
            goto L13
        L26:
            return r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3662(java.lang.Object):java.lang.Class");
    }

    /* renamed from: ͑, reason: not valid java name and contains not printable characters */
    public static Boolean m3663(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        while (true) {
            int i = 1642215406 ^ 78123;
            while (true) {
                switch (i) {
                    case 163254344:
                        return boolValueOf;
                    case 1642268357:
                        i = 163254344;
                }
            }
        }
    }

    /* renamed from: ͒, reason: not valid java name and contains not printable characters */
    public static void m3664(Object obj) throws IOException {
        ((FileInputStream) obj).close();
        while (true) {
            int i = 1642124173 ^ 1373;
            while (true) {
                switch (i) {
                    case -206936484:
                        return;
                    case 1642125008:
                        i = -206936484;
                }
            }
        }
    }

    /* renamed from: ͓, reason: not valid java name and contains not printable characters */
    public static int m3665(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        while (true) {
            int i = 1642124545 ^ 41101;
            while (true) {
                switch (i) {
                    case -981027720:
                        return iIntValue;
                    case 1642100108:
                        i = -981027720;
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
    /* renamed from: ͔, reason: not valid java name and contains not printable characters */
    public static int m3666(java.lang.Object r84) {
        /*
            r33 = r84
            r0 = r33
            int r0 = r0.hashCode()
        L8:
            r6 = 1642152321(0x61e14181, float:5.194047E20)
            goto Lc
        Lc:
            r8 = 38537(0x9689, float:5.4002E-41)
            r6 = r6 ^ r8
        L11:
            switch(r6) {
                case 1255194976: goto L20;
                case 1642190600: goto L15;
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
            r6 = 1255194976(0x4ad0c160, float:6840496.0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3666(java.lang.Object):int");
    }

    /* renamed from: ͕, reason: not valid java name and contains not printable characters */
    public static String m3667(Object obj) {
        String name = ((Method) obj).getName();
        while (true) {
            int i = 1642152352 ^ 61178;
            while (true) {
                switch (i) {
                    case 961786000:
                        return name;
                    case 1642180442:
                        i = 961786000;
                }
            }
        }
    }

    /* renamed from: ͖, reason: not valid java name and contains not printable characters */
    public static int m3668() {
        while (true) {
            int i = 1642152383 ^ 65641;
            while (true) {
                switch (i) {
                    case 668427394:
                        return 77;
                    case 1642086870:
                        i = 668427394;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* renamed from: ̬, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3635(short[] r98, int r99, int r100, int r101) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.C0862.m3635(short[], int, int, int):java.lang.String");
    }
}
