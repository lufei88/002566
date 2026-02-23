package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
enum W0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f236short = {904, 943, 957, 940, 955, 909, 934, 938, 957, 944, 953, 940, 922, 944, 954, 957, 940, 932, 898, 940, 944, 958, 934, 955, 941};

    W0() {
        super(C0012.m2973(f236short, 0, 25, 969), 60, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            h1Var = h1.l0;
        } else if (cE == '\"') {
            q.q(this);
            h1Var = h1.m0;
        } else {
            if (cE != '\'') {
                if (cE == '>') {
                    q.q(this);
                } else {
                    if (cE != 65535) {
                        q.q(this);
                        q.m.f = true;
                        q.n();
                        return;
                    }
                    q.p(this);
                }
                q.m.f = true;
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