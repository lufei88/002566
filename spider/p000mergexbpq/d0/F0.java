package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.P0.C0024;

/* loaded from: classes.dex */
enum F0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f207short = {1051, 1079, 1077, 1077, 1085, 1078, 1068, 1035, 1068, 1081, 1066, 1068, 1052, 1081, 1067, 1072};

    F0() {
        super(C0024.m4740(f207short, 0, 16, 1112), 45, null);
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
                q.n.i(cE);
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