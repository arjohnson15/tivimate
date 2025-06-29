package p331;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.AbstractC0543;
import com.google.android.gms.internal.measurement.C0384;
import com.google.android.gms.internal.measurement.C0420;
import com.google.android.gms.internal.measurement.C0423;
import com.google.android.gms.internal.measurement.C0477;
import com.google.android.gms.internal.measurement.InterfaceC0489;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0589;
import com.google.android.gms.internal.play_billing.C0590;
import com.google.android.gms.internal.play_billing.C0607;
import com.google.android.gms.internal.play_billing.C0611;
import com.google.android.gms.internal.play_billing.C0650;
import com.hierynomus.smbj.paths.PathResolveException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.lsposed.hiddenapibypass.library.R;
import p000.C0866;
import p000.C0876;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p022.InterfaceC1133;
import p023.C1147;
import p033.C1212;
import p046.C1303;
import p055.InterfaceC1332;
import p061.AbstractC1375;
import p061.C1421;
import p065.AbstractC1502;
import p065.C1529;
import p076.InterfaceC1668;
import p078.AbstractC1685;
import p078.AbstractC1693;
import p078.C1692;
import p078.C1696;
import p078.InterfaceC1682;
import p080.AbstractC1702;
import p080.C1699;
import p080.C1703;
import p082.AbstractC1710;
import p123.C1998;
import p135.C2094;
import p141.C2208;
import p141.RunnableC2187;
import p143.C2227;
import p149.AbstractC2293;
import p166.C2428;
import p180.AbstractC2497;
import p181.InterfaceC2506;
import p183.C2531;
import p200.AbstractC2746;
import p200.C2742;
import p200.C2755;
import p246.C3117;
import p260.C3222;
import p304.C3521;
import p314.C3598;
import p314.InterfaceC3594;
import p329.AbstractC3742;
import p329.C3733;
import p334.C3789;
import p345.AbstractC3980;
import p345.C3932;
import p368.C4178;
import p396.C4580;
import p396.C4586;
import p396.InterfaceC4576;
import p396.InterfaceC4591;
import p408.C4672;
import p417.AbstractC4753;
import p446.InterfaceC5161;
import ʾי.ˑʽ;
import ˆʽ.ᵎˏ;
import ـˊ.ʿʼ;
import ᵎﹳ.ᐧʻ;
import ᵔᵔ.ٴˎ;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: ᴵﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3767 implements InterfaceC0864, InterfaceC1668, InterfaceC1332, InterfaceC2506, InterfaceC4576 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f14557;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f14558;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14559;

    public C3767(int i) {
        this.f14559 = i;
        switch (i) {
            case 5:
                this.f14557 = new C2755(0);
                this.f14558 = new C2742();
                break;
            case 11:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14557 = byteArrayOutputStream;
                this.f14558 = new DataOutputStream(byteArrayOutputStream);
                break;
            case 13:
                this.f14557 = new ReentrantLock();
                this.f14558 = new HashMap();
                break;
            case 16:
                this.f14557 = new C3733(1000L);
                this.f14558 = AbstractC1710.m5426(10, new ʿʼ(5));
                break;
            case 19:
                this.f14557 = new AtomicInteger();
                this.f14558 = new AtomicInteger();
                break;
            default:
                this.f14557 = new TreeMap();
                this.f14558 = new TreeMap();
                break;
        }
    }

    public /* synthetic */ C3767(int i, Object obj) {
        this.f14559 = i;
        this.f14558 = null;
        this.f14557 = obj;
    }

    public /* synthetic */ C3767(int i, boolean z) {
        this.f14559 = i;
    }

    public C3767(Animator animator) {
        this.f14559 = 12;
        this.f14557 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14558 = animatorSet;
        animatorSet.play(animator);
    }

    public C3767(Context context, int i) {
        this.f14559 = i;
        switch (i) {
            case 18:
                AbstractC4753.m10683(context);
                Resources resources = context.getResources();
                this.f14557 = resources;
                this.f14558 = resources.getResourcePackageName(R.string._2_res_0x7f130077);
                break;
            default:
                this.f14557 = context;
                break;
        }
    }

    public C3767(Context context, C0650 c0650) {
        this.f14559 = 9;
        C2428 c2428 = new C2428();
        try {
            C1998.m5647(context);
            c2428.f9649 = C1998.m5648().m5649(C2094.f8273).m5652("PLAY_BILLING_LIBRARY", new C2531("proto"), new ٴˎ(23));
        } catch (Throwable unused) {
            c2428.f9650 = true;
        }
        this.f14558 = c2428;
        this.f14557 = c0650;
    }

    public C3767(Context context, InterfaceC0864 interfaceC0864) {
        this.f14559 = 2;
        this.f14557 = context.getApplicationContext();
        this.f14558 = interfaceC0864;
    }

    public C3767(WorkDatabase_Impl workDatabase_Impl) {
        this.f14559 = 0;
        this.f14557 = workDatabase_Impl;
        this.f14558 = new C3757(workDatabase_Impl, 0);
    }

    public /* synthetic */ C3767(Object obj, int i, Object obj2) {
        this.f14559 = i;
        this.f14557 = obj;
        this.f14558 = obj2;
    }

    public C3767(C1699 c1699) {
        this.f14559 = 6;
        this.f14558 = c1699;
    }

    public C3767(C2208 c2208, C3932 c3932) {
        this.f14559 = 8;
        this.f14557 = c2208;
        this.f14558 = AbstractC3980.m9209(c3932);
    }

    public C3767(C4580 c4580, InterfaceC4576 interfaceC4576) {
        this.f14559 = 17;
        this.f14558 = c4580;
        this.f14557 = interfaceC4576;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C1303 m8799(ImageDecoder.Source source, int i, int i2, C3598 c3598) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C3521(i, i2, c3598));
        if (AbstractC2293.m6340(drawableDecodeDrawable)) {
            return new C1303(2, AbstractC2293.m6324(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public String toString() {
        switch (this.f14559) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                String string = "[ ";
                if (((C1703) this.f14557) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM5407 = AbstractC1702.m5407(string);
                        sbM5407.append(((C1703) this.f14557).f6657[i]);
                        sbM5407.append(" ");
                        string = sbM5407.toString();
                    }
                }
                StringBuilder sbM5409 = AbstractC1702.m5409(string, "] ");
                sbM5409.append((C1703) this.f14557);
                return sbM5409.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m8800(AbstractC1375 abstractC1375, C1212 c1212) {
        C2755 c2755 = (C2755) this.f14557;
        C1421 c1421M4922 = (C1421) c2755.get(abstractC1375);
        if (c1421M4922 == null) {
            c1421M4922 = C1421.m4922();
            c2755.put(abstractC1375, c1421M4922);
        }
        c1421M4922.f5790 = c1212;
        c1421M4922.f5791 |= 8;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte[] m8801(C3117 c3117) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14557;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14558;
        try {
            dataOutputStream.writeBytes(c3117.f12019);
            dataOutputStream.writeByte(0);
            String str = c3117.f12015;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c3117.f12017);
            dataOutputStream.writeLong(c3117.f12018);
            dataOutputStream.write(c3117.f12016);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p076.InterfaceC1668
    /* renamed from: ʿˏ */
    public Object mo5358(Uri uri, C0876 c0876) {
        InterfaceC1133 interfaceC1133 = (InterfaceC1133) ((InterfaceC1668) this.f14557).mo5358(uri, c0876);
        List list = (List) this.f14558;
        return (list == null || list.isEmpty()) ? interfaceC1133 : (InterfaceC1133) interfaceC1133.mo4158(list);
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ˉי */
    public void mo7069(Throwable th) {
        ((C4580) this.f14558).f17527.execute(new RunnableC2187(this, (InterfaceC4576) this.f14557, th, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory m8802(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3767.m8802(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m8803(C0611 c0611) {
        if (c0611 == null) {
            return;
        }
        try {
            C0589 c0589M2605 = C0607.m2605();
            C0650 c0650 = (C0650) this.f14557;
            c0589M2605.m2578();
            C0607.m2603((C0607) c0589M2605.f2966, c0650);
            c0589M2605.m2578();
            C0607.m2606((C0607) c0589M2605.f2966, c0611);
            ((C2428) this.f14558).m6530((C0607) c0589M2605.m2577());
        } catch (Throwable th) {
            AbstractC0629.m2647("BillingLogger", "Unable to log.", th);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ArrayList m8804(String str) {
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14557;
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

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public void m8805(AbstractC1375 abstractC1375) {
        C1421 c1421 = (C1421) ((C2755) this.f14557).get(abstractC1375);
        if (c1421 == null) {
            return;
        }
        c1421.f5791 &= -2;
    }

    @Override // p055.InterfaceC1332
    /* renamed from: ˏʾ */
    public C4672 mo4643(C2227 c2227, C4672 c4672) {
        ((ٴˎ) this.f14557).getClass();
        return c4672;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public String m8806(String str) {
        String str2 = (String) this.f14558;
        Resources resources = (Resources) this.f14557;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p000.InterfaceC0864
    /* renamed from: ˏᵢ */
    public InterfaceC0875 mo900() {
        return new C0866((Context) this.f14557, ((InterfaceC0864) this.f14558).mo900());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String m8807(InterfaceC3594 interfaceC3594) {
        String str;
        C4178 c4178 = (C4178) ((C3222) this.f14558).m7947();
        try {
            interfaceC3594.mo3713(c4178.f16124);
            byte[] bArrDigest = c4178.f16124.digest();
            char[] cArr = AbstractC3742.f14501;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = AbstractC3742.f14503;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((C3222) this.f14558).m7946(c4178);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m8808(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ﹶˆ r0 = "clx".equals(bundle2.getString("_o")) ? (ﹶˆ) this.f14557 : (ˑʽ) this.f14558;
            if (r0 == null) {
                return;
            }
            r0.m3703(string, bundle2);
        }
    }

    @Override // p055.InterfaceC1332
    /* renamed from: ـﹶ */
    public C4672 mo4644(C2227 c2227, AbstractC1685 abstractC1685, C4672 c4672) throws PathResolveException {
        C1692 c1692;
        String str;
        if (((C1696) abstractC1685.ᵢʿ()).f6598 != 2147483693L) {
            ((ٴˎ) this.f14557).getClass();
            return c4672;
        }
        C1147 c1147 = abstractC1685.f6560;
        if (c1147 != null) {
            Iterator it = c1147.f4789.iterator();
            while (it.hasNext()) {
                InterfaceC1682 interfaceC1682 = (InterfaceC1682) it.next();
                if (interfaceC1682 instanceof C1692) {
                    c1692 = (C1692) interfaceC1682;
                    break;
                }
            }
            c1692 = null;
        } else {
            c1692 = null;
        }
        if (c1692 == null) {
            throw new PathResolveException("Create failed for " + c4672 + ": missing symlink data", ((C1696) abstractC1685.ᵢʿ()).f6598);
        }
        String str2 = c4672.f17809;
        int i = c1692.f6589;
        byte[] bytes = AbstractC1693.f6592;
        byte[] bytes2 = str2 == null ? bytes : str2.getBytes(AbstractC2497.f9929);
        int length = bytes2.length - i;
        Charset charset = AbstractC2497.f9929;
        String str3 = new String(bytes2, length, i, charset);
        String str4 = c1692.f6590;
        if (c1692.f6591) {
            str = ᐧʻ.ˉⁱ(str4, str3);
        } else {
            if (str2 != null) {
                bytes = str2.getBytes(charset);
            }
            String str5 = new String(bytes, 0, bytes.length - i, charset);
            StringBuilder sb = new StringBuilder();
            int iLastIndexOf = str5.lastIndexOf("\\");
            if (iLastIndexOf != -1) {
                sb.append((CharSequence) str5, 0, iLastIndexOf);
                sb.append('\\');
            }
            str = ᵎˏ.ˎٴ(sb, str4, str3);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(92, i2);
            if (iIndexOf == -1) {
                break;
            }
            arrayList.add(str.substring(i2, iIndexOf));
            i2 = iIndexOf + 1;
        }
        arrayList.add(str.substring(i2));
        int i3 = 0;
        while (i3 < arrayList.size()) {
            String str6 = (String) arrayList.get(i3);
            if (".".equals(str6)) {
                arrayList.remove(i3);
            } else if ("..".equals(str6)) {
                if (i3 > 0) {
                    arrayList.remove(i3);
                    i3--;
                }
                arrayList.remove(i3);
            } else {
                i3++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (i4 > 0) {
                sb2.append('\\');
            }
            sb2.append((String) arrayList.get(i4));
        }
        return new C4672(c4672.f17810, c4672.f17808, sb2.toString());
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ٴˎ */
    public void mo7070(InterfaceC4591 interfaceC4591, C4586 c4586) {
        ((C4580) this.f14558).f17527.execute(new RunnableC2187(this, (InterfaceC4576) this.f14557, c4586, 7));
    }

    @Override // p055.InterfaceC1332
    /* renamed from: ᐧʻ */
    public InterfaceC5161 mo4645() {
        return (ˉי) this.f14558;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public String m8809(InterfaceC3594 interfaceC3594) {
        String strM8807;
        synchronized (((C3733) this.f14557)) {
            strM8807 = (String) ((C3733) this.f14557).m8700(interfaceC3594);
        }
        if (strM8807 == null) {
            strM8807 = m8807(interfaceC3594);
        }
        synchronized (((C3733) this.f14557)) {
            ((C3733) this.f14557).m8701(interfaceC3594, strM8807);
        }
        return strM8807;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m8810(AbstractC1375 abstractC1375) {
        C2742 c2742 = (C2742) this.f14558;
        int iM6965 = c2742.m6965() - 1;
        while (true) {
            if (iM6965 < 0) {
                break;
            }
            if (abstractC1375 == c2742.m6969(iM6965)) {
                Object[] objArr = c2742.f10724;
                Object obj = objArr[iM6965];
                Object obj2 = AbstractC2746.f10741;
                if (obj != obj2) {
                    objArr[iM6965] = obj2;
                    c2742.f10726 = true;
                }
            } else {
                iM6965--;
            }
        }
        C1421 c1421 = (C1421) ((C2755) this.f14557).remove(abstractC1375);
        if (c1421 != null) {
            c1421.f5791 = 0;
            c1421.f5789 = null;
            c1421.f5790 = null;
            C1421.f5788.mo5418(c1421);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C1212 m8811(AbstractC1375 abstractC1375, int i) {
        C1421 c1421;
        C1212 c1212;
        C2755 c2755 = (C2755) this.f14557;
        int iM7014 = c2755.m7014(abstractC1375);
        if (iM7014 >= 0 && (c1421 = (C1421) c2755.m7016(iM7014)) != null) {
            int i2 = c1421.f5791;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c1421.f5791 = i3;
                if (i == 4) {
                    c1212 = c1421.f5789;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c1212 = c1421.f5790;
                }
                if ((i3 & 12) == 0) {
                    c2755.mo7022(iM7014);
                    c1421.f5791 = 0;
                    c1421.f5789 = null;
                    c1421.f5790 = null;
                    C1421.f5788.mo5418(c1421);
                }
                return c1212;
            }
        }
        return null;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public void m8812(Long l) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f14557;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C2227 m8813(Long l) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f14557;
        reentrantLock.lock();
        try {
            return (C2227) ((HashMap) this.f14558).get(l);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public void m8814(C0590 c0590) {
        if (c0590 == null) {
            return;
        }
        try {
            C0589 c0589M2605 = C0607.m2605();
            C0650 c0650 = (C0650) this.f14557;
            c0589M2605.m2578();
            C0607.m2603((C0607) c0589M2605.f2966, c0650);
            c0589M2605.m2578();
            C0607.m2604((C0607) c0589M2605.f2966, c0590);
            ((C2428) this.f14558).m6530((C0607) c0589M2605.m2577());
        } catch (Throwable th) {
            AbstractC0629.m2647("BillingLogger", "Unable to log.", th);
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void m8815(ـﹶ r10, C3762 c3762) {
        C0384 c0384 = new C0384(c3762);
        TreeMap treeMap = (TreeMap) this.f14557;
        for (Integer num : treeMap.keySet()) {
            C0423 c0423 = (C0423) ((C0423) c3762.f14531).clone();
            InterfaceC0489 interfaceC0489Mo1817 = ((C0420) treeMap.get(num)).mo1817(r10, Collections.singletonList(c0384));
            int iM2441 = interfaceC0489Mo1817 instanceof C0477 ? AbstractC0543.m2441(((C0477) interfaceC0489Mo1817).f2812.doubleValue()) : -1;
            if (iM2441 == 2 || iM2441 == -1) {
                c3762.f14531 = c0423;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f14558;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0489 interfaceC0489Mo18172 = ((C0420) treeMap2.get((Integer) it.next())).mo1817(r10, Collections.singletonList(c0384));
            if (interfaceC0489Mo18172 instanceof C0477) {
                AbstractC0543.m2441(((C0477) interfaceC0489Mo18172).f2812.doubleValue());
            }
        }
    }
}
