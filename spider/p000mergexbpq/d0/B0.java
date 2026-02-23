package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0038;

/* loaded from: classes.dex */
enum B0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f202short = {2078, 2088, 2081, 2091, 2062, 2081, 2082, 2110, 2084, 2083, 2090, 2078, 2105, 2092, 2111, 2105, 2073, 2092, 2090};

    B0() {
        super(C0038.m6452(f202short, 0, 19, 2125), 41, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '>') {
            q.i.i = true;
            q.o();
        } else {
            if (cE != 65535) {
                c0067a.G();
                q.q(this);
                q.u(h1.J);
                return;
            }
            q.p(this);
        }
        q.u(c0072c0);
    }
}