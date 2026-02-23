package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.a1.C0043;

/* loaded from: classes.dex */
enum V0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f234short = {2860, 2827, 2842, 2841, 2827, 2827, 2816, 2858, 2817, 2829, 2842, 2839, 2846, 2827, 2878, 2843, 2828, 2818, 2823, 2829, 2863, 2816, 2826, 2877, 2839, 2845, 2842, 2827, 2819, 2855, 2826, 2827, 2816, 2842, 2823, 2824, 2823, 2827, 2844, 2845};

    V0() {
        super(C0043.m7290(f234short, 0, 40, 2926), 59, null);
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
            q.q(this);
            h1Var = h1.m0;
        } else {
            if (cE != '\'') {
                if (cE != '>') {
                    if (cE != 65535) {
                        q.q(this);
                        q.m.f = true;
                        h1Var = h1.p0;
                    } else {
                        q.p(this);
                        q.m.f = true;
                    }
                }
                q.n();
                q.u(c0072c0);
                return;
            }
            q.q(this);
            h1Var = h1.n0;
        }
        q.u(h1Var);
    }
}