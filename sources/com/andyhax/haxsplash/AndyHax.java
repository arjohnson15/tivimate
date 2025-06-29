package com.andyhax.haxsplash;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AndyHax {
    public static ArrayList<PortalModel> _portals = new ArrayList<>();
    public static int current_id;

    public static native String Get(String str);

    public static native PortalModel GetById(int i);

    public static native void Go(String str, Context context);
}
