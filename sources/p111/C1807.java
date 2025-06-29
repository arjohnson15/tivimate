package p111;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p166.C2430;
import p254.C3155;
import p254.C3159;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.C4457;

/* renamed from: ˆﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1807 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f6963;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3155 f6964;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6965;

    public C1807(int i) {
        this.f6965 = i;
        switch (i) {
            case 1:
                this.f6963 = new C4457(4);
                this.f6964 = new C3155(-1, -1, "image/heif");
                break;
            case 2:
                this.f6963 = new C4457(4);
                this.f6964 = new C3155(-1, -1, "image/webp");
                break;
            default:
                this.f6963 = new C4457(4);
                this.f6964 = new C3155(-1, -1, "image/avif");
                break;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m5552() {
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    private final void m5553() {
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    private final void m5554() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
        int i = this.f6965;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        switch (this.f6965) {
            case 0:
                C3159 c3159 = (C3159) interfaceC3168;
                c3159.m7828(4, false);
                C4457 c4457 = this.f6963;
                c4457.m10099(4);
                c3159.mo4875(c4457.f17171, 0, 4, false);
                if (c4457.m10110() == 1718909296) {
                    c4457.m10099(4);
                    c3159.mo4875(c4457.f17171, 0, 4, false);
                    if (c4457.m10110() == 1635150182) {
                    }
                }
                break;
            case 1:
                C3159 c31592 = (C3159) interfaceC3168;
                c31592.m7828(4, false);
                C4457 c44572 = this.f6963;
                c44572.m10099(4);
                c31592.mo4875(c44572.f17171, 0, 4, false);
                if (c44572.m10110() == 1718909296) {
                    c44572.m10099(4);
                    c31592.mo4875(c44572.f17171, 0, 4, false);
                    if (c44572.m10110() == 1751476579) {
                    }
                }
                break;
            default:
                C4457 c44573 = this.f6963;
                c44573.m10099(4);
                C3159 c31593 = (C3159) interfaceC3168;
                c31593.mo4875(c44573.f17171, 0, 4, false);
                if (c44573.m10110() == 1380533830) {
                    c31593.m7828(4, false);
                    c44573.m10099(4);
                    c31593.mo4875(c44573.f17171, 0, 4, false);
                    if (c44573.m10110() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) {
        switch (this.f6965) {
        }
        return this.f6964.mo4075(interfaceC3168, c2430);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        switch (this.f6965) {
            case 0:
                C3928 c3928 = AbstractC3980.f15360;
                break;
            case 1:
                C3928 c39282 = AbstractC3980.f15360;
                break;
            default:
                C3928 c39283 = AbstractC3980.f15360;
                break;
        }
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        switch (this.f6965) {
            case 0:
                this.f6964.mo4082(j, j2);
                break;
            case 1:
                this.f6964.mo4082(j, j2);
                break;
            default:
                this.f6964.mo4082(j, j2);
                break;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        switch (this.f6965) {
            case 0:
                this.f6964.mo4084(interfaceC3177);
                break;
            case 1:
                this.f6964.mo4084(interfaceC3177);
                break;
            default:
                this.f6964.mo4084(interfaceC3177);
                break;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        int i = this.f6965;
        return this;
    }
}
