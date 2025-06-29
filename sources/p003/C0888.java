package p003;

import android.util.Log;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p329.AbstractC3731;

/* renamed from: ʻʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0888 implements InterfaceC0270 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f4016;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4017;

    public /* synthetic */ C0888(int i, Object obj) {
        this.f4017 = i;
        this.f4016 = obj;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m3707() {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    private final void m3708() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m3709() {
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    private final void m3710() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        int i = this.f4017;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() {
        int i = this.f4017;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (this.f4017) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f4016.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        switch (this.f4017) {
            case 0:
                try {
                    interfaceC0281.mo1540(AbstractC3731.m8695((File) this.f4016));
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    }
                    interfaceC0281.mo1541(e);
                    return;
                }
            default:
                interfaceC0281.mo1540(this.f4016);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        switch (this.f4017) {
        }
        return 1;
    }
}
