package p346;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C0284;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p080.AbstractC1702;
import p082.C1707;
import p150.ExecutorC2314;
import p213.InterfaceC2813;
import p259.InterfaceC3214;
import p259.InterfaceC3218;
import p261.C3233;
import p261.C3245;
import p261.C3246;
import p266.C3262;
import p329.AbstractC3737;
import p329.AbstractC3740;
import p329.AbstractC3742;
import ـˈ.ˉᵎ;

/* renamed from: ᵎᵎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3993 implements InterfaceC3990, InterfaceC3218 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final boolean f15397 = Log.isLoggable("GlideRequest", 2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1707 f15398;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C0284 f15399;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public Drawable f15400;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public int f15401;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f15402;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final InterfaceC3214 f15403;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public Drawable f15404;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final ArrayList f15405;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f15406;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final EnumC0293 f15407;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final ExecutorC2314 f15408;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC3991 f15409;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f15410;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C3245 f15411;

    /* renamed from: יʻ, reason: contains not printable characters */
    public boolean f15412;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15413;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f15414;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Class f15415;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final InterfaceC2813 f15416;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public volatile C3233 f15417;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C3262 f15418;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public Drawable f15419;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final RuntimeException f15420;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC3994 f15421;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f15422;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f15423;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f15424;

    public C3993(Context context, C0284 c0284, Object obj, Object obj2, Class cls, AbstractC3991 abstractC3991, int i, int i2, EnumC0293 enumC0293, InterfaceC3214 interfaceC3214, ArrayList arrayList, InterfaceC3994 interfaceC3994, C3233 c3233, InterfaceC2813 interfaceC2813) {
        ExecutorC2314 executorC2314 = AbstractC3740.f14500;
        this.f15413 = f15397 ? String.valueOf(hashCode()) : null;
        this.f15398 = new C1707();
        this.f15410 = obj;
        this.f15399 = c0284;
        this.f15414 = obj2;
        this.f15415 = cls;
        this.f15409 = abstractC3991;
        this.f15422 = i;
        this.f15402 = i2;
        this.f15407 = enumC0293;
        this.f15403 = interfaceC3214;
        this.f15405 = arrayList;
        this.f15421 = interfaceC3994;
        this.f15417 = c3233;
        this.f15416 = interfaceC2813;
        this.f15408 = executorC2314;
        this.f15401 = 1;
        if (this.f15420 == null && ((Map) c0284.f2349.ˆʿ).containsKey(ﹳﹳ.class)) {
            this.f15420 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p346.InterfaceC3990
    public final void clear() {
        synchronized (this.f15410) {
            try {
                if (this.f15412) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f15398.m5423();
                if (this.f15401 == 6) {
                    return;
                }
                m9248();
                C3245 c3245 = this.f15411;
                if (c3245 != null) {
                    this.f15411 = null;
                } else {
                    c3245 = null;
                }
                InterfaceC3994 interfaceC3994 = this.f15421;
                if (interfaceC3994 == null || interfaceC3994.mo9226(this)) {
                    this.f15403.mo1561(m9252());
                }
                this.f15401 = 6;
                if (c3245 != null) {
                    this.f15417.getClass();
                    C3233.m7980(c3245);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f15410) {
            int i = this.f15401;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f15410) {
            obj = this.f15414;
            cls = this.f15415;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9248() {
        if (this.f15412) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f15398.m5423();
        this.f15403.mo1564(this);
        C3262 c3262 = this.f15418;
        if (c3262 != null) {
            synchronized (((C3233) c3262.f12725)) {
                ((C3246) c3262.f12726).m8000((C3993) c3262.f12724);
            }
            this.f15418 = null;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m9249() {
        InterfaceC3994 interfaceC3994 = this.f15421;
        return interfaceC3994 == null || !interfaceC3994.mo9229().mo9225();
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉי */
    public final void mo9220() {
        synchronized (this.f15410) {
            try {
                if (this.f15412) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f15398.m5423();
                int i = AbstractC3737.f14494;
                this.f15406 = SystemClock.elapsedRealtimeNanos();
                if (this.f15414 == null) {
                    if (AbstractC3742.m8717(this.f15422, this.f15402)) {
                        this.f15424 = this.f15422;
                        this.f15423 = this.f15402;
                    }
                    if (this.f15404 == null) {
                        this.f15409.getClass();
                        this.f15404 = null;
                    }
                    m9255(new GlideException("Received null model"), this.f15404 == null ? 5 : 3);
                    return;
                }
                int i2 = this.f15401;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m9251(this.f15411, 5, false);
                    return;
                }
                ArrayList arrayList = this.f15405;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                }
                this.f15401 = 3;
                if (AbstractC3742.m8717(this.f15422, this.f15402)) {
                    m9254(this.f15422, this.f15402);
                } else {
                    this.f15403.mo1563(this);
                }
                int i3 = this.f15401;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC3994 interfaceC3994 = this.f15421;
                    if (interfaceC3994 == null || interfaceC3994.mo9219(this)) {
                        this.f15403.mo1558(m9252());
                    }
                }
                if (f15397) {
                    m9253("finished run method in " + AbstractC3737.m8704(this.f15406));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉⁱ */
    public final boolean mo9221() {
        boolean z;
        synchronized (this.f15410) {
            z = this.f15401 == 4;
        }
        return z;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m9250(C3245 c3245, Object obj, int i) {
        m9249();
        this.f15401 = 4;
        this.f15411 = c3245;
        if (this.f15399.f2355 <= 3) {
            String str = "Finished loading " + obj.getClass().getSimpleName() + " from " + ˉᵎ.ﾞʽ(i) + " for " + this.f15414 + " with size [" + this.f15424 + "x" + this.f15423 + "] in " + AbstractC3737.m8704(this.f15406) + " ms";
        }
        InterfaceC3994 interfaceC3994 = this.f15421;
        if (interfaceC3994 != null) {
            interfaceC3994.mo9218(this);
        }
        this.f15412 = true;
        try {
            ArrayList arrayList = this.f15405;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3988) it.next()).m9230(obj);
                }
            }
            this.f15403.mo1567(obj, this.f15416.mo7093(i));
            this.f15412 = false;
        } catch (Throwable th) {
            this.f15412 = false;
            throw th;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m9251(C3245 c3245, int i, boolean z) {
        this.f15398.m5423();
        C3245 c32452 = null;
        try {
            synchronized (this.f15410) {
                try {
                    this.f15418 = null;
                    if (c3245 == null) {
                        m9255(new GlideException("Expected to receive a Resource<R> with an object of " + this.f15415 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = c3245.f12651.get();
                    try {
                        if (obj != null && this.f15415.isAssignableFrom(obj.getClass())) {
                            InterfaceC3994 interfaceC3994 = this.f15421;
                            if (interfaceC3994 == null || interfaceC3994.mo9224(this)) {
                                m9250(c3245, obj, i);
                                return;
                            }
                            this.f15411 = null;
                            this.f15401 = 4;
                            this.f15417.getClass();
                            C3233.m7980(c3245);
                            return;
                        }
                        this.f15411 = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f15415);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(c3245);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        m9255(new GlideException(sb.toString()), 5);
                        this.f15417.getClass();
                        C3233.m7980(c3245);
                    } catch (Throwable th) {
                        c32452 = c3245;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (c32452 != null) {
                this.f15417.getClass();
                C3233.m7980(c32452);
            }
            throw th3;
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˏᵢ */
    public final boolean mo9223(InterfaceC3990 interfaceC3990) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC3991 abstractC3991;
        EnumC0293 enumC0293;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC3991 abstractC39912;
        EnumC0293 enumC02932;
        int size2;
        if (!(interfaceC3990 instanceof C3993)) {
            return false;
        }
        synchronized (this.f15410) {
            try {
                i = this.f15422;
                i2 = this.f15402;
                obj = this.f15414;
                cls = this.f15415;
                abstractC3991 = this.f15409;
                enumC0293 = this.f15407;
                ArrayList arrayList = this.f15405;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        C3993 c3993 = (C3993) interfaceC3990;
        synchronized (c3993.f15410) {
            try {
                i3 = c3993.f15422;
                i4 = c3993.f15402;
                obj2 = c3993.f15414;
                cls2 = c3993.f15415;
                abstractC39912 = c3993.f15409;
                enumC02932 = c3993.f15407;
                ArrayList arrayList2 = c3993.f15405;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC3742.f14503;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC3991 == null ? abstractC39912 == null : abstractC3991.m9234(abstractC39912)) && enumC0293 == enumC02932 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Drawable m9252() {
        if (this.f15400 == null) {
            this.f15400 = this.f15409.f15382;
        }
        return this.f15400;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ـﹶ */
    public final boolean mo9225() {
        boolean z;
        synchronized (this.f15410) {
            z = this.f15401 == 4;
        }
        return z;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9253(String str) {
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " this: ");
        sbM5409.append(this.f15413);
        sbM5409.toString();
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ᐧʻ */
    public final boolean mo9227() {
        boolean z;
        synchronized (this.f15410) {
            z = this.f15401 == 6;
        }
        return z;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m9254(int i, int i2) {
        Object obj;
        int iRound = i;
        this.f15398.m5423();
        Object obj2 = this.f15410;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f15397;
                    if (z) {
                        m9253("Got onSizeReady in " + AbstractC3737.m8704(this.f15406));
                    }
                    if (this.f15401 == 3) {
                        this.f15401 = 2;
                        this.f15409.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        this.f15424 = iRound;
                        this.f15423 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            m9253("finished setup for calling load in " + AbstractC3737.m8704(this.f15406));
                        }
                        C3233 c3233 = this.f15417;
                        C0284 c0284 = this.f15399;
                        Object obj3 = this.f15414;
                        AbstractC3991 abstractC3991 = this.f15409;
                        try {
                            obj = obj2;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                        }
                        try {
                            this.f15418 = c3233.m7986(c0284, obj3, abstractC3991.f15388, this.f15424, this.f15423, abstractC3991.f15387, this.f15415, this.f15407, abstractC3991.f15381, abstractC3991.f15380, abstractC3991.f15391, abstractC3991.f15385, abstractC3991.f15396, abstractC3991.f15393, abstractC3991.f15392, this, this.f15408);
                            if (this.f15401 != 2) {
                                this.f15418 = null;
                            }
                            if (z) {
                                m9253("finished onSizeReady in " + AbstractC3737.m8704(this.f15406));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ﹳﹳ */
    public final void mo9228() {
        synchronized (this.f15410) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m9255(GlideException glideException, int i) {
        boolean zM9231;
        this.f15398.m5423();
        synchronized (this.f15410) {
            try {
                glideException.getClass();
                int i2 = this.f15399.f2355;
                if (i2 <= i) {
                    String str = "Load failed for [" + this.f15414 + "] with dimensions [" + this.f15424 + "x" + this.f15423 + "]";
                    if (i2 <= 4) {
                        glideException.m1549();
                    }
                }
                Drawable drawableM9252 = null;
                this.f15418 = null;
                this.f15401 = 5;
                InterfaceC3994 interfaceC3994 = this.f15421;
                if (interfaceC3994 != null) {
                    interfaceC3994.mo9222(this);
                }
                boolean z = true;
                this.f15412 = true;
                try {
                    ArrayList arrayList = this.f15405;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        zM9231 = false;
                        while (it.hasNext()) {
                            InterfaceC3988 interfaceC3988 = (InterfaceC3988) it.next();
                            m9249();
                            zM9231 |= interfaceC3988.m9231();
                        }
                    } else {
                        zM9231 = false;
                    }
                    if (!zM9231) {
                        InterfaceC3994 interfaceC39942 = this.f15421;
                        if (interfaceC39942 != null && !interfaceC39942.mo9219(this)) {
                            z = false;
                        }
                        if (z) {
                            if (this.f15414 == null) {
                                if (this.f15404 == null) {
                                    this.f15409.getClass();
                                    this.f15404 = null;
                                }
                                drawableM9252 = this.f15404;
                            }
                            if (drawableM9252 == null) {
                                if (this.f15419 == null) {
                                    this.f15419 = this.f15409.f15389;
                                }
                                drawableM9252 = this.f15419;
                            }
                            if (drawableM9252 == null) {
                                drawableM9252 = m9252();
                            }
                            this.f15403.mo1557(drawableM9252);
                        }
                    }
                } finally {
                    this.f15412 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
