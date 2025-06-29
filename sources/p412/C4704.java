package p412;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ﹳˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4704 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f17925;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f17926;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f17927;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f17928;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f17929;

    public C4704(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f17928 = Float.NaN;
        this.f17925 = Float.NaN;
        this.f17927 = Float.NaN;
        this.f17929 = Float.NaN;
        this.f17926 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4702.f17910);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f17926);
                this.f17926 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4696().m10615((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f17929 = typedArrayObtainStyledAttributes.getDimension(index, this.f17929);
            } else if (index == 2) {
                this.f17925 = typedArrayObtainStyledAttributes.getDimension(index, this.f17925);
            } else if (index == 3) {
                this.f17927 = typedArrayObtainStyledAttributes.getDimension(index, this.f17927);
            } else if (index == 4) {
                this.f17928 = typedArrayObtainStyledAttributes.getDimension(index, this.f17928);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
