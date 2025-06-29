package p056;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ʾˈ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1339 implements InterfaceC1335 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1333 f5462;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1333 f5463;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f5464;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1333 f5465;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ByteBuffer f5466;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ByteBuffer f5467;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1333 f5468;

    public AbstractC1339() {
        ByteBuffer byteBuffer = InterfaceC1335.f5442;
        this.f5466 = byteBuffer;
        this.f5467 = byteBuffer;
        C1333 c1333 = C1333.f5415;
        this.f5468 = c1333;
        this.f5463 = c1333;
        this.f5462 = c1333;
        this.f5465 = c1333;
    }

    @Override // p056.InterfaceC1335
    public final void flush() {
        this.f5467 = InterfaceC1335.f5442;
        this.f5464 = false;
        this.f5462 = this.f5468;
        this.f5465 = this.f5463;
        mo4669();
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ʽᐧ */
    public boolean mo4652() {
        return this.f5463 != C1333.f5415;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ʿʼ */
    public final C1333 mo4653(C1333 c1333) {
        this.f5468 = c1333;
        this.f5463 = mo4665(c1333);
        return mo4652() ? this.f5463 : C1333.f5415;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void mo4666() {
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ByteBuffer m4667(int i) {
        if (this.f5466.capacity() < i) {
            this.f5466 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f5466.clear();
        }
        ByteBuffer byteBuffer = this.f5466;
        this.f5467 = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void mo4668() {
    }

    /* renamed from: ˏᵢ */
    public abstract C1333 mo4665(C1333 c1333);

    @Override // p056.InterfaceC1335
    /* renamed from: ˑʽ */
    public boolean mo4654() {
        return this.f5464 && this.f5467 == InterfaceC1335.f5442;
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ـﹶ */
    public final void mo4655() {
        flush();
        this.f5466 = InterfaceC1335.f5442;
        C1333 c1333 = C1333.f5415;
        this.f5468 = c1333;
        this.f5463 = c1333;
        this.f5462 = c1333;
        this.f5465 = c1333;
        mo4668();
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ٴˎ */
    public final void mo4656() {
        this.f5464 = true;
        mo4666();
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ﹳﹳ */
    public ByteBuffer mo4658() {
        ByteBuffer byteBuffer = this.f5467;
        this.f5467 = InterfaceC1335.f5442;
        return byteBuffer;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void mo4669() {
    }
}
