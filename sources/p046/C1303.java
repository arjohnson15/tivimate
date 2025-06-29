package p046;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import p261.InterfaceC3251;
import p329.AbstractC3740;
import p329.AbstractC3742;

/* renamed from: ʽᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1303 implements InterfaceC3251 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f5326;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5327;

    public /* synthetic */ C1303(int i, Object obj) {
        this.f5327 = i;
        this.f5326 = obj;
    }

    public C1303(File file) {
        this.f5327 = 3;
        AbstractC3740.m8706(file, "Argument must not be null");
        this.f5326 = file;
    }

    public C1303(byte[] bArr) {
        this.f5327 = 0;
        AbstractC3740.m8706(bArr, "Argument must not be null");
        this.f5326 = bArr;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m4598() {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m4599() {
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    private final void m4600() {
    }

    @Override // p261.InterfaceC3251
    public final Object get() {
        switch (this.f5327) {
            case 0:
                return (byte[]) this.f5326;
            case 1:
                return (Bitmap) this.f5326;
            case 2:
                return (AnimatedImageDrawable) this.f5326;
            default:
                return (File) this.f5326;
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int mo4601() {
        switch (this.f5327) {
            case 0:
                return ((byte[]) this.f5326).length;
            case 1:
                return AbstractC3742.m8712((Bitmap) this.f5326);
            case 2:
                return AbstractC3742.m8716(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f5326).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f5326).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo4602() {
        switch (this.f5327) {
            case 2:
                ((AnimatedImageDrawable) this.f5326).stop();
                ((AnimatedImageDrawable) this.f5326).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Class mo4603() {
        switch (this.f5327) {
            case 0:
                return byte[].class;
            case 1:
                return Bitmap.class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f5326).getClass();
        }
    }
}
