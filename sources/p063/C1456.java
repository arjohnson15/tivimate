package p063;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p213.InterfaceC2811;
import p259.InterfaceC3214;
import p329.AbstractC3742;
import p346.C3993;
import p346.InterfaceC3990;

/* renamed from: ʾᐧ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1456 implements InterfaceC3214 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f5952;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f5953;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public InterfaceC3990 f5954;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Handler f5955;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f5956;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f5957;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Bitmap f5958;

    public C1456(Handler handler, int i, long j) {
        if (!AbstractC3742.m8717(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f5956 = Integer.MIN_VALUE;
        this.f5952 = Integer.MIN_VALUE;
        this.f5955 = handler;
        this.f5953 = i;
        this.f5957 = j;
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʽᐧ */
    public final void mo1557(Drawable drawable) {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʿʼ */
    public final void mo1558(Drawable drawable) {
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי */
    public final void mo1559() {
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ */
    public final void mo1560() {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ˏᵢ */
    public final void mo1561(Drawable drawable) {
        this.f5958 = null;
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ */
    public final void mo1562() {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ـﹶ */
    public final void mo1563(C3993 c3993) {
        c3993.m9254(this.f5956, this.f5952);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ٴˎ */
    public final void mo1564(C3993 c3993) {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ᐧʻ */
    public final InterfaceC3990 mo1565() {
        return this.f5954;
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹳﹳ */
    public final void mo1566(InterfaceC3990 interfaceC3990) {
        this.f5954 = interfaceC3990;
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹶˆ */
    public final void mo1567(Object obj, InterfaceC2811 interfaceC2811) {
        this.f5958 = (Bitmap) obj;
        Handler handler = this.f5955;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f5957);
    }
}
