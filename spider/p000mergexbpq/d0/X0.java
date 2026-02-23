package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.S0.C0028;

/* loaded from: classes.dex */
enum X0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f238short = {2301, 2266, 2265, 2256, 2253, 2266, 2299, 2256, 2268, 2251, 2246, 2255, 2266, 2284, 2246, 2252, 2251, 2266, 2258, 2294, 2267, 2266, 2257, 2251, 2262, 2265, 2262, 2266, 2253};

    X0() {
        super(C0028.m5109(f238short, 0, 29, 2239), 61, null);
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
            h1Var = h1.m0;
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
            h1Var = h1.n0;
        }
        q.u(h1Var);
    }
}