package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013.AbstractC1035;
import p184.C2556;
import p184.InterfaceC2544;
import p285.InterfaceC3388;
import p288.C3395;

/* renamed from: androidx.lifecycle.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0251 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Class[] f1302 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final LinkedHashMap f1303;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC3388 f1304;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final LinkedHashMap f1305;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f1306;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final LinkedHashMap f1307;

    public C0251() {
        this.f1306 = new LinkedHashMap();
        this.f1303 = new LinkedHashMap();
        this.f1305 = new LinkedHashMap();
        this.f1307 = new LinkedHashMap();
        this.f1304 = new C0252(0, this);
    }

    public C0251(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1306 = linkedHashMap;
        this.f1303 = new LinkedHashMap();
        this.f1305 = new LinkedHashMap();
        this.f1307 = new LinkedHashMap();
        this.f1304 = new C0252(0, this);
        linkedHashMap.putAll(map);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Bundle m1057(C0251 c0251) {
        for (Map.Entry entry : AbstractC1035.m3986(c0251.f1303).entrySet()) {
            c0251.m1059(((InterfaceC3388) entry.getValue()).mo629(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = c0251.f1306;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return ˎˊ.ˏʾ.ʿʼ(new C3395[]{new C3395("keys", arrayList), new C3395("values", arrayList2)});
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m1058(String str) {
        LinkedHashMap linkedHashMap = this.f1306;
        try {
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            if (this.f1305.remove(str) != null) {
                throw new ClassCastException();
            }
            this.f1307.remove(str);
            return null;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1059(Object obj, String str) {
        if (obj != null) {
            Class[] clsArr = f1302;
            for (int i = 0; i < 29; i++) {
                if (!clsArr[i].isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f1305.get(str);
        C0259 c0259 = obj2 instanceof C0259 ? (C0259) obj2 : null;
        if (c0259 != null) {
            c0259.m1044(obj);
        } else {
            this.f1306.put(str, obj);
        }
        InterfaceC2544 interfaceC2544 = (InterfaceC2544) this.f1307.get(str);
        if (interfaceC2544 == null) {
            return;
        }
        ((C2556) interfaceC2544).m6675(obj);
    }
}
