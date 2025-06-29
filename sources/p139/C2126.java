package p139;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ˉˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2126 implements InterfaceC2121 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8371;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ View f8372;

    public C2126(View view, ArrayList arrayList) {
        this.f8372 = view;
        this.f8371 = arrayList;
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʽᐧ */
    public final void mo5988() {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʿʼ */
    public final void mo5989() {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        abstractC2160.mo6019(this);
        this.f8372.setVisibility(8);
        ArrayList arrayList = this.f8371;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ٴˎ */
    public final void mo5992(AbstractC2160 abstractC2160) {
        mo5991(abstractC2160);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ᐧʻ */
    public final void mo5993(AbstractC2160 abstractC2160) {
        mo5994(abstractC2160);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ﹳﹳ */
    public final void mo5994(AbstractC2160 abstractC2160) {
        abstractC2160.mo6019(this);
        abstractC2160.m6085(this);
    }
}
