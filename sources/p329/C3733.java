package p329;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ᴵᵢ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3733 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f14486;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f14487;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f14488 = new LinkedHashMap(100, 0.75f, true);

    public C3733(long j) {
        this.f14486 = j;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int mo8698(Object obj) {
        return 1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m8699(long j) {
        while (this.f14487 > j) {
            Iterator it = this.f14488.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C3744 c3744 = (C3744) entry.getValue();
            this.f14487 -= c3744.f14506;
            Object key = entry.getKey();
            it.remove();
            mo3730(key, c3744.f14507);
        }
    }

    /* renamed from: ˑʽ */
    public void mo3730(Object obj, Object obj2) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized Object m8700(Object obj) {
        C3744 c3744;
        c3744 = (C3744) this.f14488.get(obj);
        return c3744 != null ? c3744.f14507 : null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized Object m8701(Object obj, Object obj2) {
        int iMo8698 = mo8698(obj2);
        long j = iMo8698;
        if (j >= this.f14486) {
            mo3730(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f14487 += j;
        }
        C3744 c3744 = (C3744) this.f14488.put(obj, obj2 == null ? null : new C3744(iMo8698, obj2));
        if (c3744 != null) {
            this.f14487 -= c3744.f14506;
            if (!c3744.f14507.equals(obj2)) {
                mo3730(obj, c3744.f14507);
            }
        }
        m8699(this.f14486);
        return c3744 != null ? c3744.f14507 : null;
    }
}
