package p379;

import java.io.IOException;
import java.util.List;
import p363.AbstractC4133;

/* renamed from: ᵢᐧ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4400 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f16941 = 2;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ C4413 f16942;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ int f16943;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400(String str, C4413 c4413, int i, int i2) {
        super(str, true);
        this.f16942 = c4413;
        this.f16943 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400(String str, C4413 c4413, int i, List list) {
        super(str, true);
        this.f16942 = c4413;
        this.f16943 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400(String str, C4413 c4413, int i, List list, boolean z) {
        super(str, true);
        this.f16942 = c4413;
        this.f16943 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final long m9989() {
        this.f16942.f17025.getClass();
        try {
            this.f16942.f17008.m10032(this.f16943, 9);
            synchronized (this.f16942) {
                this.f16942.f17003.remove(Integer.valueOf(this.f16943));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final long m9990() {
        this.f16942.f17025.getClass();
        try {
            this.f16942.f17008.m10032(this.f16943, 9);
            synchronized (this.f16942) {
                this.f16942.f17003.remove(Integer.valueOf(this.f16943));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ */
    public final long mo4576() {
        switch (this.f16941) {
            case 0:
                return m9989();
            case 1:
                return m9990();
            default:
                this.f16942.f17025.getClass();
                synchronized (this.f16942) {
                    this.f16942.f17003.remove(Integer.valueOf(this.f16943));
                }
                return -1L;
        }
    }
}
