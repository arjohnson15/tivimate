package p396;

import android.support.v4.media.session.AbstractC0002;
import androidx.leanback.widget.ʿˏ;
import java.io.IOException;
import java.util.ArrayList;
import p035.C1232;
import p041.C1274;
import p158.AbstractC2339;
import p237.C3093;
import p260.C3222;
import p331.C3758;
import p331.C3761;
import p366.C4143;
import p366.C4155;
import p430.AbstractC4996;
import p430.AbstractC5001;
import p430.C4994;
import p430.C4998;
import p430.C4999;
import p430.C5002;
import p430.C5004;
import p430.C5013;
import p430.C5017;
import p430.C5021;
import p430.InterfaceC5019;
import p447.AbstractC5179;

/* renamed from: ⁱᴵ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4590 implements InterfaceC4591 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f17574;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC4560 f17575;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Throwable f17576;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object[] f17577;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f17578;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC5019 f17579;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4564 f17580;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile boolean f17581;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C1274 f17582;

    public C4590(C4564 c4564, Object obj, Object[] objArr, InterfaceC5019 interfaceC5019, InterfaceC4560 interfaceC4560) {
        this.f17580 = c4564;
        this.f17574 = obj;
        this.f17577 = objArr;
        this.f17579 = interfaceC5019;
        this.f17575 = interfaceC4560;
    }

    @Override // p396.InterfaceC4591
    public final void cancel() {
        C1274 c1274;
        this.f17581 = true;
        synchronized (this) {
            c1274 = this.f17582;
        }
        if (c1274 != null) {
            c1274.cancel();
        }
    }

    public final Object clone() {
        return new C4590(this.f17580, this.f17574, this.f17577, this.f17579, this.f17575);
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ʽᐧ */
    public final InterfaceC4591 clone() {
        return new C4590(this.f17580, this.f17574, this.f17577, this.f17579, this.f17575);
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ʿʼ */
    public final void mo10461(InterfaceC4576 interfaceC4576) {
        C1274 c1274;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f17578) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f17578 = true;
                c1274 = this.f17582;
                th = this.f17576;
                if (c1274 == null && th == null) {
                    try {
                        C1274 c1274M10488 = m10488();
                        this.f17582 = c1274M10488;
                        c1274 = c1274M10488;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC4581.m10479(th);
                        this.f17576 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC4576.mo7069(th);
            return;
        }
        if (this.f17581) {
            c1274.cancel();
        }
        c1274.m4543(new C3758(17, this, interfaceC4576, false));
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ˏʾ */
    public final boolean mo10462() {
        boolean z = true;
        if (this.f17581) {
            return true;
        }
        synchronized (this) {
            C1274 c1274 = this.f17582;
            if (c1274 == null || !c1274.f5226) {
                z = false;
            }
        }
        return z;
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ˏᵢ */
    public final synchronized C5021 mo10463() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m10490().f5221;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1274 m10488() {
        C5004 c5004M7602;
        C4564 c4564 = this.f17580;
        Object[] objArr = this.f17577;
        int length = objArr.length;
        AbstractC4581[] abstractC4581Arr = c4564.f17482;
        if (length != abstractC4581Arr.length) {
            throw new IllegalArgumentException(AbstractC5179.m11550(AbstractC0002.m40(length, "Argument count (", ") doesn't match expected count ("), abstractC4581Arr.length, ")"));
        }
        C4570 c4570 = new C4570(c4564.f17488, c4564.f17484, c4564.f17479, c4564.f17486, c4564.f17487, c4564.f17483, c4564.f17489, c4564.f17480);
        if (c4564.f17481) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC4581Arr[i].mo10422(c4570, objArr[i]);
        }
        C3093 c3093 = c4570.f17504;
        if (c3093 != null) {
            c5004M7602 = c3093.m7602();
        } else {
            String str = c4570.f17500;
            C5004 c5004 = c4570.f17495;
            C3093 c3093M11095 = c5004.m11095(str);
            c5004M7602 = c3093M11095 != null ? c3093M11095.m7602() : null;
            if (c5004M7602 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c5004 + ", Relative: " + c4570.f17500);
            }
        }
        AbstractC4996 c4571 = c4570.f17498;
        if (c4571 == null) {
            C3761 c3761 = c4570.f17497;
            if (c3761 != null) {
                c4571 = new C4998((ArrayList) c3761.f14527, (ArrayList) c3761.f14528);
            } else {
                C3222 c3222 = c4570.f17505;
                if (c3222 != null) {
                    ArrayList arrayList2 = (ArrayList) c3222.f12540;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    c4571 = new C5017((C4155) c3222.f12538, (C5002) c3222.f12539, AbstractC2339.m6432(arrayList2));
                } else if (c4570.f17499) {
                    c4571 = AbstractC4996.create((C5002) null, new byte[0]);
                }
            }
        }
        C5002 c5002 = c4570.f17503;
        C1232 c1232 = c4570.f17502;
        if (c5002 != null) {
            if (c4571 != null) {
                c4571 = new C4571(c4571, c5002);
            } else {
                c1232.m4427("Content-Type", c5002.f18950);
            }
        }
        ʿˏ r2 = c4570.f17496;
        r2.ᐧⁱ = c5004M7602;
        r2.ˎˑ = c1232.m4429().m11106();
        r2.ˋⁱ(c4570.f17501, c4571);
        r2.ʿˏ(C4589.class, new C4589(c4564.f17485, this.f17574, c4564.f17478, arrayList));
        C5021 c5021 = r2.ˏᵢ();
        C4999 c4999 = (C4999) this.f17579;
        c4999.getClass();
        return new C1274(c4999, c5021);
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ـﹶ */
    public final C4586 mo10464() {
        C1274 c1274M10490;
        synchronized (this) {
            if (this.f17578) {
                throw new IllegalStateException("Already executed.");
            }
            this.f17578 = true;
            c1274M10490 = m10490();
        }
        if (this.f17581) {
            c1274M10490.cancel();
        }
        return m10489(c1274M10490.m4546());
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4586 m10489(C4994 c4994) throws IOException {
        C5013 c5013M11084 = c4994.m11084();
        AbstractC5001 abstractC5001 = c4994.f18890;
        c5013M11084.f19027 = new C4572(abstractC5001.mo5666(), abstractC5001.mo5668());
        C4994 c4994M11101 = c5013M11084.m11101();
        int i = c4994M11101.f18886;
        if (i < 200 || i >= 300) {
            try {
                abstractC5001.mo5667().mo9529(new C4143());
                abstractC5001.mo5666();
                abstractC5001.mo5668();
                if (c4994M11101.m11083()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C4586(c4994M11101, null);
            } finally {
                abstractC5001.close();
            }
        }
        if (i == 204 || i == 205) {
            abstractC5001.close();
            if (c4994M11101.m11083()) {
                return new C4586(c4994M11101, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C4594 c4594 = new C4594(abstractC5001);
        try {
            Object objMo8506 = this.f17575.mo8506(c4594);
            if (c4994M11101.m11083()) {
                return new C4586(c4994M11101, objMo8506);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = c4594.f17591;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1274 m10490() throws IOException {
        C1274 c1274 = this.f17582;
        if (c1274 != null) {
            return c1274;
        }
        Throwable th = this.f17576;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C1274 c1274M10488 = m10488();
            this.f17582 = c1274M10488;
            return c1274M10488;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC4581.m10479(e);
            this.f17576 = e;
            throw e;
        }
    }
}
