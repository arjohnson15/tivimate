package p397;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.leanback.widget.ʿˏ;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p031.InterfaceC1197;
import p033.C1220;
import p112.AbstractC1815;
import p112.C1808;
import p112.C1809;
import p112.C1810;
import p112.C1814;
import p166.InterfaceC2446;
import p256.C3196;
import p334.C3789;
import p345.AbstractC3980;
import p353.InterfaceC4019;
import p383.AbstractC4464;
import p383.C4460;
import p383.InterfaceC4461;

/* renamed from: ⁱᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4607 implements InterfaceC4019, InterfaceC1197, InterfaceC4461 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17629;

    public /* synthetic */ C4607(int i) {
        this.f17629 = i;
    }

    @Override // p353.InterfaceC4019
    public Object apply(Object obj) {
        switch (this.f17629) {
            case 0:
                C1808 c1808 = (C1808) obj;
                c1808.getClass();
                Bundle bundle = new Bundle();
                CharSequence charSequence = c1808.f6995;
                if (charSequence != null) {
                    bundle.putCharSequence(C1808.f6973, charSequence);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        String str = AbstractC1815.f7034;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (C1814 c1814 : (C1814[]) spanned.getSpans(0, spanned.length(), C1814.class)) {
                            c1814.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(C1814.f7027, c1814.f7030);
                            bundle2.putInt(C1814.f7028, c1814.f7029);
                            arrayList.add(AbstractC1815.m5557(spanned, c1814, 1, bundle2));
                        }
                        for (C1810 c1810 : (C1810[]) spanned.getSpans(0, spanned.length(), C1810.class)) {
                            c1810.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(C1810.f7004, c1810.f7007);
                            bundle3.putInt(C1810.f7002, c1810.f7005);
                            bundle3.putInt(C1810.f7003, c1810.f7006);
                            arrayList.add(AbstractC1815.m5557(spanned, c1810, 2, bundle3));
                        }
                        for (C1809 c1809 : (C1809[]) spanned.getSpans(0, spanned.length(), C1809.class)) {
                            arrayList.add(AbstractC1815.m5557(spanned, c1809, 3, null));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(C1808.f6978, arrayList);
                        }
                    }
                }
                bundle.putSerializable(C1808.f6980, c1808.f6985);
                bundle.putSerializable(C1808.f6966, c1808.f6993);
                bundle.putFloat(C1808.f6983, c1808.f6986);
                bundle.putInt(C1808.f6974, c1808.f6996);
                bundle.putInt(C1808.f6981, c1808.f6997);
                bundle.putFloat(C1808.f6969, c1808.f6992);
                bundle.putInt(C1808.f6977, c1808.f7001);
                bundle.putInt(C1808.f6967, c1808.f6998);
                bundle.putFloat(C1808.f6972, c1808.f6991);
                bundle.putFloat(C1808.f6976, c1808.f6987);
                bundle.putFloat(C1808.f6968, c1808.f6990);
                bundle.putBoolean(C1808.f6982, c1808.f6988);
                bundle.putInt(C1808.f6979, c1808.f6989);
                bundle.putInt(C1808.f6970, c1808.f6994);
                bundle.putFloat(C1808.f6975, c1808.f6999);
                Bitmap bitmap = c1808.f7000;
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC4464.m10132(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(C1808.f6984, byteArrayOutputStream.toByteArray());
                }
                return bundle;
            case 1:
                long j = ((C4598) obj).f17598;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 2:
                return AbstractC3980.m9207(Integer.valueOf(((C3196) obj).f12424));
            default:
                return new C1220((C4460) obj);
        }
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj;
        switch (this.f17629) {
            case 10:
                interfaceC2446.mo4344(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                interfaceC2446.mo4350();
                break;
        }
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public Object mo4098(ʿˏ r2) {
        switch (this.f17629) {
            case 3:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(r2);
            case 4:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(r2);
            case 5:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(r2);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(r2);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(r2);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(r2);
        }
    }
}
