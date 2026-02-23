package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Q0.C0026;

/* loaded from: classes.dex */
public enum O0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f545short = {2607, 2568, 2586, 2571, 2588, 2602, 2561, 2573, 2586, 2583, 2590, 2571, 2622, 2587, 2572, 2562, 2567, 2573, 2597, 2571, 2583, 2585, 2561, 2588, 2570};

    public O0() {
        super(C0026.m4951(f545short, 0, 25, 2670), 54);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            g1Var = g1.d0;
        } else if (cE == '\"') {
            p.m(this);
            g1Var = g1.e0;
        } else {
            if (cE != '\'') {
                C0177b0 c0177b0 = g1.a;
                if (cE == '>') {
                    p.m(this);
                } else if (cE != 65535) {
                    p.m(this);
                    p.m.f = true;
                    g1Var = g1.n0;
                } else {
                    p.l(this);
                }
                p.m.f = true;
                p.j();
                p.o(c0177b0);
                return;
            }
            p.m(this);
            g1Var = g1.f0;
        }
        p.o(g1Var);
    }
}