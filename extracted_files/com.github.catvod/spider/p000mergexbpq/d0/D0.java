package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* loaded from: classes.dex */
enum D0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f204short = {2291, 2271, 2252, 2261, 2251, 2254, 2298, 2267, 2269, 2258, 2271, 2252, 2271, 2250, 2263, 2257, 2256, 2289, 2254, 2267, 2256, 1278, 1278, 647, 652, 640, 663, 666, 659, 646, 654, 662, 657, 660, 641, 660, 654};

    D0() {
        super(C0057.m8978(f204short, 0, 21, 2238), 43, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        if (c0067a.w(C0003.m1398(f204short, 21, 2, 1235))) {
            q.n.g();
            h1Var = h1.U;
        } else if (c0067a.x(C0022.m4403(f204short, 23, 7, 707))) {
            h1Var = h1.a0;
        } else {
            if (!c0067a.w(C0036.m6188(f204short, 30, 7, 725))) {
                q.q(this);
                q.e();
                q.a(h1.S);
                return;
            }
            q.h();
            h1Var = h1.q0;
        }
        q.u(h1Var);
    }
}