package p438;

import android.media.MediaFormat;
import p007.InterfaceC0939;
import p166.C2431;
import p230.C3065;
import p230.InterfaceC3070;

/* renamed from: ﹶﾞ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5083 implements InterfaceC0939, InterfaceC3070, InterfaceC5109 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public InterfaceC3070 f19318;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public InterfaceC0939 f19319;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC3070 f19320;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC0939 f19321;

    @Override // p007.InterfaceC0939
    /* renamed from: ʽᐧ */
    public final void mo3808(long j, long j2, C2431 c2431, MediaFormat mediaFormat) {
        InterfaceC0939 interfaceC0939 = this.f19319;
        if (interfaceC0939 != null) {
            interfaceC0939.mo3808(j, j2, c2431, mediaFormat);
        }
        InterfaceC0939 interfaceC09392 = this.f19321;
        if (interfaceC09392 != null) {
            interfaceC09392.mo3808(j, j2, c2431, mediaFormat);
        }
    }

    @Override // p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public final void mo1125(int i, Object obj) {
        if (i == 7) {
            this.f19321 = (InterfaceC0939) obj;
            return;
        }
        if (i == 8) {
            this.f19318 = (InterfaceC3070) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C3065 c3065 = (C3065) obj;
        if (c3065 == null) {
            this.f19319 = null;
            this.f19320 = null;
        } else {
            this.f19319 = c3065.getVideoFrameMetadataListener();
            this.f19320 = c3065.getCameraMotionListener();
        }
    }

    @Override // p230.InterfaceC3070
    /* renamed from: ـﹶ */
    public final void mo7556(long j, float[] fArr) {
        InterfaceC3070 interfaceC3070 = this.f19320;
        if (interfaceC3070 != null) {
            interfaceC3070.mo7556(j, fArr);
        }
        InterfaceC3070 interfaceC30702 = this.f19318;
        if (interfaceC30702 != null) {
            interfaceC30702.mo7556(j, fArr);
        }
    }

    @Override // p230.InterfaceC3070
    /* renamed from: ﹳﹳ */
    public final void mo7557() {
        InterfaceC3070 interfaceC3070 = this.f19320;
        if (interfaceC3070 != null) {
            interfaceC3070.mo7557();
        }
        InterfaceC3070 interfaceC30702 = this.f19318;
        if (interfaceC30702 != null) {
            interfaceC30702.mo7557();
        }
    }
}
