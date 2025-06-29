package p162;

import com.google.android.material.carousel.CarouselLayoutManager;
import p034.AbstractC1227;

/* renamed from: ˊᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2352 extends AbstractC1227 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f9319;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f9320;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2352(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.f9319 = i;
        switch (i) {
            case 1:
                this.f9320 = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.f9320 = carouselLayoutManager;
                break;
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ˉי */
    public final int mo4402() {
        switch (this.f9319) {
            case 0:
                return 0;
            default:
                return this.f9320.m4824();
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ˏᵢ */
    public final int mo4407() {
        switch (this.f9319) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f9320;
                return carouselLayoutManager.f5729 - carouselLayoutManager.m4848();
            default:
                return this.f9320.f5729;
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ٴˎ */
    public final int mo4410() {
        switch (this.f9319) {
            case 0:
                return this.f9320.f5723;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f9320;
                return carouselLayoutManager.f5723 - carouselLayoutManager.m4833();
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ᐧʻ */
    public final int mo4411() {
        switch (this.f9319) {
            case 0:
                return this.f9320.m4835();
            default:
                return 0;
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ﹶˆ */
    public final int mo4413() {
        switch (this.f9319) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f9320;
                if (carouselLayoutManager.m2844()) {
                    return carouselLayoutManager.f5729;
                }
                return 0;
        }
    }
}
