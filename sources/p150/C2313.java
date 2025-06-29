package p150;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import p331.C3767;
import p417.AbstractC4753;
import p440.AbstractC5125;
import p440.C5124;
import ˏᵢ.ᵢٴ;
import ᵔᵔ.ٴˎ;
import ᵢ.ʿʼ;

/* renamed from: ˊʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2313 implements InterfaceC2315 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile C2313 f9133;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ConcurrentHashMap f9134;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᵢٴ f9135;

    public C2313(ᵢٴ r1) {
        AbstractC4753.m10683(r1);
        this.f9135 = r1;
        this.f9134 = new ConcurrentHashMap();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ٴˎ m6363(String str, C3767 c3767) {
        C3767 c37672;
        if (AbstractC5125.f19597.contains(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f9134;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        ᵢٴ r3 = this.f9135;
        if (zEquals) {
            c37672 = new C3767(20, false);
            c37672.f14558 = c3767;
            r3.ﾞʽ(new C5124(0, c37672));
            c37672.f14557 = new HashSet();
        } else if ("clx".equals(str)) {
            c37672 = new ʿʼ(21, false);
            ((ʿʼ) c37672).ˆʿ = c3767;
            r3.ﾞʽ(new C5124(1, c37672));
        } else {
            c37672 = null;
        }
        if (c37672 == null) {
            return null;
        }
        concurrentHashMap.put(str, c37672);
        return new ٴˎ(21);
    }
}
