package p266;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Trace;
import androidx.leanback.widget.ˉⁱ;
import com.google.android.gms.internal.measurement.C0298;
import com.google.android.gms.internal.measurement.C0324;
import com.google.android.gms.internal.measurement.C0348;
import com.google.android.gms.internal.measurement.C0354;
import com.google.android.gms.internal.measurement.C0368;
import com.google.android.gms.internal.measurement.C0392;
import com.google.android.gms.internal.measurement.C0407;
import com.google.android.gms.internal.measurement.C0441;
import com.google.android.gms.internal.measurement.C0456;
import com.google.android.gms.internal.measurement.C0476;
import com.google.android.gms.internal.measurement.C0479;
import com.google.android.gms.internal.measurement.C0503;
import com.google.android.gms.internal.measurement.C0541;
import com.google.android.gms.internal.measurement.C0556;
import com.google.android.gms.internal.measurement.C0565;
import com.google.android.gms.internal.measurement.C0568;
import com.google.firebase.components.ComponentRegistrar;
import com.hierynomus.mssmb.SMB1NotSupportedException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import net.engio.mbassy.bus.error.MessageBusException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONObject;
import p031.C1194;
import p031.C1195;
import p076.InterfaceC1668;
import p078.C1694;
import p114.InterfaceC1819;
import p129.C2053;
import p129.EnumC2046;
import p144.C2230;
import p158.AbstractC2339;
import p160.C2345;
import p160.C2346;
import p160.C2348;
import p160.C2349;
import p160.C2350;
import p160.InterfaceC2343;
import p160.InterfaceC2347;
import p166.C2431;
import p251.C3130;
import p251.InterfaceC3134;
import p261.C3250;
import p314.InterfaceC3594;
import p324.C3704;
import p324.C3714;
import p324.C3716;
import p324.InterfaceC3707;
import p331.C3758;
import p331.C3762;
import p362.C4116;
import p362.C4123;
import p362.InterfaceC4118;
import p362.InterfaceC4129;
import p368.InterfaceC4180;
import p383.AbstractC4470;
import p397.InterfaceC4602;
import p397.InterfaceC4603;
import p415.C4742;
import p415.InterfaceC4740;
import p446.InterfaceC5161;
import p456.InterfaceC5305;
import p456.InterfaceC5313;
import ʿﾞ.ﹳﹳ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ـˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3264 implements InterfaceC1819, InterfaceC3707, InterfaceC4118, InterfaceC4180, InterfaceC4603, InterfaceC4740, InterfaceC3134, InterfaceC5161, InterfaceC5305, InterfaceC5313 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12728;

    public /* synthetic */ C3264(int i) {
        this.f12728 = i;
    }

    public C3264(Context context) {
        this.f12728 = 14;
        context.getApplicationContext();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C3261 m8045(C3758 c3758, C2053 c2053) throws MessageBusException {
        String str;
        try {
            C3262 c3262 = new C3262(c3758, c2053, (Collection) c3758.m8727("bus.handlers.error"));
            InterfaceC2347 c2348 = new C2348(c3262, m8047(c3262));
            if (c2053.f7778) {
                c2348 = new C2345(c2348);
            }
            if (c2053.f7770.length > 0 || ((str = c2053.f7775) != null && str.trim().length() > 0)) {
                c2348 = new C2349(c2348);
            }
            c2053.f7772.getClass();
            return new C3261(c3262, c2348, new C2230(new WeakHashMap()));
        } catch (Exception e) {
            throw new MessageBusException(e);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final String m8046(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f3912;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != 10) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i11][i12];
                    byte[] bArr4 = AbstractC2339.f9301;
                    int i14 = b & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b2 = bArr[i8 + i13];
                byte[] bArr5 = AbstractC2339.f9301;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z2 = z;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z2 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            return new String(bArr, i8, i10, StandardCharsets.UTF_8);
                        }
                    }
                    length = i7;
                }
                i6 = i2 + 1;
            } else {
                length = i7;
            }
            i5 = -1;
        }
        return null;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static InterfaceC2343 m8047(C3262 c3262) throws MessageBusException {
        C2053 c2053 = (C2053) c3262.f12726;
        Class cls = c2053.f7771;
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            throw new MessageBusException("The handler invocation must be top level class or nested STATIC inner class");
        }
        try {
            InterfaceC2343 interfaceC2343 = (InterfaceC2343) cls.getConstructor(C3262.class).newInstance(c3262);
            if (c2053.f7773) {
                C2350 c2350 = new C2350((C3262) ((ﹳﹳ) interfaceC2343).ᐧⁱ);
                c2350.f9316 = interfaceC2343;
                interfaceC2343 = c2350;
            }
            return c2053.f7777.equals(EnumC2046.f7762) ? new C2346(interfaceC2343) : interfaceC2343;
        } catch (NoSuchMethodException e) {
            throw new MessageBusException("The provided handler invocation did not specify the necessary constructor " + cls.getSimpleName() + "(SubscriptionContext);", e);
        } catch (Exception e2) {
            throw new MessageBusException("Could not instantiate the provided handler invocation ".concat(cls.getSimpleName()), e2);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static MediaCodec m8048(C4123 c4123) throws IOException {
        C4116 c4116 = c4123.f15926;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = c4116.f15902;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C4742 m8049(ᐧⁱ r10) {
        return new C4742(System.currentTimeMillis() + 3600000, new ˉⁱ(8), new C3250(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // p368.InterfaceC4180
    public void clear() {
    }

    @Override // p368.InterfaceC4180
    /* renamed from: ʽᐧ */
    public File mo7037(InterfaceC3594 interfaceC3594) {
        return null;
    }

    @Override // p368.InterfaceC4180
    /* renamed from: ʿʼ */
    public void mo7038(InterfaceC3594 interfaceC3594, C3762 c3762) {
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public List m8050(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1194 c1194 : componentRegistrar.getComponents()) {
            String str = c1194.f4929;
            if (str != null) {
                C1195 c1195 = new C1195(str, 13, c1194);
                c1194 = new C1194(str, c1194.f4926, c1194.f4928, c1194.f4932, c1194.f4927, c1195, c1194.f4931);
            }
            arrayList.add(c1194);
        }
        return arrayList;
    }

    @Override // p362.InterfaceC4118
    /* renamed from: ˉי */
    public InterfaceC4129 mo4055(C4123 c4123) {
        MediaCodec mediaCodecM8048 = null;
        try {
            mediaCodecM8048 = m8048(c4123);
            Trace.beginSection("configureCodec");
            mediaCodecM8048.configure(c4123.f15923, c4123.f15927, c4123.f15924, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM8048.start();
            Trace.endSection();
            C3262 c3262 = new C3262();
            c3262.f12726 = mediaCodecM8048;
            if (AbstractC4470.f17202 < 21) {
                c3262.f12724 = mediaCodecM8048.getInputBuffers();
                c3262.f12725 = mediaCodecM8048.getOutputBuffers();
            }
            return c3262;
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM8048 != null) {
                mediaCodecM8048.release();
            }
            throw e;
        }
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int mo8051(C2431 c2431) {
        return 1;
    }

    @Override // p324.InterfaceC3707
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public InterfaceC1668 mo8052() {
        return new C3714(C3704.f14290, null);
    }

    @Override // p251.InterfaceC3134
    /* renamed from: ˏʾ */
    public /* bridge */ /* synthetic */ Object mo7700(C3130 c3130) {
        return null;
    }

    @Override // p114.InterfaceC1819
    /* renamed from: ˏᵢ */
    public C1694 mo5560(byte[] bArr) throws SMB1NotSupportedException {
        throw new SMB1NotSupportedException();
    }

    @Override // p456.InterfaceC5305
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String mo8053(String str, String str2) {
        return null;
    }

    @Override // p456.InterfaceC5313
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object mo8054() {
        switch (this.f12728) {
            case 18:
                C0407.f2694.get();
                Boolean bool = (Boolean) C0568.f2921.m2133();
                bool.getClass();
                return bool;
            case 19:
                C0392.f2662.get();
                Boolean bool2 = (Boolean) C0324.f2442.m2133();
                bool2.getClass();
                return bool2;
            case 20:
                C0541.f2879.get();
                Boolean bool3 = (Boolean) C0348.f2476.m2133();
                bool3.getClass();
                return bool3;
            case 21:
                C0298.f2421.get();
                Boolean bool4 = (Boolean) C0479.f2814.m2133();
                bool4.getClass();
                return bool4;
            case 22:
                C0556.f2907.get();
                Boolean bool5 = (Boolean) C0565.f2917.m2133();
                bool5.getClass();
                return bool5;
            case 23:
                C0476.f2810.get();
                Boolean bool6 = (Boolean) C0368.f2624.m2133();
                bool6.getClass();
                return bool6;
            case 24:
                C0503.f2848.get();
                Boolean bool7 = (Boolean) C0456.f2770.m2133();
                bool7.getClass();
                return bool7;
            case 25:
                C0441.f2748.get();
                return Integer.valueOf((int) ((Long) C0354.f2500.m2133()).longValue());
            case 26:
                C0441.f2748.get();
                return (String) C0354.f2491.m2133();
            case 27:
                C0441.f2748.get();
                Long l = (Long) C0354.f2507.m2133();
                l.getClass();
                return l;
            case 28:
                C0441.f2748.get();
                Long l2 = (Long) C0354.f2494.m2133();
                l2.getClass();
                return l2;
            default:
                C0441.f2748.get();
                Long l3 = (Long) C0354.f2482.m2133();
                l3.getClass();
                return l3;
        }
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean mo8055(C2431 c2431) {
        return false;
    }

    @Override // p446.InterfaceC5161
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean mo8056(long j) {
        switch (this.f12728) {
            case 15:
                if (j == 3221225558L) {
                }
                break;
            default:
                if (j == 0) {
                }
                break;
        }
        return false;
    }

    @Override // p415.InterfaceC4740
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C4742 mo8057(ᐧⁱ r1, JSONObject jSONObject) {
        return m8049(r1);
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public InterfaceC4602 mo8058(C2431 c2431) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p324.InterfaceC3707
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public InterfaceC1668 mo8059(C3704 c3704, C3716 c3716) {
        return new C3714(c3704, c3716);
    }

    @Override // p114.InterfaceC1819
    /* renamed from: ﹶˆ */
    public boolean mo5561(byte[] bArr) {
        return bArr[0] == -1 && bArr[1] == 83 && bArr[2] == 77 && bArr[3] == 66;
    }
}
