package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import p412.AbstractC4697;
import p412.AbstractC4702;
import p441.C5126;
import p447.C5171;
import p447.C5174;

/* loaded from: classes.dex */
public class Flow extends AbstractC4697 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C5174 f255;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p412.AbstractC4692, android.view.View
    public final void onMeasure(int i, int i2) {
        mo165(this.f255, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f255.f19863 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f255.f19870 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f255.f19845 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f255.f19875 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f255.f19873 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f255.f19868 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f255.f19862 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f255.f19869 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f255.f19855 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f255.f19872 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f255.f19858 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f255.f19867 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f255.f19847 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f255.f19850 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C5174 c5174 = this.f255;
        c5174.f19857 = i;
        c5174.f19849 = i;
        c5174.f19853 = i;
        c5174.f19874 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f255.f19849 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f255.f19860 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f255.f19843 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f255.f19857 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f255.f19865 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f255.f19871 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f255.f19854 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f255.f19877 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f255.f19851 = i;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00ce A[EDGE_INSN: B:427:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    @Override // p412.AbstractC4697
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo165(p447.C5174 r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 2058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo165(ﾞˊ.ˏᵢ, int, int):void");
    }

    @Override // p412.AbstractC4697, p412.AbstractC4692
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo166(AttributeSet attributeSet) {
        super.mo166(attributeSet);
        C5174 c5174 = new C5174();
        c5174.f19857 = 0;
        c5174.f19849 = 0;
        c5174.f19853 = 0;
        c5174.f19874 = 0;
        c5174.f19860 = 0;
        c5174.f19843 = 0;
        c5174.f19848 = false;
        c5174.f19856 = 0;
        c5174.f19866 = 0;
        c5174.f19878 = new C5126();
        c5174.f19846 = null;
        c5174.f19869 = -1;
        c5174.f19877 = -1;
        c5174.f19870 = -1;
        c5174.f19875 = -1;
        c5174.f19872 = -1;
        c5174.f19867 = -1;
        c5174.f19868 = 0.5f;
        c5174.f19871 = 0.5f;
        c5174.f19863 = 0.5f;
        c5174.f19845 = 0.5f;
        c5174.f19855 = 0.5f;
        c5174.f19858 = 0.5f;
        c5174.f19862 = 0;
        c5174.f19854 = 0;
        c5174.f19873 = 2;
        c5174.f19865 = 2;
        c5174.f19851 = 0;
        c5174.f19847 = -1;
        c5174.f19850 = 0;
        c5174.f19859 = new ArrayList();
        c5174.f19844 = null;
        c5174.f19861 = null;
        c5174.f19864 = null;
        c5174.f19876 = 0;
        this.f255 = c5174;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4702.f17908);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f255.f19850 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C5174 c51742 = this.f255;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c51742.f19857 = dimensionPixelSize;
                    c51742.f19849 = dimensionPixelSize;
                    c51742.f19853 = dimensionPixelSize;
                    c51742.f19874 = dimensionPixelSize;
                } else if (index == 18) {
                    C5174 c51743 = this.f255;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c51743.f19853 = dimensionPixelSize2;
                    c51743.f19860 = dimensionPixelSize2;
                    c51743.f19843 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f255.f19874 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f255.f19860 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f255.f19857 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f255.f19843 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f255.f19849 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f255.f19851 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f255.f19869 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f255.f19877 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f255.f19870 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f255.f19872 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f255.f19875 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f255.f19867 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f255.f19868 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f255.f19863 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f255.f19855 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f255.f19845 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f255.f19858 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f255.f19871 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f255.f19873 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f255.f19865 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f255.f19862 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f255.f19854 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f255.f19847 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f17853 = this.f255;
        m10601();
    }

    @Override // p412.AbstractC4692
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo167(C5171 c5171, boolean z) {
        C5174 c5174 = this.f255;
        int i = c5174.f19853;
        if (i > 0 || c5174.f19874 > 0) {
            if (z) {
                c5174.f19860 = c5174.f19874;
                c5174.f19843 = i;
            } else {
                c5174.f19860 = i;
                c5174.f19843 = c5174.f19874;
            }
        }
    }
}
