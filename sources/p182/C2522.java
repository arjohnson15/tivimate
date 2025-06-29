package p182;

import android.view.View;
import android.view.animation.Interpolator;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.Iterator;
import p378.C4361;

/* renamed from: ˋⁱ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2522 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f10016;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Interpolator f10017;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ﹳﹳ f10020;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f10015 = -1;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2519 f10019 = new C2519(this);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f10018 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6662() {
        View view;
        if (this.f10016) {
            return;
        }
        Iterator it = this.f10018.iterator();
        while (it.hasNext()) {
            C4361 c4361 = (C4361) it.next();
            long j = this.f10015;
            if (j >= 0) {
                c4361.m9940(j);
            }
            Interpolator interpolator = this.f10017;
            if (interpolator != null && (view = (View) c4361.f16865.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f10020 != null) {
                c4361.m9942(this.f10019);
            }
            View view2 = (View) c4361.f16865.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10016 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6663() {
        if (this.f10016) {
            Iterator it = this.f10018.iterator();
            while (it.hasNext()) {
                ((C4361) it.next()).m9938();
            }
            this.f10016 = false;
        }
    }
}
