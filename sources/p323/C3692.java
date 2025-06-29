package p323;

import java.util.ArrayList;
import java.util.Arrays;
import p034.AbstractC1227;

/* renamed from: ᴵˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3692 extends AbstractC1227 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ArrayList f14214;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f14215;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ArrayList f14216;

    public C3692(int i, long j) {
        super(i, 4);
        this.f14215 = j;
        this.f14216 = new ArrayList();
        this.f14214 = new ArrayList();
    }

    @Override // p034.AbstractC1227
    public final String toString() {
        return AbstractC1227.m4400(this.f5033) + " leaves: " + Arrays.toString(this.f14216.toArray()) + " containers: " + Arrays.toString(this.f14214.toArray());
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final C3692 m8647(int i) {
        ArrayList arrayList = this.f14214;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3692 c3692 = (C3692) arrayList.get(i2);
            if (c3692.f5033 == i) {
                return c3692;
            }
        }
        return null;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final C3681 m8648(int i) {
        ArrayList arrayList = this.f14216;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3681 c3681 = (C3681) arrayList.get(i2);
            if (c3681.f5033 == i) {
                return c3681;
            }
        }
        return null;
    }
}
