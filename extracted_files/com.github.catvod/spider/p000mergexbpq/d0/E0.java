package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.o0.C0056;

/* loaded from: classes.dex */
enum E0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f205short = {2324, 2360, 2362, 2362, 2354, 2361, 2339, 2308, 2339, 2358, 2341, 2339};

    E0() {
        super(C0056.m8911(f205short, 0, 12, 2391), 44, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.u(h1.V);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                c0067a.G();
            } else {
                q.p(this);
            }
            q.m();
            q.u(c0072c0);
            return;
        }
        q.q(this);
        q.n.i((char) 65533);
        q.u(g0);
    }
}