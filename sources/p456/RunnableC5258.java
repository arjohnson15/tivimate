package p456;

import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5258 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ BinderC5240 f20366;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ C5253 f20367;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20368;

    public /* synthetic */ RunnableC5258(BinderC5240 binderC5240, C5253 c5253, int i) {
        this.f20368 = i;
        this.f20367 = c5253;
        this.f20366 = binderC5240;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        switch (this.f20368) {
            case 0:
                C5273 c5273 = this.f20366.f20139;
                c5273.m11819();
                c5273.m11805(this.f20367);
                break;
            case 1:
                C5273 c52732 = this.f20366.f20139;
                c52732.m11819();
                c52732.m11841(this.f20367);
                break;
            case 2:
                BinderC5240 binderC5240 = this.f20366;
                binderC5240.f20139.m11819();
                C5273 c52733 = binderC5240.f20139;
                c52733.mo11648().m11740();
                c52733.m11794();
                C5253 c5253 = this.f20367;
                AbstractC4753.m10688(c5253.f20334);
                c52733.m11804(c5253);
                break;
            case 3:
                BinderC5240 binderC52402 = this.f20366;
                binderC52402.f20139.m11819();
                C5273 c52734 = binderC52402.f20139;
                c52734.mo11648().m11740();
                c52734.m11794();
                C5253 c52532 = this.f20367;
                AbstractC4753.m10683(c52532);
                String str = c52532.f20334;
                AbstractC4753.m10688(str);
                if (c52734.m11832().m11727(null, AbstractC5248.f20254)) {
                    int i = 0;
                    if (c52734.m11832().m11727(null, AbstractC5248.f20250)) {
                        c52734.mo11653().getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iM11731 = c52734.m11832().m11731(null, AbstractC5248.f20297);
                        c52734.m11832();
                        long jLongValue = jCurrentTimeMillis - ((Long) AbstractC5248.f20198.m11751(null)).longValue();
                        while (i < iM11731 && c52734.m11825(null, jLongValue)) {
                            i++;
                        }
                    } else {
                        c52734.m11832();
                        long jIntValue = ((Integer) AbstractC5248.f20216.m11751(null)).intValue();
                        while (i < jIntValue && c52734.m11825(str, 0L)) {
                            i++;
                        }
                    }
                    if (c52734.m11832().m11727(null, AbstractC5248.f20270)) {
                        c52734.m11824();
                        break;
                    }
                }
                break;
            case 4:
                BinderC5240 binderC52403 = this.f20366;
                binderC52403.f20139.m11819();
                binderC52403.f20139.m11812(this.f20367);
                break;
            case 5:
                BinderC5240 binderC52404 = this.f20366;
                binderC52404.f20139.m11819();
                binderC52404.f20139.m11831(this.f20367);
                break;
            default:
                BinderC5240 binderC52405 = this.f20366;
                binderC52405.f20139.m11819();
                C5273 c52735 = binderC52405.f20139;
                c52735.mo11648().m11740();
                c52735.m11794();
                C5253 c52533 = this.f20367;
                AbstractC4753.m10688(c52533.f20334);
                c52735.m11805(c52533);
                c52735.m11841(c52533);
                break;
        }
    }
}
