package p260;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0001;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.leanback.widget.C0190;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.lingala.zip4j.exception.ZipException;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p005.C0934;
import p014.C1060;
import p016.C1071;
import p016.C1076;
import p016.C1091;
import p023.C1147;
import p028.C1177;
import p034.C1228;
import p036.C1259;
import p043.C1292;
import p048.C1307;
import p056.C1333;
import p056.C1337;
import p056.InterfaceC1335;
import p063.C1457;
import p080.AbstractC1702;
import p082.InterfaceC1706;
import p082.InterfaceC1708;
import p082.InterfaceC1709;
import p103.InterfaceC1789;
import p112.C1808;
import p112.C1812;
import p115.C1823;
import p115.C1825;
import p137.C2106;
import p137.InterfaceC2105;
import p188.C2624;
import p188.InterfaceC2612;
import p191.C2649;
import p192.C2658;
import p192.C2660;
import p192.C2662;
import p192.C2675;
import p192.InterfaceC2670;
import p202.C2766;
import p223.AbstractC2978;
import p223.AbstractC2980;
import p234.C3086;
import p240.C3100;
import p254.C3159;
import p254.InterfaceC3157;
import p254.InterfaceC3163;
import p254.InterfaceC3165;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p261.InterfaceC3251;
import p267.C3266;
import p267.C3279;
import p271.C3295;
import p298.AbstractC3492;
import p298.C3493;
import p298.C3494;
import p298.C3496;
import p298.C3497;
import p298.C3498;
import p298.C3499;
import p298.C3501;
import p298.C3502;
import p298.C3503;
import p302.C3508;
import p310.C3581;
import p314.C3598;
import p314.InterfaceC3603;
import p317.AbstractC3625;
import p329.AbstractC3731;
import p329.C3739;
import p331.C3758;
import p337.C3812;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p345.C3961;
import p366.C4155;
import p374.C4287;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p397.C4604;
import p397.InterfaceC4599;
import p397.InterfaceC4603;
import p408.C4672;
import p430.C4999;
import p430.C5017;
import p445.C5155;
import p445.InterfaceC5156;
import p446.AbstractC5160;
import p456.C5273;
import p456.InterfaceC5293;
import ʾי.ˑʽ;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ⁱـ.ˑי;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: יﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3222 implements InterfaceC0864, InterfaceC2612, InterfaceC4599, InterfaceC3177, InterfaceC5156, InterfaceC5293 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f12538;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f12539;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f12540;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12541;

    public C3222(int i) {
        this.f12541 = i;
        switch (i) {
            case 9:
                this.f12538 = new byte[2];
                this.f12539 = new byte[4];
                this.f12540 = new byte[8];
                break;
            case 14:
                this.f12539 = new C3222(9);
                this.f12540 = new byte[4];
                break;
            case 19:
                String string = UUID.randomUUID().toString();
                C4155 c4155 = new C4155(string.getBytes(AbstractC3625.f13869));
                c4155.f16069 = string;
                this.f12538 = c4155;
                this.f12539 = C5017.f19033;
                this.f12540 = new ArrayList();
                break;
            default:
                this.f12538 = new C0190(1);
                C0190 c0190 = new C0190(0);
                this.f12539 = c0190;
                this.f12540 = c0190;
                break;
        }
    }

    public /* synthetic */ C3222(int i, boolean z) {
        this.f12541 = i;
    }

    public C3222(ConcurrentHashMap concurrentHashMap, C1825 c1825, C3295 c3295, Class cls) {
        this.f12541 = 5;
        this.f12538 = concurrentHashMap;
        this.f12539 = c1825;
        this.f12540 = c3295;
    }

    public /* synthetic */ C3222(Object obj, Object obj2, Object obj3, int i) {
        this.f12541 = i;
        this.f12540 = obj;
        this.f12538 = obj2;
        this.f12539 = obj3;
    }

    public /* synthetic */ C3222(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f12541 = i;
        this.f12538 = obj;
        this.f12539 = obj2;
        this.f12540 = obj3;
    }

    public C3222(String str, char[] cArr) {
        this.f12541 = 0;
        this.f12538 = str;
        this.f12540 = Arrays.copyOf(cArr, cArr.length);
        this.f12539 = "";
    }

    public C3222(ArrayList arrayList) {
        this.f12541 = 10;
        this.f12538 = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f12539 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C3086 c3086 = (C3086) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f12539;
            jArr[i2] = c3086.f11909;
            jArr[i2 + 1] = c3086.f11910;
        }
        long[] jArr2 = (long[]) this.f12539;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f12540 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C3222(InterfaceC3163 interfaceC3163) {
        this.f12541 = 17;
        this.f12538 = interfaceC3163;
    }

    public C3222(InterfaceC3177 interfaceC3177, InterfaceC4603 interfaceC4603) {
        this.f12541 = 18;
        this.f12538 = interfaceC3177;
        this.f12539 = interfaceC4603;
        this.f12540 = new SparseArray();
    }

    public C3222(ـﹶ r8, ˉי r9, C2675 c2675, Set set) {
        this.f12541 = 8;
        this.f12538 = r9;
        this.f12539 = r8;
        this.f12540 = c2675;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m7941(str, 0, str.length(), 1, true, new C1228(str, 2));
        }
    }

    public C3222(C4999 c4999) {
        this.f12541 = 3;
        this.f12540 = c4999;
        this.f12539 = new C3758(2);
    }

    public C3222(InterfaceC1335[] interfaceC1335Arr) {
        this.f12541 = 15;
        C3812 c3812 = new C3812();
        C1337 c1337 = new C1337();
        c1337.f5455 = 1.0f;
        c1337.f5460 = 1.0f;
        C1333 c1333 = C1333.f5415;
        c1337.f5448 = c1333;
        c1337.f5457 = c1333;
        c1337.f5458 = c1333;
        c1337.f5454 = c1333;
        ByteBuffer byteBuffer = InterfaceC1335.f5442;
        c1337.f5452 = byteBuffer;
        c1337.f5450 = byteBuffer.asShortBuffer();
        c1337.f5451 = byteBuffer;
        c1337.f5447 = -1;
        InterfaceC1335[] interfaceC1335Arr2 = new InterfaceC1335[interfaceC1335Arr.length + 2];
        this.f12538 = interfaceC1335Arr2;
        System.arraycopy(interfaceC1335Arr, 0, interfaceC1335Arr2, 0, interfaceC1335Arr.length);
        this.f12539 = c3812;
        this.f12540 = c1337;
        interfaceC1335Arr2[interfaceC1335Arr.length] = c3812;
        interfaceC1335Arr2[interfaceC1335Arr.length + 1] = c1337;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m7923(int i, byte[] bArr) {
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static boolean m7924(Editable editable, KeyEvent keyEvent, boolean z) {
        C2658[] c2658Arr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c2658Arr = (C2658[]) editable.getSpans(selectionStart, selectionEnd, C2658.class)) != null && c2658Arr.length > 0) {
            for (C2658 c2658 : c2658Arr) {
                int spanStart = editable.getSpanStart(c2658);
                int spanEnd = editable.getSpanEnd(c2658);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static void m7925(long j, byte[] bArr) {
        bArr[7] = (byte) (j >>> 56);
        bArr[6] = (byte) (j >>> 48);
        bArr[5] = (byte) (j >>> 40);
        bArr[4] = (byte) (j >>> 32);
        bArr[3] = (byte) (j >>> 24);
        bArr[2] = (byte) (j >>> 16);
        bArr[1] = (byte) (j >>> 8);
        bArr[0] = (byte) (j & 255);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m7926(int i, byte[] bArr) {
        bArr[3] = (byte) (i >>> 24);
        bArr[2] = (byte) (i >>> 16);
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static void m7927(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (randomAccessFile instanceof C1177) {
            ((C1177) randomAccessFile).f4870.seek(j);
        } else {
            randomAccessFile.seek(j);
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m7928(AbstractC3492 abstractC3492, C3222 c3222) throws ZipException {
        List list = abstractC3492.f13503;
        if (list == null || list.size() <= 0) {
            return;
        }
        List list2 = abstractC3492.f13503;
        C3499 c3499 = null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3502 c3502 = (C3502) it.next();
                if (c3502 != null && c3502.f13560 == 39169) {
                    byte[] bArr = c3502.f13559;
                    if (bArr == null || bArr.length != 7) {
                        throw new ZipException("corrupt AES extra data records");
                    }
                    c3499 = new C3499();
                    c3499.f5033 = 12;
                    c3499.f13552 = c3502.f13561;
                    int i = 0;
                    int iM7929 = m7929(0, bArr);
                    for (int i2 : AbstractC1702.m5408(2)) {
                        if (ᵎˏ.ﹶˆ(i2) == iM7929) {
                            c3499.f13553 = i2;
                            byte[] bArr2 = new byte[2];
                            System.arraycopy(bArr, 2, bArr2, 0, 2);
                            c3499.f13551 = new String(bArr2);
                            int i3 = bArr[4] & 255;
                            int[] iArrM5408 = AbstractC1702.m5408(3);
                            int length = iArrM5408.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                int i5 = iArrM5408[i4];
                                if (ᵎˏ.ᐧʻ(i5) == i3) {
                                    i = i5;
                                    break;
                                }
                                i4++;
                            }
                            c3499.f13554 = i;
                            c3499.f13555 = ᵎˏ.ʽᐧ(m7929(5, bArr));
                        }
                    }
                    throw new ZipException("Unsupported Aes version");
                }
            }
        }
        if (c3499 != null) {
            abstractC3492.f13504 = c3499;
            abstractC3492.f13497 = 4;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static int m7929(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m7930(InputStream inputStream, byte[] bArr, int i) throws ZipException {
        if (AbstractC2978.m7368(inputStream, bArr, 0, i) != i) {
            throw new ZipException("Could not fill buffer");
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static C3494 m7931(List list, C3222 c3222, long j, long j2, long j3, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3502 c3502 = (C3502) it.next();
            if (c3502 != null && 1 == c3502.f13560) {
                C3494 c3494 = new C3494(2);
                c3494.f13515 = -1L;
                c3494.f13516 = -1L;
                c3494.f13514 = -1L;
                c3494.f13517 = -1;
                byte[] bArr = c3502.f13559;
                int i2 = c3502.f13561;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = 0;
                if (i2 > 0 && j == 4294967295L) {
                    c3494.f13516 = c3222.m7936(0, bArr);
                    i3 = 8;
                }
                if (i3 < c3502.f13561 && j2 == 4294967295L) {
                    c3494.f13515 = c3222.m7936(i3, bArr);
                    i3 += 8;
                }
                if (i3 < c3502.f13561 && j3 == 4294967295L) {
                    c3494.f13514 = c3222.m7936(i3, bArr);
                    i3 += 8;
                }
                if (i3 < c3502.f13561 && i == 65535) {
                    c3494.f13517 = m7923(i3, bArr);
                }
                return c3494;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f12541) {
            case 0:
                StringBuilder sb = new StringBuilder("AuthenticationContext[");
                sb.append((String) this.f12538);
                sb.append('@');
                return ˉᵎ.ˑי(sb, (String) this.f12539, ']');
            default:
                return super.toString();
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public void m7932(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byte[] bArr = (byte[]) this.f12538;
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1091 m7933() throws GeneralSecurityException {
        ˑʽ r1;
        C1076 c1076 = (C1076) this.f12538;
        if (c1076 == null || (r1 = (ˑʽ) this.f12539) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1076.f4640 != ((C0934) r1.ˆʿ).f4123.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C1071 c1071 = C1071.f4612;
        C1071 c10712 = c1076.f4641;
        if (c10712 != c1071 && ((Integer) this.f12540) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c10712 == c1071 && ((Integer) this.f12540) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c10712 == c1071) {
            C0934.m3799(new byte[0]);
        } else if (c10712 == C1071.f4625) {
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f12540).intValue()).array());
        } else {
            if (c10712 != C1071.f4619) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((C1076) this.f12538).f4641);
            }
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f12540).intValue()).array());
        }
        return new C1091();
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public void m7934(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f12538 = Integer.valueOf(i);
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ */
    public void mo4850() {
        ((InterfaceC3177) this.f12538).mo4850();
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ */
    public InterfaceC3178 mo4851(int i, int i2) {
        InterfaceC3177 interfaceC3177 = (InterfaceC3177) this.f12538;
        if (i2 != 3) {
            return interfaceC3177.mo4851(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.f12540;
        C4604 c4604 = (C4604) sparseArray.get(i);
        if (c4604 != null) {
            return c4604;
        }
        C4604 c46042 = new C4604(interfaceC3177.mo4851(i, i2), (InterfaceC4603) this.f12539);
        sparseArray.put(i, c46042);
        return c46042;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int m7935(InputStream inputStream) throws ZipException {
        byte[] bArr = (byte[]) this.f12539;
        m7930(inputStream, bArr, 4);
        return m7923(0, bArr);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long m7936(int i, byte[] bArr) {
        int length = bArr.length - i;
        byte[] bArr2 = (byte[]) this.f12540;
        if (length < 8) {
            Arrays.fill(bArr2, (byte) 0);
        }
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, 8));
        return ((((((((((((((bArr2[7] & 255) << 8) | (bArr2[6] & 255)) << 8) | (bArr2[5] & 255)) << 8) | (bArr2[4] & 255)) << 8) | (bArr2[3] & 255)) << 8) | (bArr2[2] & 255)) << 8) | (bArr2[1] & 255)) << 8) | (bArr2[0] & 255);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long m7937() {
        C3159 c3159 = (C3159) this.f12540;
        if (c3159 != null) {
            return c3159.f12217;
        }
        return -1L;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public void m7938(AbstractC5160 abstractC5160) {
        C2766 c2766 = abstractC5160.f19711;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f12538;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ((HashMap) this.f12539).put(Long.valueOf(c2766.f10817), abstractC5160);
            ((HashMap) this.f12540).put(((C4672) c2766.f10819).f17808, abstractC5160);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public List mo7939(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f12538;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.f12539;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C3086 c3086 = (C3086) list.get(i);
                C1808 c1808 = c3086.f11911;
                if (c1808.f6986 == -3.4028235E38f) {
                    arrayList2.add(c3086);
                } else {
                    arrayList.add(c1808);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C1259(16));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C1812 c1812M5555 = ((C3086) arrayList2.get(i3)).f11911.m5555();
            c1812M5555.f7011 = (-1) - i3;
            c1812M5555.f7021 = 1;
            arrayList.add(c1812M5555.m5556());
        }
        return arrayList;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public List m7940(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f12538).get(new C1823(bArr));
        return list != null ? list : Collections.emptyList();
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ */
    public void mo4858(InterfaceC3157 interfaceC3157) {
        ((InterfaceC3177) this.f12538).mo4858(interfaceC3157);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public Object m7941(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC2670 interfaceC2670) {
        char c;
        C2662 c2662 = new C2662((C2660) ((ـﹶ) this.f12539).ᐧˋ);
        int i4 = i;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo4416 = true;
        int iCharCount = i4;
        while (iCharCount < i2 && i5 < i3 && zMo4416) {
            SparseArray sparseArray = c2662.f10548.f10543;
            C2660 c2660 = sparseArray == null ? null : (C2660) sparseArray.get(iCodePointAt);
            if (c2662.f10549 == 2) {
                if (c2660 != null) {
                    c2662.f10548 = c2660;
                    c2662.f10550++;
                } else {
                    if (iCodePointAt == 65038) {
                        c2662.m6841();
                    } else if (iCodePointAt != 65039) {
                        C2660 c26602 = c2662.f10548;
                        if (c26602.f10542 != null) {
                            if (c2662.f10550 != 1) {
                                c2662.f10551 = c26602;
                                c2662.m6841();
                            } else if (c2662.m6840()) {
                                c2662.f10551 = c2662.f10548;
                                c2662.m6841();
                            } else {
                                c2662.m6841();
                            }
                            c = 3;
                        } else {
                            c2662.m6841();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (c2660 == null) {
                c2662.m6841();
                c = 1;
            } else {
                c2662.f10549 = 2;
                c2662.f10548 = c2660;
                c2662.f10550 = 1;
                c = 2;
            }
            c2662.f10547 = iCodePointAt;
            if (c == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                if (iCharCount < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c == 3) {
                if (z || !m7943(charSequence, i4, iCharCount, c2662.f10551.f10542)) {
                    zMo4416 = interfaceC2670.mo4416(charSequence, i4, iCharCount, c2662.f10551.f10542);
                    i5++;
                }
            }
            i4 = iCharCount;
        }
        if (c2662.f10549 == 2 && c2662.f10548.f10542 != null && ((c2662.f10550 > 1 || c2662.m6840()) && i5 < i3 && zMo4416 && (z || !m7943(charSequence, i4, iCharCount, c2662.f10548.f10542)))) {
            interfaceC2670.mo4416(charSequence, i4, iCharCount, c2662.f10548.f10542);
        }
        return interfaceC2670.mo4415();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m7942(C2649 c2649, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f12539;
        HashMap map2 = (HashMap) this.f12538;
        C3508 c3508 = new C3508(byteArrayOutputStream, map2, map, (C1292) this.f12540);
        InterfaceC1789 interfaceC1789 = (InterfaceC1789) map2.get(C2649.class);
        if (interfaceC1789 != null) {
            interfaceC1789.mo4581(c2649, c3508);
        } else {
            throw new EncodingException("No encoder for " + C2649.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m7943(java.lang.CharSequence r10, int r11, int r12, p192.C2655 r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260.C3222.m7943(java.lang.CharSequence, int, int, ˎˉ.ʿˏ):boolean");
    }

    @Override // p000.InterfaceC0864
    /* renamed from: ˏᵢ */
    public InterfaceC0875 mo900() {
        return new C1307((C4999) this.f12540, (String) this.f12538, (C3758) this.f12539);
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo7944(long j) {
        long[] jArr = (long[]) this.f12540;
        int iM10163 = AbstractC4470.m10163(jArr, j, false);
        if (iM10163 < jArr.length) {
            return iM10163;
        }
        return -1;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m7945(InterfaceC0875 interfaceC0875, Uri uri, Map map, long j, long j2, C4287 c4287) throws UnrecognizedInputFormatException {
        boolean z;
        boolean z2 = true;
        C3159 c3159 = new C3159(interfaceC0875, j, j2);
        this.f12540 = c3159;
        if (((InterfaceC3165) this.f12539) != null) {
            return;
        }
        InterfaceC3165[] interfaceC3165ArrMo7835 = ((InterfaceC3163) this.f12538).mo7835(uri, map);
        int length = interfaceC3165ArrMo7835.length;
        C3928 c3928 = AbstractC3980.f15360;
        AbstractC3968.m9177(length, "expectedSize");
        C3961 c3961 = new C3961(length);
        if (interfaceC3165ArrMo7835.length == 1) {
            this.f12539 = interfaceC3165ArrMo7835[0];
        } else {
            int length2 = interfaceC3165ArrMo7835.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                InterfaceC3165 interfaceC3165 = interfaceC3165ArrMo7835[i];
                try {
                } catch (EOFException unused) {
                    z = ((InterfaceC3165) this.f12539) != null || c3159.f12217 == j;
                } catch (Throwable th) {
                    if (((InterfaceC3165) this.f12539) == null && c3159.f12217 != j) {
                        z2 = false;
                    }
                    AbstractC4464.m10132(z2);
                    c3159.f12219 = 0;
                    throw th;
                }
                if (interfaceC3165.mo4074(c3159)) {
                    this.f12539 = interfaceC3165;
                    c3159.f12219 = 0;
                    break;
                } else {
                    c3961.m9171(interfaceC3165.mo4079());
                    z = ((InterfaceC3165) this.f12539) != null || c3159.f12217 == j;
                    AbstractC4464.m10132(z);
                    c3159.f12219 = 0;
                    i++;
                }
            }
            if (((InterfaceC3165) this.f12539) == null) {
                String str = "None of the available extractors (" + new C1228(", ").m4414(AbstractC3968.m9196(AbstractC3980.m9210(interfaceC3165ArrMo7835), new C3581(17))) + ") could read the stream.";
                uri.getClass();
                C3932 c3932M9167 = c3961.m9167();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                AbstractC3980.m9209(c3932M9167);
                throw unrecognizedInputFormatException;
            }
        }
        ((InterfaceC3165) this.f12539).mo4084(c4287);
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ˑﾞ */
    public ImageHeaderParser$ImageType mo6786() {
        return ˑי.ᴵʿ((ArrayList) this.f12539, AbstractC3731.m8694((ByteBuffer) this.f12538));
    }

    @Override // p188.InterfaceC2612
    /* renamed from: יʻ */
    public void mo6787() {
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean m7946(Object obj) {
        if (obj instanceof InterfaceC1706) {
            ((InterfaceC1706) obj).mo5422().f6670 = true;
        }
        ((InterfaceC1708) this.f12539).m5424(obj);
        return ((C3100) this.f12540).mo5418(obj);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object m7947() {
        Object objMo5419 = ((C3100) this.f12540).mo5419();
        if (objMo5419 == null) {
            objMo5419 = ((InterfaceC1709) this.f12538).m5425();
            if (Log.isLoggable("FactoryPools", 2)) {
                String str = "Created new " + objMo5419.getClass();
            }
        }
        if (objMo5419 instanceof InterfaceC1706) {
            ((InterfaceC1706) objMo5419).mo5422().f6670 = false;
        }
        return objMo5419;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String m7948(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f12539;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f12538;
            if (i2 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i2));
            if (((Integer) arrayList.get(i2)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                ArrayList arrayList3 = (ArrayList) this.f12540;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    @Override // p445.InterfaceC5156
    /* renamed from: ᐧʻ */
    public InterfaceC3251 mo4064(InterfaceC3251 interfaceC3251, C3598 c3598) {
        Drawable drawable = (Drawable) interfaceC3251.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C1060) this.f12539).mo4064(C2624.m6805(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2105) this.f12538), c3598);
        }
        if (drawable instanceof C1457) {
            return ((C5155) this.f12540).mo4064(interfaceC3251, c3598);
        }
        return null;
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int mo7949() {
        return ((long[]) this.f12540).length;
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ᐧⁱ */
    public int mo6788() {
        ByteBuffer byteBufferM8694 = AbstractC3731.m8694((ByteBuffer) this.f12538);
        C2106 c2106 = (C2106) this.f12540;
        if (byteBufferM8694 == null) {
            return -1;
        }
        ArrayList arrayList = (ArrayList) this.f12539;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo6796 = ((InterfaceC3603) arrayList.get(i)).mo6796(byteBufferM8694, c2106);
                if (iMo6796 != -1) {
                    return iMo6796;
                }
            } finally {
            }
        }
        return -1;
    }

    @Override // p397.InterfaceC4599
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long mo7950(int i) {
        AbstractC4464.m10142(i >= 0);
        long[] jArr = (long[]) this.f12540;
        AbstractC4464.m10142(i < jArr.length);
        return jArr[i];
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ArrayList m7951(int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            C3502 c3502 = new C3502(2);
            c3502.f13560 = m7929(i2, bArr);
            int iM7929 = m7929(i2 + 2, bArr);
            c3502.f13561 = iM7929;
            int i3 = i2 + 4;
            if (iM7929 > 0) {
                byte[] bArr2 = new byte[iM7929];
                System.arraycopy(bArr, i3, bArr2, 0, iM7929);
                c3502.f13559 = bArr2;
            }
            i2 = i3 + iM7929;
            arrayList.add(c3502);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public void m7952(OutputStream outputStream, long j) {
        byte[] bArr = (byte[]) this.f12540;
        m7925(j, bArr);
        outputStream.write(bArr);
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public void m7953(OutputStream outputStream, int i) {
        byte[] bArr = (byte[]) this.f12539;
        m7926(i, bArr);
        outputStream.write(bArr);
    }

    @Override // p456.InterfaceC5293
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public void mo7954(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C5273) this.f12540).m11837(true, i, iOException, bArr, (String) this.f12538, (ArrayList) this.f12539);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C3266 m7955() throws GeneralSecurityException {
        Integer num = (Integer) this.f12538;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f12539) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((C3279) this.f12540) != null) {
            return new C3266(num.intValue(), ((Integer) this.f12539).intValue(), (C3279) this.f12540);
        }
        throw new GeneralSecurityException("variant not set");
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ﹶˆ */
    public Bitmap mo6789(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new C3739(AbstractC3731.m8694((ByteBuffer) this.f12538)), null, options);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public C3498 m7956(RandomAccessFile randomAccessFile, C3222 c3222, C3501 c3501) throws IOException {
        long length = randomAccessFile.length();
        if (length < 22) {
            throw new ZipException("Zip file size less than size of zip headers. Probably not a zip file.");
        }
        long length2 = length - 22;
        m7927(randomAccessFile, length2);
        byte[] bArr = (byte[]) ((C3222) this.f12539).f12539;
        randomAccessFile.readFully(bArr);
        if (m7923(0, bArr) != 101010256) {
            length2 = randomAccessFile.length() - 22;
            for (long length3 = randomAccessFile.length() < 65536 ? randomAccessFile.length() : 65536L; length3 > 0 && length2 > 0; length3--) {
                length2--;
                m7927(randomAccessFile, length2);
                randomAccessFile.readFully(bArr);
                if (m7923(0, bArr) != 101010256) {
                }
            }
            throw new ZipException("Zip headers not found. Probably not a zip file");
        }
        m7927(randomAccessFile, 4 + length2);
        C3498 c3498 = new C3498();
        c3498.f5033 = 4;
        byte[] bArr2 = (byte[]) c3222.f12538;
        randomAccessFile.readFully(bArr2);
        c3498.f13546 = m7929(0, bArr2);
        randomAccessFile.readFully(bArr2);
        c3498.f13548 = m7929(0, bArr2);
        randomAccessFile.readFully(bArr2);
        c3498.f13544 = m7929(0, bArr2);
        randomAccessFile.readFully(bArr2);
        c3498.f13549 = m7929(0, bArr2);
        byte[] bArr3 = (byte[]) c3222.f12539;
        randomAccessFile.readFully(bArr3);
        m7923(0, bArr3);
        c3498.f13545 = length2;
        byte[] bArr4 = (byte[]) this.f12540;
        randomAccessFile.readFully(bArr4);
        c3498.f13550 = c3222.m7936(0, bArr4);
        randomAccessFile.readFully(bArr2);
        int iM7929 = m7929(0, bArr2);
        String strM8 = null;
        if (iM7929 > 0) {
            try {
                byte[] bArr5 = new byte[iM7929];
                randomAccessFile.readFully(bArr5);
                strM8 = AbstractC0001.m8(bArr5, false, AbstractC2980.f11456);
            } catch (IOException unused) {
            }
        }
        if (strM8 != null) {
            c3498.f13547 = strM8;
        }
        ((C3496) this.f12538).f13539 = c3498.f13546 > 0;
        return c3498;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public C3496 m7957(RandomAccessFile randomAccessFile, C3501 c3501) throws IOException {
        byte b;
        List listEmptyList;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C3496 c3496;
        int i;
        byte[] bArr4;
        C1147 c1147;
        ArrayList arrayList;
        Charset charset;
        byte[] bArr5;
        int i2;
        C3222 c3222 = this;
        C3222 c32222 = (C3222) c3222.f12539;
        if (randomAccessFile.length() == 0) {
            return new C3496();
        }
        if (randomAccessFile.length() < 22) {
            throw new ZipException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
        C3496 c34962 = new C3496();
        c3222.f12538 = c34962;
        try {
            c34962.f13535 = c3222.m7956(randomAccessFile, c32222, c3501);
            C3496 c34963 = (C3496) c3222.f12538;
            C3498 c3498 = c34963.f13535;
            if (c3498.f13549 == 0) {
                return c34963;
            }
            long j = c3498.f13545;
            C3497 c3497 = new C3497(2);
            m7927(randomAccessFile, j - 20);
            byte[] bArr6 = (byte[]) c32222.f12539;
            randomAccessFile.readFully(bArr6);
            int i3 = 0;
            long jM7923 = m7923(0, bArr6);
            byte[] bArr7 = (byte[]) c32222.f12540;
            if (jM7923 == 117853008) {
                ((C3496) c3222.f12538).f13536 = true;
                c3497.f5033 = 9;
                randomAccessFile.readFully(bArr6);
                c3497.f13542 = m7923(0, bArr6);
                randomAccessFile.readFully(bArr7);
                c3497.f13543 = c32222.m7936(0, bArr7);
                randomAccessFile.readFully(bArr6);
                c3497.f13541 = m7923(0, bArr6);
            } else {
                ((C3496) c3222.f12538).f13536 = false;
                c3497 = null;
            }
            c34963.f13537 = c3497;
            C3496 c34964 = (C3496) c3222.f12538;
            boolean z = c34964.f13536;
            byte[] bArr8 = (byte[]) c32222.f12538;
            if (z) {
                C3497 c34972 = c34964.f13537;
                if (c34972 == null) {
                    throw new ZipException("invalid zip64 end of central directory locator");
                }
                long j2 = c34972.f13543;
                if (j2 < 0) {
                    throw new ZipException("invalid offset for start of end of central directory record");
                }
                randomAccessFile.seek(j2);
                C3503 c3503 = new C3503();
                randomAccessFile.readFully(bArr6);
                if (m7923(0, bArr6) != 101075792) {
                    throw new ZipException("invalid signature for zip64 end of central directory record");
                }
                c3503.f5033 = 10;
                randomAccessFile.readFully(bArr7);
                c3503.f13564 = c32222.m7936(0, bArr7);
                randomAccessFile.readFully(bArr8);
                c3503.f13566 = m7929(0, bArr8);
                randomAccessFile.readFully(bArr8);
                c3503.f13562 = m7929(0, bArr8);
                randomAccessFile.readFully(bArr6);
                c3503.f13568 = m7923(0, bArr6);
                randomAccessFile.readFully(bArr6);
                c3503.f13569 = m7923(0, bArr6);
                randomAccessFile.readFully(bArr7);
                c3503.f13563 = c32222.m7936(0, bArr7);
                randomAccessFile.readFully(bArr7);
                c3503.f13565 = c32222.m7936(0, bArr7);
                randomAccessFile.readFully(bArr7);
                c3503.f13567 = c32222.m7936(0, bArr7);
                randomAccessFile.readFully(bArr7);
                c3503.f13570 = c32222.m7936(0, bArr7);
                long j3 = c3503.f13564 - 44;
                if (j3 > 0) {
                    randomAccessFile.readFully(new byte[(int) j3]);
                }
                c34964.f13533 = c3503;
                C3496 c34965 = (C3496) c3222.f12538;
                C3503 c35032 = c34965.f13533;
                if (c35032 == null || c35032.f13568 <= 0) {
                    c34965.f13539 = false;
                } else {
                    c34965.f13539 = true;
                }
            }
            C3496 c34966 = (C3496) c3222.f12538;
            C1147 c11472 = new C1147(5);
            ArrayList arrayList2 = new ArrayList();
            C3496 c34967 = (C3496) c3222.f12538;
            boolean z2 = c34967.f13536;
            long j4 = z2 ? c34967.f13533.f13570 : c34967.f13535.f13550;
            long j5 = z2 ? c34967.f13533.f13565 : c34967.f13535.f13549;
            randomAccessFile.seek(j4);
            byte[] bArr9 = new byte[2];
            byte[] bArr10 = new byte[4];
            byte[] bArr11 = bArr7;
            int i4 = 0;
            while (i4 < j5) {
                C3493 c3493 = new C3493();
                randomAccessFile.readFully(bArr6);
                if (m7923(i3, bArr6) != 33639248) {
                    throw new ZipException("Expected central directory entry not found (#" + (i4 + 1) + ")");
                }
                c3493.f5033 = 3;
                randomAccessFile.readFully(bArr8);
                c3493.f13513 = m7929(i3, bArr8);
                randomAccessFile.readFully(bArr8);
                c3493.f13495 = m7929(i3, bArr8);
                byte[] bArr12 = new byte[2];
                randomAccessFile.readFully(bArr12);
                c3493.f13498 = AbstractC2978.m7357(bArr12[i3], i3);
                c3493.f13506 = AbstractC2978.m7357(bArr12[i3], 3);
                c3493.f13491 = AbstractC2978.m7357(bArr12[1], 3);
                c3493.f13500 = (byte[]) bArr12.clone();
                randomAccessFile.readFully(bArr8);
                c3493.f13493 = ᵎˏ.ʽᐧ(m7929(0, bArr8));
                randomAccessFile.readFully(bArr6);
                c3493.f13505 = m7923(0, bArr6);
                randomAccessFile.readFully(bArr10);
                C1147 c11473 = c11472;
                ArrayList arrayList3 = arrayList2;
                c3493.f13507 = c32222.m7936(0, bArr10);
                byte[] bArr13 = bArr11;
                Arrays.fill(bArr13, (byte) 0);
                randomAccessFile.readFully(bArr13, 0, 4);
                byte[] bArr14 = bArr9;
                c3493.f13494 = c32222.m7936(0, bArr13);
                Arrays.fill(bArr13, (byte) 0);
                randomAccessFile.readFully(bArr13, 0, 4);
                c3493.f13499 = c32222.m7936(0, bArr13);
                randomAccessFile.readFully(bArr8);
                int iM7929 = m7929(0, bArr8);
                c3493.f13501 = iM7929;
                randomAccessFile.readFully(bArr8);
                c3493.f13508 = m7929(0, bArr8);
                randomAccessFile.readFully(bArr8);
                int iM79292 = m7929(0, bArr8);
                randomAccessFile.readFully(bArr8);
                c3493.f13510 = m7929(0, bArr8);
                randomAccessFile.readFully(bArr14);
                randomAccessFile.readFully(bArr10);
                c3493.f13511 = (byte[]) bArr10.clone();
                randomAccessFile.readFully(bArr10);
                c3493.f13512 = c32222.m7936(0, bArr10);
                if (iM7929 <= 0) {
                    throw new ZipException("Invalid entry name in file header");
                }
                byte[] bArr15 = new byte[iM7929];
                randomAccessFile.readFully(bArr15);
                String strM8 = AbstractC0001.m8(bArr15, c3493.f13491, null);
                c3493.f13492 = strM8;
                byte[] bArr16 = c3493.f13511;
                byte b2 = bArr16[0];
                c3493.f13502 = (b2 != 0 && AbstractC2978.m7357(b2, 4)) || ((b = bArr16[3]) != 0 && AbstractC2978.m7357(b, 6)) || strM8.endsWith("/") || strM8.endsWith("\\");
                int i5 = c3493.f13508;
                if (i5 > 0) {
                    if (i5 < 4) {
                        if (i5 > 0) {
                            randomAccessFile.skipBytes(i5);
                        }
                        listEmptyList = null;
                    } else {
                        byte[] bArr17 = new byte[i5];
                        randomAccessFile.read(bArr17);
                        try {
                            listEmptyList = c3222.m7951(i5, bArr17);
                        } catch (Exception unused) {
                            listEmptyList = Collections.emptyList();
                        }
                    }
                    c3493.f13503 = listEmptyList;
                }
                List list = c3493.f13503;
                if (list == null || list.size() <= 0) {
                    bArr = bArr10;
                    bArr2 = bArr14;
                    bArr3 = bArr8;
                    c3496 = c34966;
                    i = i4;
                    bArr4 = bArr6;
                    c1147 = c11473;
                    arrayList = arrayList3;
                    charset = null;
                    bArr5 = bArr13;
                    i2 = iM79292;
                } else {
                    bArr = bArr10;
                    bArr2 = bArr14;
                    i2 = iM79292;
                    bArr4 = bArr6;
                    arrayList = arrayList3;
                    bArr5 = bArr13;
                    bArr3 = bArr8;
                    c3496 = c34966;
                    c1147 = c11473;
                    i = i4;
                    charset = null;
                    C3494 c3494M7931 = m7931(c3493.f13503, c32222, c3493.f13499, c3493.f13494, c3493.f13512, c3493.f13510);
                    if (c3494M7931 != null) {
                        c3493.f13496 = c3494M7931;
                        long j6 = c3494M7931.f13516;
                        if (j6 != -1) {
                            c3493.f13499 = j6;
                        }
                        long j7 = c3494M7931.f13515;
                        if (j7 != -1) {
                            c3493.f13494 = j7;
                        }
                        long j8 = c3494M7931.f13514;
                        if (j8 != -1) {
                            c3493.f13512 = j8;
                        }
                        int i6 = c3494M7931.f13517;
                        if (i6 != -1) {
                            c3493.f13510 = i6;
                        }
                    }
                }
                m7928(c3493, c32222);
                if (i2 > 0) {
                    byte[] bArr18 = new byte[i2];
                    randomAccessFile.readFully(bArr18);
                    c3493.f13509 = AbstractC0001.m8(bArr18, c3493.f13491, charset);
                }
                if (c3493.f13498) {
                    if (c3493.f13504 != null) {
                        c3493.f13497 = 4;
                    } else {
                        c3493.f13497 = 2;
                        arrayList.add(c3493);
                        i4 = i + 1;
                        c3222 = this;
                        arrayList2 = arrayList;
                        c11472 = c1147;
                        bArr9 = bArr2;
                        bArr11 = bArr5;
                        bArr10 = bArr;
                        bArr8 = bArr3;
                        c34966 = c3496;
                        i3 = 0;
                        bArr6 = bArr4;
                    }
                }
                arrayList.add(c3493);
                i4 = i + 1;
                c3222 = this;
                arrayList2 = arrayList;
                c11472 = c1147;
                bArr9 = bArr2;
                bArr11 = bArr5;
                bArr10 = bArr;
                bArr8 = bArr3;
                c34966 = c3496;
                i3 = 0;
                bArr6 = bArr4;
            }
            C1147 c11474 = c11472;
            byte[] bArr19 = bArr8;
            C3496 c34968 = c34966;
            c11474.f4789 = arrayList2;
            randomAccessFile.readFully(bArr6);
            if (m7923(0, r33) == 84233040) {
                randomAccessFile.readFully(bArr19);
                int iM79293 = m7929(0, bArr19);
                if (iM79293 > 0) {
                    byte[] bArr20 = new byte[iM79293];
                    randomAccessFile.readFully(bArr20);
                    new String(bArr20);
                }
            }
            c34968.f13532 = c11474;
            return (C3496) this.f12538;
        } catch (ZipException e) {
            throw e;
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new ZipException("Zip headers not found. Probably not a zip file or a corrupted zip file", e2);
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public void m7958(HashMap map) {
        C3758 c3758 = (C3758) this.f12539;
        synchronized (c3758) {
            c3758.f14520 = null;
            ((HashMap) c3758.f14519).clear();
            ((HashMap) c3758.f14519).putAll(map);
        }
    }
}
