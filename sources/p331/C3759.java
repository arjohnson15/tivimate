package p331;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0104;
import androidx.lifecycle.AbstractC0233;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.ComponentCallbacks2C0294;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.InterfaceC0485;
import com.google.android.gms.internal.measurement.InterfaceC0489;
import com.hierynomus.security.SecurityException;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p009.C0984;
import p009.C0989;
import p013.AbstractC1041;
import p035.C1236;
import p061.C1389;
import p065.AbstractC1484;
import p065.AbstractC1502;
import p065.C1529;
import p070.AbstractC1549;
import p076.C1665;
import p137.InterfaceC2105;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2431;
import p182.AbstractC2517;
import p182.C2526;
import p182.InterfaceC2525;
import p188.C2639;
import p188.InterfaceC2618;
import p200.C2755;
import p225.C3024;
import p225.LayoutInflaterFactory2C3017;
import p251.C3130;
import p251.C3136;
import p251.InterfaceC3135;
import p254.C3175;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p278.AbstractC3362;
import p320.MenuC3643;
import p320.MenuC3664;
import p329.AbstractC3742;
import p329.C3732;
import p341.C3880;
import p341.C3882;
import p341.C3898;
import p341.InterfaceC3904;
import p362.C4108;
import p362.C4123;
import p362.C4128;
import p362.InterfaceC4118;
import p366.C4143;
import p366.C4155;
import p374.C4296;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4361;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;
import p409.InterfaceC4675;
import p414.C4737;
import p415.C4742;
import p421.C4861;
import p428.C4927;
import p428.CallableC4922;
import p435.C5061;
import p456.C5255;
import p456.C5349;
import ˈˉ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ˏᵢ.ᵢٴ;
import ـˈ.ˎـ;
import ᵔʼ.ˑʽ;
import ﹶˋ.ـﹶ;

/* renamed from: ᴵﹳ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3759 implements InterfaceC0485, InterfaceC4675, InterfaceC2618, InterfaceC2525, InterfaceC3904, InterfaceC4118, InterfaceC3135 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f14522;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f14523;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14524;

    public C3759(byte b, int i) {
        this.f14524 = i;
        switch (i) {
            case 4:
                this.f14522 = new SparseIntArray();
                this.f14523 = new SparseIntArray();
                break;
            case 12:
                this.f14522 = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f14523 = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 17:
                this.f14522 = new Object();
                this.f14523 = new LinkedHashMap();
                break;
            default:
                this.f14522 = new ArrayList();
                this.f14523 = new HashMap();
                break;
        }
    }

    public C3759(int i) {
        this.f14524 = 15;
        C4108 c4108 = new C4108(i, 0);
        C4108 c41082 = new C4108(i, 1);
        this.f14522 = c4108;
        this.f14523 = c41082;
    }

    public /* synthetic */ C3759(int i, Object obj, Object obj2, boolean z) {
        this.f14524 = i;
        this.f14523 = obj;
        this.f14522 = obj2;
    }

    public C3759(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14524 = 13;
        this.f14522 = cryptoInfo;
        this.f14523 = ˎـ.ٴˎ();
    }

    public C3759(WorkDatabase_Impl workDatabase_Impl) {
        this.f14524 = 0;
        this.f14522 = workDatabase_Impl;
        this.f14523 = new C3757(workDatabase_Impl, 6);
        new C3766(workDatabase_Impl, 20);
    }

    public /* synthetic */ C3759(Object obj, int i, Object obj2) {
        this.f14524 = i;
        this.f14522 = obj;
        this.f14523 = obj2;
    }

    public C3759(String str) throws SecurityException {
        this.f14524 = 6;
        this.f14522 = str;
        try {
            this.f14523 = Mac.getInstance(str);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new SecurityException(e);
        }
    }

    public C3759(AbstractC1484 abstractC1484) {
        this.f14524 = 5;
        this.f14522 = abstractC1484;
        this.f14523 = Collections.newSetFromMap(new IdentityHashMap());
    }

    public C3759(C3880 c3880) {
        this.f14524 = 14;
        this.f14523 = c3880;
        this.f14522 = new C2324(4, new byte[4]);
    }

    public C3759(ˑʽ r2) {
        this.f14524 = 2;
        this.f14522 = new HashMap();
        this.f14523 = r2;
    }

    public C3759(C5255 c5255) {
        this.f14524 = 20;
        this.f14523 = c5255;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static C3759 m8745(String... strArr) {
        try {
            C4155[] c4155Arr = new C4155[strArr.length];
            C4143 c4143 = new C4143();
            for (int i = 0; i < strArr.length; i++) {
                C5061.m11218(c4143, strArr[i]);
                c4143.readByte();
                c4155Arr[i] = c4143.mo9522(c4143.f16041);
            }
            return new C3759((String[]) strArr.clone(), 19, AbstractC3362.m8189(c4155Arr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m8746(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public String toString() {
        switch (this.f14524) {
            case 16:
                return "Bounds{lower=" + ((C4861) this.f14522) + " upper=" + ((C4861) this.f14523) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ʽᐧ */
    public void mo6778(byte[] bArr) throws IllegalStateException {
        ((Mac) this.f14523).update(bArr);
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ʿʼ */
    public void mo6779(byte[] bArr, int i, int i2) throws IllegalStateException {
        ((Mac) this.f14523).update(bArr, i, i2);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public InterfaceC3178 m8747(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f14522;
            if (i2 >= iArr.length) {
                AbstractC4464.m10134("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new C3175();
            }
            if (i == iArr[i2]) {
                return ((C4296[]) this.f14523)[i2];
            }
            i2++;
        }
    }

    @Override // p362.InterfaceC4118
    /* renamed from: ˉⁱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C1665 mo4055(C4123 c4123) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        C4128 c4128;
        int i;
        C1665 c1665;
        String str = c4123.f15926.f15902;
        C1665 c16652 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C2431 c2431 = c4123.f15925;
                int i2 = AbstractC4470.f17202;
                if (i2 >= 34 && (i2 >= 35 || AbstractC2435.m6552(c2431.f9667))) {
                    c4128 = new ᵢٴ(17, mediaCodecCreateByCodecName);
                    i = 4;
                } else {
                    c4128 = new C4128(mediaCodecCreateByCodecName, (HandlerThread) ((C4108) this.f14523).get());
                    i = 0;
                }
                c1665 = new C1665(mediaCodecCreateByCodecName, (HandlerThread) ((C4108) this.f14522).get(), c4128);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                C1665.m5340(c1665, c4123.f15923, c4123.f15927, c4123.f15924, i);
                return c1665;
            } catch (Exception e2) {
                e = e2;
                c16652 = c1665;
                if (c16652 != null) {
                    c16652.mo5342();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ˏᵢ.ˏᴵ] */
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m8749(AbstractC2517 abstractC2517) {
        ـﹶ r0 = (ـﹶ) this.f14522;
        ((ActionMode.Callback) r0.ˎˑ).onDestroyActionMode(r0.ˉⁱ(abstractC2517));
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) this.f14523;
        if (layoutInflaterFactory2C3017.f11625 != null) {
            layoutInflaterFactory2C3017.f11616.getDecorView().removeCallbacks(layoutInflaterFactory2C3017.f11640);
        }
        if (layoutInflaterFactory2C3017.f11623 != null) {
            C4361 c4361 = layoutInflaterFactory2C3017.f11618;
            if (c4361 != null) {
                c4361.m9938();
            }
            C4361 c4361M9885 = AbstractC4345.m9885(layoutInflaterFactory2C3017.f11623);
            c4361M9885.m9941(0.0f);
            layoutInflaterFactory2C3017.f11618 = c4361M9885;
            c4361M9885.m9942(new C3024(2, this));
        }
        layoutInflaterFactory2C3017.f11631.onSupportActionModeFinished(layoutInflaterFactory2C3017.f11656);
        layoutInflaterFactory2C3017.f11656 = null;
        ViewGroup viewGroup = layoutInflaterFactory2C3017.f11652;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(viewGroup);
        layoutInflaterFactory2C3017.m7467();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public synchronized List m8750(String str) {
        List arrayList;
        if (!((ArrayList) this.f14522).contains(str)) {
            ((ArrayList) this.f14522).add(str);
        }
        arrayList = (List) ((HashMap) this.f14523).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.f14523).put(str, arrayList);
        }
        return arrayList;
    }

    @Override // p251.InterfaceC3135
    /* renamed from: ˎٴ */
    public C3130 mo7701(Object obj) throws NumberFormatException, ClassNotFoundException {
        if (((C4742) obj) == null) {
            return ˏʾ.ˏᴵ((Object) null);
        }
        CallableC4922 callableC4922 = (CallableC4922) this.f14523;
        C4927.m11040((C4927) ((C5349) callableC4922.f18603).f20757);
        C5349 c5349 = (C5349) callableC4922.f18603;
        ((C4927) c5349.f20757).f18637.m9794((ExecutorService) this.f14522, null);
        ((C4927) c5349.f20757).f18647.m7702(null);
        return ˏʾ.ˏᴵ((Object) null);
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ˏʾ */
    public void mo6780(byte[] bArr) throws InvalidKeyException, SecurityException {
        try {
            ((Mac) this.f14523).init(new SecretKeySpec(bArr, (String) this.f14522));
        } catch (InvalidKeyException e) {
            throw new SecurityException(e);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public ComponentCallbacks2C0294 m8751(Context context, ComponentCallbacks2C0283 componentCallbacks2C0283, AbstractC0233 abstractC0233, AbstractC0104 abstractC0104, boolean z) {
        AbstractC3742.m8713();
        AbstractC3742.m8713();
        HashMap map = (HashMap) this.f14522;
        ComponentCallbacks2C0294 componentCallbacks2C0294 = (ComponentCallbacks2C0294) map.get(abstractC0233);
        if (componentCallbacks2C0294 != null) {
            return componentCallbacks2C0294;
        }
        C0989 c0989 = new C0989(abstractC0233);
        ﹳﹳ r2 = new ﹳﹳ(this, abstractC0104);
        ((ˑʽ) this.f14523).getClass();
        ComponentCallbacks2C0294 componentCallbacks2C02942 = new ComponentCallbacks2C0294(componentCallbacks2C0283, c0989, r2, context);
        map.put(abstractC0233, componentCallbacks2C02942);
        c0989.mo3952(new C0984(this, abstractC0233));
        if (z) {
            componentCallbacks2C02942.mo1559();
        }
        return componentCallbacks2C02942;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0485
    /* renamed from: ˏᵢ */
    public ـﹶ mo2292(InterfaceC0489 interfaceC0489) {
        ـﹶ r0 = ((ـﹶ) this.f14522).ﹳˑ();
        r0.ˈٴ((String) this.f14523, interfaceC0489);
        return r0;
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ˑʽ */
    public byte[] mo6781() {
        return ((Mac) this.f14523).doFinal();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public synchronized ArrayList m8752(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f14522).iterator();
        while (it.hasNext()) {
            List<C1236> list = (List) ((HashMap) this.f14523).get((String) it.next());
            if (list != null) {
                for (C1236 c1236 : list) {
                    if ((c1236.f5052.isAssignableFrom(cls) && cls2.isAssignableFrom(c1236.f5050)) && !arrayList.contains(c1236.f5050)) {
                        arrayList.add(c1236.f5050);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public C4737 m8753(C3760 c3760) {
        C4737 c4737;
        synchronized (this.f14522) {
            c4737 = (C4737) ((LinkedHashMap) this.f14523).remove(c3760);
        }
        return c4737;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m8754(C3760 c3760) {
        boolean zContainsKey;
        synchronized (this.f14522) {
            zContainsKey = ((LinkedHashMap) this.f14523).containsKey(c3760);
        }
        return zContainsKey;
    }

    @Override // p341.InterfaceC3904
    /* renamed from: ٴˎ */
    public void mo4798(C4457 c4457) {
        C3880 c3880;
        if (c4457.m10086() == 0 && (c4457.m10086() & 128) != 0) {
            c4457.m10085(6);
            int iM10096 = c4457.m10096() / 4;
            int i = 0;
            while (true) {
                c3880 = (C3880) this.f14523;
                if (i >= iM10096) {
                    break;
                }
                C2324 c2324 = (C2324) this.f14522;
                c4457.m10097(c2324.f9219, 0, 4);
                c2324.m6407(0);
                int iM6410 = c2324.m6410(16);
                c2324.m6408(3);
                if (iM6410 == 0) {
                    c2324.m6408(13);
                } else {
                    int iM64102 = c2324.m6410(13);
                    if (c3880.f14937.get(iM64102) == null) {
                        c3880.f14937.put(iM64102, new C3882(new C1389(c3880, iM64102)));
                        c3880.f14925++;
                    }
                }
                i++;
            }
            if (c3880.f14929 != 2) {
                c3880.f14937.remove(0);
            }
        }
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ᐧʻ */
    public void mo6782(byte b) throws IllegalStateException {
        ((Mac) this.f14523).update(b);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public void m8755(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f14522)) {
            map = new HashMap((Map) this.f14522);
        }
        synchronized (((Map) this.f14523)) {
            map2 = new HashMap((Map) this.f14523);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3136) entry2.getKey()).m7703(new ApiException(status));
            }
        }
    }

    @Override // p188.InterfaceC2618
    /* renamed from: ᴵʿ */
    public void mo6792() {
        C2639 c2639 = (C2639) this.f14522;
        synchronized (c2639) {
            c2639.f10449 = c2639.f10451.length;
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public ArrayList m8756(String str) {
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14522;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5052.getCount());
            while (cursorM5052.moveToNext()) {
                arrayList.add(cursorM5052.getString(0));
            }
            return arrayList;
        } finally {
            cursorM5052.close();
            c1529M5069.m5111();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public void m8757() {
        ((SparseIntArray) this.f14522).clear();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public C4737 m8758(C3760 c3760) {
        C4737 c4737;
        synchronized (this.f14522) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f14523;
                Object c47372 = linkedHashMap.get(c3760);
                if (c47372 == null) {
                    c47372 = new C4737(c3760);
                    linkedHashMap.put(c3760, c47372);
                }
                c4737 = (C4737) c47372;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4737;
    }

    @Override // p341.InterfaceC3904
    /* renamed from: ﹳﹳ */
    public void mo4801(C4458 c4458, InterfaceC3177 interfaceC3177, C3898 c3898) {
    }

    @Override // p188.InterfaceC2618
    /* renamed from: ﹶˆ */
    public void mo6793(Bitmap bitmap, InterfaceC2105 interfaceC2105) throws IOException {
        IOException iOException = ((C3732) this.f14523).f14484;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC2105.mo5961(bitmap);
            throw iOException;
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public List m8759(String str) {
        List listM4016;
        synchronized (this.f14522) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f14523;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (AbstractC1549.m5138(((C3760) entry.getKey()).f14526, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f14523).remove((C3760) it.next());
                }
                listM4016 = AbstractC1041.m4016(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listM4016;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean m8760(AbstractC2517 abstractC2517, MenuC3643 menuC3643) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C3017) this.f14523).f11652;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(viewGroup);
        ـﹶ r0 = (ـﹶ) this.f14522;
        C2526 c2526 = r0.ˉⁱ(abstractC2517);
        C2755 c2755 = (C2755) r0.ˆᵔ;
        Menu menuC3664 = (Menu) c2755.get(menuC3643);
        if (menuC3664 == null) {
            menuC3664 = new MenuC3664((Context) r0.ᐧˋ, menuC3643);
            c2755.put(menuC3643, menuC3664);
        }
        return ((ActionMode.Callback) r0.ˎˑ).onPrepareActionMode(c2526, menuC3664);
    }
}
