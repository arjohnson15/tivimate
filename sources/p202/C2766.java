package p202;

import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.bumptech.glide.C0295;
import com.google.android.gms.internal.measurement.C0302;
import com.google.android.gms.internal.measurement.C0304;
import com.google.android.gms.internal.measurement.C0559;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p063.C1454;
import p143.C2227;
import p296.C3486;
import p314.C3598;
import p314.InterfaceC3593;
import p314.InterfaceC3594;
import p331.C3762;
import p331.C3767;
import p368.C4177;
import p368.InterfaceC4180;
import p390.C4514;
import p393.AbstractC4525;
import p393.C4523;
import p408.C4672;
import p414.C4737;
import p417.AbstractC4753;
import p456.AbstractC5248;
import p456.C5236;
import p456.C5273;
import p456.C5280;
import p456.C5349;
import ʻˉ.ᐧˋ;
import ʿﾞ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ᵢ.ʿʼ;

/* renamed from: ˎᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2766 implements InterfaceC4180 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f10817;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f10818;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f10819;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f10820;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10821;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f10822;

    public C2766(long j, C4672 c4672, C2227 c2227, C3486 c3486, C4514 c4514) {
        this.f10821 = 2;
        this.f10817 = j;
        this.f10819 = c4672;
        this.f10820 = c2227;
        this.f10818 = c3486;
        this.f10822 = c4514;
    }

    public C2766(File file) {
        this.f10821 = 1;
        this.f10818 = new C0559(16);
        this.f10820 = file;
        this.f10817 = 262144000L;
        this.f10819 = new C3767(16);
    }

    public C2766(ʿʼ r4, C5349 c5349) {
        this.f10821 = 0;
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f10819 = r4;
        this.f10820 = c5349;
        this.f10817 = millis;
        this.f10818 = new Object();
        this.f10822 = new LinkedHashMap();
    }

    public C2766(C5273 c5273) {
        this.f10821 = 4;
        this.f10822 = c5273;
    }

    public C2766(C5280 c5280, long j) {
        this.f10821 = 3;
        this.f10822 = c5280;
        AbstractC4753.m10688("health_monitor");
        AbstractC4753.m10685(j > 0);
        this.f10819 = "health_monitor:start";
        this.f10820 = "health_monitor:count";
        this.f10818 = "health_monitor:value";
        this.f10817 = j;
    }

    @Override // p368.InterfaceC4180
    public synchronized void clear() {
        try {
            try {
                C4523 c4523M7040 = m7040();
                c4523M7040.close();
                AbstractC4525.m10300(c4523M7040.f17399);
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                }
            }
        } finally {
            m7044();
        }
    }

    public String toString() {
        switch (this.f10821) {
            case 2:
                return "TreeConnect[" + this.f10817 + "](" + ((C4672) this.f10819) + ")";
            default:
                return super.toString();
        }
    }

    @Override // p368.InterfaceC4180
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public File mo7037(InterfaceC3594 interfaceC3594) {
        String strM8809 = ((C3767) this.f10819).m8809(interfaceC3594);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String str = "Get: Obtained: " + strM8809 + " for for Key: " + interfaceC3594;
        }
        try {
            ᵢٴ r0 = m7040().m10294(strM8809);
            if (r0 != null) {
                return ((File[]) r0.ˆʿ)[0];
            }
            return null;
        } catch (IOException e) {
            return Log.isLoggable("DiskLruCacheWrapper", 5) ? null : null;
        }
    }

    @Override // p368.InterfaceC4180
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo7038(InterfaceC3594 interfaceC3594, C3762 c3762) {
        C4177 c4177M5010;
        C4523 c4523M7040;
        boolean z;
        String strM8809 = ((C3767) this.f10819).m8809(interfaceC3594);
        C0559 c0559 = (C0559) this.f10818;
        synchronized (c0559) {
            try {
                c4177M5010 = (C4177) ((HashMap) c0559.f2912).get(strM8809);
                if (c4177M5010 == null) {
                    c4177M5010 = ((C1454) c0559.f2913).m5010();
                    ((HashMap) c0559.f2912).put(strM8809, c4177M5010);
                }
                c4177M5010.f16121++;
            } finally {
            }
        }
        c4177M5010.f16122.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String str = "Put: Obtained: " + strM8809 + " for for Key: " + interfaceC3594;
            }
            try {
                c4523M7040 = m7040();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                }
            }
            if (c4523M7040.m10294(strM8809) != null) {
                return;
            }
            C0295 c0295M10298 = c4523M7040.m10298(strM8809);
            if (c0295M10298 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM8809));
            }
            try {
                if (((InterfaceC3593) c3762.f14530).mo3722(c3762.f14531, c0295M10298.m1608(), (C3598) c3762.f14532)) {
                    C4523.m10290((C4523) c0295M10298.f2405, c0295M10298, true);
                    c0295M10298.f2404 = true;
                }
                if (!z) {
                    try {
                        c0295M10298.m1606();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!c0295M10298.f2404) {
                    try {
                        c0295M10298.m1606();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((C0559) this.f10818).m2505(strM8809);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean m7039(long j, C0304 c0304) {
        if (((ArrayList) this.f10818) == null) {
            this.f10818 = new ArrayList();
        }
        if (((ArrayList) this.f10820) == null) {
            this.f10820 = new ArrayList();
        }
        if (!((ArrayList) this.f10818).isEmpty() && ((((C0304) ((ArrayList) this.f10818).get(0)).m1801() / 1000) / 60) / 60 != ((c0304.m1801() / 1000) / 60) / 60) {
            return false;
        }
        long jMo2513 = this.f10817 + c0304.mo2513(null);
        C5273 c5273 = (C5273) this.f10822;
        c5273.m11832();
        if (jMo2513 >= Math.max(0, ((Integer) AbstractC5248.f20214.m11751(null)).intValue())) {
            return false;
        }
        this.f10817 = jMo2513;
        ((ArrayList) this.f10818).add(c0304);
        ((ArrayList) this.f10820).add(Long.valueOf(j));
        int size = ((ArrayList) this.f10818).size();
        c5273.m11832();
        return size < Math.max(1, ((Integer) AbstractC5248.f20233.m11751(null)).intValue());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public synchronized C4523 m7040() {
        try {
            if (((C4523) this.f10822) == null) {
                this.f10822 = C4523.m10288((File) this.f10820, this.f10817);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C4523) this.f10822;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m7041(C4737 c4737) {
        Runnable runnable;
        synchronized (this.f10818) {
            runnable = (Runnable) ((LinkedHashMap) this.f10822).remove(c4737);
        }
        if (runnable != null) {
            ((Handler) ((ʿʼ) this.f10819).ˆʿ).removeCallbacks(runnable);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m7042(C4737 c4737) {
        Runnable runnable = new ᐧˋ(this, 9, c4737);
        synchronized (this.f10818) {
        }
        ʿʼ r4 = (ʿʼ) this.f10819;
        ((Handler) r4.ˆʿ).postDelayed(runnable, this.f10817);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m7043(C0302 c0302) {
        this.f10819 = c0302;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public synchronized void m7044() {
        this.f10822 = null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m7045() {
        C5280 c5280 = (C5280) this.f10822;
        c5280.ʼᵎ();
        ((C5236) ((ﹳﹳ) c5280).ᐧⁱ).f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c5280.m11856().edit();
        editorEdit.remove((String) this.f10820);
        editorEdit.remove((String) this.f10818);
        editorEdit.putLong((String) this.f10819, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
