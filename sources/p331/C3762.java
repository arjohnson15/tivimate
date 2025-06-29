package p331;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Choreographer;
import androidx.leanback.widget.ʿˏ;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0282;
import com.google.android.gms.internal.measurement.C0423;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005.C0934;
import p016.C1071;
import p016.C1075;
import p016.C1087;
import p115.AbstractC1820;
import p115.AbstractC1829;
import p115.C1827;
import p115.C1831;
import p123.C1998;
import p137.C2106;
import p188.C2639;
import p188.InterfaceC2612;
import p197.ChoreographerFrameCallbackC2712;
import p222.C2859;
import p222.C2964;
import p267.C3266;
import p267.C3275;
import p267.C3279;
import p271.C3295;
import p296.C3487;
import p313.C3590;
import p314.InterfaceC3603;
import p329.AbstractC3740;
import p364.InterfaceC4139;
import p371.AbstractC4208;
import p375.C4305;
import p375.C4317;
import p411.InterfaceC4690;
import p412.C4693;
import p418.C4780;
import p418.C4792;
import p418.C4814;
import p418.EnumC4778;
import p426.C4910;
import p437.InterfaceC5069;
import p441.C5126;
import p444.C5148;
import p444.C5152;
import p447.C5171;
import p447.C5177;
import p456.C5349;
import ˈˉ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;
import ᵔʼ.ˑʽ;
import ᵢ.ʿʼ;
import ﹶˋ.ـﹶ;

/* renamed from: ᴵﹳ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3762 implements InterfaceC4690, InterfaceC2612, InterfaceC4139 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f14530;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f14531;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f14532;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14533;

    public /* synthetic */ C3762(int i) {
        this.f14533 = i;
    }

    public C3762(Context context, TypedArray typedArray) {
        this.f14533 = 7;
        this.f14530 = context;
        this.f14531 = typedArray;
    }

    public C3762(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2106 c2106) {
        this.f14533 = 6;
        AbstractC3740.m8706(c2106, "Argument must not be null");
        this.f14530 = c2106;
        AbstractC3740.m8706(arrayList, "Argument must not be null");
        this.f14531 = arrayList;
        this.f14532 = new C0282(parcelFileDescriptor);
    }

    public C3762(WorkDatabase_Impl workDatabase_Impl) {
        this.f14533 = 0;
        this.f14530 = workDatabase_Impl;
        new C3757(workDatabase_Impl, 4);
        this.f14531 = new C3766(workDatabase_Impl, 2);
        this.f14532 = new C3766(workDatabase_Impl, 3);
    }

    public /* synthetic */ C3762(Object obj, Object obj2, Object obj3, int i) {
        this.f14533 = i;
        this.f14530 = obj;
        this.f14531 = obj2;
        this.f14532 = obj3;
    }

    public C3762(String str) {
        this.f14533 = 13;
        C3758 c3758 = new C3758(15, false);
        this.f14531 = c3758;
        this.f14532 = c3758;
        this.f14530 = str;
    }

    public C3762(String str, HashMap map) {
        this.f14533 = 8;
        this.f14530 = str;
        this.f14531 = map;
        this.f14532 = new HashMap();
    }

    public C3762(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f14533 = 12;
        this.f14531 = arrayDeque;
        this.f14530 = bufferedReader;
    }

    public C3762(Set set, String str, String str2) {
        this.f14533 = 16;
        C4910 c4910 = C4910.f18573;
        Set setEmptySet = set == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set);
        Map mapEmptyMap = Collections.emptyMap();
        this.f14531 = str2;
        this.f14532 = c4910;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f14530 = DesugarCollections.unmodifiableSet(hashSet);
    }

    public C3762(ʿʼ r2) {
        this.f14533 = 15;
        this.f14533 = 15;
        this.f14530 = r2;
        this.f14531 = Choreographer.getInstance();
        this.f14532 = new ChoreographerFrameCallbackC2712(1, this);
    }

    public C3762(C4792 c4792, List list) {
        this.f14533 = 4;
        this.f14530 = c4792;
        this.f14531 = list;
        this.f14532 = C3295.f12832;
    }

    public C3762(C5177 c5177) {
        this.f14533 = 17;
        this.f14530 = new ArrayList();
        this.f14531 = new C5126();
        this.f14532 = c5177;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final C3762 m8775(C1831 c1831, C3590 c3590) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) c1831.f7055;
        try {
            C4814 c4814M10825 = C4814.m10825(byteArrayInputStream, C0747.m3127());
            byteArrayInputStream.close();
            if (c4814M10825.m10829().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                C4792 c4792M10747 = C4792.m10747(c3590.mo4121(c4814M10825.m10829().m3130(), bArr), C0747.m3127());
                if (c4792M10747.m10752() > 0) {
                    return m8776(c4792M10747);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C3762 m8776(C4792 c4792) throws GeneralSecurityException {
        if (c4792.m10752() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c4792.m10752());
        for (C4780 c4780 : c4792.m10749()) {
            c4780.getClass();
            try {
                try {
                    AbstractC1820 abstractC1820M9807 = C4317.f16771.m9807(C4305.m9789(c4780.m10717().m10786(), c4780.m10717().m10787(), c4780.m10717().m10785(), c4780.m10720(), c4780.m10720() == EnumC4778.f18315 ? null : Integer.valueOf(c4780.m10719())));
                    int iOrdinal = c4780.m10718().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new C1827(abstractC1820M9807));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new C3762(c4792, DesugarCollections.unmodifiableList(arrayList));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static String m8777(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return ᐧʻ.ˋⁱ(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return ᐧʻ.ˉⁱ(str, string);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C3762 m8778(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C3762(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public Object clone() {
        switch (this.f14533) {
            case 1:
                C0423 c0423 = (C0423) ((C0423) this.f14530).clone();
                C3762 c3762 = new C3762(1);
                c3762.f14530 = c0423;
                c3762.f14531 = (C0423) c0423.clone();
                c3762.f14532 = new ArrayList();
                Iterator it = ((ArrayList) this.f14532).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c3762.f14532).add((C0423) ((C0423) it.next()).clone());
                }
                return c3762;
            default:
                return super.clone();
        }
    }

    @Override // p452.InterfaceC5193
    public Object get() {
        return new C1998(new ˑʽ(), new ﹳﹳ(22), (InterfaceC5069) ((ʿˏ) this.f14530).get(), (C5152) ((ˉˆ.ﹳﹳ) this.f14531).get(), (C5148) ((ـﹶ) this.f14532).get());
    }

    public String toString() {
        switch (this.f14533) {
            case 4:
                return AbstractC1829.m5566((C4792) this.f14530).toString();
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f14530);
                sb.append('{');
                C3758 c3758 = (C3758) ((C3758) this.f14531).f14520;
                String str = "";
                while (c3758 != null) {
                    C5349 c5349 = (C5349) c3758.f14519;
                    sb.append(str);
                    if (c5349 == null || !C5349.class.isArray()) {
                        sb.append(c5349);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{c5349});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c3758 = (C3758) c3758.f14520;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object mo8779() {
        return null;
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Uri mo8780() {
        return (Uri) this.f14532;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p181.C2510 m8781() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.Object r3 = r8.f14530     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r4 = r8.f14531     // Catch: java.lang.Throwable -> Lb4
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = m8777(r3, r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            r4.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Laf
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L29
        L25:
            goto L29
        L26:
            r0 = move-exception
            goto Lb2
        L29:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Laf
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Laf
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Laf
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L69
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r8.f14532     // Catch: java.lang.Throwable -> L69
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L69
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        L4d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L69
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L69
            goto L4d
        L69:
            r1 = move-exception
            goto Lb6
        L6b:
            r0.connect()     // Catch: java.lang.Throwable -> L69
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L69
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto La1
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r5.<init>()     // Catch: java.lang.Throwable -> L9e
        L8d:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> L9e
            r7 = -1
            if (r6 == r7) goto L99
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L9e
            goto L8d
        L99:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L9e
            goto La1
        L9e:
            r1 = move-exception
            r2 = r3
            goto Lb6
        La1:
            if (r3 == 0) goto La6
            r3.close()
        La6:
            r0.disconnect()
            ˋᵔ.ˑʽ r0 = new ˋᵔ.ˑʽ
            r0.<init>(r1, r2)
            return r0
        Laf:
            r1 = move-exception
        Lb0:
            r0 = r2
            goto Lb6
        Lb2:
            r1 = r0
            goto Lb0
        Lb4:
            r0 = move-exception
            goto Lb2
        Lb6:
            if (r2 == 0) goto Lbb
            r2.close()
        Lbb:
            if (r0 == 0) goto Lc0
            r0.disconnect()
        Lc0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3762.m8781():ˋᵔ.ˑʽ");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ColorStateList m8782(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f14531;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = com.bumptech.glide.ﹳﹳ.ˑי((Context) this.f14530, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m8783() {
        ((TypedArray) this.f14531).recycle();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public Drawable m8784(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14531;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ٴˎ.ˏᵢ((Context) this.f14530, resourceId);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean m8785(int i, C4693 c4693, C5171 c5171) {
        int[] iArr = c5171.f19839;
        int i2 = iArr[0];
        C5126 c5126 = (C5126) this.f14531;
        c5126.f19605 = i2;
        c5126.f19600 = iArr[1];
        c5126.f19604 = c5171.m11505();
        c5126.f19608 = c5171.m11490();
        c5126.f19609 = false;
        c5126.f19602 = i;
        boolean z = c5126.f19605 == 3;
        boolean z2 = c5126.f19600 == 3;
        boolean z3 = z && c5171.f19787 > 0.0f;
        boolean z4 = z2 && c5171.f19787 > 0.0f;
        int[] iArr2 = c5171.f19830;
        if (z3 && iArr2[0] == 4) {
            c5126.f19605 = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c5126.f19600 = 1;
        }
        c4693.m10607(c5171, c5126);
        c5171.m11493(c5126.f19601);
        c5171.m11513(c5126.f19606);
        c5171.f19814 = c5126.f19603;
        c5171.m11484(c5126.f19607);
        c5126.f19602 = 0;
        return c5126.f19609;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public Typeface m8786(int i, int i2, C2859 c2859) {
        int resourceId = ((TypedArray) this.f14531).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f14532) == null) {
            this.f14532 = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f14532;
        ThreadLocal threadLocal = AbstractC4208.f16226;
        Context context = (Context) this.f14530;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC4208.m9655(context, resourceId, typedValue, i2, c2859, true, false);
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Uri mo8787() {
        return (Uri) this.f14530;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m8788(java.lang.Class r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3762.m8788(java.lang.Class):java.lang.Object");
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ˑﾞ */
    public ImageHeaderParser$ImageType mo6786() throws Throwable {
        C0282 c0282 = (C0282) this.f14532;
        C2106 c2106 = (C2106) this.f14530;
        ArrayList arrayList = (ArrayList) this.f14531;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC3603 interfaceC3603 = (InterfaceC3603) arrayList.get(i);
            C2639 c2639 = null;
            try {
                C2639 c26392 = new C2639(new FileInputStream(c0282.m1544().getFileDescriptor()), c2106);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo6798 = interfaceC3603.mo6798(c26392);
                    c26392.m6822();
                    c0282.m1544();
                    if (imageHeaderParser$ImageTypeMo6798 != ImageHeaderParser$ImageType.UNKNOWN) {
                        return imageHeaderParser$ImageTypeMo6798;
                    }
                } catch (Throwable th) {
                    th = th;
                    c2639 = c26392;
                    if (c2639 != null) {
                        c2639.m6822();
                    }
                    c0282.m1544();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p188.InterfaceC2612
    /* renamed from: יʻ */
    public void mo6787() {
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ClipDescription mo8789() {
        return (ClipDescription) this.f14531;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1087 m8790() throws GeneralSecurityException {
        ʾי.ˑʽ r1;
        C1075 c1075 = (C1075) this.f14530;
        if (c1075 == null || (r1 = (ʾי.ˑʽ) this.f14531) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1075.f4638 != ((C0934) r1.ˆʿ).f4123.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C1071 c1071 = C1071.f4616;
        C1071 c10712 = c1075.f4639;
        if (c10712 != c1071 && ((Integer) this.f14532) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c10712 == c1071 && ((Integer) this.f14532) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c10712 == c1071) {
            C0934.m3799(new byte[0]);
        } else if (c10712 == C1071.f4613) {
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f14532).intValue()).array());
        } else {
            if (c10712 != C1071.f4626) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((C1075) this.f14530).f4639);
            }
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f14532).intValue()).array());
        }
        return new C1087();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C3275 m8791() throws GeneralSecurityException {
        ʾי.ˑʽ r1;
        C0934 c0934M3799;
        C3266 c3266 = (C3266) this.f14530;
        if (c3266 == null || (r1 = (ʾי.ˑʽ) this.f14531) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3266.f12729 != ((C0934) r1.ˆʿ).f4123.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C3279 c3279 = C3279.f12765;
        C3279 c32792 = c3266.f12731;
        if (c32792 != c3279 && ((Integer) this.f14532) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c32792 == c3279 && ((Integer) this.f14532) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c32792 == c3279) {
            c0934M3799 = C0934.m3799(new byte[0]);
        } else if (c32792 == C3279.f12757 || c32792 == C3279.f12768) {
            c0934M3799 = C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f14532).intValue()).array());
        } else {
            if (c32792 != C3279.f12764) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C3266) this.f14530).f12731);
            }
            c0934M3799 = C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f14532).intValue()).array());
        }
        return new C3275((C3266) this.f14530, c0934M3799);
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ᐧⁱ */
    public int mo6788() throws Throwable {
        C0282 c0282 = (C0282) this.f14532;
        C2106 c2106 = (C2106) this.f14530;
        ArrayList arrayList = (ArrayList) this.f14531;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC3603 interfaceC3603 = (InterfaceC3603) arrayList.get(i);
            C2639 c2639 = null;
            try {
                C2639 c26392 = new C2639(new FileInputStream(c0282.m1544().getFileDescriptor()), c2106);
                try {
                    int iMo6795 = interfaceC3603.mo6795(c26392, c2106);
                    c26392.m6822();
                    c0282.m1544();
                    if (iMo6795 != -1) {
                        return iMo6795;
                    }
                } catch (Throwable th) {
                    th = th;
                    c2639 = c26392;
                    if (c2639 != null) {
                        c2639.m6822();
                    }
                    c0282.m1544();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public Drawable m8792(int i) {
        int resourceId;
        Drawable drawableM7222;
        if (!((TypedArray) this.f14531).hasValue(i) || (resourceId = ((TypedArray) this.f14531).getResourceId(i, 0)) == 0) {
            return null;
        }
        C2964 c2964M7339 = C2964.m7339();
        Context context = (Context) this.f14530;
        synchronized (c2964M7339) {
            drawableM7222 = c2964M7339.f11437.m7222(context, resourceId, true);
        }
        return drawableM7222;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public String m8793() {
        if (!m8794()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f14532;
        this.f14532 = null;
        return str;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean m8794() throws IOException {
        String strTrim;
        if (((String) this.f14532) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f14531;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f14532 = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.f14530).readLine();
            this.f14532 = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f14532 = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public void m8795(C5177 c5177) {
        ArrayList arrayList = (ArrayList) this.f14530;
        arrayList.clear();
        int size = c5177.f19893.size();
        for (int i = 0; i < size; i++) {
            C5171 c5171 = (C5171) c5177.f19893.get(i);
            int[] iArr = c5171.f19839;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c5171);
            }
        }
        c5177.f19899.f19610 = true;
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo8796() {
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ﹶˆ */
    public Bitmap mo6789(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((C0282) this.f14532).m1544().getFileDescriptor(), null, options);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public void m8797(C5177 c5177, int i, int i2, int i3) {
        c5177.getClass();
        int i4 = c5177.f19828;
        int i5 = c5177.f19792;
        c5177.f19828 = 0;
        c5177.f19792 = 0;
        c5177.m11493(i2);
        c5177.m11513(i3);
        if (i4 < 0) {
            c5177.f19828 = 0;
        } else {
            c5177.f19828 = i4;
        }
        if (i5 < 0) {
            c5177.f19792 = 0;
        } else {
            c5177.f19792 = i5;
        }
        C5177 c51772 = (C5177) this.f14532;
        c51772.f19896 = i;
        c51772.m11539();
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void m8798(C3487 c3487) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f14530;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ((HashMap) this.f14531).put(Long.valueOf(c3487.f13476), c3487);
            ((HashMap) this.f14532).put(c3487.f13479, c3487);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
