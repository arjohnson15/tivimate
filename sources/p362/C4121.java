package p362;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import p007.C0959;
import p076.C1665;
import p266.C3262;
import p383.AbstractC4470;

/* renamed from: ᵔᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4121 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C0959 f15917;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4129 f15918;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f15919;

    public /* synthetic */ C4121(InterfaceC4129 interfaceC4129, C0959 c0959, int i) {
        this.f15919 = i;
        this.f15918 = interfaceC4129;
        this.f15917 = c0959;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f15919) {
            case 0:
                C1665 c1665 = (C1665) this.f15918;
                C0959 c0959 = this.f15917;
                c1665.getClass();
                c0959.getClass();
                if (AbstractC4470.f17202 >= 30) {
                    c0959.m3895(j);
                    break;
                } else {
                    Handler handler = c0959.f4257;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                C3262 c3262 = (C3262) this.f15918;
                C0959 c09592 = this.f15917;
                c3262.getClass();
                c09592.getClass();
                if (AbstractC4470.f17202 >= 30) {
                    c09592.m3895(j);
                    break;
                } else {
                    Handler handler2 = c09592.f4257;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
