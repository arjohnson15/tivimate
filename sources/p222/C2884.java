package p222;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: ˏᴵ.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2884 extends C2863 {
    @Override // p222.C2867
    /* renamed from: ʽᐧ */
    public boolean mo7184(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // p222.C2863, p222.C2867
    /* renamed from: ـﹶ */
    public void mo7183(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
