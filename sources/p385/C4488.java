package p385;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p033.C1215;
import p149.HandlerC2291;
import p166.AbstractC2424;
import p193.C2705;
import p310.C3581;
import p312.InterfaceC3586;
import p374.C4261;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4471;
import p456.C5349;
import ˆˑ.ﹳﹳ;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵢﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4488 implements InterfaceC4493 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4497 f17262;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f17263;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public byte[] f17264;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C1215 f17265;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final UUID f17266;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public byte[] f17267;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Looper f17268;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public HandlerC4491 f17269;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC4490 f17270;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f17271;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4471 f17272;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5349 f17273;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f17274;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f17275;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f17276;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final HashMap f17277;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final HandlerC2291 f17278;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public InterfaceC3586 f17279;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public HandlerThread f17280;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public DrmSession$DrmSessionException f17281;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ᵢٴ f17282;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C2705 f17283;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public C4495 f17284;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public C4484 f17285;

    public C4488(UUID uuid, InterfaceC4497 interfaceC4497, C5349 c5349, ᵢٴ r4, List list, boolean z, boolean z2, byte[] bArr, HashMap map, InterfaceC4490 interfaceC4490, Looper looper, C2705 c2705, C1215 c1215) {
        this.f17266 = uuid;
        this.f17273 = c5349;
        this.f17282 = r4;
        this.f17262 = interfaceC4497;
        this.f17263 = z;
        this.f17276 = z2;
        if (bArr != null) {
            this.f17267 = bArr;
            this.f17275 = null;
        } else {
            list.getClass();
            this.f17275 = DesugarCollections.unmodifiableList(list);
        }
        this.f17277 = map;
        this.f17270 = interfaceC4490;
        this.f17272 = new C4471();
        this.f17283 = c2705;
        this.f17265 = c1215;
        this.f17271 = 2;
        this.f17268 = looper;
        this.f17278 = new HandlerC2291(this, looper, 3);
    }

    @Override // p385.InterfaceC4493
    public final int getState() {
        m10244();
        return this.f17271;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo10238() {
        m10244();
        return this.f17263;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo10239(String str) {
        m10244();
        byte[] bArr = this.f17264;
        AbstractC4464.m10146(bArr);
        return this.f17262.mo8347(bArr, str);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10240() {
        int i = this.f17271;
        return i == 3 || i == 4;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m10241(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || ﹳﹳ.ᵎـ(th)) {
            this.f17273.m12112(this);
        } else {
            m10243(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10242() {
        /*
            r4 = this;
            boolean r0 = r4.m10240()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            ᵢﹶ.ﹳˎ r0 = r4.f17262     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.mo8351()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f17264 = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ᵢﹶ.ﹳˎ r2 = r4.f17262     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ʼᵎ.ˏᴵ r3 = r4.f17265     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.mo8343(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ᵢﹶ.ﹳˎ r0 = r4.f17262     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f17264     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ᐧᴵ.ـﹶ r0 = r0.mo8353(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f17279 = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f17271 = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ᵢᵢ.ﹳﹳ r2 = r4.f17272     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f17211     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f17209     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ᵢﹶ.ˉי r3 = (p385.C4480) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.m10227(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f17264     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = ˆˑ.ﹳﹳ.ᵎـ(r0)
            if (r2 == 0) goto L59
            ﾞⁱ.ﹶﾞ r0 = r4.f17273
            r0.m12112(r4)
            goto L62
        L59:
            r4.m10243(r1, r0)
            goto L62
        L5d:
            ﾞⁱ.ﹶﾞ r0 = r4.f17273
            r0.m12112(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p385.C4488.m10242():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10243(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            int r1 = p383.AbstractC4470.f17202
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = p385.AbstractC4486.m10237(r7)
            if (r2 == 0) goto L14
            int r6 = p385.AbstractC4486.m10236(r7)
            goto L61
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L23
            boolean r1 = p385.AbstractC4489.m10253(r7)
            if (r1 == 0) goto L23
        L20:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L61
        L23:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r2 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L58
            boolean r1 = ˆˑ.ﹳﹳ.ᵎـ(r7)
            if (r1 == 0) goto L30
            goto L58
        L30:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L37
            r6 = 6007(0x1777, float:8.418E-42)
            goto L61
        L37:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L3e
            r6 = 6001(0x1771, float:8.409E-42)
            goto L61
        L3e:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r1 == 0) goto L45
            r6 = 6003(0x1773, float:8.412E-42)
            goto L61
        L45:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L4c
            r6 = 6008(0x1778, float:8.419E-42)
            goto L61
        L4c:
            if (r6 != r3) goto L4f
            goto L20
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L61
        L55:
            r1 = 3
            if (r6 != r1) goto L5b
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
            goto L61
        L5b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L61:
            r0.<init>(r6, r7)
            r5.f17281 = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            p383.AbstractC4464.m10147(r6, r0, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L93
            ᵢᵢ.ﹳﹳ r6 = r5.f17272
            java.lang.Object r0 = r6.f17211
            monitor-enter(r0)
            java.util.Set r6 = r6.f17209     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r6.next()
            ᵢﹶ.ˉי r0 = (p385.C4480) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.m10229(r1)
            goto L7d
        L90:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r6
        L93:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto Laf
            boolean r6 = ˆˑ.ﹳﹳ.ˎٴ(r7)
            if (r6 != 0) goto La7
            boolean r6 = ˆˑ.ﹳﹳ.ᵎـ(r7)
            if (r6 == 0) goto La4
            goto La7
        La4:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La7:
            int r6 = r5.f17271
            r7 = 4
            if (r6 == r7) goto Lae
            r5.f17271 = r3
        Lae:
            return
        Laf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p385.C4488.m10243(int, java.lang.Throwable):void");
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m10244() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f17268;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC4464.m10127("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m10245(C3581 c3581) {
        Set set;
        C4471 c4471 = this.f17272;
        synchronized (c4471.f17211) {
            set = c4471.f17209;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C4480) it.next()).m10228();
        }
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo10246(C4480 c4480) {
        m10244();
        int i = this.f17274;
        if (i <= 0) {
            AbstractC4464.m10134("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f17274 = i2;
        if (i2 == 0) {
            this.f17271 = 0;
            HandlerC2291 handlerC2291 = this.f17278;
            int i3 = AbstractC4470.f17202;
            handlerC2291.removeCallbacksAndMessages(null);
            HandlerC4491 handlerC4491 = this.f17269;
            synchronized (handlerC4491) {
                handlerC4491.removeCallbacksAndMessages(null);
                handlerC4491.f17287 = true;
            }
            this.f17269 = null;
            this.f17280.quit();
            this.f17280 = null;
            this.f17279 = null;
            this.f17281 = null;
            this.f17285 = null;
            this.f17284 = null;
            byte[] bArr = this.f17264;
            if (bArr != null) {
                this.f17262.mo8342(bArr);
                this.f17264 = null;
            }
        }
        if (c4480 != null) {
            this.f17272.m10219(c4480);
            if (this.f17272.m10220(c4480) == 0) {
                c4480.m10226();
            }
        }
        ᵢٴ r14 = this.f17282;
        int i4 = this.f17274;
        C4492 c4492 = (C4492) r14.ˆʿ;
        if (i4 == 1 && c4492.f17295 > 0 && c4492.f17300 != -9223372036854775807L) {
            c4492.f17296.add(this);
            Handler handler = c4492.f17302;
            handler.getClass();
            handler.postAtTime(new RunnableC4478(0, this), this, SystemClock.uptimeMillis() + c4492.f17300);
        } else if (i4 == 0) {
            c4492.f17308.remove(this);
            if (c4492.f17294 == this) {
                c4492.f17294 = null;
            }
            if (c4492.f17303 == this) {
                c4492.f17303 = null;
            }
            C5349 c5349 = c4492.f17306;
            HashSet hashSet = (HashSet) c5349.f20756;
            hashSet.remove(this);
            if (((C4488) c5349.f20757) == this) {
                c5349.f20757 = null;
                if (!hashSet.isEmpty()) {
                    C4488 c4488 = (C4488) hashSet.iterator().next();
                    c5349.f20757 = c4488;
                    C4495 c4495Mo8345 = c4488.f17262.mo8345();
                    c4488.f17284 = c4495Mo8345;
                    HandlerC4491 handlerC44912 = c4488.f17269;
                    int i5 = AbstractC4470.f17202;
                    c4495Mo8345.getClass();
                    handlerC44912.getClass();
                    handlerC44912.obtainMessage(1, new C4477(C4261.f16556.getAndIncrement(), true, SystemClock.elapsedRealtime(), c4495Mo8345)).sendToTarget();
                }
            }
            if (c4492.f17300 != -9223372036854775807L) {
                Handler handler2 = c4492.f17302;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c4492.f17296.remove(this);
            }
        }
        c4492.m10258();
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo10247(C4480 c4480) {
        m10244();
        if (this.f17274 < 0) {
            AbstractC4464.m10134("DefaultDrmSession", "Session reference count less than zero: " + this.f17274);
            this.f17274 = 0;
        }
        if (c4480 != null) {
            C4471 c4471 = this.f17272;
            synchronized (c4471.f17211) {
                try {
                    ArrayList arrayList = new ArrayList(c4471.f17210);
                    arrayList.add(c4480);
                    c4471.f17210 = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) c4471.f17208.get(c4480);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c4471.f17209);
                        hashSet.add(c4480);
                        c4471.f17209 = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    c4471.f17208.put(c4480, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.f17274 + 1;
        this.f17274 = i;
        if (i == 1) {
            AbstractC4464.m10132(this.f17271 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f17280 = handlerThread;
            handlerThread.start();
            this.f17269 = new HandlerC4491(this, this.f17280.getLooper());
            if (m10242()) {
                m10252(true);
            }
        } else if (c4480 != null && m10240() && this.f17272.m10220(c4480) == 1) {
            c4480.m10227(this.f17271);
        }
        C4492 c4492 = (C4492) this.f17282.ˆʿ;
        if (c4492.f17300 != -9223372036854775807L) {
            c4492.f17296.remove(this);
            Handler handler = c4492.f17302;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final DrmSession$DrmSessionException mo10248() {
        m10244();
        if (this.f17271 == 1) {
            return this.f17281;
        }
        return null;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC3586 mo10249() {
        m10244();
        return this.f17279;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m10250(int i, boolean z, byte[] bArr) {
        try {
            C4484 c4484Mo8349 = this.f17262.mo8349(bArr, this.f17275, i, this.f17277);
            this.f17285 = c4484Mo8349;
            HandlerC4491 handlerC4491 = this.f17269;
            int i2 = AbstractC4470.f17202;
            c4484Mo8349.getClass();
            handlerC4491.getClass();
            handlerC4491.obtainMessage(2, new C4477(C4261.f16556.getAndIncrement(), z, SystemClock.elapsedRealtime(), c4484Mo8349)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m10241(e, true);
        }
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final UUID mo10251() {
        m10244();
        return this.f17266;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m10252(boolean z) {
        long jMin;
        String str;
        Set set;
        boolean z2 = true;
        if (this.f17276) {
            return;
        }
        byte[] bArr = this.f17264;
        int i = AbstractC4470.f17202;
        if (this.f17267 == null) {
            m10250(1, z, bArr);
            return;
        }
        if (this.f17271 != 4) {
            try {
                this.f17262.mo8341(this.f17264, this.f17267);
            } catch (Exception | NoSuchMethodError e) {
                m10243(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (AbstractC2424.f9645.equals(this.f17266)) {
            m10244();
            byte[] bArr2 = this.f17264;
            Pair pair = null;
            Map mapMo8346 = bArr2 == null ? null : this.f17262.mo8346(bArr2);
            if (mapMo8346 != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapMo8346.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str2 = (String) mapMo8346.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            AbstractC4464.m10148("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m10250(2, z, bArr);
            return;
        }
        if (jMin <= 0) {
            m10243(2, new KeysExpiredException());
            return;
        }
        this.f17271 = 4;
        C4471 c4471 = this.f17272;
        synchronized (c4471.f17211) {
            set = c4471.f17209;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C4480) it.next()).m10225();
        }
    }
}
