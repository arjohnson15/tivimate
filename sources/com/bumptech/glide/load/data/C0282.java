package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;
import p137.C2106;
import p188.C2639;

/* renamed from: com.bumptech.glide.load.data.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0282 implements InterfaceC0279 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0275 f2326 = new C0275(0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f2327;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f2328;

    public C0282() {
        this.f2328 = 0;
        this.f2327 = new HashMap();
    }

    public C0282(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2328 = 1;
        this.f2327 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C0282(InputStream inputStream, C2106 c2106) {
        this.f2328 = 3;
        C2639 c2639 = new C2639(inputStream, c2106);
        this.f2327 = c2639;
        c2639.mark(5242880);
    }

    public C0282(Object obj) {
        this.f2328 = 2;
        this.f2327 = obj;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m1542() {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m1543() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0279
    /* renamed from: ʽᐧ */
    public void mo1538() {
        switch (this.f2328) {
            case 1:
            case 2:
                break;
            default:
                ((C2639) this.f2327).m6822();
                break;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public ParcelFileDescriptor m1544() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2327).rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0279
    /* renamed from: ـﹶ */
    public Object mo1539() {
        switch (this.f2328) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2327).rewind();
            case 2:
                return this.f2327;
            default:
                C2639 c2639 = (C2639) this.f2327;
                c2639.reset();
                return c2639;
        }
    }
}
