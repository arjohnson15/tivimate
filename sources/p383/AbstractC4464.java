package p383;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p080.AbstractC1702;
import ـˈ.ˉᵎ;

/* renamed from: ᵢᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4464 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f17181 = {0, 0, 0, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String[] f17179 = {"", "A", "B", "C"};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f17180 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10123(int i, int i2) throws GlUtil$GlException {
        GLES20.glBindTexture(i, i2);
        m10143();
        GLES20.glTexParameteri(i, 10240, 9729);
        m10143();
        GLES20.glTexParameteri(i, 10241, 9729);
        m10143();
        GLES20.glTexParameteri(i, 10242, 33071);
        m10143();
        GLES20.glTexParameteri(i, 10243, 33071);
        m10143();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10124(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int[] m10125(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static Uri m10126(String str, String str2) {
        return Uri.parse(m10145(str, str2));
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static void m10127(String str, String str2, Throwable th) {
        synchronized (f17180) {
            m10141(str2, th);
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static String m10128(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m10129(Object obj) {
        obj.getClass();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m10130(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m10131(String str, String str2) {
        synchronized (f17180) {
            m10141(str2, null);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m10132(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static void m10133(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(ˉᵎ.ˉⁱ("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m10134(String str, String str2) {
        synchronized (f17180) {
            m10141(str2, null);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m10135(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m10136(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m10137(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m10138(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static FloatBuffer m10139(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static boolean m10140(XmlPullParser xmlPullParser, String str) {
        return m10153(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m10141(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f17180) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbM5409 = AbstractC1702.m5409(str, "\n  ");
        sbM5409.append(strReplace.replace("\n", "\n  "));
        sbM5409.append('\n');
        return sbM5409.toString();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m10142(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m10143() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString());
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static void m10144(String str, String str2) {
        synchronized (f17180) {
            m10141(str2, null);
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static String m10145(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM10125 = m10125(str2);
        if (iArrM10125[0] != -1) {
            sb.append(str2);
            m10128(sb, iArrM10125[1], iArrM10125[2]);
            return sb.toString();
        }
        int[] iArrM101252 = m10125(str);
        if (iArrM10125[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM101252[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM10125[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM101252[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM10125[1];
        if (i != 0) {
            int i2 = iArrM101252[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return m10128(sb, iArrM10125[1] + i2, i2 + iArrM10125[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM101252[1]);
            sb.append(str2);
            int i3 = iArrM101252[1];
            return m10128(sb, i3, iArrM10125[2] + i3);
        }
        int i4 = iArrM101252[0] + 2;
        int i5 = iArrM101252[1];
        if (i4 >= i5 || i5 != iArrM101252[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM101252[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrM101252[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return m10128(sb, iArrM101252[1], i6 + iArrM10125[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrM101252[1];
        return m10128(sb, i7, iArrM10125[2] + i7 + 1);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m10146(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m10147(String str, String str2, Throwable th) {
        synchronized (f17180) {
            m10141(str2, th);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m10148(String str, String str2) {
        synchronized (f17180) {
            m10141(str2, null);
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static String m10149(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10150(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m10151(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {f17179[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = AbstractC4470.f17202;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m10152(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static boolean m10153(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static boolean m10154(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }
}
