package p149;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import p061.AbstractC1375;

/* renamed from: ˊʾ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2302 extends AbstractC1375 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f9088;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final ColorStateList f9089;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final SparseArray f9090;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f9091;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final Drawable f9092;

    public C2302(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f9090 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b01eb, view.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b01eb));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f9092 = view.getBackground();
        if (textView != null) {
            this.f9089 = textView.getTextColors();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final View m6346(int i) {
        SparseArray sparseArray = this.f9090;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f5618.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
