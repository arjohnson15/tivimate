package p364;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: ᵔﹳ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4138 implements InterfaceC4139 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InputContentInfo f16031;

    public C4138(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16031 = new InputContentInfo(uri, clipDescription, uri2);
    }

    public C4138(Object obj) {
        this.f16031 = (InputContentInfo) obj;
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ʽᐧ */
    public final Object mo8779() {
        return this.f16031;
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ʿʼ */
    public final Uri mo8780() {
        return this.f16031.getLinkUri();
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ˑʽ */
    public final Uri mo8787() {
        return this.f16031.getContentUri();
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ـﹶ */
    public final ClipDescription mo8789() {
        return this.f16031.getDescription();
    }

    @Override // p364.InterfaceC4139
    /* renamed from: ﹳﹳ */
    public final void mo8796() {
        this.f16031.requestPermission();
    }
}
