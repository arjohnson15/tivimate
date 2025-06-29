package p102;

import com.hierynomus.protocol.transport.TransportException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import p196.C2711;
import p266.C3262;
import p344.InterfaceC3918;

/* renamed from: ˆˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1784 implements InterfaceC3918 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile InterfaceC3918 f6922;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3262 f6923;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Boolean f6924;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Method f6925;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f6926;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final LinkedBlockingQueue f6927;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean f6928;

    public C1784(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f6926 = str;
        this.f6927 = linkedBlockingQueue;
        this.f6928 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1784.class == obj.getClass() && this.f6926.equals(((C1784) obj).f6926);
    }

    public final int hashCode() {
        return this.f6926.hashCode();
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void mo5507(Object... objArr) {
        m5524().mo5507(objArr);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m5508() {
        Boolean bool = this.f6924;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f6925 = this.f6922.getClass().getMethod("log", C2711.class);
            this.f6924 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f6924 = Boolean.FALSE;
        }
        return this.f6924.booleanValue();
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void mo5509(Object obj, Object obj2, String str) {
        m5524().mo5509(obj, obj2, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo5510(String str, Throwable th) {
        m5524().mo5510(str, th);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void mo5511(Long l, IOException iOException) {
        m5524().mo5511(l, iOException);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void mo5512(Object obj, String str) {
        m5524().mo5512(obj, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo5513(Object obj, String str) {
        m5524().mo5513(obj, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo5514() {
        m5524().mo5514();
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void mo5515(Exception exc) {
        m5524().mo5515(exc);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo5516(Object obj, String str) {
        m5524().mo5516(obj, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void mo5517(Object obj, String str) {
        m5524().mo5517(obj, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo5518(Object obj, String str) {
        m5524().mo5518(obj, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void mo5519(TransportException transportException) {
        m5524().mo5519(transportException);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo5520(String str, Object... objArr) {
        m5524().mo5520(str, objArr);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String mo5521() {
        return this.f6926;
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo5522(String str) {
        m5524().mo5522(str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final void mo5523(String str, Object obj, Number number) {
        m5524().mo5523(str, obj, number);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3918 m5524() {
        if (this.f6922 != null) {
            return this.f6922;
        }
        if (this.f6928) {
            return C1786.f6929;
        }
        if (this.f6923 == null) {
            C3262 c3262 = new C3262();
            c3262.f12724 = this;
            c3262.f12726 = this.f6926;
            c3262.f12725 = this.f6927;
            this.f6923 = c3262;
        }
        return this.f6923;
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo5525(Object... objArr) {
        m5524().mo5525(objArr);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo5526(Object obj, Object obj2, String str) {
        m5524().mo5526(obj, obj2, str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void mo5527(Object... objArr) {
        m5524().mo5527(objArr);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void mo5528(String str) {
        m5524().mo5528(str);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo5529(Object obj, Object obj2, String str) {
        m5524().mo5529(obj, obj2, str);
    }
}
