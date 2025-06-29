package p061;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ʾـ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1357 extends AbstractC1420 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f5514;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1357(AbstractC1402 abstractC1402, int i) {
        super(abstractC1402);
        this.f5514 = i;
    }

    @Override // p061.AbstractC1420
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int mo4713(View view) {
        switch (this.f5514) {
            case 0:
                C1398 c1398 = (C1398) view.getLayoutParams();
                ((AbstractC1402) this.f5785).getClass();
                return AbstractC1402.m4817(view) + ((ViewGroup.MarginLayoutParams) c1398).leftMargin + ((ViewGroup.MarginLayoutParams) c1398).rightMargin;
            default:
                C1398 c13982 = (C1398) view.getLayoutParams();
                ((AbstractC1402) this.f5785).getClass();
                return AbstractC1402.m4812(view) + ((ViewGroup.MarginLayoutParams) c13982).topMargin + ((ViewGroup.MarginLayoutParams) c13982).bottomMargin;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˉי, reason: contains not printable characters */
    public final int mo4714() {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).m4848();
            default:
                return ((AbstractC1402) this.f5785).m4833();
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int mo4715() {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).f5721;
            default:
                return ((AbstractC1402) this.f5785).f5720;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int mo4716() {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).m4835();
            default:
                return ((AbstractC1402) this.f5785).m4824();
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo4717(int i) {
        switch (this.f5514) {
            case 0:
                ((AbstractC1402) this.f5785).mo1346(i);
                break;
            default:
                ((AbstractC1402) this.f5785).mo1349(i);
                break;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int mo4718() {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).f5720;
            default:
                return ((AbstractC1402) this.f5785).f5721;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int mo4719() {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).f5729;
            default:
                return ((AbstractC1402) this.f5785).f5723;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ˑי, reason: contains not printable characters */
    public final int mo4720(View view) {
        switch (this.f5514) {
            case 0:
                AbstractC1402 abstractC1402 = (AbstractC1402) this.f5785;
                Rect rect = (Rect) this.f5786;
                abstractC1402.m4832(view, rect);
                return rect.right;
            default:
                AbstractC1402 abstractC14022 = (AbstractC1402) this.f5785;
                Rect rect2 = (Rect) this.f5786;
                abstractC14022.m4832(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo4721(View view) {
        switch (this.f5514) {
            case 0:
                C1398 c1398 = (C1398) view.getLayoutParams();
                ((AbstractC1402) this.f5785).getClass();
                return AbstractC1402.m4812(view) + ((ViewGroup.MarginLayoutParams) c1398).topMargin + ((ViewGroup.MarginLayoutParams) c1398).bottomMargin;
            default:
                C1398 c13982 = (C1398) view.getLayoutParams();
                ((AbstractC1402) this.f5785).getClass();
                return AbstractC1402.m4817(view) + ((ViewGroup.MarginLayoutParams) c13982).leftMargin + ((ViewGroup.MarginLayoutParams) c13982).rightMargin;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int mo4722(View view) {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).mo801(view) - ((ViewGroup.MarginLayoutParams) ((C1398) view.getLayoutParams())).leftMargin;
            default:
                return ((AbstractC1402) this.f5785).mo842(view) - ((ViewGroup.MarginLayoutParams) ((C1398) view.getLayoutParams())).topMargin;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int mo4723() {
        switch (this.f5514) {
            case 0:
                AbstractC1402 abstractC1402 = (AbstractC1402) this.f5785;
                return (abstractC1402.f5729 - abstractC1402.m4835()) - abstractC1402.m4848();
            default:
                AbstractC1402 abstractC14022 = (AbstractC1402) this.f5785;
                return (abstractC14022.f5723 - abstractC14022.m4824()) - abstractC14022.m4833();
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int mo4724(View view) {
        switch (this.f5514) {
            case 0:
                AbstractC1402 abstractC1402 = (AbstractC1402) this.f5785;
                Rect rect = (Rect) this.f5786;
                abstractC1402.m4832(view, rect);
                return rect.left;
            default:
                AbstractC1402 abstractC14022 = (AbstractC1402) this.f5785;
                Rect rect2 = (Rect) this.f5786;
                abstractC14022.m4832(view, rect2);
                return rect2.top;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int mo4725(View view) {
        switch (this.f5514) {
            case 0:
                return ((AbstractC1402) this.f5785).mo805(view) + ((ViewGroup.MarginLayoutParams) ((C1398) view.getLayoutParams())).rightMargin;
            default:
                return ((AbstractC1402) this.f5785).mo807(view) + ((ViewGroup.MarginLayoutParams) ((C1398) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // p061.AbstractC1420
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int mo4726() {
        switch (this.f5514) {
            case 0:
                AbstractC1402 abstractC1402 = (AbstractC1402) this.f5785;
                return abstractC1402.f5729 - abstractC1402.m4848();
            default:
                AbstractC1402 abstractC14022 = (AbstractC1402) this.f5785;
                return abstractC14022.f5723 - abstractC14022.m4833();
        }
    }
}
