package p435;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: ﹶᵔ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5048 implements Closeable, Flushable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int[] f19156;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f19157;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public String[] f19158;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int[] f19159;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f19160;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f19161;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract C5061 mo11173();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract C5061 mo11174(String str);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public abstract C5061 mo11175(long j);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int m11176() {
        int i = this.f19160;
        if (i != 0) {
            return this.f19156[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract C5061 mo11177();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract C5061 mo11178();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract C5061 mo11179();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public abstract C5061 mo11180(Number number);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public abstract C5061 mo11181(String str);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m11182() {
        return AbstractC5047.m11168(this.f19160, this.f19156, this.f19158, this.f19159);
    }
}
