package p041;

import android.os.Bundle;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p127.C2034;
import p158.AbstractC2339;
import p363.C4132;
import p430.C5009;
import p456.C5279;
import p456.C5343;
import ˆʽ.ᵎˏ;

/* renamed from: ʽˉ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1278 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f5257;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f5258;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f5259;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5260;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f5261;

    public C1278(long j, Bundle bundle, String str, String str2) {
        this.f5260 = 1;
        this.f5259 = str;
        this.f5261 = str2;
        this.f5258 = bundle;
        this.f5257 = j;
    }

    public C1278(C4132 c4132, TimeUnit timeUnit) {
        this.f5260 = 0;
        this.f5257 = timeUnit.toNanos(5L);
        this.f5259 = c4132.m9484();
        this.f5261 = new C1285(this, ᵎˏ.ˎٴ(new StringBuilder(), AbstractC2339.f9303, " ConnectionPool"));
        this.f5258 = new ConcurrentLinkedQueue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1278 m4560(C5343 c5343) {
        String str = c5343.f20721;
        return new C1278(c5343.f20720, c5343.f20718.m11851(), str, c5343.f20719);
    }

    public String toString() {
        switch (this.f5260) {
            case 1:
                return "origin=" + ((String) this.f5261) + ",name=" + ((String) this.f5259) + ",params=" + String.valueOf((Bundle) this.f5258);
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int m4561(C1276 c1276, long j) {
        byte[] bArr = AbstractC2339.f9301;
        ArrayList arrayList = c1276.f5249;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c1276.f5240.f19016.f19004 + " was leaked. Did you forget to close a response body?";
                C2034 c2034 = C2034.f7700;
                C2034.f7700.mo5678(((C1279) reference).f5262, str);
                arrayList.remove(i);
                c1276.f5242 = true;
                if (arrayList.isEmpty()) {
                    c1276.f5253 = j - this.f5257;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m4562(C5009 c5009, C1274 c1274, List list, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.f5258).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C1276 c1276 = (C1276) it.next();
            synchronized (c1276) {
                if (z) {
                    if (!(c1276.f5251 != null)) {
                        continue;
                    }
                }
                if (c1276.m4559(c5009, list)) {
                    c1274.m4545(c1276);
                    return true;
                }
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C5343 m4563() {
        return new C5343((String) this.f5259, new C5279(new Bundle((Bundle) this.f5258)), (String) this.f5261, this.f5257);
    }
}
