package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p300.AbstractC3505;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f42;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f43;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13594);
        this.f42 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f43 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
