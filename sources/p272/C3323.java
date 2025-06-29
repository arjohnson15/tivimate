package p272;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import java.util.ArrayList;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import p036.C1240;
import p036.C1245;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p166.C2432;
import p166.C2433;
import p166.InterfaceC2419;
import p345.AbstractC3980;
import p438.C5118;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـᐧ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3323 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f12885;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f12886;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f12887;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public List f12888 = new ArrayList();

    public C3323(C3328 c3328, int i) {
        this.f12886 = i;
        this.f12887 = c3328;
        this.f12885 = c3328;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    private final void m8112(String str) {
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m8113(C3313 c3313, int i) {
        final InterfaceC2419 interfaceC2419 = this.f12885.f12962;
        if (interfaceC2419 == null) {
        }
        if (i != 0) {
            final C3316 c3316 = (C3316) this.f12888.get(i - 1);
            final C2433 c2433 = c3316.f12876.f9651;
            boolean z = ((C5118) interfaceC2419).m11371().f9533.get(c2433) != null && c3316.f12876.f9652[c3316.f12874];
            c3313.f12872.setText(c3316.f12875);
            c3313.f12871.setVisibility(z ? 0 : 4);
            c3313.f5618.setOnClickListener(new View.OnClickListener() { // from class: ـᐧ.ᵎـ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3323 c3323 = this.f12978;
                    c3323.getClass();
                    ﹳﹳ r0 = interfaceC2419;
                    if (r0.ٴᐧ(29)) {
                        C5118 c5118 = (C5118) r0;
                        C1245 c1245M11371 = c5118.m11371();
                        c1245M11371.getClass();
                        C1240 c1240 = new C1240(c1245M11371);
                        C3316 c33162 = c3316;
                        C2432 c2432 = new C2432(c2433, AbstractC3980.m9207(Integer.valueOf(c33162.f12874)));
                        C2433 c24332 = c2432.f9695;
                        c1240.m6496(c24332.f9698);
                        c1240.f9509.put(c24332, c2432);
                        c1240.m4455(c33162.f12876.f9651.f9698);
                        c5118.m11392(new C1245(c1240));
                        String str = c33162.f12875;
                        switch (c3323.f12886) {
                            case 0:
                                ((String[]) c3323.f12887.f12961.f12896)[1] = str;
                                break;
                        }
                        c3323.f12885.f12973.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f12886) {
            case 0:
                c3313.f12872.setText(R.string._2_res_0x7f1300b7);
                InterfaceC2419 interfaceC24192 = this.f12887.f12962;
                interfaceC24192.getClass();
                c3313.f12871.setVisibility(m8114(((C5118) interfaceC24192).m11371()) ? 4 : 0);
                c3313.f5618.setOnClickListener(new ViewOnClickListenerC0689(8, this));
                break;
            default:
                c3313.f12872.setText(R.string._2_res_0x7f1300b8);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < this.f12888.size()) {
                        C3316 c33162 = (C3316) this.f12888.get(i3);
                        if (c33162.f12876.f9652[c33162.f12874]) {
                            i2 = 4;
                        } else {
                            i3++;
                        }
                    }
                }
                c3313.f12871.setVisibility(i2);
                c3313.f5618.setOnClickListener(new ViewOnClickListenerC0689(10, this));
                break;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean m8114(C1245 c1245) {
        for (int i = 0; i < this.f12888.size(); i++) {
            if (c1245.f9533.containsKey(((C3316) this.f12888.get(i)).f12876.f9651)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m8115(List list) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            C3316 c3316 = (C3316) list.get(i);
            if (c3316.f12876.f9652[c3316.f12874]) {
                z = true;
                break;
            }
            i++;
        }
        C3328 c3328 = this.f12887;
        ImageView imageView = c3328.f12927;
        if (imageView != null) {
            imageView.setImageDrawable(z ? c3328.f12922 : c3328.f12947);
            c3328.f12927.setContentDescription(z ? c3328.f12971 : c3328.f12906);
        }
        this.f12888 = list;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        if (this.f12888.isEmpty()) {
            return 0;
        }
        return this.f12888.size() + 1;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public /* bridge */ /* synthetic */ void mo975(AbstractC1375 abstractC1375, int i) {
        switch (this.f12886) {
            case 1:
                m8116((C3313) abstractC1375, i);
                break;
            default:
                m8116((C3313) abstractC1375, i);
                break;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m8116(C3313 c3313, int i) {
        switch (this.f12886) {
            case 1:
                m8113(c3313, i);
                if (i > 0) {
                    C3316 c3316 = (C3316) this.f12888.get(i - 1);
                    c3313.f12871.setVisibility(c3316.f12876.f9652[c3316.f12874] ? 0 : 4);
                    break;
                }
                break;
            default:
                m8113(c3313, i);
                break;
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        return new C3313(LayoutInflater.from(this.f12885.getContext()).inflate(R.layout._2_res_0x7f0e0040, viewGroup, false));
    }
}
