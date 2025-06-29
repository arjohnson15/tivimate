package p378;

import android.text.TextUtils;
import android.view.View;
import p057.AbstractC1346;

/* renamed from: ᵢٴ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4393 extends AbstractC1346 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f16921;

    public C4393(int i, Class cls, int i2, int i3, int i4) {
        this.f16921 = i4;
        this.f5492 = i;
        this.f5491 = cls;
        this.f5490 = i2;
        this.f5489 = i3;
    }

    @Override // p057.AbstractC1346
    /* renamed from: ʿʼ */
    public final void mo4689(View view, Object obj) {
        switch (this.f16921) {
            case 0:
                AbstractC4350.m9906(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC4350.m9903(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC4338.m9849(view, (CharSequence) obj);
                break;
            default:
                AbstractC4350.m9907(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p057.AbstractC1346
    /* renamed from: ˏᵢ */
    public final boolean mo4690(Object obj, Object obj2) {
        switch (this.f16921) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }

    @Override // p057.AbstractC1346
    /* renamed from: ˑʽ */
    public final Object mo4691(View view) {
        switch (this.f16921) {
            case 0:
                return Boolean.valueOf(AbstractC4350.m9904(view));
            case 1:
                return AbstractC4350.m9905(view);
            case 2:
                return AbstractC4338.m9850(view);
            default:
                return Boolean.valueOf(AbstractC4350.m9902(view));
        }
    }
}
