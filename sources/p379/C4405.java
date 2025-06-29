package p379;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p035.C1232;
import p041.C1276;
import p070.AbstractC1549;
import p126.AbstractC2018;
import p126.C2021;
import p126.InterfaceC2023;
import p158.AbstractC2339;
import p317.AbstractC3616;
import p366.C4155;
import p366.InterfaceC4163;
import p366.InterfaceC4168;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5013;
import p430.C5014;
import p430.C5021;
import p430.EnumC5022;
import ˈי.ʾˈ;

/* renamed from: ᵢᐧ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4405 implements InterfaceC2023 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2021 f16971;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final EnumC5022 f16972;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4413 f16973;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1276 f16974;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public volatile boolean f16975;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile C4401 f16976;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final List f16970 = AbstractC2339.m6430("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final List f16969 = AbstractC2339.m6430("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public C4405(C4999 c4999, C1276 c1276, C2021 c2021, C4413 c4413) {
        this.f16974 = c1276;
        this.f16971 = c2021;
        this.f16973 = c4413;
        EnumC5022 enumC5022 = EnumC5022.f19060;
        this.f16972 = c4999.f18917.contains(enumC5022) ? enumC5022 : EnumC5022.f19056;
    }

    @Override // p126.InterfaceC2023
    public final void cancel() {
        this.f16975 = true;
        C4401 c4401 = this.f16976;
        if (c4401 != null) {
            c4401.m9992(9);
        }
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ʽᐧ */
    public final InterfaceC4168 mo4489(C5021 c5021, long j) {
        return this.f16976.m10000();
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ʿʼ */
    public final void mo4490(C5021 c5021) throws IOException {
        int i;
        C4401 c4401;
        if (this.f16976 != null) {
            return;
        }
        boolean z = true;
        boolean z2 = c5021.f19054 != null;
        C5014 c5014 = c5021.f19051;
        ArrayList arrayList = new ArrayList(c5014.size() + 4);
        arrayList.add(new C4410(C4410.f16992, c5021.f19049));
        C4155 c4155 = C4410.f16993;
        C5004 c5004 = c5021.f19052;
        String strM11090 = c5004.m11090();
        String strM11097 = c5004.m11097();
        if (strM11097 != null) {
            strM11090 = strM11090 + '?' + strM11097;
        }
        arrayList.add(new C4410(c4155, strM11090));
        String strM11104 = c5014.m11104("Host");
        if (strM11104 != null) {
            arrayList.add(new C4410(C4410.f16995, strM11104));
        }
        arrayList.add(new C4410(C4410.f16991, c5004.f18958));
        int size = c5014.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = c5014.m11105(i2).toLowerCase(Locale.US);
            if (!f16970.contains(lowerCase) || (lowerCase.equals("te") && AbstractC1549.m5138(c5014.m11103(i2), "trailers"))) {
                arrayList.add(new C4410(lowerCase, c5014.m11103(i2)));
            }
        }
        C4413 c4413 = this.f16973;
        boolean z3 = !z2;
        synchronized (c4413.f17008) {
            synchronized (c4413) {
                try {
                    if (c4413.f17005 > 1073741823) {
                        c4413.m10017(8);
                    }
                    if (c4413.f17021) {
                        throw new ConnectionShutdownException();
                    }
                    i = c4413.f17005;
                    c4413.f17005 = i + 2;
                    c4401 = new C4401(i, c4413, z3, false, null);
                    if (z2 && c4413.f17018 < c4413.f17024 && c4401.f16945 < c4401.f16953) {
                        z = false;
                    }
                    if (c4401.m10002()) {
                        c4413.f17004.put(Integer.valueOf(i), c4401);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4413.f17008.m10030(z3, i, arrayList);
        }
        if (z) {
            c4413.f17008.flush();
        }
        this.f16976 = c4401;
        if (this.f16975) {
            this.f16976.m9992(9);
            throw new IOException("Canceled");
        }
        C4398 c4398 = this.f16976.f16949;
        long j = this.f16971.f7672;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4398.mo9539(j, timeUnit);
        this.f16976.f16947.mo9539(this.f16971.f7668, timeUnit);
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ˏᵢ */
    public final C1276 mo4503() {
        return this.f16974;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ˑʽ */
    public final void mo4504() throws SocketTimeoutException {
        this.f16976.m10000().close();
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ـﹶ */
    public final long mo4507(C4994 c4994) {
        if (AbstractC2018.m5660(c4994)) {
            return AbstractC2339.m6448(c4994);
        }
        return 0L;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ٴˎ */
    public final C5013 mo4508(boolean z) throws IOException {
        C5014 c5014;
        C4401 c4401 = this.f16976;
        if (c4401 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c4401) {
            c4401.f16949.m9582();
            while (c4401.f16954.isEmpty() && c4401.f16948 == 0) {
                try {
                    c4401.m9994();
                } catch (Throwable th) {
                    c4401.f16949.m9988();
                    throw th;
                }
            }
            c4401.f16949.m9988();
            if (c4401.f16954.isEmpty()) {
                IOException iOException = c4401.f16955;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(c4401.f16948);
            }
            c5014 = (C5014) c4401.f16954.removeFirst();
        }
        EnumC5022 enumC5022 = this.f16972;
        ArrayList arrayList = new ArrayList(20);
        int size = c5014.size();
        ᐧʻ r7 = null;
        for (int i = 0; i < size; i++) {
            String strM11105 = c5014.m11105(i);
            String strM11103 = c5014.m11103(i);
            if (AbstractC1549.m5138(strM11105, ":status")) {
                r7 = ʾˈ.ˋⁱ("HTTP/1.1 " + strM11103);
            } else if (!f16969.contains(strM11105)) {
                arrayList.add(strM11105);
                arrayList.add(AbstractC3616.m8539(strM11103).toString());
            }
        }
        if (r7 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C5013 c5013 = new C5013();
        c5013.f19017 = enumC5022;
        c5013.f19024 = r7.ˆʿ;
        c5013.f19028 = (String) r7.ᐧˋ;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C1232 c1232 = new C1232(1);
        c1232.f5042.addAll(Arrays.asList(strArr));
        c5013.f19026 = c1232;
        if (z && c5013.f19024 == 100) {
            return null;
        }
        return c5013;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ᐧʻ */
    public final InterfaceC4163 mo4509(C4994 c4994) {
        return this.f16976.f16957;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ﹳﹳ */
    public final void mo4518() {
        this.f16973.flush();
    }
}
