package p036;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.leanback.widget.ﾞᐧ;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import p013.AbstractC1036;
import p013.AbstractC1052;
import p013.C1053;
import p041.C1274;
import p041.C1276;
import p041.C1281;
import p061.C1399;
import p061.C1403;
import p061.C1412;
import p080.C1704;
import p126.AbstractC2018;
import p126.InterfaceC2023;
import p158.AbstractC2339;
import p222.AbstractC2962;
import p222.C2860;
import p222.C2964;
import p276.C3355;
import p276.C3356;
import p276.C3357;
import p276.C3359;
import p276.C3360;
import p300.AbstractC3505;
import p331.C3762;
import p366.C4144;
import p366.C4149;
import p366.InterfaceC4163;
import p366.InterfaceC4168;
import p374.C4241;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p430.AbstractC4996;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5009;
import p430.C5012;
import p430.C5013;
import p430.C5014;
import p430.C5021;
import p430.EnumC5022;
import ʾי.ˑʽ;
import ˈי.ʾˈ;

/* renamed from: ʼﹶ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1262 implements InterfaceC2023 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f5175;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f5176;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f5177;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5178;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f5179;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f5180;

    public C1262(View view) {
        this.f5178 = -1;
        this.f5175 = view;
        this.f5177 = C2964.m7339();
    }

    public C1262(C1412 c1412) {
        this.f5175 = new C1704(30);
        this.f5177 = new ArrayList();
        this.f5180 = new ArrayList();
        this.f5178 = 0;
        this.f5176 = c1412;
        this.f5179 = new ˑʽ(17, this);
    }

    public C1262(C4999 c4999, C1276 c1276, C4149 c4149, C4144 c4144) {
        this.f5175 = c4999;
        this.f5177 = c1276;
        this.f5180 = c4149;
        this.f5176 = c4144;
        this.f5179 = new C1403(c4149);
    }

    public C1262(C5009 c5009, ﾞᐧ r4, C1274 c1274) {
        List listM6430;
        this.f5175 = c5009;
        this.f5177 = r4;
        C1053 c1053 = C1053.f4449;
        this.f5180 = c1053;
        this.f5176 = c1053;
        this.f5179 = new ArrayList();
        URI uriM11098 = c5009.f19004.m11098();
        if (uriM11098.getHost() == null) {
            listM6430 = AbstractC2339.m6430(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = c5009.f19008.select(uriM11098);
            List<Proxy> list = listSelect;
            listM6430 = (list == null || list.isEmpty()) ? AbstractC2339.m6430(Proxy.NO_PROXY) : AbstractC2339.m6432(listSelect);
        }
        this.f5180 = listM6430;
        this.f5178 = 0;
    }

    public C1262(int[] iArr, C4241[] c4241Arr, int[] iArr2, int[][][] iArr3, C4241 c4241) {
        this.f5175 = iArr;
        this.f5180 = c4241Arr;
        this.f5176 = iArr3;
        this.f5177 = iArr2;
        this.f5179 = c4241;
        this.f5178 = iArr.length;
    }

    @Override // p126.InterfaceC2023
    public void cancel() throws IOException {
        Socket socket = ((C1276) this.f5177).f5248;
        if (socket != null) {
            AbstractC2339.m6447(socket);
        }
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC4168 mo4489(C5021 c5021, long j) throws ProtocolException {
        AbstractC4996 abstractC4996 = c5021.f19054;
        if (abstractC4996 != null && abstractC4996.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c5021.f19051.m11104("Transfer-Encoding"))) {
            if (this.f5178 == 1) {
                this.f5178 = 2;
                return new C3355(this);
            }
            throw new IllegalStateException(("state: " + this.f5178).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f5178 == 1) {
            this.f5178 = 2;
            return new C3356(this);
        }
        throw new IllegalStateException(("state: " + this.f5178).toString());
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo4490(C5021 c5021) {
        Proxy.Type type = ((C1276) this.f5177).f5240.f19014.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c5021.f19049);
        sb.append(' ');
        C5004 c5004 = c5021.f19052;
        if (c5004.f18955 || type != Proxy.Type.HTTP) {
            String strM11090 = c5004.m11090();
            String strM11097 = c5004.m11097();
            if (strM11097 != null) {
                strM11090 = strM11090 + '?' + strM11097;
            }
            sb.append(strM11090);
        } else {
            sb.append(c5004);
        }
        sb.append(" HTTP/1.1");
        m4519(c5021.f19051, sb.toString());
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public void m4491(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM7224;
        View view = (View) this.f5175;
        Context context = view.getContext();
        int[] iArr = AbstractC3505.f13595;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        View view2 = (View) this.f5175;
        AbstractC4345.m9881(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c3762M8778.f14531, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f5178 = typedArray.getResourceId(0, -1);
                C2964 c2964 = (C2964) this.f5177;
                Context context2 = view.getContext();
                int i2 = this.f5178;
                synchronized (c2964) {
                    colorStateListM7224 = c2964.f11437.m7224(context2, i2);
                }
                if (colorStateListM7224 != null) {
                    m4499(colorStateListM7224);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC4345.m9879(view, c3762M8778.m8782(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeM7331 = AbstractC2962.m7331(typedArray.getInt(2, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC4339.m9856(view, modeM7331);
                if (i3 == 21) {
                    Drawable background = view.getBackground();
                    boolean z = (AbstractC4339.m9859(view) == null && AbstractC4339.m9865(view) == null) ? false : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
        } finally {
            c3762M8778.m8783();
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public void m4492(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1399 c1399 = (C1399) arrayList.get(i);
            c1399.f5705 = null;
            ((C1704) this.f5175).mo5418(c1399);
        }
        arrayList.clear();
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public void m4493(PorterDuff.Mode mode) {
        if (((C2860) this.f5176) == null) {
            this.f5176 = new C2860();
        }
        C2860 c2860 = (C2860) this.f5176;
        c2860.f11121 = mode;
        c2860.f11120 = true;
        m4520();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public void m4494(C1399 c1399) {
        ((ArrayList) this.f5180).add(c1399);
        int i = c1399.f5706;
        C1412 c1412 = (C1412) this.f5176;
        if (i == 1) {
            c1412.m4907(c1399.f5704, c1399.f5707);
            return;
        }
        if (i == 2) {
            int i2 = c1399.f5704;
            int i3 = c1399.f5707;
            RecyclerView recyclerView = c1412.f5765;
            recyclerView.m1319(i2, false, i3);
            recyclerView.f1698 = true;
            return;
        }
        if (i == 4) {
            c1412.m4903(c1399.f5704, c1399.f5707, c1399.f5705);
        } else if (i == 8) {
            c1412.m4902(c1399.f5704, c1399.f5707);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1399);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean m4495(int i) {
        ArrayList arrayList = (ArrayList) this.f5180;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1399 c1399 = (C1399) arrayList.get(i2);
            int i3 = c1399.f5706;
            if (i3 == 8) {
                if (m4502(c1399.f5707, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1399.f5704;
                int i5 = c1399.f5707 + i4;
                while (i4 < i5) {
                    if (m4502(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m4496() {
        m4501();
        ArrayList arrayList = (ArrayList) this.f5177;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1399 c1399 = (C1399) arrayList.get(i);
            int i2 = c1399.f5706;
            C1412 c1412 = (C1412) this.f5176;
            if (i2 == 1) {
                c1412.m4904(c1399);
                c1412.m4907(c1399.f5704, c1399.f5707);
            } else if (i2 == 2) {
                c1412.m4904(c1399);
                int i3 = c1399.f5704;
                int i4 = c1399.f5707;
                RecyclerView recyclerView = c1412.f5765;
                recyclerView.m1319(i3, true, i4);
                recyclerView.f1698 = true;
                recyclerView.f1705.f5828 += i4;
            } else if (i2 == 4) {
                c1412.m4904(c1399);
                c1412.m4903(c1399.f5704, c1399.f5707, c1399.f5705);
            } else if (i2 == 8) {
                c1412.m4904(c1399);
                c1412.m4902(c1399.f5704, c1399.f5707);
            }
        }
        m4492(arrayList);
        this.f5178 = 0;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C3360 m4497(long j) {
        if (this.f5178 == 4) {
            this.f5178 = 5;
            return new C3360(this, j);
        }
        throw new IllegalStateException(("state: " + this.f5178).toString());
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m4498(C1399 c1399) {
        int i;
        int i2 = c1399.f5706;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4515 = m4515(c1399.f5704, i2);
        int i3 = c1399.f5704;
        int i4 = c1399.f5706;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1399);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c1399.f5707; i6++) {
            int iM45152 = m4515((i * i6) + c1399.f5704, c1399.f5706);
            int i7 = c1399.f5706;
            if (i7 == 2 ? iM45152 != iM4515 : !(i7 == 4 && iM45152 == iM4515 + 1)) {
                C1399 c1399M4521 = m4521(c1399.f5705, i7, iM4515, i5);
                m4512(c1399M4521, i3);
                c1399M4521.f5705 = null;
                ((C1704) this.f5175).mo5418(c1399M4521);
                if (c1399.f5706 == 4) {
                    i3 += i5;
                }
                iM4515 = iM45152;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = c1399.f5705;
        c1399.f5705 = null;
        ((C1704) this.f5175).mo5418(c1399);
        if (i5 > 0) {
            C1399 c1399M45212 = m4521(obj, c1399.f5706, iM4515, i5);
            m4512(c1399M45212, i3);
            c1399M45212.f5705 = null;
            ((C1704) this.f5175).mo5418(c1399M45212);
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public void m4499(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C2860) this.f5180) == null) {
                this.f5180 = new C2860();
            }
            C2860 c2860 = (C2860) this.f5180;
            c2860.f11119 = colorStateList;
            c2860.f11118 = true;
        } else {
            this.f5180 = null;
        }
        m4520();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int m4500(int i, int i2, int i3) {
        return ((int[][][]) this.f5176)[i][i2][i3] & 7;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m4501() {
        ArrayList arrayList = (ArrayList) this.f5180;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1412) this.f5176).m4904((C1399) arrayList.get(i));
        }
        m4492(arrayList);
        this.f5178 = 0;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int m4502(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f5180;
        int size = arrayList.size();
        while (i2 < size) {
            C1399 c1399 = (C1399) arrayList.get(i2);
            int i3 = c1399.f5706;
            if (i3 == 8) {
                int i4 = c1399.f5704;
                if (i4 == i) {
                    i = c1399.f5707;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1399.f5707 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1399.f5704;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1399.f5707;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1399.f5707;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1276 mo4503() {
        return (C1276) this.f5177;
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo4504() {
        ((C4144) this.f5176).flush();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public ColorStateList m4505() {
        C2860 c2860 = (C2860) this.f5176;
        if (c2860 != null) {
            return (ColorStateList) c2860.f11119;
        }
        return null;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public void m4506() {
        this.f5178 = -1;
        m4499(null);
        m4520();
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long mo4507(C4994 c4994) {
        if (!AbstractC2018.m5660(c4994)) {
            return 0L;
        }
        String strM11104 = c4994.f18889.m11104("Transfer-Encoding");
        if (strM11104 == null) {
            strM11104 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11104)) {
            return -1L;
        }
        return AbstractC2339.m6448(c4994);
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5013 mo4508(boolean z) throws IOException {
        C1403 c1403 = (C1403) this.f5179;
        int i = this.f5178;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f5178).toString());
        }
        try {
            String strM9549 = ((C4149) c1403.f5733).m9549(c1403.f5732);
            c1403.f5732 -= strM9549.length();
            ᐧʻ r1 = ʾˈ.ˋⁱ(strM9549);
            int i2 = r1.ˆʿ;
            C5013 c5013 = new C5013();
            c5013.f19017 = (EnumC5022) r1.ˎˑ;
            c5013.f19024 = i2;
            c5013.f19028 = (String) r1.ᐧˋ;
            c5013.f19026 = c1403.m4871().m11106();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f5178 = 3;
                return c5013;
            }
            if (102 > i2 || i2 >= 200) {
                this.f5178 = 4;
                return c5013;
            }
            this.f5178 = 3;
            return c5013;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((C1276) this.f5177).f5240.f19016.f19004.m11092()), e);
        }
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC4163 mo4509(C4994 c4994) {
        if (!AbstractC2018.m5660(c4994)) {
            return m4497(0L);
        }
        String strM11104 = c4994.f18889.m11104("Transfer-Encoding");
        if (strM11104 == null) {
            strM11104 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11104)) {
            C5004 c5004 = c4994.f18887.f19052;
            if (this.f5178 == 4) {
                this.f5178 = 5;
                return new C3357(this, c5004);
            }
            throw new IllegalStateException(("state: " + this.f5178).toString());
        }
        long jM6448 = AbstractC2339.m6448(c4994);
        if (jM6448 != -1) {
            return m4497(jM6448);
        }
        if (this.f5178 == 4) {
            this.f5178 = 5;
            ((C1276) this.f5177).m4551();
            return new C3359(this);
        }
        throw new IllegalStateException(("state: " + this.f5178).toString());
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public void m4510(ColorStateList colorStateList) {
        if (((C2860) this.f5176) == null) {
            this.f5176 = new C2860();
        }
        C2860 c2860 = (C2860) this.f5176;
        c2860.f11119 = colorStateList;
        c2860.f11118 = true;
        m4520();
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4511() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p036.C1262.m4511():void");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m4512(C1399 c1399, int i) {
        C1412 c1412 = (C1412) this.f5176;
        c1412.m4904(c1399);
        int i2 = c1399.f5706;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1412.m4903(i, c1399.f5707, c1399.f5705);
        } else {
            int i3 = c1399.f5707;
            RecyclerView recyclerView = c1412.f5765;
            recyclerView.m1319(i, true, i3);
            recyclerView.f1698 = true;
            recyclerView.f1705.f5828 += i3;
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean m4513() {
        return this.f5178 < ((List) this.f5180).size() || !((ArrayList) this.f5179).isEmpty();
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public PorterDuff.Mode m4514() {
        C2860 c2860 = (C2860) this.f5176;
        if (c2860 != null) {
            return (PorterDuff.Mode) c2860.f11121;
        }
        return null;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int m4515(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f5180;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1399 c1399 = (C1399) arrayList.get(size);
            int i5 = c1399.f5706;
            if (i5 == 8) {
                int i6 = c1399.f5704;
                int i7 = c1399.f5707;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c1399.f5704 = i6 + 1;
                            c1399.f5707 = i7 + 1;
                        } else if (i2 == 2) {
                            c1399.f5704 = i6 - 1;
                            c1399.f5707 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c1399.f5707 = i7 + 1;
                    } else if (i2 == 2) {
                        c1399.f5707 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c1399.f5704 = i6 + 1;
                    } else if (i2 == 2) {
                        c1399.f5704 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c1399.f5704;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c1399.f5707;
                    } else if (i5 == 2) {
                        i += c1399.f5707;
                    }
                } else if (i2 == 1) {
                    c1399.f5704 = i8 + 1;
                } else if (i2 == 2) {
                    c1399.f5704 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1399 c13992 = (C1399) arrayList.get(size2);
            if (c13992.f5706 == 8) {
                int i9 = c13992.f5707;
                if (i9 == c13992.f5704 || i9 < 0) {
                    arrayList.remove(size2);
                    c13992.f5705 = null;
                    ((C1704) this.f5175).mo5418(c13992);
                }
            } else if (c13992.f5707 <= 0) {
                arrayList.remove(size2);
                c13992.f5705 = null;
                ((C1704) this.f5175).mo5418(c13992);
            }
        }
        return i;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean m4516() {
        return ((ArrayList) this.f5177).size() > 0;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public void m4517(int i) {
        ColorStateList colorStateListM7224;
        this.f5178 = i;
        C2964 c2964 = (C2964) this.f5177;
        if (c2964 != null) {
            Context context = ((View) this.f5175).getContext();
            synchronized (c2964) {
                colorStateListM7224 = c2964.f11437.m7224(context, i);
            }
        } else {
            colorStateListM7224 = null;
        }
        m4499(colorStateListM7224);
        m4520();
    }

    @Override // p126.InterfaceC2023
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo4518() {
        ((C4144) this.f5176).flush();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public void m4519(C5014 c5014, String str) {
        if (this.f5178 != 0) {
            throw new IllegalStateException(("state: " + this.f5178).toString());
        }
        C4144 c4144 = (C4144) this.f5176;
        c4144.mo9525(str);
        c4144.mo9525("\r\n");
        int size = c5014.size();
        for (int i = 0; i < size; i++) {
            c4144.mo9525(c5014.m11105(i));
            c4144.mo9525(": ");
            c4144.mo9525(c5014.m11103(i));
            c4144.mo9525("\r\n");
        }
        c4144.mo9525("\r\n");
        this.f5178 = 1;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m4520() {
        View view = (View) this.f5175;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((C2860) this.f5180) != null) {
                if (((C2860) this.f5179) == null) {
                    this.f5179 = new C2860();
                }
                C2860 c2860 = (C2860) this.f5179;
                c2860.f11119 = null;
                c2860.f11118 = false;
                c2860.f11121 = null;
                c2860.f11120 = false;
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                ColorStateList colorStateListM9859 = AbstractC4339.m9859(view);
                if (colorStateListM9859 != null) {
                    c2860.f11118 = true;
                    c2860.f11119 = colorStateListM9859;
                }
                PorterDuff.Mode modeM9865 = AbstractC4339.m9865(view);
                if (modeM9865 != null) {
                    c2860.f11120 = true;
                    c2860.f11121 = modeM9865;
                }
                if (c2860.f11118 || c2860.f11120) {
                    C2964.m7337(background, c2860, view.getDrawableState());
                    return;
                }
            }
            C2860 c28602 = (C2860) this.f5176;
            if (c28602 != null) {
                C2964.m7337(background, c28602, view.getDrawableState());
                return;
            }
            C2860 c28603 = (C2860) this.f5180;
            if (c28603 != null) {
                C2964.m7337(background, c28603, view.getDrawableState());
            }
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public C1399 m4521(Object obj, int i, int i2, int i3) {
        C1399 c1399 = (C1399) ((C1704) this.f5175).mo5419();
        if (c1399 != null) {
            c1399.f5706 = i;
            c1399.f5704 = i2;
            c1399.f5707 = i3;
            c1399.f5705 = obj;
            return c1399;
        }
        C1399 c13992 = new C1399();
        c13992.f5706 = i;
        c13992.f5704 = i2;
        c13992.f5707 = i3;
        c13992.f5705 = obj;
        return c13992;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.List] */
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public C1281 m4522() throws SocketException, UnknownHostException {
        String hostName;
        int port;
        List listSingletonList;
        boolean zContains;
        if (!m4513()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f5178 < ((List) this.f5180).size()) {
            boolean z = this.f5178 < ((List) this.f5180).size();
            C5009 c5009 = (C5009) this.f5175;
            if (!z) {
                throw new SocketException("No route to " + c5009.f19004.f18961 + "; exhausted proxy configurations: " + ((List) this.f5180));
            }
            List list = (List) this.f5180;
            int i = this.f5178;
            this.f5178 = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.f5176 = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C5004 c5004 = c5009.f19004;
                hostName = c5004.f18961;
                port = c5004.f18954;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                if (AbstractC2339.f9302.f13862.matcher(hostName).matches()) {
                    listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                } else {
                    c5009.f19006.getClass();
                    try {
                        List listM3993 = AbstractC1036.m3993(InetAddress.getAllByName(hostName));
                        if (listM3993.isEmpty()) {
                            throw new UnknownHostException(c5009.f19006 + " returned no addresses for " + hostName);
                        }
                        listSingletonList = listM3993;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f5176.iterator();
            while (it2.hasNext()) {
                C5012 c5012 = new C5012((C5009) this.f5175, proxy, (InetSocketAddress) it2.next());
                ﾞᐧ r3 = (ﾞᐧ) this.f5177;
                synchronized (r3) {
                    zContains = ((LinkedHashSet) r3.ˆʿ).contains(c5012);
                }
                if (zContains) {
                    ((ArrayList) this.f5179).add(c5012);
                } else {
                    arrayList.add(c5012);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1052.m4043((ArrayList) this.f5179, arrayList);
            ((ArrayList) this.f5179).clear();
        }
        return new C1281(arrayList);
    }
}
