package p456;

import p200.C2741;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5291 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ String f20539;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ long f20540;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5241 f20541;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20542;

    public /* synthetic */ RunnableC5291(C5241 c5241, String str, long j, int i) {
        this.f20542 = i;
        this.f20539 = str;
        this.f20540 = j;
        this.f20541 = c5241;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20542) {
            case 0:
                C5241 c5241 = this.f20541;
                c5241.m11846();
                String str = this.f20539;
                AbstractC4753.m10688(str);
                C2741 c2741 = c5241.f20141;
                Integer num = (Integer) c2741.get(str);
                if (num == null) {
                    c5241.ˏᵢ().f20571.m4531(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    C5297 c5297M12009 = c5241.m11849().m12009(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        c2741.put(str, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        c2741.remove(str);
                        C2741 c27412 = c5241.f20140;
                        Long l = (Long) c27412.get(str);
                        long j = this.f20540;
                        if (l == null) {
                            c5241.ˏᵢ().f20571.m4533("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c27412.remove(str);
                            c5241.m11691(str, jLongValue, c5297M12009);
                        }
                        if (c2741.isEmpty()) {
                            long j2 = c5241.f20142;
                            if (j2 != 0) {
                                c5241.m11693(j - j2, c5297M12009);
                                c5241.f20142 = 0L;
                                break;
                            } else {
                                c5241.ˏᵢ().f20571.m4533("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C5241 c52412 = this.f20541;
                c52412.m11846();
                String str2 = this.f20539;
                AbstractC4753.m10688(str2);
                C2741 c27413 = c52412.f20141;
                boolean zIsEmpty = c27413.isEmpty();
                long j3 = this.f20540;
                if (zIsEmpty) {
                    c52412.f20142 = j3;
                }
                Integer num2 = (Integer) c27413.get(str2);
                if (num2 == null) {
                    if (c27413.f10778 < 100) {
                        c27413.put(str2, 1);
                        c52412.f20140.put(str2, Long.valueOf(j3));
                        break;
                    } else {
                        c52412.ˏᵢ().f20568.m4533("Too many ads visible");
                        break;
                    }
                } else {
                    c27413.put(str2, Integer.valueOf(num2.intValue() + 1));
                    break;
                }
        }
    }
}
