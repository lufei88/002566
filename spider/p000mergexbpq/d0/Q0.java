package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.a1.C0043;

/* loaded from: classes.dex */
enum Q0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f225short = {2279, 2240, 2243, 2250, 2263, 2240, 2273, 2250, 2246, 2257, 2268, 2261, 2240, 2293, 2256, 2247, 2249, 2252, 2246, 2284, 2241, 2240, 2251, 2257, 2252, 2243, 2252, 2240, 2263};

    Q0() {
        super(C0043.m7290(f225short, 0, 29, 2213), 55, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            h1Var = h1.g0;
        } else {
            if (cE != '\'') {
                if (cE == '>') {
                    q.q(this);
                } else if (cE != 65535) {
                    q.q(this);
                    q.m.f = true;
                    h1Var = h1.p0;
                } else {
                    q.p(this);
                }
                q.m.f = true;
                q.n();
                q.u(c0072c0);
                return;
            }
            h1Var = h1.h0;
        }
        q.u(h1Var);
    }
}