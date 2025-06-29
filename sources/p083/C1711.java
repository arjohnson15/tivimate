package p083;

import p003.C0902;
import p003.C0914;
import p003.C0915;
import p003.InterfaceC0889;
import p003.InterfaceC0913;
import p327.C3724;
import p430.C4999;
import ʾי.ˑʽ;

/* renamed from: ʿـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1711 implements InterfaceC0889 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile C4999 f6672;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f6673;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6674;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1711(int i) {
        this(f6672);
        this.f6674 = i;
        switch (i) {
            case 1:
                this.f6673 = new C0902(3);
                return;
            case 2:
                this.f6673 = new ˑʽ(6);
                return;
            default:
                if (f6672 == null) {
                    synchronized (C1711.class) {
                        try {
                            if (f6672 == null) {
                                f6672 = new C4999();
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    public C1711(C4999 c4999) {
        this.f6674 = 0;
        this.f6673 = c4999;
    }

    @Override // p003.InterfaceC0889
    /* renamed from: ـﹶ */
    public final InterfaceC0913 mo3711(C0914 c0914) {
        switch (this.f6674) {
            case 0:
                return new C0915(3, (C4999) this.f6673);
            case 1:
                return new C0915(1, (C0902) this.f6673);
            default:
                return new C3724((ˑʽ) this.f6673);
        }
    }
}
