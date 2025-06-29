package p141;

import android.net.Uri;
import android.os.Handler;
import androidx.leanback.widget.ﾞᐧ;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import p014.C1060;
import p036.InterfaceC1239;
import p076.C1653;
import p166.C2431;
import p166.C2433;
import p331.C3761;
import p345.AbstractC3980;
import p345.C3930;
import p345.C3932;
import p345.C3961;
import p374.C4241;
import p374.C4296;
import p374.InterfaceC4254;
import p374.InterfaceC4294;
import p374.InterfaceC4295;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5077;
import p438.C5085;
import ˈˉ.ﹳﹳ;
import ᵔʼ.ˑʽ;

/* renamed from: ˉˑ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2210 implements InterfaceC4294 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f8734;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public RtspMediaSource$RtspPlaybackException f8735;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Handler f8736 = AbstractC4470.m10200(null);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ArrayList f8737;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f8738;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ˑʽ f8739;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ﾞᐧ f8740;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f8741;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f8742;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f8743;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public InterfaceC4295 f8744;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2209 f8745;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1653 f8746;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3932 f8747;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f8748;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f8749;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f8750;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ArrayList f8751;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public long f8752;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ʾי.ˑʽ f8753;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f8754;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public IOException f8755;

    public C2210(C1653 c1653, ˑʽ r8, Uri uri, ʾי.ˑʽ r10, String str, SocketFactory socketFactory) {
        this.f8746 = c1653;
        this.f8739 = r8;
        this.f8753 = r10;
        ﾞᐧ r2 = new ﾞᐧ(17, this);
        this.f8740 = r2;
        this.f8745 = new C2209(r2, r2, str, uri, socketFactory);
        this.f8737 = new ArrayList();
        this.f8751 = new ArrayList();
        this.f8742 = -9223372036854775807L;
        this.f8743 = -9223372036854775807L;
        this.f8752 = -9223372036854775807L;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m6152(C2210 c2210) {
        c2210.f8738 = true;
        C2209 c2209 = c2210.f8745;
        c2209.getClass();
        try {
            c2209.close();
            C2203 c2203 = new C2203(new C3761(c2209));
            c2209.f8724 = c2203;
            c2203.m6137(c2209.m6147(c2209.f8719));
            c2209.f8733 = null;
            c2209.f8729 = false;
            c2209.f8722 = null;
        } catch (IOException e) {
            c2209.f8717.ᴵʼ(new RtspMediaSource$RtspPlaybackException(e));
        }
        c2210.f8739.getClass();
        ﹳﹳ r0 = new ﹳﹳ(19);
        ArrayList arrayList = c2210.f8737;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = c2210.f8751;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C2197 c2197 = (C2197) arrayList.get(i);
            if (c2197.f8648) {
                arrayList2.add(c2197);
            } else {
                C2211 c2211 = c2197.f8646;
                C2197 c21972 = new C2197(c2210, c2211.f8758, i, r0);
                arrayList2.add(c21972);
                c21972.m6125();
                if (arrayList3.contains(c2211)) {
                    arrayList4.add(c21972.f8646);
                }
            }
        }
        AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i2 = 0; i2 < abstractC3980M9209.size(); i2++) {
            ((C2197) abstractC3980M9209.get(i2)).m6126();
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static boolean m6156(C2210 c2210) {
        return c2210.f8742 != -9223372036854775807L;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static void m6158(C2210 c2210) {
        if (c2210.f8734 || c2210.f8749) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = c2210.f8737;
            if (i >= arrayList.size()) {
                c2210.f8749 = true;
                AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209(arrayList);
                C3961 c3961 = new C3961();
                for (int i2 = 0; i2 < abstractC3980M9209.size(); i2++) {
                    C4296 c4296 = ((C2197) abstractC3980M9209.get(i2)).f8645;
                    String string = Integer.toString(i2);
                    C2431 c2431M9756 = c4296.m9756();
                    AbstractC4464.m10129(c2431M9756);
                    c3961.m9174(new C2433(string, c2431M9756));
                }
                c2210.f8747 = c3961.m9167();
                InterfaceC4295 interfaceC4295 = c2210.f8744;
                AbstractC4464.m10129(interfaceC4295);
                interfaceC4295.mo9719(c2210);
                return;
            }
            if (((C2197) arrayList.get(i)).f8645.m9756() == null) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static void m6159(C2210 c2210) {
        c2210.f8741 = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = c2210.f8737;
            if (i >= arrayList.size()) {
                return;
            }
            c2210.f8741 = ((C2197) arrayList.get(i)).f8648 & c2210.f8741;
            i++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo6160() {
        int i;
        return !this.f8741 && ((i = this.f8745.f8731) == 2 || i == 1);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי, reason: contains not printable characters */
    public final long mo6161() {
        if (!this.f8750) {
            return -9223372036854775807L;
        }
        this.f8750 = false;
        return 0L;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i = 0; i < interfaceC1239Arr.length; i++) {
            if (interfaceC4254Arr[i] != null && (interfaceC1239Arr[i] == null || !zArr[i])) {
                interfaceC4254Arr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f8751;
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            int length = interfaceC1239Arr.length;
            arrayList = this.f8737;
            if (i2 >= length) {
                break;
            }
            InterfaceC1239 interfaceC1239 = interfaceC1239Arr[i2];
            if (interfaceC1239 != null) {
                C2433 c2433Mo4434 = interfaceC1239.mo4434();
                C3932 c3932 = this.f8747;
                c3932.getClass();
                int iIndexOf = c3932.indexOf(c2433Mo4434);
                C2197 c2197 = (C2197) arrayList.get(iIndexOf);
                c2197.getClass();
                arrayList2.add(c2197.f8646);
                if (this.f8747.contains(c2433Mo4434) && interfaceC4254Arr[i2] == null) {
                    interfaceC4254Arr[i2] = new C1060(iIndexOf, this);
                    zArr2[i2] = true;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C2197 c21972 = (C2197) arrayList.get(i3);
            if (!arrayList2.contains(c21972.f8646)) {
                c21972.m6126();
            }
        }
        this.f8748 = true;
        if (j != 0) {
            this.f8743 = j;
            this.f8742 = j;
            this.f8752 = j;
        }
        m6172();
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) throws IOException {
        C2209 c2209 = this.f8745;
        this.f8744 = interfaceC4295;
        try {
            c2209.getClass();
            try {
                c2209.f8724.m6137(c2209.m6147(c2209.f8719));
                Uri uri = c2209.f8719;
                String str = c2209.f8733;
                ᐧʻ r0 = c2209.f8732;
                r0.ﹳˑ(r0.ˏʾ(4, str, C3930.f15266, uri));
            } catch (IOException e) {
                AbstractC4470.m10186(c2209.f8724);
                throw e;
            }
        } catch (IOException e2) {
            this.f8755 = e2;
            AbstractC4470.m10186(c2209);
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final long mo6164(long j) {
        if (mo6165() == 0 && !this.f8738) {
            this.f8752 = j;
            return j;
        }
        mo6170(j);
        this.f8743 = j;
        if (this.f8742 != -9223372036854775807L) {
            C2209 c2209 = this.f8745;
            int i = c2209.f8731;
            if (i == 1) {
                return j;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f8742 = j;
            c2209.m6146(j);
            return j;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f8737;
            if (i2 >= arrayList.size()) {
                return j;
            }
            if (!((C2197) arrayList.get(i2)).f8645.m9776(false, j)) {
                this.f8742 = j;
                if (this.f8741) {
                    for (int i3 = 0; i3 < this.f8737.size(); i3++) {
                        C2197 c2197 = (C2197) this.f8737.get(i3);
                        AbstractC4464.m10132(c2197.f8648);
                        c2197.f8648 = false;
                        m6159(c2197.f8647);
                        c2197.m6125();
                    }
                    if (this.f8738) {
                        this.f8745.m6145(AbstractC4470.m10171(j));
                    } else {
                        this.f8745.m6146(j);
                    }
                } else {
                    this.f8745.m6146(j);
                }
                for (int i4 = 0; i4 < this.f8737.size(); i4++) {
                    C2197 c21972 = (C2197) this.f8737.get(i4);
                    if (!c21972.f8648) {
                        C2206 c2206 = c21972.f8646.f8756.f8677;
                        c2206.getClass();
                        synchronized (c2206.f8687) {
                            c2206.f8691 = true;
                        }
                        c21972.f8645.m9764(false);
                        c21972.f8645.f16730 = j;
                    }
                }
                return j;
            }
            i2++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final long mo6165() {
        if (!this.f8741) {
            ArrayList arrayList = this.f8737;
            if (!arrayList.isEmpty()) {
                long j = this.f8743;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z = true;
                long jMin = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    C2197 c2197 = (C2197) arrayList.get(i);
                    if (!c2197.f8648) {
                        jMin = Math.min(jMin, c2197.f8645.m9767());
                        z = false;
                    }
                }
                if (z || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo6166(C5077 c5077) {
        return mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long mo6167(long j, C5085 c5085) {
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo6168() throws IOException {
        IOException iOException = this.f8755;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C4241 mo6169() {
        AbstractC4464.m10132(this.f8749);
        C3932 c3932 = this.f8747;
        c3932.getClass();
        return new C4241((C2433[]) c3932.toArray(new C2433[0]));
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo6170(long j) {
        if (this.f8742 != -9223372036854775807L) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8737;
            if (i >= arrayList.size()) {
                return;
            }
            C2197 c2197 = (C2197) arrayList.get(i);
            if (!c2197.f8648) {
                c2197.f8645.m9780(true, j);
            }
            i++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo6171(long j) {
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m6172() {
        ArrayList arrayList;
        int i = 0;
        boolean z = true;
        while (true) {
            arrayList = this.f8751;
            if (i >= arrayList.size()) {
                break;
            }
            z &= ((C2211) arrayList.get(i)).f8757 != null;
            i++;
        }
        if (z && this.f8748) {
            C2209 c2209 = this.f8745;
            c2209.f8718.addAll(arrayList);
            c2209.m6144();
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final long mo6173() {
        return mo6165();
    }
}
