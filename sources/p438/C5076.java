package p438;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p033.C1215;
import p033.C1220;
import p036.AbstractC1261;
import p036.C1255;
import p036.C1258;
import p036.InterfaceC1239;
import p041.C1273;
import p061.C1440;
import p076.C1660;
import p076.InterfaceC1670;
import p093.C1756;
import p166.AbstractC2394;
import p166.C2401;
import p166.C2402;
import p166.C2412;
import p166.C2434;
import p166.C2436;
import p166.C2441;
import p166.C2444;
import p166.InterfaceC2425;
import p334.C3789;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p345.C3961;
import p361.C4092;
import p362.C4125;
import p374.C4241;
import p374.C4245;
import p374.C4253;
import p374.C4290;
import p374.InterfaceC4254;
import p374.InterfaceC4280;
import p374.InterfaceC4294;
import p374.InterfaceC4295;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import p383.C4463;
import p383.C4469;
import p406.RunnableC4645;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶﾞ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5076 implements Handler.Callback, InterfaceC4295, InterfaceC5071 {

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public static final long f19248 = AbstractC4470.m10171(10000);

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean f19249;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C5097 f19250;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f19252;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C2412 f19253;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public C5080 f19254;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C1440 f19255;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Set f19256;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1258 f19257;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f19258;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f19259;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C1215 f19260;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C4469 f19262;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public C5085 f19263;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f19264;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC5115[] f19265;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C4460 f19266;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public C5102 f19267;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public long f19268;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C1273 f19269;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final long f19270;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f19271;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final HandlerThread f19272;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f19273;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f19274;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f19275;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public ExoPlaybackException f19276;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC1261 f19277;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC5115[] f19278;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Looper f19279;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public C5110 f19280;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public int f19281;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f19282;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C5100 f19283;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C4092 f19284;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C5093 f19285;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C5117 f19286;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ArrayList f19287;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public long f19289;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final InterfaceC1670 f19290;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final long f19291;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C2434 f19292;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int f19293;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public boolean f19288 = false;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public long f19261 = -9223372036854775807L;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public long f19251 = -9223372036854775807L;

    public C5076(AbstractC5115[] abstractC5115Arr, AbstractC1261 abstractC1261, C1258 c1258, C5117 c5117, InterfaceC1670 interfaceC1670, int i, boolean z, C1220 c1220, C5085 c5085, C5100 c5100, long j, Looper looper, C4460 c4460, C5093 c5093, C1215 c1215, C5080 c5080) {
        this.f19285 = c5093;
        this.f19278 = abstractC5115Arr;
        this.f19277 = abstractC1261;
        this.f19257 = c1258;
        this.f19286 = c5117;
        this.f19290 = interfaceC1670;
        this.f19252 = i;
        this.f19274 = z;
        this.f19263 = c5085;
        this.f19283 = c5100;
        this.f19291 = j;
        this.f19266 = c4460;
        this.f19260 = c1215;
        this.f19254 = c5080;
        this.f19270 = c5117.f19513;
        C2436 c2436 = AbstractC2394.f9448;
        C5110 c5110M11323 = C5110.m11323(c1258);
        this.f19280 = c5110M11323;
        this.f19255 = new C1440(c5110M11323);
        this.f19265 = new AbstractC5115[abstractC5115Arr.length];
        C1255 c1255 = (C1255) abstractC1261;
        c1255.getClass();
        for (int i2 = 0; i2 < abstractC5115Arr.length; i2++) {
            AbstractC5115 abstractC5115 = abstractC5115Arr[i2];
            abstractC5115.f19477 = i2;
            abstractC5115.f19488 = c1215;
            abstractC5115.f19490 = c4460;
            this.f19265[i2] = abstractC5115;
            AbstractC5115 abstractC51152 = this.f19265[i2];
            synchronized (abstractC51152.f19485) {
                abstractC51152.f19487 = c1255;
            }
        }
        this.f19269 = new C1273(this, c4460);
        this.f19287 = new ArrayList();
        this.f19256 = Collections.newSetFromMap(new IdentityHashMap());
        this.f19292 = new C2434();
        this.f19253 = new C2412();
        abstractC1261.f5174 = this;
        abstractC1261.f5172 = interfaceC1670;
        this.f19249 = true;
        C4469 c4469M10120 = c4460.m10120(looper, null);
        this.f19250 = new C5097(c1220, c4469M10120, new C4125(20, this), c5080);
        this.f19284 = new C4092(this, c1220, c4469M10120, c1215);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f19272 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f19279 = looper2;
        this.f19262 = c4460.m10120(looper2, this);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static boolean m11226(AbstractC5115 abstractC5115) {
        return abstractC5115.f19478 != 0;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m11227(AbstractC5115 abstractC5115, long j) {
        abstractC5115.f19481 = true;
        if (abstractC5115 instanceof C1756) {
            C1756 c1756 = (C1756) abstractC5115;
            AbstractC4464.m10132(c1756.f19481);
            c1756.f6806 = j;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static Pair m11228(AbstractC2394 abstractC2394, C5102 c5102, boolean z, int i, boolean z2, C2434 c2434, C2412 c2412) {
        Pair pairM6482;
        int iM11229;
        AbstractC2394 abstractC23942 = c5102.f19429;
        if (abstractC2394.m6477()) {
            return null;
        }
        AbstractC2394 abstractC23943 = abstractC23942.m6477() ? abstractC2394 : abstractC23942;
        try {
            pairM6482 = abstractC23943.m6482(c2434, c2412, c5102.f19427, c5102.f19428);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC2394.equals(abstractC23943)) {
            return pairM6482;
        }
        if (abstractC2394.mo6469(pairM6482.first) != -1) {
            return (abstractC23943.mo6479(pairM6482.first, c2412).f9578 && abstractC23943.mo6179(c2412.f9576, c2434, 0L).f9716 == abstractC23943.mo6469(pairM6482.first)) ? abstractC2394.m6482(c2434, c2412, abstractC2394.mo6479(pairM6482.first, c2412).f9576, c5102.f19428) : pairM6482;
        }
        if (z && (iM11229 = m11229(c2434, c2412, i, z2, pairM6482.first, abstractC23943, abstractC2394)) != -1) {
            return abstractC2394.m6482(c2434, c2412, iM11229, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m11229(C2434 c2434, C2412 c2412, int i, boolean z, Object obj, AbstractC2394 abstractC2394, AbstractC2394 abstractC23942) {
        Object obj2 = abstractC2394.mo6179(abstractC2394.mo6479(obj, c2412).f9576, c2434, 0L).f9713;
        for (int i2 = 0; i2 < abstractC23942.mo6474(); i2++) {
            if (abstractC23942.mo6179(i2, c2434, 0L).f9713.equals(obj2)) {
                return i2;
            }
        }
        int iMo6469 = abstractC2394.mo6469(obj);
        int iMo6475 = abstractC2394.mo6475();
        int iM6481 = iMo6469;
        int iMo64692 = -1;
        for (int i3 = 0; i3 < iMo6475 && iMo64692 == -1; i3++) {
            iM6481 = abstractC2394.m6481(iM6481, c2412, c2434, i, z);
            if (iM6481 == -1) {
                break;
            }
            iMo64692 = abstractC23942.mo6469(abstractC2394.mo6472(iM6481));
        }
        if (iMo64692 == -1) {
            return -1;
        }
        return abstractC23942.mo6180(iMo64692, c2412, false).f9576;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        C5097 c5097;
        boolean z;
        C5116 c5116;
        int i;
        C5116 c51162;
        try {
            switch (message.what) {
                case 1:
                    boolean z2 = message.arg1 != 0;
                    int i2 = message.arg2;
                    m11230(i2 >> 4, i2 & 15, z2, true);
                    break;
                case 2:
                    m11256();
                    break;
                case 3:
                    m11269((C5102) message.obj);
                    break;
                case 4:
                    m11275((C2441) message.obj);
                    break;
                case 5:
                    this.f19263 = (C5085) message.obj;
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    m11250(false, true);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    m11258();
                    return true;
                case 8:
                    m11244((InterfaceC4294) message.obj);
                    break;
                case 9:
                    m11266((InterfaceC4294) message.obj);
                    break;
                case 10:
                    m11268();
                    break;
                case 11:
                    m11285(message.arg1);
                    break;
                case 12:
                    m11245(message.arg1 != 0);
                    break;
                case 13:
                    m11277(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C5108 c5108 = (C5108) message.obj;
                    c5108.getClass();
                    m11234(c5108);
                    break;
                case 15:
                    m11257((C5108) message.obj);
                    break;
                case 16:
                    C2441 c2441 = (C2441) message.obj;
                    m11248(c2441, c2441.f9730, true, false);
                    break;
                case 17:
                    m11253((C5114) message.obj);
                    break;
                case 18:
                    m11262((C5114) message.obj, message.arg1);
                    break;
                case 19:
                    ᐧʻ.ᵎˏ(message.obj);
                    m11247();
                    throw null;
                case 20:
                    m11240(message.arg1, message.arg2, (C4245) message.obj);
                    break;
                case 21:
                    m11249((C4245) message.obj);
                    break;
                case 22:
                    m11237();
                    break;
                case 23:
                    m11276(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m11268();
                    m11260(true);
                    break;
                case 26:
                    m11268();
                    m11260(true);
                    break;
                case 27:
                    m11232(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m11274((C5080) message.obj);
                    break;
                case 29:
                    m11284();
                    break;
            }
        } catch (ParserException e) {
            boolean z3 = e.f1334;
            int i3 = e.f1333;
            if (i3 == 1) {
                i = z3 ? 3001 : 3003;
            } else if (i3 == 4) {
                i = z3 ? 3002 : 3004;
            }
            m11255(i, e);
        } catch (DataSourceException e2) {
            m11255(e2.f1339, e2);
        } catch (ExoPlaybackException e3) {
            ExoPlaybackException exoPlaybackException = e3;
            int i4 = exoPlaybackException.f1404;
            C5097 c50972 = this.f19250;
            if (i4 != 1 || (c51162 = c50972.f19386) == null) {
                c5097 = c50972;
            } else {
                c5097 = c50972;
                exoPlaybackException = new ExoPlaybackException(exoPlaybackException.getMessage(), exoPlaybackException.getCause(), exoPlaybackException.f1336, exoPlaybackException.f1404, exoPlaybackException.f1406, exoPlaybackException.f1402, exoPlaybackException.f1407, exoPlaybackException.f1408, c51162.f19502.f19313, exoPlaybackException.f1335, exoPlaybackException.f1405);
            }
            if (exoPlaybackException.f1405 && (this.f19276 == null || (i = exoPlaybackException.f1336) == 5004 || i == 5003)) {
                AbstractC4464.m10127("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException);
                ExoPlaybackException exoPlaybackException2 = this.f19276;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.f19276;
                } else {
                    this.f19276 = exoPlaybackException;
                }
                C4469 c4469 = this.f19262;
                C4463 c4463M10159 = c4469.m10159(25, exoPlaybackException);
                c4469.getClass();
                Message message2 = c4463M10159.f17178;
                message2.getClass();
                c4469.f17191.sendMessageAtFrontOfQueue(message2);
                c4463M10159.m10122();
            } else {
                ExoPlaybackException exoPlaybackException3 = this.f19276;
                if (exoPlaybackException3 != null) {
                    exoPlaybackException3.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.f19276;
                }
                ExoPlaybackException exoPlaybackException4 = exoPlaybackException;
                AbstractC4464.m10147("ExoPlayerImplInternal", "Playback error", exoPlaybackException4);
                if (exoPlaybackException4.f1404 == 1) {
                    C5097 c50973 = c5097;
                    if (c50973.f19398 != c50973.f19386) {
                        while (true) {
                            c5116 = c50973.f19398;
                            if (c5116 == c50973.f19386) {
                                break;
                            }
                            c50973.m11307();
                        }
                        c5116.getClass();
                        m11279();
                        C5082 c5082 = c5116.f19502;
                        C4290 c4290 = c5082.f19313;
                        long j = c5082.f19309;
                        this.f19280 = m11270(c4290, j, c5082.f19312, j, true, 0);
                    }
                }
                z = true;
                m11250(true, false);
                this.f19280 = this.f19280.m11325(exoPlaybackException4);
            }
        } catch (DrmSession$DrmSessionException e4) {
            m11255(e4.f1423, e4);
        } catch (BehindLiveWindowException e5) {
            m11255(1002, e5);
        } catch (IOException e6) {
            m11255(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException5 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC4464.m10147("ExoPlayerImplInternal", "Playback error", exoPlaybackException5);
            m11250(true, false);
            this.f19280 = this.f19280.m11325(exoPlaybackException5);
        }
        z = true;
        m11279();
        return z;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m11230(int i, int i2, boolean z, boolean z2) {
        this.f19255.m4994(z2 ? 1 : 0);
        this.f19280 = this.f19280.m11333(i2, z, i);
        m11261(false, false);
        for (C5116 c5116 = this.f19250.f19398; c5116 != null; c5116 = c5116.f19495) {
            for (InterfaceC1239 interfaceC1239 : c5116.f19504.f5166) {
                if (interfaceC1239 != null) {
                    interfaceC1239.mo4431(z);
                }
            }
        }
        if (!m11236()) {
            m11259();
            m11264();
            return;
        }
        int i3 = this.f19280.f19449;
        C4469 c4469 = this.f19262;
        if (i3 != 3) {
            if (i3 == 2) {
                c4469.m10157(2);
            }
        } else {
            C1273 c1273 = this.f19269;
            c1273.f5214 = true;
            ((C5105) c1273.f5216).m11316();
            m11278();
            c4469.m10157(2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void m11231() {
        C5116 c5116 = this.f19250.f19389;
        boolean z = this.f19258 || (c5116 != null && c5116.f19501.mo6160());
        C5110 c5110 = this.f19280;
        if (z != c5110.f19461) {
            this.f19280 = new C5110(c5110.f19459, c5110.f19448, c5110.f19457, c5110.f19466, c5110.f19449, c5110.f19460, z, c5110.f19456, c5110.f19467, c5110.f19450, c5110.f19454, c5110.f19451, c5110.f19452, c5110.f19462, c5110.f19455, c5110.f19464, c5110.f19453, c5110.f19463, c5110.f19465, c5110.f19458);
        }
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m11232(int i, int i2, List list) throws Throwable {
        this.f19255.m4994(1);
        C4092 c4092 = this.f19284;
        c4092.getClass();
        ArrayList arrayList = (ArrayList) c4092.f15792;
        AbstractC4464.m10142(i >= 0 && i <= i2 && i2 <= arrayList.size());
        AbstractC4464.m10142(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C5088) arrayList.get(i3)).f19337.mo6115((C2402) list.get(i3 - i));
        }
        m11242(c4092.m9388(), false);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11233(AbstractC5115 abstractC5115) {
        if (m11226(abstractC5115)) {
            C1273 c1273 = this.f19269;
            if (abstractC5115 == ((AbstractC5115) c1273.f5215)) {
                c1273.f5219 = null;
                c1273.f5215 = null;
                c1273.f5218 = true;
            }
            int i = abstractC5115.f19478;
            if (i == 2) {
                AbstractC4464.m10132(i == 2);
                abstractC5115.f19478 = 1;
                abstractC5115.mo1134();
            }
            AbstractC4464.m10132(abstractC5115.f19478 == 1);
            abstractC5115.f19479.m12099();
            abstractC5115.f19478 = 0;
            abstractC5115.f19483 = null;
            abstractC5115.f19486 = null;
            abstractC5115.f19481 = false;
            abstractC5115.mo1131();
            this.f19281--;
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m11234(C5108 c5108) {
        Looper looper = c5108.f19443;
        Looper looper2 = this.f19279;
        C4469 c4469 = this.f19262;
        if (looper != looper2) {
            c4469.m10159(15, c5108).m10121();
            return;
        }
        synchronized (c5108) {
        }
        try {
            c5108.f19442.mo1125(c5108.f19445, c5108.f19439);
            c5108.m11320(true);
            int i = this.f19280.f19449;
            if (i == 3 || i == 2) {
                c4469.m10157(2);
            }
        } catch (Throwable th) {
            c5108.m11320(true);
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long m11235(AbstractC2394 abstractC2394, Object obj, long j) {
        C2412 c2412 = this.f19253;
        int i = abstractC2394.mo6479(obj, c2412).f9576;
        C2434 c2434 = this.f19292;
        abstractC2394.m6480(i, c2434);
        if (c2434.f9714 != -9223372036854775807L && c2434.m6547() && c2434.f9718) {
            return AbstractC4470.m10206(AbstractC4470.m10170(c2434.f9715) - c2434.f9714) - (j + c2412.f9575);
        }
        return -9223372036854775807L;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final boolean m11236() {
        C5110 c5110 = this.f19280;
        return c5110.f19451 && c5110.f19462 == 0;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m11237() throws Throwable {
        m11242(this.f19284.m9388(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[PHI: r5 r6 r8
  0x00c3: PHI (r5v4 ᵢˎ.ﹳˑ) = (r5v3 ᵢˎ.ﹳˑ), (r5v12 ᵢˎ.ﹳˑ) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r6v2 long) = (r6v1 long), (r6v23 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11238(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5076.m11238(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m11239(AbstractC2394 abstractC2394, AbstractC2394 abstractC23942) {
        if (abstractC2394.m6477() && abstractC23942.m6477()) {
            return;
        }
        ArrayList arrayList = this.f19287;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ᐧʻ.ᵎˏ(arrayList.get(size));
            throw null;
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m11240(int i, int i2, C4245 c4245) throws Throwable {
        this.f19255.m4994(1);
        C4092 c4092 = this.f19284;
        c4092.getClass();
        AbstractC4464.m10142(i >= 0 && i <= i2 && i2 <= ((ArrayList) c4092.f15792).size());
        c4092.f15790 = c4245;
        c4092.m9393(i, i2);
        m11242(c4092.m9388(), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m11241(C1258 c1258) {
        AbstractC2394 abstractC2394 = this.f19280.f19459;
        InterfaceC1239[] interfaceC1239Arr = c1258.f5166;
        C5117 c5117 = this.f19286;
        C5091 c5091 = (C5091) c5117.f19509.get(this.f19260);
        c5091.getClass();
        int iMax = c5117.f19512;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                AbstractC5115[] abstractC5115Arr = this.f19278;
                int i3 = 13107200;
                if (i < abstractC5115Arr.length) {
                    if (interfaceC1239Arr[i] != null) {
                        switch (abstractC5115Arr[i].f19476) {
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        c5091.f19364 = iMax;
        c5117.m11353();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d9 A[Catch: all -> 0x02df, TryCatch #7 {all -> 0x02df, blocks: (B:164:0x02d3, B:166:0x02d9, B:180:0x02fe, B:182:0x030b, B:184:0x0311, B:186:0x031b, B:187:0x0328, B:188:0x032b, B:192:0x0336), top: B:262:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x043e  */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [ﹶﾞ.ᐧⁱ] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [ﹶﾞ.ˆʿ] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11242(p166.AbstractC2394 r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5076.m11242(ˊﹶ.ʻʿ, boolean):void");
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final boolean m11243(AbstractC2394 abstractC2394, C4290 c4290) {
        if (c4290.m9753() || abstractC2394.m6477()) {
            return false;
        }
        int i = abstractC2394.mo6479(c4290.f16693, this.f19253).f9576;
        C2434 c2434 = this.f19292;
        abstractC2394.m6480(i, c2434);
        return c2434.m6547() && c2434.f9718 && c2434.f9714 != -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m11244(InterfaceC4294 interfaceC4294) throws ExoPlaybackException {
        C5097 c5097 = this.f19250;
        C5116 c5116 = c5097.f19389;
        if (c5116 == null || c5116.f19501 != interfaceC4294) {
            return;
        }
        float f = this.f19269.mo1114().f9730;
        AbstractC2394 abstractC2394 = this.f19280.f19459;
        c5116.f19505 = true;
        c5116.f19496 = c5116.f19501.mo6169();
        C1258 c1258M11343 = c5116.m11343(f, abstractC2394);
        C5082 c5082 = c5116.f19502;
        long jMax = c5082.f19309;
        long j = c5082.f19310;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM11345 = c5116.m11345(c1258M11343, jMax, false, new boolean[c5116.f19506.length]);
        long j2 = c5116.f19498;
        C5082 c50822 = c5116.f19502;
        c5116.f19498 = (c50822.f19309 - jM11345) + j2;
        c5116.f19502 = c50822.m11287(jM11345);
        m11241(c5116.f19504);
        if (c5116 == c5097.f19398) {
            m11267(c5116.f19502.f19309);
            m11281(new boolean[this.f19278.length], c5097.f19386.m11342());
            C5110 c5110 = this.f19280;
            C4290 c4290 = c5110.f19448;
            long j3 = c5116.f19502.f19309;
            this.f19280 = m11270(c4290, j3, c5110.f19457, j3, false, 5);
        }
        m11272();
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final void m11245(boolean z) throws ExoPlaybackException {
        this.f19274 = z;
        AbstractC2394 abstractC2394 = this.f19280.f19459;
        C5097 c5097 = this.f19250;
        c5097.f19391 = z;
        if (!c5097.m11303(abstractC2394)) {
            m11260(true);
        }
        m11282(false);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m11246(long j) {
        this.f19262.f17191.sendEmptyMessageAtTime(2, j + ((this.f19280.f19449 != 3 || m11236()) ? f19248 : 1000L));
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m11247() {
        this.f19255.m4994(1);
        throw null;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11248(C2441 c2441, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f19255.m4994(1);
            }
            this.f19280 = this.f19280.m11331(c2441);
        }
        float f2 = c2441.f9730;
        C5116 c5116 = this.f19250.f19398;
        while (true) {
            i = 0;
            if (c5116 == null) {
                break;
            }
            InterfaceC1239[] interfaceC1239Arr = c5116.f19504.f5166;
            int length = interfaceC1239Arr.length;
            while (i < length) {
                InterfaceC1239 interfaceC1239 = interfaceC1239Arr[i];
                if (interfaceC1239 != null) {
                    interfaceC1239.mo4436(f2);
                }
                i++;
            }
            c5116 = c5116.f19495;
        }
        AbstractC5115[] abstractC5115Arr = this.f19278;
        int length2 = abstractC5115Arr.length;
        while (i < length2) {
            AbstractC5115 abstractC5115 = abstractC5115Arr[i];
            if (abstractC5115 != null) {
                abstractC5115.mo3877(f, c2441.f9730);
            }
            i++;
        }
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void m11249(C4245 c4245) throws Throwable {
        this.f19255.m4994(1);
        C4092 c4092 = this.f19284;
        int size = ((ArrayList) c4092.f15792).size();
        if (c4245.f16492.length != size) {
            c4245 = new C4245(new Random(c4245.f16494.nextLong())).m9708(size);
        }
        c4092.f15790 = c4245;
        m11242(c4092.m9388(), false);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final void m11250(boolean z, boolean z2) {
        m11238(z || !this.f19275, false, true, false);
        this.f19255.m4994(z2 ? 1 : 0);
        C5117 c5117 = this.f19286;
        if (c5117.f19509.remove(this.f19260) != null) {
            c5117.m11353();
        }
        m11271(1);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m11251() {
        C5116 c5116 = this.f19250.f19398;
        this.f19264 = c5116 != null && c5116.f19502.f19311 && this.f19288;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean m11252() {
        C5116 c5116 = this.f19250.f19398;
        long j = c5116.f19502.f19310;
        return c5116.f19505 && (j == -9223372036854775807L || this.f19280.f19463 < j || !m11236());
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void m11253(C5114 c5114) throws Throwable {
        this.f19255.m4994(1);
        int i = c5114.f19472;
        ArrayList arrayList = c5114.f19473;
        C4245 c4245 = c5114.f19471;
        if (i != -1) {
            this.f19267 = new C5102(new C5120(arrayList, c4245), c5114.f19472, c5114.f19474);
        }
        C4092 c4092 = this.f19284;
        ArrayList arrayList2 = (ArrayList) c4092.f15792;
        c4092.m9393(0, arrayList2.size());
        m11242(c4092.m9389(arrayList2.size(), arrayList, c4245), false);
    }

    @Override // p374.InterfaceC4295
    /* renamed from: ˏʾ */
    public final void mo9719(InterfaceC4294 interfaceC4294) {
        this.f19262.m10159(8, interfaceC4294).m10121();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m11254() {
        C5116 c5116 = this.f19250.f19389;
        if (c5116 == null) {
            return false;
        }
        return (!c5116.f19505 ? 0L : c5116.f19501.mo6173()) != Long.MIN_VALUE;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m11255(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        C5116 c5116 = this.f19250.f19398;
        if (c5116 != null) {
            C5082 c5082 = c5116.f19502;
            exoPlaybackException = new ExoPlaybackException(exoPlaybackException.getMessage(), exoPlaybackException.getCause(), exoPlaybackException.f1336, exoPlaybackException.f1404, exoPlaybackException.f1406, exoPlaybackException.f1402, exoPlaybackException.f1407, exoPlaybackException.f1408, c5082.f19313, exoPlaybackException.f1335, exoPlaybackException.f1405);
        }
        AbstractC4464.m10147("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m11250(false, false);
        this.f19280 = this.f19280.m11325(exoPlaybackException);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x035d A[EDGE_INSN: B:461:0x035d->B:200:0x035d BREAK  A[LOOP:0: B:166:0x02e1->B:199:0x035a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11256() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5076.m11256():void");
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void m11257(C5108 c5108) {
        Looper looper = c5108.f19443;
        if (looper.getThread().isAlive()) {
            this.f19266.m10120(looper, null).m10158(new RunnableC4645(this, 3, c5108));
        } else {
            AbstractC4464.m10144("TAG", "Trying to send message on a dead thread.");
            c5108.m11320(false);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m11258() {
        try {
            m11238(true, false, true, false);
            m11280();
            C5117 c5117 = this.f19286;
            if (c5117.f19509.remove(this.f19260) != null) {
                c5117.m11353();
            }
            if (c5117.f19509.isEmpty()) {
                c5117.f19515 = -1L;
            }
            m11271(1);
            HandlerThread handlerThread = this.f19272;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f19259 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f19272;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f19259 = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m11259() {
        int i;
        C1273 c1273 = this.f19269;
        c1273.f5214 = false;
        C5105 c5105 = (C5105) c1273.f5216;
        if (c5105.f19431) {
            c5105.m11315(c5105.mo1135());
            c5105.f19431 = false;
        }
        for (AbstractC5115 abstractC5115 : this.f19278) {
            if (m11226(abstractC5115) && (i = abstractC5115.f19478) == 2) {
                AbstractC4464.m10132(i == 2);
                abstractC5115.f19478 = 1;
                abstractC5115.mo1134();
            }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m11260(boolean z) throws ExoPlaybackException {
        C4290 c4290 = this.f19250.f19398.f19502.f19313;
        long jM11286 = m11286(c4290, this.f19280.f19463, true, false);
        if (jM11286 != this.f19280.f19463) {
            C5110 c5110 = this.f19280;
            this.f19280 = m11270(c4290, jM11286, c5110.f19457, c5110.f19466, z, 5);
        }
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m11261(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.f19271 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f19266.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f19251 = jElapsedRealtime;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11262(C5114 c5114, int i) throws Throwable {
        this.f19255.m4994(1);
        C4092 c4092 = this.f19284;
        if (i == -1) {
            i = ((ArrayList) c4092.f15792).size();
        }
        m11242(c4092.m9389(i, c5114.f19473, c5114.f19471), false);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Pair m11263(AbstractC2394 abstractC2394) {
        long j = 0;
        if (abstractC2394.m6477()) {
            return Pair.create(C5110.f19447, 0L);
        }
        Pair pairM6482 = abstractC2394.m6482(this.f19292, this.f19253, abstractC2394.mo6478(this.f19274), -9223372036854775807L);
        C4290 c4290M11301 = this.f19250.m11301(abstractC2394, pairM6482.first, 0L);
        long jLongValue = ((Long) pairM6482.second).longValue();
        if (c4290M11301.m9753()) {
            Object obj = c4290M11301.f16693;
            C2412 c2412 = this.f19253;
            abstractC2394.mo6479(obj, c2412);
            if (c4290M11301.f16692 == c2412.m6500(c4290M11301.f16690)) {
                c2412.f9579.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c4290M11301, Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11264() {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5076.m11264():void");
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m11265(AbstractC2394 abstractC2394, C4290 c4290, AbstractC2394 abstractC23942, C4290 c42902, long j, boolean z) {
        if (!m11243(abstractC2394, c4290)) {
            C2441 c2441 = c4290.m9753() ? C2441.f9727 : this.f19280.f19455;
            C1273 c1273 = this.f19269;
            if (c1273.mo1114().equals(c2441)) {
                return;
            }
            this.f19262.m10160(16);
            c1273.mo1113(c2441);
            m11248(this.f19280.f19455, c2441.f9730, false, false);
            return;
        }
        Object obj = c4290.f16693;
        C2412 c2412 = this.f19253;
        int i = abstractC2394.mo6479(obj, c2412).f9576;
        C2434 c2434 = this.f19292;
        abstractC2394.m6480(i, c2434);
        C2444 c2444 = c2434.f9705;
        C5100 c5100 = this.f19283;
        c5100.getClass();
        c5100.f19418 = AbstractC4470.m10206(c2444.f9739);
        c5100.f19423 = AbstractC4470.m10206(c2444.f9736);
        c5100.f19409 = AbstractC4470.m10206(c2444.f9738);
        float f = c2444.f9740;
        if (f == -3.4028235E38f) {
            f = c5100.f19417;
        }
        c5100.f19411 = f;
        float f2 = c2444.f9737;
        if (f2 == -3.4028235E38f) {
            f2 = c5100.f19407;
        }
        c5100.f19410 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c5100.f19418 = -9223372036854775807L;
        }
        c5100.m11313();
        if (j != -9223372036854775807L) {
            c5100.f19419 = m11235(abstractC2394, obj, j);
            c5100.m11313();
            return;
        }
        if (!AbstractC4470.m10194(!abstractC23942.m6477() ? abstractC23942.mo6179(abstractC23942.mo6479(c42902.f16693, c2412).f9576, c2434, 0L).f9713 : null, c2434.f9713) || z) {
            c5100.f19419 = -9223372036854775807L;
            c5100.m11313();
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m11266(InterfaceC4294 interfaceC4294) {
        C5116 c5116 = this.f19250.f19389;
        if (c5116 == null || c5116.f19501 != interfaceC4294) {
            return;
        }
        long j = this.f19268;
        if (c5116 != null) {
            AbstractC4464.m10132(c5116.f19495 == null);
            if (c5116.f19505) {
                c5116.f19501.mo6171(j - c5116.f19498);
            }
        }
        m11272();
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m11267(long j) {
        C5116 c5116 = this.f19250.f19398;
        long j2 = j + (c5116 == null ? 1000000000000L : c5116.f19498);
        this.f19268 = j2;
        ((C5105) this.f19269.f5216).m11315(j2);
        for (AbstractC5115 abstractC5115 : this.f19278) {
            if (m11226(abstractC5115)) {
                long j3 = this.f19268;
                abstractC5115.f19481 = false;
                abstractC5115.f19475 = j3;
                abstractC5115.f19482 = j3;
                abstractC5115.mo1126(false, j3);
            }
        }
        for (C5116 c51162 = r0.f19398; c51162 != null; c51162 = c51162.f19495) {
            for (InterfaceC1239 interfaceC1239 : c51162.f19504.f5166) {
                if (interfaceC1239 != null) {
                    interfaceC1239.mo4444();
                }
            }
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m11268() throws ExoPlaybackException {
        float f = this.f19269.mo1114().f9730;
        C5097 c5097 = this.f19250;
        C5116 c5116 = c5097.f19398;
        C5116 c51162 = c5097.f19386;
        C1258 c1258 = null;
        C5116 c51163 = c5116;
        boolean z = true;
        while (c51163 != null && c51163.f19505) {
            C1258 c1258M11343 = c51163.m11343(f, this.f19280.f19459);
            C1258 c12582 = c51163 == this.f19250.f19398 ? c1258M11343 : c1258;
            C1258 c12583 = c51163.f19504;
            if (c12583 != null) {
                int length = c12583.f5166.length;
                InterfaceC1239[] interfaceC1239Arr = c1258M11343.f5166;
                if (length == interfaceC1239Arr.length) {
                    for (int i = 0; i < interfaceC1239Arr.length; i++) {
                        if (c1258M11343.m4488(c12583, i)) {
                        }
                    }
                    if (c51163 == c51162) {
                        z = false;
                    }
                    c51163 = c51163.f19495;
                    c1258 = c12582;
                }
            }
            if (z) {
                C5097 c50972 = this.f19250;
                C5116 c51164 = c50972.f19398;
                boolean zM11302 = c50972.m11302(c51164);
                boolean[] zArr = new boolean[this.f19278.length];
                c12582.getClass();
                long jM11345 = c51164.m11345(c12582, this.f19280.f19463, zM11302, zArr);
                C5110 c5110 = this.f19280;
                boolean z2 = (c5110.f19449 == 4 || jM11345 == c5110.f19463) ? false : true;
                C5110 c51102 = this.f19280;
                this.f19280 = m11270(c51102.f19448, jM11345, c51102.f19457, c51102.f19466, z2, 5);
                if (z2) {
                    m11267(jM11345);
                }
                boolean[] zArr2 = new boolean[this.f19278.length];
                int i2 = 0;
                while (true) {
                    AbstractC5115[] abstractC5115Arr = this.f19278;
                    if (i2 >= abstractC5115Arr.length) {
                        break;
                    }
                    AbstractC5115 abstractC5115 = abstractC5115Arr[i2];
                    boolean zM11226 = m11226(abstractC5115);
                    zArr2[i2] = zM11226;
                    InterfaceC4254 interfaceC4254 = c51164.f19500[i2];
                    if (zM11226) {
                        if (interfaceC4254 != abstractC5115.f19483) {
                            m11233(abstractC5115);
                        } else if (zArr[i2]) {
                            long j = this.f19268;
                            abstractC5115.f19481 = false;
                            abstractC5115.f19475 = j;
                            abstractC5115.f19482 = j;
                            abstractC5115.mo1126(false, j);
                        }
                    }
                    i2++;
                }
                m11281(zArr2, this.f19268);
            } else {
                this.f19250.m11302(c51163);
                if (c51163.f19505) {
                    c51163.m11345(c1258M11343, Math.max(c51163.f19502.f19309, this.f19268 - c51163.f19498), false, new boolean[c51163.f19506.length]);
                }
            }
            m11282(true);
            if (this.f19280.f19449 != 4) {
                m11272();
                m11264();
                this.f19262.m10157(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m11269(C5102 c5102) throws Throwable {
        long j;
        long j2;
        boolean z;
        C4290 c4290;
        long j3;
        long j4;
        long j5;
        C5110 c5110;
        int i;
        this.f19255.m4994(1);
        Pair pairM11228 = m11228(this.f19280.f19459, c5102, true, this.f19252, this.f19274, this.f19292, this.f19253);
        if (pairM11228 == null) {
            Pair pairM11263 = m11263(this.f19280.f19459);
            c4290 = (C4290) pairM11263.first;
            long jLongValue = ((Long) pairM11263.second).longValue();
            z = !this.f19280.f19459.m6477();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairM11228.first;
            long jLongValue2 = ((Long) pairM11228.second).longValue();
            long j6 = c5102.f19428 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            C4290 c4290M11301 = this.f19250.m11301(this.f19280.f19459, obj, jLongValue2);
            if (c4290M11301.m9753()) {
                this.f19280.f19459.mo6479(c4290M11301.f16693, this.f19253);
                if (this.f19253.m6500(c4290M11301.f16690) == c4290M11301.f16692) {
                    this.f19253.f9579.getClass();
                }
                j = 0;
                j2 = j6;
                z = true;
            } else {
                j = jLongValue2;
                j2 = j6;
                z = c5102.f19428 == -9223372036854775807L;
            }
            c4290 = c4290M11301;
        }
        try {
            if (this.f19280.f19459.m6477()) {
                this.f19267 = c5102;
            } else {
                if (pairM11228 != null) {
                    if (c4290.equals(this.f19280.f19448)) {
                        C5116 c5116 = this.f19250.f19398;
                        long jMo6167 = (c5116 == null || !c5116.f19505 || j == 0) ? j : c5116.f19501.mo6167(j, this.f19263);
                        if (AbstractC4470.m10171(jMo6167) == AbstractC4470.m10171(this.f19280.f19463) && ((i = (c5110 = this.f19280).f19449) == 2 || i == 3)) {
                            long j7 = c5110.f19463;
                            this.f19280 = m11270(c4290, j7, j2, j7, z, 2);
                            return;
                        }
                        j4 = jMo6167;
                    } else {
                        j4 = j;
                    }
                    boolean z2 = this.f19280.f19449 == 4;
                    C5097 c5097 = this.f19250;
                    long jM11286 = m11286(c4290, j4, c5097.f19398 != c5097.f19386, z2);
                    z |= j != jM11286;
                    try {
                        C5110 c51102 = this.f19280;
                        AbstractC2394 abstractC2394 = c51102.f19459;
                        m11265(abstractC2394, c4290, abstractC2394, c51102.f19448, j2, true);
                        j5 = jM11286;
                        this.f19280 = m11270(c4290, j5, j2, j5, z, 2);
                    } catch (Throwable th) {
                        th = th;
                        j3 = jM11286;
                        this.f19280 = m11270(c4290, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                if (this.f19280.f19449 != 1) {
                    m11271(4);
                }
                m11238(false, true, false, true);
            }
            j5 = j;
            this.f19280 = m11270(c4290, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C5110 m11270(C4290 c4290, long j, long j2, long j3, boolean z, int i) {
        C4241 c4241;
        C1258 c1258;
        List list;
        C3932 c3932M9167;
        boolean z2;
        int i2;
        int i3;
        this.f19249 = (!this.f19249 && j == this.f19280.f19463 && c4290.equals(this.f19280.f19448)) ? false : true;
        m11251();
        C5110 c5110 = this.f19280;
        C4241 c42412 = c5110.f19456;
        C1258 c12582 = c5110.f19467;
        List list2 = c5110.f19450;
        if (this.f19284.f15793) {
            C5116 c5116 = this.f19250.f19398;
            C4241 c42413 = c5116 == null ? C4241.f16463 : c5116.f19496;
            C1258 c12583 = c5116 == null ? this.f19257 : c5116.f19504;
            InterfaceC1239[] interfaceC1239Arr = c12583.f5166;
            C3961 c3961 = new C3961(4);
            int length = interfaceC1239Arr.length;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length) {
                InterfaceC1239 interfaceC1239 = interfaceC1239Arr[i4];
                if (interfaceC1239 == null) {
                    i3 = 1;
                } else {
                    C2401 c2401 = interfaceC1239.mo4446(0).f9670;
                    if (c2401 == null) {
                        c3961.m9172(new C2401(new InterfaceC2425[0]));
                        i3 = 1;
                    } else {
                        c3961.m9172(c2401);
                        i3 = 1;
                        z3 = true;
                    }
                }
                i4 += i3;
            }
            if (z3) {
                c3932M9167 = c3961.m9167();
            } else {
                C3928 c3928 = AbstractC3980.f15360;
                c3932M9167 = C3932.f15274;
            }
            if (c5116 != null) {
                C5082 c5082 = c5116.f19502;
                if (c5082.f19312 != j2) {
                    c5116.f19502 = c5082.m11288(j2);
                }
            }
            C5116 c51162 = this.f19250.f19398;
            if (c51162 != null) {
                C1258 c12584 = c51162.f19504;
                boolean z4 = false;
                int i5 = 0;
                while (true) {
                    AbstractC5115[] abstractC5115Arr = this.f19278;
                    if (i5 >= abstractC5115Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (c12584.m4487(i5)) {
                        i2 = 1;
                        if (abstractC5115Arr[i5].f19476 != 1) {
                            z2 = false;
                            break;
                        }
                        if (c12584.f5164[i5].f19308 != 0) {
                            z4 = true;
                        }
                    } else {
                        i2 = 1;
                    }
                    i5 += i2;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f19282) {
                    this.f19282 = z5;
                    if (!z5 && this.f19280.f19458) {
                        this.f19262.m10157(2);
                    }
                }
            }
            list = c3932M9167;
            c4241 = c42413;
            c1258 = c12583;
        } else if (c4290.equals(c5110.f19448)) {
            c4241 = c42412;
            c1258 = c12582;
            list = list2;
        } else {
            c4241 = C4241.f16463;
            c1258 = this.f19257;
            list = C3932.f15274;
        }
        if (z) {
            C1440 c1440 = this.f19255;
            if (!c1440.f5910 || c1440.f5906 == 5) {
                c1440.f5907 = true;
                c1440.f5910 = true;
                c1440.f5906 = i;
            } else {
                AbstractC4464.m10142(i == 5);
            }
        }
        C5110 c51102 = this.f19280;
        long j4 = c51102.f19464;
        C5116 c51163 = this.f19250.f19389;
        return c51102.m11329(c4290, j, j2, j3, c51163 == null ? 0L : Math.max(0L, j4 - (this.f19268 - c51163.f19498)), c4241, c1258, list);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m11271(int i) {
        C5110 c5110 = this.f19280;
        if (c5110.f19449 != i) {
            if (i != 2) {
                this.f19261 = -9223372036854775807L;
            }
            this.f19280 = c5110.m11332(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m11272() {
        boolean zM11352;
        if (m11254()) {
            C5116 c5116 = this.f19250.f19389;
            long jMo6173 = !c5116.f19505 ? 0L : c5116.f19501.mo6173();
            C5116 c51162 = this.f19250.f19389;
            long jMax = c51162 == null ? 0L : Math.max(0L, jMo6173 - (this.f19268 - c51162.f19498));
            C5116 c51163 = this.f19250.f19398;
            long j = m11243(this.f19280.f19459, c5116.f19502.f19313) ? this.f19283.f19412 : -9223372036854775807L;
            C1215 c1215 = this.f19260;
            AbstractC2394 abstractC2394 = this.f19280.f19459;
            float f = this.f19269.mo1114().f9730;
            boolean z = this.f19280.f19451;
            C5086 c5086 = new C5086(c1215, jMax, f, this.f19271, j);
            zM11352 = this.f19286.m11352(c5086);
            C5116 c51164 = this.f19250.f19398;
            if (!zM11352 && c51164.f19505 && jMax < 500000 && this.f19270 > 0) {
                c51164.f19501.mo6170(this.f19280.f19463);
                zM11352 = this.f19286.m11352(c5086);
            }
        } else {
            zM11352 = false;
        }
        this.f19258 = zM11352;
        if (zM11352) {
            C5116 c51165 = this.f19250.f19389;
            long j2 = this.f19268;
            float f2 = this.f19269.mo1114().f9730;
            long j3 = this.f19251;
            AbstractC4464.m10132(c51165.f19495 == null);
            long j4 = j2 - c51165.f19498;
            ?? r1 = c51165.f19501;
            C5101 c5101 = new C5101();
            c5101.f19426 = j4;
            AbstractC4464.m10142(f2 > 0.0f || f2 == -3.4028235E38f);
            c5101.f19424 = f2;
            AbstractC4464.m10142(j3 >= 0 || j3 == -9223372036854775807L);
            c5101.f19425 = j3;
            r1.mo6166(new C5077(c5101));
        }
        m11231();
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        this.f19262.m10159(9, (InterfaceC4294) interfaceC4280).m10121();
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final synchronized void m11273(C4253 c4253, long j) {
        this.f19266.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c4253.get()).booleanValue() && j > 0) {
            try {
                this.f19266.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.f19266.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m11274(C5080 c5080) {
        this.f19254 = c5080;
        AbstractC2394 abstractC2394 = this.f19280.f19459;
        C5097 c5097 = this.f19250;
        c5097.getClass();
        c5080.getClass();
        if (c5097.f19390.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c5097.f19390.size(); i++) {
            ((C5116) c5097.f19390.get(i)).m11347();
        }
        c5097.f19390 = arrayList;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m11275(C2441 c2441) {
        this.f19262.m10160(16);
        C1273 c1273 = this.f19269;
        c1273.mo1113(c2441);
        C2441 c2441Mo1114 = c1273.mo1114();
        m11248(c2441Mo1114, c2441Mo1114.f9730, true, true);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m11276(boolean z) throws ExoPlaybackException {
        this.f19288 = z;
        m11251();
        if (this.f19264) {
            C5097 c5097 = this.f19250;
            if (c5097.f19386 != c5097.f19398) {
                m11260(true);
                m11282(false);
            }
        }
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void m11277(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f19275 != z) {
            this.f19275 = z;
            if (!z) {
                for (AbstractC5115 abstractC5115 : this.f19278) {
                    if (!m11226(abstractC5115) && this.f19256.remove(abstractC5115)) {
                        abstractC5115.m11338();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m11278() {
        C5116 c5116 = this.f19250.f19398;
        if (c5116 == null) {
            return;
        }
        C1258 c1258 = c5116.f19504;
        int i = 0;
        while (true) {
            AbstractC5115[] abstractC5115Arr = this.f19278;
            if (i >= abstractC5115Arr.length) {
                return;
            }
            if (c1258.m4487(i)) {
                AbstractC5115 abstractC5115 = abstractC5115Arr[i];
                int i2 = abstractC5115.f19478;
                if (i2 == 1) {
                    AbstractC4464.m10132(i2 == 1);
                    abstractC5115.f19478 = 2;
                    abstractC5115.mo1132();
                }
            }
            i++;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m11279() {
        C1440 c1440 = this.f19255;
        C5110 c5110 = this.f19280;
        boolean z = c1440.f5907 | (((C5110) c1440.f5909) != c5110);
        c1440.f5907 = z;
        c1440.f5909 = c5110;
        if (z) {
            C5118 c5118 = this.f19285.f19374;
            c5118.f19549.m10158(new RunnableC4645(c5118, 2, c1440));
            this.f19255 = new C1440(this.f19280);
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m11280() {
        for (int i = 0; i < this.f19278.length; i++) {
            AbstractC5115 abstractC5115 = this.f19265[i];
            synchronized (abstractC5115.f19485) {
                abstractC5115.f19487 = null;
            }
            AbstractC5115 abstractC51152 = this.f19278[i];
            AbstractC4464.m10132(abstractC51152.f19478 == 0);
            abstractC51152.mo3871();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11281(boolean[] r24, long r25) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5076.m11281(boolean[], long):void");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m11282(boolean z) {
        C5116 c5116 = this.f19250.f19389;
        C4290 c4290 = c5116 == null ? this.f19280.f19448 : c5116.f19502.f19313;
        boolean zEquals = this.f19280.f19454.equals(c4290);
        if (!zEquals) {
            this.f19280 = this.f19280.m11324(c4290);
        }
        C5110 c5110 = this.f19280;
        c5110.f19464 = c5116 == null ? c5110.f19463 : c5116.m11348();
        C5110 c51102 = this.f19280;
        long j = c51102.f19464;
        C5116 c51162 = this.f19250.f19389;
        c51102.f19453 = c51162 != null ? Math.max(0L, j - (this.f19268 - c51162.f19498)) : 0L;
        if ((!zEquals || z) && c5116 != null && c5116.f19505) {
            m11241(c5116.f19504);
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final synchronized boolean m11283() {
        if (!this.f19259 && this.f19279.getThread().isAlive()) {
            this.f19262.m10157(7);
            m11273(new C4253(4, this), this.f19291);
            return this.f19259;
        }
        return true;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m11284() {
        this.f19255.m4994(1);
        int i = 0;
        m11238(false, false, false, true);
        C5117 c5117 = this.f19286;
        c5117.getClass();
        long id = Thread.currentThread().getId();
        long j = c5117.f19515;
        AbstractC4464.m10130("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        c5117.f19515 = id;
        HashMap map = c5117.f19509;
        C1215 c1215 = this.f19260;
        if (!map.containsKey(c1215)) {
            map.put(c1215, new C5091());
        }
        C5091 c5091 = (C5091) map.get(c1215);
        c5091.getClass();
        int i2 = c5117.f19512;
        if (i2 == -1) {
            i2 = 13107200;
        }
        c5091.f19364 = i2;
        c5091.f19365 = false;
        m11271(this.f19280.f19459.m6477() ? 4 : 2);
        C1660 c1660 = (C1660) this.f19290;
        c1660.getClass();
        C4092 c4092 = this.f19284;
        AbstractC4464.m10132(!c4092.f15793);
        c4092.f15789 = c1660;
        while (true) {
            ArrayList arrayList = (ArrayList) c4092.f15792;
            if (i >= arrayList.size()) {
                c4092.f15793 = true;
                this.f19262.m10157(2);
                return;
            } else {
                C5088 c5088 = (C5088) arrayList.get(i);
                c4092.m9391(c5088);
                ((HashSet) c4092.f15791).add(c5088);
                i++;
            }
        }
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m11285(int i) throws ExoPlaybackException {
        this.f19252 = i;
        AbstractC2394 abstractC2394 = this.f19280.f19459;
        C5097 c5097 = this.f19250;
        c5097.f19395 = i;
        if (!c5097.m11303(abstractC2394)) {
            m11260(true);
        }
        m11282(false);
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final long m11286(C4290 c4290, long j, boolean z, boolean z2) throws ExoPlaybackException {
        m11259();
        m11261(false, true);
        if (z2 || this.f19280.f19449 == 3) {
            m11271(2);
        }
        C5097 c5097 = this.f19250;
        C5116 c5116 = c5097.f19398;
        C5116 c51162 = c5116;
        while (c51162 != null && !c4290.equals(c51162.f19502.f19313)) {
            c51162 = c51162.f19495;
        }
        if (z || c5116 != c51162 || (c51162 != null && c51162.f19498 + j < 0)) {
            AbstractC5115[] abstractC5115Arr = this.f19278;
            for (AbstractC5115 abstractC5115 : abstractC5115Arr) {
                m11233(abstractC5115);
            }
            if (c51162 != null) {
                while (c5097.f19398 != c51162) {
                    c5097.m11307();
                }
                c5097.m11302(c51162);
                c51162.f19498 = 1000000000000L;
                m11281(new boolean[abstractC5115Arr.length], c5097.f19386.m11342());
            }
        }
        if (c51162 != null) {
            c5097.m11302(c51162);
            if (!c51162.f19505) {
                c51162.f19502 = c51162.f19502.m11287(j);
            } else if (c51162.f19493) {
                ?? r9 = c51162.f19501;
                j = r9.mo6164(j);
                r9.mo6170(j - this.f19270);
            }
            m11267(j);
            m11272();
        } else {
            c5097.m11298();
            m11267(j);
        }
        m11282(false);
        this.f19262.m10157(2);
        return j;
    }
}
