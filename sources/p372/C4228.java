package p372;

import java.util.Map;
import p076.C1653;
import p166.C2401;
import p166.C2405;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2425;
import p374.C4296;
import p380.C4435;
import p385.C4480;
import p385.InterfaceC4483;

/* renamed from: ᵢˆ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4228 extends C4296 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C2405 f16370;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Map f16371;

    public C4228(C1653 c1653, InterfaceC4483 interfaceC4483, C4480 c4480, Map map) {
        super(c1653, interfaceC4483, c4480);
        this.f16371 = map;
    }

    @Override // p374.C4296
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C2431 mo9680(C2431 c2431) {
        C2405 c2405;
        C2405 c24052 = this.f16370;
        if (c24052 == null) {
            c24052 = c2431.f9685;
        }
        if (c24052 != null && (c2405 = (C2405) this.f16371.get(c24052.f9501)) != null) {
            c24052 = c2405;
        }
        C2401 c2401 = c2431.f9670;
        C2401 c24012 = null;
        if (c2401 == null) {
            c2401 = c24012;
        } else {
            InterfaceC2425[] interfaceC2425Arr = c2401.f9491;
            int length = interfaceC2425Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                InterfaceC2425 interfaceC2425 = interfaceC2425Arr[i2];
                if ((interfaceC2425 instanceof C4435) && "com.apple.streaming.transportStreamTimestamp".equals(((C4435) interfaceC2425).f17094)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    InterfaceC2425[] interfaceC2425Arr2 = new InterfaceC2425[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            interfaceC2425Arr2[i < i2 ? i : i - 1] = interfaceC2425Arr[i];
                        }
                        i++;
                    }
                    c24012 = new C2401(interfaceC2425Arr2);
                }
                c2401 = c24012;
            }
        }
        if (c24052 != c2431.f9685 || c2401 != c2431.f9670) {
            C2417 c2417M6541 = c2431.m6541();
            c2417M6541.f9612 = c24052;
            c2417M6541.f9601 = c2401;
            c2431 = new C2431(c2417M6541);
        }
        return super.mo9680(c2431);
    }
}
