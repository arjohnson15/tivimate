package p061;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p378.AbstractC4345;

/* renamed from: ʾـ.ʽⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1362 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5520;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f5521;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public OverScroller f5522;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Interpolator f5523;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f5524;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f5525;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5526;

    public RunnableC1362(RecyclerView recyclerView) {
        this.f5526 = recyclerView;
        InterpolatorC1381 interpolatorC1381 = RecyclerView.f1645;
        this.f5523 = interpolatorC1381;
        this.f5521 = false;
        this.f5525 = false;
        this.f5522 = new OverScroller(recyclerView.getContext(), interpolatorC1381);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f5526;
        if (recyclerView.f1683 == null) {
            recyclerView.removeCallbacks(this);
            this.f5522.abortAnimation();
            return;
        }
        this.f5525 = false;
        this.f5521 = true;
        recyclerView.m1303();
        OverScroller overScroller = this.f5522;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f5524;
            int i6 = currY - this.f5520;
            this.f5524 = currX;
            this.f5520 = currY;
            int iM1273 = RecyclerView.m1273(i5, recyclerView.f1690, recyclerView.f1701, recyclerView.getWidth());
            int iM12732 = RecyclerView.m1273(i6, recyclerView.f1703, recyclerView.f1680, recyclerView.getHeight());
            int[] iArr = recyclerView.f1711;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM1284 = recyclerView.m1284(iM1273, iM12732, 1, iArr, null);
            int[] iArr2 = recyclerView.f1711;
            if (zM1284) {
                iM1273 -= iArr2[0];
                iM12732 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1314(iM1273, iM12732);
            }
            if (recyclerView.f1684 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1310(iM1273, iM12732, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = iM1273 - i7;
                int i10 = iM12732 - i8;
                C1425 c1425 = recyclerView.f1683.f5718;
                if (c1425 != null && !c1425.f5818 && c1425.f5805) {
                    int iM4948 = recyclerView.f1705.m4948();
                    if (iM4948 == 0) {
                        c1425.m4946();
                    } else if (c1425.f5814 >= iM4948) {
                        c1425.f5814 = iM4948 - 1;
                        c1425.m4947(i7, i8);
                    } else {
                        c1425.m4947(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = iM1273;
                i2 = iM12732;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1708.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1711;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.m1293(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.m1329(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C1425 c14252 = recyclerView.f1683.f5718;
            if ((c14252 == null || !c14252.f5818) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m1306();
                        if (recyclerView.f1690.isFinished()) {
                            recyclerView.f1690.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m1325();
                        if (recyclerView.f1701.isFinished()) {
                            recyclerView.f1701.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1287();
                        if (recyclerView.f1703.isFinished()) {
                            recyclerView.f1703.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1328();
                        if (recyclerView.f1680.isFinished()) {
                            recyclerView.f1680.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC4345.f16838;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1638) {
                    C1423 c1423 = recyclerView.f1718;
                    int[] iArr4 = c1423.f5795;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1423.f5796 = 0;
                }
            } else {
                m4736();
                RunnableC1378 runnableC1378 = recyclerView.f1702;
                if (runnableC1378 != null) {
                    runnableC1378.m4787(recyclerView, i4, i11);
                }
            }
        }
        C1425 c14253 = recyclerView.f1683.f5718;
        if (c14253 != null && c14253.f5818) {
            c14253.m4947(0, 0);
        }
        this.f5521 = false;
        if (!this.f5525) {
            recyclerView.setScrollState(0);
            recyclerView.m1279(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            recyclerView.postOnAnimation(this);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4736() {
        if (this.f5521) {
            this.f5525 = true;
            return;
        }
        RecyclerView recyclerView = this.f5526;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4737(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f5526;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f1645;
        }
        if (this.f5523 != interpolator) {
            this.f5523 = interpolator;
            this.f5522 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5520 = 0;
        this.f5524 = 0;
        recyclerView.setScrollState(2);
        this.f5522.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f5522.computeScrollOffset();
        }
        m4736();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4738(int i, int i2) {
        RecyclerView recyclerView = this.f5526;
        recyclerView.setScrollState(2);
        this.f5520 = 0;
        this.f5524 = 0;
        Interpolator interpolator = this.f5523;
        InterpolatorC1381 interpolatorC1381 = RecyclerView.f1645;
        if (interpolator != interpolatorC1381) {
            this.f5523 = interpolatorC1381;
            this.f5522 = new OverScroller(recyclerView.getContext(), interpolatorC1381);
        }
        this.f5522.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m4736();
    }
}
