package p272;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;

/* renamed from: ـᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3312 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float[] f12867;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12868;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f12869;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String[] f12870;

    public C3312(C3328 c3328, String[] strArr, float[] fArr) {
        this.f12869 = c3328;
        this.f12870 = strArr;
        this.f12867 = fArr;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f12870.length;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, final int i) {
        C3313 c3313 = (C3313) abstractC1375;
        String[] strArr = this.f12870;
        if (i < strArr.length) {
            c3313.f12872.setText(strArr[i]);
        }
        int i2 = this.f12868;
        View view = c3313.f12871;
        View view2 = c3313.f5618;
        if (i == i2) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: ـᐧ.ˉי
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C3312 c3312 = this.f12852;
                int i3 = c3312.f12868;
                int i4 = i;
                C3328 c3328 = c3312.f12869;
                if (i4 != i3) {
                    c3328.setPlaybackSpeed(c3312.f12867[i4]);
                }
                c3328.f12973.dismiss();
            }
        });
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        return new C3313(LayoutInflater.from(this.f12869.getContext()).inflate(R.layout._2_res_0x7f0e0040, viewGroup, false));
    }
}
