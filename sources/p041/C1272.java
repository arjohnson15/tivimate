package p041;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p158.AbstractC2339;
import p222.C2860;
import p425.C4907;
import p430.C5005;
import p430.C5011;
import p430.C5020;
import p456.C5301;

/* renamed from: ʽˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1272 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f5210;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f5211;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5212;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f5213;

    public C1272(List list) {
        this.f5213 = list;
    }

    public C1272(C5301 c5301, int i, boolean z, boolean z2) {
        this.f5213 = c5301;
        this.f5212 = i;
        this.f5210 = z;
        this.f5211 = z2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4529(Object obj, Object obj2, String str) {
        ((C5301) this.f5213).m11919(this.f5212, this.f5210, this.f5211, str, obj, obj2, null);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m4530(String str, Object obj, Object obj2, Object obj3) {
        ((C5301) this.f5213).m11919(this.f5212, this.f5210, this.f5211, str, obj, obj2, obj3);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4531(Object obj, String str) {
        ((C5301) this.f5213).m11919(this.f5212, this.f5210, this.f5211, str, obj, null, null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C5020 m4532(SSLSocket sSLSocket) throws UnknownServiceException {
        C5020 c5020;
        int i;
        boolean z;
        int i2 = this.f5212;
        List list = (List) this.f5213;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c5020 = null;
                break;
            }
            c5020 = (C5020) list.get(i2);
            if (c5020.m11108(sSLSocket)) {
                this.f5212 = i2 + 1;
                break;
            }
            i2++;
        }
        if (c5020 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f5211 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.f5212;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C5020) list.get(i3)).m11108(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.f5210 = z;
        boolean z2 = this.f5211;
        String[] strArr = c5020.f19046;
        String[] strArrM6443 = strArr != null ? AbstractC2339.m6443(sSLSocket.getEnabledCipherSuites(), strArr, C5005.f18972) : sSLSocket.getEnabledCipherSuites();
        ?? r6 = c5020.f19048;
        String[] strArrM64432 = r6 != 0 ? AbstractC2339.m6443(sSLSocket.getEnabledProtocols(), r6, C4907.f18570) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C5011 c5011 = C5005.f18972;
        byte[] bArr = AbstractC2339.f9301;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c5011.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrM6443 = (String[]) Arrays.copyOf(strArrM6443, strArrM6443.length + 1);
            strArrM6443[strArrM6443.length - 1] = str;
        }
        C2860 c2860 = new C2860();
        c2860.f11120 = c5020.f19047;
        c2860.f11119 = strArr;
        c2860.f11121 = r6;
        c2860.f11118 = c5020.f19045;
        c2860.m7178((String[]) Arrays.copyOf(strArrM6443, strArrM6443.length));
        c2860.m7182((String[]) Arrays.copyOf(strArrM64432, strArrM64432.length));
        C5020 c5020M7181 = c2860.m7181();
        if (c5020M7181.m11109() != null) {
            sSLSocket.setEnabledProtocols(c5020M7181.f19048);
        }
        if (c5020M7181.m11110() != null) {
            sSLSocket.setEnabledCipherSuites(c5020M7181.f19046);
        }
        return c5020;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4533(String str) {
        ((C5301) this.f5213).m11919(this.f5212, this.f5210, this.f5211, str, null, null, null);
    }
}
