package p378;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p421.C4861;

/* renamed from: ᵢٴ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4348 extends AbstractC4342 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Field f16847;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean f16848;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static boolean f16849;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Constructor f16850;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public WindowInsets f16851;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C4861 f16852;

    public C4348() {
        this.f16851 = m9901();
    }

    public C4348(C4369 c4369) {
        super(c4369);
        this.f16851 = c4369.m9954();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    private static WindowInsets m9901() {
        if (!f16849) {
            try {
                f16847 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
            }
            f16849 = true;
        }
        Field field = f16847;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
            }
        }
        if (!f16848) {
            try {
                f16850 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
            }
            f16848 = true;
        }
        Constructor constructor = f16850;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
            }
        }
        return null;
    }

    @Override // p378.AbstractC4342
    /* renamed from: ʽᐧ */
    public C4369 mo9867() {
        m9870();
        C4369 c4369M9950 = C4369.m9950(null, this.f16851);
        C4861[] c4861Arr = this.f16829;
        C4331 c4331 = c4369M9950.f16871;
        c4331.mo9834(c4861Arr);
        c4331.mo9828(this.f16852);
        return c4369M9950;
    }

    @Override // p378.AbstractC4342
    /* renamed from: ʿʼ */
    public void mo9868(C4861 c4861) {
        this.f16852 = c4861;
    }

    @Override // p378.AbstractC4342
    /* renamed from: ᐧʻ */
    public void mo9872(C4861 c4861) {
        WindowInsets windowInsets = this.f16851;
        if (windowInsets != null) {
            this.f16851 = windowInsets.replaceSystemWindowInsets(c4861.f18366, c4861.f18364, c4861.f18365, c4861.f18367);
        }
    }
}
