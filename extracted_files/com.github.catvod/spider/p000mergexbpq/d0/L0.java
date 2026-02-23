package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;

/* loaded from: classes.dex */
enum L0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f216short = {2351, 2308, 2312, 2335, 2322, 2331, 2318};

    L0() {
        super(C0018.m3917(f216short, 0, 7, 2411), 50, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        M0 m0 = h1.b0;
        char cE = c0067a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE != '>') {
                if (cE != 65535) {
                    q.q(this);
                } else {
                    q.p(this);
                }
            }
            q.q(this);
            q.f();
            q.m.f = true;
            q.n();
            q.u(h1.c);
            return;
        }
        q.u(m0);
    }
}