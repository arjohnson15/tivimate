package com.bumptech.glide.load.data;

import java.io.InputStream;
import p137.C2106;

/* renamed from: com.bumptech.glide.load.data.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0273 implements InterfaceC0278 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2106 f2317;

    public C0273(C2106 c2106) {
        this.f2317 = c2106;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0278
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0279 mo1536(Object obj) {
        return new C0282((InputStream) obj, this.f2317);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0278
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class mo1537() {
        return InputStream.class;
    }
}
