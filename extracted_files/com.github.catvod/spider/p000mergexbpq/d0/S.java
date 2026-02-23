package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.b.C0044;

/* loaded from: classes.dex */
enum S extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f227short = {1021, 968, 974, 999, 968, 964, 972};

    S() {
        super(C0044.m7509(f227short, 0, 7, 937), 9, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        q.i.o(c0067a.m());
        char cE = c0067a.e();
        if (cE == 0) {
            q.i.o(h1.t0);
            return;
        }
        if (cE == ' ') {
            h1Var = h1.J;
        } else {
            if (cE != '/') {
                if (cE != '<') {
                    if (cE != '>') {
                        if (cE != 65535) {
                            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                                q.i.n(cE);
                                return;
                            }
                            h1Var = h1.J;
                        } else {
                            q.p(this);
                        }
                    }
                    q.u(c0072c0);
                    return;
                }
                c0067a.G();
                q.q(this);
                q.o();
                q.u(c0072c0);
                return;
            }
            h1Var = h1.R;
        }
        q.u(h1Var);
    }
}