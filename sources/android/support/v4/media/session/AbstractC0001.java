package android.support.v4.media.session;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.transition.FadeAndShortSlide;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.io.Closeable;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import net.lingala.zip4j.exception.ZipException;
import org.lsposed.hiddenapibypass.library.R;
import p013.C1047;
import p023.C1147;
import p072.C1602;
import p105.C1794;
import p158.AbstractC2339;
import p185.AbstractC2562;
import p223.AbstractC2978;
import p223.AbstractC2980;
import p298.C3493;
import p298.C3496;
import p317.AbstractC3616;
import p353.C4013;
import p353.C4021;
import p353.InterfaceC4012;
import p395.InterfaceFutureC4542;
import p410.AbstractC4686;
import p410.EnumC4679;
import p410.RunnableC4687;
import p430.C5014;
import יˏ.ʾˈ;
import ـˈ.ﹳﾞ;
import ᵎﹳ.ᐧʻ;
import ⁱـ.ˑי;
import ﾞﹶ.ᵢʿ;

/* renamed from: android.support.v4.media.session.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0001 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static volatile boolean f40 = true;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String f41;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final void m1(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        Resources resources;
        int i;
        View view = abstractComponentCallbacksC0100.getView();
        if (view != null) {
            view.setBackground(null);
            View viewFindViewById = view.findViewById(R.id._2_res_0x7f0b0113);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(null);
            }
            View viewFindViewById2 = view.findViewById(R.id._2_res_0x7f0b0112);
            if (viewFindViewById2 != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (m28(abstractComponentCallbacksC0100)) {
                    boolean z = ʾˈ.ـﹶ;
                    resources = view.getResources();
                    i = R.dimen._2_res_0x7f070479;
                } else {
                    boolean z2 = ʾˈ.ـﹶ;
                    resources = view.getResources();
                    i = R.dimen._2_res_0x7f070478;
                }
                marginLayoutParams.height = resources.getDimensionPixelSize(i);
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.setMarginStart(ʾˈ.ˉי(view.getContext(), 24));
                marginLayoutParams.setMarginEnd(ʾˈ.ˉי(view.getContext(), 24));
                viewFindViewById2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m2(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC2339.m6442("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static int[] m3(Collection collection) {
        if (collection instanceof C1794) {
            C1794 c1794 = (C1794) collection;
            return Arrays.copyOfRange(c1794.f6939, c1794.f6937, c1794.f6938);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final byte[] m4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final void m5(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ˈי.ʾˈ.ـﹶ(th, th2);
            }
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m6(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(ᵢʿ.ʿˏ("min (%s) must be less than or equal to max (%s)", new Object[]{Integer.valueOf(i2), 1073741823}));
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m7(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static String m8(byte[] bArr, boolean z, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z) {
            return new String(bArr, AbstractC2980.f11455);
        }
        try {
            return new String(bArr, "Cp437");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static Bundle m9(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(AbstractC0001.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C3493 m10(C3496 c3496, String str) throws ZipException {
        C3493 c3493M21 = m21(c3496, str);
        if (c3493M21 != null) {
            return c3493M21;
        }
        String strReplaceAll = str.replaceAll("\\\\", "/");
        C3493 c3493M212 = m21(c3496, strReplaceAll);
        return c3493M212 == null ? m21(c3496, strReplaceAll.replaceAll("/", "\\\\")) : c3493M212;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static byte[] m11(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m12(long j) {
        int i = (int) j;
        ﹶⁱ.ـﹶ.ٴˎ(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static List m13(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C1794(0, iArr.length, iArr);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static View m14(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static InterfaceC4012 m15(InterfaceC4012 interfaceC4012) {
        if ((interfaceC4012 instanceof C4021) || (interfaceC4012 instanceof C4013)) {
            return interfaceC4012;
        }
        if (interfaceC4012 instanceof Serializable) {
            return new C4013(interfaceC4012);
        }
        C4021 c4021 = new C4021();
        c4021.f15470 = interfaceC4012;
        return c4021;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m16(java.util.List r6, p164.C2391 r7, p185.AbstractC2562 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p164.C2388
            if (r0 == 0) goto L13
            r0 = r8
            ˊᵔ.ﹳﹳ r0 = (p164.C2388) r0
            int r1 = r0.f9433
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9433 = r1
            goto L18
        L13:
            ˊᵔ.ﹳﹳ r0 = new ˊᵔ.ﹳﹳ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9432
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f9433
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f9430
            java.io.Serializable r7 = r0.f9431
            ʿ.ᵎˏ r7 = (p070.C1561) r7
            ˈⁱ.ˉⁱ.ˆʿ(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f9431
            java.util.List r6 = (java.util.List) r6
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto L5c
        L42:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            ˊᵔ.ٴˎ r2 = new ˊᵔ.ٴˎ
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f9431 = r8
            r0.f9433 = r4
            java.lang.Object r6 = r7.m6467(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            ʿ.ᵎˏ r7 = new ʿ.ᵎˏ
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            ᵎˈ.ˉⁱ r8 = (p338.InterfaceC3856) r8
            r0.f9431 = r7     // Catch: java.lang.Throwable -> L30
            r0.f9430 = r6     // Catch: java.lang.Throwable -> L30
            r0.f9433 = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.mo4036(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            java.lang.Object r2 = r7.f6302
            if (r2 != 0) goto L87
            r7.f6302 = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            ˈי.ʾˈ.ـﹶ(r2, r8)
            goto L67
        L8d:
            java.lang.Object r6 = r7.f6302
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            ٴˑ.ˉⁱ r1 = p288.C3397.f13249
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.AbstractC0001.m16(java.util.List, ˊᵔ.ﾞʽ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m17(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m18(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC2339.m6442("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(AbstractC2339.m6436(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final void m19(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static int m20(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static C3493 m21(C3496 c3496, String str) throws ZipException {
        if (c3496 == null) {
            throw new ZipException(ᐧʻ.ﾞˊ("zip model is null, cannot determine file header with exact match for fileName: ", str));
        }
        if (!AbstractC2978.m7367(str)) {
            throw new ZipException(ᐧʻ.ﾞˊ("file name is null, cannot determine file header with exact match for fileName: ", str));
        }
        C1147 c1147 = c3496.f13532;
        if (c1147 == null) {
            throw new ZipException(ᐧʻ.ﾞˊ("central directory is null, cannot determine file header with exact match for fileName: ", str));
        }
        ArrayList arrayList = c1147.f4789;
        if (arrayList == null) {
            throw new ZipException(ᐧʻ.ﾞˊ("file Headers are null, cannot determine file header with exact match for fileName: ", str));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        Iterator it = c3496.f13532.f4789.iterator();
        while (it.hasNext()) {
            C3493 c3493 = (C3493) it.next();
            String str2 = c3493.f13492;
            if (AbstractC2978.m7367(str2) && str.equals(str2)) {
                return c3493;
            }
        }
        return null;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m22(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final byte[] m23(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m4(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static C5014 m24(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = AbstractC3616.m8539(str).toString();
        }
        int i3 = ˎˑ.ˑי(0, strArr2.length - 1, 2);
        if (i3 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m2(str2);
                m18(str3, str2);
                if (i == i3) {
                    break;
                }
                i += 2;
            }
        }
        return new C5014(strArr2);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Object m25(InterfaceFutureC4542 interfaceFutureC4542, AbstractC2562 abstractC2562) throws Throwable {
        try {
            if (interfaceFutureC4542.isDone()) {
                return AbstractC4686.m10588(interfaceFutureC4542);
            }
            C1602 c1602 = new C1602(1, ˑי.ˏᴵ(abstractC2562));
            interfaceFutureC4542.mo10415(new RunnableC4687(interfaceFutureC4542, c1602, 0), EnumC4679.f17814);
            c1602.m5219(new C1047(6, interfaceFutureC4542));
            return c1602.m5203();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m26(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static Typeface m27(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, m26(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final boolean m28(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        while (abstractComponentCallbacksC0100 != null) {
            if (abstractComponentCallbacksC0100 instanceof ﹳﾞ) {
                return ((ﹳﾞ) abstractComponentCallbacksC0100).ˎˉ();
            }
            abstractComponentCallbacksC0100 = abstractComponentCallbacksC0100.getParentFragment();
        }
        return false;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public float mo29(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public abstract int mo30(byte[] bArr, int i, int i2);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public abstract int mo31(String str, byte[] bArr, int i, int i2);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public abstract String mo32(byte[] bArr, int i, int i2);

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public float mo33(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }
}
