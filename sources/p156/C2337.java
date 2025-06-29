package p156;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p137.C2106;
import p137.InterfaceC2105;
import p331.C3758;

/* renamed from: ˊˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2337 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte[] f9278;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int[] f9279;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C2334 f9280;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public Bitmap f9281;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int f9282;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f9283;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f9284;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public byte[] f9285;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3758 f9286;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final int f9287;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int[] f9288;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public short[] f9289;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte[] f9290;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean f9291;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public Boolean f9292;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int f9293;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ByteBuffer f9295;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public byte[] f9296;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f9277 = new int[256];

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public Bitmap.Config f9294 = Bitmap.Config.ARGB_8888;

    public C2337(C3758 c3758, C2334 c2334, ByteBuffer byteBuffer, int i) {
        this.f9286 = c3758;
        this.f9280 = new C2334();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f9284 = 0;
                this.f9280 = c2334;
                this.f9283 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9295 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f9295.order(ByteOrder.LITTLE_ENDIAN);
                this.f9291 = false;
                Iterator it = c2334.f9252.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C2336) it.next()).f9274 == 3) {
                        this.f9291 = true;
                        break;
                    }
                }
                this.f9287 = iHighestOneBit;
                int i2 = c2334.f9258;
                this.f9282 = i2 / iHighestOneBit;
                int i3 = c2334.f9259;
                this.f9293 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C2106 c2106 = (C2106) this.f9286.f14520;
                this.f9296 = c2106 == null ? new byte[i4] : (byte[]) c2106.m5971(i4, byte[].class);
                C3758 c37582 = this.f9286;
                int i5 = this.f9282 * this.f9293;
                C2106 c21062 = (C2106) c37582.f14520;
                this.f9279 = c21062 == null ? new int[i5] : (int[]) c21062.m5971(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized Bitmap m6422() {
        try {
            if (this.f9280.f9256 <= 0 || this.f9283 < 0) {
                if (Log.isLoggable("ﹳﹳ", 3)) {
                    String str = "Unable to decode frame, frameCount=" + this.f9280.f9256 + ", framePointer=" + this.f9283;
                }
                this.f9284 = 1;
            }
            int i = this.f9284;
            if (i != 1 && i != 2) {
                this.f9284 = 0;
                if (this.f9278 == null) {
                    C2106 c2106 = (C2106) this.f9286.f14520;
                    this.f9278 = c2106 == null ? new byte[255] : (byte[]) c2106.m5971(255, byte[].class);
                }
                C2336 c2336 = (C2336) this.f9280.f9252.get(this.f9283);
                int i2 = this.f9283 - 1;
                C2336 c23362 = i2 >= 0 ? (C2336) this.f9280.f9252.get(i2) : null;
                int[] iArr = c2336.f9269;
                if (iArr == null) {
                    iArr = this.f9280.f9257;
                }
                this.f9288 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("ﹳﹳ", 3)) {
                        String str2 = "No valid color table found for frame #" + this.f9283;
                    }
                    this.f9284 = 1;
                    return null;
                }
                if (c2336.f9273) {
                    System.arraycopy(iArr, 0, this.f9277, 0, iArr.length);
                    int[] iArr2 = this.f9277;
                    this.f9288 = iArr2;
                    iArr2[c2336.f9270] = 0;
                    if (c2336.f9274 == 2 && this.f9283 == 0) {
                        this.f9292 = Boolean.TRUE;
                    }
                }
                return m6425(c2336, c23362);
            }
            if (Log.isLoggable("ﹳﹳ", 3)) {
                String str3 = "Unable to decode frame, status=" + this.f9284;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6423(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f9294 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Bitmap m6424() {
        Boolean bool = this.f9292;
        Bitmap bitmapMo5962 = ((InterfaceC2105) this.f9286.f14519).mo5962(this.f9282, this.f9293, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f9294);
        bitmapMo5962.setHasAlpha(true);
        return bitmapMo5962;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6425(p156.C2336 r34, p156.C2336 r35) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p156.C2337.m6425(ˊˎ.ـﹶ, ˊˎ.ـﹶ):android.graphics.Bitmap");
    }
}
