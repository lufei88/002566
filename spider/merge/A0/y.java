package com.github.catvod.spider.merge.a0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f733short = {1829, 1854, 1850, 1844, 1855, 2214, 2234, 2234, 2238, 2237, 2292, 2273, 2273, 2237, 2235, 2272, 2239, 2235, 2223, 2236, 2213, 2272, 2221, 2208, 2273, 2298, 2193, 2219, 2179, 2182, 2188, 2180, 2289, 2235, 2221, 2193, 2238, 2223, 2236, 2223, 2211, 2193, 2237, 2234, 2236, 2291, 2280, 2234, 2209, 2213, 2219, 2208, 2291, 2614, 2675, 2684, 2681, 2677, 2686, 2660, 2639, 2681, 2676, 2605, 2597, 2595, 2594, 2614, 2661, 2675, 2639, 2674, 2681, 2666, 2639, 2659, 2660, 2658, 2605, 2627, 2613, 2595, 2641, 2675, 2661, 2659, 2660, 2687, 2685, 2613, 2599, 2643, 2655, 2624, 2628, 2613, 2595, 2641, 2627, 2641, 2626, 2645, 2641, 2613, 2596, 2592, 2592, 2613, 2599, 2643, 2655, 2624, 2628, 2613, 2595, 2641, 2649, 2653, 2653, 2645, 2626, 2627, 2649, 2630, 2645, 2613, 2596, 2592, 2593, 2613, 2599, 2643, 2655, 2624, 2628, 2613, 2595, 2641, 2642, 2641, 2643, 2651, 2639, 2642, 2628, 2654, 2639, 2627, 2628, 2633, 2652, 2645, 2613, 2596, 2592, 2592, 2556, 2556, 2515, 2518, 2512};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0233B b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(C0233B c0233b, String str, int i) {
        this.a = i;
        this.b = c0233b;
        this.c = str;
    }

    /* renamed from: ۢۧۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7102() {
        if (C0001.m1164() < 0) {
            return f733short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0241b runnableC0241b;
        String strM6839 = C0041.m6839(this);
        C0233B c0233bM5289 = C0029.m5289(this);
        int i = 4;
        int iM5593 = C0031.m5593(this);
        C0047.m7777(c0233bM5289);
        switch (iM5593) {
            case 0:
                try {
                    if (C0040.m6623(new CharSequence[]{strM6839}) && C0058.m9127(strM6839, C0013.m3106(m7102(), 156, 5, 2467))) {
                        c0233bM5289.a = strM6839;
                        C0001.m1188(c0233bM5289);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                String strM5062 = C0027.m5062(m7102(), 0, 5, 1873);
                String strM5188 = C0028.m5188(new StringBuilder(C0015.m3484(m7102(), 5, 48, 2254)), strM6839, C0036.m6188(m7102(), 53, 103, 2576));
                try {
                    try {
                        C0023.m4586(c0233bM5289, strM5188);
                        runnableC0241b = new RunnableC0241b(c0233bM5289, C0020.m4251(strM5062, strM6839), i);
                    } catch (Exception unused2) {
                        C0023.m4586(c0233bM5289, strM5188);
                        runnableC0241b = new RunnableC0241b(c0233bM5289, C0020.m4251(strM5062, strM6839), i);
                    }
                    C0025.m4829(runnableC0241b);
                    return;
                } catch (Throwable th) {
                    C0025.m4829(new RunnableC0241b(c0233bM5289, C0020.m4251(strM5062, strM6839), i));
                    throw th;
                }
        }
    }
}