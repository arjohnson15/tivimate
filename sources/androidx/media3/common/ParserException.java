package androidx.media3.common;

import java.io.IOException;
import p447.AbstractC5179;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f1333;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f1334;

    public ParserException(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.f1334 = z;
        this.f1333 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ParserException m1095(String str, Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ParserException m1096(String str) {
        return new ParserException(str, null, false, 1);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ParserException m1097(String str, RuntimeException runtimeException) {
        return new ParserException(str, runtimeException, true, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f1334);
        sb.append(", dataType=");
        return AbstractC5179.m11550(sb, this.f1333, "}");
    }
}
