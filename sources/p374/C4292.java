package p374;

import java.util.List;
import p036.InterfaceC1239;
import p166.C2431;
import p166.C2433;
import p256.AbstractC3191;
import p256.InterfaceC3194;

/* renamed from: ᵢˎ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4292 implements InterfaceC1239 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2433 f16699;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1239 f16700;

    public C4292(InterfaceC1239 interfaceC1239, C2433 c2433) {
        this.f16700 = interfaceC1239;
        this.f16699 = c2433;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4292)) {
            return false;
        }
        C4292 c4292 = (C4292) obj;
        return this.f16700.equals(c4292.f16700) && this.f16699.equals(c4292.f16699);
    }

    public final int hashCode() {
        return this.f16700.hashCode() + ((this.f16699.hashCode() + 527) * 31);
    }

    @Override // p036.InterfaceC1239
    public final int length() {
        return this.f16700.length();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʽᐧ */
    public final void mo4431(boolean z) {
        this.f16700.mo4431(z);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʿʼ */
    public final void mo4432() {
        this.f16700.mo4432();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʿˏ */
    public final int mo4433(int i) {
        return this.f16700.mo4433(i);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˉי */
    public final C2433 mo4434() {
        return this.f16699;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˉⁱ */
    public final int mo4448() {
        return this.f16700.mo4448();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˋⁱ */
    public final int mo4449() {
        return this.f16700.mo4449();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˎٴ */
    public final void mo4450(long j, long j2, long j3, List list, InterfaceC3194[] interfaceC3194Arr) {
        this.f16700.mo4450(j, j2, j3, list, interfaceC3194Arr);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏʾ */
    public final C2431 mo4435() {
        return this.f16699.f9700[this.f16700.mo4447()];
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏᴵ */
    public final void mo4436(float f) {
        this.f16700.mo4436(f);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏᵢ */
    public final void mo4437() {
        this.f16700.mo4437();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˑʽ */
    public final boolean mo4438(int i, long j) {
        return this.f16700.mo4438(i, j);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˑי */
    public final Object mo4451() {
        return this.f16700.mo4451();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ـﹶ */
    public final int mo4439(C2431 c2431) {
        return this.f16700.mo4433(this.f16699.m6544(c2431));
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ٴˎ */
    public final int mo4440(int i) {
        return this.f16700.mo4440(i);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᐧʻ */
    public final int mo4441(long j, List list) {
        return this.f16700.mo4441(j, list);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᴵʿ */
    public final boolean mo4442(int i, long j) {
        return this.f16700.mo4442(i, j);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᵎˏ */
    public final boolean mo4443(long j, AbstractC3191 abstractC3191, List list) {
        return this.f16700.mo4443(j, abstractC3191, list);
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᵎـ */
    public final void mo4444() {
        this.f16700.mo4444();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹳˎ */
    public final void mo4445() {
        this.f16700.mo4445();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹳﹳ */
    public final C2431 mo4446(int i) {
        return this.f16699.f9700[this.f16700.mo4440(i)];
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹶˆ */
    public final int mo4447() {
        return this.f16700.mo4447();
    }
}
