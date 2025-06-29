package p222;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: ˏᴵ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2863 extends C2867 {
    @Override // p222.C2867
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo7183(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C2929.m7283(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
