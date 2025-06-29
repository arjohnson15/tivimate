package p127;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p013.AbstractC1039;
import p317.AbstractC3619;
import p430.EnumC5022;

/* renamed from: ˈⁱ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2028 extends C2034 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean f7690;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM8556 = property != null ? AbstractC3619.m8556(property) : null;
        boolean z = false;
        if (numM8556 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM8556.intValue() >= 9) {
            z = true;
        }
        f7690 = z;
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC5022) obj) != EnumC5022.f19055) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC5022) it.next()).f19062);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
