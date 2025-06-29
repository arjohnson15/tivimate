package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p447.AbstractC5179;

/* renamed from: com.google.android.gms.internal.measurement.ﹶˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0563 {
    protected int zza;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m2511(Iterable iterable, List list) {
        Charset charset = AbstractC0412.f2705;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC0499)) {
            if (iterable instanceof InterfaceC0365) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String strM11548 = AbstractC5179.m11548(list.size() - size, "Element at index ", " is null.");
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(strM11548);
                }
                list.add(obj);
            }
            return;
        }
        List listM2335 = ((InterfaceC0499) iterable).m2335();
        InterfaceC0499 interfaceC0499 = (InterfaceC0499) list;
        int size3 = list.size();
        for (Object obj2 : listM2335) {
            if (obj2 == null) {
                String strM115482 = AbstractC5179.m11548(interfaceC0499.size() - size3, "Element at index ", " is null.");
                for (int size4 = interfaceC0499.size() - 1; size4 >= size3; size4--) {
                    interfaceC0499.remove(size4);
                }
                throw new NullPointerException(strM115482);
            }
            if (obj2 instanceof C0315) {
                interfaceC0499.m2336();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                C0315.m1833(bArr, 0, bArr.length);
                interfaceC0499.m2336();
            } else {
                interfaceC0499.add((String) obj2);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] m2512() {
        try {
            int iMo2513 = ((AbstractC0583) this).mo2513(null);
            byte[] bArr = new byte[iMo2513];
            C0346 c0346 = new C0346(iMo2513, bArr);
            ((AbstractC0583) this).m2542(c0346);
            if (c0346.m1945() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ˆʽ.ᵎˏ.ˑי("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract int mo2513(InterfaceC0494 interfaceC0494);
}
