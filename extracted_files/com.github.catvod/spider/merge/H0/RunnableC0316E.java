package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0316E implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f804short = {2521, 2501, 2501, 2497, 2498, 2443, 2462, 2462, 2518, 2520, 2501, 2516, 2516, 2463, 2514, 2526, 2524, 2462, 2507, 2523, 2436, 2435, 2432, 2523, 2523, 2462, 2525, 2520, 2501, 2501, 2525, 2516, 2460, 2501, 2520, 2518, 2516, 2499, 2460, 2498, 2497, 2526, 2501, 2462, 2499, 2512, 2502, 2462, 2524, 2512, 2498, 2501, 2516, 2499, 2462, 2523, 2512, 2499, 2462, 2502, 2520, 2527, 2463, 2501, 2505, 2501};
    public final /* synthetic */ int a;
    public final /* synthetic */ com.github.catvod.spider.merge.a0.S b;

    public /* synthetic */ RunnableC0316E(com.github.catvod.spider.merge.a0.S s, int i) {
        this.a = i;
        this.b = s;
    }

    /* renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8656() {
        if (C0025.m4797() >= 0) {
            return f804short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0035.m6165(this)) {
            case 0:
                com.github.catvod.spider.merge.a0.S sM3416 = C0015.m3416(this);
                C0047.m7777(sM3416);
                C0016.m3575(new RunnableC0241b(sM3416, C0032.m5769(C0036.m6188(m8656(), 0, 66, 2481), null), 13));
                break;
            case 1:
                C0051.m8252(C0015.m3416(this));
                break;
            default:
                C0015.m3438(C0015.m3416(this));
                break;
        }
    }
}