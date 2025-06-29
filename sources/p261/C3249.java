package p261;

import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.File;
import java.util.List;
import p003.C0910;
import p003.InterfaceC0913;
import p314.InterfaceC3594;

/* renamed from: ـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3249 implements InterfaceC3243, InterfaceC0281 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3237 f12690;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC3594 f12691;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public volatile C0910 f12692;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC3242 f12693;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public File f12694;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f12695 = -1;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final List f12696;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public List f12697;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f12698;

    public C3249(List list, C3237 c3237, InterfaceC3242 interfaceC3242) {
        this.f12696 = list;
        this.f12690 = c3237;
        this.f12693 = interfaceC3242;
    }

    @Override // p261.InterfaceC3243
    public final void cancel() {
        C0910 c0910 = this.f12692;
        if (c0910 != null) {
            c0910.f4067.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ʿʼ */
    public final void mo1540(Object obj) {
        this.f12693.mo7959(this.f12691, obj, this.f12692.f4067, 3, this.f12691);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ˑʽ */
    public final void mo1541(Exception exc) {
        this.f12693.mo7961(this.f12691, exc, this.f12692.f4067, 3);
    }

    @Override // p261.InterfaceC3243
    /* renamed from: ﹳﹳ */
    public final boolean mo7962() {
        while (true) {
            List list = this.f12697;
            boolean z = false;
            if (list != null && this.f12698 < list.size()) {
                this.f12692 = null;
                while (!z && this.f12698 < this.f12697.size()) {
                    List list2 = this.f12697;
                    int i = this.f12698;
                    this.f12698 = i + 1;
                    InterfaceC0913 interfaceC0913 = (InterfaceC0913) list2.get(i);
                    File file = this.f12694;
                    C3237 c3237 = this.f12690;
                    this.f12692 = interfaceC0913.mo3705(file, c3237.f12618, c3237.f12629, c3237.f12634);
                    if (this.f12692 != null && this.f12690.m7992(this.f12692.f4067.mo1533()) != null) {
                        this.f12692.f4067.mo1529(this.f12690.f12624, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f12695 + 1;
            this.f12695 = i2;
            if (i2 >= this.f12696.size()) {
                return false;
            }
            InterfaceC3594 interfaceC3594 = (InterfaceC3594) this.f12696.get(this.f12695);
            C3237 c32372 = this.f12690;
            File fileMo7037 = c32372.f12625.m8419().mo7037(new C3227(interfaceC3594, c32372.f12631));
            this.f12694 = fileMo7037;
            if (fileMo7037 != null) {
                this.f12691 = interfaceC3594;
                this.f12697 = this.f12690.f12626.m1555().m1592(fileMo7037);
                this.f12698 = 0;
            }
        }
    }
}
