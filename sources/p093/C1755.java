package p093;

import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import p310.C3581;
import p312.AbstractC3584;
import p312.AbstractC3587;
import p312.C3589;
import p328.C3729;
import p383.AbstractC4464;
import p397.AbstractC4600;
import p397.C4611;
import p397.C4612;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import p397.InterfaceC4608;

/* renamed from: ˆʼ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1755 extends AbstractC3587 implements InterfaceC4608 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final /* synthetic */ int f6790 = 0;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final Object f6791;

    public C1755(String str, InterfaceC4602 interfaceC4602) {
        super(new C4612[2], new AbstractC4600[2]);
        int i = this.f13796;
        C3589[] c3589Arr = this.f13787;
        AbstractC4464.m10132(i == c3589Arr.length);
        for (C3589 c3589 : c3589Arr) {
            c3589.m8491(1024);
        }
        this.f6791 = interfaceC4602;
    }

    public C1755(C3581 c3581) {
        super(new C3589[1], new C3729[1]);
        this.f6791 = c3581;
    }

    @Override // p312.AbstractC3587
    /* renamed from: ˉי */
    public final DecoderException mo1103(C3589 c3589, AbstractC3584 abstractC3584, boolean z) {
        switch (this.f6790) {
            case 0:
                C4612 c4612 = (C4612) c3589;
                AbstractC4600 abstractC4600 = (AbstractC4600) abstractC3584;
                try {
                    ByteBuffer byteBuffer = c4612.f13800;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    InterfaceC4602 interfaceC4602 = (InterfaceC4602) this.f6791;
                    if (z) {
                        interfaceC4602.mo2495();
                    }
                    InterfaceC4599 interfaceC4599Mo2492 = interfaceC4602.mo2492(bArrArray, 0, iLimit);
                    long j = c4612.f13807;
                    long j2 = c4612.f17636;
                    abstractC4600.f13784 = j;
                    abstractC4600.f17602 = interfaceC4599Mo2492;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    abstractC4600.f17603 = j;
                    abstractC4600.f13783 = false;
                    return null;
                } catch (SubtitleDecoderException e) {
                    return e;
                }
            default:
                C3729 c3729 = (C3729) abstractC3584;
                try {
                    ByteBuffer byteBuffer2 = c3589.f13800;
                    byteBuffer2.getClass();
                    AbstractC4464.m10132(byteBuffer2.hasArray());
                    AbstractC4464.m10142(byteBuffer2.arrayOffset() == 0);
                    C3581 c3581 = (C3581) this.f6791;
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iRemaining = byteBuffer2.remaining();
                    c3581.getClass();
                    c3729.f14477 = C3581.m8482(iRemaining, bArrArray2);
                    c3729.f13784 = c3589.f13807;
                    return null;
                } catch (ImageDecoderException e2) {
                    return e2;
                }
        }
    }

    @Override // p312.AbstractC3587
    /* renamed from: ˏᵢ */
    public final AbstractC3584 mo1104() {
        switch (this.f6790) {
            case 0:
                return new C4611(this);
            default:
                return new C3729(this);
        }
    }

    @Override // p397.InterfaceC4608
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo5469(long j) {
    }

    @Override // p312.AbstractC3587
    /* renamed from: ᐧʻ */
    public final C3589 mo1106() {
        switch (this.f6790) {
            case 0:
                return new C4612();
            default:
                return new C3589(1, 0);
        }
    }

    @Override // p312.AbstractC3587
    /* renamed from: ﹶˆ */
    public final DecoderException mo1107(Throwable th) {
        switch (this.f6790) {
            case 0:
                return new SubtitleDecoderException("Unexpected decode error", th);
            default:
                return new ImageDecoderException("Unexpected decode error", th);
        }
    }
}
