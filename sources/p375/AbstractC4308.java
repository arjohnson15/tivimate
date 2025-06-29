package p375;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115.C1825;
import p115.C1831;
import p260.C3222;
import p271.C3294;
import p271.C3295;
import ـˊ.ʿʼ;

/* renamed from: ᵢˏ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4308 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ʿʼ f16754 = new ʿʼ(6);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9801(C3222 c3222) throws GeneralSecurityException {
        C1831 c1831;
        ArrayList arrayList = new ArrayList();
        C3295 c3295 = C3295.f12832;
        Iterator it = ((ConcurrentHashMap) c3222.f12538).values().iterator();
        while (it.hasNext()) {
            for (C1825 c1825 : (List) it.next()) {
                int iOrdinal = c1825.f7048.ordinal();
                if (iOrdinal == 1) {
                    c1831 = C1831.f7053;
                } else if (iOrdinal == 2) {
                    c1831 = C1831.f7054;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c1831 = C1831.f7052;
                }
                String strSubstring = c1825.f7047;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new C3294(c1831, c1825.f7046, strSubstring, c1825.f7042.name()));
            }
        }
        C1825 c18252 = (C1825) c3222.f12539;
        Integer numValueOf = c18252 != null ? Integer.valueOf(c18252.f7046) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((C3294) it2.next()).f12828 == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        DesugarCollections.unmodifiableList(arrayList);
    }
}
