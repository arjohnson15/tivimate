package p383;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.ImageView;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.measurement.C0559;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p009.C0996;
import p064.C1463;
import p076.C1664;
import p141.AbstractC2214;
import p141.C2203;
import p222.AbstractC2962;
import p222.C2860;
import p222.C2964;
import p300.AbstractC3505;
import p331.C3762;
import p334.C3789;
import p353.AbstractC4010;
import p358.InterfaceC4073;
import p359.EnumC4076;
import p359.EnumC4079;
import p359.EnumC4080;
import p378.AbstractC4345;
import ˈי.ʾˈ;
import ᴵﹳ.ٴˎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵢᵢ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4456 implements InterfaceC4073 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static C4456 f17160;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f17161;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f17162;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f17163;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f17164;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17165;

    public C4456(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.f17165 = 5;
        this.f17163 = str;
        this.f17161 = i2;
        this.f17164 = arrayList == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(arrayList);
        this.f17162 = bArr;
    }

    public C4456(int i, String str, String str2, String str3) {
        this.f17165 = 2;
        this.f17161 = i;
        this.f17163 = str;
        this.f17164 = str2;
        this.f17162 = str3;
    }

    public C4456(Context context) {
        this.f17165 = 0;
        this.f17163 = new Handler(Looper.getMainLooper());
        this.f17164 = new CopyOnWriteArrayList();
        this.f17162 = new Object();
        this.f17161 = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C0996(5, this), intentFilter);
    }

    public C4456(ImageView imageView) {
        this.f17165 = 4;
        this.f17161 = 0;
        this.f17163 = imageView;
    }

    public C4456(String str) throws NoSuchAlgorithmException {
        this.f17165 = 3;
        this.f17164 = str;
        this.f17162 = new ByteArrayOutputStream(4096);
        try {
            Mac mac = Mac.getInstance(str);
            this.f17163 = mac;
            this.f17161 = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4456(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r5.f17165 = r1
            r2 = 0
            r5.<init>()
            ʾᵎ.ˋⁱ r3 = new ʾᵎ.ˋⁱ
            r3.<init>(r5)
            r5.f17163 = r3
            boolean r4 = android.support.v4.media.session.AbstractC0002.m45(r0)
            if (r4 == 0) goto L93
            r5.f17164 = r6
            r5.f17162 = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r4 = 16
            if (r7 < r4) goto L8b
            r7 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1823053428: goto L56;
                case 392315023: goto L4b;
                case 392315118: goto L42;
                case 392316170: goto L37;
                case 392317873: goto L2c;
                default: goto L2a;
            }
        L2a:
            r0 = -1
            goto L60
        L2c:
            java.lang.String r0 = "HMACSHA512"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L35
            goto L2a
        L35:
            r0 = 4
            goto L60
        L37:
            java.lang.String r0 = "HMACSHA384"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L40
            goto L2a
        L40:
            r0 = 3
            goto L60
        L42:
            java.lang.String r1 = "HMACSHA256"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L60
            goto L2a
        L4b:
            java.lang.String r0 = "HMACSHA224"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L54
            goto L2a
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r0 = "HMACSHA1"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5f
            goto L2a
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L7e;
                case 2: goto L79;
                case 3: goto L74;
                case 4: goto L6f;
                default: goto L63;
            }
        L63:
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L6f:
            r6 = 64
            r5.f17161 = r6
            goto L87
        L74:
            r6 = 48
            r5.f17161 = r6
            goto L87
        L79:
            r6 = 32
            r5.f17161 = r6
            goto L87
        L7e:
            r6 = 28
            r5.f17161 = r6
            goto L87
        L83:
            r6 = 20
            r5.f17161 = r6
        L87:
            r3.get()
            return
        L8b:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L93:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.C4456.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static synchronized C4456 m10067(Context context) {
        try {
            if (f17160 == null) {
                f17160 = new C4456(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17160;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10068(int i, C4456 c4456) {
        synchronized (c4456.f17162) {
            try {
                if (c4456.f17161 == i) {
                    return;
                }
                c4456.f17161 = i;
                Iterator it = ((CopyOnWriteArrayList) c4456.f17164).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1664 c1664 = (C1664) weakReference.get();
                    if (c1664 != null) {
                        c1664.m5339(i);
                    } else {
                        ((CopyOnWriteArrayList) c4456.f17164).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public String toString() {
        switch (this.f17165) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return String.format("WindowsVersion[%s, %s, %d, %s]", (EnumC4080) this.f17163, (EnumC4076) this.f17164, Integer.valueOf(this.f17161), (EnumC4079) this.f17162);
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m10069() {
        ImageView imageView = (ImageView) this.f17163;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2962.m7332(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (((C2860) this.f17162) == null) {
                    this.f17162 = new C2860();
                }
                C2860 c2860 = (C2860) this.f17162;
                c2860.f11119 = null;
                c2860.f11118 = false;
                c2860.f11121 = null;
                c2860.f11120 = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    c2860.f11118 = true;
                    c2860.f11119 = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    c2860.f11120 = true;
                    c2860.f11121 = imageTintMode;
                }
                if (c2860.f11118 || c2860.f11120) {
                    C2964.m7337(drawable, c2860, imageView.getDrawableState());
                    return;
                }
            }
            C2860 c28602 = (C2860) this.f17164;
            if (c28602 != null) {
                C2964.m7337(drawable, c28602, imageView.getDrawableState());
            }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m10070(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17162;
        try {
            if (byteArrayOutputStream.size() + i2 > 4096) {
                m10072(0);
            }
            byteArrayOutputStream.write(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m10071(byte[] bArr) throws InvalidKeyException {
        try {
            ((Mac) this.f17163).init(new SecretKeySpec(bArr, (String) this.f17164));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m10072(int i) throws IllegalStateException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17162;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length - i;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 16;
            ((Mac) this.f17163).update(byteArray, i2, i3 <= length ? 16 : length - i2);
            i2 = i3;
        }
        byteArrayOutputStream.reset();
    }

    @Override // p358.InterfaceC4073
    /* renamed from: ـˆ */
    public byte[] mo8035(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.f17161) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C1463 c1463 = (C1463) this.f17163;
        ((Mac) c1463.get()).update(bArr);
        return Arrays.copyOf(((Mac) c1463.get()).doFinal(), i);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m10073() {
        int i;
        synchronized (this.f17162) {
            i = this.f17161;
        }
        return i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int m10074() {
        int i = this.f17161;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public String m10075(C0559 c0559, Uri uri, int i) throws ParserException, NoSuchAlgorithmException {
        int i2 = this.f17161;
        if (i2 == 1) {
            String str = ((String) c0559.f2912) + ":" + ((String) c0559.f2913);
            int i3 = C2203.f8663;
            String strEncodeToString = Base64.encodeToString(str.getBytes(AbstractC4010.f15450), 0);
            int i4 = AbstractC4470.f17202;
            Locale locale = Locale.US;
            return ᐧʻ.ﾞˊ("Basic ", strEncodeToString);
        }
        if (i2 != 2) {
            throw new ParserException(null, new UnsupportedOperationException(), false, 4);
        }
        String str2 = (String) this.f17164;
        String str3 = (String) this.f17163;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strM6183 = AbstractC2214.m6183(i);
            String str4 = ((String) c0559.f2912) + ":" + str3 + ":" + ((String) c0559.f2913);
            int i5 = C2203.f8663;
            Charset charset = AbstractC4010.f15450;
            String strM10162 = AbstractC4470.m10162(messageDigest.digest((AbstractC4470.m10162(messageDigest.digest(str4.getBytes(charset))) + ":" + str2 + ":" + AbstractC4470.m10162(messageDigest.digest((strM6183 + ":" + uri).getBytes(charset)))).getBytes(charset)));
            String str5 = (String) this.f17162;
            return str5.isEmpty() ? String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", (String) c0559.f2912, str3, str2, uri, strM10162) : String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", (String) c0559.f2912, str3, str2, uri, strM10162, str5);
        } catch (NoSuchAlgorithmException e) {
            throw new ParserException(null, e, false, 4);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m10076(AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        ImageView imageView = (ImageView) this.f17163;
        Context context = imageView.getContext();
        int[] iArr = AbstractC3505.f13589;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, i);
        AbstractC4345.m9881(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c3762M8778.f14531, i);
        try {
            Drawable drawable2 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c3762M8778.f14531;
            if (drawable2 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable2 = ٴˎ.ˏᵢ(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                AbstractC2962.m7332(drawable2);
            }
            if (typedArray.hasValue(2)) {
                ʾˈ.ᴵʿ(imageView, c3762M8778.m8782(2));
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeM7331 = AbstractC2962.m7331(typedArray.getInt(3, -1), null);
                int i2 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(modeM7331);
                if (i2 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            c3762M8778.m8783();
        } catch (Throwable th) {
            c3762M8778.m8783();
            throw th;
        }
    }
}
