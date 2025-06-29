package p227;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.Picker;
import java.util.ArrayList;
import p061.AbstractC1373;
import p061.AbstractC1375;

/* renamed from: ˑʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3049 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f11749;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ Picker f11750;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f11751;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3053 f11752;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f11753;

    public C3049(Picker picker, int i, int i2, int i3) {
        this.f11750 = picker;
        this.f11753 = i;
        this.f11749 = i3;
        this.f11751 = i2;
        this.f11752 = (C3053) picker.f1000.get(i3);
    }

    @Override // p061.AbstractC1373
    /* renamed from: ˉי */
    public final void mo4758(AbstractC1375 abstractC1375) {
        ((C3051) abstractC1375).f5618.setFocusable(this.f11750.isActivated());
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        C3053 c3053 = this.f11752;
        if (c3053 == null) {
            return 0;
        }
        return (c3053.f11758 - c3053.f11756) + 1;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        C3053 c3053;
        C3051 c3051 = (C3051) abstractC1375;
        TextView textView = c3051.f11754;
        if (textView != null && (c3053 = this.f11752) != null) {
            int i2 = c3053.f11756 + i;
            CharSequence[] charSequenceArr = c3053.f11760;
            textView.setText(charSequenceArr == null ? String.format(c3053.f11757, Integer.valueOf(i2)) : charSequenceArr[i2]);
        }
        Picker picker = this.f11750;
        ArrayList arrayList = picker.f997;
        int i3 = this.f11749;
        picker.m891(i3, c3051.f5618, ((VerticalGridView) arrayList.get(i3)).getSelectedPosition() == i, false);
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f11753, viewGroup, false);
        int i2 = this.f11751;
        return new C3051(viewInflate, i2 != 0 ? (TextView) viewInflate.findViewById(i2) : (TextView) viewInflate);
    }
}
