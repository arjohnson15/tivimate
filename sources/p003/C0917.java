package p003;

import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p260.C3222;
import p329.AbstractC3740;

/* renamed from: ʻʾ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0917 implements InterfaceC0270, InterfaceC0281 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3222 f4080;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC0281 f4081;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f4082;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public EnumC0293 f4083;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f4084;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public List f4085;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f4086;

    public C0917(ArrayList arrayList, C3222 c3222) {
        this.f4080 = c3222;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4084 = arrayList;
        this.f4082 = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        this.f4086 = true;
        Iterator it = this.f4084.iterator();
        while (it.hasNext()) {
            ((InterfaceC0270) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() {
        List list = this.f4085;
        if (list != null) {
            this.f4080.m7946(list);
        }
        this.f4085 = null;
        Iterator it = this.f4084.iterator();
        while (it.hasNext()) {
            ((InterfaceC0270) it.next()).mo1527();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ʿʼ */
    public final void mo1540(Object obj) {
        if (obj != null) {
            this.f4081.mo1540(obj);
        } else {
            m3738();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ˑʽ */
    public final void mo1541(Exception exc) {
        List list = this.f4085;
        AbstractC3740.m8706(list, "Argument must not be null");
        list.add(exc);
        m3738();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        return ((InterfaceC0270) this.f4084.get(0)).mo1533();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        this.f4083 = enumC0293;
        this.f4081 = interfaceC0281;
        this.f4085 = (List) this.f4080.m7947();
        ((InterfaceC0270) this.f4084.get(this.f4082)).mo1529(enumC0293, this);
        if (this.f4086) {
            cancel();
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m3738() {
        if (this.f4086) {
            return;
        }
        if (this.f4082 < this.f4084.size() - 1) {
            this.f4082++;
            mo1529(this.f4083, this.f4081);
        } else {
            AbstractC3740.m8705(this.f4085);
            this.f4081.mo1541(new GlideException("Fetch failed", new ArrayList(this.f4085)));
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        return ((InterfaceC0270) this.f4084.get(0)).mo1531();
    }
}
