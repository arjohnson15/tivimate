package p277;

import android.support.v4.media.session.AbstractC0002;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import com.hierynomus.protocol.transport.TransportException;
import com.hierynomus.smbj.common.SMBException;
import com.rapid7.helper.smbj.io.SMB2Exception;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import p125.C2012;
import p125.C2015;
import p143.C2227;
import p326.C3721;
import p446.AbstractC5160;
import p446.C5169;
import p449.EnumC5185;
import p449.EnumC5186;
import p449.EnumC5189;
import p456.C5349;
import ʾי.ˑʽ;
import ˆʽ.ᵎˏ;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ـﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3361 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3361[] f13160;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC3361 f13161;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC5185 f13162;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final EnumC5185 f13163;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f13164;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3361 EF6;

    static {
        EnumC5185 enumC5185 = EnumC5185.f19982;
        EnumC5185 enumC51852 = EnumC5185.f19984;
        EnumC3361 enumC3361 = new EnumC3361("WINREG", 0, "winreg", enumC5185, enumC51852);
        EnumC5185 enumC51853 = EnumC5185.f19983;
        EnumC3361 enumC33612 = new EnumC3361("SRVSVC", 1, "srvsvc", enumC51853, enumC51852);
        f13161 = enumC33612;
        f13160 = new EnumC3361[]{enumC3361, enumC33612, new EnumC3361("LSASVC", 2, "lsarpc", EnumC5185.f19979, enumC51852), new EnumC3361("SAMSVC", 3, "samr", EnumC5185.f19980, enumC51852), new EnumC3361("BROWSER_SRVSVC", 4, "browser", enumC51853, enumC51852), new EnumC3361("SVCCTL", 5, "svcctl", EnumC5185.f19981, enumC51852)};
    }

    public EnumC3361(String str, int i, String str2, EnumC5185 enumC5185, EnumC5185 enumC51852) {
        this.f13164 = str2;
        this.f13162 = enumC5185;
        this.f13163 = enumC51852;
    }

    public static EnumC3361 valueOf(String str) {
        return (EnumC3361) Enum.valueOf(EnumC3361.class, str);
    }

    public static EnumC3361[] values() {
        return (EnumC3361[]) f13160.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᐧʻ m8179(C2227 c2227) throws InterruptedException, IOException {
        AbstractC5160 abstractC5160M6208 = c2227.m6208("IPC$");
        boolean z = abstractC5160M6208 instanceof C5169;
        String str = this.f13164;
        if (!z) {
            throw new TransportException(str.concat(" not a named pipe."));
        }
        C5169 c5169 = (C5169) abstractC5160M6208;
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                ᐧʻ r7 = new ᐧʻ(new C3721(c2227, c5169, str));
                EnumC5185 enumC5185 = this.f13163;
                EnumC5185 enumC51852 = this.f13162;
                C2015 c2015 = new C2015(enumC51852, enumC5185);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ˑʽ r3 = new ˑʽ(byteArrayOutputStream);
                c2015.f20006 = ((AtomicInteger) r7.ˎˑ).getAndIncrement();
                c2015.f20000 = EnumSet.of(EnumC5186.f19990, EnumC5186.f19992);
                c2015.mo5657(r3);
                byte[] bArr = new byte[r7.ˆʿ];
                C5349 c5349 = new C5349(new ByteArrayInputStream(bArr, 0, r7.ᐧⁱ(byteArrayOutputStream.toByteArray(), bArr)));
                C2012 c2012 = new C2012();
                c2012.mo5656(c5349);
                if (!EnumC5189.f20013.equals(c2012.f20005)) {
                    throw new IOException(ᵎˏ.ˎٴ(AbstractC0002.m50("BIND ", enumC51852.f19989, " ("), enumC51852.f19985, ") failed."));
                }
                r7.ˆʿ = c2012.f7654;
                return r7;
            } catch (SMB2Exception e) {
                linkedList.offer(e);
                if (e.f3887.ordinal() != 29) {
                    throw ((SMB2Exception) linkedList.poll());
                }
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException();
                    interruptedIOException.addSuppressed(e2);
                    throw interruptedIOException;
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((SMB2Exception) linkedList.poll());
        }
        throw new SMBException("Unknown error when opening pipe: " + c5169.f19718.m10573());
    }
}
