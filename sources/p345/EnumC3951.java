package p345;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ﹶⁱ.ـﹶ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᵎᴵ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3951 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3951[] f15311;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC3951 f15312;

    static {
        EnumC3951 enumC3951 = new EnumC3951("INSTANCE", 0);
        f15312 = enumC3951;
        f15311 = new EnumC3951[]{enumC3951};
    }

    public static EnumC3951 valueOf(String str) {
        return (EnumC3951) Enum.valueOf(EnumC3951.class, str);
    }

    public static EnumC3951[] values() {
        return (EnumC3951[]) f15311.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ـﹶ.ˉⁱ("no calls to next() since the last call to remove()", false);
    }
}
