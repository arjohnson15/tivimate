package p302;

import com.google.firebase.encoders.EncodingException;
import p103.C1787;
import p103.InterfaceC1791;

/* renamed from: ᐧʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3512 implements InterfaceC1791 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1787 f13617;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3508 f13619;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f13618 = false;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f13616 = false;

    public C3512(C3508 c3508) {
        this.f13619 = c3508;
    }

    @Override // p103.InterfaceC1791
    /* renamed from: ʿʼ */
    public final InterfaceC1791 mo4583(boolean z) {
        if (this.f13618) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f13618 = true;
        this.f13619.m8387(this.f13617, z ? 1 : 0, this.f13616);
        return this;
    }

    @Override // p103.InterfaceC1791
    /* renamed from: ﹳﹳ */
    public final InterfaceC1791 mo4590(String str) {
        if (this.f13618) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f13618 = true;
        this.f13619.m8390(this.f13617, str, this.f13616);
        return this;
    }
}
