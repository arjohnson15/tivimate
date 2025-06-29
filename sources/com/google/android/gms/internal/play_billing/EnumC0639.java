package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC0639 {
    f3017("RESPONSE_CODE_UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("SERVICE_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("FEATURE_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36("SERVICE_DISCONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("OK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF52("USER_CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF60("SERVICE_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68("BILLING_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF86("DEVELOPER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF95("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF104("ITEM_ALREADY_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF113("ITEM_NOT_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF126("EXPIRED_OFFER_TOKEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF139("NETWORK_ERROR");


    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0648 f3018;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3020;

    static {
        ᐧʻ r1 = new ᐧʻ((byte) 0, 0);
        r1.ˎˑ = new Object[8];
        r1.ˆʿ = 0;
        for (EnumC0639 enumC0639 : values()) {
            Integer numValueOf = Integer.valueOf(enumC0639.f3020);
            int i = r1.ˆʿ + 1;
            Object[] objArr = (Object[]) r1.ˎˑ;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = iHighestOneBit + iHighestOneBit;
                }
                r1.ˎˑ = Arrays.copyOf(objArr, i3 < 0 ? Integer.MAX_VALUE : i3);
            }
            Object[] objArr2 = (Object[]) r1.ˎˑ;
            int i4 = r1.ˆʿ;
            int i5 = i4 + i4;
            objArr2[i5] = numValueOf;
            objArr2[i5 + 1] = enumC0639;
            r1.ˆʿ = i4 + 1;
        }
        C0640 c0640 = (C0640) r1.ᐧˋ;
        if (c0640 != null) {
            throw c0640.m2655();
        }
        C0648 c0648M2662 = C0648.m2662(r1.ˆʿ, (Object[]) r1.ˎˑ, r1);
        C0640 c06402 = (C0640) r1.ᐧˋ;
        if (c06402 != null) {
            throw c06402.m2655();
        }
        f3018 = c0648M2662;
    }

    EnumC0639(String str) {
        this.f3020 = i;
    }
}
