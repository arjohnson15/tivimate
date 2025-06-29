package p272;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import p112.C1811;
import p166.AbstractC2394;
import p166.C2396;
import p166.C2397;
import p166.C2398;
import p166.C2401;
import p166.C2402;
import p166.C2409;
import p166.C2410;
import p166.C2421;
import p166.C2427;
import p166.C2437;
import p166.C2441;
import p166.InterfaceC2446;
import p383.AbstractC4470;
import p383.C4463;
import p383.C4469;
import p438.C5107;
import p438.C5118;
import ʿﾞ.ﹳﹳ;
import ᴵˎ.ˎˋ;

/* renamed from: ـᐧ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3314 implements InterfaceC2446, InterfaceC3318, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f12873;

    public ViewOnClickListenerC3314(C3328 c3328) {
        this.f12873 = c3328;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3328 c3328 = this.f12873;
        ﹳﹳ r1 = c3328.f12962;
        if (r1 == null) {
            return;
        }
        C3339 c3339 = c3328.f12948;
        c3339.m8171();
        if (c3328.f12935 == view) {
            ﹳﹳ r12 = r1;
            if (r12.ٴᐧ(9)) {
                r12.ˊﹶ();
                return;
            }
            return;
        }
        if (c3328.f12936 == view) {
            ﹳﹳ r13 = r1;
            if (r13.ٴᐧ(7)) {
                r13.ˆﾞ();
                return;
            }
            return;
        }
        if (c3328.f12931 == view) {
            if (((C5118) r1).m11361() != 4) {
                ﹳﹳ r14 = r1;
                if (r14.ٴᐧ(12)) {
                    C5118 c5118 = (C5118) r14;
                    c5118.m11358();
                    r14.ʾˈ(12, c5118.f19578);
                    return;
                }
                return;
            }
            return;
        }
        if (c3328.f12960 == view) {
            ﹳﹳ r15 = r1;
            if (r15.ٴᐧ(11)) {
                C5118 c51182 = (C5118) r15;
                c51182.m11358();
                r15.ʾˈ(11, -c51182.f19563);
                return;
            }
            return;
        }
        if (c3328.f12964 == view) {
            if (AbstractC4470.m10209(r1, c3328.f12905)) {
                AbstractC4470.m10193(r1);
                return;
            }
            ﹳﹳ r16 = r1;
            if (r16.ٴᐧ(1)) {
                ((C5118) r16).m11381(false);
                return;
            }
            return;
        }
        if (c3328.f12956 == view) {
            if (r1.ٴᐧ(15)) {
                C5118 c51183 = (C5118) r1;
                c51183.m11358();
                int i = c51183.f19530;
                int i2 = c3328.f12963;
                for (int i3 = 1; i3 <= 2; i3++) {
                    int i4 = (i + i3) % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 || (i2 & 2) == 0) {
                            }
                        } else if ((i2 & 1) == 0) {
                        }
                    }
                    i = i4;
                }
                c51183.m11366(i);
                return;
            }
            return;
        }
        if (c3328.f12972 == view) {
            if (r1.ٴᐧ(14)) {
                C5118 c51184 = (C5118) r1;
                c51184.m11358();
                boolean z = !c51184.f19522;
                c51184.m11358();
                if (c51184.f19522 != z) {
                    c51184.f19522 = z;
                    C4469 c4469 = c51184.f19579.f19262;
                    c4469.getClass();
                    C4463 c4463M10156 = C4469.m10156();
                    c4463M10156.f17178 = c4469.f17191.obtainMessage(12, z ? 1 : 0, 0);
                    c4463M10156.m10121();
                    C5107 c5107 = new C5107(0, z);
                    ˎˋ r9 = c51184.f19524;
                    r9.ﹳﹳ(9, c5107);
                    c51184.m11389();
                    r9.ˑʽ();
                    return;
                }
                return;
            }
            return;
        }
        View view2 = c3328.f12921;
        if (view2 == view) {
            c3339.m8170();
            c3328.m8123(c3328.f12961, view2);
            return;
        }
        View view3 = c3328.f12967;
        if (view3 == view) {
            c3339.m8170();
            c3328.m8123(c3328.f12969, view3);
            return;
        }
        View view4 = c3328.f12928;
        if (view4 == view) {
            c3339.m8170();
            c3328.m8123(c3328.f12941, view4);
            return;
        }
        ImageView imageView = c3328.f12927;
        if (imageView == view) {
            c3339.m8170();
            c3328.m8123(c3328.f12925, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C3328 c3328 = this.f12873;
        if (c3328.f12903) {
            c3328.f12948.m8171();
        }
    }

    @Override // p272.InterfaceC3318
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo8109(long j) {
        C3328 c3328 = this.f12873;
        c3328.f12926 = true;
        TextView textView = c3328.f12904;
        if (textView != null) {
            textView.setText(AbstractC4470.m10169(c3328.f12908, c3328.f12943, j));
        }
        c3328.f12948.m8170();
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʾʼ */
    public final /* synthetic */ void mo4340(C2437 c2437) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿʼ */
    public final void mo4341(C2427 c2427) {
        boolean zM6527 = c2427.m6527(4, 5, 13);
        C3328 c3328 = this.f12873;
        if (zM6527) {
            c3328.m8126();
        }
        if (c2427.m6527(4, 5, 7, 13)) {
            c3328.m8129();
        }
        if (c2427.m6527(8, 13)) {
            c3328.m8131();
        }
        if (c2427.m6527(9, 13)) {
            c3328.m8127();
        }
        if (c2427.m6527(8, 9, 11, 0, 16, 17, 13)) {
            c3328.m8125();
        }
        if (c2427.m6527(11, 0, 13)) {
            c3328.m8135();
        }
        if (c2427.m6527(12, 13)) {
            c3328.m8134();
        }
        if (c2427.m6527(2, 13)) {
            c3328.m8137();
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿˏ */
    public final /* synthetic */ void mo4342(int i, boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˉי */
    public final /* synthetic */ void mo4343(int i) {
    }

    @Override // p272.InterfaceC3318
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo8110(long j, long j2, long j3) {
        C3328 c3328 = this.f12873;
        TextView textView = c3328.f12904;
        if (textView != null) {
            textView.setText(AbstractC4470.m10169(c3328.f12908, c3328.f12943, j2));
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˉ */
    public final /* synthetic */ void mo4344(ExoPlaybackException exoPlaybackException) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˊ */
    public final /* synthetic */ void mo4345(float f) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋⁱ */
    public final /* synthetic */ void mo4346(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˎٴ */
    public final /* synthetic */ void mo4347(List list) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏʾ */
    public final /* synthetic */ void mo4349(int i, C2396 c2396, C2396 c23962) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᴵ */
    public final /* synthetic */ void mo4350() {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᵢ */
    public final /* synthetic */ void mo4351(C2409 c2409) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo4352(int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑי */
    public final /* synthetic */ void mo4353(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑﾞ */
    public final /* synthetic */ void mo4355(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـˆ */
    public final /* synthetic */ void mo4356(C2402 c2402, int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـﹶ */
    public final /* synthetic */ void mo4357(int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ٴˎ */
    public final /* synthetic */ void mo4358(C2398 c2398) {
    }

    @Override // p272.InterfaceC3318
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo8111(boolean z, long j) {
        ﹳﹳ r9;
        C3328 c3328 = this.f12873;
        c3328.f12926 = false;
        if (!z && (r9 = c3328.f12962) != null) {
            if (c3328.f12920) {
                ﹳﹳ r92 = r9;
                if (r92.ٴᐧ(17) && r92.ٴᐧ(10)) {
                    AbstractC2394 abstractC2394M11369 = ((C5118) r92).m11369();
                    int iMo6474 = abstractC2394M11369.mo6474();
                    int i = 0;
                    while (true) {
                        long jM10171 = AbstractC4470.m10171(abstractC2394M11369.mo6179(i, c3328.f12942, 0L).f9707);
                        if (j < jM10171) {
                            break;
                        }
                        if (i == iMo6474 - 1) {
                            j = jM10171;
                            break;
                        } else {
                            j -= jM10171;
                            i++;
                        }
                    }
                    r92.ʻʻ(j, false, i);
                }
            } else {
                ﹳﹳ r93 = r9;
                if (r93.ٴᐧ(5)) {
                    r93.ᐧʼ(5, j);
                }
            }
            c3328.m8129();
        }
        c3328.f12948.m8171();
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧˋ */
    public final /* synthetic */ void mo4359(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧⁱ */
    public final /* synthetic */ void mo4360(int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᴵʿ */
    public final /* synthetic */ void mo4361(C2441 c2441) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵎـ */
    public final /* synthetic */ void mo4362(ExoPlaybackException exoPlaybackException) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵢʿ */
    public final /* synthetic */ void mo4365(int i, int i2) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˎ */
    public final /* synthetic */ void mo4367(int i, boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˑ */
    public final /* synthetic */ void mo4368(C2401 c2401) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo4369(C2421 c2421) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹶˆ */
    public final /* synthetic */ void mo4370(C1811 c1811) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞʽ */
    public final /* synthetic */ void mo4371(C2397 c2397) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞᐧ */
    public final /* synthetic */ void mo4372(C2410 c2410) {
    }
}
