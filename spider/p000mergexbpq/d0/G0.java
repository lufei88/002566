package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.x0.C0063;

/* loaded from: classes.dex */
enum G0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f209short = {1459, 1439, 1437, 1437, 1429, 1438, 1412};

    G0() {
        super(C0063.m9585(f209short, 0, 7, 1520), 46, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            c0067a.a();
            q.n.i((char) 65533);
        } else if (cS == '-') {
            q.a(h1.X);
        } else {
            if (cS != 65535) {
                q.n.j(c0067a.p('-', 0));
                return;
            }
            q.p(this);
            q.m();
            q.u(h1.c);
        }
    }
}