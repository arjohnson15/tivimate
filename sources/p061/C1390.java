package p061;

import java.util.List;

/* renamed from: ʾـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1390 extends AbstractC1361 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f5670;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f5671;

    public /* synthetic */ C1390(Runnable runnable, int i) {
        this.f5671 = i;
        this.f5670 = runnable;
    }

    @Override // p061.AbstractC1361
    /* renamed from: ˉⁱ */
    public final int mo965() {
        switch (this.f5671) {
        }
        return ((List) ((RunnableC1432) this.f5670).f5862).size();
    }

    @Override // p061.AbstractC1361
    /* renamed from: ˏʾ */
    public final int mo966() {
        switch (this.f5671) {
        }
        return ((List) ((RunnableC1432) this.f5670).f5864).size();
    }

    @Override // p061.AbstractC1361
    /* renamed from: ˑʽ */
    public final boolean mo967(int i, int i2) {
        switch (this.f5671) {
            case 0:
                RunnableC1432 runnableC1432 = (RunnableC1432) this.f5670;
                Object obj = ((List) runnableC1432.f5862).get(i);
                Object obj2 = ((List) runnableC1432.f5864).get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((AbstractC1361) ((C1365) runnableC1432.f5863).f5539.f14528).m4735(obj, obj2);
            default:
                RunnableC1432 runnableC14322 = (RunnableC1432) this.f5670;
                Object obj3 = ((List) runnableC14322.f5862).get(i);
                Object obj4 = ((List) runnableC14322.f5864).get(i2);
                return (obj3 == null || obj4 == null) ? obj3 == null && obj4 == null : ((AbstractC1361) ((C1435) runnableC14322.f5863).f5874.f14528).m4735(obj3, obj4);
        }
    }

    @Override // p061.AbstractC1361
    /* renamed from: ـﹶ */
    public final boolean mo968(int i, int i2) {
        switch (this.f5671) {
            case 0:
                RunnableC1432 runnableC1432 = (RunnableC1432) this.f5670;
                Object obj = ((List) runnableC1432.f5862).get(i);
                Object obj2 = ((List) runnableC1432.f5864).get(i2);
                if (obj != null && obj2 != null) {
                    return ((AbstractC1361) ((C1365) runnableC1432.f5863).f5539.f14528).m4733(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            default:
                RunnableC1432 runnableC14322 = (RunnableC1432) this.f5670;
                Object obj3 = ((List) runnableC14322.f5862).get(i);
                Object obj4 = ((List) runnableC14322.f5864).get(i2);
                if (obj3 != null && obj4 != null) {
                    return ((AbstractC1361) ((C1435) runnableC14322.f5863).f5874.f14528).m4733(obj3, obj4);
                }
                if (obj3 == null && obj4 == null) {
                    return true;
                }
                throw new AssertionError();
        }
    }

    @Override // p061.AbstractC1361
    /* renamed from: ﹶˆ */
    public final Object mo969(int i, int i2) {
        switch (this.f5671) {
            case 0:
                RunnableC1432 runnableC1432 = (RunnableC1432) this.f5670;
                Object obj = ((List) runnableC1432.f5862).get(i);
                Object obj2 = ((List) runnableC1432.f5864).get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return ((AbstractC1361) ((C1365) runnableC1432.f5863).f5539.f14528).m4734(obj, obj2);
            default:
                RunnableC1432 runnableC14322 = (RunnableC1432) this.f5670;
                Object obj3 = ((List) runnableC14322.f5862).get(i);
                Object obj4 = ((List) runnableC14322.f5864).get(i2);
                if (obj3 == null || obj4 == null) {
                    throw new AssertionError();
                }
                return ((AbstractC1361) ((C1435) runnableC14322.f5863).f5874.f14528).m4734(obj3, obj4);
        }
    }
}
