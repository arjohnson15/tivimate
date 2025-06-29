package p374;

import android.content.Context;
import android.net.Uri;
import androidx.leanback.widget.C0137;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.InterfaceC0864;
import p166.AbstractC2435;
import p166.C2399;
import p166.C2402;
import p166.C2407;
import p166.C2410;
import p166.C2417;
import p166.C2420;
import p166.C2430;
import p166.C2431;
import p166.C2439;
import p166.C2443;
import p166.C2444;
import p193.C2705;
import p254.C3161;
import p293.C3474;
import p331.C3767;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ᵢˎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4279 implements InterfaceC4270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3767 f16610;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f16611;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float f16612;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2705 f16613;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4257 f16614;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f16615;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final float f16616;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f16617;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f16618;

    public C4279(Context context, C3161 c3161) {
        C3767 c3767 = new C3767(context, new C0137(1));
        this.f16610 = c3767;
        C4257 c4257 = new C4257(c3161, new C3474(8));
        this.f16614 = c4257;
        if (c3767 != ((C3767) c4257.f16539)) {
            c4257.f16539 = c3767;
            ((HashMap) c4257.f16541).clear();
            ((HashMap) c4257.f16545).clear();
        }
        this.f16617 = -9223372036854775807L;
        this.f16611 = -9223372036854775807L;
        this.f16615 = -9223372036854775807L;
        this.f16616 = -3.4028235E38f;
        this.f16612 = -3.4028235E38f;
        this.f16618 = true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InterfaceC4270 m9739(Class cls, C3767 c3767) {
        try {
            return (InterfaceC4270) cls.getConstructor(InterfaceC0864.class).newInstance(c3767);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        C4257 c4257 = this.f16614;
        c4257.f16543 = c3474;
        C3161 c3161 = (C3161) c4257.f16538;
        synchronized (c3161) {
            c3161.f12228 = c3474;
        }
        Iterator it = ((HashMap) c4257.f16545).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4270) it.next()).mo1142(c3474);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ᵎᴵ.ﹳﹶ] */
    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        List list;
        C3932 c3932;
        long j;
        Uri uri;
        String str;
        C2402 c24022 = c2402;
        int iM10199 = 3;
        c24022.f9492.getClass();
        String scheme = c24022.f9492.f9734.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c24022.f9492.f9731, "application/x-image-uri")) {
            long j2 = c24022.f9492.f9732;
            int i = AbstractC4470.f17202;
            throw null;
        }
        C2443 c2443 = c24022.f9492;
        Uri uri2 = c2443.f9734;
        String str2 = c2443.f9731;
        if (str2 != null) {
            switch (str2) {
                case "application/x-mpegURL":
                    iM10199 = 2;
                    break;
                case "application/vnd.ms-sstr+xml":
                    iM10199 = 1;
                    break;
                case "application/dash+xml":
                    iM10199 = 0;
                    break;
                case "application/x-rtsp":
                    break;
                default:
                    iM10199 = 4;
                    break;
            }
        } else {
            iM10199 = AbstractC4470.m10199(uri2);
        }
        if (c24022.f9492.f9732 != -9223372036854775807L) {
            C3161 c3161 = (C3161) this.f16614.f16538;
            synchronized (c3161) {
                c3161.f12231 = 1;
            }
        }
        try {
            InterfaceC4270 interfaceC4270M9724 = this.f16614.m9724(iM10199);
            C2407 c2407M6563 = c24022.f9494.m6563();
            C2444 c2444 = c24022.f9494;
            if (c2444.f9739 == -9223372036854775807L) {
                c2407M6563.f9526 = this.f16617;
            }
            if (c2444.f9740 == -3.4028235E38f) {
                c2407M6563.f9527 = this.f16616;
            }
            if (c2444.f9737 == -3.4028235E38f) {
                c2407M6563.f9524 = this.f16612;
            }
            if (c2444.f9736 == -9223372036854775807L) {
                c2407M6563.f9523 = this.f16611;
            }
            if (c2444.f9738 == -9223372036854775807L) {
                c2407M6563.f9525 = this.f16615;
            }
            C2444 c24442 = new C2444(c2407M6563);
            if (!c24442.equals(c24022.f9494)) {
                C3928 c3928 = AbstractC3980.f15360;
                C3932 c39322 = C3932.f15274;
                List listEmptyList = Collections.emptyList();
                C3932 c39323 = C3932.f15274;
                C2420 c2420 = C2420.f9633;
                C2399 c2399 = c24022.f9493;
                C2430 c2430 = new C2430();
                c2430.f9656 = c2399.f9726;
                String str3 = c24022.f9495;
                C2410 c2410 = c24022.f9497;
                c24022.f9494.m6563();
                C2420 c24202 = c24022.f9496;
                C2443 c24432 = c24022.f9492;
                if (c24432 != null) {
                    String str4 = c24432.f9731;
                    Uri uri3 = c24432.f9734;
                    List list2 = c24432.f9733;
                    ?? r11 = c24432.f9735;
                    C3928 c39282 = AbstractC3980.f15360;
                    C3932 c39324 = C3932.f15274;
                    str = str4;
                    j = c24432.f9732;
                    list = list2;
                    c3932 = r11;
                    uri = uri3;
                } else {
                    list = listEmptyList;
                    c3932 = c39323;
                    j = -9223372036854775807L;
                    uri = null;
                    str = null;
                }
                C2407 c2407M65632 = c24442.m6563();
                C2443 c24433 = uri != null ? new C2443(uri, str, null, list, c3932, j) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                C2399 c23992 = new C2399(c2430);
                C2444 c24443 = new C2444(c2407M65632);
                if (c2410 == null) {
                    c2410 = C2410.f9547;
                }
                c24022 = new C2402(str5, c23992, c24433, c24443, c2410, c24202);
            }
            InterfaceC4277 interfaceC4277Mo1143 = interfaceC4270M9724.mo1143(c24022);
            AbstractC3980 abstractC3980 = c24022.f9492.f9735;
            if (!abstractC3980.isEmpty()) {
                InterfaceC4277[] interfaceC4277Arr = new InterfaceC4277[abstractC3980.size() + 1];
                interfaceC4277Arr[0] = interfaceC4277Mo1143;
                if (abstractC3980.size() > 0) {
                    if (!this.f16618) {
                        this.f16610.getClass();
                        C2439 c2439 = (C2439) abstractC3980.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C3928 c39283 = AbstractC3980.f15360;
                        C3932 c39325 = C3932.f15274;
                        Collections.emptyList();
                        C3932 c39326 = C3932.f15274;
                        C2420 c24203 = C2420.f9633;
                        Uri uri4 = Uri.EMPTY;
                        c2439.getClass();
                        throw null;
                    }
                    C2417 c2417 = new C2417();
                    ((C2439) abstractC3980.get(0)).getClass();
                    ArrayList arrayList = AbstractC2435.f9720;
                    c2417.f9602 = null;
                    ((C2439) abstractC3980.get(0)).getClass();
                    c2417.f9625 = null;
                    ((C2439) abstractC3980.get(0)).getClass();
                    c2417.f9596 = 0;
                    ((C2439) abstractC3980.get(0)).getClass();
                    c2417.f9615 = 0;
                    ((C2439) abstractC3980.get(0)).getClass();
                    c2417.f9595 = null;
                    ((C2439) abstractC3980.get(0)).getClass();
                    c2417.f9614 = null;
                    new C2431(c2417);
                    ((C2439) abstractC3980.get(0)).getClass();
                    throw null;
                }
                interfaceC4277Mo1143 = new C4272(interfaceC4277Arr);
            }
            long j3 = c24022.f9493.f9726;
            if (j3 != Long.MIN_VALUE) {
                interfaceC4277Mo1143 = new C4244(interfaceC4277Mo1143, j3, true);
            }
            c24022.f9492.getClass();
            c24022.f9492.getClass();
            return interfaceC4277Mo1143;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        AbstractC4464.m10135(c2705, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16613 = c2705;
        C4257 c4257 = this.f16614;
        c4257.f16540 = c2705;
        Iterator it = ((HashMap) c4257.f16545).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4270) it.next()).mo1144(c2705);
        }
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ـﹶ */
    public final InterfaceC4270 mo1145(boolean z) {
        this.f16618 = z;
        C4257 c4257 = this.f16614;
        c4257.f16542 = z;
        C3161 c3161 = (C3161) c4257.f16538;
        synchronized (c3161) {
            c3161.f12232 = z;
        }
        Iterator it = ((HashMap) c4257.f16545).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4270) it.next()).mo1145(z);
        }
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ﹳﹳ */
    public final InterfaceC4270 mo1146(C4125 c4125) {
        AbstractC4464.m10135(c4125, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        C4257 c4257 = this.f16614;
        c4257.f16544 = c4125;
        Iterator it = ((HashMap) c4257.f16545).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4270) it.next()).mo1146(c4125);
        }
        return this;
    }
}
