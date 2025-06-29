package p335;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import java.util.HashSet;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p272.C3327;

/* renamed from: ᵎʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3792 extends AbstractC1375 implements View.OnClickListener {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final TextView f14638;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final AbstractC1373 f14639;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final Checkable f14640;

    public ViewOnClickListenerC3792(View view, C3327 c3327) {
        super(view);
        this.f14640 = (Checkable) view.findViewById(R.id._2_res_0x7f0b00b3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id._2_res_0x7f0b00d3);
        this.f14638 = (TextView) view.findViewById(android.R.id.title);
        viewGroup.setOnClickListener(this);
        this.f14639 = c3327;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3327 c3327 = (C3327) this.f14639;
        switch (c3327.f12898) {
            case 1:
                int iM4766 = m4766();
                if (iM4766 != -1) {
                    String string = c3327.f12896[iM4766].toString();
                    HashSet hashSet = (HashSet) c3327.f12897;
                    if (hashSet.contains(string)) {
                        hashSet.remove(string);
                    } else {
                        hashSet.add(string);
                    }
                    C3796 c3796 = (C3796) c3327.f12895;
                    MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) c3796.m8886();
                    multiSelectListPreference.m1193(new HashSet(hashSet));
                    multiSelectListPreference.m1180(new HashSet(hashSet));
                    c3796.f14649 = hashSet;
                    c3327.m4765();
                    break;
                }
                break;
            default:
                int iM47662 = m4766();
                if (iM47662 != -1) {
                    CharSequence[] charSequenceArr = c3327.f12896;
                    CharSequence charSequence = charSequenceArr[iM47662];
                    C3796 c37962 = (C3796) c3327.f12895;
                    ListPreference listPreference = (ListPreference) c37962.m8886();
                    if (iM47662 >= 0) {
                        String string2 = charSequenceArr[iM47662].toString();
                        listPreference.m1193(string2);
                        listPreference.m1176(string2);
                        c3327.f12897 = charSequence;
                    }
                    c37962.getFragmentManager().m684();
                    c3327.m4765();
                    break;
                }
                break;
        }
    }
}
