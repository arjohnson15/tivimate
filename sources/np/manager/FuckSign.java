package np.manager;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import bin.mt.signature.KillerApplication;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.lang.annotation.StringFogIgnore;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

@Copyright("Copyright © 2019-2020 2863678687@qq.com All Rights Reserved请勿用于非法用途，仅做学习研究使用")
/* loaded from: classes.dex */
public class FuckSign extends KillerApplication implements InvocationHandler {

    /* renamed from: ̅, reason: not valid java name and contains not printable characters */
    private static final short[] f3894 = {3779, -6907, -6902, -6912, -6890, -6901, -6899, -6912, -6838, -6907, -6892, -6892, -6838, -6875, -6905, -6896, -6899, -6894, -6899, -6896, -6883, -6864, -6900, -6890, -6911, -6907, -6912, -6889, -6873, -6895, -6890, -6890, -6911, -6902, -6896, -6875, -6905, -6896, -6899, -6894, -6899, -6896, -6883, -6864, -6900, -6890, -6911, -6907, -6912, 9548, -16621, -16618, -16611, -16615, -16630, -16612, -16620, -16559, -16628, -16624, -16585, -16624, -16624, -16620, -16615, -16618, -16621, -16614, -16545, -16622, -16593, -16610, -16612, -16620, -16610, -16616, -16614, -16628, -16545, -16613, -16624, -16614, -16628, -16545, -16623, -16624, -16629, -16545, -16614, -16633, -16618, -16628, -16629, -16559, -16595, -16614, -16613, -16618, -16627, -16614, -16612, -16629, -16545, -16610, -16625, -16620, -16545, -16628, -16630, -16612, -16612, -16614, -16628, -16628, -16559, -16622, -16578, -16625, -16625, -16581, -16618, -16627, -16610, -16621, -16621, -16622, -16578, -16625, -16625, -16621, -16618, -16612, -16610, -16629, -16618, -16624, -16623, -16586, -16623, -16615, -16624, -16622, -16595, -16614, -16628, -16581, -16618, -16627, 4196, -26577, -26590, -26582, -26587, -26572, 8024, 27321, 27316, 27324, 27315, 27298, 4824, 14404, 14408, 14410, 14345, 14422, 14414, 14409, 14400, 14430, 14418, 14345, 14433, 14418, 14404, 14412, 14452, 14414, 14400, 14409, 14413, 14406, 14417, 14406, 14345, 14411, 14406, 14409, 14400, 14345, 14452, 14430, 14420, 14419, 14402, 14410, 14400, 14402, 14419, 14438, 14409, 14409, 14408, 14419, 14406, 14419, 14414, 14408, 14409, 14420, 14402, 14431, 14414, 14419, 14413, 14406, 14417, 14406, 14345, 14411, 14406, 14409, 14400, 14345, 14452, 14430, 14420, 14419, 14402, 14410, 14422, 14430, 14410, 14406, 14345, 14430, 14430, 14430, 14402, 14431, 14414, 14419, 14410, 14437, 14408, 14418, 14409, 14403, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14414, 14409, 14401, 14408, 14410, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14410, 14446, 14409, 14414, 14419, 14414, 14406, 14411, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14410, 14438, 14411, 14411, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14420, 14410, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14446, 14409, 14401, 14408, 14406, 14423, 14423, 14446, 14409, 14401, 14408, 14410, 14406, 14412, 14402, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14410, 14446, 14409, 14414, 14419, 14414, 14406, 14411, 14438, 14423, 14423, 14411, 14414, 14404, 14406, 14419, 14414, 14408, 14409, 14410, 14455, 14421, 14408, 14417, 14414, 14403, 14402, 14421, 14442, 14406, 14423, 14453, 14402, 14403, 14414, 14421, 14402, 14404, 14419, 14343, 14406, 14423, 14423, 14343, 14420, 14418, 14404, 14404, 14402, 14420, 14420, 14345, 14410, 14443, 14408, 14404, 14406, 14411, 14455, 14421, 14408, 14417, 14414, 14403, 14402, 14421, 14410, 14436, 14408, 14409, 14419, 14402, 14431, 14419, 6261, -31643, -32333, -31643, -32333, -31643, -32333, -31643, -32333, -31643, -32333, 5311, -4013, -3972, -4015, -4021, -4016, -4006, -3969, -4018, -4018, -4014, -4009, -4003, -4001, -4022, -4009, -4015, -4016, -4009, -4016, -4008, -4015, -4013, -3977, -4016, -4009, -4022, -4009, -4001, -4014, -3969, -4018, -4018, -4014, -4009, -4003, -4001, -4022, -4009, -4015, -4016, -4013, -3969, -4018, -4018, -4014, -4009, -4003, -4001, -4022, -4009, -4015, -4016, 4720, 23723, 23702, 23688, 23731, 23700, 23700, 23696, 23771, 23709, 23706, 23698, 23703, 23710, 23711, 23765, 23697, 23706, 23693, 23706, 23765, 23703, 23706, 23701, 23708, 23765, 23720, 23682, 23688, 23695, 23710, 23702, 23704, 23700, 23702, 23765, 23690, 23698, 23701, 23708, 23682, 23694, 23765, 23704, 23701, 23709, 23698, 23683, 23710, 23683, 23698, 23695, 23719, 23701, 23793, 23688, 23723, 23706, 23704, 23696, 23706, 23708, 23710, 23734, 23706, 23701, 23706, 23708, 23710, 23689, 23706, 23701, 23711, 23689, 23700, 23698, 23711, 23765, 23704, 23700, 23701, 23695, 23710, 23701, 23695, 23765, 23691, 23702, 23765, 23730, 23723, 23706, 23704, 23696, 23706, 23708, 23710, 23734, 23706, 23701, 23706, 23708, 23710, 23689, 23702, 23723, 23734, 23723, 23702, 23688, 23731, 23700, 23700, 23696, 23771, 23688, 23694, 23704, 23704, 23710, 23688, 23688, 23765, 9691, -11675, -11673, -11658, -11694, -11677, -11679, -11671, -11677, -11675, -11673, -11701, -11668, -11676, -11667, 2949, 1113, 1110, 1116, 1098, 1111, 1105, 1116, 1046, 1113, 1096, 1096, 1046, 1145, 1096, 1096, 1108, 1105, 1115, 1113, 1100, 1105, 1111, 1110};

    /* renamed from: ̍, reason: not valid java name and contains not printable characters */
    private String f3895 = "";

    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    private byte[][] f3896;

    /* renamed from: ̐, reason: not valid java name and contains not printable characters */
    private Application f3897;

    /* renamed from: ̒, reason: not valid java name and contains not printable characters */
    private Object f3898;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r9 = "۬ۢ۠";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:
    
        r9 = "ۡۖۘ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        r9 = "ۨۘۗ";
     */
    /* renamed from: ̎, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m3542() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3542():java.lang.Object");
    }

    /* renamed from: ̐, reason: not valid java name and contains not printable characters */
    private final void m3543(Context context) {
        String str;
        Map map;
        String str2;
        File file;
        String str3;
        String str4;
        boolean zM3603 = false;
        String strM3568 = null;
        Map map2 = null;
        Iterator itM3581 = null;
        boolean zM3605 = false;
        String str5 = null;
        boolean zM3585 = false;
        Object obj = null;
        boolean zM35852 = false;
        int i = 0;
        int iM3575 = C0861.m3575("ۨۥۙ");
        File file2 = null;
        Object th = null;
        while (true) {
            switch (iM3575) {
                case 1739776:
                    m3545(C0861.m3589(th));
                    throw new RuntimeException(C0862.m3619(th));
                case 1740356:
                    try {
                        m3551(obj, C0861.m3600(f3894, 141, 7, i), strM3568);
                    } catch (Throwable th2) {
                        th = th2;
                        file = file2;
                        str = strM3568;
                        map = map2;
                        str4 = "ۘۙۡ";
                        iM3575 = C0862.m3666(str4);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    }
                case 1746436:
                    file = file2;
                    str = strM3568;
                    map = map2;
                    if (zM3603) {
                        str3 = "ۡۘۙ";
                        iM3575 = C0861.m3575(str3);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    } else {
                        str4 = "۬ۗ۫";
                        iM3575 = C0862.m3666(str4);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    }
                case 1746539:
                    str = strM3568;
                    map = map2;
                    if (zM3605) {
                        iM3575 = C0861.m3575("ۧۘۡ");
                        map2 = map;
                        strM3568 = str;
                    }
                    str2 = "ۦۛۥ";
                    iM3575 = C0862.m3666(str2);
                    map2 = map;
                    strM3568 = str;
                case 1747715:
                    file = file2;
                    str = strM3568;
                    map = map2;
                    i = 49023;
                    str3 = "ۦۗۨ";
                    iM3575 = C0861.m3575(str3);
                    map2 = map;
                    strM3568 = str;
                    file2 = file;
                case 1748386:
                    str = strM3568;
                    map = map2;
                    strM3568 = C0861.m3568(file2);
                    Object objM3542 = m3542();
                    file = file2;
                    try {
                        Field fieldM3651 = C0862.m3651(C0862.m3642(objM3542), C0861.m3600(f3894, 69, 9, i));
                        C0861.m3598(fieldM3651, true);
                        Map map3 = (Map) C0862.m3620(fieldM3651, objM3542);
                        itM3581 = C0861.m3581(C0861.m3591(map3));
                        map2 = map3;
                        iM3575 = C0861.m3575("ۧۧۦ");
                    } catch (Throwable th3) {
                        th = th3;
                        str4 = "ۘۙۡ";
                        iM3575 = C0862.m3666(str4);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    }
                    file2 = file;
                case 1749012:
                    String str6 = strM3568;
                    Map map4 = map2;
                    m3544(C0861.m3600(f3894, 94, 21, i));
                    file = file2;
                    map2 = map4;
                    strM3568 = str6;
                    iM3575 = C0861.m3575("ۧۧۦ");
                    file2 = file;
                case 1752539:
                    ApplicationInfo applicationInfo = (ApplicationInfo) m3547(obj, C0862.m3635(f3894, 125, 16, i));
                    applicationInfo.publicSourceDir = strM3568;
                    applicationInfo.sourceDir = strM3568;
                    str = strM3568;
                    map = map2;
                    iM3575 = C0862.m3666(str2);
                    map2 = map;
                    strM3568 = str;
                case 1753175:
                    str = strM3568;
                    map = map2;
                    file2 = new File(C0862.m3625(context).nativeLibraryDir, C0862.m3635(f3894, 50, 10, i));
                    zM3603 = C0861.m3603(file2);
                    str2 = "۟ۗۜ";
                    iM3575 = C0862.m3666(str2);
                    map2 = map;
                    strM3568 = str;
                case 1753221:
                    file = file2;
                    str = strM3568;
                    map = map2;
                    i = 44538;
                    str3 = "ۦۗۨ";
                    iM3575 = C0861.m3575(str3);
                    map2 = map;
                    strM3568 = str;
                    file2 = file;
                case 1753296:
                    return;
                case 1754160:
                    str = strM3568;
                    map = map2;
                    String str7 = (String) C0861.m3562(itM3581);
                    zM3585 = C0861.m3585(str7, C0861.m3607(context));
                    iM3575 = C0862.m3666("ۧۚ۬");
                    str5 = str7;
                    map2 = map;
                    strM3568 = str;
                case 1754233:
                    str = strM3568;
                    map = map2;
                    str2 = zM3585 ? "ۨۛۥ" : "ۡ۬۟";
                    iM3575 = C0862.m3666(str2);
                    map2 = map;
                    strM3568 = str;
                case 1755218:
                    try {
                        Object objM3583 = C0861.m3583((WeakReference) C0861.m3595(map2, str5));
                        map = map2;
                        try {
                            m3551(objM3583, C0861.m3600(f3894, 115, 7, i), strM3568);
                            str = strM3568;
                            zM35852 = C0861.m3585(m3552(DATA.f3901), C0862.m3635(f3894, ModuleDescriptor.MODULE_VERSION, 3, i));
                            obj = objM3583;
                            map2 = map;
                            iM3575 = C0861.m3575("۫ۢ۟");
                            strM3568 = str;
                        } catch (Throwable th4) {
                            th = th4;
                            str = strM3568;
                            file = file2;
                            str4 = "ۘۙۡ";
                            iM3575 = C0862.m3666(str4);
                            map2 = map;
                            strM3568 = str;
                            file2 = file;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str = strM3568;
                        map = map2;
                    }
                case 1755516:
                    file = file2;
                    str = strM3568;
                    map = map2;
                    short s = f3894[49];
                    int i2 = s + 13309;
                    int i3 = (s * s) + 177129481;
                    if ((i2 * i2) - (i3 + i3) > 0) {
                        str4 = "ۦۙۘ";
                        iM3575 = C0862.m3666(str4);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    } else {
                        str3 = "۠ۡۤ";
                        iM3575 = C0861.m3575(str3);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    }
                case 1758312:
                    iM3575 = zM35852 ? C0862.m3666("ۘ۬ۘ") : C0861.m3575("ۥۢۘ");
                case 1758944:
                    str = strM3568;
                    map = map2;
                    m3545(C0862.m3619(C0862.m3616(C0861.m3554(C0862.m3616(new StringBuilder(), C0861.m3600(f3894, 60, 9, i)), file2), C0861.m3600(f3894, 78, 16, i))));
                    str2 = "ۦۛۥ";
                    iM3575 = C0862.m3666(str2);
                    map2 = map;
                    strM3568 = str;
                default:
                    str = strM3568;
                    map = map2;
                    try {
                        zM3605 = C0861.m3605(itM3581);
                        str2 = "۟ۚۦ";
                        iM3575 = C0862.m3666(str2);
                        map2 = map;
                        strM3568 = str;
                    } catch (Throwable th6) {
                        th = th6;
                        file = file2;
                        str4 = "ۘۙۡ";
                        iM3575 = C0862.m3666(str4);
                        map2 = map;
                        strM3568 = str;
                        file2 = file;
                    }
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @android.annotation.TargetApi(19)
    /* renamed from: ̔, reason: not valid java name and contains not printable characters */
    private android.app.Application m3546() {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3546():android.app.Application");
    }

    /* renamed from: ̘, reason: not valid java name and contains not printable characters */
    private void m3550(Context context) {
        String str;
        String str2;
        boolean zM3650 = false;
        boolean zM36502 = false;
        int i = 0;
        DataInputStream dataInputStream = null;
        int length = 0;
        int i2 = 0;
        int iM3575 = C0861.m3575("ۙۗۢ");
        Object th = null;
        int i3 = 0;
        while (true) {
            switch (iM3575) {
                case 1737795:
                    return;
                case 1739222:
                    C0862.m3618(C0862.m3622(C0862.m3662(C0861.m3600(f3894, 502, 16, i)), C0861.m3600(f3894, 534, 4, i), new Class[]{Integer.TYPE}), null, new Object[]{C0861.m3601(-1)});
                    throw new UnsatisfiedLinkError();
                    break;
                case 1739719:
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(C0861.m3579(C0862.m3623(m3552(DATA.f3899), C0862.m3635(f3894, 538, 2, i), C0861.m3600(f3894, 540, 1, i)), 0)));
                    this.f3896 = new byte[C0862.m3648(dataInputStream2) & 255][];
                    i2 = i3;
                    dataInputStream = dataInputStream2;
                    str = "ۥ۬ۢ";
                    iM3575 = C0862.m3666(str);
                case 1740363:
                    if (zM36502) {
                        str2 = "ۗۦۥ";
                        iM3575 = C0861.m3575(str2);
                    } else {
                        str2 = "ۘۗۦ";
                        iM3575 = C0861.m3575(str2);
                    }
                case 1740676:
                    short s = f3894[486];
                    int i4 = s + 9455;
                    int i5 = (s * s) + 89397025;
                    str = (i5 + i5) - (i4 * i4) < 0 ? "ۡۢ۬" : "ۥۢۡ";
                    iM3575 = C0862.m3666(str);
                case 1740928:
                    m3545(C0861.m3600(f3894, 487, 15, i));
                    m3545(C0862.m3637(th));
                    str2 = "ۖۗۤ";
                    iM3575 = C0861.m3575(str2);
                case 1743117:
                    try {
                        this.f3896[i2] = new byte[C0862.m3627(dataInputStream)];
                        C0862.m3615(dataInputStream, this.f3896[i2]);
                        str = "ۢۦۥ";
                    } catch (Throwable th2) {
                        th = th2;
                        str = "ۙ۟ۦ";
                    }
                    iM3575 = C0862.m3666(str);
                case 1744024:
                    zM3650 = C0862.m3650(this.f3895, m3552(DATA.f3902));
                    str2 = "ۤۨۛ";
                    iM3575 = C0861.m3575(str2);
                case 1748715:
                    i = 3665;
                    str = "۫۠ۖ";
                    iM3575 = C0862.m3666(str);
                case 1749793:
                    i2++;
                    str = "ۥ۬ۢ";
                    iM3575 = C0862.m3666(str);
                case 1751767:
                    if (zM3650) {
                        str = "۫ۗۧ";
                        iM3575 = C0862.m3666(str);
                    } else {
                        str2 = "ۗۦۥ";
                        iM3575 = C0861.m3575(str2);
                    }
                case 1752548:
                    i = 23803;
                    str = "۫۠ۖ";
                    iM3575 = C0862.m3666(str);
                case 1752859:
                    length = this.f3896.length;
                    str = "ۥ۠۟";
                    iM3575 = C0862.m3666(str);
                case 1752864:
                    Object objM3542 = m3542();
                    Field fieldM3651 = C0862.m3651(C0861.m3567(objM3542), C0861.m3600(f3894, 541, 15, i));
                    C0861.m3598(fieldM3651, true);
                    this.f3898 = C0862.m3620(fieldM3651, objM3542);
                    Class clsM3559 = C0861.m3559(C0861.m3600(f3894, 556, 34, i));
                    Object objM3557 = C0861.m3557(C0861.m3602(clsM3559), new Class[]{clsM3559}, this);
                    C0862.m3617(fieldM3651, objM3542, objM3557);
                    PackageManager packageManagerM3597 = C0861.m3597(context);
                    Field fieldM3561 = C0861.m3561(C0861.m3567(packageManagerM3597), C0862.m3635(f3894, 590, 3, i));
                    C0861.m3598(fieldM3561, true);
                    C0861.m3606(fieldM3561, packageManagerM3597, objM3557);
                    m3544(C0862.m3635(f3894, 593, 16, i));
                    str2 = "ۖۗۤ";
                    iM3575 = C0861.m3575(str2);
                case 1757979:
                    zM36502 = C0862.m3650(this.f3895, C0862.m3635(f3894, 518, 16, i));
                    str = "ۘ۬۟";
                    iM3575 = C0862.m3666(str);
                case 1758241:
                    i3 = 0;
                    str = "ۜۦۢ";
                    iM3575 = C0862.m3666(str);
                default:
                    if (i2 < length) {
                        str = "ۛۨۚ";
                        iM3575 = C0862.m3666(str);
                    } else {
                        str2 = "ۥ۬ۧ";
                        iM3575 = C0861.m3575(str2);
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        r1 = "ۦۥۘ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        r1 = "ۛۢۘ";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void attachBaseContext(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        r12 = "ۦۧۜ";
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* renamed from: ̒, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3544(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3544(java.lang.Object):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i;
        int i2;
        int i3;
        String str;
        int iM3666;
        Object objM3618;
        String str2;
        String str3;
        int i4;
        short[] sArr;
        int i5;
        int iM36662;
        String str4;
        int iM36663;
        String str5;
        int iM3575;
        String str6;
        FuckSign fuckSign = this;
        Method method2 = method;
        int i6 = 0;
        int i7 = 0;
        PackageInfo packageInfo = null;
        int i8 = 0;
        String str7 = null;
        int i9 = 0;
        Object obj2 = null;
        Number number = null;
        Object obj3 = null;
        Signature signature = null;
        int iM36664 = C0862.m3666("ۨۤۢ");
        Signature[] signatureArr = null;
        PackageInfo packageInfo2 = null;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        short[] sArr2 = null;
        byte[][] bArr = null;
        while (true) {
            switch (iM36664) {
                case 1737754:
                    if (C0862.m3614()) {
                        i = i11;
                        i3 = i9;
                        i4 = i12;
                        i5 = i8;
                        sArr = sArr2;
                        str5 = "۠ۨۘ";
                        iM3575 = C0862.m3666(str5);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    } else {
                        str6 = "ۢ۬ۜ";
                        iM36664 = C0862.m3666(str6);
                    }
                case 1737945:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    short[] sArr3 = f3894;
                    if (C0861.m3577()) {
                        iM36664 = C0862.m3666("ۥۗۖ");
                        fuckSign = this;
                        sArr2 = sArr3;
                        i12 = i4;
                        i11 = i;
                        i6 = 0;
                        i8 = 610;
                        i9 = 14;
                        method2 = method;
                    } else {
                        iM3575 = C0862.m3666(str5);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                case 1739086:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    if (C0862.m3614()) {
                        str4 = "ۦۖۢ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                    str5 = "۠ۨۘ";
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1739393:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = "ۛۧ۬";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    } else {
                        i4 = i12;
                        sArr = sArr2;
                        i5 = i2;
                        str5 = "ۨۘۙ";
                        iM3575 = C0862.m3666(str5);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                case 1740369:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    int i13 = (s * s) + 274664329;
                    if (C0861.f3903) {
                        str4 = "۟ۥۙ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    } else {
                        iM36663 = C0861.m3575("ۨۢۗ");
                        i10 = i13;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        fuckSign = this;
                        iM36664 = iM36663;
                        method2 = method;
                    }
                case 1740649:
                    i2 = i8;
                    i3 = i9;
                    Signature[] signatureArr2 = packageInfo2.signatures;
                    i = i11;
                    byte[] bArr2 = fuckSign.f3896[i7];
                    if (C0861.m3577()) {
                        signatureArr2[i7] = new Signature(bArr2);
                        i7++;
                        str3 = "۬ۛۗ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    } else {
                        i4 = i12;
                        sArr = sArr2;
                        i5 = i2;
                        str4 = "۟ۥۙ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                case 1740667:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    PackageInfo packageInfo3 = (PackageInfo) C0862.m3618(method2, fuckSign.f3898, objArr);
                    byte[][] bArr3 = fuckSign.f3896;
                    if (C0862.m3614()) {
                        bArr = bArr3;
                        i8 = i2;
                        i9 = i3;
                        iM36664 = C0861.m3575("ۡۤۡ");
                        packageInfo2 = packageInfo3;
                        i11 = i;
                    } else {
                        i4 = i12;
                        sArr = sArr2;
                        i5 = i2;
                        str4 = "۟ۥۙ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                case 1740948:
                    i = i11;
                    i3 = i9;
                    i5 = i8;
                    sArr = sArr2;
                    i12 = 53762;
                    iM3575 = C0861.m3575("ۖۜ۟");
                    method2 = method;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1741113:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    PackageInfo packageInfo4 = (PackageInfo) C0861.m3572(method2, fuckSign.f3898, objArr);
                    SigningInfo signingInfo = packageInfo4.signingInfo;
                    objM3618 = packageInfo4;
                    if (signingInfo != null) {
                        i8 = i2;
                        i9 = i3;
                        iM36664 = C0861.m3575("۠ۘۗ");
                        packageInfo = packageInfo4;
                        i11 = i;
                    }
                    obj3 = objM3618;
                    str3 = "۟۫ۧ";
                    iM36662 = C0861.m3575(str3);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
                case 1741690:
                    if (!C0861.f3903) {
                        i = i11;
                        i3 = i9;
                        i4 = i12;
                        i5 = i8;
                        sArr = sArr2;
                        str4 = "۟ۥۙ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1742845:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    str3 = (C0862.m3665(number) & 64) != 0 ? "ۙۗۙ" : "ۗ۬ۖ";
                    iM36662 = C0861.m3575(str3);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
                case 1743104:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    if (134217728 == C0861.m3574(number)) {
                        str3 = "ۙۥۥ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    } else {
                        i4 = i12;
                        sArr = sArr2;
                        i5 = i2;
                        str5 = "ۨۘۙ";
                        iM3575 = C0862.m3666(str5);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                case 1744178:
                    C0862.m3614();
                    if (C0861.f3903) {
                        str6 = "ۢ۬ۜ";
                        iM36664 = C0862.m3666(str6);
                    } else {
                        i = i11;
                        i2 = i8;
                        i3 = i9;
                        str = "۬۫ۡ";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1746867:
                    if (C0862.f3906) {
                        i = i11;
                        i3 = i9;
                        i4 = i12;
                        i5 = i8;
                        sArr = sArr2;
                        iM3575 = C0862.m3666(str5);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    } else {
                        str6 = "ۢ۬ۜ";
                        iM36664 = C0862.m3666(str6);
                    }
                case 1747067:
                    return obj3;
                case 1747423:
                    i2 = i8;
                    i3 = i9;
                    Signature[] signatureArrM3599 = C0861.m3599(packageInfo.signingInfo);
                    if (signatureArrM3599 != null) {
                        i9 = i3;
                        iM36664 = C0861.m3575("ۧۨ۫");
                        signatureArr = signatureArrM3599;
                        i8 = i2;
                    } else {
                        i = i11;
                        objM3618 = packageInfo;
                        obj3 = objM3618;
                        str3 = "۟۫ۧ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1747920:
                    if (C0862.f3906) {
                        i2 = i8;
                        i3 = i9;
                        str2 = "ۨۨ۠";
                        iM3666 = C0862.m3666(str2);
                        i9 = i3;
                        iM36664 = iM3666;
                        i8 = i2;
                    } else {
                        i = i11;
                        i2 = i8;
                        i3 = i9;
                        str = "۬۫ۡ";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1748826:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    objM3618 = C0861.m3572(method2, fuckSign.f3898, objArr);
                    obj3 = objM3618;
                    str3 = "۟۫ۧ";
                    iM36662 = C0861.m3575(str3);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
                case 1749970:
                    C0861.m3577();
                    if (C0862.m3614()) {
                        str6 = "ۥۦۖ";
                        iM36664 = C0862.m3666(str6);
                    } else {
                        i = i11;
                        i2 = i8;
                        i3 = i9;
                        str = "۬۫ۡ";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1752196:
                    i = i11;
                    int i14 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    i3 = i14;
                    if (C0861.m3585(C0862.m3635(sArr, i5, i14, i4), C0861.m3553(method))) {
                        str4 = "ۧۥۦ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                    str5 = "ۨۘۙ";
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1752661:
                    C0861.m3577();
                    C0862.m3614();
                    return null;
                case 1752703:
                    i2 = i8;
                    i3 = i9;
                    if (i11 < signatureArr.length) {
                        str2 = "۬ۡۧ";
                        iM3666 = C0862.m3666(str2);
                        i9 = i3;
                        iM36664 = iM3666;
                        i8 = i2;
                    } else {
                        i = i11;
                        objM3618 = packageInfo;
                        obj3 = objM3618;
                        str3 = "۟۫ۧ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1753138:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    str5 = C0862.f3906 ? "ۜ۫ۡ" : "۫ۙۥ";
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1754276:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    Number number2 = (Number) obj2;
                    if (C0861.m3585(str7, fuckSign.f3895)) {
                        iM3666 = C0862.m3666("ۛ۟ۡ");
                        number = number2;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3666;
                        i8 = i2;
                    } else {
                        str = "ۡۦ۟";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1754568:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    String str8 = (String) objArr[i6];
                    Object obj4 = objArr[1];
                    if (C0862.m3614()) {
                        obj2 = obj4;
                        i8 = i2;
                        i9 = i3;
                        iM36664 = C0861.m3575("ۧۜۙ");
                        str7 = str8;
                        i11 = i;
                    }
                    str = "۬۫ۡ";
                    iM36662 = C0862.m3666(str);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
                case 1754666:
                    i2 = i8;
                    i3 = i9;
                    if (signatureArr.length > 0) {
                        i11 = i6;
                        str2 = "ۥۧۡ";
                        iM3666 = C0862.m3666(str2);
                        i9 = i3;
                        iM36664 = iM3666;
                        i8 = i2;
                    } else {
                        i = i11;
                        objM3618 = packageInfo;
                        obj3 = objM3618;
                        str3 = "۟۫ۧ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1755113:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    objM3618 = C0862.m3618(method2, fuckSign.f3898, objArr);
                    obj3 = objM3618;
                    str3 = "۟۫ۧ";
                    iM36662 = C0861.m3575(str3);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
                case 1755421:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    str5 = i10 - (33146 * s) < 0 ? "۫ۙۨ" : "ۙ۠ۛ";
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1755494:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    if (!C0862.f3906) {
                        str4 = "ۗۢۙ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    }
                    iM3575 = C0862.m3666(str5);
                    method2 = method;
                    i12 = i4;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1755615:
                    signatureArr[i11] = signature;
                    i11++;
                    i2 = i8;
                    i3 = i9;
                    str2 = "ۥۧۡ";
                    iM3666 = C0862.m3666(str2);
                    i9 = i3;
                    iM36664 = iM3666;
                    i8 = i2;
                case 1755616:
                    C0861.m3577();
                    if (C0862.m3614()) {
                        iM36664 = C0861.m3575("ۚۙۙ");
                    } else {
                        str6 = "ۢ۬ۜ";
                        iM36664 = C0862.m3666(str6);
                    }
                case 1758039:
                    i = i11;
                    i3 = i9;
                    i4 = i12;
                    i5 = i8;
                    sArr = sArr2;
                    short s2 = f3894[609];
                    if (C0861.f3903) {
                        str4 = "ۖۖۚ";
                        iM3575 = C0861.m3575(str4);
                        method2 = method;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        iM36664 = iM3575;
                        fuckSign = this;
                    } else {
                        iM36663 = C0862.m3666("ۘ۬ۥ");
                        s = s2;
                        i12 = i4;
                        sArr2 = sArr;
                        i8 = i5;
                        i9 = i3;
                        i11 = i;
                        fuckSign = this;
                        iM36664 = iM36663;
                        method2 = method;
                    }
                case 1758042:
                    i = i11;
                    i3 = i9;
                    i5 = i8;
                    sArr = sArr2;
                    i12 = 40960;
                    iM3575 = C0861.m3575("ۖۜ۟");
                    method2 = method;
                    sArr2 = sArr;
                    i8 = i5;
                    i9 = i3;
                    i11 = i;
                    iM36664 = iM3575;
                    fuckSign = this;
                case 1759048:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    if (i7 < packageInfo2.signatures.length) {
                        str = "ۙۖۦ";
                        iM36662 = C0862.m3666(str);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    } else {
                        obj3 = packageInfo2;
                        str3 = "۟۫ۧ";
                        iM36662 = C0861.m3575(str3);
                        i8 = i2;
                        i9 = i3;
                        iM36664 = iM36662;
                        i11 = i;
                    }
                case 1759250:
                    i2 = i8;
                    i3 = i9;
                    Signature signature2 = new Signature(fuckSign.f3896[i11]);
                    if (C0862.f3906) {
                        str2 = "ۨۨ۠";
                        iM3666 = C0862.m3666(str2);
                        i9 = i3;
                        iM36664 = iM3666;
                        i8 = i2;
                    } else {
                        signature = signature2;
                        i8 = i2;
                        iM36664 = C0861.m3575("ۨۨ۟");
                        i9 = i3;
                    }
                case 1759554:
                    C0862.m3614();
                    str6 = "ۥۦۖ";
                    iM36664 = C0862.m3666(str6);
                default:
                    i = i11;
                    i2 = i8;
                    i3 = i9;
                    packageInfo2.signatures = new Signature[bArr.length];
                    i7 = i6;
                    str3 = "۬ۛۗ";
                    iM36662 = C0861.m3575(str3);
                    i8 = i2;
                    i9 = i3;
                    iM36664 = iM36662;
                    i11 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        r10 = "ۙۡۗ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        r10 = "ۜ۬ۤ";
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* renamed from: ̓, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3545(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3545(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (np.manager.C0861.f3903 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0069, code lost:
    
        if (np.manager.C0861.f3903 != false) goto L6;
     */
    /* renamed from: ̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m3548(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3548(java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0099, code lost:
    
        r0 = "ۤ۫ۖ";
     */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m3551(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            r2 = this;
            java.lang.String r0 = "۟ۢۡ"
        L2:
            int r0 = np.manager.C0861.m3575(r0)
        L6:
            switch(r0) {
                case 1738227: goto L14;
                case 1740213: goto L62;
                case 1740685: goto L1b;
                case 1741317: goto L2a;
                case 1742649: goto L80;
                case 1742914: goto L89;
                case 1743610: goto L2e;
                case 1743630: goto L50;
                case 1746782: goto L95;
                case 1747866: goto L74;
                case 1749614: goto L2d;
                case 1751275: goto L48;
                case 1751855: goto L23;
                case 1752701: goto L58;
                case 1758396: goto Lf;
                case 1759466: goto L40;
                default: goto L9;
            }
        L9:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L71
            goto L6e
        Lf:
            boolean r0 = np.manager.C0862.f3906
            if (r0 != 0) goto L8d
            goto L68
        L14:
            boolean r0 = np.manager.C0862.m3614()
            if (r0 != 0) goto L6e
            goto L68
        L1b:
            np.manager.C0862.m3614()
            boolean r0 = np.manager.C0861.f3903
            if (r0 != 0) goto L99
            goto L68
        L23:
            np.manager.C0862.m3614()
            np.manager.C0861.m3577()
            goto L68
        L2a:
            np.manager.C0861.m3577()
        L2d:
            return
        L2e:
            java.lang.Class r0 = np.manager.C0861.m3567(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Field r0 = np.manager.C0861.m3561(r0, r4)     // Catch: java.lang.Throwable -> L3d
            r1 = 1
            np.manager.C0861.m3598(r0, r1)     // Catch: java.lang.Throwable -> L3d
            np.manager.C0862.m3617(r0, r3, r5)     // Catch: java.lang.Throwable -> L3d
        L3d:
            java.lang.String r0 = "ۢ۠۬"
            goto L7b
        L40:
            boolean r0 = np.manager.C0862.f3906
            if (r0 == 0) goto L45
            goto L5c
        L45:
            java.lang.String r0 = "ۜۙۗ"
            goto L2
        L48:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L4d
            goto L8d
        L4d:
            java.lang.String r0 = "۬ۨۦ"
            goto L7b
        L50:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L55
            goto L5c
        L55:
            java.lang.String r0 = "ۤۘ۟"
            goto L2
        L58:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L5f
        L5c:
            java.lang.String r0 = "۫ۥۖ"
            goto L7b
        L5f:
            java.lang.String r0 = "ۜۙ۫"
            goto L2
        L62:
            boolean r0 = np.manager.C0861.m3577()
            if (r0 != 0) goto L6b
        L68:
            java.lang.String r0 = "ۙ۬ۘ"
            goto L7b
        L6b:
            java.lang.String r0 = "ۥۧ۟"
            goto L2
        L6e:
            java.lang.String r0 = "ۙۗ۫"
            goto L7b
        L71:
            java.lang.String r0 = "ۘۧۤ"
            goto L2
        L74:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L79
            goto L8d
        L79:
            java.lang.String r0 = "۬ۚۨ"
        L7b:
            int r0 = np.manager.C0862.m3666(r0)
            goto L6
        L80:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L85
            goto L8d
        L85:
            java.lang.String r0 = "۠ۦ۠"
            goto L2
        L89:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L91
        L8d:
            java.lang.String r0 = "ۖۥۢ"
            goto L2
        L91:
            java.lang.String r0 = "ۛۙۗ"
            goto L2
        L95:
            boolean r0 = np.manager.C0861.f3903
            if (r0 == 0) goto L9d
        L99:
            java.lang.String r0 = "ۤ۫ۖ"
            goto L2
        L9d:
            java.lang.String r0 = "ۛۡۨ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3551(java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        r11 = "ۗۢۛ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r11 = "۫۫ۚ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
    
        r11 = "ۖۢۥ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        r11 = "ۥۨۜ";
     */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.onCreate():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r1 = "ۙۧۦ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        r1 = "۬۟ۘ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        r1 = "ۖۘۛ";
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* renamed from: ̕, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m3547(java.lang.Object r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "۫ۙۦ"
        L3:
            int r1 = np.manager.C0861.m3575(r1)
        L7:
            switch(r1) {
                case 1737817: goto L1b;
                case 1739384: goto L6c;
                case 1739709: goto L55;
                case 1741176: goto L3c;
                case 1742652: goto L3f;
                case 1746787: goto L10;
                case 1747650: goto L3d;
                case 1747874: goto La0;
                case 1748862: goto L5f;
                case 1749379: goto L88;
                case 1751218: goto L74;
                case 1754469: goto L7e;
                case 1754558: goto L27;
                case 1758040: goto Lae;
                case 1758467: goto L97;
                case 1758500: goto L2f;
                case 1759173: goto L34;
                default: goto La;
            }
        La:
            boolean r1 = np.manager.C0861.f3903
            if (r1 == 0) goto L69
            goto L8c
        L10:
            np.manager.C0862.m3614()
            boolean r1 = np.manager.C0861.m3577()
            if (r1 == 0) goto Lb4
            goto L8c
        L1b:
            boolean r1 = np.manager.C0861.m3577()
            if (r1 != 0) goto L23
            goto La6
        L23:
            java.lang.String r1 = "ۧۥۜ"
            goto L91
        L27:
            boolean r1 = np.manager.C0862.m3614()
            if (r1 == 0) goto L8c
            goto La6
        L2f:
            np.manager.C0862.m3614()
            goto La6
        L34:
            np.manager.C0862.m3614()
            np.manager.C0862.m3614()
            r4 = 0
            return r4
        L3c:
            return r0
        L3d:
            r0 = 0
            goto L4f
        L3f:
            java.lang.Class r1 = np.manager.C0861.m3567(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Field r1 = np.manager.C0861.m3561(r1, r5)     // Catch: java.lang.Throwable -> L52
            r2 = 1
            np.manager.C0862.m3661(r1, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = np.manager.C0861.m3560(r1, r4)     // Catch: java.lang.Throwable -> L52
        L4f:
            java.lang.String r1 = "ۙۧۦ"
            goto L3
        L52:
            java.lang.String r1 = "۠۟ۡ"
            goto L91
        L55:
            boolean r1 = np.manager.C0861.m3577()
            if (r1 != 0) goto L5c
            goto L82
        L5c:
            java.lang.String r1 = "ۛۙۚ"
            goto L3
        L5f:
            boolean r1 = np.manager.C0861.m3577()
            if (r1 != 0) goto L66
            goto L8c
        L66:
            java.lang.String r1 = "ۘۗۜ"
            goto L3
        L69:
            java.lang.String r1 = "ۡۧۤ"
            goto L91
        L6c:
            boolean r1 = np.manager.C0862.f3906
            if (r1 == 0) goto L71
            goto L82
        L71:
            java.lang.String r1 = "ۧۢۙ"
            goto L91
        L74:
            boolean r1 = np.manager.C0861.m3577()
            if (r1 != 0) goto L7b
            goto L8c
        L7b:
            java.lang.String r1 = "ۗ۫۬"
            goto L3
        L7e:
            boolean r1 = np.manager.C0861.f3903
            if (r1 == 0) goto L85
        L82:
            java.lang.String r1 = "۟ۢۦ"
            goto L91
        L85:
            java.lang.String r1 = "ۤۖۤ"
            goto L91
        L88:
            boolean r1 = np.manager.C0862.f3906
            if (r1 == 0) goto L8f
        L8c:
            java.lang.String r1 = "۫ۨۡ"
            goto L91
        L8f:
            java.lang.String r1 = "ۧۢ۠"
        L91:
            int r1 = np.manager.C0862.m3666(r1)
            goto L7
        L97:
            boolean r1 = np.manager.C0861.f3903
            if (r1 == 0) goto L9c
            goto La6
        L9c:
            java.lang.String r1 = "ۢۙۚ"
            goto L3
        La0:
            boolean r1 = np.manager.C0862.m3614()
            if (r1 != 0) goto Laa
        La6:
            java.lang.String r1 = "۬۟ۘ"
            goto L3
        Laa:
            java.lang.String r1 = "۫ۧ۟"
            goto L3
        Lae:
            boolean r1 = np.manager.C0862.m3614()
            if (r1 != 0) goto Lb8
        Lb4:
            java.lang.String r1 = "ۖۘۛ"
            goto L3
        Lb8:
            java.lang.String r1 = "۠ۦۨ"
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3547(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private void m3549(Application application) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        String str3;
        int iM3575;
        Object obj3 = null;
        Object obj4 = null;
        Object objM3547 = null;
        short s = 0;
        int i = 0;
        short[] sArr = null;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int iM35752 = C0861.m3575("ۧۦۙ");
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        char c = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        while (true) {
            switch (iM35752) {
                case 1740802:
                    obj = objM3547;
                    short[] sArr5 = f3894;
                    if (C0862.f3906) {
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        sArr4 = sArr5;
                        objM3547 = obj;
                        i7 = 455;
                        iM35752 = C0862.m3666("ۡۜۡ");
                        i6 = 19;
                    }
                case 1740831:
                    C0861.m3577();
                    str = "ۢۢۗ";
                    iM35752 = C0861.m3575(str);
                case 1742600:
                    if (C0862.f3906) {
                        str = "ۢۢۗ";
                        iM35752 = C0861.m3575(str);
                    } else {
                        obj = objM3547;
                        str3 = "ۛۡۜ";
                        iM3575 = C0862.m3666(str3);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    }
                case 1742902:
                    if (!C0861.m3577()) {
                        obj = objM3547;
                        str3 = "ۤۘۛ";
                        iM3575 = C0862.m3666(str3);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    }
                    obj = objM3547;
                    str2 = "ۙۜۢ";
                    iM3575 = C0861.m3575(str2);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1746969:
                    obj = objM3547;
                    objM3547 = m3547(obj4, C0862.m3635(sArr2, i4, i5, i));
                    if (C0862.f3906) {
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        str = "ۙۛۤ";
                        iM35752 = C0861.m3575(str);
                    }
                case 1747815:
                    obj = objM3547;
                    if (C0862.f3906) {
                        str2 = "ۙۜۢ";
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        objM3547 = obj;
                        iM35752 = C0862.m3666("ۥۜۡ");
                        c = 433;
                    }
                case 1748485:
                    obj = objM3547;
                    Object objM3542 = m3542();
                    short[] sArr6 = f3894;
                    if (!C0862.f3906) {
                        sArr = sArr6;
                        i2 = 434;
                        i3 = 17;
                        obj2 = obj;
                        iM35752 = C0861.m3575("۬ۘۚ");
                        obj3 = objM3542;
                        objM3547 = obj2;
                    }
                    iM3575 = C0861.m3575(str2);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1748498:
                    obj = objM3547;
                    str2 = (s2 * s) - i9 > 0 ? "ۙۗۥ" : "۬ۘۥ";
                    iM3575 = C0861.m3575(str2);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1748518:
                    obj = objM3547;
                    m3551(obj3, C0862.m3635(sArr4, i7, i6, i), application);
                    str2 = C0862.f3906 ? "ۛۗۤ" : "۬ۜۥ";
                    iM3575 = C0861.m3575(str2);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1749655:
                    C0862.m3614();
                    C0861.m3577();
                    break;
                case 1751271:
                    if (C0861.m3577()) {
                        obj = objM3547;
                        str2 = "ۙۜۢ";
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        str = "ۢۢۗ";
                        iM35752 = C0861.m3575(str);
                    }
                case 1752362:
                    obj = objM3547;
                    short s3 = sArr3[c];
                    int i10 = s3 * s3;
                    if (C0862.f3906) {
                        str2 = "ۙۜۢ";
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        s2 = s3;
                        objM3547 = obj;
                        iM35752 = C0862.m3666("ۨۙۡ");
                        i8 = i10;
                    }
                case 1754584:
                    obj = objM3547;
                    short[] sArr7 = f3894;
                    if (C0861.m3577()) {
                        sArr2 = sArr7;
                        objM3547 = obj;
                        i5 = 4;
                        iM35752 = C0861.m3575("۟ۨۢ");
                        i4 = 451;
                    } else {
                        str3 = "ۤۘۛ";
                        iM3575 = C0862.m3666(str3);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    }
                case 1754586:
                    obj = objM3547;
                    short[] sArr8 = f3894;
                    if (C0862.m3614()) {
                        sArr3 = sArr8;
                        objM3547 = obj;
                        iM35752 = C0862.m3666("۠ۤ۫");
                    } else {
                        str3 = "ۛۡۜ";
                        iM3575 = C0862.m3666(str3);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    }
                case 1755152:
                    obj = objM3547;
                    int i11 = i8 + 269452225;
                    if (C0861.f3903) {
                        iM3575 = C0861.m3575(str2);
                        obj2 = obj;
                        iM35752 = iM3575;
                        objM3547 = obj2;
                    } else {
                        i9 = i11;
                        objM3547 = obj;
                        iM35752 = C0861.m3575("ۡۛ۬");
                        s = 32830;
                    }
                case 1758958:
                    obj = objM3547;
                    Object objM35472 = m3547(obj3, C0862.m3635(sArr, i2, i3, i));
                    if (!C0862.f3906) {
                        obj2 = obj;
                        iM35752 = C0862.m3666("ۧۦۗ");
                        obj4 = objM35472;
                        objM3547 = obj2;
                    }
                    str3 = "ۛۡۜ";
                    iM3575 = C0862.m3666(str3);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1758969:
                    obj = objM3547;
                    i = 61502;
                    str3 = "ۡۛ۟";
                    iM3575 = C0862.m3666(str3);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
                case 1759093:
                    m3551(objM3547, C0861.m3600(f3894, 474, 12, i), application);
                    break;
                default:
                    obj = objM3547;
                    i = 30131;
                    str3 = "ۡۛ۟";
                    iM3575 = C0862.m3666(str3);
                    obj2 = obj;
                    iM35752 = iM3575;
                    objM3547 = obj2;
            }
            return;
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
    /* renamed from: ̚, reason: not valid java name and contains not printable characters */
    private java.lang.String m3552(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np.manager.FuckSign.m3552(java.lang.Object):java.lang.String");
    }

    @StringFogIgnore
    final class DATA {

        /* renamed from: ̅, reason: not valid java name and contains not printable characters */
        public static String f3899 = "0B7B0366765C75325E470F586A696E061630706B614F6A640B4E7C1A527A417D7461757E63144160736E267605606A626A7E720B646A1F52015D76736222777605717E74662F0F1B7C7E145F6B66136D781B7B0A62406F6E246E153D515D6570090710766E117D6A663264601B7D3A4B527E767070660D587E4D7174263B704A665F1F5F07436F7B6738624F767408096D3D7E466650743F0F4B6E1165457232667A071A0F5D79586D016C58044A666A65230B17736E797C6E4C0073631B1E35637660641368710F755076692512744B4E5A6D786A0878690B1B176276416D0B68773F5C426771710C077B477945791729536D08443866797B472E48482C59601950740700606A66696E6808437F0B5D257E5C7A471C7C61366361624C6F2E047D626F6C7D6A2944770605330C547D72236C62325B4F4C4E267C15081715637C69654B6902636D4301400F707B560B024B4B41282D12506753727F411D595D1B6B031270684770756829584A51453022075A75134258662C444B13663248505873284D643F556E47732D0928501B771916702E114F231A0B49676A51176B73067C4E457206342A5C6756626E412C6D581D78000C4D4118144A4A7055421310287627646C615F6A660B7D6F0468254C46514B2C7E1930006561761103007060624F7E642050760B4C275D554E457C0A6B3E7252494E250B717F7A556B7E547D7B421F1E716E446B65267A0F307F1049771206767B4B424E5B10201A7B0C65776060406233484E065C7D434E1270377E1B4C1C1613731E442C47076C4D630F75516E22556C1056000071737C4907435408534C25661A160F7849357B491F605F4C4901113773645A4F666F326C497863374470786814096A057C4444682E2A024967461043547F45620F5C3A680E4E1D78";

        /* renamed from: ̍, reason: not valid java name and contains not printable characters */
        public static String f3900 = "2B586C5341494C244045351E53560914372E454A435C4A431E5F7E264B3B4245785035554924515349482A";

        /* renamed from: ̎, reason: not valid java name and contains not printable characters */
        public static String f3901 = "2B462E";

        /* renamed from: ̐, reason: not valid java name and contains not printable characters */
        public static String f3902 = "2B586C5341494C244045351E5356";

        private DATA() {
        }
    }
}
