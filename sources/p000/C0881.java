package p000;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0881 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C0882 f3996;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f3997;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte[] f3998;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f3999;

    @Override // p000.InterfaceC0875
    public final void close() {
        if (this.f3998 != null) {
            this.f3998 = null;
            m3675();
        }
        this.f3996 = null;
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f3997;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f3998;
        int i4 = AbstractC4470.f17202;
        System.arraycopy(bArr2, this.f3999, bArr, i, iMin);
        this.f3999 += iMin;
        this.f3997 -= iMin;
        m3676(iMin);
        return iMin;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws ParserException, DataSourceException {
        m3673();
        this.f3996 = c0882;
        Uri uriNormalizeScheme = c0882.f4004.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC4464.m10124("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC4470.f17202;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f3998 = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(ᐧʻ.ﾞˊ("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f3998 = URLDecoder.decode(str, AbstractC4010.f15451.name()).getBytes(AbstractC4010.f15450);
        }
        byte[] bArr = this.f3998;
        long length = bArr.length;
        long j = c0882.f4001;
        if (j > length) {
            this.f3998 = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.f3999 = i2;
        int length2 = bArr.length - i2;
        this.f3997 = length2;
        long j2 = c0882.f4005;
        if (j2 != -1) {
            this.f3997 = (int) Math.min(length2, j2);
        }
        m3677(c0882);
        return j2 != -1 ? j2 : this.f3997;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        C0882 c0882 = this.f3996;
        if (c0882 != null) {
            return c0882.f4004;
        }
        return null;
    }
}
