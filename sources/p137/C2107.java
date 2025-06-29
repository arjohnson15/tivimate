package p137;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p329.AbstractC3742;
import ˈˉ.ﹳﹳ;

/* renamed from: ˉˈ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2107 implements InterfaceC2105 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final Bitmap.Config f8320 = Bitmap.Config.ARGB_8888;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Set f8321;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f8322;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f8323;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ﹳﹳ f8324;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f8325;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long f8326;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2102 f8327;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f8328;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f8329;

    public C2107(long j) {
        C2102 c2102 = new C2102();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.f8326 = j;
        this.f8327 = c2102;
        this.f8321 = setUnmodifiableSet;
        this.f8324 = new ﹳﹳ(18);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized Bitmap m5973(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5955;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM5955 = this.f8327.m5955(i, i2, config != null ? config : f8320);
            if (bitmapM5955 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f8327.getClass();
                    sb.append(C2102.m5954(AbstractC3742.m8716(config) * i * i2, config));
                    sb.toString();
                }
                this.f8329++;
            } else {
                this.f8328++;
                long j = this.f8322;
                this.f8327.getClass();
                this.f8322 = j - AbstractC3742.m8712(bitmapM5955);
                this.f8324.getClass();
                bitmapM5955.setHasAlpha(true);
                bitmapM5955.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f8327.getClass();
                sb2.append(C2102.m5954(AbstractC3742.m8716(config) * i * i2, config));
                sb2.toString();
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m5975();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM5955;
    }

    @Override // p137.InterfaceC2105
    /* renamed from: ʿˏ */
    public final void mo5959() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
        }
        m5974(0L);
    }

    @Override // p137.InterfaceC2105
    /* renamed from: ˉⁱ */
    public final Bitmap mo5960(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5973 = m5973(i, i2, config);
        if (bitmapM5973 != null) {
            bitmapM5973.eraseColor(0);
            return bitmapM5973;
        }
        if (config == null) {
            config = f8320;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p137.InterfaceC2105
    /* renamed from: ˋⁱ */
    public final synchronized void mo5961(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f8327.getClass();
                if (AbstractC3742.m8712(bitmap) <= this.f8326 && this.f8321.contains(bitmap.getConfig())) {
                    this.f8327.getClass();
                    int iM8712 = AbstractC3742.m8712(bitmap);
                    this.f8327.m5956(bitmap);
                    this.f8324.getClass();
                    this.f8323++;
                    this.f8322 += iM8712;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f8327.getClass();
                        sb.append(C2102.m5954(AbstractC3742.m8712(bitmap), bitmap.getConfig()));
                        sb.toString();
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m5975();
                    }
                    m5974(this.f8326);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f8327.getClass();
                sb2.append(C2102.m5954(AbstractC3742.m8712(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f8321.contains(bitmap.getConfig()));
                sb2.toString();
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p137.InterfaceC2105
    /* renamed from: ˏʾ */
    public final Bitmap mo5962(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5973 = m5973(i, i2, config);
        if (bitmapM5973 != null) {
            return bitmapM5973;
        }
        if (config == null) {
            config = f8320;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m5974(long j) {
        while (this.f8322 > j) {
            try {
                C2102 c2102 = this.f8327;
                Bitmap bitmap = (Bitmap) c2102.f8307.m2498();
                if (bitmap != null) {
                    c2102.m5957(Integer.valueOf(AbstractC3742.m8712(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        m5975();
                    }
                    this.f8322 = 0L;
                    return;
                }
                this.f8324.getClass();
                long j2 = this.f8322;
                this.f8327.getClass();
                this.f8322 = j2 - AbstractC3742.m8712(bitmap);
                this.f8325++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f8327.getClass();
                    sb.append(C2102.m5954(AbstractC3742.m8712(bitmap), bitmap.getConfig()));
                    sb.toString();
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m5975();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5975() {
        String str = "Hits=" + this.f8328 + ", misses=" + this.f8329 + ", puts=" + this.f8323 + ", evictions=" + this.f8325 + ", currentSize=" + this.f8322 + ", maxSize=" + this.f8326 + "\nStrategy=" + this.f8327;
    }

    @Override // p137.InterfaceC2105
    /* renamed from: ᵎˏ */
    public final void mo5963(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            String str = "trimMemory, level=" + i;
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo5959();
        } else if (i >= 20 || i == 15) {
            m5974(this.f8326 / 2);
        }
    }
}
