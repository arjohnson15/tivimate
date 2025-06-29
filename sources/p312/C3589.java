package p312;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;
import p034.AbstractC1227;
import p166.AbstractC2426;
import p166.C2431;
import ـˈ.ˉᵎ;

/* renamed from: ᐧᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3589 extends AbstractC1227 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ByteBuffer f13800;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ByteBuffer f13801;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C2431 f13802;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f13803;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3583 f13804;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int f13805;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f13806;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f13807;

    static {
        AbstractC2426.m6526("media3.decoder");
    }

    public C3589(int i, int i2) {
        super(3);
        this.f13804 = new C3583();
        this.f13803 = i;
        this.f13805 = i2;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m8491(int i) {
        int i2 = i + this.f13805;
        ByteBuffer byteBuffer = this.f13800;
        if (byteBuffer == null) {
            this.f13800 = m8493(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f13800 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM8493 = m8493(i3);
        byteBufferM8493.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM8493.put(byteBuffer);
        }
        this.f13800 = byteBufferM8493;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void mo8492() {
        this.f5033 = 0;
        ByteBuffer byteBuffer = this.f13800;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13801;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13806 = false;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final ByteBuffer m8493(int i) {
        int i2 = this.f13803;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f13800;
        throw new DecoderInputBuffer$InsufficientCapacityException(ˉᵎ.ˋⁱ("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m8494() {
        ByteBuffer byteBuffer = this.f13800;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13801;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
