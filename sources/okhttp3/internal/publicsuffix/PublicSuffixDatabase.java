package okhttp3.internal.publicsuffix;

import android.support.v4.media.session.AbstractC0001;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p013.AbstractC1041;
import p013.C1040;
import p013.C1053;
import p070.AbstractC1549;
import p127.C2034;
import p218.AbstractC2834;
import p218.C2829;
import p218.InterfaceC2836;
import p266.C3264;
import p317.AbstractC3616;
import p366.C4149;
import p366.C4150;
import p447.AbstractC5179;
import ˏʼ.ʽᐧ;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f3912 = {42};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final List f3913 = Collections.singletonList("*");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final PublicSuffixDatabase f3914 = new PublicSuffixDatabase();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public byte[] f3916;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte[] f3918;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicBoolean f3917 = new AtomicBoolean(false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final CountDownLatch f3915 = new CountDownLatch(1);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static List m3669(String str) {
        List listM8532 = AbstractC3616.m8532(str, new char[]{'.'});
        if (!AbstractC1549.m5138(AbstractC1041.m4034(listM8532), "")) {
            return listM8532;
        }
        List list = listM8532;
        int size = listM8532.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(size, "Requested element count ", " is less than zero.").toString());
        }
        C1053 c1053 = C1053.f4449;
        if (size == 0) {
            return c1053;
        }
        if (list instanceof Collection) {
            if (size >= list.size()) {
                return AbstractC1041.m4016(list);
            }
            if (size == 1) {
                return Collections.singletonList(AbstractC1041.m4026(list));
            }
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : Collections.singletonList(arrayList.get(0)) : c1053;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3670() {
        try {
            InputStream inputStreamACpAu = ProtectedTvPlayerApplication.ACpAu(PublicSuffixDatabase.class, "publicsuffixes.gz");
            if (inputStreamACpAu == null) {
                return;
            }
            C4149 c4149 = new C4149(new C4150(ʽᐧ.ˎˑ(inputStreamACpAu)));
            try {
                long j = c4149.readInt();
                c4149.mo9526(j);
                byte[] bArrM9527 = c4149.f16049.m9527(j);
                long j2 = c4149.readInt();
                c4149.mo9526(j2);
                byte[] bArrM95272 = c4149.f16049.m9527(j2);
                AbstractC0001.m5(c4149, null);
                synchronized (this) {
                    this.f3916 = bArrM9527;
                    this.f3918 = bArrM95272;
                }
            } finally {
            }
        } finally {
            this.f3915.countDown();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m3671(String str) throws InterruptedException {
        String strM8046;
        String strM80462;
        String strM80463;
        List listM8532;
        List listM3669 = m3669(IDN.toUnicode(str));
        if (this.f3917.get() || !this.f3917.compareAndSet(false, true)) {
            try {
                this.f3915.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        m3670();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        C2034 c2034 = C2034.f7700;
                        C2034.f7700.getClass();
                        C2034.m5684(5, "Failed to read public suffix list", e);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f3916 == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listM3669.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            bArr[i] = ((String) listM3669.get(i)).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strM8046 = null;
                break;
            }
            byte[] bArr2 = this.f3916;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strM8046 = C3264.m8046(bArr2, bArr, i2);
            if (strM8046 != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = f3912;
                byte[] bArr4 = this.f3916;
                if (bArr4 == null) {
                    bArr4 = null;
                }
                strM80462 = C3264.m8046(bArr4, bArr3, i3);
                if (strM80462 != null) {
                    break;
                }
            }
            strM80462 = null;
        } else {
            strM80462 = null;
        }
        if (strM80462 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr5 = this.f3918;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                strM80463 = C3264.m8046(bArr5, bArr, i5);
                if (strM80463 != null) {
                    break;
                }
            }
            strM80463 = null;
        } else {
            strM80463 = null;
        }
        if (strM80463 != null) {
            listM8532 = AbstractC3616.m8532("!".concat(strM80463), new char[]{'.'});
        } else if (strM8046 == null && strM80462 == null) {
            listM8532 = f3913;
        } else {
            List listM85322 = C1053.f4449;
            List listM85323 = strM8046 != null ? AbstractC3616.m8532(strM8046, new char[]{'.'}) : listM85322;
            if (strM80462 != null) {
                listM85322 = AbstractC3616.m8532(strM80462, new char[]{'.'});
            }
            listM8532 = listM85323.size() > listM85322.size() ? listM85323 : listM85322;
        }
        if (listM3669.size() == listM8532.size() && ((String) listM8532.get(0)).charAt(0) != '!') {
            return null;
        }
        int size2 = ((String) listM8532.get(0)).charAt(0) == '!' ? listM3669.size() - listM8532.size() : listM3669.size() - (listM8532.size() + 1);
        InterfaceC2836 c1040 = new C1040(0, m3669(str));
        if (size2 < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(size2, "Requested element count ", " is less than zero.").toString());
        }
        if (size2 != 0) {
            c1040 = new C2829(c1040, size2);
        }
        return AbstractC2834.m7108(c1040, ".");
    }
}
