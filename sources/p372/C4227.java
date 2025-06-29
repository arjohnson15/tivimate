package p372;

import android.support.v4.media.session.AbstractC0001;
import java.util.ArrayList;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p293.C3474;

/* renamed from: ᵢˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4227 implements InterfaceC4237 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f16366 = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f16367;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3474 f16368 = new C3474(8);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f16369;

    public C4227(int i) {
        this.f16367 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9678(int i, ArrayList arrayList) {
        if (AbstractC0001.m7(f16366, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2431 m9679(C2431 c2431) {
        if (!this.f16369 || !this.f16368.mo8055(c2431)) {
            return c2431;
        }
        C2417 c2417M6541 = c2431.m6541();
        c2417M6541.f9602 = AbstractC2435.m6559("application/x-media3-cues");
        c2417M6541.f9599 = this.f16368.mo8051(c2431);
        StringBuilder sb = new StringBuilder();
        sb.append(c2431.f9667);
        String str = c2431.f9663;
        sb.append(str != null ? " ".concat(str) : "");
        c2417M6541.f9627 = sb.toString();
        c2417M6541.f9621 = Long.MAX_VALUE;
        return new C2431(c2417M6541);
    }
}
