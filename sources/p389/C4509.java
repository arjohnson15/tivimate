package p389;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import p139.C2122;
import p139.C2154;
import p197.ChoreographerFrameCallbackC2712;
import p331.C3762;
import p361.C4093;
import p361.C4105;
import ˈי.ʾˈ;

/* renamed from: ⁱʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4509 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f17340;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ʾˈ f17341;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f17342;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f17343;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C4512 f17344;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f17345;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f17346;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f17347;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f17348;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public float f17349;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f17350;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f17351;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public float f17352;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4105 f17353;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f17354;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final C4508 f17336 = new C4508(1);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final C4508 f17338 = new C4508(2);

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C4508 f17335 = new C4508(3);

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final C4508 f17337 = new C4508(4);

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final C4508 f17339 = new C4508(5);

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final C4508 f17334 = new C4508(0);

    public C4509(C4105 c4105, C4093 c4093) {
        this.f17349 = 0.0f;
        this.f17340 = Float.MAX_VALUE;
        this.f17348 = false;
        this.f17350 = false;
        this.f17351 = Float.MAX_VALUE;
        this.f17347 = -3.4028235E38f;
        this.f17354 = 0L;
        this.f17345 = new ArrayList();
        this.f17343 = new ArrayList();
        this.f17353 = c4105;
        this.f17341 = c4093;
        if (c4093 == f17335 || c4093 == f17337 || c4093 == f17339) {
            this.f17342 = 0.1f;
        } else if (c4093 == f17334 || c4093 == f17336 || c4093 == f17338) {
            this.f17342 = 0.00390625f;
        } else {
            this.f17342 = 1.0f;
        }
        this.f17344 = null;
        this.f17352 = Float.MAX_VALUE;
        this.f17346 = false;
    }

    public C4509(C4513 c4513) {
        this.f17349 = 0.0f;
        this.f17340 = Float.MAX_VALUE;
        this.f17348 = false;
        this.f17350 = false;
        this.f17351 = Float.MAX_VALUE;
        this.f17347 = -3.4028235E38f;
        this.f17354 = 0L;
        this.f17345 = new ArrayList();
        this.f17343 = new ArrayList();
        this.f17353 = null;
        this.f17341 = new C4510(c4513);
        this.f17342 = 1.0f;
        this.f17344 = null;
        this.f17352 = Float.MAX_VALUE;
        this.f17346 = false;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10271(float f) {
        ArrayList arrayList;
        this.f17341.ˏᴵ(this.f17353, f);
        int i = 0;
        while (true) {
            arrayList = this.f17343;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                C2154 c2154 = (C2154) arrayList.get(i);
                float f2 = this.f17340;
                C2122 c2122 = c2154.f8436;
                long jMax = Math.max(-1L, Math.min(c2122.f8459 + 1, Math.round(f2)));
                c2122.mo6021(jMax, c2154.f8438);
                c2154.f8438 = jMax;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10272(float f) {
        if (this.f17350) {
            this.f17352 = f;
            return;
        }
        if (this.f17344 == null) {
            this.f17344 = new C4512(f);
        }
        C4512 c4512 = this.f17344;
        double d = f;
        c4512.f17371 = d;
        double d2 = (float) d;
        if (d2 > this.f17351) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.f17347) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f17342 * 0.75f);
        c4512.f17370 = dAbs;
        c4512.f17363 = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f17350;
        if (z || z) {
            return;
        }
        this.f17350 = true;
        if (!this.f17348) {
            this.f17340 = this.f17341.ˏʾ(this.f17353);
        }
        float f2 = this.f17340;
        if (f2 > this.f17351 || f2 < this.f17347) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C4511.f17356;
        if (threadLocal.get() == null) {
            threadLocal.set(new C4511());
        }
        C4511 c4511 = (C4511) threadLocal.get();
        ArrayList arrayList = c4511.f17357;
        if (arrayList.size() == 0) {
            if (c4511.f17361 == null) {
                c4511.f17361 = new C3762(c4511.f17359);
            }
            C3762 c3762 = c4511.f17361;
            ((Choreographer) c3762.f14531).postFrameCallback((ChoreographerFrameCallbackC2712) c3762.f14532);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
