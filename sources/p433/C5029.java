package p433;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.work.impl.WorkDatabase;
import com.bumptech.glide.ˑʽ;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p078.AbstractC1685;
import p115.AbstractC1829;
import p115.C1831;
import p115.C1832;
import p313.C3590;
import p313.C3591;
import p313.C3592;
import p331.C3762;
import p331.C3768;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p414.C4736;
import p418.C4783;
import p418.C4792;
import p418.C4802;
import p418.C4814;
import p418.C4818;
import p457.C5357;
import p457.C5368;
import ˆʽ.ᵎˏ;
import ـˊ.ʿʼ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹶᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5029 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f19093;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f19094;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f19095;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f19096;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f19097;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f19098;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f19099;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f19100;

    public C5029() {
        this.f19097 = 1;
        this.f19096 = null;
        this.f19093 = null;
        this.f19100 = null;
        this.f19094 = null;
        this.f19098 = null;
        this.f19099 = null;
    }

    public C5029(Context context, C5357 c5357, ﹶˆ r4, C4736 c4736, WorkDatabase workDatabase, C3768 c3768, ArrayList arrayList) {
        this.f19097 = 2;
        this.f19096 = c5357;
        this.f19093 = r4;
        this.f19100 = c4736;
        this.f19094 = workDatabase;
        this.f19098 = c3768;
        this.f19099 = arrayList;
        this.f19095 = context.getApplicationContext();
        new C5368();
    }

    public C5029(String str) {
        this.f19097 = 0;
        ʿʼ r0 = SMBRuntimeException.f3663;
        this.f19096 = AbstractC3917.m9105(C5029.class);
        this.f19093 = str;
        this.f19100 = r0;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f19094 = reentrantLock;
        this.f19098 = reentrantLock.newCondition();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static byte[] m11139(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return ˑʽ.ˏᵢ(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(ᵎˏ.ˑי("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C1831 m11140(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C4792 c4792M10744 = C4792.m10744(byteArrayInputStream, C0747.m3127());
            byteArrayInputStream.close();
            return new C1831(3, (C4802) ((C4792) C3762.m8776(c4792M10744).f14530).m3248());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public String toString() {
        switch (this.f19097) {
            case 0:
                return (String) this.f19093;
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1831 m11141() throws GeneralSecurityException, InterruptedException, IOException {
        if (((C1832) this.f19099) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        C1831 c1831 = new C1831(3, C4792.m10746());
        C1832 c1832 = (C1832) this.f19099;
        synchronized (c1831) {
            c1831.m5571(c1832.f7057);
        }
        c1831.m5569(AbstractC1829.m5566((C4792) c1831.m5570().f14530).m10839().m10849());
        Context context = (Context) this.f19096;
        String str = (String) this.f19093;
        String str2 = (String) this.f19100;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((C3590) this.f19098) != null) {
            C3762 c3762M5570 = c1831.m5570();
            C3590 c3590 = (C3590) this.f19098;
            byte[] bArr = new byte[0];
            C4792 c4792 = (C4792) c3762M5570.f14530;
            byte[] bArrMo4122 = c3590.mo4122(c4792.m3165(), bArr);
            try {
                if (!C4792.m10747(c3590.mo4121(bArrMo4122, bArr), C0747.m3127()).equals(c4792)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                C4783 c4783M10827 = C4814.m10827();
                C0762 c0762M3129 = AbstractC0748.m3129(bArrMo4122, 0, bArrMo4122.length);
                c4783M10827.m2948();
                C4814.m10826((C4814) c4783M10827.f3527, c0762M3129);
                C4818 c4818M5566 = AbstractC1829.m5566(c4792);
                c4783M10827.m2948();
                C4814.m10828((C4814) c4783M10827.f3527, c4818M5566);
                if (!editorEdit.putString(str, ˑʽ.ˉⁱ(((C4814) c4783M10827.m2947()).m3165())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, ˑʽ.ˉⁱ(((C4792) c1831.m5570().f14530).m3165())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return c1831;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1831 m11142(byte[] bArr) {
        try {
            this.f19098 = new C3591().m8499((String) this.f19094);
            try {
                return new C1831(3, (C4802) ((C4792) C3762.m8775(new C1831(1, new ByteArrayInputStream(bArr)), (C3590) this.f19098).f14530).m3248());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return m11140(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                return m11140(bArr);
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public synchronized C3592 m11143() {
        C3592 c3592;
        try {
            if (((String) this.f19093) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C3592.f13811) {
                try {
                    byte[] bArrM11139 = m11139((Context) this.f19096, (String) this.f19093, (String) this.f19100);
                    if (bArrM11139 == null) {
                        if (((String) this.f19094) != null) {
                            this.f19098 = m11144();
                        }
                        this.f19095 = m11141();
                    } else if (((String) this.f19094) == null) {
                        this.f19095 = m11140(bArrM11139);
                    } else {
                        if (Build.VERSION.SDK_INT >= 23) {
                            this.f19095 = m11142(bArrM11139);
                        } else {
                            this.f19095 = m11140(bArrM11139);
                        }
                    }
                    c3592 = new C3592(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3592;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C3590 m11144() throws KeyStoreException {
        if (!(Build.VERSION.SDK_INT >= 23)) {
            return null;
        }
        C3591 c3591 = new C3591();
        try {
            boolean zM8498 = C3591.m8498((String) this.f19094);
            try {
                return c3591.m8499((String) this.f19094);
            } catch (GeneralSecurityException | ProviderException e) {
                if (zM8498) {
                    return null;
                }
                throw new KeyStoreException(ᵎˏ.ˑי("the master key ", (String) this.f19094, " exists but is unusable"), e);
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            return null;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object m11145(long j, TimeUnit timeUnit) {
        String str = (String) this.f19093;
        InterfaceC3918 interfaceC3918 = (InterfaceC3918) this.f19096;
        ReentrantLock reentrantLock = (ReentrantLock) this.f19094;
        reentrantLock.lock();
        try {
            try {
                Throwable th = (Throwable) this.f19095;
                if (th != null) {
                    throw th;
                }
                AbstractC1685 abstractC1685 = (AbstractC1685) this.f19099;
                if (abstractC1685 != null) {
                    reentrantLock.unlock();
                    return abstractC1685;
                }
                interfaceC3918.mo5517(str, "Awaiting << {} >>");
                Condition condition = (Condition) this.f19098;
                if (j == 0) {
                    while (((AbstractC1685) this.f19099) == null && ((Throwable) this.f19095) == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = (Throwable) this.f19095;
                if (th2 != null) {
                    interfaceC3918.mo5526(str, th2, "<< {} >> woke to: {}");
                    throw ((Throwable) this.f19095);
                }
                AbstractC1685 abstractC16852 = (AbstractC1685) this.f19099;
                reentrantLock.unlock();
                return abstractC16852;
            } catch (InterruptedException e) {
                throw ((ʿʼ) this.f19100).ˏᵢ(e);
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
