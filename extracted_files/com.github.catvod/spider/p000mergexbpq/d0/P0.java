package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.S0.C0029;

/* loaded from: classes.dex */
enum P0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f223short = {1621, 1650, 1632, 1649, 1638, 1616, 1659, 1655, 1632, 1645, 1636, 1649, 1604, 1633, 1654, 1656, 1661, 1655, 1631, 1649, 1645, 1635, 1659, 1638, 1648};

    P0() {
        super(C0029.m5256(f223short, 0, 25, 1556), 54, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            h1Var = h1.f0;
        } else if (cE == '\"') {
            q.q(this);
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
            q.q(this);
            h1Var = h1.h0;
        }
        q.u(h1Var);
    }
}