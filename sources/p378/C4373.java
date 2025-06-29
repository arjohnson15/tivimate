package p378;

import android.view.View;
import android.view.ViewGroup;
import p013.C1032;
import p070.AbstractC1547;
import p338.InterfaceC3856;

/* renamed from: ᵢٴ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4373 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4373 f16880 = new C4373(1);

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C1032(3, viewGroup);
        }
        return null;
    }
}
