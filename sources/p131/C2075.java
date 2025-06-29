package p131;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p200.C2741;

/* renamed from: ˉʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2075 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AnimatorSet f7886;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ArrayList f7887;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2074 f7888;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2741 f7889;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
