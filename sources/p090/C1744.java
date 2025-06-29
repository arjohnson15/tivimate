package p090;

import android.content.Context;
import androidx.lifecycle.C0248;
import java.io.IOException;
import p034.AbstractC1227;
import p034.InterfaceC1224;
import p034.InterfaceC1229;
import p288.C3399;
import p288.C3406;

/* renamed from: ʿﹶ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1744 implements InterfaceC1229 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f6756;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f6757;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC1227 f6758;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f6759;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f6760;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3406 f6761 = new C3406(new C0248(5, this));

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f6762;

    public C1744(Context context, String str, AbstractC1227 abstractC1227, boolean z, boolean z2) {
        this.f6760 = context;
        this.f6756 = str;
        this.f6758 = abstractC1227;
        this.f6759 = z;
        this.f6757 = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6761.f13257 != C3399.f13252) {
            ((C1748) this.f6761.getValue()).close();
        }
    }

    @Override // p034.InterfaceC1229
    public final String getDatabaseName() {
        return this.f6756;
    }

    @Override // p034.InterfaceC1229
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f6761.f13257 != C3399.f13252) {
            ((C1748) this.f6761.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f6762 = z;
    }

    @Override // p034.InterfaceC1229
    /* renamed from: ˋﾞ */
    public final InterfaceC1224 mo4418() {
        return ((C1748) this.f6761.getValue()).m5466(true);
    }
}
