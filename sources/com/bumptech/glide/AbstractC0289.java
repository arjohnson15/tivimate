package com.bumptech.glide;

import p213.C2810;
import p213.InterfaceC2813;
import p329.AbstractC3742;

/* renamed from: com.bumptech.glide.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0289 implements Cloneable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC2813 f2374 = C2810.f10952;

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0289) {
            return AbstractC3742.m8708(this.f2374, ((AbstractC0289) obj).f2374);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC2813 interfaceC2813 = this.f2374;
        if (interfaceC2813 != null) {
            return interfaceC2813.hashCode();
        }
        return 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC0289 clone() {
        try {
            return (AbstractC0289) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
