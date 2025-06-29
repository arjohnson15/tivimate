package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p098.InterfaceC1770;
import p293.C3474;
import p404.AbstractC4637;
import ʻˉ.ᐧˋ;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1770 {
    @Override // p098.InterfaceC1770
    /* renamed from: ʽᐧ */
    public final Object mo584(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C3474(9);
        }
        AbstractC4637.m10545(new ᐧˋ(this, 29, context.getApplicationContext()));
        return new C3474(9);
    }

    @Override // p098.InterfaceC1770
    /* renamed from: ـﹶ */
    public final List mo586() {
        return Collections.emptyList();
    }
}
