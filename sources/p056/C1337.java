package p056;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: ʾˈ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1337 implements InterfaceC1335 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5447;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1333 f5448;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C1334 f5449;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ShortBuffer f5450;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ByteBuffer f5451;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ByteBuffer f5452;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f5453;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1333 f5454;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f5455;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f5456;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1333 f5457;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C1333 f5458;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f5459;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f5460;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f5461;

    @Override // p056.InterfaceC1335
    public final void flush() {
        if (mo4652()) {
            C1333 c1333 = this.f5448;
            this.f5458 = c1333;
            C1333 c13332 = this.f5457;
            this.f5454 = c13332;
            if (this.f5461) {
                this.f5449 = new C1334(c1333.f5418, c1333.f5416, this.f5455, this.f5460, c13332.f5418);
            } else {
                C1334 c1334 = this.f5449;
                if (c1334 != null) {
                    c1334.f5428 = 0;
                    c1334.f5426 = 0;
                    c1334.f5429 = 0;
                    c1334.f5432 = 0;
                    c1334.f5438 = 0;
                    c1334.f5427 = 0;
                    c1334.f5437 = 0;
                    c1334.f5439 = 0;
                    c1334.f5422 = 0;
                    c1334.f5425 = 0;
                }
            }
        }
        this.f5451 = InterfaceC1335.f5442;
        this.f5459 = 0L;
        this.f5453 = 0L;
        this.f5456 = false;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ʽᐧ */
    public final boolean mo4652() {
        return this.f5457.f5418 != -1 && (Math.abs(this.f5455 - 1.0f) >= 1.0E-4f || Math.abs(this.f5460 - 1.0f) >= 1.0E-4f || this.f5457.f5418 != this.f5448.f5418);
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ʿʼ */
    public final C1333 mo4653(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        if (c1333.f5417 != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c1333);
        }
        int i = this.f5447;
        if (i == -1) {
            i = c1333.f5418;
        }
        this.f5448 = c1333;
        C1333 c13332 = new C1333(i, c1333.f5416, 2);
        this.f5457 = c13332;
        this.f5461 = true;
        return c13332;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ˑʽ */
    public final boolean mo4654() {
        C1334 c1334;
        return this.f5456 && ((c1334 = this.f5449) == null || (c1334.f5426 * c1334.f5420) * 2 == 0);
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ـﹶ */
    public final void mo4655() {
        this.f5455 = 1.0f;
        this.f5460 = 1.0f;
        C1333 c1333 = C1333.f5415;
        this.f5448 = c1333;
        this.f5457 = c1333;
        this.f5458 = c1333;
        this.f5454 = c1333;
        ByteBuffer byteBuffer = InterfaceC1335.f5442;
        this.f5452 = byteBuffer;
        this.f5450 = byteBuffer.asShortBuffer();
        this.f5451 = byteBuffer;
        this.f5447 = -1;
        this.f5461 = false;
        this.f5449 = null;
        this.f5459 = 0L;
        this.f5453 = 0L;
        this.f5456 = false;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ٴˎ */
    public final void mo4656() {
        C1334 c1334 = this.f5449;
        if (c1334 != null) {
            int i = c1334.f5428;
            float f = c1334.f5431;
            float f2 = c1334.f5440;
            int i2 = c1334.f5426 + ((int) ((((i / (f / f2)) + c1334.f5429) / (c1334.f5421 * f2)) + 0.5f));
            short[] sArr = c1334.f5423;
            int i3 = c1334.f5430 * 2;
            c1334.f5423 = c1334.m4648(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = c1334.f5420;
                if (i4 >= i3 * i5) {
                    break;
                }
                c1334.f5423[(i5 * i) + i4] = 0;
                i4++;
            }
            c1334.f5428 = i3 + c1334.f5428;
            c1334.m4650();
            if (c1334.f5426 > i2) {
                c1334.f5426 = i2;
            }
            c1334.f5428 = 0;
            c1334.f5427 = 0;
            c1334.f5429 = 0;
        }
        this.f5456 = true;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    public final void mo4657(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1334 c1334 = this.f5449;
            c1334.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f5459 += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c1334.f5420;
            int i2 = iRemaining2 / i;
            short[] sArrM4648 = c1334.m4648(c1334.f5423, c1334.f5428, i2);
            c1334.f5423 = sArrM4648;
            shortBufferAsShortBuffer.get(sArrM4648, c1334.f5428 * i, ((i2 * i) * 2) / 2);
            c1334.f5428 += i2;
            c1334.m4650();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ﹳﹳ */
    public final ByteBuffer mo4658() {
        C1334 c1334 = this.f5449;
        if (c1334 != null) {
            int i = c1334.f5426;
            int i2 = c1334.f5420;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f5452.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f5452 = byteBufferOrder;
                    this.f5450 = byteBufferOrder.asShortBuffer();
                } else {
                    this.f5452.clear();
                    this.f5450.clear();
                }
                ShortBuffer shortBuffer = this.f5450;
                int iMin = Math.min(shortBuffer.remaining() / i2, c1334.f5426);
                int i4 = iMin * i2;
                shortBuffer.put(c1334.f5424, 0, i4);
                int i5 = c1334.f5426 - iMin;
                c1334.f5426 = i5;
                short[] sArr = c1334.f5424;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f5453 += i3;
                this.f5452.limit(i3);
                this.f5451 = this.f5452;
            }
        }
        ByteBuffer byteBuffer = this.f5451;
        this.f5451 = InterfaceC1335.f5442;
        return byteBuffer;
    }
}
