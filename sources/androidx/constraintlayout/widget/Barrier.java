package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import p412.AbstractC4692;
import p412.AbstractC4702;
import p447.C5171;
import p447.C5176;

/* loaded from: classes.dex */
public class Barrier extends AbstractC4692 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f256;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f257;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C5176 f258;

    public Barrier(Context context) {
        super(context);
        this.f17854 = new int[32];
        this.f17856 = new HashMap();
        this.f17852 = context;
        mo166(null);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f258.f19888;
    }

    public int getMargin() {
        return this.f258.f19889;
    }

    public int getType() {
        return this.f256;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f258.f19888 = z;
    }

    public void setDpMargin(int i) {
        this.f258.f19889 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f258.f19889 = i;
    }

    public void setType(int i) {
        this.f256 = i;
    }

    @Override // p412.AbstractC4692
    /* renamed from: ˏᵢ */
    public final void mo166(AttributeSet attributeSet) {
        super.mo166(attributeSet);
        C5176 c5176 = new C5176();
        c5176.f19890 = 0;
        c5176.f19888 = true;
        c5176.f19889 = 0;
        c5176.f19891 = false;
        this.f258 = c5176;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4702.f17908);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f258.f19888 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f258.f19889 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f17853 = this.f258;
        m10601();
    }

    @Override // p412.AbstractC4692
    /* renamed from: ﹶˆ */
    public final void mo167(C5171 c5171, boolean z) {
        int i = this.f256;
        this.f257 = i;
        if (z) {
            if (i == 5) {
                this.f257 = 1;
            } else if (i == 6) {
                this.f257 = 0;
            }
        } else if (i == 5) {
            this.f257 = 0;
        } else if (i == 6) {
            this.f257 = 1;
        }
        if (c5171 instanceof C5176) {
            ((C5176) c5171).f19890 = this.f257;
        }
    }
}
