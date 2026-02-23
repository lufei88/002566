package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z0.C0041;

/* loaded from: classes.dex */
enum S0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f228short = {566, 541, 529, 518, 523, 514, 535, 546, 519, 528, 542, 539, 529, 571, 534, 535, 540, 518, 539, 532, 539, 535, 512, 557, 513, 539, 540, 533, 542, 535, 547, 519, 541, 518, 535, 534};

    S0() {
        super(C0041.m6779(f228short, 0, 36, 626), 57, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        StringBuilder sb;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '\'') {
                q.u(h1.i0);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                sb = q.m.d;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0072c0);
            return;
        }
        q.q(this);
        sb = q.m.d;
        cE = 65533;
        sb.append(cE);
    }
}