package p063;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C0284;
import com.bumptech.glide.C0288;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.ComponentCallbacks2C0294;
import java.util.ArrayList;
import p137.InterfaceC2105;
import p156.C2336;
import p156.C2337;
import p261.C3231;
import p304.C3522;
import p314.InterfaceC3596;
import p329.AbstractC3740;
import p329.AbstractC3742;
import p346.C3992;
import p354.C4024;

/* renamed from: ʾᐧ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1448 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Handler f5925;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC2105 f5926;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f5927;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Bitmap f5928;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C1456 f5929;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C1456 f5930;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5931;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C0288 f5932;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f5933;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f5934;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2337 f5935;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f5936;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f5937;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f5938;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ComponentCallbacks2C0294 f5939;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C1456 f5940;

    public C1448(ComponentCallbacks2C0283 componentCallbacks2C0283, C2337 c2337, int i, int i2, Bitmap bitmap) {
        C3522 c3522 = C3522.f13643;
        InterfaceC2105 interfaceC2105 = componentCallbacks2C0283.f2337;
        C0284 c0284 = componentCallbacks2C0283.f2341;
        Context baseContext = c0284.getBaseContext();
        AbstractC3740.m8706(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C0294 componentCallbacks2C0294M3951 = ComponentCallbacks2C0283.m1550(baseContext).f2343.m3951(baseContext);
        Context baseContext2 = c0284.getBaseContext();
        AbstractC3740.m8706(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C0294 componentCallbacks2C0294M39512 = ComponentCallbacks2C0283.m1550(baseContext2).f2343.m3951(baseContext2);
        componentCallbacks2C0294M39512.getClass();
        C0288 c0288M1574 = new C0288(componentCallbacks2C0294M39512.f2398, componentCallbacks2C0294M39512, Bitmap.class, componentCallbacks2C0294M39512.f2392).mo1573(ComponentCallbacks2C0294.f2391).mo1573(((C3992) ((C3992) ((C3992) new C3992().m9241(C3231.f12585)).m9247()).m9245()).m9242(i, i2));
        this.f5933 = new ArrayList();
        this.f5939 = componentCallbacks2C0294M3951;
        Handler handler = new Handler(Looper.getMainLooper(), new C1458(0, this));
        this.f5926 = interfaceC2105;
        this.f5925 = handler;
        this.f5932 = c0288M1574;
        this.f5935 = c2337;
        m5005(c3522, bitmap);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5004(C1456 c1456) {
        this.f5937 = false;
        boolean z = this.f5927;
        Handler handler = this.f5925;
        if (z) {
            handler.obtainMessage(2, c1456).sendToTarget();
            return;
        }
        if (!this.f5936) {
            this.f5929 = c1456;
            return;
        }
        if (c1456.f5958 != null) {
            Bitmap bitmap = this.f5928;
            if (bitmap != null) {
                this.f5926.mo5961(bitmap);
                this.f5928 = null;
            }
            C1456 c14562 = this.f5940;
            this.f5940 = c1456;
            ArrayList arrayList = this.f5933;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1457 c1457 = (C1457) ((InterfaceC1452) arrayList.get(size));
                Object callback = c1457.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1457.stop();
                    c1457.invalidateSelf();
                } else {
                    c1457.invalidateSelf();
                    C1456 c14563 = ((C1448) c1457.f5965.f5948).f5940;
                    if ((c14563 != null ? c14563.f5953 : -1) == r5.f5935.f9280.f9256 - 1) {
                        c1457.f5967++;
                    }
                    int i = c1457.f5968;
                    if (i != -1 && c1457.f5967 >= i) {
                        c1457.stop();
                    }
                }
            }
            if (c14562 != null) {
                handler.obtainMessage(2, c14562).sendToTarget();
            }
        }
        m5006();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5005(InterfaceC3596 interfaceC3596, Bitmap bitmap) {
        AbstractC3740.m8706(interfaceC3596, "Argument must not be null");
        AbstractC3740.m8706(bitmap, "Argument must not be null");
        this.f5928 = bitmap;
        this.f5932 = this.f5932.mo1573(new C3992().m9235(interfaceC3596, true));
        this.f5938 = AbstractC3742.m8712(bitmap);
        this.f5931 = bitmap.getWidth();
        this.f5934 = bitmap.getHeight();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5006() {
        int i;
        if (!this.f5936 || this.f5937) {
            return;
        }
        C1456 c1456 = this.f5929;
        if (c1456 != null) {
            this.f5929 = null;
            m5004(c1456);
            return;
        }
        this.f5937 = true;
        C2337 c2337 = this.f5935;
        int i2 = c2337.f9280.f9256;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = c2337.f9283) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C2336) r2.f9252.get(i)).f9276);
        int i3 = (c2337.f9283 + 1) % c2337.f9280.f9256;
        c2337.f9283 = i3;
        this.f5930 = new C1456(this.f5925, i3, jUptimeMillis);
        C0288 c0288M1570 = this.f5932.mo1573((C3992) new C3992().m9243(new C4024(Double.valueOf(Math.random())))).m1570(c2337);
        c0288M1570.m1572(this.f5930, c0288M1570);
    }
}
