package p149;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import p335.AbstractC3795;

/* renamed from: ˊʾ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2301 implements View.OnKeyListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f9086;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f9087;

    public /* synthetic */ ViewOnKeyListenerC2301(int i, Object obj) {
        this.f9087 = i;
        this.f9086 = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        switch (this.f9087) {
            case 0:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f9086;
                if ((seekBarPreference.f1590 || (i != 21 && i != 22)) && i != 23 && i != 66 && (seekBar = seekBarPreference.f1600) != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                return false;
            default:
                if (i == 4) {
                    return ((AbstractC3795) this.f9086).getChildFragmentManager().m649(-1, 0);
                }
                return false;
        }
    }
}
