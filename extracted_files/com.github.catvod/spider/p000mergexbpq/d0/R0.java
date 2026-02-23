package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
enum R0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f226short = {577, 618, 614, 625, 636, 629, 608, 597, 624, 615, 617, 620, 614, 588, 609, 608, 619, 625, 620, 611, 620, 608, 631, 602, 609, 618, 624, 615, 617, 608, 596, 624, 618, 625, 608, 609};

    R0() {
        super(C0006.m1774(f226short, 0, 36, 517), 56, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        StringBuilder sb;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '\"') {
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