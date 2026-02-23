package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0092m0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f277short = {2627, 2675, 2658, 2681, 2656, 2660, 2644, 2673, 2660, 2673, 2644, 2687, 2661, 2674, 2684, 2677, 2645, 2659, 2675, 2673, 2656, 2677, 2676};

    C0092m0() {
        super(C0010.m2300(f277short, 0, 23, 2576), 28, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            c0067a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '-') {
            q.i(cS);
            h1Var = h1.F;
        } else {
            if (cS != '<') {
                if (cS != 65535) {
                    q.k(c0067a.p('-', '<', 0));
                    return;
                } else {
                    q.p(this);
                    q.u(h1.c);
                    return;
                }
            }
            q.i(cS);
            h1Var = h1.H;
        }
        q.a(h1Var);
    }
}