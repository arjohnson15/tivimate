package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0411 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f2701 = 0;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2702;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f2703;

    public /* synthetic */ C0411(int i, Object obj) {
        this.f2703 = i;
        this.f2702 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2703) {
            case 0:
                if (this.f2701 < ((C0429) this.f2702).f2728.length()) {
                }
                break;
            case 1:
                if (this.f2701 < ((C0429) this.f2702).f2728.length()) {
                }
                break;
            default:
                if (this.f2701 < ((C0335) this.f2702).m1872()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f2703) {
            case 0:
                int i = this.f2701;
                C0429 c0429 = (C0429) this.f2702;
                if (i >= c0429.f2728.length()) {
                    throw new NoSuchElementException();
                }
                String str = c0429.f2728;
                int i2 = this.f2701;
                this.f2701 = i2 + 1;
                return new C0429(String.valueOf(str.charAt(i2)));
            case 1:
                if (this.f2701 >= ((C0429) this.f2702).f2728.length()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f2701;
                this.f2701 = i3 + 1;
                return new C0429(String.valueOf(i3));
            default:
                int i4 = this.f2701;
                C0335 c0335 = (C0335) this.f2702;
                if (i4 >= c0335.m1872()) {
                    throw new NoSuchElementException(ـˈ.ˉᵎ.ˉⁱ("Out of bounds index: ", this.f2701));
                }
                int i5 = this.f2701;
                this.f2701 = i5 + 1;
                return c0335.m1868(i5);
        }
    }
}
