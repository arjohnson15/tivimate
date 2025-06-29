package p007;

import p166.C2437;

/* renamed from: ʻˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0956 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0966 f4227;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4228;

    public /* synthetic */ RunnableC0956(C0957 c0957, InterfaceC0966 interfaceC0966, int i) {
        this.f4228 = i;
        this.f4227 = interfaceC0966;
    }

    public /* synthetic */ RunnableC0956(C0957 c0957, InterfaceC0966 interfaceC0966, C2437 c2437) {
        this.f4228 = 0;
        this.f4227 = interfaceC0966;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4228) {
            case 0:
                this.f4227.getClass();
                break;
            case 1:
                this.f4227.m3899();
                break;
            default:
                this.f4227.m3898();
                break;
        }
    }
}
