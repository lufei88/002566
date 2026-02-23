package com.github.catvod.spider.merge.a;

import android.app.Notification;
import android.os.IInterface;
import com.github.catvod.spider.merge.a0.C0042;

/* loaded from: classes.dex */
public interface c extends IInterface {

    /* renamed from: short, reason: not valid java name */
    public static final short[] f703short = {2226, 2237, 2231, 2209, 2236, 2234, 2231, 2295, 2208, 2214, 2211, 2211, 2236, 2209, 2215, 2295, 2213, 2279, 2295, 2226, 2211, 2211, 2295, 2202, 2205, 2236, 2215, 2234, 2229, 2234, 2224, 2226, 2215, 2234, 2236, 2237, 2176, 2234, 2231, 2230, 2192, 2235, 2226, 2237, 2237, 2230, 2239};
    public static final String a = C0042.m7151(f703short, 0, 47, 2259).replace('$', '.');

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}