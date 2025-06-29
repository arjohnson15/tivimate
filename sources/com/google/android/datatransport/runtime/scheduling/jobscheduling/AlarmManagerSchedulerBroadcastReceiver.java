package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p081.AbstractC1705;
import p123.C1995;
import p123.C1998;
import p266.C3262;
import p272.RunnableC3324;
import p444.C5152;
import p444.RunnableC5147;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f2406 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C1998.m5647(context);
        C3262 c3262M5645 = C1995.m5645();
        c3262M5645.m8036(queryParameter);
        c3262M5645.f12725 = AbstractC1705.m5420(iIntValue);
        if (queryParameter2 != null) {
            c3262M5645.f12724 = Base64.decode(queryParameter2, 0);
        }
        C5152 c5152 = C1998.m5648().f7601;
        C1995 c1995M8038 = c3262M5645.m8038();
        RunnableC3324 runnableC3324 = new RunnableC3324(1);
        c5152.getClass();
        c5152.f19690.execute(new RunnableC5147(c5152, c1995M8038, i, runnableC3324));
    }
}
