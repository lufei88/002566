package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* loaded from: classes.dex */
enum N0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f220short = {1599, 1556, 1560, 1551, 1538, 1547, 1566, 1589, 1562, 1558, 1566};

    N0() {
        super(C0010.m2300(f220short, 0, 11, 1659), 52, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        StringBuilder sb;
        C0072c0 c0072c0 = h1.c;
        if (c0067a.C()) {
            q.m.b.append(c0067a.j());
            return;
        }
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE != ' ') {
                if (cE != '>') {
                    if (cE == 65535) {
                        q.p(this);
                        q.m.f = true;
                    } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                        sb = q.m.b;
                    }
                }
                q.n();
                q.u(c0072c0);
                return;
            }
            q.u(h1.d0);
            return;
        }
        q.q(this);
        sb = q.m.b;
        cE = 65533;
        sb.append(cE);
    }
}