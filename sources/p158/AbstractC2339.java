package p158;

import android.support.v4.media.session.AbstractC0001;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p013.AbstractC1037;
import p070.AbstractC1549;
import p126.C2022;
import p278.AbstractC3362;
import p317.AbstractC3616;
import p317.AbstractC3625;
import p317.C3622;
import p366.C4143;
import p366.C4165;
import p366.InterfaceC4161;
import p366.InterfaceC4163;
import p379.C4410;
import p430.AbstractC4996;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5014;
import ٴᐧ.ᐧⁱ;

/* renamed from: ˊˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2339 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5014 f9298 = AbstractC0001.m24(new String[0]);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final TimeZone f9299;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C2022 f9300;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f9301;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3622 f9302;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String f9303;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4165 f9304;

    static {
        byte[] bArr = new byte[0];
        f9301 = bArr;
        C4143 c4143 = new C4143();
        c4143.m9521(bArr, 0, 0);
        long j = 0;
        f9300 = new C2022(null, j, c4143, 1);
        AbstractC4996.Companion.getClass();
        if (j < 0 || j > j || 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        f9304 = AbstractC3362.m8189(ᐧⁱ.ˏᴵ("efbbbf"), ᐧⁱ.ˏᴵ("feff"), ᐧⁱ.ˏᴵ("fffe"), ᐧⁱ.ˏᴵ("0000ffff"), ᐧⁱ.ˏᴵ("ffff0000"));
        f9299 = DesugarTimeZone.getTimeZone("GMT");
        f9302 = new C3622("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f9303 = AbstractC3616.m8537(AbstractC3616.m8536(C4999.class.getName(), "okhttp3."), "Client");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int m6427(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(10L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int m6428(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (AbstractC3616.m8546(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final String m6429(C5004 c5004, boolean z) {
        String str = c5004.f18961;
        if (AbstractC3616.m8533(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i = c5004.f18954;
        if (!z) {
            String str2 = c5004.f18958;
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final List m6430(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return DesugarCollections.unmodifiableList(AbstractC1037.m4011(Arrays.copyOf(objArr2, objArr2.length)));
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final int m6431(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final List m6432(List list) {
        return DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final int m6433(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final int m6434(InterfaceC4161 interfaceC4161) {
        return (interfaceC4161.readByte() & 255) | ((interfaceC4161.readByte() & 255) << 16) | ((interfaceC4161.readByte() & 255) << 8);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int m6435(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC1549.m5145(cCharAt, 31) <= 0 || AbstractC1549.m5145(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final boolean m6436(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        r2 = r2 + 1;
     */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m6437(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
        /*
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            goto L36
        L5:
            if (r8 == 0) goto L36
            int r0 = r8.length
            if (r0 != 0) goto Lb
            goto L36
        Lb:
            int r0 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r0) goto L36
            r3 = r7[r2]
            r4 = 0
        L12:
            int r5 = r8.length
            r6 = 1
            if (r4 >= r5) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            if (r5 == 0) goto L33
            int r5 = r4 + 1
            r4 = r8[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28
            int r4 = r9.compare(r3, r4)
            if (r4 != 0) goto L26
            return r6
        L26:
            r4 = r5
            goto L12
        L28:
            r7 = move-exception
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L33:
            int r2 = r2 + 1
            goto Ld
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.AbstractC2339.m6437(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m6438(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final int m6439(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m6440(C5004 c5004, C5004 c50042) {
        return AbstractC1549.m5138(c5004.f18961, c50042.f18961) && c5004.f18954 == c50042.f18954 && AbstractC1549.m5138(c5004.f18958, c50042.f18958);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int m6441(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String m6442(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final String[] m6443(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final boolean m6444(InterfaceC4163 interfaceC4163, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jMo9545 = interfaceC4163.mo8177().mo9544() ? interfaceC4163.mo8177().mo9545() - jNanoTime : Long.MAX_VALUE;
        interfaceC4163.mo8177().mo9540(Math.min(jMo9545, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C4143 c4143 = new C4143();
            while (interfaceC4163.mo4577(c4143, 8192L) != -1) {
                c4143.m9508();
            }
            if (jMo9545 == Long.MAX_VALUE) {
                interfaceC4163.mo8177().mo9546();
            } else {
                interfaceC4163.mo8177().mo9540(jNanoTime + jMo9545);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo9545 == Long.MAX_VALUE) {
                interfaceC4163.mo8177().mo9546();
            } else {
                interfaceC4163.mo8177().mo9540(jNanoTime + jMo9545);
            }
            return false;
        } catch (Throwable th) {
            if (jMo9545 == Long.MAX_VALUE) {
                interfaceC4163.mo8177().mo9546();
            } else {
                interfaceC4163.mo8177().mo9540(jNanoTime + jMo9545);
            }
            throw th;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final Charset m6445(InterfaceC4161 interfaceC4161, Charset charset) {
        Charset charsetForName;
        int iMo9510 = interfaceC4161.mo9510(f9304);
        if (iMo9510 == -1) {
            return charset;
        }
        if (iMo9510 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo9510 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo9510 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo9510 == 3) {
            Charset charset2 = AbstractC3625.f13869;
            charsetForName = AbstractC3625.f13868;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                AbstractC3625.f13868 = charsetForName;
            }
        } else {
            if (iMo9510 != 4) {
                throw new AssertionError();
            }
            Charset charset3 = AbstractC3625.f13869;
            charsetForName = AbstractC3625.f13867;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                AbstractC3625.f13867 = charsetForName;
            }
        }
        return charsetForName;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final C5014 m6446(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4410 c4410 = (C4410) it.next();
            String strM9564 = c4410.f16998.m9564();
            String strM95642 = c4410.f16996.m9564();
            arrayList.add(strM9564);
            arrayList.add(AbstractC3616.m8539(strM95642).toString());
        }
        return new C5014((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final void m6447(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC1549.m5138(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final long m6448(C4994 c4994) {
        String strM11104 = c4994.f18889.m11104("Content-Length");
        if (strM11104 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM11104);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final String m6449(int i, int i2, String str) {
        int iM6431 = m6431(i, i2, str);
        return str.substring(iM6431, m6433(iM6431, i2, str));
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final int m6450(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
