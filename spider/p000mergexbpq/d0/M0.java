package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.h.C0054;

/* loaded from: classes.dex */
enum M0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f218short = {2076, 2107, 2104, 2097, 2092, 2107, 2074, 2097, 2109, 2090, 2087, 2094, 2107, 2064, 2111, 2099, 2107};

    M0() {
        super(C0054.m8574(f218short, 0, 17, 2142), 51, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        N0 n0 = h1.c0;
        if (c0067a.C()) {
            q.f();
            q.u(n0);
            return;
        }
        char cE = c0067a.e();
        if (cE == 0) {
            q.q(this);
            q.f();
            q.m.b.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE == 65535) {
                q.p(this);
                q.f();
                q.m.f = true;
                q.n();
                q.u(h1.c);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            q.f();
            q.m.b.append(cE);
        }
        q.u(n0);
    }
}