package p093;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p023.C1147;
import p112.C1811;
import p166.AbstractC2435;
import p166.C2431;
import p293.C3474;
import p310.C3581;
import p312.C3589;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p362.C4125;
import p383.AbstractC4464;
import p397.AbstractC4600;
import p397.C4598;
import p397.C4612;
import p397.InterfaceC4608;
import p438.AbstractC5115;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;
import p456.C5349;
import ʾי.ˑʽ;
import ـˊ.ʿʼ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˆʼ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1756 extends AbstractC5115 implements Handler.Callback {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final ʿʼ f6792;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC5075 f6793;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f6794;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C4612 f6795;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final C5349 f6796;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public AbstractC4600 f6797;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f6798;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f6799;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f6800;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final Handler f6801;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public long f6802;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f6803;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public C2431 f6804;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public InterfaceC4608 f6805;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public long f6806;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public long f6807;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public InterfaceC1758 f6808;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C3589 f6809;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public AbstractC4600 f6810;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final ˑʽ f6811;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1756(SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075, Looper looper) {
        super(3);
        ˑʽ r0 = InterfaceC1759.f6814;
        this.f6793 = surfaceHolderCallbackC5075;
        this.f6801 = looper == null ? null : new Handler(looper, this);
        this.f6811 = r0;
        this.f6792 = new ʿʼ(8);
        this.f6809 = new C3589(1, 0);
        this.f6796 = new C5349(19);
        this.f6806 = -9223372036854775807L;
        this.f6802 = -9223372036854775807L;
        this.f6807 = -9223372036854775807L;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m5474((C1811) message.obj);
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ */
    public final void mo1115(C2431[] c2431Arr, long j, long j2) {
        this.f6802 = j2;
        C2431 c2431 = c2431Arr[0];
        this.f6804 = c2431;
        if (Objects.equals(c2431.f9667, "application/x-media3-cues")) {
            this.f6808 = this.f6804.f9686 == 1 ? new C1757() : new C1147(4);
            return;
        }
        m5470();
        if (this.f6805 != null) {
            this.f6799 = 1;
        } else {
            m5471();
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m5470() {
        AbstractC4464.m10130("Legacy decoding is disabled, can't handle " + this.f6804.f9667 + " samples (expected application/x-media3-cues).", Objects.equals(this.f6804.f9667, "application/cea-608") || Objects.equals(this.f6804.f9667, "application/x-mp4-cea-608") || Objects.equals(this.f6804.f9667, "application/cea-708"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5471() {
        /*
            r7 = this;
            r0 = 1
            r7.f6798 = r0
            ˊﹶ.ᵎـ r1 = r7.f6804
            r1.getClass()
            ʾי.ˑʽ r2 = r7.f6811
            r2.getClass()
            java.lang.String r3 = r1.f9667
            if (r3 == 0) goto L4d
            int r4 = r1.f9661
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = -1
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            ˊˉ.ᐧʻ r0 = new ˊˉ.ᐧʻ
            java.util.List r1 = r1.f9674
            r0.<init>(r4, r1)
            goto L6f
        L47:
            ˊˉ.ˑʽ r0 = new ˊˉ.ˑʽ
            r0.<init>(r3, r4)
            goto L6f
        L4d:
            java.lang.Object r0 = r2.ˆʿ
            ٴᵎ.ـﹶ r0 = (p293.C3474) r0
            boolean r2 = r0.mo8055(r1)
            if (r2 == 0) goto L77
            ⁱᵎ.ˋⁱ r0 = r0.mo8058(r1)
            ˆʼ.ʽᐧ r1 = new ˆʼ.ʽᐧ
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            r0 = r1
        L6f:
            r7.f6805 = r0
            long r1 = r7.f19475
            r0.mo6381(r1)
            return
        L77:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = ᵎﹳ.ᐧʻ.ﾞˊ(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p093.C1756.m5471():void");
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ */
    public final int mo1118(C2431 c2431) {
        if (!Objects.equals(c2431.f9667, "application/x-media3-cues")) {
            ˑʽ r0 = this.f6811;
            r0.getClass();
            if (!((C3474) r0.ˆʿ).mo8055(c2431)) {
                String str = c2431.f9667;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC2435.m6551(str) ? ᐧʻ.ˑʽ(1, 0, 0, 0) : ᐧʻ.ˑʽ(0, 0, 0, 0);
                }
            }
        }
        return ᐧʻ.ˑʽ(c2431.f9676 == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        return true;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long m5472() {
        if (this.f6800 == -1) {
            return Long.MAX_VALUE;
        }
        this.f6797.getClass();
        if (this.f6800 >= this.f6797.mo7949()) {
            return Long.MAX_VALUE;
        }
        return this.f6797.mo7950(this.f6800);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return this.f6803;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) {
        this.f6807 = j;
        InterfaceC1758 interfaceC1758 = this.f6808;
        if (interfaceC1758 != null) {
            interfaceC1758.clear();
        }
        C3932 c3932 = C3932.f15274;
        m5473(this.f6807);
        C1811 c1811 = new C1811(c3932);
        Handler handler = this.f6801;
        if (handler != null) {
            handler.obtainMessage(1, c1811).sendToTarget();
        } else {
            m5474(c1811);
        }
        this.f6794 = false;
        this.f6803 = false;
        this.f6806 = -9223372036854775807L;
        C2431 c2431 = this.f6804;
        if (c2431 == null || Objects.equals(c2431.f9667, "application/x-media3-cues")) {
            return;
        }
        if (this.f6799 == 0) {
            m5475();
            InterfaceC4608 interfaceC4608 = this.f6805;
            interfaceC4608.getClass();
            interfaceC4608.flush();
            interfaceC4608.mo6381(this.f19475);
            return;
        }
        m5475();
        InterfaceC4608 interfaceC46082 = this.f6805;
        interfaceC46082.getClass();
        interfaceC46082.mo1102();
        this.f6805 = null;
        this.f6799 = 0;
        m5471();
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final long m5473(long j) {
        AbstractC4464.m10132(j != -9223372036854775807L);
        AbstractC4464.m10132(this.f6802 != -9223372036854775807L);
        return j - this.f6802;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        this.f6804 = null;
        this.f6806 = -9223372036854775807L;
        C3932 c3932 = C3932.f15274;
        m5473(this.f6807);
        C1811 c1811 = new C1811(c3932);
        Handler handler = this.f6801;
        if (handler != null) {
            handler.obtainMessage(1, c1811).sendToTarget();
        } else {
            m5474(c1811);
        }
        this.f6802 = -9223372036854775807L;
        this.f6807 = -9223372036854775807L;
        if (this.f6805 != null) {
            m5475();
            InterfaceC4608 interfaceC4608 = this.f6805;
            interfaceC4608.getClass();
            interfaceC4608.mo1102();
            this.f6805 = null;
            this.f6799 = 0;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m5474(C1811 c1811) {
        AbstractC3980 abstractC3980 = c1811.f7009;
        SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = this.f6793;
        surfaceHolderCallbackC5075.f19247.f19524.ᐧʻ(27, new C4125(19, abstractC3980));
        C5118 c5118 = surfaceHolderCallbackC5075.f19247;
        c5118.f19564 = c1811;
        c5118.f19524.ᐧʻ(27, new C4125(16, c1811));
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m5475() {
        this.f6795 = null;
        this.f6800 = -1;
        AbstractC4600 abstractC4600 = this.f6797;
        if (abstractC4600 != null) {
            abstractC4600.mo1101();
            this.f6797 = null;
        }
        AbstractC4600 abstractC46002 = this.f6810;
        if (abstractC46002 != null) {
            abstractC46002.mo1101();
            this.f6810 = null;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "TextRenderer";
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ */
    public final void mo1138(long j, long j2) {
        boolean z;
        C5349 c5349;
        long jMo7950;
        if (this.f19481) {
            long j3 = this.f6806;
            if (j3 != -9223372036854775807L && j >= j3) {
                m5475();
                this.f6803 = true;
            }
        }
        if (this.f6803) {
            return;
        }
        C2431 c2431 = this.f6804;
        c2431.getClass();
        boolean zEquals = Objects.equals(c2431.f9667, "application/x-media3-cues");
        Handler handler = this.f6801;
        boolean zMo4169 = false;
        zMo4169 = false;
        zMo4169 = false;
        C5349 c53492 = this.f6796;
        if (zEquals) {
            this.f6808.getClass();
            if (!this.f6794) {
                C3589 c3589 = this.f6809;
                if (m11336(c53492, c3589, 0) == -4) {
                    if (c3589.m4401(4)) {
                        this.f6794 = true;
                    } else {
                        c3589.m8494();
                        ByteBuffer byteBuffer = c3589.f13800;
                        byteBuffer.getClass();
                        long j4 = c3589.f13807;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f6792.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C3581 c3581 = new C3581(29);
                        C3961 c3961M9205 = AbstractC3980.m9205();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            c3961M9205.m9172(c3581.apply(bundle2));
                        }
                        C4598 c4598 = new C4598(c3961M9205.m9167(), j4, bundle.getLong("d"));
                        c3589.mo8492();
                        zMo4169 = this.f6808.mo4169(c4598, j);
                    }
                }
            }
            long jMo4163 = this.f6808.mo4163(this.f6807);
            if (jMo4163 == Long.MIN_VALUE && this.f6794 && !zMo4169) {
                this.f6803 = true;
            }
            if (jMo4163 != Long.MIN_VALUE && jMo4163 <= j) {
                zMo4169 = true;
            }
            if (zMo4169) {
                AbstractC3980 abstractC3980Mo4170 = this.f6808.mo4170(j);
                long jMo4173 = this.f6808.mo4173(j);
                m5473(jMo4173);
                C1811 c1811 = new C1811(abstractC3980Mo4170);
                if (handler != null) {
                    handler.obtainMessage(1, c1811).sendToTarget();
                } else {
                    m5474(c1811);
                }
                this.f6808.mo4164(jMo4173);
            }
            this.f6807 = j;
            return;
        }
        m5470();
        this.f6807 = j;
        if (this.f6810 == null) {
            InterfaceC4608 interfaceC4608 = this.f6805;
            interfaceC4608.getClass();
            interfaceC4608.mo5469(j);
            try {
                InterfaceC4608 interfaceC46082 = this.f6805;
                interfaceC46082.getClass();
                this.f6810 = (AbstractC4600) interfaceC46082.mo6378();
            } catch (SubtitleDecoderException e) {
                AbstractC4464.m10147("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f6804, e);
                C3932 c3932 = C3932.f15274;
                m5473(this.f6807);
                C1811 c18112 = new C1811(c3932);
                if (handler != null) {
                    handler.obtainMessage(1, c18112).sendToTarget();
                } else {
                    m5474(c18112);
                }
                m5475();
                InterfaceC4608 interfaceC46083 = this.f6805;
                interfaceC46083.getClass();
                interfaceC46083.mo1102();
                this.f6805 = null;
                this.f6799 = 0;
                m5471();
                return;
            }
        }
        if (this.f19478 != 2) {
            return;
        }
        if (this.f6797 != null) {
            long jM5472 = m5472();
            z = false;
            while (jM5472 <= j) {
                this.f6800++;
                jM5472 = m5472();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC4600 abstractC4600 = this.f6810;
        if (abstractC4600 == null) {
            c5349 = c53492;
        } else if (abstractC4600.m4401(4)) {
            if (!z && m5472() == Long.MAX_VALUE) {
                if (this.f6799 == 2) {
                    m5475();
                    InterfaceC4608 interfaceC46084 = this.f6805;
                    interfaceC46084.getClass();
                    interfaceC46084.mo1102();
                    this.f6805 = null;
                    this.f6799 = 0;
                    m5471();
                } else {
                    m5475();
                    this.f6803 = true;
                }
            }
            c5349 = c53492;
        } else {
            c5349 = c53492;
            if (abstractC4600.f13784 <= j) {
                AbstractC4600 abstractC46002 = this.f6797;
                if (abstractC46002 != null) {
                    abstractC46002.mo1101();
                }
                this.f6800 = abstractC4600.mo7944(j);
                this.f6797 = abstractC4600;
                this.f6810 = null;
                z = true;
            }
        }
        if (z) {
            this.f6797.getClass();
            int iMo7944 = this.f6797.mo7944(j);
            if (iMo7944 == 0 || this.f6797.mo7949() == 0) {
                jMo7950 = this.f6797.f13784;
            } else if (iMo7944 == -1) {
                AbstractC4600 abstractC46003 = this.f6797;
                jMo7950 = abstractC46003.mo7950(abstractC46003.mo7949() - 1);
            } else {
                jMo7950 = this.f6797.mo7950(iMo7944 - 1);
            }
            m5473(jMo7950);
            C1811 c18113 = new C1811(this.f6797.mo7939(j));
            if (handler != null) {
                handler.obtainMessage(1, c18113).sendToTarget();
            } else {
                m5474(c18113);
            }
        }
        if (this.f6799 == 2) {
            return;
        }
        while (!this.f6794) {
            try {
                C4612 c4612 = this.f6795;
                if (c4612 == null) {
                    InterfaceC4608 interfaceC46085 = this.f6805;
                    interfaceC46085.getClass();
                    c4612 = (C4612) interfaceC46085.mo6382();
                    if (c4612 == null) {
                        return;
                    } else {
                        this.f6795 = c4612;
                    }
                }
                if (this.f6799 == 1) {
                    c4612.f5033 = 4;
                    InterfaceC4608 interfaceC46086 = this.f6805;
                    interfaceC46086.getClass();
                    interfaceC46086.mo6384(c4612);
                    this.f6795 = null;
                    this.f6799 = 2;
                    return;
                }
                C5349 c53493 = c5349;
                int iM11336 = m11336(c53493, c4612, 0);
                if (iM11336 == -4) {
                    if (c4612.m4401(4)) {
                        this.f6794 = true;
                        this.f6798 = false;
                    } else {
                        C2431 c24312 = (C2431) c53493.f20757;
                        if (c24312 == null) {
                            return;
                        }
                        c4612.f17636 = c24312.f9669;
                        c4612.m8494();
                        this.f6798 &= !c4612.m4401(1);
                    }
                    if (!this.f6798) {
                        InterfaceC4608 interfaceC46087 = this.f6805;
                        interfaceC46087.getClass();
                        interfaceC46087.mo6384(c4612);
                        this.f6795 = null;
                    }
                } else if (iM11336 == -3) {
                    return;
                }
                c5349 = c53493;
            } catch (SubtitleDecoderException e2) {
                AbstractC4464.m10147("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f6804, e2);
                C3932 c39322 = C3932.f15274;
                m5473(this.f6807);
                C1811 c18114 = new C1811(c39322);
                if (handler != null) {
                    handler.obtainMessage(1, c18114).sendToTarget();
                } else {
                    m5474(c18114);
                }
                m5475();
                InterfaceC4608 interfaceC46088 = this.f6805;
                interfaceC46088.getClass();
                interfaceC46088.mo1102();
                this.f6805 = null;
                this.f6799 = 0;
                m5471();
                return;
            }
        }
    }
}
