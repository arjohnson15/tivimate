package p376;

import java.io.EOFException;
import java.util.ArrayList;
import p013.AbstractC1037;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p317.AbstractC3625;
import p366.C4143;
import p366.C4155;
import p366.C4167;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵢˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4320 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4155 f16777;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4155 f16778;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4155 f16779;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4155 f16780;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4155 f16781;

    static {
        C4155 c4155 = new C4155("/".getBytes(AbstractC3625.f13869));
        c4155.f16069 = "/";
        f16780 = c4155;
        C4155 c41552 = new C4155("\\".getBytes(AbstractC3625.f13869));
        c41552.f16069 = "\\";
        f16777 = c41552;
        C4155 c41553 = new C4155("/\\".getBytes(AbstractC3625.f13869));
        c41553.f16069 = "/\\";
        f16779 = c41553;
        C4155 c41554 = new C4155(".".getBytes(AbstractC3625.f13869));
        c41554.f16069 = ".";
        f16781 = c41554;
        C4155 c41555 = new C4155("..".getBytes(AbstractC3625.f13869));
        c41555.f16069 = "..";
        f16778 = c41555;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4167 m9815(C4167 c4167, C4167 c41672, boolean z) {
        if (m9818(c41672) != -1 || c41672.m9580() != null) {
            return c41672;
        }
        C4155 c4155M9817 = m9817(c4167);
        if (c4155M9817 == null && (c4155M9817 = m9817(c41672)) == null) {
            c4155M9817 = m9819(C4167.f16083);
        }
        C4143 c4143 = new C4143();
        c4143.m9524(c4167.f16084);
        if (c4143.f16041 > 0) {
            c4143.m9524(c4155M9817);
        }
        c4143.m9524(c41672.f16084);
        return m9820(c4143, z);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4155 m9816(byte b) {
        if (b == 47) {
            return f16780;
        }
        if (b == 92) {
            return f16777;
        }
        throw new IllegalArgumentException(ˉᵎ.ˉⁱ("not a directory separator: ", b));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4155 m9817(C4167 c4167) {
        C4155 c4155 = c4167.f16084;
        C4155 c41552 = f16780;
        if (C4155.m9558(c4155, c41552) != -1) {
            return c41552;
        }
        C4155 c41553 = f16777;
        if (C4155.m9558(c4167.f16084, c41553) != -1) {
            return c41553;
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int m9818(C4167 c4167) {
        if (c4167.f16084.mo9566() == 0) {
            return -1;
        }
        C4155 c4155 = c4167.f16084;
        if (c4155.mo9565(0) != 47) {
            if (c4155.mo9565(0) != 92) {
                if (c4155.mo9566() <= 2 || c4155.mo9565(1) != 58 || c4155.mo9565(2) != 92) {
                    return -1;
                }
                char cMo9565 = (char) c4155.mo9565(0);
                return (('a' > cMo9565 || cMo9565 >= '{') && ('A' > cMo9565 || cMo9565 >= '[')) ? -1 : 3;
            }
            if (c4155.mo9566() > 2 && c4155.mo9565(1) == 92) {
                int iMo9560 = c4155.mo9560(2, f16777.f16070);
                return iMo9560 == -1 ? c4155.mo9566() : iMo9560;
            }
        }
        return 1;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C4155 m9819(String str) {
        if (AbstractC1549.m5138(str, "/")) {
            return f16780;
        }
        if (AbstractC1549.m5138(str, "\\")) {
            return f16777;
        }
        throw new IllegalArgumentException(ᐧʻ.ﾞˊ("not a directory separator: ", str));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4167 m9820(C4143 c4143, boolean z) throws EOFException {
        C4155 c4155;
        C4155 c41552;
        char cM9520;
        C4155 c41553;
        C4155 c4155Mo9522;
        C4143 c41432 = new C4143();
        C4155 c4155M9816 = null;
        int i = 0;
        while (true) {
            if (!c4143.mo9519(f16780)) {
                c4155 = f16777;
                if (!c4143.mo9519(c4155)) {
                    break;
                }
            }
            byte b = c4143.readByte();
            if (c4155M9816 == null) {
                c4155M9816 = m9816(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && AbstractC1549.m5138(c4155M9816, c4155);
        C4155 c41554 = f16779;
        if (z2) {
            c41432.m9524(c4155M9816);
            c4155M9816.mo9567(c41432, c4155M9816.mo9566());
        } else if (i > 0) {
            c41432.m9524(c4155M9816);
        } else {
            long jM9505 = c4143.m9505(c41554, 0L);
            if (c4155M9816 == null) {
                c4155M9816 = jM9505 == -1 ? m9819(C4167.f16083) : m9816(c4143.m9520(jM9505));
            }
            if (AbstractC1549.m5138(c4155M9816, c4155)) {
                c41552 = c4155M9816;
                if (c4143.f16041 >= 2 && c4143.m9520(1L) == 58 && (('a' <= (cM9520 = (char) c4143.m9520(0L)) && cM9520 < '{') || ('A' <= cM9520 && cM9520 < '['))) {
                    if (jM9505 == 2) {
                        c41432.mo4566(c4143, 3L);
                    } else {
                        c41432.mo4566(c4143, 2L);
                    }
                }
            } else {
                c41552 = c4155M9816;
            }
            c4155M9816 = c41552;
        }
        boolean z3 = c41432.f16041 > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zM9503 = c4143.m9503();
            c41553 = f16781;
            if (zM9503) {
                break;
            }
            long jM95052 = c4143.m9505(c41554, 0L);
            if (jM95052 == -1) {
                c4155Mo9522 = c4143.mo9522(c4143.f16041);
            } else {
                c4155Mo9522 = c4143.mo9522(jM95052);
                c4143.readByte();
            }
            C4155 c41555 = f16778;
            if (c4155Mo9522.equals(c41555)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || AbstractC1549.m5138(AbstractC1041.m4034(arrayList), c41555)))) {
                        arrayList.add(c4155Mo9522);
                    } else if (!z2 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(AbstractC1037.m4009(arrayList));
                        }
                    }
                }
            } else if (!c4155Mo9522.equals(c41553) && !c4155Mo9522.equals(C4155.f16067)) {
                arrayList.add(c4155Mo9522);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                c41432.m9524(c4155M9816);
            }
            c41432.m9524((C4155) arrayList.get(i2));
        }
        if (c41432.f16041 == 0) {
            c41432.m9524(c41553);
        }
        return new C4167(c41432.mo9522(c41432.f16041));
    }
}
