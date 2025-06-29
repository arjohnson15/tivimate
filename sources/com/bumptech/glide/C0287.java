package com.bumptech.glide;

import p009.InterfaceC0992;
import ʻˋ.ˋˊ;

/* renamed from: com.bumptech.glide.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0287 implements InterfaceC0992 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C0294 f2360;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˋˊ f2361;

    public C0287(ComponentCallbacks2C0294 componentCallbacks2C0294, ˋˊ r2) {
        this.f2360 = componentCallbacks2C0294;
        this.f2361 = r2;
    }

    @Override // p009.InterfaceC0992
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo1568(boolean z) {
        if (z) {
            synchronized (this.f2360) {
                this.f2361.ˏʾ();
            }
        }
    }
}
