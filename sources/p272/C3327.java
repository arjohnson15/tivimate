package p272;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Set;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p061.C1398;
import p335.C3796;
import p335.ViewOnClickListenerC3792;
import ʿﾞ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* renamed from: ـᐧ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3327 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final CharSequence[] f12894;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ Object f12895;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final CharSequence[] f12896;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f12897;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f12898 = 0;

    public C3327(C3328 c3328, String[] strArr, Drawable[] drawableArr) {
        this.f12895 = c3328;
        this.f12894 = strArr;
        this.f12896 = new String[strArr.length];
        this.f12897 = drawableArr;
    }

    public C3327(C3796 c3796, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence) {
        this.f12895 = c3796;
        this.f12894 = charSequenceArr;
        this.f12896 = charSequenceArr2;
        this.f12897 = charSequence;
    }

    public C3327(C3796 c3796, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, Set set) {
        this.f12895 = c3796;
        this.f12894 = charSequenceArr;
        this.f12896 = charSequenceArr2;
        this.f12897 = new HashSet(set);
    }

    @Override // p061.AbstractC1373
    /* renamed from: ʽᐧ */
    public long mo2854(int i) {
        switch (this.f12898) {
            case 0:
                return i;
            default:
                return super.mo2854(i);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean m8119(int i) {
        C3328 c3328 = (C3328) this.f12895;
        ﹳﹳ r1 = c3328.f12962;
        if (r1 == null) {
            return false;
        }
        if (i == 0) {
            return r1.ٴᐧ(13);
        }
        if (i != 1) {
            return true;
        }
        return r1.ٴᐧ(30) && c3328.f12962.ٴᐧ(29);
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        switch (this.f12898) {
        }
        return this.f12894.length;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        switch (this.f12898) {
            case 0:
                C3308 c3308 = (C3308) abstractC1375;
                boolean zM8119 = m8119(i);
                View view = c3308.f5618;
                if (zM8119) {
                    view.setLayoutParams(new C1398(-1, -2));
                } else {
                    view.setLayoutParams(new C1398(0, 0));
                }
                c3308.f12864.setText(((String[]) this.f12894)[i]);
                String str = ((String[]) this.f12896)[i];
                TextView textView = c3308.f12861;
                if (str == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                }
                Drawable drawable = ((Drawable[]) this.f12897)[i];
                ImageView imageView = c3308.f12862;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    break;
                } else {
                    imageView.setVisibility(8);
                    break;
                }
            case 1:
                ViewOnClickListenerC3792 viewOnClickListenerC3792 = (ViewOnClickListenerC3792) abstractC1375;
                viewOnClickListenerC3792.f14640.setChecked(((HashSet) this.f12897).contains(this.f12896[i].toString()));
                viewOnClickListenerC3792.f14638.setText(this.f12894[i]);
                break;
            default:
                ViewOnClickListenerC3792 viewOnClickListenerC37922 = (ViewOnClickListenerC3792) abstractC1375;
                viewOnClickListenerC37922.f14640.setChecked(TextUtils.equals(this.f12896[i].toString(), (CharSequence) this.f12897));
                viewOnClickListenerC37922.f14638.setText(this.f12894[i]);
                break;
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        switch (this.f12898) {
            case 0:
                C3328 c3328 = (C3328) this.f12895;
                return new C3308(c3328, LayoutInflater.from(c3328.getContext()).inflate(R.layout._2_res_0x7f0e003f, viewGroup, false));
            case 1:
                return new ViewOnClickListenerC3792(ˉᵎ.ᐧʻ(viewGroup, R.layout._2_res_0x7f0e00d0, viewGroup, false), this);
            default:
                return new ViewOnClickListenerC3792(ˉᵎ.ᐧʻ(viewGroup, R.layout._2_res_0x7f0e00d1, viewGroup, false), this);
        }
    }
}
