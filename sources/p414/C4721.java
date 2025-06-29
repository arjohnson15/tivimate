package p414;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p065.ExecutorC1522;
import p395.AbstractC4535;
import p457.AbstractC5388;
import p457.C5368;
import p457.C5391;
import ᴵי.ˏᴵ;
import ⁱـ.ˑי;

/* renamed from: ﹳـ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4721 extends ˑי {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final String f18110 = C5391.m12164("WorkContinuationImpl");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4722 f18111;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList f18112 = new ArrayList();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C5368 f18113;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f18114;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final List f18115;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f18116;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f18117;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList f18118;

    public C4721(C4722 c4722, String str, int i, List list) {
        this.f18111 = c4722;
        this.f18116 = str;
        this.f18117 = i;
        this.f18115 = list;
        this.f18118 = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((AbstractC5388) list.get(i2)).f20861.f14564 != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((AbstractC5388) list.get(i2)).f20863.toString();
            this.f18118.add(string);
            this.f18112.add(string);
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static HashSet m10632(C4721 c4721) {
        HashSet hashSet = new HashSet();
        c4721.getClass();
        return hashSet;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C5368 m10633() {
        if (this.f18114) {
            C5391.m12163().m12166(f18110, "Already enqueued work ids (" + TextUtils.join(", ", this.f18118) + ")");
        } else {
            this.f18113 = AbstractC4535.m10339((ExecutorC1522) this.f18111.f18125.ᐧⁱ, new ˏᴵ(6, this));
        }
        return this.f18113;
    }
}
