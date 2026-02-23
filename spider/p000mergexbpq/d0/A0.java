package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.h.C0054;

/* loaded from: classes.dex */
enum A0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f200short = {1497, 1534, 1516, 1533, 1514, 1497, 1516, 1516, 1514, 1521, 1530, 1517, 1516, 1533, 1486, 1529, 1524, 1517, 1533, 1479, 1513, 1517, 1527, 1516, 1533, 1532};

    A0() {
        super(C0054.m8574(f200short, 0, 26, 1432), 40, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        C0103s0 c0103s0 = h1.J;
        char cE = c0067a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE == '/') {
                q.u(h1.R);
                return;
            }
            if (cE == '>') {
                q.o();
            } else if (cE != 65535) {
                c0067a.G();
                q.q(this);
            } else {
                q.p(this);
            }
            q.u(c0072c0);
            return;
        }
        q.u(c0103s0);
    }
}