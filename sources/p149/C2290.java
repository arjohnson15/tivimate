package p149;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* renamed from: ˊʾ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2290 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ SeekBarPreference f9065;

    public C2290(SeekBarPreference seekBarPreference) {
        this.f9065 = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.f9065;
        if (!z || (!seekBarPreference.f1595 && seekBarPreference.f1594)) {
            int i2 = i + seekBarPreference.f1598;
            TextView textView = seekBarPreference.f1597;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.f1598;
        if (progress != seekBarPreference.f1591) {
            seekBarPreference.m1193(Integer.valueOf(progress));
            seekBarPreference.m1207(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f9065.f1594 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f9065;
        seekBarPreference.f1594 = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.f1598;
        if (progress2 + i == seekBarPreference.f1591 || (progress = seekBar.getProgress() + i) == seekBarPreference.f1591) {
            return;
        }
        seekBarPreference.m1193(Integer.valueOf(progress));
        seekBarPreference.m1207(progress, false);
    }
}
