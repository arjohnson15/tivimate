package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.AbstractC0001;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.C0783;
import com.hierynomus.spnego.SpnegoException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import p051.AbstractC1315;
import p091.C1752;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.EnumC1844;
import p117.EnumC1846;
import p241.AbstractC3104;
import p332.AbstractC3777;
import p419.C4852;
import p419.C4853;

/* renamed from: androidx.datastore.preferences.protobuf.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0080 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f507;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f508;

    public AbstractC0080(int i, String str) {
        this.f508 = i;
        this.f507 = str;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static long m566(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C0783 m567(byte[] bArr, int i, int i2, boolean z) {
        C0783 c0783 = new C0783(bArr, i, i2, z);
        try {
            c0783.mo458(i2);
            return c0783;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m568(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: ʽᐧ */
    public abstract void mo437(int i);

    /* renamed from: ʿˏ */
    public abstract long mo439();

    /* renamed from: ˆʿ */
    public abstract String mo440();

    /* renamed from: ˆᵔ */
    public abstract int mo441();

    /* renamed from: ˈٴ */
    public abstract int mo442();

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m569(AbstractC1841 abstractC1841) throws SpnegoException {
        boolean z = abstractC1841 instanceof C4852;
        int i = this.f508;
        String str = (String) this.f507;
        if (z) {
            C4852 c4852 = (C4852) abstractC1841;
            if (c4852.f7065.f7081 == i) {
                AbstractC1841 abstractC1841M10915 = c4852.m10915();
                if (!(abstractC1841M10915 instanceof C4853)) {
                    throw new SpnegoException("Expected a " + str + " (SEQUENCE), not: " + abstractC1841M10915);
                }
                Iterator it = ((C4853) abstractC1841M10915).iterator();
                while (it.hasNext()) {
                    AbstractC1841 abstractC18412 = (AbstractC1841) it.next();
                    if (!(abstractC18412 instanceof C4852)) {
                        throw new SpnegoException("Expected an ASN.1 TaggedObject as " + str + " contents, not: " + abstractC18412);
                    }
                    mo572((C4852) abstractC18412);
                }
                return;
            }
        }
        throw new SpnegoException("Expected to find the " + str + " (CHOICE [" + i + "]) header, not: " + abstractC1841);
    }

    /* renamed from: ˉⁱ */
    public abstract void mo443(int i);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public void mo570(AbstractC3777 abstractC3777, AbstractC1841 abstractC1841) throws IOException {
        C4852 c4852 = new C4852(AbstractC1845.m5606(EnumC1846.f7088, this.f508).m5607(EnumC1844.f7069), abstractC1841, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC1315.f5362);
        arrayList.add(c4852);
        C4852 c48522 = new C4852(AbstractC1845.m5606(EnumC1846.f7087, 0), (AbstractC1841) new C4853(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1752 c1752 = new C1752(new ˈˉ.ﹳﹳ(13), byteArrayOutputStream);
        try {
            c1752.m5468(c48522);
            c1752.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            abstractC3777.mo6213(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c1752.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: ˋˊ */
    public abstract float mo444();

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m571(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != mo576()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo576());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferM575 = m575(this.f508 + i3, bArr);
            if (i3 == i) {
                AbstractC0001.m19(byteBuffer, byteBuffer2, byteBufferM575, iRemaining % 64);
            } else {
                AbstractC0001.m19(byteBuffer, byteBuffer2, byteBufferM575, 64);
            }
        }
    }

    /* renamed from: ˎˑ */
    public abstract String mo445();

    /* renamed from: ˎٴ */
    public abstract double mo446();

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract void mo572(C4852 c4852);

    /* renamed from: ˏᴵ */
    public abstract boolean mo448();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract int[] mo573(int[] iArr, int i);

    /* renamed from: ˑי, reason: contains not printable characters */
    public abstract C0762 mo574();

    /* renamed from: יʻ */
    public abstract int mo451();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ByteBuffer m575(int i, byte[] bArr) {
        int[] iArrMo573 = mo573(AbstractC3104.m7617(bArr), i);
        int[] iArr = (int[]) iArrMo573.clone();
        AbstractC3104.m7616(iArr);
        for (int i2 = 0; i2 < iArrMo573.length; i2++) {
            iArrMo573[i2] = iArrMo573[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo573, 0, 16);
        return byteBufferOrder;
    }

    /* renamed from: ٴˎ */
    public abstract int mo453();

    /* renamed from: ᐧʻ */
    public abstract boolean mo454();

    /* renamed from: ᐧˋ */
    public abstract int mo455();

    /* renamed from: ᐧⁱ */
    public abstract long mo456();

    /* renamed from: ᴵʿ */
    public abstract int mo458(int i);

    /* renamed from: ᵎˏ */
    public abstract int mo459();

    /* renamed from: ᵎـ */
    public abstract C0056 mo460();

    /* renamed from: ᵢʿ */
    public abstract long mo464();

    /* renamed from: ﹳˎ */
    public abstract int mo466();

    /* renamed from: ﹳˑ */
    public abstract long mo467();

    /* renamed from: ﹳﹶ */
    public abstract boolean mo468(int i);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract int mo576();

    /* renamed from: ﾞʽ */
    public abstract long mo469();

    /* renamed from: ﾞˊ */
    public abstract int mo470();
}
