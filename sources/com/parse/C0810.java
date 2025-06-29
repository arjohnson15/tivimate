package com.parse;

import java.io.File;
import java.util.Comparator;
import java.util.concurrent.locks.Lock;

/* renamed from: com.parse.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0810 implements Comparator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f3721;

    public /* synthetic */ C0810(int i) {
        this.f3721 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3721) {
            case 0:
                return LockSet.lambda$new$0((Lock) obj, (Lock) obj2);
            default:
                return ParseKeyValueCache.lambda$saveToKeyValueCache$1((File) obj, (File) obj2);
        }
    }
}
